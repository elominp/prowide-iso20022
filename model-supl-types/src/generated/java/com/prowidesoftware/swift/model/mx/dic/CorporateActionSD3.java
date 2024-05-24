
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSD3", propOrder = {
    "plcAndNm",
    "ntceTp",
    "evtCshVal",
    "nbOfShrsToBeIssd",
    "ttlNbOfShrsOfferd",
    "srvvgCpny",
    "cutOffDays",
    "dtcAutomtdOfferPrgm",
    "dtcRcyclCutOffInd",
    "dtcInstrLckoutInd",
    "lngShrtPmtInd",
    "intrmFnlInd",
    "ovrsbcptTp",
    "condlPmtAplblFlg",
    "slctnDealrFeeFlg",
    "dtcCtdyElgblFlg",
    "dtcReorgCtdyElgblFlg",
    "dtcReorgDpstElgblFlg",
    "srrndrShrsToAgtFlg",
    "stepUpPrvlgFlg",
    "rghtsOvrsbcptFlg",
    "rghtsRndUpPrvlgFlg",
    "rghtsTrfblFlg",
    "certDtls"
})
public class CorporateActionSD3 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "NtceTp")
    @XmlSchemaType(name = "string")
    protected NoticeType1Code ntceTp;
    @XmlElement(name = "EvtCshVal")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount evtCshVal;
    @XmlElement(name = "NbOfShrsToBeIssd")
    protected BigDecimal nbOfShrsToBeIssd;
    @XmlElement(name = "TtlNbOfShrsOfferd")
    protected BigDecimal ttlNbOfShrsOfferd;
    @XmlElement(name = "SrvvgCpny")
    protected String srvvgCpny;
    @XmlElement(name = "CutOffDays")
    protected BigDecimal cutOffDays;
    @XmlElement(name = "DTCAutomtdOfferPrgm")
    @XmlSchemaType(name = "string")
    protected DTCAutoOfferProgram1Code dtcAutomtdOfferPrgm;
    @XmlElement(name = "DTCRcyclCutOffInd")
    @XmlSchemaType(name = "string")
    protected CutOff1Code dtcRcyclCutOffInd;
    @XmlElement(name = "DTCInstrLckoutInd")
    @XmlSchemaType(name = "string")
    protected InstructionLockout1Code dtcInstrLckoutInd;
    @XmlElement(name = "LngShrtPmtInd")
    @XmlSchemaType(name = "string")
    protected AccrualPeriodType1Code lngShrtPmtInd;
    @XmlElement(name = "IntrmFnlInd")
    @XmlSchemaType(name = "string")
    protected InterimFinalPayment1Code intrmFnlInd;
    @XmlElement(name = "OvrsbcptTp")
    @XmlSchemaType(name = "string")
    protected OversubscriptionType1Code ovrsbcptTp;
    @XmlElement(name = "CondlPmtAplblFlg")
    protected Boolean condlPmtAplblFlg;
    @XmlElement(name = "SlctnDealrFeeFlg")
    protected Boolean slctnDealrFeeFlg;
    @XmlElement(name = "DTCCtdyElgblFlg")
    protected Boolean dtcCtdyElgblFlg;
    @XmlElement(name = "DTCReorgCtdyElgblFlg")
    protected Boolean dtcReorgCtdyElgblFlg;
    @XmlElement(name = "DTCReorgDpstElgblFlg")
    protected Boolean dtcReorgDpstElgblFlg;
    @XmlElement(name = "SrrndrShrsToAgtFlg")
    protected Boolean srrndrShrsToAgtFlg;
    @XmlElement(name = "StepUpPrvlgFlg")
    protected Boolean stepUpPrvlgFlg;
    @XmlElement(name = "RghtsOvrsbcptFlg")
    protected Boolean rghtsOvrsbcptFlg;
    @XmlElement(name = "RghtsRndUpPrvlgFlg")
    protected Boolean rghtsRndUpPrvlgFlg;
    @XmlElement(name = "RghtsTrfblFlg")
    protected Boolean rghtsTrfblFlg;
    @XmlElement(name = "CertDtls")
    protected List<CorporateActionSD5> certDtls;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionSD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the ntceTp property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeType1Code }
     *     
     */
    public NoticeType1Code getNtceTp() {
        return ntceTp;
    }

    /**
     * Sets the value of the ntceTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeType1Code }
     *     
     */
    public CorporateActionSD3 setNtceTp(NoticeType1Code value) {
        this.ntceTp = value;
        return this;
    }

    /**
     * Gets the value of the evtCshVal property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getEvtCshVal() {
        return evtCshVal;
    }

    /**
     * Sets the value of the evtCshVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public CorporateActionSD3 setEvtCshVal(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.evtCshVal = value;
        return this;
    }

    /**
     * Gets the value of the nbOfShrsToBeIssd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfShrsToBeIssd() {
        return nbOfShrsToBeIssd;
    }

    /**
     * Sets the value of the nbOfShrsToBeIssd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionSD3 setNbOfShrsToBeIssd(BigDecimal value) {
        this.nbOfShrsToBeIssd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfShrsOfferd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfShrsOfferd() {
        return ttlNbOfShrsOfferd;
    }

    /**
     * Sets the value of the ttlNbOfShrsOfferd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionSD3 setTtlNbOfShrsOfferd(BigDecimal value) {
        this.ttlNbOfShrsOfferd = value;
        return this;
    }

    /**
     * Gets the value of the srvvgCpny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvvgCpny() {
        return srvvgCpny;
    }

    /**
     * Sets the value of the srvvgCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionSD3 setSrvvgCpny(String value) {
        this.srvvgCpny = value;
        return this;
    }

    /**
     * Gets the value of the cutOffDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCutOffDays() {
        return cutOffDays;
    }

    /**
     * Sets the value of the cutOffDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionSD3 setCutOffDays(BigDecimal value) {
        this.cutOffDays = value;
        return this;
    }

    /**
     * Gets the value of the dtcAutomtdOfferPrgm property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAutoOfferProgram1Code }
     *     
     */
    public DTCAutoOfferProgram1Code getDTCAutomtdOfferPrgm() {
        return dtcAutomtdOfferPrgm;
    }

    /**
     * Sets the value of the dtcAutomtdOfferPrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAutoOfferProgram1Code }
     *     
     */
    public CorporateActionSD3 setDTCAutomtdOfferPrgm(DTCAutoOfferProgram1Code value) {
        this.dtcAutomtdOfferPrgm = value;
        return this;
    }

    /**
     * Gets the value of the dtcRcyclCutOffInd property.
     * 
     * @return
     *     possible object is
     *     {@link CutOff1Code }
     *     
     */
    public CutOff1Code getDTCRcyclCutOffInd() {
        return dtcRcyclCutOffInd;
    }

    /**
     * Sets the value of the dtcRcyclCutOffInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutOff1Code }
     *     
     */
    public CorporateActionSD3 setDTCRcyclCutOffInd(CutOff1Code value) {
        this.dtcRcyclCutOffInd = value;
        return this;
    }

    /**
     * Gets the value of the dtcInstrLckoutInd property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionLockout1Code }
     *     
     */
    public InstructionLockout1Code getDTCInstrLckoutInd() {
        return dtcInstrLckoutInd;
    }

    /**
     * Sets the value of the dtcInstrLckoutInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionLockout1Code }
     *     
     */
    public CorporateActionSD3 setDTCInstrLckoutInd(InstructionLockout1Code value) {
        this.dtcInstrLckoutInd = value;
        return this;
    }

    /**
     * Gets the value of the lngShrtPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link AccrualPeriodType1Code }
     *     
     */
    public AccrualPeriodType1Code getLngShrtPmtInd() {
        return lngShrtPmtInd;
    }

    /**
     * Sets the value of the lngShrtPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrualPeriodType1Code }
     *     
     */
    public CorporateActionSD3 setLngShrtPmtInd(AccrualPeriodType1Code value) {
        this.lngShrtPmtInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmFnlInd property.
     * 
     * @return
     *     possible object is
     *     {@link InterimFinalPayment1Code }
     *     
     */
    public InterimFinalPayment1Code getIntrmFnlInd() {
        return intrmFnlInd;
    }

    /**
     * Sets the value of the intrmFnlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterimFinalPayment1Code }
     *     
     */
    public CorporateActionSD3 setIntrmFnlInd(InterimFinalPayment1Code value) {
        this.intrmFnlInd = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptTp property.
     * 
     * @return
     *     possible object is
     *     {@link OversubscriptionType1Code }
     *     
     */
    public OversubscriptionType1Code getOvrsbcptTp() {
        return ovrsbcptTp;
    }

    /**
     * Sets the value of the ovrsbcptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OversubscriptionType1Code }
     *     
     */
    public CorporateActionSD3 setOvrsbcptTp(OversubscriptionType1Code value) {
        this.ovrsbcptTp = value;
        return this;
    }

    /**
     * Gets the value of the condlPmtAplblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCondlPmtAplblFlg() {
        return condlPmtAplblFlg;
    }

    /**
     * Sets the value of the condlPmtAplblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setCondlPmtAplblFlg(Boolean value) {
        this.condlPmtAplblFlg = value;
        return this;
    }

    /**
     * Gets the value of the slctnDealrFeeFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlctnDealrFeeFlg() {
        return slctnDealrFeeFlg;
    }

    /**
     * Sets the value of the slctnDealrFeeFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setSlctnDealrFeeFlg(Boolean value) {
        this.slctnDealrFeeFlg = value;
        return this;
    }

    /**
     * Gets the value of the dtcCtdyElgblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTCCtdyElgblFlg() {
        return dtcCtdyElgblFlg;
    }

    /**
     * Sets the value of the dtcCtdyElgblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setDTCCtdyElgblFlg(Boolean value) {
        this.dtcCtdyElgblFlg = value;
        return this;
    }

    /**
     * Gets the value of the dtcReorgCtdyElgblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTCReorgCtdyElgblFlg() {
        return dtcReorgCtdyElgblFlg;
    }

    /**
     * Sets the value of the dtcReorgCtdyElgblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setDTCReorgCtdyElgblFlg(Boolean value) {
        this.dtcReorgCtdyElgblFlg = value;
        return this;
    }

    /**
     * Gets the value of the dtcReorgDpstElgblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTCReorgDpstElgblFlg() {
        return dtcReorgDpstElgblFlg;
    }

    /**
     * Sets the value of the dtcReorgDpstElgblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setDTCReorgDpstElgblFlg(Boolean value) {
        this.dtcReorgDpstElgblFlg = value;
        return this;
    }

    /**
     * Gets the value of the srrndrShrsToAgtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSrrndrShrsToAgtFlg() {
        return srrndrShrsToAgtFlg;
    }

    /**
     * Sets the value of the srrndrShrsToAgtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setSrrndrShrsToAgtFlg(Boolean value) {
        this.srrndrShrsToAgtFlg = value;
        return this;
    }

    /**
     * Gets the value of the stepUpPrvlgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepUpPrvlgFlg() {
        return stepUpPrvlgFlg;
    }

    /**
     * Sets the value of the stepUpPrvlgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setStepUpPrvlgFlg(Boolean value) {
        this.stepUpPrvlgFlg = value;
        return this;
    }

    /**
     * Gets the value of the rghtsOvrsbcptFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtsOvrsbcptFlg() {
        return rghtsOvrsbcptFlg;
    }

    /**
     * Sets the value of the rghtsOvrsbcptFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setRghtsOvrsbcptFlg(Boolean value) {
        this.rghtsOvrsbcptFlg = value;
        return this;
    }

    /**
     * Gets the value of the rghtsRndUpPrvlgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtsRndUpPrvlgFlg() {
        return rghtsRndUpPrvlgFlg;
    }

    /**
     * Sets the value of the rghtsRndUpPrvlgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setRghtsRndUpPrvlgFlg(Boolean value) {
        this.rghtsRndUpPrvlgFlg = value;
        return this;
    }

    /**
     * Gets the value of the rghtsTrfblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRghtsTrfblFlg() {
        return rghtsTrfblFlg;
    }

    /**
     * Sets the value of the rghtsTrfblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD3 setRghtsTrfblFlg(Boolean value) {
        this.rghtsTrfblFlg = value;
        return this;
    }

    /**
     * Gets the value of the certDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionSD5 }
     * 
     * 
     * @return
     *     The value of the certDtls property.
     */
    public List<CorporateActionSD5> getCertDtls() {
        if (certDtls == null) {
            certDtls = new ArrayList<>();
        }
        return this.certDtls;
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
     * Adds a new item to the certDtls list.
     * @see #getCertDtls()
     * 
     */
    public CorporateActionSD3 addCertDtls(CorporateActionSD5 certDtls) {
        getCertDtls().add(certDtls);
        return this;
    }

}
