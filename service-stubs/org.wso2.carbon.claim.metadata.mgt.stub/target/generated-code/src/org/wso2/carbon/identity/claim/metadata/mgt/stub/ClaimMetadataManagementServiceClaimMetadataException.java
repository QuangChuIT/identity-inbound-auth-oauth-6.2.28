
/**
 * ClaimMetadataManagementServiceClaimMetadataException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

package org.wso2.carbon.identity.claim.metadata.mgt.stub;

public class ClaimMetadataManagementServiceClaimMetadataException extends java.lang.Exception{

    private static final long serialVersionUID = 1587789820298L;
    
    private org.wso2.carbon.identity.claim.metadata.mgt.stub.types.axis2.ClaimMetadataManagementServiceClaimMetadataException faultMessage;

    
        public ClaimMetadataManagementServiceClaimMetadataException() {
            super("ClaimMetadataManagementServiceClaimMetadataException");
        }

        public ClaimMetadataManagementServiceClaimMetadataException(java.lang.String s) {
           super(s);
        }

        public ClaimMetadataManagementServiceClaimMetadataException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ClaimMetadataManagementServiceClaimMetadataException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.claim.metadata.mgt.stub.types.axis2.ClaimMetadataManagementServiceClaimMetadataException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.claim.metadata.mgt.stub.types.axis2.ClaimMetadataManagementServiceClaimMetadataException getFaultMessage(){
       return faultMessage;
    }
}
    