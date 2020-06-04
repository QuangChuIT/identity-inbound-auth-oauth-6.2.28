

/**
 * OAuthService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.identity.oauth.stub;

    /*
     *  OAuthService java interface
     */

    public interface OAuthService {
          

        /**
          * Auto generated method signature
          * 
                    * @param isOAuthConsumerValid8
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException : 
         */

         
                     public boolean isOAuthConsumerValid(

                        org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerDTO oauthConsumer9)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isOAuthConsumerValid8
            
          */
        public void startisOAuthConsumerValid(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerDTO oauthConsumer9,

            final org.wso2.carbon.identity.oauth.stub.OAuthServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param validateAuthenticationRequest12
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException : 
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.types.Parameters validateAuthenticationRequest(

                        org.wso2.carbon.identity.oauth.stub.types.Parameters params13)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param validateAuthenticationRequest12
            
          */
        public void startvalidateAuthenticationRequest(

            org.wso2.carbon.identity.oauth.stub.types.Parameters params13,

            final org.wso2.carbon.identity.oauth.stub.OAuthServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param authorizeOauthRequestToken16
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException : 
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.types.Parameters authorizeOauthRequestToken(

                        org.wso2.carbon.identity.oauth.stub.types.Parameters params17)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param authorizeOauthRequestToken16
            
          */
        public void startauthorizeOauthRequestToken(

            org.wso2.carbon.identity.oauth.stub.types.Parameters params17,

            final org.wso2.carbon.identity.oauth.stub.OAuthServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAccessToken20
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException : 
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityOAuthAdminException : 
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.types.Parameters getAccessToken(

                        org.wso2.carbon.identity.oauth.stub.types.Parameters params21)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityException
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityOAuthAdminException
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAccessToken20
            
          */
        public void startgetAccessToken(

            org.wso2.carbon.identity.oauth.stub.types.Parameters params21,

            final org.wso2.carbon.identity.oauth.stub.OAuthServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getScopeAndAppName24
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.types.Parameters getScopeAndAppName(

                        java.lang.String oauthToken25)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getScopeAndAppName24
            
          */
        public void startgetScopeAndAppName(

            java.lang.String oauthToken25,

            final org.wso2.carbon.identity.oauth.stub.OAuthServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOauthRequestToken28
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityOAuthAdminException : 
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.types.Parameters getOauthRequestToken(

                        org.wso2.carbon.identity.oauth.stub.types.Parameters params29)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceIdentityOAuthAdminException
          ,org.wso2.carbon.identity.oauth.stub.OAuthServiceAuthenticationException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOauthRequestToken28
            
          */
        public void startgetOauthRequestToken(

            org.wso2.carbon.identity.oauth.stub.types.Parameters params29,

            final org.wso2.carbon.identity.oauth.stub.OAuthServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    