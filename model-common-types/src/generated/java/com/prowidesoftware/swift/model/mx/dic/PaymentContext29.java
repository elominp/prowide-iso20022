
package com.prowidesoftware.swift.model.mx.dic;

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
 * Payment context in which the transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentContext29", propOrder = {
    "cardPres",
    "crdhldrPres",
    "onLineCntxt",
    "attndncCntxt",
    "txEnvt",
    "txChanl",
    "bizArea",
    "attndntMsgCpbl",
    "attndntLang",
    "cardDataNtryMd",
    "fllbckInd",
    "spprtdOptn"
})
public class PaymentContext29 {

    @XmlElement(name = "CardPres")
    protected Boolean cardPres;
    @XmlElement(name = "CrdhldrPres")
    protected Boolean crdhldrPres;
    @XmlElement(name = "OnLineCntxt")
    protected Boolean onLineCntxt;
    @XmlElement(name = "AttndncCntxt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "TxEnvt")
    @XmlSchemaType(name = "string")
    protected TransactionEnvironment1Code txEnvt;
    @XmlElement(name = "TxChanl")
    @XmlSchemaType(name = "string")
    protected TransactionChannel5Code txChanl;
    @XmlElement(name = "BizArea")
    @XmlSchemaType(name = "string")
    protected BusinessArea2Code bizArea;
    @XmlElement(name = "AttndntMsgCpbl")
    protected Boolean attndntMsgCpbl;
    @XmlElement(name = "AttndntLang")
    protected String attndntLang;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code cardDataNtryMd;
    @XmlElement(name = "FllbckInd")
    @XmlSchemaType(name = "string")
    protected CardFallback1Code fllbckInd;
    @XmlElement(name = "SpprtdOptn")
    @XmlSchemaType(name = "string")
    protected List<SupportedPaymentOption2Code> spprtdOptn;

    /**
     * Gets the value of the cardPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardPres() {
        return cardPres;
    }

    /**
     * Sets the value of the cardPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentContext29 setCardPres(Boolean value) {
        this.cardPres = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrPres() {
        return crdhldrPres;
    }

    /**
     * Sets the value of the crdhldrPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentContext29 setCrdhldrPres(Boolean value) {
        this.crdhldrPres = value;
        return this;
    }

    /**
     * Gets the value of the onLineCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnLineCntxt() {
        return onLineCntxt;
    }

    /**
     * Sets the value of the onLineCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentContext29 setOnLineCntxt(Boolean value) {
        this.onLineCntxt = value;
        return this;
    }

    /**
     * Gets the value of the attndncCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public AttendanceContext1Code getAttndncCntxt() {
        return attndncCntxt;
    }

    /**
     * Sets the value of the attndncCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public PaymentContext29 setAttndncCntxt(AttendanceContext1Code value) {
        this.attndncCntxt = value;
        return this;
    }

    /**
     * Gets the value of the txEnvt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnvironment1Code }
     *     
     */
    public TransactionEnvironment1Code getTxEnvt() {
        return txEnvt;
    }

    /**
     * Sets the value of the txEnvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment1Code }
     *     
     */
    public PaymentContext29 setTxEnvt(TransactionEnvironment1Code value) {
        this.txEnvt = value;
        return this;
    }

    /**
     * Gets the value of the txChanl property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionChannel5Code }
     *     
     */
    public TransactionChannel5Code getTxChanl() {
        return txChanl;
    }

    /**
     * Sets the value of the txChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionChannel5Code }
     *     
     */
    public PaymentContext29 setTxChanl(TransactionChannel5Code value) {
        this.txChanl = value;
        return this;
    }

    /**
     * Gets the value of the bizArea property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessArea2Code }
     *     
     */
    public BusinessArea2Code getBizArea() {
        return bizArea;
    }

    /**
     * Sets the value of the bizArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessArea2Code }
     *     
     */
    public PaymentContext29 setBizArea(BusinessArea2Code value) {
        this.bizArea = value;
        return this;
    }

    /**
     * Gets the value of the attndntMsgCpbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttndntMsgCpbl() {
        return attndntMsgCpbl;
    }

    /**
     * Sets the value of the attndntMsgCpbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentContext29 setAttndntMsgCpbl(Boolean value) {
        this.attndntMsgCpbl = value;
        return this;
    }

    /**
     * Gets the value of the attndntLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndntLang() {
        return attndntLang;
    }

    /**
     * Sets the value of the attndntLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentContext29 setAttndntLang(String value) {
        this.attndntLang = value;
        return this;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public PaymentContext29 setCardDataNtryMd(CardDataReading8Code value) {
        this.cardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the fllbckInd property.
     * 
     * @return
     *     possible object is
     *     {@link CardFallback1Code }
     *     
     */
    public CardFallback1Code getFllbckInd() {
        return fllbckInd;
    }

    /**
     * Sets the value of the fllbckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFallback1Code }
     *     
     */
    public PaymentContext29 setFllbckInd(CardFallback1Code value) {
        this.fllbckInd = value;
        return this;
    }

    /**
     * Gets the value of the spprtdOptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spprtdOptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpprtdOptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedPaymentOption2Code }
     * 
     * 
     * @return
     *     The value of the spprtdOptn property.
     */
    public List<SupportedPaymentOption2Code> getSpprtdOptn() {
        if (spprtdOptn == null) {
            spprtdOptn = new ArrayList<>();
        }
        return this.spprtdOptn;
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
     * Adds a new item to the spprtdOptn list.
     * @see #getSpprtdOptn()
     * 
     */
    public PaymentContext29 addSpprtdOptn(SupportedPaymentOption2Code spprtdOptn) {
        getSpprtdOptn().add(spprtdOptn);
        return this;
    }

}
