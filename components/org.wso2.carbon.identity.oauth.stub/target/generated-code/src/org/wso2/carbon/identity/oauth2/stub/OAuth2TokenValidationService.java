

/**
 * OAuth2TokenValidationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.identity.oauth2.stub;

    /*
     *  OAuth2TokenValidationService java interface
     */

    public interface OAuth2TokenValidationService {
          

        /**
          * Auto generated method signature
          * 
                    * @param findOAuthConsumerIfTokenIsValid3
                
         */

         
                     public org.wso2.carbon.identity.oauth2.stub.dto.OAuth2ClientApplicationDTO findOAuthConsumerIfTokenIsValid(

                        org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO validationReqDTO4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param findOAuthConsumerIfTokenIsValid3
            
          */
        public void startfindOAuthConsumerIfTokenIsValid(

            org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO validationReqDTO4,

            final org.wso2.carbon.identity.oauth2.stub.OAuth2TokenValidationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param buildIntrospectionResponse7
                
         */

         
                     public org.wso2.carbon.identity.oauth2.stub.dto.OAuth2IntrospectionResponseDTO buildIntrospectionResponse(

                        org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO validationReq8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param buildIntrospectionResponse7
            
          */
        public void startbuildIntrospectionResponse(

            org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO validationReq8,

            final org.wso2.carbon.identity.oauth2.stub.OAuth2TokenValidationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param validate11
                
         */

         
                     public org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationResponseDTO validate(

                        org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO validationReqDTO12)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param validate11
            
          */
        public void startvalidate(

            org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO validationReqDTO12,

            final org.wso2.carbon.identity.oauth2.stub.OAuth2TokenValidationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    