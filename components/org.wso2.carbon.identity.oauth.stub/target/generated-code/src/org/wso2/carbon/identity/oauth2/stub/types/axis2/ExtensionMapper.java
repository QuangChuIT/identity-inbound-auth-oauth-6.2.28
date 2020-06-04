
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:19 UTC)
 */

        
            package org.wso2.carbon.identity.oauth2.stub.types.axis2;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dto.oauth2.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OAuth2ClientApplicationDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.oauth2.stub.dto.OAuth2ClientApplicationDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.oauth2.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OAuth2TokenValidationRequestDTO_OAuth2AccessToken".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO_OAuth2AccessToken.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.oauth2.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OAuth2TokenValidationResponseDTO_AuthorizationContextToken".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationResponseDTO_AuthorizationContextToken.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.oauth2.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OAuth2IntrospectionResponseDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.oauth2.stub.dto.OAuth2IntrospectionResponseDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.oauth2.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OAuth2TokenValidationRequestDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.oauth2.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OAuth2TokenValidationRequestDTO_TokenValidationContextParam".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO_TokenValidationContextParam.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.oauth2.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OAuth2TokenValidationResponseDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationResponseDTO.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    