
/**
 * OAuthAdminServiceIdentityOAuthAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

package org.wso2.carbon.identity.oauth.stub;

public class OAuthAdminServiceIdentityOAuthAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1588749691345L;
    
    private org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException faultMessage;

    
        public OAuthAdminServiceIdentityOAuthAdminException() {
            super("OAuthAdminServiceIdentityOAuthAdminException");
        }

        public OAuthAdminServiceIdentityOAuthAdminException(java.lang.String s) {
           super(s);
        }

        public OAuthAdminServiceIdentityOAuthAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public OAuthAdminServiceIdentityOAuthAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException getFaultMessage(){
       return faultMessage;
    }
}
    