
/**
 * OAuthAdminServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */

    package org.wso2.carbon.identity.oauth.stub;

    /**
     *  OAuthAdminServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OAuthAdminServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OAuthAdminServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OAuthAdminServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getAudiences method
            * override this method for handling normal response from getAudiences operation
            */
           public void receiveResultgetAudiences(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAudiences operation
           */
            public void receiveErrorgetAudiences(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSupportedTokenTypes method
            * override this method for handling normal response from getSupportedTokenTypes operation
            */
           public void receiveResultgetSupportedTokenTypes(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportedTokenTypes operation
           */
            public void receiveErrorgetSupportedTokenTypes(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getAllowedScopeValidators method
            * override this method for handling normal response from getAllowedScopeValidators operation
            */
           public void receiveResultgetAllowedScopeValidators(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllowedScopeValidators operation
           */
            public void receiveErrorgetAllowedScopeValidators(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOAuthApplicationDataByAppName method
            * override this method for handling normal response from getOAuthApplicationDataByAppName operation
            */
           public void receiveResultgetOAuthApplicationDataByAppName(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOAuthApplicationDataByAppName operation
           */
            public void receiveErrorgetOAuthApplicationDataByAppName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOauthApplicationState method
            * override this method for handling normal response from getOauthApplicationState operation
            */
           public void receiveResultgetOauthApplicationState(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOauthApplicationState operation
           */
            public void receiveErrorgetOauthApplicationState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isPKCESupportEnabled method
            * override this method for handling normal response from isPKCESupportEnabled operation
            */
           public void receiveResultisPKCESupportEnabled(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isPKCESupportEnabled operation
           */
            public void receiveErrorisPKCESupportEnabled(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isRefreshTokenRenewalEnabled method
            * override this method for handling normal response from isRefreshTokenRenewalEnabled operation
            */
           public void receiveResultisRefreshTokenRenewalEnabled(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isRefreshTokenRenewalEnabled operation
           */
            public void receiveErrorisRefreshTokenRenewalEnabled(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registerOAuthConsumer method
            * override this method for handling normal response from registerOAuthConsumer operation
            */
           public void receiveResultregisterOAuthConsumer(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registerOAuthConsumer operation
           */
            public void receiveErrorregisterOAuthConsumer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registerAndRetrieveOAuthApplicationData method
            * override this method for handling normal response from registerAndRetrieveOAuthApplicationData operation
            */
           public void receiveResultregisterAndRetrieveOAuthApplicationData(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registerAndRetrieveOAuthApplicationData operation
           */
            public void receiveErrorregisterAndRetrieveOAuthApplicationData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateConsumerAppState method
            * override this method for handling normal response from updateConsumerAppState operation
            */
           public void receiveResultupdateConsumerAppState(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateConsumerAppState operation
           */
            public void receiveErrorupdateConsumerAppState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isScopeExist method
            * override this method for handling normal response from isScopeExist operation
            */
           public void receiveResultisScopeExist(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isScopeExist operation
           */
            public void receiveErrorisScopeExist(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateConsumerApplication method
            * override this method for handling normal response from updateConsumerApplication operation
            */
           public void receiveResultupdateConsumerApplication(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateConsumerApplication operation
           */
            public void receiveErrorupdateConsumerApplication(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for registerOAuthApplicationData method
            * override this method for handling normal response from registerOAuthApplicationData operation
            */
           public void receiveResultregisterOAuthApplicationData(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registerOAuthApplicationData operation
           */
            public void receiveErrorregisterOAuthApplicationData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeOAuthApplicationData method
            * override this method for handling normal response from removeOAuthApplicationData operation
            */
           public void receiveResultremoveOAuthApplicationData(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeOAuthApplicationData operation
           */
            public void receiveErrorremoveOAuthApplicationData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getClaims method
            * override this method for handling normal response from getClaims operation
            */
           public void receiveResultgetClaims(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getClaims operation
           */
            public void receiveErrorgetClaims(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isHashDisabled method
            * override this method for handling normal response from isHashDisabled operation
            */
           public void receiveResultisHashDisabled(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isHashDisabled operation
           */
            public void receiveErrorisHashDisabled(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOAuthApplicationData method
            * override this method for handling normal response from getOAuthApplicationData operation
            */
           public void receiveResultgetOAuthApplicationData(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOAuthApplicationData operation
           */
            public void receiveErrorgetOAuthApplicationData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllowedGrantTypes method
            * override this method for handling normal response from getAllowedGrantTypes operation
            */
           public void receiveResultgetAllowedGrantTypes(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllowedGrantTypes operation
           */
            public void receiveErrorgetAllowedGrantTypes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateApproveAlwaysForAppConsentByResourceOwner method
            * override this method for handling normal response from updateApproveAlwaysForAppConsentByResourceOwner operation
            */
           public void receiveResultupdateApproveAlwaysForAppConsentByResourceOwner(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateApproveAlwaysForAppConsentByResourceOwner operation
           */
            public void receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateOauthSecretKey method
            * override this method for handling normal response from updateOauthSecretKey operation
            */
           public void receiveResultupdateOauthSecretKey(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateOauthSecretKey operation
           */
            public void receiveErrorupdateOauthSecretKey(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateAndRetrieveOauthSecretKey method
            * override this method for handling normal response from updateAndRetrieveOauthSecretKey operation
            */
           public void receiveResultupdateAndRetrieveOauthSecretKey(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateAndRetrieveOauthSecretKey operation
           */
            public void receiveErrorupdateAndRetrieveOauthSecretKey(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSupportedIDTokenAlgorithms method
            * override this method for handling normal response from getSupportedIDTokenAlgorithms operation
            */
           public void receiveResultgetSupportedIDTokenAlgorithms(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthIDTokenAlgorithmDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportedIDTokenAlgorithms operation
           */
            public void receiveErrorgetSupportedIDTokenAlgorithms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revokeAuthzForAppsByResoureOwner method
            * override this method for handling normal response from revokeAuthzForAppsByResoureOwner operation
            */
           public void receiveResultrevokeAuthzForAppsByResoureOwner(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revokeAuthzForAppsByResoureOwner operation
           */
            public void receiveErrorrevokeAuthzForAppsByResoureOwner(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getScopeNames method
            * override this method for handling normal response from getScopeNames operation
            */
           public void receiveResultgetScopeNames(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getScopeNames operation
           */
            public void receiveErrorgetScopeNames(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getScopes method
            * override this method for handling normal response from getScopes operation
            */
           public void receiveResultgetScopes(
                    org.wso2.carbon.identity.oauth.stub.dto.ScopeDTO[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getScopes operation
           */
            public void receiveErrorgetScopes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTokenExpiryTimes method
            * override this method for handling normal response from getTokenExpiryTimes operation
            */
           public void receiveResultgetTokenExpiryTimes(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthTokenExpiryTimeDTO result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTokenExpiryTimes operation
           */
            public void receiveErrorgetTokenExpiryTimes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllOAuthApplicationData method
            * override this method for handling normal response from getAllOAuthApplicationData operation
            */
           public void receiveResultgetAllOAuthApplicationData(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllOAuthApplicationData operation
           */
            public void receiveErrorgetAllOAuthApplicationData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAppsAuthorizedByUser method
            * override this method for handling normal response from getAppsAuthorizedByUser operation
            */
           public void receiveResultgetAppsAuthorizedByUser(
                    org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAppsAuthorizedByUser operation
           */
            public void receiveErrorgetAppsAuthorizedByUser(java.lang.Exception e) {
            }
                


    }
    