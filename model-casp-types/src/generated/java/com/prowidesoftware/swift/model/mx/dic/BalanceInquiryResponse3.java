
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Balance Inquiry Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryResponse3", propOrder = {
    "pmtAcct",
    "lltyAcct",
    "stordValAcct",
    "rct"
})
public class BalanceInquiryResponse3 {

    @XmlElement(name = "PmtAcct")
    protected PaymentAccount3 pmtAcct;
    @XmlElement(name = "LltyAcct")
    protected LoyaltyAccount2 lltyAcct;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "Rct")
    protected List<PaymentReceipt3> rct;

    /**
     * Gets the value of the pmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAccount3 }
     *     
     */
    public PaymentAccount3 getPmtAcct() {
        return pmtAcct;
    }

    /**
     * Sets the value of the pmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAccount3 }
     *     
     */
    public BalanceInquiryResponse3 setPmtAcct(PaymentAccount3 value) {
        this.pmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccount2 }
     *     
     */
    public LoyaltyAccount2 getLltyAcct() {
        return lltyAcct;
    }

    /**
     * Sets the value of the lltyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccount2 }
     *     
     */
    public BalanceInquiryResponse3 setLltyAcct(LoyaltyAccount2 value) {
        this.lltyAcct = value;
        return this;
    }

    /**
     * Gets the value of the stordValAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stordValAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordValAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueAccount2 }
     * 
     * 
     */
    public List<StoredValueAccount2> getStordValAcct() {
        if (stordValAcct == null) {
            stordValAcct = new ArrayList<StoredValueAccount2>();
        }
        return this.stordValAcct;
    }

    /**
     * Gets the value of the rct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt3 }
     * 
     * 
     */
    public List<PaymentReceipt3> getRct() {
        if (rct == null) {
            rct = new ArrayList<PaymentReceipt3>();
        }
        return this.rct;
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
     * Adds a new item to the stordValAcct list.
     * @see #getStordValAcct()
     * 
     */
    public BalanceInquiryResponse3 addStordValAcct(StoredValueAccount2 stordValAcct) {
        getStordValAcct().add(stordValAcct);
        return this;
    }

    /**
     * Adds a new item to the rct list.
     * @see #getRct()
     * 
     */
    public BalanceInquiryResponse3 addRct(PaymentReceipt3 rct) {
        getRct().add(rct);
        return this;
    }

}