#! /usr/bin/env sh
UPDATE_SITE_DIR=packaging/org.obeonetwork.dsl.organizationchart.update/target/
TP=releng/org.obeonetwork.dsl.organizationchart.target/*.tpd
BUNDLE_DIR=packaging/org.obeonetwork.dsl.organizationchart.product/target/products/*.zip
DEPLOY_LOCAL_DIR=$1
echo "Prepare deploy local dir = ${DEPLOY_LOCAL_DIR}"
# Create nightly folder
mkdir $DEPLOY_LOCAL_DIR 
# Copy update-site and target platform to deploy local dir
cp -r $UPDATE_SITE_DIR/repository $DEPLOY_LOCAL_DIR
cp -r $UPDATE_SITE_DIR/*.zip $DEPLOY_LOCAL_DIR
cp -r $TP $DEPLOY_LOCAL_DIR
echo "ls ${DEPLOY_LOCAL_DIR}"
ls $DEPLOY_LOCAL_DIR
# Create bundles folder
mkdir $DEPLOY_LOCAL_DIR/bundles
# Copy bundles
cp -r $BUNDLE_DIR $DEPLOY_LOCAL_DIR/bundles
echo "ls ${DEPLOY_LOCAL_DIR}/bundles"
ls $DEPLOY_LOCAL_DIR/bundles
