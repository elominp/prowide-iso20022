
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Execution of a subscription order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionMultipleExecution3", propOrder = {
    "mstrRef",
    "plcOfTrad",
    "ordrDtTm",
    "reqdFutrTradDt",
    "cxlRght",
    "xtndedCxlRght",
    "invstmtAcctDtls",
    "bnfcryDtls",
    "indvExctnDtls",
    "ttlSttlmAmt",
    "cshSttlmDt",
    "blkCshSttlmDtls"
})
public class SubscriptionMultipleExecution3 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1Choice plcOfTrad;
    @XmlElement(name = "OrdrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ordrDtTm;
    @XmlElement(name = "ReqdFutrTradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdFutrTradDt;
    @XmlElement(name = "CxlRght")
    @XmlSchemaType(name = "string")
    protected CancellationRight1Code cxlRght;
    @XmlElement(name = "XtndedCxlRght")
    protected String xtndedCxlRght;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount21 invstmtAcctDtls;
    @XmlElement(name = "BnfcryDtls")
    protected IndividualPerson12 bnfcryDtls;
    @XmlElement(name = "IndvExctnDtls", required = true)
    protected List<SubscriptionExecution6> indvExctnDtls;
    @XmlElement(name = "TtlSttlmAmt")
    protected ActiveCurrencyAndAmount ttlSttlmAmt;
    @XmlElement(name = "CshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate cshSttlmDt;
    @XmlElement(name = "BlkCshSttlmDtls")
    protected PaymentTransaction24 blkCshSttlmDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleExecution3 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public PlaceOfTradeIdentification1Choice getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public SubscriptionMultipleExecution3 setPlcOfTrad(PlaceOfTradeIdentification1Choice value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleExecution3 setOrdrDtTm(OffsetDateTime value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the reqdFutrTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdFutrTradDt() {
        return reqdFutrTradDt;
    }

    /**
     * Sets the value of the reqdFutrTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleExecution3 setReqdFutrTradDt(LocalDate value) {
        this.reqdFutrTradDt = value;
        return this;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1Code }
     *     
     */
    public CancellationRight1Code getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1Code }
     *     
     */
    public SubscriptionMultipleExecution3 setCxlRght(CancellationRight1Code value) {
        this.cxlRght = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCxlRght() {
        return xtndedCxlRght;
    }

    /**
     * Sets the value of the xtndedCxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleExecution3 setXtndedCxlRght(String value) {
        this.xtndedCxlRght = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount21 }
     *     
     */
    public InvestmentAccount21 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount21 }
     *     
     */
    public SubscriptionMultipleExecution3 setInvstmtAcctDtls(InvestmentAccount21 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson12 }
     *     
     */
    public IndividualPerson12 getBnfcryDtls() {
        return bnfcryDtls;
    }

    /**
     * Sets the value of the bnfcryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson12 }
     *     
     */
    public SubscriptionMultipleExecution3 setBnfcryDtls(IndividualPerson12 value) {
        this.bnfcryDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvExctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvExctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvExctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionExecution6 }
     * 
     * 
     * @return
     *     The value of the indvExctnDtls property.
     */
    public List<SubscriptionExecution6> getIndvExctnDtls() {
        if (indvExctnDtls == null) {
            indvExctnDtls = new ArrayList<>();
        }
        return this.indvExctnDtls;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionMultipleExecution3 setTtlSttlmAmt(ActiveCurrencyAndAmount value) {
        this.ttlSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleExecution3 setCshSttlmDt(LocalDate value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the blkCshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction24 }
     *     
     */
    public PaymentTransaction24 getBlkCshSttlmDtls() {
        return blkCshSttlmDtls;
    }

    /**
     * Sets the value of the blkCshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction24 }
     *     
     */
    public SubscriptionMultipleExecution3 setBlkCshSttlmDtls(PaymentTransaction24 value) {
        this.blkCshSttlmDtls = value;
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
     * Adds a new item to the indvExctnDtls list.
     * @see #getIndvExctnDtls()
     * 
     */
    public SubscriptionMultipleExecution3 addIndvExctnDtls(SubscriptionExecution6 indvExctnDtls) {
        getIndvExctnDtls().add(indvExctnDtls);
        return this;
    }

}
