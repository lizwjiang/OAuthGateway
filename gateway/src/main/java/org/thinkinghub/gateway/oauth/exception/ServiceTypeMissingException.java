package org.thinkinghub.gateway.oauth.exception;

@SuppressWarnings("serial")
public class ServiceTypeMissingException extends MandatoryParameterMissingException {
	public String getErrorCode(){
		return "GW10003";
	}
}