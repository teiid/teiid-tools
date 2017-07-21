/*
 * ${license}
 */
package ${package};


import javax.resource.ResourceException;

import org.teiid.resource.spi.BasicConnection;
import org.teiid.logging.LogManager;
import org.teiid.core.BundleUtil;
import org.teiid.logging.LogConstants;

/**
 * Connection to the resource. You must define ${connector-name}Connection interface, that 
 * extends the "javax.resource.cci.Connection".  If a custom translator is also being created,
 * the Connection interface should be defined in that project or a common project.
 */
public class ${connector-name}ConnectionImpl extends BasicConnection implements ${connector-name}Connection {

	public static final BundleUtil UTIL = BundleUtil.getBundleUtil(${connector-name}ConnectionImpl.class);


    private ${connector-name}ManagedConnectionFactory config;

    public ${connector-name}ConnectionImpl(${connector-name}ManagedConnectionFactory env) {
        this.config = env;
        // todo: connect to your source here
        
        LogManager.logDetail(LogConstants.CTX_CONNECTOR, "${connector-name} Connection has been created."); //$NON-NLS-1$

    }
    
    @Override
    public void close() {
        LogManager.logDetail(LogConstants.CTX_CONNECTOR, "${connector-name} Connection has been closed."); //$NON-NLS-1$
    	
    }
}
