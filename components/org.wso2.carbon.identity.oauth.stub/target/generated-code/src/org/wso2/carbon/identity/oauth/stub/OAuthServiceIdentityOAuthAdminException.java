
/**
 * OAuthServiceIdentityOAuthAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

package org.wso2.carbon.identity.oauth.stub;

public class OAuthServiceIdentityOAuthAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1588749692366L;
    
    private org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthServiceIdentityOAuthAdminException faultMessage;

    
        public OAuthServiceIdentityOAuthAdminException() {
            super("OAuthServiceIdentityOAuthAdminException");
        }

        public OAuthServiceIdentityOAuthAdminException(java.lang.String s) {
           super(s);
        }

        public OAuthServiceIdentityOAuthAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public OAuthServiceIdentityOAuthAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthServiceIdentityOAuthAdminException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthServiceIdentityOAuthAdminException getFaultMessage(){
       return faultMessage;
    }
}
    