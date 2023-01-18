#!/bin/bash

# Clear all files before build

echo "Builds: clearing..."
rm -rf ./.out/*
echo "Builds: done"

# Build HDS-API-GATEWAY-SERVICE Project
echo "=> HDS-API-GATEWAY-SERVICE => BUILDING"
mvn clean package -f ./hds-api-gateway-service/hds-parent/pom.xml
cp -r ./hds-api-gateway-service/.out/* ./.out
echo "HDS-API-GATEWAY-SERVICE => DONE"

# Build HDS-CONFIG-SERVICE Project
echo "=> HDS-CONFIG-SERVICE => BUILDING"
mvn clean package -f ./hds-config-service/pom.xml
cp -r ./hds-config-service/.out/* ./.out
echo "=> HDS-CONFIG-SERVICE => DONE"

# Build HDS-EXAMPLE-SERVICE Project
echo "=> HDS-EXAMPLE-SERVICE => BUILDING"
mvn clean package -f ./hds-example-service/hds-parent/pom.xml
cp -r ./hds-example-service/.out/* ./.out
echo "=> HDS-EXAMPLE-SERVICE => DONE"

# Build HDS-SERVICE-REGISTRY Project
echo "=> HDS-SERVICE-REGISTRY => BUILDING"
mvn clean package -f ./hds-service-registry/pom.xml
cp -r ./hds-service-registry/.out/* ./.out
echo "=> HDS-SERVICE-REGISTRY => DONE"

# Build HDS-TEST-CONFIG-SERVICE Project
echo "=> HDS-TEST-CONFIG-SERVICE => BUILDING"
mvn clean package -f ./hds-test-config-service/hds-parent/pom.xml
cp -r ./hds-test-config-service/.out/* ./.out
echo "=> HDS-TEST-CONFIG-SERVICE => DONE"
