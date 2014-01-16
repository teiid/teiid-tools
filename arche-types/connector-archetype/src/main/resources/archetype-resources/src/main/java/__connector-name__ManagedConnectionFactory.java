/*
 * ${license}
 */
package ${package};

import javax.resource.ResourceException;
import javax.resource.spi.InvalidPropertyException;

import org.teiid.resource.spi.BasicConnectionFactory;
import org.teiid.resource.spi.BasicManagedConnectionFactory;

public class ${connector-name}ManagedConnectionFactory extends BasicManagedConnectionFactory {
	
	@Override
	public BasicConnectionFactory<${connector-name}ConnectionImpl> createConnectionFactory() throws ResourceException {
		return new BasicConnectionFactory<${connector-name}ConnectionImpl>() {
			@Override
			public ${connector-name}ConnectionImpl getConnection() throws ResourceException {
				return new ${connector-name}ConnectionImpl(${connector-name}ManagedConnectionFactory.this);
			}
		};
	}	
	
	// ra.xml files getters and setters go here.

}
