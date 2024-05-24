
package com.prowidesoftware.swift.model.mx.dic;

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
 * Data to request a loyalty service. A loyalty request contents : the loyalty transaction request and the loyalty data if any.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRequest6", propOrder = {
    "cstmrOrdr",
    "tx",
    "data"
})
public class LoyaltyRequest6 {

    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;
    @XmlElement(name = "Tx", required = true)
    protected LoyaltyTransaction6 tx;
    @XmlElement(name = "Data")
    protected List<LoyaltyRequestData3> data;

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
    public LoyaltyRequest6 setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyTransaction6 }
     *     
     */
    public LoyaltyTransaction6 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyTransaction6 }
     *     
     */
    public LoyaltyRequest6 setTx(LoyaltyTransaction6 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the data property.
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
     * {@link LoyaltyRequestData3 }
     * 
     * 
     * @return
     *     The value of the data property.
     */
    public List<LoyaltyRequestData3> getData() {
        if (data == null) {
            data = new ArrayList<>();
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
    public LoyaltyRequest6 addData(LoyaltyRequestData3 data) {
        getData().add(data);
        return this;
    }

}
