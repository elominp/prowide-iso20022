
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Configuration parameters of data exchanges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeConfiguration2", propOrder = {
    "xchgPlcy",
    "maxNb",
    "maxAmt",
    "tmCond"
})
public class ExchangeConfiguration2 {

    @XmlElement(name = "XchgPlcy", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExchangePolicy1Code> xchgPlcy;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlElement(name = "TmCond")
    protected ProcessTiming2 tmCond;

    /**
     * Gets the value of the xchgPlcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xchgPlcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgPlcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangePolicy1Code }
     * 
     * 
     * @return
     *     The value of the xchgPlcy property.
     */
    public List<ExchangePolicy1Code> getXchgPlcy() {
        if (xchgPlcy == null) {
            xchgPlcy = new ArrayList<>();
        }
        return this.xchgPlcy;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExchangeConfiguration2 setMaxNb(BigDecimal value) {
        this.maxNb = value;
        return this;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExchangeConfiguration2 setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
        return this;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming2 }
     *     
     */
    public ProcessTiming2 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming2 }
     *     
     */
    public ExchangeConfiguration2 setTmCond(ProcessTiming2 value) {
        this.tmCond = value;
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

    /**
     * Adds a new item to the xchgPlcy list.
     * @see #getXchgPlcy()
     * 
     */
    public ExchangeConfiguration2 addXchgPlcy(ExchangePolicy1Code xchgPlcy) {
        getXchgPlcy().add(xchgPlcy);
        return this;
    }

}
