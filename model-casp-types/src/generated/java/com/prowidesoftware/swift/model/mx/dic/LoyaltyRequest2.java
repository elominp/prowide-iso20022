
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
 * Data to request a loyalty service. A Loyalty request contents : the loyalty transaction request and the loyalty data if any.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRequest2", propOrder = {
    "cstmrOrdr",
    "tx",
    "data"
})
public class LoyaltyRequest2 {

    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;
    @XmlElement(name = "Tx", required = true)
    protected LoyaltyTransaction2 tx;
    @XmlElement(name = "Data")
    protected List<LoyaltyRequestData2> data;

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder1 }
     *     
     */
    public CustomerOrder1 getCstmrOrdr() {
        return cstmrOrdr;
    }

    /**
     * Sets the value of the cstmrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder1 }
     *     
     */
    public LoyaltyRequest2 setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyTransaction2 }
     *     
     */
    public LoyaltyTransaction2 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyTransaction2 }
     *     
     */
    public LoyaltyRequest2 setTx(LoyaltyTransaction2 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyRequestData2 }
     * 
     * 
     */
    public List<LoyaltyRequestData2> getData() {
        if (data == null) {
            data = new ArrayList<LoyaltyRequestData2>();
        }
        return this.data;
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
     * Adds a new item to the data list.
     * @see #getData()
     * 
     */
    public LoyaltyRequest2 addData(LoyaltyRequestData2 data) {
        getData().add(data);
        return this;
    }

}