
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Data common to all transactions of a data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonData13", propOrder = {
    "envt",
    "cntxt",
    "txTp",
    "addtlSvc",
    "svcAttr",
    "mrchntCtgyCd",
    "rcncltnId",
    "ccy"
})
public class CommonData13 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment80 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType14Code svcAttr;
    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public CardPaymentEnvironment80 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public CommonData13 setEnvt(CardPaymentEnvironment80 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public CardPaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public CommonData13 setCntxt(CardPaymentContext30 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CardPaymentServiceType12Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CommonData13 setTxTp(CardPaymentServiceType12Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentServiceType9Code }
     * 
     * 
     */
    public List<CardPaymentServiceType9Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<CardPaymentServiceType9Code>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public CardPaymentServiceType14Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public CommonData13 setSvcAttr(CardPaymentServiceType14Code value) {
        this.svcAttr = value;
        return this;
    }

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonData13 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonData13 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonData13 setCcy(String value) {
        this.ccy = value;
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
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public CommonData13 addAddtlSvc(CardPaymentServiceType9Code addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

}