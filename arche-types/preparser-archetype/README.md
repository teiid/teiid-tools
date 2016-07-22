TEIID PreParse Arche Type
================

This maven project is use to create the TEIID PrePaser archetype, which then can be used to generate a new java project for developing a Preparser.


-----------
Generate Project
-----------

After the arche type is installed (or use the nexus repostiory), then to generate a project, do the following:

-  use the following template to generate the project:

***********
* TEMPLATE
***********
  
mvn archetype:generate       -DarchethypeRepository=https://repository.jboss.org/nexus/content/repositories/releases/                                \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=udf-archetype          \
  -DarchetypeVersion=9.0.0     \
  -DgroupId=${groupId}   				\
  -DartifactId=${udf-artifact-id}	\
  -Dpackage=${packageName}    \
  -Dversion=0.0.1-SNAPSHOT      \
  -Dclass-name=${className}     \
  -Dteiid-version${teiidVersion}


********
* where:
********

  -DarchetypeGroupId    -  is the group ID for the arche type to use to generate
  -DarchetypeArtifactId -  is the artifact ID for the arche type to use to generate
  -DarchetypeVersion	-  is the version for the arche type to use to generate
  -DgroupId		-  (user defined) group ID for the new udf project pom.xml
  -DartifactId		-  (user defined) artifact ID for the new udf project pom.xml
  -Dpackage		-  (user defined) the package structure where the java, module and resource files will be created
  -Dversion		-  (user defined) the version that the new connector project pom.xml will be
  -Dclass-name    	-  (user defined) the class name to give the new user preparser, will become the Class Name 
  -Dteiid-version       -  Optional, defaults to 9.0.0.Final


*********
* EXAMPLE
*********

-  this is an example of the template that can be run:

mvn archetype:generate       -DarchethypeRepository=https://repository.jboss.org/nexus/content/repositories/releases/                                \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=udf-archetype          \
  -DarchetypeVersion=9.0.0     \
  -DgroupId=org.teiid.udf   \
  -DartifactId=udf-myFunction    \
  -Dpackage=org.teiid.udf    \
  -Dversion=0.0.1-SNAPSHOT      \
  -Dclass-name=myPreParser


When executed, you will be asked to confirm the package property

[INFO] Using property: groupId = org.teiid.preparser
[INFO] Using property: artifactId = preparser-myParser
[INFO] Using property: version = 0.0.1-SNAPSHOT
[INFO] Using property: package = org.teiid.preparser
[INFO] Using property: class-name = myPreParser
[INFO] Using property: teiid-version = 9.0.0.Final
Confirm properties configuration:
groupId: org.teiid.preparser
artifactId: preparser-myParser
version: 0.0.1-SNAPSHOT
package: org.teiid.preparser
class-name: myPreParser
teiid-version: 9.0.0.Final
 Y: : y


type Y (yes) and press enter, and the creation of the preparser project will be done

