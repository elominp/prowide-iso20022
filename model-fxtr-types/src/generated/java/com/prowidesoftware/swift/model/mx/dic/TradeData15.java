
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
 * Provides information on the status of a trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData15", propOrder = {
    "msgId",
    "orgtrRef",
    "mtchgSysUnqRef",
    "mtchgSysMtchgRef",
    "mtchgSysMtchdSdRef",
    "stsOrgtr",
    "curSts",
    "curStsSubTp",
    "curStsDtTm",
    "prvsSts",
    "prvsStsSubTp",
    "prvsStsDtTm",
    "pdctTp",
    "sttlmSsnIdr",
    "spltTradInd"
})
public class TradeData15 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "OrgtrRef")
    protected String orgtrRef;
    @XmlElement(name = "MtchgSysUnqRef", required = true)
    protected String mtchgSysUnqRef;
    @XmlElement(name = "MtchgSysMtchgRef")
    protected String mtchgSysMtchgRef;
    @XmlElement(name = "MtchgSysMtchdSdRef")
    protected String mtchgSysMtchdSdRef;
    @XmlElement(name = "StsOrgtr")
    protected String stsOrgtr;
    @XmlElement(name = "CurSts", required = true)
    protected StatusAndSubStatus2 curSts;
    @XmlElement(name = "CurStsSubTp")
    @XmlSchemaType(name = "string")
    protected StatusSubType2Code curStsSubTp;
    @XmlElement(name = "CurStsDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime curStsDtTm;
    @XmlElement(name = "PrvsSts")
    protected Status28Choice prvsSts;
    @XmlElement(name = "PrvsStsSubTp")
    @XmlSchemaType(name = "string")
    protected StatusSubType2Code prvsStsSubTp;
    @XmlElement(name = "PrvsStsDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime prvsStsDtTm;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "SpltTradInd")
    protected Boolean spltTradInd;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the orgtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrRef() {
        return orgtrRef;
    }

    /**
     * Sets the value of the orgtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setOrgtrRef(String value) {
        this.orgtrRef = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSysUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysUnqRef() {
        return mtchgSysUnqRef;
    }

    /**
     * Sets the value of the mtchgSysUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setMtchgSysUnqRef(String value) {
        this.mtchgSysUnqRef = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSysMtchgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysMtchgRef() {
        return mtchgSysMtchgRef;
    }

    /**
     * Sets the value of the mtchgSysMtchgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setMtchgSysMtchgRef(String value) {
        this.mtchgSysMtchgRef = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSysMtchdSdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysMtchdSdRef() {
        return mtchgSysMtchdSdRef;
    }

    /**
     * Sets the value of the mtchgSysMtchdSdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setMtchgSysMtchdSdRef(String value) {
        this.mtchgSysMtchdSdRef = value;
        return this;
    }

    /**
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setStsOrgtr(String value) {
        this.stsOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndSubStatus2 }
     *     
     */
    public StatusAndSubStatus2 getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndSubStatus2 }
     *     
     */
    public TradeData15 setCurSts(StatusAndSubStatus2 value) {
        this.curSts = value;
        return this;
    }

    /**
     * Gets the value of the curStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSubType2Code }
     *     
     */
    public StatusSubType2Code getCurStsSubTp() {
        return curStsSubTp;
    }

    /**
     * Sets the value of the curStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSubType2Code }
     *     
     */
    public TradeData15 setCurStsSubTp(StatusSubType2Code value) {
        this.curStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the curStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCurStsDtTm() {
        return curStsDtTm;
    }

    /**
     * Sets the value of the curStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setCurStsDtTm(OffsetDateTime value) {
        this.curStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsSts property.
     * 
     * @return
     *     possible object is
     *     {@link Status28Choice }
     *     
     */
    public Status28Choice getPrvsSts() {
        return prvsSts;
    }

    /**
     * Sets the value of the prvsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status28Choice }
     *     
     */
    public TradeData15 setPrvsSts(Status28Choice value) {
        this.prvsSts = value;
        return this;
    }

    /**
     * Gets the value of the prvsStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSubType2Code }
     *     
     */
    public StatusSubType2Code getPrvsStsSubTp() {
        return prvsStsSubTp;
    }

    /**
     * Sets the value of the prvsStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSubType2Code }
     *     
     */
    public TradeData15 setPrvsStsSubTp(StatusSubType2Code value) {
        this.prvsStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the prvsStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getPrvsStsDtTm() {
        return prvsStsDtTm;
    }

    /**
     * Sets the value of the prvsStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setPrvsStsDtTm(OffsetDateTime value) {
        this.prvsStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setPdctTp(String value) {
        this.pdctTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSsnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmSsnIdr() {
        return sttlmSsnIdr;
    }

    /**
     * Sets the value of the sttlmSsnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData15 setSttlmSsnIdr(String value) {
        this.sttlmSsnIdr = value;
        return this;
    }

    /**
     * Gets the value of the spltTradInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltTradInd() {
        return spltTradInd;
    }

    /**
     * Sets the value of the spltTradInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeData15 setSpltTradInd(Boolean value) {
        this.spltTradInd = value;
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
