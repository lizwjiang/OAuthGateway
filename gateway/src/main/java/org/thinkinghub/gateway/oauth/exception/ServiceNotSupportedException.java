package org.thinkinghub.gateway.oauth.exception;

@SuppressWarnings("serial")
public class ServiceNotSupportedException extends GatewayException {
    public ServiceNotSupportedException(String message) {
        super(message);
    }
    
    public String getGWErrorCode(){
    	return "GW30001";
    }
}
