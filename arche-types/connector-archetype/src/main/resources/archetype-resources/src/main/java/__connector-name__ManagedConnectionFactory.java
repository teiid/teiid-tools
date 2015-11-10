/*
 * ${license}
 */
package ${package};

import javax.resource.ResourceException;
import javax.resource.spi.InvalidPropertyException;

import org.teiid.resource.spi.BasicConnectionFactory;
import org.teiid.resource.spi.BasicManagedConnectionFactory;

import org.teiid.core.BundleUtil;

public class ${connector-name}ManagedConnectionFactory extends BasicManagedConnectionFactory {

	public static final BundleUtil UTIL = BundleUtil.getBundleUtil(${connector-name}ManagedConnectionFactory.class);

	private String sampleProperty = null;
	
	@Override
	public BasicConnectionFactory<${connector-name}ConnectionImpl> createConnectionFactory() throws ResourceException {

		if (sampleProperty == null) {
	 		throw new InvalidPropertyException(UTIL.getString("${connector-name}ManagedConnectionFactory.sampleproperty_not_set")); //$NON-NLS-1$
		}
		
		return new BasicConnectionFactory<${connector-name}ConnectionImpl>() {
			@Override
			public ${connector-name}ConnectionImpl getConnection() throws ResourceException {
				return new ${connector-name}ConnectionImpl(${connector-name}ManagedConnectionFactory.this);
			}
		};
	}	
	
	// ra.xml files getters and setters go here.
	public String getSampleProperty() {
		return sampleProperty;
	}
	
	public void setSampleProperty(String property) {
		this.sampleProperty = property;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((sampleProperty == null) ? 0 : sampleProperty.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
			
		${connector-name}ManagedConnectionFactory other = (${connector-name}ManagedConnectionFactory) obj;

		if (!checkEquals(this.getSampleProperty(), other.getSampleProperty())) {
			return false;
		}

		return true;

	}

}
