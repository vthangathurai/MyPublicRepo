//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.01 at 03:29:57 AM GMT-08:00 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="xml-type-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="java-type-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeInformationType")
public class TypeInformationType {

    @XmlAttribute(name = "xml-type-name", required = true)
    protected String xmlTypeName;
    @XmlAttribute(name = "java-type-name", required = true)
    protected String javaTypeName;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the xmlTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlTypeName() {
        return xmlTypeName;
    }

    /**
     * Sets the value of the xmlTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlTypeName(String value) {
        this.xmlTypeName = value;
    }

    /**
     * Gets the value of the javaTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaTypeName() {
        return javaTypeName;
    }

    /**
     * Sets the value of the javaTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaTypeName(String value) {
        this.javaTypeName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
