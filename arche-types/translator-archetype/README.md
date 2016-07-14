TEIID Translator Arche Type
================

This maven project is use to create the TEIID Translator archetype, which then can be used to generate a new translator project.


-----------
Generate Project
-----------

After the arche type is installed, then to generate a translator project, do the following:

-  'cd' into the teiid/connectors directory (assuming you have checked out teiid from github) or to the
	location you want the connector project created
-  use the following template to generate the project:

***********
* TEMPLATE
***********

mvn archetype:generate       -DarchethypeRepository=https://repository.jboss.org/nexus/content/repositories/releases/                                \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=translator-archetype          \
  -DarchetypeVersion=9.0.0               \
  -DgroupId=${groupId}   				\
  -DartifactId=translator-${translator-type}	\
  -Dpackage=org.teiid.translator.${translator-type}    \
  -Dversion=${version}    \
  -Dtranslator-type=${translator-type}   \
  -Dtranslator-name=${translator-name}
  -Dteiid-version=${teiid-version}
  

********
* where:
********

  -DarchetypeGroupId    -  is the group ID for the arche type to use to generate
  -DarchetypeArtifactId -  is the artifact ID for the arche type to use to generate
  -DarchetypeVersion	-  is the version for the arche type to use to generate
  -DgroupId		-  (user defined) group ID for the new translator project pom.xml
  -DartifactId		-  (user defined) artifact ID for the new translator project pom.xml
  -Dpackage		-  (user defined) the package structure where the java and resource files will be created
  -Dversion		-  (user defined) the version that the new connector project pom.xml will be
  -Dtranslator-type	-  (user defined) the translator type that's used by Teiid when mapping the physical source to the translator to use 
  -Dtranslator-name	-  (user defined) the translator name thats used for name the java class names
  -Dteiid-version   -  [optional] the Teiid version the connector will depend upon, if not specified will default 

*********
* EXAMPLE
*********

-  this is an example of the template that can be run:

mvn archetype:generate   -DarchethypeRepository=https://repository.jboss.org/nexus/content/repositories/releases/                                \
  -DarchetypeGroupId=org.jboss.teiid.arche-types   \
  -DarchetypeArtifactId=translator-archetype  \
  -DarchetypeVersion=9.0.0  \
  -DgroupId=org.jboss.teiid.connectors  \
  -DartifactId=translator-myType  \
  -Dpackage=org.teiid.translator.myType    \
  -Dversion=0.0.1-SNAPSHOT	\
  -Dtranslator-type=mytype  \
  -Dtranslator-name=MyType  \
  -Dteiid-version=9.0.0.Final


When executed, you will be asked to confirm the package property

Confirm properties configuration:
groupId: org.jboss.teiid.connector
artifactId: translator-mtype
version: 0.0.1-SNAPSHOT
package: org.teiid.translator.mytype
teiid-version: 9.0.0.Final
translator-name: MyType
translator-type: mytype
 Y: : y


type Y (yes) and press enter, and the creation of the translator project will be done

