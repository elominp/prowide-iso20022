
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the context when the event occured.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventContext6", propOrder = {
    "svcTp",
    "cmpntId",
    "saleId"
})
public class EventContext6 {

    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService1Code svcTp;
    @XmlElement(name = "CmpntId")
    protected PointOfInteractionComponent15 cmpntId;
    @XmlElement(name = "SaleId")
    protected String saleId;

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService1Code }
     *     
     */
    public RetailerService1Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService1Code }
     *     
     */
    public EventContext6 setSvcTp(RetailerService1Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the cmpntId property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponent15 }
     *     
     */
    public PointOfInteractionComponent15 getCmpntId() {
        return cmpntId;
    }

    /**
     * Sets the value of the cmpntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponent15 }
     *     
     */
    public EventContext6 setCmpntId(PointOfInteractionComponent15 value) {
        this.cmpntId = value;
        return this;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventContext6 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
