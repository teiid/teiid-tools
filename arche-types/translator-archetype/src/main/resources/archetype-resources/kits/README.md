TEIID Translator Arche Type
================

This maven project is use to create the TEIID Translator archetype, which then can be used to generate a new translator project.

When the translator project is generated, you will end up with the following structure:

-  translator-${translator-type}
	|-	kits
		|-	wildfly
			|-	docs
				|-	teiid-extensions
					|-	datasources
						|-	${translator-type}	
							|-	add-translator-${translator-type}.cli
			|-	modules
				|-	${package}
					|-	main
						|-	module.xml
		|-	wildfly-dist.xml 
	| -	pom.xml
	| -	src
		|-	main
			|-	java
				|-	${package}
					|-	${translator-name}Connection.java
					|-	${translator-name}Execution.java
					|-	${translator-name}ExecutionFactory.java
					|-	${translator-name}Plugin.java
			|-	resources
				|-	${package}
						|-	i18n.properties
				|-	META-INF
					|-	services
						|-	org.teiid.translator.ExecutionFactory

