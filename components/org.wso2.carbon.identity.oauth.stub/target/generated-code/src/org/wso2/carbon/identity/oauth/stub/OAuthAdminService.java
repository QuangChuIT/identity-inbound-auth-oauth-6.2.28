

/**
 * OAuthAdminService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.identity.oauth.stub;

    /*
     *  OAuthAdminService java interface
     */

    public interface OAuthAdminService {
          

        /**
          * Auto generated method signature
          * 
         */

         
                     public void getAudiences(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetAudiences(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getSupportedTokenTypes41
                
         */

         
                     public java.lang.String[] getSupportedTokenTypes(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getSupportedTokenTypes41
            
          */
        public void startgetSupportedTokenTypes(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */
        public void  deleteScope(
         java.lang.String scope45

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAllowedScopeValidators46
                
         */

         
                     public java.lang.String[] getAllowedScopeValidators(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllowedScopeValidators46
            
          */
        public void startgetAllowedScopeValidators(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOAuthApplicationDataByAppName49
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getOAuthApplicationDataByAppName(

                        java.lang.String appName50)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOAuthApplicationDataByAppName49
            
          */
        public void startgetOAuthApplicationDataByAppName(

            java.lang.String appName50,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOauthApplicationState53
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public java.lang.String getOauthApplicationState(

                        java.lang.String consumerKey54)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOauthApplicationState53
            
          */
        public void startgetOauthApplicationState(

            java.lang.String consumerKey54,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isPKCESupportEnabled57
                
         */

         
                     public boolean isPKCESupportEnabled(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isPKCESupportEnabled57
            
          */
        public void startisPKCESupportEnabled(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isRefreshTokenRenewalEnabled60
                
         */

         
                     public boolean isRefreshTokenRenewalEnabled(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isRefreshTokenRenewalEnabled60
            
          */
        public void startisRefreshTokenRenewalEnabled(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param registerOAuthConsumer63
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public java.lang.String[] registerOAuthConsumer(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param registerOAuthConsumer63
            
          */
        public void startregisterOAuthConsumer(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param registerAndRetrieveOAuthApplicationData66
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO registerAndRetrieveOAuthApplicationData(

                        org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application67)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param registerAndRetrieveOAuthApplicationData66
            
          */
        public void startregisterAndRetrieveOAuthApplicationData(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application67,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateConsumerAppState70
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public void updateConsumerAppState(

                        java.lang.String consumerKey71,java.lang.String newState72)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateConsumerAppState70
            
          */
        public void startupdateConsumerAppState(

            java.lang.String consumerKey71,java.lang.String newState72,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isScopeExist74
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public boolean isScopeExist(

                        java.lang.String scope75)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isScopeExist74
            
          */
        public void startisScopeExist(

            java.lang.String scope75,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateConsumerApplication78
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public void updateConsumerApplication(

                        org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO consumerAppDTO79)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateConsumerApplication78
            
          */
        public void startupdateConsumerApplication(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO consumerAppDTO79,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */
        public void  addScope(
         java.lang.String scope82,java.lang.String[] claims83

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param registerOAuthApplicationData84
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public void registerOAuthApplicationData(

                        org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application85)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param registerOAuthApplicationData84
            
          */
        public void startregisterOAuthApplicationData(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application85,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param removeOAuthApplicationData87
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public void removeOAuthApplicationData(

                        java.lang.String consumerKey88)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param removeOAuthApplicationData87
            
          */
        public void startremoveOAuthApplicationData(

            java.lang.String consumerKey88,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getClaims90
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public java.lang.String[] getClaims(

                        java.lang.String scope91)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getClaims90
            
          */
        public void startgetClaims(

            java.lang.String scope91,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param isHashDisabled94
                
         */

         
                     public boolean isHashDisabled(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isHashDisabled94
            
          */
        public void startisHashDisabled(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOAuthApplicationData97
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getOAuthApplicationData(

                        java.lang.String consumerKey98)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOAuthApplicationData97
            
          */
        public void startgetOAuthApplicationData(

            java.lang.String consumerKey98,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllowedGrantTypes101
                
         */

         
                     public java.lang.String[] getAllowedGrantTypes(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllowedGrantTypes101
            
          */
        public void startgetAllowedGrantTypes(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateApproveAlwaysForAppConsentByResourceOwner104
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO updateApproveAlwaysForAppConsentByResourceOwner(

                        java.lang.String appName105,java.lang.String state106)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateApproveAlwaysForAppConsentByResourceOwner104
            
          */
        public void startupdateApproveAlwaysForAppConsentByResourceOwner(

            java.lang.String appName105,java.lang.String state106,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateOauthSecretKey109
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public void updateOauthSecretKey(

                        java.lang.String consumerKey110)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateOauthSecretKey109
            
          */
        public void startupdateOauthSecretKey(

            java.lang.String consumerKey110,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateAndRetrieveOauthSecretKey112
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO updateAndRetrieveOauthSecretKey(

                        java.lang.String consumerKey113)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateAndRetrieveOauthSecretKey112
            
          */
        public void startupdateAndRetrieveOauthSecretKey(

            java.lang.String consumerKey113,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getSupportedIDTokenAlgorithms116
                
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthIDTokenAlgorithmDTO getSupportedIDTokenAlgorithms(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getSupportedIDTokenAlgorithms116
            
          */
        public void startgetSupportedIDTokenAlgorithms(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param revokeAuthzForAppsByResoureOwner119
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO revokeAuthzForAppsByResoureOwner(

                        org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationRequestDTO revokeRequestDTO120)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param revokeAuthzForAppsByResoureOwner119
            
          */
        public void startrevokeAuthzForAppsByResoureOwner(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationRequestDTO revokeRequestDTO120,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */
        public void  updateScope(
         java.lang.String scope124,java.lang.String[] addClaims125,java.lang.String[] deleteClaims126

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getScopeNames127
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public java.lang.String[] getScopeNames(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getScopeNames127
            
          */
        public void startgetScopeNames(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getScopes130
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.ScopeDTO[] getScopes(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getScopes130
            
          */
        public void startgetScopes(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getTokenExpiryTimes133
                
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthTokenExpiryTimeDTO getTokenExpiryTimes(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getTokenExpiryTimes133
            
          */
        public void startgetTokenExpiryTimes(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllOAuthApplicationData136
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] getAllOAuthApplicationData(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllOAuthApplicationData136
            
          */
        public void startgetAllOAuthApplicationData(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAppsAuthorizedByUser139
                
             * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException : 
         */

         
                     public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] getAppsAuthorizedByUser(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAppsAuthorizedByUser139
            
          */
        public void startgetAppsAuthorizedByUser(

            

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    