
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Identification of a security or other asset.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument69", propOrder = {
    "lineId",
    "instrm",
    "qty",
    "trfTp",
    "convs",
    "unitsDtls",
    "clntRef",
    "ctrPtyRef",
    "bizFlowTp",
    "avrgAcqstnPric",
    "trfCcy",
    "ttlBookVal",
    "trfeeAcct",
    "trfr",
    "reqdTrfDt",
    "reqdTradDt",
    "reqdSttlmDt",
    "pmtDtls",
    "crstllstnDtls",
    "taxValtnPt",
    "sttlmPtiesDtls",
    "addtlInf"
})
public class FinancialInstrument69 {

    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "Instrm", required = true)
    protected FinancialInstrument1Choice instrm;
    @XmlElement(name = "Qty")
    protected Quantity44Choice qty;
    @XmlElement(name = "TrfTp", required = true)
    protected TransferType1Choice trfTp;
    @XmlElement(name = "Convs")
    protected Conversion1 convs;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit11> unitsDtls;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference10 ctrPtyRef;
    @XmlElement(name = "BizFlowTp")
    @XmlSchemaType(name = "string")
    protected BusinessFlowType1Code bizFlowTp;
    @XmlElement(name = "AvrgAcqstnPric")
    protected ActiveOrHistoricCurrencyAndAmount avrgAcqstnPric;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "TtlBookVal")
    protected DateAndAmount2 ttlBookVal;
    @XmlElement(name = "TrfeeAcct")
    protected Account28 trfeeAcct;
    @XmlElement(name = "Trfr")
    protected Account28 trfr;
    @XmlElement(name = "ReqdTrfDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdTrfDt;
    @XmlElement(name = "ReqdTradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdTradDt;
    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdSttlmDt;
    @XmlElement(name = "PmtDtls")
    protected PaymentInstrument14 pmtDtls;
    @XmlElement(name = "CrstllstnDtls")
    protected Crystallisation1 crstllstnDtls;
    @XmlElement(name = "TaxValtnPt")
    protected Tax36 taxValtnPt;
    @XmlElement(name = "SttlmPtiesDtls")
    protected FundSettlementParameters14 sttlmPtiesDtls;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument69 setLineId(String value) {
        this.lineId = value;
        return this;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument1Choice }
     *     
     */
    public FinancialInstrument1Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument1Choice }
     *     
     */
    public FinancialInstrument69 setInstrm(FinancialInstrument1Choice value) {
        this.instrm = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity44Choice }
     *     
     */
    public Quantity44Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity44Choice }
     *     
     */
    public FinancialInstrument69 setQty(Quantity44Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the trfTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransferType1Choice }
     *     
     */
    public TransferType1Choice getTrfTp() {
        return trfTp;
    }

    /**
     * Sets the value of the trfTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferType1Choice }
     *     
     */
    public FinancialInstrument69 setTrfTp(TransferType1Choice value) {
        this.trfTp = value;
        return this;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link Conversion1 }
     *     
     */
    public Conversion1 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversion1 }
     *     
     */
    public FinancialInstrument69 setConvs(Conversion1 value) {
        this.convs = value;
        return this;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit11 }
     * 
     * 
     * @return
     *     The value of the unitsDtls property.
     */
    public List<Unit11> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public FinancialInstrument69 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public FinancialInstrument69 setCtrPtyRef(AdditionalReference10 value) {
        this.ctrPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the bizFlowTp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public BusinessFlowType1Code getBizFlowTp() {
        return bizFlowTp;
    }

    /**
     * Sets the value of the bizFlowTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public FinancialInstrument69 setBizFlowTp(BusinessFlowType1Code value) {
        this.bizFlowTp = value;
        return this;
    }

    /**
     * Gets the value of the avrgAcqstnPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAvrgAcqstnPric() {
        return avrgAcqstnPric;
    }

    /**
     * Sets the value of the avrgAcqstnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FinancialInstrument69 setAvrgAcqstnPric(ActiveOrHistoricCurrencyAndAmount value) {
        this.avrgAcqstnPric = value;
        return this;
    }

    /**
     * Gets the value of the trfCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfCcy() {
        return trfCcy;
    }

    /**
     * Sets the value of the trfCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument69 setTrfCcy(String value) {
        this.trfCcy = value;
        return this;
    }

    /**
     * Gets the value of the ttlBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getTtlBookVal() {
        return ttlBookVal;
    }

    /**
     * Sets the value of the ttlBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public FinancialInstrument69 setTtlBookVal(DateAndAmount2 value) {
        this.ttlBookVal = value;
        return this;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account28 }
     *     
     */
    public Account28 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account28 }
     *     
     */
    public FinancialInstrument69 setTrfeeAcct(Account28 value) {
        this.trfeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfr property.
     * 
     * @return
     *     possible object is
     *     {@link Account28 }
     *     
     */
    public Account28 getTrfr() {
        return trfr;
    }

    /**
     * Sets the value of the trfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account28 }
     *     
     */
    public FinancialInstrument69 setTrfr(Account28 value) {
        this.trfr = value;
        return this;
    }

    /**
     * Gets the value of the reqdTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdTrfDt() {
        return reqdTrfDt;
    }

    /**
     * Sets the value of the reqdTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument69 setReqdTrfDt(LocalDate value) {
        this.reqdTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdTradDt() {
        return reqdTradDt;
    }

    /**
     * Sets the value of the reqdTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument69 setReqdTradDt(LocalDate value) {
        this.reqdTradDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument69 setReqdSttlmDt(LocalDate value) {
        this.reqdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument14 }
     *     
     */
    public PaymentInstrument14 getPmtDtls() {
        return pmtDtls;
    }

    /**
     * Sets the value of the pmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument14 }
     *     
     */
    public FinancialInstrument69 setPmtDtls(PaymentInstrument14 value) {
        this.pmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the crstllstnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Crystallisation1 }
     *     
     */
    public Crystallisation1 getCrstllstnDtls() {
        return crstllstnDtls;
    }

    /**
     * Sets the value of the crstllstnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Crystallisation1 }
     *     
     */
    public FinancialInstrument69 setCrstllstnDtls(Crystallisation1 value) {
        this.crstllstnDtls = value;
        return this;
    }

    /**
     * Gets the value of the taxValtnPt property.
     * 
     * @return
     *     possible object is
     *     {@link Tax36 }
     *     
     */
    public Tax36 getTaxValtnPt() {
        return taxValtnPt;
    }

    /**
     * Sets the value of the taxValtnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax36 }
     *     
     */
    public FinancialInstrument69 setTaxValtnPt(Tax36 value) {
        this.taxValtnPt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters14 }
     *     
     */
    public FundSettlementParameters14 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters14 }
     *     
     */
    public FinancialInstrument69 setSttlmPtiesDtls(FundSettlementParameters14 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the unitsDtls list.
     * @see #getUnitsDtls()
     * 
     */
    public FinancialInstrument69 addUnitsDtls(Unit11 unitsDtls) {
        getUnitsDtls().add(unitsDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public FinancialInstrument69 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
