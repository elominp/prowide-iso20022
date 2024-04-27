
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
 * Status of the transactions sent in a previous batch of card payment transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentBatchTransferResponse11", propOrder = {
    "txTtls",
    "dataSet"
})
public class CardPaymentBatchTransferResponse11 {

    @XmlElement(name = "TxTtls")
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "DataSet")
    protected List<CardPaymentDataSet36> dataSet;

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals12 }
     * 
     * 
     */
    public List<TransactionTotals12> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotals12>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet36 }
     * 
     * 
     */
    public List<CardPaymentDataSet36> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<CardPaymentDataSet36>();
        }
        return this.dataSet;
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
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public CardPaymentBatchTransferResponse11 addTxTtls(TransactionTotals12 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the dataSet list.
     * @see #getDataSet()
     * 
     */
    public CardPaymentBatchTransferResponse11 addDataSet(CardPaymentDataSet36 dataSet) {
        getDataSet().add(dataSet);
        return this;
    }

}