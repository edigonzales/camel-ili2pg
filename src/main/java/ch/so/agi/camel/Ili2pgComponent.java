package ch.so.agi.camel;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;

import org.apache.camel.impl.DefaultComponent;

/**
 * Represents the component that manages {@link Ili2pgEndpoint}.
 */
public class Ili2pgComponent extends DefaultComponent {    
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new Ili2pgEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
