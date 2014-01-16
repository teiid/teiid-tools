/*
 * ${license}
 */
package ${package};


import javax.resource.ResourceException;

import org.teiid.resource.spi.BasicConnection;

/**
 * Connection to the resource. You must define ${connector-name}Connection interface, that 
 * extends the "javax.resource.cci.Connection"
 */
public class ${connector-name}ConnectionImpl extends BasicConnection implements ${connector-name}Connection {

    private ${connector-name}ManagedConnectionFactory config;

    public ${connector-name}ConnectionImpl(${connector-name}ManagedConnectionFactory env) {
        this.config = env;
        // todo: connect to your source here
    }
    
    @Override
    public void close() {
    	
    }
}
