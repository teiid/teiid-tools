TEIID Connector Arche Type
================

This maven project is use to create the TEIID Connector archetype, which then can be used to generate a new connector project.

When the connector project is generated, you will end up with the following structure:

-  connector-${connector-name}
	| -	pom.xml
	| -	src
		|-	main
			|-	java
				|-	${package}
					|-	${connector-name}ConnectionImpl.java
					|-	${connector-name}ManagedConnectionFactory.java
					|-	${connector-name}Plugin.java
			|-	rar
				|-	META-INF
					|-	ra.xml
			|-	resources
				|-	${package}
						|-	i18n.properties


-------
Install Arche Type
-------

To package and install the arche type, run:

mvn clean install 


-----------
Generate Project
-----------

After the arche type is installed, then to generate a connector project, do the following:

-  'cd' into the teiid/connectors directory (assuming you have checked out teiid from github) or to the
	location you want the connector project created
-  run the following:

mvn archetype:generate                                  \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=connector-archetype          \
  -DarchetypeVersion=8.7.0               \
  -DgroupId=${groupId}   				\
  -DartifactId=connector-${connector-name}	\
  -Dpackage=org.teiid.resource.adapter.${connector-name}    \
  -Dversion=8.7.0.Alpha2-SNAPSHOT    \
  -Dconnector-name=${connector-name}   \
  -Dvendor-name=${vendor-name}


where:

  -DarchetypeGroupId    -  is the group ID for the arche type to use to generate
  -DarchetypeArtifactId -  is the artifact ID for the arche type to use to generate
  -DarchetypeVersion	-  is the version for the arche type to use to generate
  -DgroupId		-  (user defined) group ID for the new connector project pom.xml
  -DartifactId		-  (user defined) artifact ID for the new connector project pom.xml
  -Dpackage		-  (user defined) the package structure where the java and resource files will be created
  -Dversion		-  (user defined) the Teiid version that the new connector project pom.xml will depend on
  -Dconnector-name	-  (user defined) the name (type) of the new connector project, used to create the java class names and rar
  -Dvendor-name		-  name of the Vendor for the data source, updates the rar


Example:

mvn archetype:generate     -                             \
  -DarchetypeGroupId=org.jboss.teiid.arche-types              \
  -DarchetypeArtifactId=connector-archetype          \
  -DarchetypeVersion=8.7.0   	\
  -DgroupId=org.jboss.teiid.connectors   	\
  -Dpackage=org.teiid.resource.adapter.myType    \
  -DartifactId=connector-myType	\
  -Dversion=8.7.0.Alpha2-SNAPSHOT    \
  -Dconnector-name=myType   \
  -Dvendor-name=MyVendor



When executed, you will be asked to confirm the package property

Confirm properties configuration:
groupId: org.jboss.teiid.connectors
artifactId: connector-myType
version: 8.7.0.Alpha2-SNAPSHOT
package: org.teiid.resource.adapter.myType
connector-name: myType
vendor-name: MyVendor
 Y: : 


type Y (yes) and press enter, and the creation of the translator project will be done

