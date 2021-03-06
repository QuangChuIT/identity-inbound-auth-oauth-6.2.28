
/**
 * OAuthIDTokenAlgorithmDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v38  Built on : Sep 02, 2019 (07:15:19 UTC)
 */

            
                package org.wso2.carbon.identity.oauth.stub.dto;
            

            /**
            *  OAuthIDTokenAlgorithmDTO bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OAuthIDTokenAlgorithmDTO
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OAuthIDTokenAlgorithmDTO
                Namespace URI = http://dto.oauth.identity.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for DefaultIdTokenEncryptionAlgorithm
                        */

                        
                                    protected java.lang.String localDefaultIdTokenEncryptionAlgorithm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultIdTokenEncryptionAlgorithmTracker = false ;

                           public boolean isDefaultIdTokenEncryptionAlgorithmSpecified(){
                               return localDefaultIdTokenEncryptionAlgorithmTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDefaultIdTokenEncryptionAlgorithm(){
                               return localDefaultIdTokenEncryptionAlgorithm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultIdTokenEncryptionAlgorithm
                               */
                               public void setDefaultIdTokenEncryptionAlgorithm(java.lang.String param){
                            localDefaultIdTokenEncryptionAlgorithmTracker = true;
                                   
                                            this.localDefaultIdTokenEncryptionAlgorithm=param;
                                    

                               }
                            

                        /**
                        * field for DefaultIdTokenEncryptionMethod
                        */

                        
                                    protected java.lang.String localDefaultIdTokenEncryptionMethod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultIdTokenEncryptionMethodTracker = false ;

                           public boolean isDefaultIdTokenEncryptionMethodSpecified(){
                               return localDefaultIdTokenEncryptionMethodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDefaultIdTokenEncryptionMethod(){
                               return localDefaultIdTokenEncryptionMethod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultIdTokenEncryptionMethod
                               */
                               public void setDefaultIdTokenEncryptionMethod(java.lang.String param){
                            localDefaultIdTokenEncryptionMethodTracker = true;
                                   
                                            this.localDefaultIdTokenEncryptionMethod=param;
                                    

                               }
                            

                        /**
                        * field for SupportedIdTokenEncryptionAlgorithms
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localSupportedIdTokenEncryptionAlgorithms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSupportedIdTokenEncryptionAlgorithmsTracker = false ;

                           public boolean isSupportedIdTokenEncryptionAlgorithmsSpecified(){
                               return localSupportedIdTokenEncryptionAlgorithmsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getSupportedIdTokenEncryptionAlgorithms(){
                               return localSupportedIdTokenEncryptionAlgorithms;
                           }

                           
                        


                               
                              /**
                               * validate the array for SupportedIdTokenEncryptionAlgorithms
                               */
                              protected void validateSupportedIdTokenEncryptionAlgorithms(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SupportedIdTokenEncryptionAlgorithms
                              */
                              public void setSupportedIdTokenEncryptionAlgorithms(java.lang.String[] param){
                              
                                   validateSupportedIdTokenEncryptionAlgorithms(param);

                               localSupportedIdTokenEncryptionAlgorithmsTracker = true;
                                      
                                      this.localSupportedIdTokenEncryptionAlgorithms=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addSupportedIdTokenEncryptionAlgorithms(java.lang.String param){
                                   if (localSupportedIdTokenEncryptionAlgorithms == null){
                                   localSupportedIdTokenEncryptionAlgorithms = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localSupportedIdTokenEncryptionAlgorithmsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSupportedIdTokenEncryptionAlgorithms);
                               list.add(param);
                               this.localSupportedIdTokenEncryptionAlgorithms =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for SupportedIdTokenEncryptionMethods
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localSupportedIdTokenEncryptionMethods ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSupportedIdTokenEncryptionMethodsTracker = false ;

                           public boolean isSupportedIdTokenEncryptionMethodsSpecified(){
                               return localSupportedIdTokenEncryptionMethodsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getSupportedIdTokenEncryptionMethods(){
                               return localSupportedIdTokenEncryptionMethods;
                           }

                           
                        


                               
                              /**
                               * validate the array for SupportedIdTokenEncryptionMethods
                               */
                              protected void validateSupportedIdTokenEncryptionMethods(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SupportedIdTokenEncryptionMethods
                              */
                              public void setSupportedIdTokenEncryptionMethods(java.lang.String[] param){
                              
                                   validateSupportedIdTokenEncryptionMethods(param);

                               localSupportedIdTokenEncryptionMethodsTracker = true;
                                      
                                      this.localSupportedIdTokenEncryptionMethods=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addSupportedIdTokenEncryptionMethods(java.lang.String param){
                                   if (localSupportedIdTokenEncryptionMethods == null){
                                   localSupportedIdTokenEncryptionMethods = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localSupportedIdTokenEncryptionMethodsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSupportedIdTokenEncryptionMethods);
                               list.add(param);
                               this.localSupportedIdTokenEncryptionMethods =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://dto.oauth.identity.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":OAuthIDTokenAlgorithmDTO",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "OAuthIDTokenAlgorithmDTO",
                           xmlWriter);
                   }

               
                   }
                if (localDefaultIdTokenEncryptionAlgorithmTracker){
                                    namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "defaultIdTokenEncryptionAlgorithm", xmlWriter);
                             

                                          if (localDefaultIdTokenEncryptionAlgorithm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDefaultIdTokenEncryptionAlgorithm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDefaultIdTokenEncryptionMethodTracker){
                                    namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "defaultIdTokenEncryptionMethod", xmlWriter);
                             

                                          if (localDefaultIdTokenEncryptionMethod==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDefaultIdTokenEncryptionMethod);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSupportedIdTokenEncryptionAlgorithmsTracker){
                             if (localSupportedIdTokenEncryptionAlgorithms!=null) {
                                   namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localSupportedIdTokenEncryptionAlgorithms.length;i++){
                                        
                                            if (localSupportedIdTokenEncryptionAlgorithms[i] != null){
                                        
                                                writeStartElement(null, namespace, "supportedIdTokenEncryptionAlgorithms", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupportedIdTokenEncryptionAlgorithms[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "supportedIdTokenEncryptionAlgorithms", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://dto.oauth.identity.carbon.wso2.org/xsd", "supportedIdTokenEncryptionAlgorithms", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localSupportedIdTokenEncryptionMethodsTracker){
                             if (localSupportedIdTokenEncryptionMethods!=null) {
                                   namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localSupportedIdTokenEncryptionMethods.length;i++){
                                        
                                            if (localSupportedIdTokenEncryptionMethods[i] != null){
                                        
                                                writeStartElement(null, namespace, "supportedIdTokenEncryptionMethods", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupportedIdTokenEncryptionMethods[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://dto.oauth.identity.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "supportedIdTokenEncryptionMethods", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://dto.oauth.identity.carbon.wso2.org/xsd", "supportedIdTokenEncryptionMethods", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://dto.oauth.identity.carbon.wso2.org/xsd")){
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
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
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
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
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
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localDefaultIdTokenEncryptionAlgorithmTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                      "defaultIdTokenEncryptionAlgorithm"));
                                 
                                         elementList.add(localDefaultIdTokenEncryptionAlgorithm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultIdTokenEncryptionAlgorithm));
                                    } if (localDefaultIdTokenEncryptionMethodTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                      "defaultIdTokenEncryptionMethod"));
                                 
                                         elementList.add(localDefaultIdTokenEncryptionMethod==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultIdTokenEncryptionMethod));
                                    } if (localSupportedIdTokenEncryptionAlgorithmsTracker){
                            if (localSupportedIdTokenEncryptionAlgorithms!=null){
                                  for (int i = 0;i < localSupportedIdTokenEncryptionAlgorithms.length;i++){
                                      
                                         if (localSupportedIdTokenEncryptionAlgorithms[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                              "supportedIdTokenEncryptionAlgorithms"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupportedIdTokenEncryptionAlgorithms[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                              "supportedIdTokenEncryptionAlgorithms"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                              "supportedIdTokenEncryptionAlgorithms"));
                                    elementList.add(null);
                                
                            }

                        } if (localSupportedIdTokenEncryptionMethodsTracker){
                            if (localSupportedIdTokenEncryptionMethods!=null){
                                  for (int i = 0;i < localSupportedIdTokenEncryptionMethods.length;i++){
                                      
                                         if (localSupportedIdTokenEncryptionMethods[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                              "supportedIdTokenEncryptionMethods"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupportedIdTokenEncryptionMethods[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                              "supportedIdTokenEncryptionMethods"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd",
                                                                              "supportedIdTokenEncryptionMethods"));
                                    elementList.add(null);
                                
                            }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static OAuthIDTokenAlgorithmDTO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OAuthIDTokenAlgorithmDTO object =
                new OAuthIDTokenAlgorithmDTO();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"OAuthIDTokenAlgorithmDTO".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OAuthIDTokenAlgorithmDTO)org.wso2.carbon.identity.oauth.stub.types.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd","defaultIdTokenEncryptionAlgorithm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultIdTokenEncryptionAlgorithm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd","defaultIdTokenEncryptionMethod").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultIdTokenEncryptionMethod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd","supportedIdTokenEncryptionAlgorithms").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list3.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list3.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd","supportedIdTokenEncryptionAlgorithms").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list3.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setSupportedIdTokenEncryptionAlgorithms((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd","supportedIdTokenEncryptionMethods").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list4.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list4.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone4 = false;
                                            while(!loopDone4){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone4 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://dto.oauth.identity.carbon.wso2.org/xsd","supportedIdTokenEncryptionMethods").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list4.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list4.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setSupportedIdTokenEncryptionMethods((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
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
           
    