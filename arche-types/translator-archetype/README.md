TEIID Translator Arche Type
================

This maven project is use to create the TEIID Translator archetype, which then can be used to generate a new translator project.

When the translator project is generated, you will end up with the following structure:

-  translator-${translator-name}
	| -	pom.xml
	| -	src
		|-	main
			|-	java
				|-	${package}
					|-	${translator-name}Execution.java
					|-	${translator-name}ExecutionFactory.java
					|-	${translator-name}Plugin.java
			|-	resources
				|-	${package}
						|-	i18n.properties
				|-	META-INF
					|-	services
						|-	org.teiid.translator.ExecutionFactory


-------
Install Arche Type
-------

To package and install the arche type, run:

mvn clean install 


-----------
Generate Project
-----------

After the arche type is installed, then to generate a translator project, do the following:

-  'cd' into the teiid/connectors directory (assuming you have checked out teiid from github) or to the
	location you want the connector project created
-  run the following:

mvn archetype:generate                                 \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=translator-archetype          \
  -DarchetypeVersion=8.6.0               \
  -DgroupId=${groupId}   				\
  -DartifactId=translator-${translator-name}	\
  -Dpackage=org.teiid.translator.${translator-name}    \
  -Dversion=8.7.0.Alpha2-SNAPSHOT    \
  -Dtranslator-name=${translator-name}   

where:

  -DarchetypeGroupId    -  is the group ID for the arche type to use to generate
  -DarchetypeArtifactId -  is the artifact ID for the arche type to use to generate
  -DarchetypeVersion	-  is the version for the arche type to use to generate
  -DgroupId		-  (user defined) group ID for the new connector project pom.xml
  -DartifactId		-  (user defined) artifact ID for the new connector project pom.xml
  -Dpackage		-  (user defined) the package structure where the java and resource files will be created
  -Dversion		-  (user defined) the version for the new connector project pom.xml
  -Dtranslator-name	-  (user defined) the name (type) of the new translator project, used to create the java class names


mvn archetype:generate                                  \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=translator-archetype          \
  -DarchetypeVersion=8.6.0   	\
  -DgroupId=org.jboss.teiid.connector  	\
  -DartifactId=translator-myType	\
  -Dpackage=org.teiid.translator.myType    \
  -Dversion=8.7.0.Alpha2-SNAPSHOT	\
  -Dtranslator-name=MyType  



When executed, you will be asked to confirm the package property

Confirm properties configuration:
groupId: org.jboss.teiid.connector
artifactId: translator-myType
version: 8.7.0.Alpha2-SNAPSHOT
package: org.teiid.translator.myType
translator-name: MyType
 Y: : 

type Y (yes) and press enter, and the creation of the translator project will be done

