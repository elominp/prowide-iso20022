
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for pain.008.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrDrctDbtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.11")
public class MxPain00800111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CstmrDrctDbtInitn", required = true)
    protected CustomerDirectDebitInitiationV11 cstmrDrctDbtInitn;
    public final static transient String BUSINESS_PROCESS = "pain";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AdviceType1 .class, AdviceType1Choice.class, AdviceType1Code.class, AmendmentInformationDetails15 .class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, CreditorReferenceInformation3 .class, CreditorReferenceType2Choice.class, CreditorReferenceType3 .class, CustomerDirectDebitInitiationV11 .class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DatePeriod2 .class, DateType2Choice.class, DirectDebitTransaction12 .class, DirectDebitTransactionInformation32 .class, DocumentAdjustment1 .class, DocumentAmount1 .class, DocumentAmountType1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation2 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1 .class, DocumentType2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment4 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader118 .class, LocalInstrument2Choice.class, MandateRelatedInformation16 .class, MandateSetupReason1Choice.class, MxPain00800111 .class, NameAndAddress18 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PaymentIdentification6 .class, PaymentInstruction45 .class, PaymentMethod2Code.class, PaymentTypeInformation29 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation8 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount4 .class, RemittanceInformation22 .class, RemittanceLocation8 .class, RemittanceLocationData2 .class, RemittanceLocationMethod2Code.class, SequenceType3Code.class, ServiceLevel8Choice.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAuthorisation1 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.11";

    public MxPain00800111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00800111(final String xml) {
        this();
        MxPain00800111 tmp = parse(xml);
        cstmrDrctDbtInitn = tmp.getCstmrDrctDbtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00800111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cstmrDrctDbtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDirectDebitInitiationV11 }
     *     
     */
    public CustomerDirectDebitInitiationV11 getCstmrDrctDbtInitn() {
        return cstmrDrctDbtInitn;
    }

    /**
     * Sets the value of the cstmrDrctDbtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDirectDebitInitiationV11 }
     *     
     */
    public MxPain00800111 setCstmrDrctDbtInitn(CustomerDirectDebitInitiationV11 value) {
        this.cstmrDrctDbtInitn = value;
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
    public static MxPain00800111 parse(String xml) {
        return ((MxPain00800111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00800111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain00800111 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain00800111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00800111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00800111 parse(String xml, MxRead parserImpl) {
        return ((MxPain00800111) parserImpl.read(MxPain00800111 .class, xml, _classes));
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
     * Creates an MxPain00800111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00800111 message
     * @return
     *     a new instance of MxPain00800111
     */
    public final static MxPain00800111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00800111 .class);
    }

}