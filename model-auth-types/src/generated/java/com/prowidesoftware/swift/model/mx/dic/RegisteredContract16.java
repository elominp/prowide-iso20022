
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
 * Amendment data of document that a user must file with an authorised servicer for each contract that involves foreign currency transactions with non residents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContract16", propOrder = {
    "ctrctRegnAmdmntId",
    "rptgPty",
    "regnAgt",
    "regdCtrctAmdmnt",
    "splmtryData"
})
public class RegisteredContract16 {

    @XmlElement(name = "CtrctRegnAmdmntId", required = true)
    protected String ctrctRegnAmdmntId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty6 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification8 regnAgt;
    @XmlElement(name = "RegdCtrctAmdmnt", required = true)
    protected List<RegisteredContract17> regdCtrctAmdmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ctrctRegnAmdmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctRegnAmdmntId() {
        return ctrctRegnAmdmntId;
    }

    /**
     * Sets the value of the ctrctRegnAmdmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegisteredContract16 setCtrctRegnAmdmntId(String value) {
        this.ctrctRegnAmdmntId = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty6 }
     *     
     */
    public TradeParty6 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty6 }
     *     
     */
    public RegisteredContract16 setRptgPty(TradeParty6 value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public RegisteredContract16 setRegnAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrctAmdmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regdCtrctAmdmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdCtrctAmdmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredContract17 }
     * 
     * 
     */
    public List<RegisteredContract17> getRegdCtrctAmdmnt() {
        if (regdCtrctAmdmnt == null) {
            regdCtrctAmdmnt = new ArrayList<RegisteredContract17>();
        }
        return this.regdCtrctAmdmnt;
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
     * Adds a new item to the regdCtrctAmdmnt list.
     * @see #getRegdCtrctAmdmnt()
     * 
     */
    public RegisteredContract16 addRegdCtrctAmdmnt(RegisteredContract17 regdCtrctAmdmnt) {
        getRegdCtrctAmdmnt().add(regdCtrctAmdmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RegisteredContract16 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}