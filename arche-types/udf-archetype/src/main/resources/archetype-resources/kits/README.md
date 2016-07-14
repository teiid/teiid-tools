TEIID Translator Arche Type
================

This maven project is use to create the TEIID Translator archetype, which then can be used to generate a new translator project.

When the translator project is generated, you will end up with the following structure:

-  translator-${translator-type}
	|-	kits
		|-	embedded-dist.xml
		|-	jboss-as7
			|-	docs
				|-	teiid
					|-	datasources
						|-	${translator-type}	
							|-	add-translator-${translator-type}.cli
			|-	modules
				|-	${module-location}
					|-	${translator-type}
						|-	main
							|-	module.xml
		|-	jboss-as7-dist.xml 
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

