
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
 * This component defines the service to be called.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest3", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "pmtReq",
    "rvslReq",
    "balNqryReq",
    "lltyReq",
    "stordValReq",
    "btchReq",
    "nblSvcReq",
    "cardAcqstnReq",
    "splmtryData"
})
public class ServiceRequest3 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment75 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext28 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService2Code svcCntt;
    @XmlElement(name = "PmtReq")
    protected PaymentRequest2 pmtReq;
    @XmlElement(name = "RvslReq")
    protected ReversalRequest2 rvslReq;
    @XmlElement(name = "BalNqryReq")
    protected BalanceInquiryRequest3 balNqryReq;
    @XmlElement(name = "LltyReq")
    protected LoyaltyRequest2 lltyReq;
    @XmlElement(name = "StordValReq")
    protected StoredValueRequest3 stordValReq;
    @XmlElement(name = "BtchReq")
    protected BatchRequest2 btchReq;
    @XmlElement(name = "NblSvcReq")
    protected EnableServiceRequest2 nblSvcReq;
    @XmlElement(name = "CardAcqstnReq")
    protected CardAcquisitionRequest2 cardAcqstnReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public CardPaymentEnvironment75 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public ServiceRequest3 setEnvt(CardPaymentEnvironment75 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public CardPaymentContext28 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public ServiceRequest3 setCntxt(CardPaymentContext28 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService2Code }
     *     
     */
    public RetailerService2Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService2Code }
     *     
     */
    public ServiceRequest3 setSvcCntt(RetailerService2Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the pmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest2 }
     *     
     */
    public PaymentRequest2 getPmtReq() {
        return pmtReq;
    }

    /**
     * Sets the value of the pmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest2 }
     *     
     */
    public ServiceRequest3 setPmtReq(PaymentRequest2 value) {
        this.pmtReq = value;
        return this;
    }

    /**
     * Gets the value of the rvslReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalRequest2 }
     *     
     */
    public ReversalRequest2 getRvslReq() {
        return rvslReq;
    }

    /**
     * Sets the value of the rvslReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalRequest2 }
     *     
     */
    public ServiceRequest3 setRvslReq(ReversalRequest2 value) {
        this.rvslReq = value;
        return this;
    }

    /**
     * Gets the value of the balNqryReq property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryRequest3 }
     *     
     */
    public BalanceInquiryRequest3 getBalNqryReq() {
        return balNqryReq;
    }

    /**
     * Sets the value of the balNqryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryRequest3 }
     *     
     */
    public ServiceRequest3 setBalNqryReq(BalanceInquiryRequest3 value) {
        this.balNqryReq = value;
        return this;
    }

    /**
     * Gets the value of the lltyReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRequest2 }
     *     
     */
    public LoyaltyRequest2 getLltyReq() {
        return lltyReq;
    }

    /**
     * Sets the value of the lltyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequest2 }
     *     
     */
    public ServiceRequest3 setLltyReq(LoyaltyRequest2 value) {
        this.lltyReq = value;
        return this;
    }

    /**
     * Gets the value of the stordValReq property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueRequest3 }
     *     
     */
    public StoredValueRequest3 getStordValReq() {
        return stordValReq;
    }

    /**
     * Sets the value of the stordValReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueRequest3 }
     *     
     */
    public ServiceRequest3 setStordValReq(StoredValueRequest3 value) {
        this.stordValReq = value;
        return this;
    }

    /**
     * Gets the value of the btchReq property.
     * 
     * @return
     *     possible object is
     *     {@link BatchRequest2 }
     *     
     */
    public BatchRequest2 getBtchReq() {
        return btchReq;
    }

    /**
     * Sets the value of the btchReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchRequest2 }
     *     
     */
    public ServiceRequest3 setBtchReq(BatchRequest2 value) {
        this.btchReq = value;
        return this;
    }

    /**
     * Gets the value of the nblSvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link EnableServiceRequest2 }
     *     
     */
    public EnableServiceRequest2 getNblSvcReq() {
        return nblSvcReq;
    }

    /**
     * Sets the value of the nblSvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableServiceRequest2 }
     *     
     */
    public ServiceRequest3 setNblSvcReq(EnableServiceRequest2 value) {
        this.nblSvcReq = value;
        return this;
    }

    /**
     * Gets the value of the cardAcqstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionRequest2 }
     *     
     */
    public CardAcquisitionRequest2 getCardAcqstnReq() {
        return cardAcqstnReq;
    }

    /**
     * Sets the value of the cardAcqstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionRequest2 }
     *     
     */
    public ServiceRequest3 setCardAcqstnReq(CardAcquisitionRequest2 value) {
        this.cardAcqstnReq = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ServiceRequest3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}