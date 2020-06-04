
/**
 * OAuthServiceAuthenticationException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

package org.wso2.carbon.identity.oauth.stub;

public class OAuthServiceAuthenticationException extends java.lang.Exception{

    private static final long serialVersionUID = 1588749692383L;
    
    private org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthServiceAuthenticationException faultMessage;

    
        public OAuthServiceAuthenticationException() {
            super("OAuthServiceAuthenticationException");
        }

        public OAuthServiceAuthenticationException(java.lang.String s) {
           super(s);
        }

        public OAuthServiceAuthenticationException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public OAuthServiceAuthenticationException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthServiceAuthenticationException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthServiceAuthenticationException getFaultMessage(){
       return faultMessage;
    }
}
    