
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
 * This component define the environment, the context
 * and the services to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageStatusResponse2", propOrder = {
    "envt",
    "cntxt",
    "msgStsRspnData",
    "rspn",
    "splmtryData"
})
public class MessageStatusResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment73 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext27 cntxt;
    @XmlElement(name = "MsgStsRspnData", required = true)
    protected MessageStatusResponseData2 msgStsRspnData;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType9 rspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment73 }
     *     
     */
    public CardPaymentEnvironment73 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment73 }
     *     
     */
    public MessageStatusResponse2 setEnvt(CardPaymentEnvironment73 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public CardPaymentContext27 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public MessageStatusResponse2 setCntxt(CardPaymentContext27 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the msgStsRspnData property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusResponseData2 }
     *     
     */
    public MessageStatusResponseData2 getMsgStsRspnData() {
        return msgStsRspnData;
    }

    /**
     * Sets the value of the msgStsRspnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusResponseData2 }
     *     
     */
    public MessageStatusResponse2 setMsgStsRspnData(MessageStatusResponseData2 value) {
        this.msgStsRspnData = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public MessageStatusResponse2 setRspn(ResponseType9 value) {
        this.rspn = value;
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
    public MessageStatusResponse2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}