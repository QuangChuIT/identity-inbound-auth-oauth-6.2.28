
/**
 * OAuthConsumerAppDTO.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:19 UTC)
 */


package org.wso2.carbon.identity.oauth.stub.dto;


/**
 *  OAuthConsumerAppDTO bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class OAuthConsumerAppDTO
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = OAuthConsumerAppDTO
                Namespace URI = http://dto.oauth.identity.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */


    /**
     * field for OAuthVersion
     */


    protected java.lang.String localOAuthVersion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOAuthVersionTracker = false;

    public boolean isOAuthVersionSpecified() {
        return localOAuthVersionTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOAuthVersion() {
        return localOAuthVersion;
    }


    /**
     * Auto generated setter method
     * @param param OAuthVersion
     */
    public void setOAuthVersion(java.lang.String param) {
        localOAuthVersionTracker = true;

        this.localOAuthVersion = param;


    }


    /**
     * field for ApplicationAccessTokenExpiryTime
     */


    protected long localApplicationAccessTokenExpiryTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApplicationAccessTokenExpiryTimeTracker = false;

    public boolean isApplicationAccessTokenExpiryTimeSpecified() {
        return localApplicationAccessTokenExpiryTimeTracker;
    }


    /**
     * Auto generated getter method
     * @return long
     */
    public long getApplicationAccessTokenExpiryTime() {
        return localApplicationAccessTokenExpiryTime;
    }


    /**
     * Auto generated setter method
     * @param param ApplicationAccessTokenExpiryTime
     */
    public void setApplicationAccessTokenExpiryTime(long param) {

        // setting primitive attribute tracker to true
        localApplicationAccessTokenExpiryTimeTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localApplicationAccessTokenExpiryTime = param;


    }


    /**
     * field for ApplicationName
     */


    protected java.lang.String localApplicationName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApplicationNameTracker = false;

    public boolean isApplicationNameSpecified() {
        return localApplicationNameTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getApplicationName() {
        return localApplicationName;
    }


    /**
     * Auto generated setter method
     * @param param ApplicationName
     */
    public void setApplicationName(java.lang.String param) {
        localApplicationNameTracker = true;

        this.localApplicationName = param;


    }


    /**
     * field for Audiences
     * This was an Array!
     */


    protected java.lang.String[] localAudiences;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAudiencesTracker = false;

    public boolean isAudiencesSpecified() {
        return localAudiencesTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getAudiences() {
        return localAudiences;
    }


    /**
     * validate the array for Audiences
     */
    protected void validateAudiences(java.lang.String[] param) {

    }


    /**
     * Auto generated setter method
     * @param param Audiences
     */
    public void setAudiences(java.lang.String[] param) {

        validateAudiences(param);

        localAudiencesTracker = true;

        this.localAudiences = param;
    }


    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addAudiences(java.lang.String param) {
        if (localAudiences == null) {
            localAudiences = new java.lang.String[]{};
        }


        //update the setting tracker
        localAudiencesTracker = true;


        java.util.List list =
                org.apache.axis2.databinding.utils.ConverterUtil.toList(localAudiences);
        list.add(param);
        this.localAudiences =
                (java.lang.String[]) list.toArray(
                        new java.lang.String[list.size()]);

    }


    /**
     * field for BackChannelLogoutUrl
     */


    protected java.lang.String localBackChannelLogoutUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBackChannelLogoutUrlTracker = false;

    public boolean isBackChannelLogoutUrlSpecified() {
        return localBackChannelLogoutUrlTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBackChannelLogoutUrl() {
        return localBackChannelLogoutUrl;
    }


    /**
     * Auto generated setter method
     * @param param BackChannelLogoutUrl
     */
    public void setBackChannelLogoutUrl(java.lang.String param) {
        localBackChannelLogoutUrlTracker = true;

        this.localBackChannelLogoutUrl = param;


    }


    /**
     * field for BypassClientCredentials
     */


    protected boolean localBypassClientCredentials;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBypassClientCredentialsTracker = false;

    public boolean isBypassClientCredentialsSpecified() {
        return localBypassClientCredentialsTracker;
    }


    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getBypassClientCredentials() {
        return localBypassClientCredentials;
    }


    /**
     * Auto generated setter method
     * @param param BypassClientCredentials
     */
    public void setBypassClientCredentials(boolean param) {

        // setting primitive attribute tracker to true
        localBypassClientCredentialsTracker =
                true;

        this.localBypassClientCredentials = param;


    }


    /**
     * field for CallbackUrl
     */


    protected java.lang.String localCallbackUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCallbackUrlTracker = false;

    public boolean isCallbackUrlSpecified() {
        return localCallbackUrlTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCallbackUrl() {
        return localCallbackUrl;
    }


    /**
     * Auto generated setter method
     * @param param CallbackUrl
     */
    public void setCallbackUrl(java.lang.String param) {
        localCallbackUrlTracker = true;

        this.localCallbackUrl = param;


    }


    /**
     * field for FrontchannelLogoutUrl
     */


    protected java.lang.String localFrontchannelLogoutUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFrontchannelLogoutUrlTracker = false;

    public boolean isFrontchannelLogoutUrlSpecified() {
        return localFrontchannelLogoutUrlTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFrontchannelLogoutUrl() {
        return localFrontchannelLogoutUrl;
    }


    /**
     * Auto generated setter method
     * @param param FrontchannelLogoutUrl
     */
    public void setFrontchannelLogoutUrl(java.lang.String param) {
        localFrontchannelLogoutUrlTracker = true;

        this.localFrontchannelLogoutUrl = param;


    }


    /**
     * field for GrantTypes
     */


    protected java.lang.String localGrantTypes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGrantTypesTracker = false;

    public boolean isGrantTypesSpecified() {
        return localGrantTypesTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getGrantTypes() {
        return localGrantTypes;
    }


    /**
     * Auto generated setter method
     * @param param GrantTypes
     */
    public void setGrantTypes(java.lang.String param) {
        localGrantTypesTracker = true;

        this.localGrantTypes = param;


    }


    /**
     * field for IdTokenEncryptionAlgorithm
     */


    protected java.lang.String localIdTokenEncryptionAlgorithm;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTokenEncryptionAlgorithmTracker = false;

    public boolean isIdTokenEncryptionAlgorithmSpecified() {
        return localIdTokenEncryptionAlgorithmTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIdTokenEncryptionAlgorithm() {
        return localIdTokenEncryptionAlgorithm;
    }


    /**
     * Auto generated setter method
     * @param param IdTokenEncryptionAlgorithm
     */
    public void setIdTokenEncryptionAlgorithm(java.lang.String param) {
        localIdTokenEncryptionAlgorithmTracker = true;

        this.localIdTokenEncryptionAlgorithm = param;


    }


    /**
     * field for IdTokenEncryptionEnabled
     */


    protected boolean localIdTokenEncryptionEnabled;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTokenEncryptionEnabledTracker = false;

    public boolean isIdTokenEncryptionEnabledSpecified() {
        return localIdTokenEncryptionEnabledTracker;
    }


    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIdTokenEncryptionEnabled() {
        return localIdTokenEncryptionEnabled;
    }


    /**
     * Auto generated setter method
     * @param param IdTokenEncryptionEnabled
     */
    public void setIdTokenEncryptionEnabled(boolean param) {

        // setting primitive attribute tracker to true
        localIdTokenEncryptionEnabledTracker =
                true;

        this.localIdTokenEncryptionEnabled = param;


    }


    /**
     * field for IdTokenEncryptionMethod
     */


    protected java.lang.String localIdTokenEncryptionMethod;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTokenEncryptionMethodTracker = false;

    public boolean isIdTokenEncryptionMethodSpecified() {
        return localIdTokenEncryptionMethodTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIdTokenEncryptionMethod() {
        return localIdTokenEncryptionMethod;
    }


    /**
     * Auto generated setter method
     * @param param IdTokenEncryptionMethod
     */
    public void setIdTokenEncryptionMethod(java.lang.String param) {
        localIdTokenEncryptionMethodTracker = true;

        this.localIdTokenEncryptionMethod = param;


    }


    /**
     * field for IdTokenExpiryTime
     */


    protected long localIdTokenExpiryTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTokenExpiryTimeTracker = false;

    public boolean isIdTokenExpiryTimeSpecified() {
        return localIdTokenExpiryTimeTracker;
    }


    /**
     * Auto generated getter method
     * @return long
     */
    public long getIdTokenExpiryTime() {
        return localIdTokenExpiryTime;
    }


    /**
     * Auto generated setter method
     * @param param IdTokenExpiryTime
     */
    public void setIdTokenExpiryTime(long param) {

        // setting primitive attribute tracker to true
        localIdTokenExpiryTimeTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localIdTokenExpiryTime = param;


    }


    /**
     * field for OauthConsumerKey
     */


    protected java.lang.String localOauthConsumerKey;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOauthConsumerKeyTracker = false;

    public boolean isOauthConsumerKeySpecified() {
        return localOauthConsumerKeyTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOauthConsumerKey() {
        return localOauthConsumerKey;
    }


    /**
     * Auto generated setter method
     * @param param OauthConsumerKey
     */
    public void setOauthConsumerKey(java.lang.String param) {
        localOauthConsumerKeyTracker = true;

        this.localOauthConsumerKey = param;


    }


    /**
     * field for OauthConsumerSecret
     */


    protected java.lang.String localOauthConsumerSecret;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOauthConsumerSecretTracker = false;

    public boolean isOauthConsumerSecretSpecified() {
        return localOauthConsumerSecretTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOauthConsumerSecret() {
        return localOauthConsumerSecret;
    }


    /**
     * Auto generated setter method
     * @param param OauthConsumerSecret
     */
    public void setOauthConsumerSecret(java.lang.String param) {
        localOauthConsumerSecretTracker = true;

        this.localOauthConsumerSecret = param;


    }


    /**
     * field for PkceMandatory
     */


    protected boolean localPkceMandatory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPkceMandatoryTracker = false;

    public boolean isPkceMandatorySpecified() {
        return localPkceMandatoryTracker;
    }


    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPkceMandatory() {
        return localPkceMandatory;
    }


    /**
     * Auto generated setter method
     * @param param PkceMandatory
     */
    public void setPkceMandatory(boolean param) {

        // setting primitive attribute tracker to true
        localPkceMandatoryTracker =
                true;

        this.localPkceMandatory = param;


    }


    /**
     * field for PkceSupportPlain
     */


    protected boolean localPkceSupportPlain;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPkceSupportPlainTracker = false;

    public boolean isPkceSupportPlainSpecified() {
        return localPkceSupportPlainTracker;
    }


    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPkceSupportPlain() {
        return localPkceSupportPlain;
    }


    /**
     * Auto generated setter method
     * @param param PkceSupportPlain
     */
    public void setPkceSupportPlain(boolean param) {

        // setting primitive attribute tracker to true
        localPkceSupportPlainTracker =
                true;

        this.localPkceSupportPlain = param;


    }


    /**
     * field for RefreshTokenExpiryTime
     */


    protected long localRefreshTokenExpiryTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRefreshTokenExpiryTimeTracker = false;

    public boolean isRefreshTokenExpiryTimeSpecified() {
        return localRefreshTokenExpiryTimeTracker;
    }


    /**
     * Auto generated getter method
     * @return long
     */
    public long getRefreshTokenExpiryTime() {
        return localRefreshTokenExpiryTime;
    }


    /**
     * Auto generated setter method
     * @param param RefreshTokenExpiryTime
     */
    public void setRefreshTokenExpiryTime(long param) {

        // setting primitive attribute tracker to true
        localRefreshTokenExpiryTimeTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localRefreshTokenExpiryTime = param;


    }


    /**
     * field for RenewRefreshTokenEnabled
     */


    protected java.lang.String localRenewRefreshTokenEnabled;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRenewRefreshTokenEnabledTracker = false;

    public boolean isRenewRefreshTokenEnabledSpecified() {
        return localRenewRefreshTokenEnabledTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRenewRefreshTokenEnabled() {
        return localRenewRefreshTokenEnabled;
    }


    /**
     * Auto generated setter method
     * @param param RenewRefreshTokenEnabled
     */
    public void setRenewRefreshTokenEnabled(java.lang.String param) {
        localRenewRefreshTokenEnabledTracker = true;

        this.localRenewRefreshTokenEnabled = param;


    }


    /**
     * field for RequestObjectSignatureValidationEnabled
     */


    protected boolean localRequestObjectSignatureValidationEnabled;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRequestObjectSignatureValidationEnabledTracker = false;

    public boolean isRequestObjectSignatureValidationEnabledSpecified() {
        return localRequestObjectSignatureValidationEnabledTracker;
    }


    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getRequestObjectSignatureValidationEnabled() {
        return localRequestObjectSignatureValidationEnabled;
    }


    /**
     * Auto generated setter method
     * @param param RequestObjectSignatureValidationEnabled
     */
    public void setRequestObjectSignatureValidationEnabled(boolean param) {

        // setting primitive attribute tracker to true
        localRequestObjectSignatureValidationEnabledTracker =
                true;

        this.localRequestObjectSignatureValidationEnabled = param;


    }


    /**
     * field for ScopeValidators
     * This was an Array!
     */


    protected java.lang.String[] localScopeValidators;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localScopeValidatorsTracker = false;

    public boolean isScopeValidatorsSpecified() {
        return localScopeValidatorsTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getScopeValidators() {
        return localScopeValidators;
    }


    /**
     * validate the array for ScopeValidators
     */
    protected void validateScopeValidators(java.lang.String[] param) {

    }


    /**
     * Auto generated setter method
     * @param param ScopeValidators
     */
    public void setScopeValidators(java.lang.String[] param) {

        validateScopeValidators(param);

        localScopeValidatorsTracker = true;

        this.localScopeValidators = param;
    }


    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addScopeValidators(java.lang.String param) {
        if (localScopeValidators == null) {
            localScopeValidators = new java.lang.String[]{};
        }


        //update the setting tracker
        localScopeValidatorsTracker = true;


        java.util.List list =
                org.apache.axis2.databinding.utils.ConverterUtil.toList(localScopeValidators);
        list.add(param);
        this.localScopeValidators =
                (java.lang.String[]) list.toArray(
                        new java.lang.String[list.size()]);

    }


    /**
     * field for State
     */


    protected java.lang.String localState;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStateTracker = false;

    public boolean isStateSpecified() {
        return localStateTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getState() {
        return localState;
    }


    /**
     * Auto generated setter method
     * @param param State
     */
    public void setState(java.lang.String param) {
        localStateTracker = true;

        this.localState = param;


    }


    /**
     * field for TokenType
     */


    protected java.lang.String localTokenType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTokenTypeTracker = false;

    public boolean isTokenTypeSpecified() {
        return localTokenTypeTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTokenType() {
        return localTokenType;
    }


    /**
     * Auto generated setter method
     * @param param TokenType
     */
    public void setTokenType(java.lang.String param) {
        localTokenTypeTracker = true;

        this.localTokenType = param;


    }


    /**
     * field for UserAccessTokenExpiryTime
     */


    protected long localUserAccessTokenExpiryTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUserAccessTokenExpiryTimeTracker = false;

    public boolean isUserAccessTokenExpiryTimeSpecified() {
        return localUserAccessTokenExpiryTimeTracker;
    }


    /**
     * Auto generated getter method
     * @return long
     */
    public long getUserAccessTokenExpiryTime() {
        return localUserAccessTokenExpiryTime;
    }


    /**
     * Auto generated setter method
     * @param param UserAccessTokenExpiryTime
     */
    public void setUserAccessTokenExpiryTime(long param) {

        // setting primitive attribute tracker to true
        localUserAccessTokenExpiryTimeTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localUserAccessTokenExpiryTime = param;


    }


    /**
     * field for Username
     */


    protected java.lang.String localUsername;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUsernameTracker = false;

    public boolean isUsernameSpecified() {
        return localUsernameTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUsername() {
        return localUsername;
    }


    /**
     * Auto generated setter method
     * @param param Username
     */
    public void setUsername(java.lang.String param) {
        localUsernameTracker = true;

        this.localUsername = param;


    }


    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


        org.apache.axiom.om.OMDataSource dataSource =
                new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
        return factory.createOMElement(dataSource, parentQName);

    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter,
                          boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {


        java.lang.String prefix = null;
        java.lang.String namespace = null;


        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {


            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://dto.oauth.identity.carbon.wso2.org/xsd");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":OAuthConsumerAppDTO",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "OAuthConsumerAppDTO",
                        xmlWriter);
            }


        }
        if (localOAuthVersionTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "OAuthVersion", xmlWriter);


            if (localOAuthVersion == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localOAuthVersion);

            }

            xmlWriter.writeEndElement();
        }
        if (localApplicationAccessTokenExpiryTimeTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "applicationAccessTokenExpiryTime", xmlWriter);

            if (localApplicationAccessTokenExpiryTime == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("applicationAccessTokenExpiryTime cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApplicationAccessTokenExpiryTime));
            }

            xmlWriter.writeEndElement();
        }
        if (localApplicationNameTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "applicationName", xmlWriter);


            if (localApplicationName == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localApplicationName);

            }

            xmlWriter.writeEndElement();
        }
        if (localAudiencesTracker) {
            if (localAudiences != null) {
                namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                for (int i = 0; i < localAudiences.length; i++) {

                    if (localAudiences[i] != null) {

                        writeStartElement(null, namespace, "audiences", xmlWriter);


                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAudiences[i]));

                        xmlWriter.writeEndElement();

                    } else {

                        // write null attribute
                        namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                        writeStartElement(null, namespace, "audiences", xmlWriter);
                        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                // write the null attribute
                // write null attribute
                writeStartElement(null, "http://dto.oauth.identity.carbon.wso2.org/xsd", "audiences", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();

            }

        }
        if (localBackChannelLogoutUrlTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "backChannelLogoutUrl", xmlWriter);


            if (localBackChannelLogoutUrl == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localBackChannelLogoutUrl);

            }

            xmlWriter.writeEndElement();
        }
        if (localBypassClientCredentialsTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "bypassClientCredentials", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("bypassClientCredentials cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBypassClientCredentials));
            }

            xmlWriter.writeEndElement();
        }
        if (localCallbackUrlTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "callbackUrl", xmlWriter);


            if (localCallbackUrl == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localCallbackUrl);

            }

            xmlWriter.writeEndElement();
        }
        if (localFrontchannelLogoutUrlTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "frontchannelLogoutUrl", xmlWriter);


            if (localFrontchannelLogoutUrl == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localFrontchannelLogoutUrl);

            }

            xmlWriter.writeEndElement();
        }
        if (localGrantTypesTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "grantTypes", xmlWriter);


            if (localGrantTypes == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localGrantTypes);

            }

            xmlWriter.writeEndElement();
        }
        if (localIdTokenEncryptionAlgorithmTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "idTokenEncryptionAlgorithm", xmlWriter);


            if (localIdTokenEncryptionAlgorithm == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localIdTokenEncryptionAlgorithm);

            }

            xmlWriter.writeEndElement();
        }
        if (localIdTokenEncryptionEnabledTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "idTokenEncryptionEnabled", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("idTokenEncryptionEnabled cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTokenEncryptionEnabled));
            }

            xmlWriter.writeEndElement();
        }
        if (localIdTokenEncryptionMethodTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "idTokenEncryptionMethod", xmlWriter);


            if (localIdTokenEncryptionMethod == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localIdTokenEncryptionMethod);

            }

            xmlWriter.writeEndElement();
        }
        if (localIdTokenExpiryTimeTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "idTokenExpiryTime", xmlWriter);

            if (localIdTokenExpiryTime == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("idTokenExpiryTime cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTokenExpiryTime));
            }

            xmlWriter.writeEndElement();
        }
        if (localOauthConsumerKeyTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "oauthConsumerKey", xmlWriter);


            if (localOauthConsumerKey == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localOauthConsumerKey);

            }

            xmlWriter.writeEndElement();
        }
        if (localOauthConsumerSecretTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "oauthConsumerSecret", xmlWriter);


            if (localOauthConsumerSecret == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localOauthConsumerSecret);

            }

            xmlWriter.writeEndElement();
        }
        if (localPkceMandatoryTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "pkceMandatory", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("pkceMandatory cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPkceMandatory));
            }

            xmlWriter.writeEndElement();
        }
        if (localPkceSupportPlainTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "pkceSupportPlain", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("pkceSupportPlain cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPkceSupportPlain));
            }

            xmlWriter.writeEndElement();
        }
        if (localRefreshTokenExpiryTimeTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "refreshTokenExpiryTime", xmlWriter);

            if (localRefreshTokenExpiryTime == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("refreshTokenExpiryTime cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRefreshTokenExpiryTime));
            }

            xmlWriter.writeEndElement();
        }
        if (localRenewRefreshTokenEnabledTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "renewRefreshTokenEnabled", xmlWriter);


            if (localRenewRefreshTokenEnabled == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localRenewRefreshTokenEnabled);

            }

            xmlWriter.writeEndElement();
        }
        if (localRequestObjectSignatureValidationEnabledTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "requestObjectSignatureValidationEnabled", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("requestObjectSignatureValidationEnabled cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestObjectSignatureValidationEnabled));
            }

            xmlWriter.writeEndElement();
        }
        if (localScopeValidatorsTracker) {
            if (localScopeValidators != null) {
                namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                for (int i = 0; i < localScopeValidators.length; i++) {

                    if (localScopeValidators[i] != null) {

                        writeStartElement(null, namespace, "scopeValidators", xmlWriter);


                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScopeValidators[i]));

                        xmlWriter.writeEndElement();

                    } else {

                        // write null attribute
                        namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                        writeStartElement(null, namespace, "scopeValidators", xmlWriter);
                        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                // write the null attribute
                // write null attribute
                writeStartElement(null, "http://dto.oauth.identity.carbon.wso2.org/xsd", "scopeValidators", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();

            }

        }
        if (localStateTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "state", xmlWriter);


            if (localState == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localState);

            }

            xmlWriter.writeEndElement();
        }
        if (localTokenTypeTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "tokenType", xmlWriter);


            if (localTokenType == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localTokenType);

            }

            xmlWriter.writeEndElement();
        }
        if (localUserAccessTokenExpiryTimeTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "userAccessTokenExpiryTime", xmlWriter);

            if (localUserAccessTokenExpiryTime == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("userAccessTokenExpiryTime cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserAccessTokenExpiryTime));
            }

            xmlWriter.writeEndElement();
        }
        if (localUsernameTracker) {
            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
            writeStartElement(null, namespace, "username", xmlWriter);


            if (localUsername == null) {
                // write the nil attribute

                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

            } else {


                xmlWriter.writeCharacters(localUsername);

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();


    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://dto.oauth.identity.carbon.wso2.org/xsd")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }


    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname,
                            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
                             javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }


    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }


    /**
     * databinding method to get an XML representation of this object
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {


        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localOAuthVersionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "OAuthVersion"));

            elementList.add(localOAuthVersion == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOAuthVersion));
        }
        if (localApplicationAccessTokenExpiryTimeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "applicationAccessTokenExpiryTime"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApplicationAccessTokenExpiryTime));
        }
        if (localApplicationNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "applicationName"));

            elementList.add(localApplicationName == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApplicationName));
        }
        if (localAudiencesTracker) {
            if (localAudiences != null) {
                for (int i = 0; i < localAudiences.length; i++) {

                    if (localAudiences[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                "audiences"));
                        elementList.add(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAudiences[i]));
                    } else {

                        elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                "audiences"));
                        elementList.add(null);

                    }


                }
            } else {

                elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                        "audiences"));
                elementList.add(null);

            }

        }
        if (localBackChannelLogoutUrlTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "backChannelLogoutUrl"));

            elementList.add(localBackChannelLogoutUrl == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBackChannelLogoutUrl));
        }
        if (localBypassClientCredentialsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "bypassClientCredentials"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBypassClientCredentials));
        }
        if (localCallbackUrlTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "callbackUrl"));

            elementList.add(localCallbackUrl == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallbackUrl));
        }
        if (localFrontchannelLogoutUrlTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "frontchannelLogoutUrl"));

            elementList.add(localFrontchannelLogoutUrl == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFrontchannelLogoutUrl));
        }
        if (localGrantTypesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "grantTypes"));

            elementList.add(localGrantTypes == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGrantTypes));
        }
        if (localIdTokenEncryptionAlgorithmTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "idTokenEncryptionAlgorithm"));

            elementList.add(localIdTokenEncryptionAlgorithm == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTokenEncryptionAlgorithm));
        }
        if (localIdTokenEncryptionEnabledTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "idTokenEncryptionEnabled"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTokenEncryptionEnabled));
        }
        if (localIdTokenEncryptionMethodTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "idTokenEncryptionMethod"));

            elementList.add(localIdTokenEncryptionMethod == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTokenEncryptionMethod));
        }
        if (localIdTokenExpiryTimeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "idTokenExpiryTime"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdTokenExpiryTime));
        }
        if (localOauthConsumerKeyTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "oauthConsumerKey"));

            elementList.add(localOauthConsumerKey == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOauthConsumerKey));
        }
        if (localOauthConsumerSecretTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "oauthConsumerSecret"));

            elementList.add(localOauthConsumerSecret == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOauthConsumerSecret));
        }
        if (localPkceMandatoryTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "pkceMandatory"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPkceMandatory));
        }
        if (localPkceSupportPlainTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "pkceSupportPlain"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPkceSupportPlain));
        }
        if (localRefreshTokenExpiryTimeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "refreshTokenExpiryTime"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRefreshTokenExpiryTime));
        }
        if (localRenewRefreshTokenEnabledTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "renewRefreshTokenEnabled"));

            elementList.add(localRenewRefreshTokenEnabled == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRenewRefreshTokenEnabled));
        }
        if (localRequestObjectSignatureValidationEnabledTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "requestObjectSignatureValidationEnabled"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestObjectSignatureValidationEnabled));
        }
        if (localScopeValidatorsTracker) {
            if (localScopeValidators != null) {
                for (int i = 0; i < localScopeValidators.length; i++) {

                    if (localScopeValidators[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                "scopeValidators"));
                        elementList.add(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScopeValidators[i]));
                    } else {

                        elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                "scopeValidators"));
                        elementList.add(null);

                    }


                }
            } else {

                elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                        "scopeValidators"));
                elementList.add(null);

            }

        }
        if (localStateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "state"));

            elementList.add(localState == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
        }
        if (localTokenTypeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "tokenType"));

            elementList.add(localTokenType == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTokenType));
        }
        if (localUserAccessTokenExpiryTimeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "userAccessTokenExpiryTime"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserAccessTokenExpiryTime));
        }
        if (localUsernameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                    "username"));

            elementList.add(localUsername == null ? null :
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsername));
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


    }


    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {


        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static OAuthConsumerAppDTO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            OAuthConsumerAppDTO object =
                    new OAuthConsumerAppDTO();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();


                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"OAuthConsumerAppDTO".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (OAuthConsumerAppDTO) org.wso2.carbon.identity.oauth.stub.types.axis2.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();

                java.util.ArrayList list4 = new java.util.ArrayList();

                java.util.ArrayList list21 = new java.util.ArrayList();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "OAuthVersion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setOAuthVersion(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "applicationAccessTokenExpiryTime").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "applicationAccessTokenExpiryTime" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setApplicationAccessTokenExpiryTime(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setApplicationAccessTokenExpiryTime(java.lang.Long.MIN_VALUE);

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "applicationName").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setApplicationName(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "audiences").equals(reader.getName())) {


                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        list4.add(null);

                        reader.next();
                    } else {
                        list4.add(reader.getElementText());
                    }
                    //loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;
                    while (!loopDone4) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement() && !reader.isEndElement())
                            reader.next();
                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "audiences").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    list4.add(null);

                                    reader.next();
                                } else {
                                    list4.add(reader.getElementText());
                                }
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }
                    // call the converter utility  to convert and set the array

                    object.setAudiences((java.lang.String[])
                            list4.toArray(new java.lang.String[list4.size()]));

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "backChannelLogoutUrl").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setBackChannelLogoutUrl(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "bypassClientCredentials").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "bypassClientCredentials" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setBypassClientCredentials(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "callbackUrl").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setCallbackUrl(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "frontchannelLogoutUrl").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setFrontchannelLogoutUrl(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "grantTypes").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setGrantTypes(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "idTokenEncryptionAlgorithm").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setIdTokenEncryptionAlgorithm(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "idTokenEncryptionEnabled").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "idTokenEncryptionEnabled" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setIdTokenEncryptionEnabled(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "idTokenEncryptionMethod").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setIdTokenEncryptionMethod(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "idTokenExpiryTime").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "idTokenExpiryTime" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setIdTokenExpiryTime(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setIdTokenExpiryTime(java.lang.Long.MIN_VALUE);

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "oauthConsumerKey").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setOauthConsumerKey(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "oauthConsumerSecret").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setOauthConsumerSecret(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "pkceMandatory").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "pkceMandatory" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setPkceMandatory(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "pkceSupportPlain").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "pkceSupportPlain" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setPkceSupportPlain(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "refreshTokenExpiryTime").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "refreshTokenExpiryTime" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setRefreshTokenExpiryTime(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setRefreshTokenExpiryTime(java.lang.Long.MIN_VALUE);

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "renewRefreshTokenEnabled").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setRenewRefreshTokenEnabled(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "requestObjectSignatureValidationEnabled").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "requestObjectSignatureValidationEnabled" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setRequestObjectSignatureValidationEnabled(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "scopeValidators").equals(reader.getName())) {


                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        list21.add(null);

                        reader.next();
                    } else {
                        list21.add(reader.getElementText());
                    }
                    //loop until we find a start element that is not part of this array
                    boolean loopDone21 = false;
                    while (!loopDone21) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement() && !reader.isEndElement())
                            reader.next();
                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone21 = true;
                        } else {
                            if (new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "scopeValidators").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    list21.add(null);

                                    reader.next();
                                } else {
                                    list21.add(reader.getElementText());
                                }
                            } else {
                                loopDone21 = true;
                            }
                        }
                    }
                    // call the converter utility  to convert and set the array

                    object.setScopeValidators((java.lang.String[])
                            list21.toArray(new java.lang.String[list21.size()]));

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "state").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setState(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "tokenType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setTokenType(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "userAccessTokenExpiryTime").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "userAccessTokenExpiryTime" + "  cannot be null");
                    }


                    java.lang.String content = reader.getElementText();

                    object.setUserAccessTokenExpiryTime(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setUserAccessTokenExpiryTime(java.lang.Long.MIN_VALUE);

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd", "username").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {


                        java.lang.String content = reader.getElementText();

                        object.setUsername(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {


                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }//end of factory class


}
           
    