
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data to request to enable a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnableServiceRequest6", propOrder = {
    "txActn",
    "svcsNbld",
    "dispOutpt"
})
public class EnableServiceRequest6 {

    @XmlElement(name = "TxActn", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionAction1Code txActn;
    @XmlElement(name = "SvcsNbld")
    @XmlSchemaType(name = "string")
    protected RetailerService2Code svcsNbld;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage11 dispOutpt;

    /**
     * Gets the value of the txActn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAction1Code }
     *     
     */
    public TransactionAction1Code getTxActn() {
        return txActn;
    }

    /**
     * Sets the value of the txActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAction1Code }
     *     
     */
    public EnableServiceRequest6 setTxActn(TransactionAction1Code value) {
        this.txActn = value;
        return this;
    }

    /**
     * Gets the value of the svcsNbld property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService2Code }
     *     
     */
    public RetailerService2Code getSvcsNbld() {
        return svcsNbld;
    }

    /**
     * Sets the value of the svcsNbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService2Code }
     *     
     */
    public EnableServiceRequest6 setSvcsNbld(RetailerService2Code value) {
        this.svcsNbld = value;
        return this;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage11 }
     *     
     */
    public ActionMessage11 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage11 }
     *     
     */
    public EnableServiceRequest6 setDispOutpt(ActionMessage11 value) {
        this.dispOutpt = value;
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