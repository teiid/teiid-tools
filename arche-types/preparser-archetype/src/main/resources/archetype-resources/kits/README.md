TEIID Preparser Arche Type
================

This maven project is use to create the TEIID Preparser archetype, which then can be used to generate a new java project.

When the preparser project is generated, you will end up with the following structure:

-  ${preparser_artifactID}
	|-	kits
		|-	wildfly
			|-	cli-scripts
				|-	add-module-__preparser-name__.cli
			|-	modules
				|-	${package}
					|-	__preparser-name__
						|-	main
							|-	module.xml
		|-	wildfly-dist.xml 
	| -	pom.xml
	| -	src
		|-	main
			|-	java
				|-	${package}
					|-	__preparser-name__.java


