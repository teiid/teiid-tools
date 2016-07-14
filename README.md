teiid-tools
===========

This project contains tools to help with Teiid development tasks

-------
Install Project and arche types
-------

Get project:
-   run: git clone git@github.com:teiid/teiid-tools.git

Build project (install archetypes):

-   run:  mvn -s ./settings clean install

------
Tools
------

-   connector-archetype  for creating new connectors
-   translator-archetype  for creating new translator
-   udf-archetype  for creating User Defined Functions


-----
Examples using the command line
-----

See the Developers Guide for full execution details and options.


* Connector

mvn archetype:generate                                   \
  -DarchetypeGroupId=org.jboss.teiid.arche-types              \
  -DarchetypeArtifactId=connector-archetype          \
  -DarchetypeVersion=8.12.0     \
  -DgroupId=org.jboss.teiid.connectors      \
  -Dpackage=org.teiid.resource.adapter.myType    \
  -DartifactId=connector-myType \
  -Dversion=0.0.1-SNAPSHOT    \
  -Dconnector-name=myType   \
  -Dvendor-name=MyVendor    \
  -Dteiid-version=8.12.0.Final

* Translator

mvn archetype:generate                                  \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=translator-archetype          \
  -DarchetypeVersion=8.12.0     \
  -DgroupId=org.jboss.teiid.connector   \
  -DartifactId=translator-myType    \
  -Dpackage=org.teiid.translator.myType    \
  -Dversion=0.0.1-SNAPSHOT  \
  -Dtranslator-type=mytype  \
  -Dtranslator-name=MyType  \
  -Dteiid-version=8.12.0.Final

*  UDF

mvn archetype:generate                                  \
  -DarchetypeGroupId=org.jboss.teiid.arche-types               \
  -DarchetypeArtifactId=udf-archetype          \
  -DarchetypeVersion=8.12.1     \
  -DgroupId=org.teiid.udf   \
  -DartifactId=udf-myFunction    \
  -Dpackage=org.teiid.udf    \
  -Dversion=0.0.1-SNAPSHOT      \
  -Dudf-name=myFunction \
  -Dmethod-name=myFunction      \
  -Dmethod-args='String arg1'   \
  -Dreturn-type=String

