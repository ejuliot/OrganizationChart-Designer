package org.obeonetwork.dsl.organizationchart.docgen;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleURITransformer {

	public static void main(String[] args) {
		try {
		
			Path path = Paths.get("representations.aird");
			Charset charset = StandardCharsets.UTF_8;
	
			String content = new String(Files.readAllBytes(path), charset);
			content = content.replaceAll(
					"platform:/resource/org.obeonetwork.dsl.organizationchart.design/description/OrganizationChart.odesign", 
					"platform:/plugin/org.obeonetwork.dsl.organizationchart.design/description/OrganizationChart.odesign");
			

			//content = content.replaceAll(
			//		"platform:/plugin/org.obeonetwork.dsl.organizationchart.design/description/OrganizationChart.odesign",
			//		"platform:/resource/org.obeonetwork.dsl.organizationchart.design/description/OrganizationChart.odesign");
			
			Files.write(path, content.getBytes(charset));
			
			System.out.println("Conversion done");
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
