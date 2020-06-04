
/**
 * OAuthAdminServiceStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:11 UTC)
 */
package org.wso2.carbon.identity.oauth.stub;



/*
 *  OAuthAdminServiceStub java implementation
 */


public class OAuthAdminServiceStub extends org.apache.axis2.client.Stub
        implements OAuthAdminService {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
    }


    private void populateAxisService() throws org.apache.axis2.AxisFault {

        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("OAuthAdminService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[31];

        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getAudiences"));
        _service.addOperation(__operation);


        _operations[0] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getSupportedTokenTypes"));
        _service.addOperation(__operation);


        _operations[1] = __operation;


        __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "deleteScope"));
        _service.addOperation(__operation);


        _operations[2] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getAllowedScopeValidators"));
        _service.addOperation(__operation);


        _operations[3] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getOAuthApplicationDataByAppName"));
        _service.addOperation(__operation);


        _operations[4] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getOauthApplicationState"));
        _service.addOperation(__operation);


        _operations[5] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "isPKCESupportEnabled"));
        _service.addOperation(__operation);


        _operations[6] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "isRefreshTokenRenewalEnabled"));
        _service.addOperation(__operation);


        _operations[7] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "registerOAuthConsumer"));
        _service.addOperation(__operation);


        _operations[8] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "registerAndRetrieveOAuthApplicationData"));
        _service.addOperation(__operation);


        _operations[9] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "updateConsumerAppState"));
        _service.addOperation(__operation);


        _operations[10] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "isScopeExist"));
        _service.addOperation(__operation);


        _operations[11] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "updateConsumerApplication"));
        _service.addOperation(__operation);


        _operations[12] = __operation;


        __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "addScope"));
        _service.addOperation(__operation);


        _operations[13] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "registerOAuthApplicationData"));
        _service.addOperation(__operation);


        _operations[14] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "removeOAuthApplicationData"));
        _service.addOperation(__operation);


        _operations[15] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getClaims"));
        _service.addOperation(__operation);


        _operations[16] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "isHashDisabled"));
        _service.addOperation(__operation);


        _operations[17] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getOAuthApplicationData"));
        _service.addOperation(__operation);


        _operations[18] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getAllowedGrantTypes"));
        _service.addOperation(__operation);


        _operations[19] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "updateApproveAlwaysForAppConsentByResourceOwner"));
        _service.addOperation(__operation);


        _operations[20] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "updateOauthSecretKey"));
        _service.addOperation(__operation);


        _operations[21] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "updateAndRetrieveOauthSecretKey"));
        _service.addOperation(__operation);


        _operations[22] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getSupportedIDTokenAlgorithms"));
        _service.addOperation(__operation);


        _operations[23] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "revokeAuthzForAppsByResoureOwner"));
        _service.addOperation(__operation);


        _operations[24] = __operation;


        __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "updateScope"));
        _service.addOperation(__operation);


        _operations[25] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getScopeNames"));
        _service.addOperation(__operation);


        _operations[26] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getScopes"));
        _service.addOperation(__operation);


        _operations[27] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getTokenExpiryTimes"));
        _service.addOperation(__operation);


        _operations[28] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getAllOAuthApplicationData"));
        _service.addOperation(__operation);


        _operations[29] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org", "getAppsAuthorizedByUser"));
        _service.addOperation(__operation);


        _operations[30] = __operation;


    }

    //populates the faults
    private void populateFaults() {

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "deleteScope"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "deleteScope"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "deleteScope"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOAuthApplicationDataByAppName"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOAuthApplicationDataByAppName"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOAuthApplicationDataByAppName"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOauthApplicationState"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOauthApplicationState"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOauthApplicationState"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerOAuthConsumer"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerOAuthConsumer"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerOAuthConsumer"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerAndRetrieveOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerAndRetrieveOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerAndRetrieveOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateConsumerAppState"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateConsumerAppState"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateConsumerAppState"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "isScopeExist"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "isScopeExist"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "isScopeExist"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateConsumerApplication"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateConsumerApplication"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateConsumerApplication"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "addScope"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "addScope"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "addScope"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "registerOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "removeOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "removeOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "removeOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getClaims"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getClaims"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getClaims"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateApproveAlwaysForAppConsentByResourceOwner"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateApproveAlwaysForAppConsentByResourceOwner"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateApproveAlwaysForAppConsentByResourceOwner"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateOauthSecretKey"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateOauthSecretKey"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateOauthSecretKey"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateAndRetrieveOauthSecretKey"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateAndRetrieveOauthSecretKey"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateAndRetrieveOauthSecretKey"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "revokeAuthzForAppsByResoureOwner"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "revokeAuthzForAppsByResoureOwner"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "revokeAuthzForAppsByResoureOwner"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateScope"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateScope"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "updateScope"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getScopeNames"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getScopeNames"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getScopeNames"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getScopes"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getScopes"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getScopes"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getAllOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getAllOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getAllOAuthApplicationData"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getAppsAuthorizedByUser"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getAppsAuthorizedByUser"), "org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.axis2/xsd", "OAuthAdminServiceIdentityOAuthAdminException"), "getAppsAuthorizedByUser"), "org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException");


    }

    /**
     *Constructor that takes in a configContext
     */

    public OAuthAdminServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                 java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }


    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public OAuthAdminServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                 java.lang.String targetEndpoint, boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);


        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);


    }

    /**
     * Default Constructor
     */
    public OAuthAdminServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

        this(configurationContext, "https://localhost:9443/services/OAuthAdminService.OAuthAdminServiceHttpsSoap12Endpoint/");

    }

    /**
     * Default Constructor
     */
    public OAuthAdminServiceStub() throws org.apache.axis2.AxisFault {

        this("https://localhost:9443/services/OAuthAdminService.OAuthAdminServiceHttpsSoap12Endpoint/");

    }

    /**
     * Constructor taking the target endpoint
     */
    public OAuthAdminServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }


    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getAudiences
     */


    public void getAudiences(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("urn:getAudiences");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            //Style is taken to be "document". No input parameters
            // according to the WS-Basic profile in this case we have to send an empty soap message
            org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
            env = factory.getDefaultEnvelope();

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            return;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAudiences"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAudiences"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAudiences"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetAudiences
     */
    public void startgetAudiences(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("urn:getAudiences");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is taken to be "document". No input parameters
        // according to the WS-Basic profile in this case we have to send an empty soap message
        org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
        env = factory.getDefaultEnvelope();

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        // Nothing to pass as the callback!!!


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getSupportedTokenTypes
     * @param getSupportedTokenTypes144

     */


    public java.lang.String[] getSupportedTokenTypes(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions().setAction("urn:getSupportedTokenTypes");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getSupportedTokenTypes")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetSupportedTokenTypesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedTokenTypes"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedTokenTypes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedTokenTypes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetSupportedTokenTypes
     * @param getSupportedTokenTypes144

     */
    public void startgetSupportedTokenTypes(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions().setAction("urn:getSupportedTokenTypes");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getSupportedTokenTypes")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetSupportedTokenTypes(
                            getGetSupportedTokenTypesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetSupportedTokenTypes(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedTokenTypes"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedTokenTypes"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedTokenTypes"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorgetSupportedTokenTypes(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedTokenTypes(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedTokenTypes(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedTokenTypes(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedTokenTypes(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedTokenTypes(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedTokenTypes(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedTokenTypes(f);
                            }
                        } else {
                            callback.receiveErrorgetSupportedTokenTypes(f);
                        }
                    } else {
                        callback.receiveErrorgetSupportedTokenTypes(f);
                    }
                } else {
                    callback.receiveErrorgetSupportedTokenTypes(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetSupportedTokenTypes(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }


    /**
     * Auto generated method signature
     *
     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */
    public void deleteScope(
            java.lang.String scope148

    ) throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions().setAction("urn:deleteScope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            org.apache.axiom.soap.SOAPEnvelope env = null;
            _messageContext = new org.apache.axis2.context.MessageContext();


            //Style is Doc.
            org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    scope148,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "deleteScope")));


            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            _operationClient.execute(true);


        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteScope"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteScope"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex =
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteScope"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

        return;
    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getAllowedScopeValidators
     * @param getAllowedScopeValidators149

     */


    public java.lang.String[] getAllowedScopeValidators(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("urn:getAllowedScopeValidators");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getAllowedScopeValidators")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetAllowedScopeValidatorsResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedScopeValidators"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedScopeValidators"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedScopeValidators"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetAllowedScopeValidators
     * @param getAllowedScopeValidators149

     */
    public void startgetAllowedScopeValidators(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions().setAction("urn:getAllowedScopeValidators");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getAllowedScopeValidators")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAllowedScopeValidators(
                            getGetAllowedScopeValidatorsResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAllowedScopeValidators(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedScopeValidators"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedScopeValidators"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedScopeValidators"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorgetAllowedScopeValidators(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedScopeValidators(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedScopeValidators(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedScopeValidators(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedScopeValidators(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedScopeValidators(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedScopeValidators(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedScopeValidators(f);
                            }
                        } else {
                            callback.receiveErrorgetAllowedScopeValidators(f);
                        }
                    } else {
                        callback.receiveErrorgetAllowedScopeValidators(f);
                    }
                } else {
                    callback.receiveErrorgetAllowedScopeValidators(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAllowedScopeValidators(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getOAuthApplicationDataByAppName
     * @param getOAuthApplicationDataByAppName152

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getOAuthApplicationDataByAppName(

            java.lang.String appName153)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions().setAction("urn:getOAuthApplicationDataByAppName");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    appName153,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getOAuthApplicationDataByAppName")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetOAuthApplicationDataByAppNameResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationDataByAppName"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationDataByAppName"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationDataByAppName"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetOAuthApplicationDataByAppName
     * @param getOAuthApplicationDataByAppName152

     */
    public void startgetOAuthApplicationDataByAppName(

            java.lang.String appName153,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("urn:getOAuthApplicationDataByAppName");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                appName153,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getOAuthApplicationDataByAppName")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetOAuthApplicationDataByAppName(
                            getGetOAuthApplicationDataByAppNameResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetOAuthApplicationDataByAppName(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationDataByAppName"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationDataByAppName"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationDataByAppName"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetOAuthApplicationDataByAppName((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetOAuthApplicationDataByAppName(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                            }
                        } else {
                            callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                        }
                    } else {
                        callback.receiveErrorgetOAuthApplicationDataByAppName(f);
                    }
                } else {
                    callback.receiveErrorgetOAuthApplicationDataByAppName(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetOAuthApplicationDataByAppName(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getOauthApplicationState
     * @param getOauthApplicationState156

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public java.lang.String getOauthApplicationState(

            java.lang.String consumerKey157)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions().setAction("urn:getOauthApplicationState");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consumerKey157,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getOauthApplicationState")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetOauthApplicationStateResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOauthApplicationState"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOauthApplicationState"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOauthApplicationState"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetOauthApplicationState
     * @param getOauthApplicationState156

     */
    public void startgetOauthApplicationState(

            java.lang.String consumerKey157,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions().setAction("urn:getOauthApplicationState");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consumerKey157,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getOauthApplicationState")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetOauthApplicationState(
                            getGetOauthApplicationStateResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetOauthApplicationState(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOauthApplicationState"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOauthApplicationState"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOauthApplicationState"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetOauthApplicationState((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetOauthApplicationState(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOauthApplicationState(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOauthApplicationState(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOauthApplicationState(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOauthApplicationState(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOauthApplicationState(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOauthApplicationState(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOauthApplicationState(f);
                            }
                        } else {
                            callback.receiveErrorgetOauthApplicationState(f);
                        }
                    } else {
                        callback.receiveErrorgetOauthApplicationState(f);
                    }
                } else {
                    callback.receiveErrorgetOauthApplicationState(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetOauthApplicationState(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#isPKCESupportEnabled
     * @param isPKCESupportEnabled160

     */


    public boolean isPKCESupportEnabled(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions().setAction("urn:isPKCESupportEnabled");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "isPKCESupportEnabled")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getIsPKCESupportEnabledResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isPKCESupportEnabled"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isPKCESupportEnabled"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isPKCESupportEnabled"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startisPKCESupportEnabled
     * @param isPKCESupportEnabled160

     */
    public void startisPKCESupportEnabled(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions().setAction("urn:isPKCESupportEnabled");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "isPKCESupportEnabled")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultisPKCESupportEnabled(
                            getIsPKCESupportEnabledResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorisPKCESupportEnabled(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isPKCESupportEnabled"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isPKCESupportEnabled"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isPKCESupportEnabled"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorisPKCESupportEnabled(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisPKCESupportEnabled(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisPKCESupportEnabled(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisPKCESupportEnabled(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisPKCESupportEnabled(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisPKCESupportEnabled(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisPKCESupportEnabled(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisPKCESupportEnabled(f);
                            }
                        } else {
                            callback.receiveErrorisPKCESupportEnabled(f);
                        }
                    } else {
                        callback.receiveErrorisPKCESupportEnabled(f);
                    }
                } else {
                    callback.receiveErrorisPKCESupportEnabled(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorisPKCESupportEnabled(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[6].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#isRefreshTokenRenewalEnabled
     * @param isRefreshTokenRenewalEnabled163

     */


    public boolean isRefreshTokenRenewalEnabled(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setAction("urn:isRefreshTokenRenewalEnabled");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "isRefreshTokenRenewalEnabled")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getIsRefreshTokenRenewalEnabledResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isRefreshTokenRenewalEnabled"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isRefreshTokenRenewalEnabled"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isRefreshTokenRenewalEnabled"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startisRefreshTokenRenewalEnabled
     * @param isRefreshTokenRenewalEnabled163

     */
    public void startisRefreshTokenRenewalEnabled(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions().setAction("urn:isRefreshTokenRenewalEnabled");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "isRefreshTokenRenewalEnabled")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultisRefreshTokenRenewalEnabled(
                            getIsRefreshTokenRenewalEnabledResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorisRefreshTokenRenewalEnabled(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isRefreshTokenRenewalEnabled"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isRefreshTokenRenewalEnabled"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isRefreshTokenRenewalEnabled"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorisRefreshTokenRenewalEnabled(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                            }
                        } else {
                            callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                        }
                    } else {
                        callback.receiveErrorisRefreshTokenRenewalEnabled(f);
                    }
                } else {
                    callback.receiveErrorisRefreshTokenRenewalEnabled(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorisRefreshTokenRenewalEnabled(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[7].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#registerOAuthConsumer
     * @param registerOAuthConsumer166

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public java.lang.String[] registerOAuthConsumer(

    )


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions().setAction("urn:registerOAuthConsumer");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "registerOAuthConsumer")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getRegisterOAuthConsumerResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthConsumer"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthConsumer"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthConsumer"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startregisterOAuthConsumer
     * @param registerOAuthConsumer166

     */
    public void startregisterOAuthConsumer(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
        _operationClient.getOptions().setAction("urn:registerOAuthConsumer");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "registerOAuthConsumer")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultregisterOAuthConsumer(
                            getRegisterOAuthConsumerResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorregisterOAuthConsumer(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthConsumer"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthConsumer"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthConsumer"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorregisterOAuthConsumer((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorregisterOAuthConsumer(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterOAuthConsumer(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterOAuthConsumer(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterOAuthConsumer(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterOAuthConsumer(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterOAuthConsumer(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterOAuthConsumer(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterOAuthConsumer(f);
                            }
                        } else {
                            callback.receiveErrorregisterOAuthConsumer(f);
                        }
                    } else {
                        callback.receiveErrorregisterOAuthConsumer(f);
                    }
                } else {
                    callback.receiveErrorregisterOAuthConsumer(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorregisterOAuthConsumer(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[8].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#registerAndRetrieveOAuthApplicationData
     * @param registerAndRetrieveOAuthApplicationData169

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO registerAndRetrieveOAuthApplicationData(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application170)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions().setAction("urn:registerAndRetrieveOAuthApplicationData");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    application170,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "registerAndRetrieveOAuthApplicationData")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getRegisterAndRetrieveOAuthApplicationDataResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerAndRetrieveOAuthApplicationData"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerAndRetrieveOAuthApplicationData"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerAndRetrieveOAuthApplicationData"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startregisterAndRetrieveOAuthApplicationData
     * @param registerAndRetrieveOAuthApplicationData169

     */
    public void startregisterAndRetrieveOAuthApplicationData(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application170,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
        _operationClient.getOptions().setAction("urn:registerAndRetrieveOAuthApplicationData");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                application170,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "registerAndRetrieveOAuthApplicationData")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultregisterAndRetrieveOAuthApplicationData(
                            getRegisterAndRetrieveOAuthApplicationDataResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorregisterAndRetrieveOAuthApplicationData(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerAndRetrieveOAuthApplicationData"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerAndRetrieveOAuthApplicationData"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerAndRetrieveOAuthApplicationData"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorregisterAndRetrieveOAuthApplicationData((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                            }
                        } else {
                            callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                        }
                    } else {
                        callback.receiveErrorregisterAndRetrieveOAuthApplicationData(f);
                    }
                } else {
                    callback.receiveErrorregisterAndRetrieveOAuthApplicationData(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorregisterAndRetrieveOAuthApplicationData(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[9].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#updateConsumerAppState
     * @param updateConsumerAppState173

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public void updateConsumerAppState(

            java.lang.String consumerKey174, java.lang.String newState175)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions().setAction("urn:updateConsumerAppState");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consumerKey174,
                    newState175,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "updateConsumerAppState")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            return;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateConsumerAppState"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateConsumerAppState"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateConsumerAppState"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startupdateConsumerAppState
     * @param updateConsumerAppState173

     */
    public void startupdateConsumerAppState(

            java.lang.String consumerKey174, java.lang.String newState175,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
        _operationClient.getOptions().setAction("urn:updateConsumerAppState");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consumerKey174,
                newState175,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "updateConsumerAppState")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        // Nothing to pass as the callback!!!


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[10].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#isScopeExist
     * @param isScopeExist177

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public boolean isScopeExist(

            java.lang.String scope178)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions().setAction("urn:isScopeExist");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    scope178,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "isScopeExist")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getIsScopeExistResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isScopeExist"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isScopeExist"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isScopeExist"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startisScopeExist
     * @param isScopeExist177

     */
    public void startisScopeExist(

            java.lang.String scope178,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
        _operationClient.getOptions().setAction("urn:isScopeExist");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                scope178,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "isScopeExist")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultisScopeExist(
                            getIsScopeExistResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorisScopeExist(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isScopeExist"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isScopeExist"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isScopeExist"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorisScopeExist((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorisScopeExist(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisScopeExist(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisScopeExist(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisScopeExist(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisScopeExist(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisScopeExist(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisScopeExist(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisScopeExist(f);
                            }
                        } else {
                            callback.receiveErrorisScopeExist(f);
                        }
                    } else {
                        callback.receiveErrorisScopeExist(f);
                    }
                } else {
                    callback.receiveErrorisScopeExist(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorisScopeExist(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[11].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#updateConsumerApplication
     * @param updateConsumerApplication181

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public void updateConsumerApplication(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO consumerAppDTO182)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions().setAction("urn:updateConsumerApplication");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consumerAppDTO182,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "updateConsumerApplication")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            return;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateConsumerApplication"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateConsumerApplication"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateConsumerApplication"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startupdateConsumerApplication
     * @param updateConsumerApplication181

     */
    public void startupdateConsumerApplication(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO consumerAppDTO182,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
        _operationClient.getOptions().setAction("urn:updateConsumerApplication");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consumerAppDTO182,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "updateConsumerApplication")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        // Nothing to pass as the callback!!!


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[12].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }


    /**
     * Auto generated method signature
     *
     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */
    public void addScope(
            java.lang.String scope185, java.lang.String[] claims186

    ) throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions().setAction("urn:addScope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            org.apache.axiom.soap.SOAPEnvelope env = null;
            _messageContext = new org.apache.axis2.context.MessageContext();


            //Style is Doc.
            org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    scope185,
                    claims186,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "addScope")));


            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            _operationClient.execute(true);


        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addScope"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addScope"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex =
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addScope"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

        return;
    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#registerOAuthApplicationData
     * @param registerOAuthApplicationData187

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public void registerOAuthApplicationData(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application188)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions().setAction("urn:registerOAuthApplicationData");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    application188,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "registerOAuthApplicationData")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            return;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthApplicationData"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthApplicationData"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "registerOAuthApplicationData"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startregisterOAuthApplicationData
     * @param registerOAuthApplicationData187

     */
    public void startregisterOAuthApplicationData(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO application188,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
        _operationClient.getOptions().setAction("urn:registerOAuthApplicationData");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                application188,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "registerOAuthApplicationData")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        // Nothing to pass as the callback!!!


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[14].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#removeOAuthApplicationData
     * @param removeOAuthApplicationData190

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public void removeOAuthApplicationData(

            java.lang.String consumerKey191)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
            _operationClient.getOptions().setAction("urn:removeOAuthApplicationData");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consumerKey191,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "removeOAuthApplicationData")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            return;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeOAuthApplicationData"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeOAuthApplicationData"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeOAuthApplicationData"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startremoveOAuthApplicationData
     * @param removeOAuthApplicationData190

     */
    public void startremoveOAuthApplicationData(

            java.lang.String consumerKey191,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
        _operationClient.getOptions().setAction("urn:removeOAuthApplicationData");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consumerKey191,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "removeOAuthApplicationData")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        // Nothing to pass as the callback!!!


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[15].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[15].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getClaims
     * @param getClaims193

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public java.lang.String[] getClaims(

            java.lang.String scope194)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
            _operationClient.getOptions().setAction("urn:getClaims");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    scope194,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getClaims")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetClaimsResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getClaims"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getClaims"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getClaims"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetClaims
     * @param getClaims193

     */
    public void startgetClaims(

            java.lang.String scope194,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
        _operationClient.getOptions().setAction("urn:getClaims");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                scope194,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getClaims")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetClaims(
                            getGetClaimsResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetClaims(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getClaims"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getClaims"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getClaims"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetClaims((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetClaims(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetClaims(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetClaims(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetClaims(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetClaims(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetClaims(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetClaims(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetClaims(f);
                            }
                        } else {
                            callback.receiveErrorgetClaims(f);
                        }
                    } else {
                        callback.receiveErrorgetClaims(f);
                    }
                } else {
                    callback.receiveErrorgetClaims(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetClaims(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[16].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[16].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#isHashDisabled
     * @param isHashDisabled197

     */


    public boolean isHashDisabled(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
            _operationClient.getOptions().setAction("urn:isHashDisabled");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "isHashDisabled")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getIsHashDisabledResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isHashDisabled"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isHashDisabled"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isHashDisabled"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startisHashDisabled
     * @param isHashDisabled197

     */
    public void startisHashDisabled(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
        _operationClient.getOptions().setAction("urn:isHashDisabled");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "isHashDisabled")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultisHashDisabled(
                            getIsHashDisabledResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorisHashDisabled(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isHashDisabled"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isHashDisabled"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "isHashDisabled"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorisHashDisabled(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisHashDisabled(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisHashDisabled(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisHashDisabled(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisHashDisabled(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisHashDisabled(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisHashDisabled(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorisHashDisabled(f);
                            }
                        } else {
                            callback.receiveErrorisHashDisabled(f);
                        }
                    } else {
                        callback.receiveErrorisHashDisabled(f);
                    }
                } else {
                    callback.receiveErrorisHashDisabled(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorisHashDisabled(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[17].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[17].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getOAuthApplicationData
     * @param getOAuthApplicationData200

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getOAuthApplicationData(

            java.lang.String consumerKey201)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
            _operationClient.getOptions().setAction("urn:getOAuthApplicationData");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consumerKey201,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getOAuthApplicationData")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetOAuthApplicationDataResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationData"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationData"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationData"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetOAuthApplicationData
     * @param getOAuthApplicationData200

     */
    public void startgetOAuthApplicationData(

            java.lang.String consumerKey201,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
        _operationClient.getOptions().setAction("urn:getOAuthApplicationData");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consumerKey201,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getOAuthApplicationData")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetOAuthApplicationData(
                            getGetOAuthApplicationDataResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetOAuthApplicationData(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationData"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationData"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getOAuthApplicationData"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetOAuthApplicationData((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetOAuthApplicationData(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationData(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationData(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationData(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationData(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationData(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationData(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOAuthApplicationData(f);
                            }
                        } else {
                            callback.receiveErrorgetOAuthApplicationData(f);
                        }
                    } else {
                        callback.receiveErrorgetOAuthApplicationData(f);
                    }
                } else {
                    callback.receiveErrorgetOAuthApplicationData(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetOAuthApplicationData(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[18].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[18].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getAllowedGrantTypes
     * @param getAllowedGrantTypes204

     */


    public java.lang.String[] getAllowedGrantTypes(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
            _operationClient.getOptions().setAction("urn:getAllowedGrantTypes");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getAllowedGrantTypes")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetAllowedGrantTypesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedGrantTypes"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedGrantTypes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedGrantTypes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetAllowedGrantTypes
     * @param getAllowedGrantTypes204

     */
    public void startgetAllowedGrantTypes(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
        _operationClient.getOptions().setAction("urn:getAllowedGrantTypes");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getAllowedGrantTypes")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAllowedGrantTypes(
                            getGetAllowedGrantTypesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAllowedGrantTypes(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedGrantTypes"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedGrantTypes"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllowedGrantTypes"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorgetAllowedGrantTypes(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedGrantTypes(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedGrantTypes(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedGrantTypes(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedGrantTypes(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedGrantTypes(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedGrantTypes(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllowedGrantTypes(f);
                            }
                        } else {
                            callback.receiveErrorgetAllowedGrantTypes(f);
                        }
                    } else {
                        callback.receiveErrorgetAllowedGrantTypes(f);
                    }
                } else {
                    callback.receiveErrorgetAllowedGrantTypes(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAllowedGrantTypes(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[19].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[19].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#updateApproveAlwaysForAppConsentByResourceOwner
     * @param updateApproveAlwaysForAppConsentByResourceOwner207

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO updateApproveAlwaysForAppConsentByResourceOwner(

            java.lang.String appName208, java.lang.String state209)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
            _operationClient.getOptions().setAction("urn:updateApproveAlwaysForAppConsentByResourceOwner");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    appName208,
                    state209,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "updateApproveAlwaysForAppConsentByResourceOwner")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getUpdateApproveAlwaysForAppConsentByResourceOwnerResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateApproveAlwaysForAppConsentByResourceOwner"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateApproveAlwaysForAppConsentByResourceOwner"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateApproveAlwaysForAppConsentByResourceOwner"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startupdateApproveAlwaysForAppConsentByResourceOwner
     * @param updateApproveAlwaysForAppConsentByResourceOwner207

     */
    public void startupdateApproveAlwaysForAppConsentByResourceOwner(

            java.lang.String appName208, java.lang.String state209,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
        _operationClient.getOptions().setAction("urn:updateApproveAlwaysForAppConsentByResourceOwner");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                appName208,
                state209,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "updateApproveAlwaysForAppConsentByResourceOwner")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultupdateApproveAlwaysForAppConsentByResourceOwner(
                            getUpdateApproveAlwaysForAppConsentByResourceOwnerResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateApproveAlwaysForAppConsentByResourceOwner"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateApproveAlwaysForAppConsentByResourceOwner"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateApproveAlwaysForAppConsentByResourceOwner"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                            }
                        } else {
                            callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                        }
                    } else {
                        callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(f);
                    }
                } else {
                    callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorupdateApproveAlwaysForAppConsentByResourceOwner(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[20].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[20].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#updateOauthSecretKey
     * @param updateOauthSecretKey212

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public void updateOauthSecretKey(

            java.lang.String consumerKey213)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
            _operationClient.getOptions().setAction("urn:updateOauthSecretKey");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consumerKey213,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "updateOauthSecretKey")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            return;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateOauthSecretKey"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateOauthSecretKey"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateOauthSecretKey"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startupdateOauthSecretKey
     * @param updateOauthSecretKey212

     */
    public void startupdateOauthSecretKey(

            java.lang.String consumerKey213,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
        _operationClient.getOptions().setAction("urn:updateOauthSecretKey");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consumerKey213,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "updateOauthSecretKey")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        // Nothing to pass as the callback!!!


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[21].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[21].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#updateAndRetrieveOauthSecretKey
     * @param updateAndRetrieveOauthSecretKey215

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO updateAndRetrieveOauthSecretKey(

            java.lang.String consumerKey216)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
            _operationClient.getOptions().setAction("urn:updateAndRetrieveOauthSecretKey");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consumerKey216,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "updateAndRetrieveOauthSecretKey")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getUpdateAndRetrieveOauthSecretKeyResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateAndRetrieveOauthSecretKey"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateAndRetrieveOauthSecretKey"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateAndRetrieveOauthSecretKey"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startupdateAndRetrieveOauthSecretKey
     * @param updateAndRetrieveOauthSecretKey215

     */
    public void startupdateAndRetrieveOauthSecretKey(

            java.lang.String consumerKey216,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
        _operationClient.getOptions().setAction("urn:updateAndRetrieveOauthSecretKey");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consumerKey216,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "updateAndRetrieveOauthSecretKey")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultupdateAndRetrieveOauthSecretKey(
                            getUpdateAndRetrieveOauthSecretKeyResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorupdateAndRetrieveOauthSecretKey(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateAndRetrieveOauthSecretKey"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateAndRetrieveOauthSecretKey"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateAndRetrieveOauthSecretKey"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorupdateAndRetrieveOauthSecretKey((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                            }
                        } else {
                            callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                        }
                    } else {
                        callback.receiveErrorupdateAndRetrieveOauthSecretKey(f);
                    }
                } else {
                    callback.receiveErrorupdateAndRetrieveOauthSecretKey(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorupdateAndRetrieveOauthSecretKey(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[22].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[22].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getSupportedIDTokenAlgorithms
     * @param getSupportedIDTokenAlgorithms219

     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthIDTokenAlgorithmDTO getSupportedIDTokenAlgorithms(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
            _operationClient.getOptions().setAction("urn:getSupportedIDTokenAlgorithms");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getSupportedIDTokenAlgorithms")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetSupportedIDTokenAlgorithmsResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedIDTokenAlgorithms"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedIDTokenAlgorithms"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedIDTokenAlgorithms"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetSupportedIDTokenAlgorithms
     * @param getSupportedIDTokenAlgorithms219

     */
    public void startgetSupportedIDTokenAlgorithms(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
        _operationClient.getOptions().setAction("urn:getSupportedIDTokenAlgorithms");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getSupportedIDTokenAlgorithms")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetSupportedIDTokenAlgorithms(
                            getGetSupportedIDTokenAlgorithmsResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetSupportedIDTokenAlgorithms(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedIDTokenAlgorithms"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedIDTokenAlgorithms"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSupportedIDTokenAlgorithms"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorgetSupportedIDTokenAlgorithms(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                            }
                        } else {
                            callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                        }
                    } else {
                        callback.receiveErrorgetSupportedIDTokenAlgorithms(f);
                    }
                } else {
                    callback.receiveErrorgetSupportedIDTokenAlgorithms(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetSupportedIDTokenAlgorithms(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[23].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[23].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#revokeAuthzForAppsByResoureOwner
     * @param revokeAuthzForAppsByResoureOwner222

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO revokeAuthzForAppsByResoureOwner(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationRequestDTO revokeRequestDTO223)


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
            _operationClient.getOptions().setAction("urn:revokeAuthzForAppsByResoureOwner");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    revokeRequestDTO223,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "revokeAuthzForAppsByResoureOwner")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getRevokeAuthzForAppsByResoureOwnerResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "revokeAuthzForAppsByResoureOwner"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "revokeAuthzForAppsByResoureOwner"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "revokeAuthzForAppsByResoureOwner"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startrevokeAuthzForAppsByResoureOwner
     * @param revokeAuthzForAppsByResoureOwner222

     */
    public void startrevokeAuthzForAppsByResoureOwner(

            org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationRequestDTO revokeRequestDTO223,

            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
        _operationClient.getOptions().setAction("urn:revokeAuthzForAppsByResoureOwner");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                revokeRequestDTO223,
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "revokeAuthzForAppsByResoureOwner")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrevokeAuthzForAppsByResoureOwner(
                            getRevokeAuthzForAppsByResoureOwnerResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrevokeAuthzForAppsByResoureOwner(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "revokeAuthzForAppsByResoureOwner"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "revokeAuthzForAppsByResoureOwner"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "revokeAuthzForAppsByResoureOwner"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorrevokeAuthzForAppsByResoureOwner((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                            }
                        } else {
                            callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                        }
                    } else {
                        callback.receiveErrorrevokeAuthzForAppsByResoureOwner(f);
                    }
                } else {
                    callback.receiveErrorrevokeAuthzForAppsByResoureOwner(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrevokeAuthzForAppsByResoureOwner(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[24].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[24].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }


    /**
     * Auto generated method signature
     *
     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */
    public void updateScope(
            java.lang.String scope227, java.lang.String[] addClaims228, java.lang.String[] deleteClaims229

    ) throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
            _operationClient.getOptions().setAction("urn:updateScope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            org.apache.axiom.soap.SOAPEnvelope env = null;
            _messageContext = new org.apache.axis2.context.MessageContext();


            //Style is Doc.
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    scope227,
                    addClaims228,
                    deleteClaims229,
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "updateScope")));


            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            _operationClient.execute(true);


        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateScope"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateScope"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex =
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateScope"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }

        return;
    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getScopeNames
     * @param getScopeNames230

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public java.lang.String[] getScopeNames(

    )


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
            _operationClient.getOptions().setAction("urn:getScopeNames");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getScopeNames")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetScopeNamesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopeNames"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopeNames"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopeNames"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetScopeNames
     * @param getScopeNames230

     */
    public void startgetScopeNames(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
        _operationClient.getOptions().setAction("urn:getScopeNames");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getScopeNames")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetScopeNames(
                            getGetScopeNamesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetScopeNames(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopeNames"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopeNames"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopeNames"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetScopeNames((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetScopeNames(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopeNames(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopeNames(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopeNames(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopeNames(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopeNames(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopeNames(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopeNames(f);
                            }
                        } else {
                            callback.receiveErrorgetScopeNames(f);
                        }
                    } else {
                        callback.receiveErrorgetScopeNames(f);
                    }
                } else {
                    callback.receiveErrorgetScopeNames(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetScopeNames(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[26].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[26].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getScopes
     * @param getScopes233

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.ScopeDTO[] getScopes(

    )


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
            _operationClient.getOptions().setAction("urn:getScopes");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getScopes")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetScopesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopes"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetScopes
     * @param getScopes233

     */
    public void startgetScopes(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
        _operationClient.getOptions().setAction("urn:getScopes");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getScopes")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetScopes(
                            getGetScopesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetScopes(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopes"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopes"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getScopes"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetScopes((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetScopes(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopes(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopes(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopes(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopes(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopes(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopes(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetScopes(f);
                            }
                        } else {
                            callback.receiveErrorgetScopes(f);
                        }
                    } else {
                        callback.receiveErrorgetScopes(f);
                    }
                } else {
                    callback.receiveErrorgetScopes(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetScopes(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[27].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[27].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getTokenExpiryTimes
     * @param getTokenExpiryTimes236

     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthTokenExpiryTimeDTO getTokenExpiryTimes(

    )


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
            _operationClient.getOptions().setAction("urn:getTokenExpiryTimes");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getTokenExpiryTimes")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetTokenExpiryTimesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTokenExpiryTimes"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTokenExpiryTimes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTokenExpiryTimes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetTokenExpiryTimes
     * @param getTokenExpiryTimes236

     */
    public void startgetTokenExpiryTimes(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
        _operationClient.getOptions().setAction("urn:getTokenExpiryTimes");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getTokenExpiryTimes")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetTokenExpiryTimes(
                            getGetTokenExpiryTimesResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetTokenExpiryTimes(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTokenExpiryTimes"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTokenExpiryTimes"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTokenExpiryTimes"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});


                                callback.receiveErrorgetTokenExpiryTimes(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTokenExpiryTimes(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTokenExpiryTimes(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTokenExpiryTimes(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTokenExpiryTimes(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTokenExpiryTimes(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTokenExpiryTimes(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetTokenExpiryTimes(f);
                            }
                        } else {
                            callback.receiveErrorgetTokenExpiryTimes(f);
                        }
                    } else {
                        callback.receiveErrorgetTokenExpiryTimes(f);
                    }
                } else {
                    callback.receiveErrorgetTokenExpiryTimes(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetTokenExpiryTimes(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[28].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[28].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getAllOAuthApplicationData
     * @param getAllOAuthApplicationData239

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] getAllOAuthApplicationData(

    )


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
            _operationClient.getOptions().setAction("urn:getAllOAuthApplicationData");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getAllOAuthApplicationData")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetAllOAuthApplicationDataResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllOAuthApplicationData"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllOAuthApplicationData"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllOAuthApplicationData"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetAllOAuthApplicationData
     * @param getAllOAuthApplicationData239

     */
    public void startgetAllOAuthApplicationData(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
        _operationClient.getOptions().setAction("urn:getAllOAuthApplicationData");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getAllOAuthApplicationData")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAllOAuthApplicationData(
                            getGetAllOAuthApplicationDataResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAllOAuthApplicationData(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllOAuthApplicationData"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllOAuthApplicationData"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllOAuthApplicationData"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetAllOAuthApplicationData((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetAllOAuthApplicationData(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllOAuthApplicationData(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllOAuthApplicationData(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllOAuthApplicationData(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllOAuthApplicationData(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllOAuthApplicationData(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllOAuthApplicationData(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAllOAuthApplicationData(f);
                            }
                        } else {
                            callback.receiveErrorgetAllOAuthApplicationData(f);
                        }
                    } else {
                        callback.receiveErrorgetAllOAuthApplicationData(f);
                    }
                } else {
                    callback.receiveErrorgetAllOAuthApplicationData(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAllOAuthApplicationData(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[29].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[29].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#getAppsAuthorizedByUser
     * @param getAppsAuthorizedByUser242

     * @throws org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException :
     */


    public org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] getAppsAuthorizedByUser(

    )


            throws java.rmi.RemoteException


            , org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
            _operationClient.getOptions().setAction("urn:getAppsAuthorizedByUser");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    dummyWrappedType,
                    optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                            "getAppsAuthorizedByUser")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return getGetAppsAuthorizedByUserResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse) object);

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAppsAuthorizedByUser"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAppsAuthorizedByUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAppsAuthorizedByUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                            throw (org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex;
                        }


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see org.wso2.carbon.identity.oauth.stub.OAuthAdminService#startgetAppsAuthorizedByUser
     * @param getAppsAuthorizedByUser242

     */
    public void startgetAppsAuthorizedByUser(


            final org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
        _operationClient.getOptions().setAction("urn:getAppsAuthorizedByUser");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.
        org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                dummyWrappedType,
                optimizeContent(new javax.xml.namespace.QName("http://oauth.identity.carbon.wso2.org",
                        "getAppsAuthorizedByUser")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAppsAuthorizedByUser(
                            getGetAppsAuthorizedByUserResponse_return((org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse) object));

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAppsAuthorizedByUser(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAppsAuthorizedByUser"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAppsAuthorizedByUser"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAppsAuthorizedByUser"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex, new java.lang.Object[]{messageObject});

                                if (ex instanceof org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) {
                                    callback.receiveErrorgetAppsAuthorizedByUser((org.wso2.carbon.identity.oauth.stub.OAuthAdminServiceIdentityOAuthAdminException) ex);
                                    return;
                                }


                                callback.receiveErrorgetAppsAuthorizedByUser(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAppsAuthorizedByUser(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAppsAuthorizedByUser(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAppsAuthorizedByUser(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAppsAuthorizedByUser(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAppsAuthorizedByUser(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAppsAuthorizedByUser(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetAppsAuthorizedByUser(f);
                            }
                        } else {
                            callback.receiveErrorgetAppsAuthorizedByUser(f);
                        }
                    } else {
                        callback.receiveErrorgetAppsAuthorizedByUser(f);
                    }
                } else {
                    callback.receiveErrorgetAppsAuthorizedByUser(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAppsAuthorizedByUser(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[30].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[30].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }


    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }


    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {


        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    //https://localhost:9443/services/OAuthAdminService.OAuthAdminServiceHttpsSoap12Endpoint/
    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private java.lang.String[] getGetSupportedTokenTypesResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope();


            wrappedType.setScope(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private java.lang.String[] getGetAllowedScopeValidatorsResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName();


            wrappedType.setAppName(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getGetOAuthApplicationDataByAppNameResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState();


            wrappedType.setConsumerKey(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private java.lang.String getGetOauthApplicationStateResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private boolean getIsPKCESupportEnabledResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private boolean getIsRefreshTokenRenewalEnabledResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private java.lang.String[] getRegisterOAuthConsumerResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData();


            wrappedType.setApplication(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getRegisterAndRetrieveOAuthApplicationDataResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          java.lang.String param2,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState();


            wrappedType.setConsumerKey(param1);

            wrappedType.setNewState(param2);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist();


            wrappedType.setScope(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private boolean getIsScopeExistResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication();


            wrappedType.setConsumerAppDTO(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          java.lang.String[] param2,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope();


            wrappedType.setScope(param1);

            wrappedType.setClaims(param2);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData();


            wrappedType.setApplication(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData();


            wrappedType.setConsumerKey(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims();


            wrappedType.setScope(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private java.lang.String[] getGetClaimsResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private boolean getIsHashDisabledResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData();


            wrappedType.setConsumerKey(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getGetOAuthApplicationDataResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private java.lang.String[] getGetAllowedGrantTypesResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          java.lang.String param2,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner();


            wrappedType.setAppName(param1);

            wrappedType.setState(param2);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO getUpdateApproveAlwaysForAppConsentByResourceOwnerResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey();


            wrappedType.setConsumerKey(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey();


            wrappedType.setConsumerKey(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO getUpdateAndRetrieveOauthSecretKeyResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthIDTokenAlgorithmDTO getGetSupportedIDTokenAlgorithmsResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationRequestDTO param1,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner();


            wrappedType.setRevokeRequestDTO(param1);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthRevocationResponseDTO getRevokeAuthzForAppsByResoureOwnerResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          java.lang.String param1,
                                                          java.lang.String[] param2,
                                                          java.lang.String[] param3,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope();


            wrappedType.setScope(param1);

            wrappedType.setAddClaims(param2);

            wrappedType.setDeleteClaims(param3);


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private java.lang.String[] getGetScopeNamesResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.ScopeDTO[] getGetScopesResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthTokenExpiryTimeDTO getGetTokenExpiryTimesResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] getGetAllOAuthApplicationDataResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse wrappedType) {

        return wrappedType.get_return();

    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                                          org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser dummyWrappedType,
                                                          boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser wrappedType = new org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser();


            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser.MY_QNAME, factory));


            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }





    /* methods to provide back word compatibility */


    private org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO[] getGetAppsAuthorizedByUserResponse_return(
            org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse wrappedType) {

        return wrappedType.get_return();

    }


    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }


    private java.lang.Object fromOM(
            org.apache.axiom.om.OMElement param,
            java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypes.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedTokenTypesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.DeleteScope.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidators.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedScopeValidatorsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppName.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataByAppNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationState.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetOauthApplicationStateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsPKCESupportEnabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsRefreshTokenRenewalEnabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumer.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthConsumerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationData.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterAndRetrieveOAuthApplicationDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerAppState.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExist.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsScopeExistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateConsumerApplication.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.AddScope.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RegisterOAuthApplicationData.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RemoveOAuthApplicationData.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaims.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetClaimsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.IsHashDisabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationData.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetOAuthApplicationDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypes.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllowedGrantTypesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwner.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateApproveAlwaysForAppConsentByResourceOwnerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateOauthSecretKey.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKey.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateAndRetrieveOauthSecretKeyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithms.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetSupportedIDTokenAlgorithmsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwner.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.RevokeAuthzForAppsByResoureOwnerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.UpdateScope.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopeNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopes.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetScopesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimes.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetTokenExpiryTimesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationData.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAllOAuthApplicationDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.GetAppsAuthorizedByUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.class.equals(type)) {

                return org.wso2.carbon.identity.oauth.stub.types.axis2.OAuthAdminServiceIdentityOAuthAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }


}
   