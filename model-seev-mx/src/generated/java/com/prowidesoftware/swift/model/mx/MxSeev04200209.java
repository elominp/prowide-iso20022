
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.042.002.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.042.002.09")
public class MxSeev04200209
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStmtRpt", required = true)
    protected CorporateActionInstructionStatementReport002V09 corpActnInstrStmtRpt;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 42;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification54 .class, AmountPrice5 .class, AmountPriceType1Code.class, BalanceFormat7Choice.class, CancelledReason11Choice.class, CancelledStatus15Choice.class, CancelledStatusReason14 .class, CancelledStatusReason6Code.class, CorporateActionBalance42 .class, CorporateActionEventAndBalance18 .class, CorporateActionEventDeadlines4 .class, CorporateActionEventType29Code.class, CorporateActionEventType90Choice.class, CorporateActionInstructionStatementReport002V09 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, CorporateActionOption11Code.class, CorporateActionOption36Choice.class, CorporateActionStatementReportingType1Code.class, CorporateActionStatementType2Code.class, DateAndDateTime2Choice.class, DateCode22Choice.class, DateCode26Choice.class, DateCodeAndTimeFormat4 .class, DateFormat49Choice.class, DateFormat54Choice.class, DateOrDateTimePeriod1Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, EventInformation14 .class, FinancialInstrumentQuantity15Choice.class, Frequency26Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, InstructedBalance12 .class, InstructedCorporateActionOption13 .class, InstructionProcessingStatus36Choice.class, MxSeev04200209 .class, NoReasonCode.class, NoSpecifiedReason1 .class, NotificationIdentification6 .class, OptionInstructionDetails4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, Pagination1 .class, PartyIdentification136Choice.class, PendingBalance6 .class, PendingCancellationReason5Code.class, PendingCancellationReason6Choice.class, PendingCancellationStatus9Choice.class, PendingCancellationStatusReason9 .class, PercentagePrice1 .class, PriceFormat57Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, ProtectTransactionType2Code.class, Quantity21Choice.class, Quantity22Choice.class, Quantity23Choice.class, RejectedReason27Choice.class, RejectedStatus28Choice.class, RejectedStatusReason26 .class, RejectionReason49Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat32Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText9 .class, SecurityIdentification20 .class, SettlementTypeAndIdentification26 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, Statement75 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType16Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.042.002.09";

    public MxSeev04200209() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04200209(final String xml) {
        this();
        MxSeev04200209 tmp = parse(xml);
        corpActnInstrStmtRpt = tmp.getCorpActnInstrStmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04200209(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatementReport002V09 }
     *     
     */
    public CorporateActionInstructionStatementReport002V09 getCorpActnInstrStmtRpt() {
        return corpActnInstrStmtRpt;
    }

    /**
     * Sets the value of the corpActnInstrStmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatementReport002V09 }
     *     
     */
    public MxSeev04200209 setCorpActnInstrStmtRpt(CorporateActionInstructionStatementReport002V09 value) {
        this.corpActnInstrStmtRpt = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev04200209 parse(String xml) {
        return ((MxSeev04200209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04200209 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04200209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04200209 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04200209) parserImpl.read(MxSeev04200209 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSeev04200209 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04200209 message
     * @return
     *     a new instance of MxSeev04200209
     */
    public static final MxSeev04200209 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04200209 .class);
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
