
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
 * Choice between a percentage price or an amount price or an unspecified price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFormat31Choice", propOrder = {
    "amtPric",
    "notSpcfdPric"
})
public class PriceFormat31Choice {

    @XmlElement(name = "AmtPric")
    protected AmountPrice4 amtPric;
    @XmlElement(name = "NotSpcfdPric")
    @XmlSchemaType(name = "string")
    protected PriceValueType10Code notSpcfdPric;

    /**
     * Gets the value of the amtPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice4 }
     *     
     */
    public AmountPrice4 getAmtPric() {
        return amtPric;
    }

    /**
     * Sets the value of the amtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice4 }
     *     
     */
    public PriceFormat31Choice setAmtPric(AmountPrice4 value) {
        this.amtPric = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfdPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType10Code }
     *     
     */
    public PriceValueType10Code getNotSpcfdPric() {
        return notSpcfdPric;
    }

    /**
     * Sets the value of the notSpcfdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType10Code }
     *     
     */
    public PriceFormat31Choice setNotSpcfdPric(PriceValueType10Code value) {
        this.notSpcfdPric = value;
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
