
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
 * Specifies the amount for a digital token identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalTokenAmount1", propOrder = {
    "idr",
    "unit",
    "desc"
})
public class DigitalTokenAmount1 {

    @XmlElement(name = "Idr")
    protected String idr;
    @XmlElement(name = "Unit", required = true)
    protected BigDecimal unit;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DigitalTokenAmount1 setIdr(String value) {
        this.idr = value;
        return this;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DigitalTokenAmount1 setUnit(BigDecimal value) {
        this.unit = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DigitalTokenAmount1 setDesc(String value) {
        this.desc = value;
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
