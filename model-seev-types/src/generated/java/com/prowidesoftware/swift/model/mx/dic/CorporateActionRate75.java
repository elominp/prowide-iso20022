
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies rate details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate75", propOrder = {
    "addtlQtyForSbcbdRsltntScties",
    "addtlQtyForExstgScties",
    "newToOd",
    "chrgsFees",
    "fsclStmp",
    "aplblRate",
    "taxCdtRate",
    "finTxTaxRate"
})
public class CorporateActionRate75 {

    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat21Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat21Choice addtlQtyForExstgScties;
    @XmlElement(name = "NewToOd")
    protected RatioFormat22Choice newToOd;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat43Choice chrgsFees;
    @XmlElement(name = "FsclStmp")
    protected BigDecimal fsclStmp;
    @XmlElement(name = "AplblRate")
    protected BigDecimal aplblRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat9Choice> taxCdtRate;
    @XmlElement(name = "FinTxTaxRate")
    protected BigDecimal finTxTaxRate;

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public RatioFormat21Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public CorporateActionRate75 setAddtlQtyForSbcbdRsltntScties(RatioFormat21Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public RatioFormat21Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public CorporateActionRate75 setAddtlQtyForExstgScties(RatioFormat21Choice value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat22Choice }
     *     
     */
    public RatioFormat22Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat22Choice }
     *     
     */
    public CorporateActionRate75 setNewToOd(RatioFormat22Choice value) {
        this.newToOd = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public CorporateActionRate75 setChrgsFees(RateAndAmountFormat43Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate75 setFsclStmp(BigDecimal value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate75 setAplblRate(BigDecimal value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxCdtRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCdtRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCreditRateFormat9Choice }
     * 
     * 
     * @return
     *     The value of the taxCdtRate property.
     */
    public List<TaxCreditRateFormat9Choice> getTaxCdtRate() {
        if (taxCdtRate == null) {
            taxCdtRate = new ArrayList<>();
        }
        return this.taxCdtRate;
    }

    /**
     * Gets the value of the finTxTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinTxTaxRate() {
        return finTxTaxRate;
    }

    /**
     * Sets the value of the finTxTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate75 setFinTxTaxRate(BigDecimal value) {
        this.finTxTaxRate = value;
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
     * Adds a new item to the taxCdtRate list.
     * @see #getTaxCdtRate()
     * 
     */
    public CorporateActionRate75 addTaxCdtRate(TaxCreditRateFormat9Choice taxCdtRate) {
        getTaxCdtRate().add(taxCdtRate);
        return this;
    }

}
