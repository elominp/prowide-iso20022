
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the response to a key exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerKeyExchangeResponse1", propOrder = {
    "envt",
    "tx"
})
public class AcquirerKeyExchangeResponse1 {

    @XmlElement(name = "Envt", required = true)
    protected CardTransactionEnvironment6 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardTransaction14 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionEnvironment6 }
     *     
     */
    public CardTransactionEnvironment6 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionEnvironment6 }
     *     
     */
    public AcquirerKeyExchangeResponse1 setEnvt(CardTransactionEnvironment6 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction14 }
     *     
     */
    public CardTransaction14 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction14 }
     *     
     */
    public AcquirerKeyExchangeResponse1 setTx(CardTransaction14 value) {
        this.tx = value;
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

}
