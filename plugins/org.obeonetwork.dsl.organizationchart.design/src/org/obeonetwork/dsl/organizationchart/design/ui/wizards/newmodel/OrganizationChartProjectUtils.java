package org.obeonetwork.dsl.organizationchart.design.ui.wizards.newmodel;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.obeonetwork.dsl.organizationchart.Organization;
import org.obeonetwork.dsl.organizationchart.OrganizationChartFactory;
import org.obeonetwork.dsl.organizationchart.design.OrganizationChartDesignerPlugin;
import org.eclipse.sirius.common.tools.api.util.Option;
import org.eclipse.sirius.common.tools.api.util.Options;

import com.google.common.collect.Maps;

public class OrganizationChartProjectUtils {
	/**
	 * Dot constant.
	 */
	public static final String DOT = ".";

	/**
	 * The OrganizationChart file extension.
	 */
	public static final String MODEL_FILE_EXTENSION = "orgchart"; //$NON-NLS-1$

	/**
	 * OrganizationChart  viewpoint name defined in odesign.
	 */
	public static final String ORGANIZATONCHART_VP = "OrganizationChart";

	/**
	 * OrganizationChart incubation viewpoint name defined in odesign.
	 */
	public static final String ORGANIZATIONCHART_INCUBATION_VP = "INCUBATION";

	/**
	 * The type name of an organizationchart root element.
	 */
	public static final String ROOT_OBJECT = "Organization"; //$NON-NLS-1$


	/**
	 * Creates the semantic root element from the given operation arguments.
	 * 
	 * @return the semantic root {@link EObject}
	 */
	private static EObject createInitialModel(String rootObjectName) {
		Organization root = null;
		if (ROOT_OBJECT.equals(rootObjectName)) {
			root = OrganizationChartFactory.eINSTANCE.createOrganization();
			root.setName(Messages.OrganizationChartModelWizard_DefaultModelName);
		}
		return root;
	}

	public static void enableOrganizationChartViewpoints(final Session session) {
		final String[] viewpointsToActivate = {ORGANIZATONCHART_VP};
		enableViewpoints(session, viewpointsToActivate);
	}

	public static void enableViewpoints(final Session session, final String... viewpointsToActivate) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							ViewpointSelectionCallback callback = new ViewpointSelectionCallback();

							for (Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()) {
								for (String viewpoint : viewpointsToActivate) {
									if (viewpoint.equals(vp.getName()))
										callback.selectViewpoint(vp, session, new NullProgressMonitor());
								}
							}
						}
					});
		}
	}

	/**
	 * Create a new OrganizationChart model in a project.
	 * 
	 * @param project
	 *            Modeling project
	 * @param rootObjectName
	 *            Name of the root object
	 * @param newOrganizationChartFileName
	 *            Name of the OrganizationChart file
	 * @return Newly created OrganizationChart file
	 */
	public static Option<IFile> createSemanticResource(final IProject project, final String rootObjectName,
			String newOrganizationChartFileName) {
		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		final Session session = modelingProject.get().getSession();
		final String platformPath = getNewOrganizationChartModelFilePath(project, newOrganizationChartFileName);
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {

						final URI semanticModelURI = URI.createPlatformResourceURI(platformPath, true);
						Resource res = new ResourceSetImpl().createResource(semanticModelURI);
						/* Add the initial model object to the contents. */
						final EObject rootObject = OrganizationChartProjectUtils.createInitialModel(rootObjectName);

						if (rootObject != null) {
							res.getContents().add(rootObject);
						}
						try {
							res.save(Maps.newHashMap());
						} catch (IOException e) {
							OrganizationChartDesignerPlugin.log(IStatus.ERROR,
									Messages.OrganizationChartModelWizard_UI_Error_CreatingOrganizationChartModel, e);
						}

						session.addSemanticResource(semanticModelURI, new NullProgressMonitor());

						session.save(new NullProgressMonitor());
					}
				});
		return Options.newSome(ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformPath)));
	}

	/**
	 * Get the new OrganizationChart model file path.
	 * 
	 * @param project
	 *            Project
	 * @param organizationChartFileName
	 *            File name
	 * @return OrganizationChart model file path
	 */
	private static String getNewOrganizationChartModelFilePath(IProject project, String organizationChartFileName) {
		return '/' + project.getName() + '/' + organizationChartFileName.toLowerCase();
	}
}
