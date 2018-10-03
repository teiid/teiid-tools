TEIID CustomMetadataRepository Archetype
================

This maven project is use to create the TEIID Custom Metadata Repository archetype, which then can be used to generate a new java project.

When the custommetadatarepository project is generated, you will end up with the following structure:

-  ${custommetadatarepository_artifactID}
	|-	kits
		|-	wildfly
			|-	cli-scripts
				|-	add-module-__custommetadatarepository-name__.cli
			|-	modules
				|-	${package}
					|-	__custommetadatarepository-name__
						|-	main
							|-	module.xml
		|-	wildfly-dist.xml 
	| -	pom.xml
	| -	src
		|-	main
			|-	java
				|-	${package}
					|-	__custommetadatarepository-name__.java


