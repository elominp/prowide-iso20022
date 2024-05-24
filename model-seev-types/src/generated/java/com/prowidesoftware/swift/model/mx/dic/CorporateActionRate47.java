
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
 * Specifies rates related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate47", propOrder = {
    "propsdRate",
    "ovrsbcptRate",
    "reqdTaxtnRate",
    "reqdWhldgOfFrgnTax",
    "reqdWhldgOfLclTax"
})
public class CorporateActionRate47 {

    @XmlElement(name = "PropsdRate")
    protected BigDecimal propsdRate;
    @XmlElement(name = "OvrsbcptRate")
    protected RateAndAmountFormat5Choice ovrsbcptRate;
    @XmlElement(name = "ReqdTaxtnRate")
    protected List<RateAndAmountFormat21Choice> reqdTaxtnRate;
    @XmlElement(name = "ReqdWhldgOfFrgnTax")
    protected List<RateAndAmountFormat21Choice> reqdWhldgOfFrgnTax;
    @XmlElement(name = "ReqdWhldgOfLclTax")
    protected List<RateAndAmountFormat21Choice> reqdWhldgOfLclTax;

    /**
     * Gets the value of the propsdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropsdRate() {
        return propsdRate;
    }

    /**
     * Sets the value of the propsdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate47 setPropsdRate(BigDecimal value) {
        this.propsdRate = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getOvrsbcptRate() {
        return ovrsbcptRate;
    }

    /**
     * Sets the value of the ovrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate47 setOvrsbcptRate(RateAndAmountFormat5Choice value) {
        this.ovrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the reqdTaxtnRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdTaxtnRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdTaxtnRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat21Choice }
     * 
     * 
     * @return
     *     The value of the reqdTaxtnRate property.
     */
    public List<RateAndAmountFormat21Choice> getReqdTaxtnRate() {
        if (reqdTaxtnRate == null) {
            reqdTaxtnRate = new ArrayList<>();
        }
        return this.reqdTaxtnRate;
    }

    /**
     * Gets the value of the reqdWhldgOfFrgnTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdWhldgOfFrgnTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdWhldgOfFrgnTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat21Choice }
     * 
     * 
     * @return
     *     The value of the reqdWhldgOfFrgnTax property.
     */
    public List<RateAndAmountFormat21Choice> getReqdWhldgOfFrgnTax() {
        if (reqdWhldgOfFrgnTax == null) {
            reqdWhldgOfFrgnTax = new ArrayList<>();
        }
        return this.reqdWhldgOfFrgnTax;
    }

    /**
     * Gets the value of the reqdWhldgOfLclTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdWhldgOfLclTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdWhldgOfLclTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat21Choice }
     * 
     * 
     * @return
     *     The value of the reqdWhldgOfLclTax property.
     */
    public List<RateAndAmountFormat21Choice> getReqdWhldgOfLclTax() {
        if (reqdWhldgOfLclTax == null) {
            reqdWhldgOfLclTax = new ArrayList<>();
        }
        return this.reqdWhldgOfLclTax;
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
     * Adds a new item to the reqdTaxtnRate list.
     * @see #getReqdTaxtnRate()
     * 
     */
    public CorporateActionRate47 addReqdTaxtnRate(RateAndAmountFormat21Choice reqdTaxtnRate) {
        getReqdTaxtnRate().add(reqdTaxtnRate);
        return this;
    }

    /**
     * Adds a new item to the reqdWhldgOfFrgnTax list.
     * @see #getReqdWhldgOfFrgnTax()
     * 
     */
    public CorporateActionRate47 addReqdWhldgOfFrgnTax(RateAndAmountFormat21Choice reqdWhldgOfFrgnTax) {
        getReqdWhldgOfFrgnTax().add(reqdWhldgOfFrgnTax);
        return this;
    }

    /**
     * Adds a new item to the reqdWhldgOfLclTax list.
     * @see #getReqdWhldgOfLclTax()
     * 
     */
    public CorporateActionRate47 addReqdWhldgOfLclTax(RateAndAmountFormat21Choice reqdWhldgOfLclTax) {
        getReqdWhldgOfLclTax().add(reqdWhldgOfLclTax);
        return this;
    }

}
