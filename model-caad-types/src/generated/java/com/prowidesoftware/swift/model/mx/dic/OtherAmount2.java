
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Other amount in clearing record data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmount2", propOrder = {
    "clrCnt",
    "clrAmt",
    "intrchngFee",
    "agtFee"
})
public class OtherAmount2 {

    @XmlElement(name = "ClrCnt", required = true)
    protected BigDecimal clrCnt;
    @XmlElement(name = "ClrAmt", required = true)
    protected Amount14 clrAmt;
    @XmlElement(name = "IntrchngFee")
    protected Amount14 intrchngFee;
    @XmlElement(name = "AgtFee")
    protected Amount14 agtFee;

    /**
     * Gets the value of the clrCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrCnt() {
        return clrCnt;
    }

    /**
     * Sets the value of the clrCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherAmount2 setClrCnt(BigDecimal value) {
        this.clrCnt = value;
        return this;
    }

    /**
     * Gets the value of the clrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getClrAmt() {
        return clrAmt;
    }

    /**
     * Sets the value of the clrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public OtherAmount2 setClrAmt(Amount14 value) {
        this.clrAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getIntrchngFee() {
        return intrchngFee;
    }

    /**
     * Sets the value of the intrchngFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public OtherAmount2 setIntrchngFee(Amount14 value) {
        this.intrchngFee = value;
        return this;
    }

    /**
     * Gets the value of the agtFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getAgtFee() {
        return agtFee;
    }

    /**
     * Sets the value of the agtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public OtherAmount2 setAgtFee(Amount14 value) {
        this.agtFee = value;
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
