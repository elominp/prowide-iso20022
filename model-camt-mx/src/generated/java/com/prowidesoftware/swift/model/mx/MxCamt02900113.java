
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
 * Class for camt.029.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rsltnOfInvstgtn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.13")
public class MxCamt02900113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RsltnOfInvstgtn", required = true)
    protected ResolutionOfInvestigationV13 rsltnOfInvstgtn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails15 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CancellationIndividualStatus1Code.class, CancellationStatusReason3Choice.class, CancellationStatusReason5 .class, Case6 .class, CaseAssignment6 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges14 .class, Charges15 .class, ChargesRecord8 .class, ClaimNonReceipt3 .class, ClaimNonReceipt3Choice.class, ClaimNonReceiptRejectReason1Choice.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Compensation5 .class, CompensationReason1Choice.class, Contact13 .class, CorrectiveGroupInformation1 .class, CorrectiveInterbankTransaction3 .class, CorrectivePaymentInitiation5 .class, CorrectiveTransaction5Choice.class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation3 .class, CreditorReferenceType2Choice.class, CreditorReferenceType3 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DatePeriod2 .class, DateType2Choice.class, DocumentAdjustment1 .class, DocumentAmount1 .class, DocumentAmountType1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation2 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1 .class, DocumentType2Choice.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment4 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupCancellationStatus1Code.class, InvestigationStatus6Choice.class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData3Choice.class, MandateRelatedInformation16 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, ModificationStatusReason1Choice.class, ModificationStatusReason3 .class, MxCamt02900113 .class, NamePrefix2Code.class, NumberOfCancellationsPerStatus1 .class, NumberOfTransactionsPerStatus1 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader23 .class, OriginalGroupInformation29 .class, OriginalPaymentInstruction48 .class, OriginalTransactionReference42 .class, OtherContact1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PaymentMethod4Code.class, PaymentTransaction152 .class, PaymentTransaction153 .class, PaymentTransaction157 .class, PaymentTypeInformation27 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation8 .class, RemittanceAmount4 .class, RemittanceInformation22 .class, ResolutionData5 .class, ResolutionOfInvestigationV13 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction15 .class, SettlementMethod1Code.class, StatementResolutionEntry5 .class, StructuredRemittanceInformation18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TransactionIndividualStatus1Code.class, UnderlyingTransaction32 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.13";

    public MxCamt02900113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02900113(final String xml) {
        this();
        MxCamt02900113 tmp = parse(xml);
        rsltnOfInvstgtn = tmp.getRsltnOfInvstgtn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02900113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rsltnOfInvstgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionOfInvestigationV13 }
     *     
     */
    public ResolutionOfInvestigationV13 getRsltnOfInvstgtn() {
        return rsltnOfInvstgtn;
    }

    /**
     * Sets the value of the rsltnOfInvstgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionOfInvestigationV13 }
     *     
     */
    public MxCamt02900113 setRsltnOfInvstgtn(ResolutionOfInvestigationV13 value) {
        this.rsltnOfInvstgtn = value;
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
    public static MxCamt02900113 parse(String xml) {
        return ((MxCamt02900113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02900113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02900113 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02900113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02900113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02900113 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02900113) parserImpl.read(MxCamt02900113 .class, xml, _classes));
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
     * Creates an MxCamt02900113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02900113 message
     * @return
     *     a new instance of MxCamt02900113
     */
    public final static MxCamt02900113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02900113 .class);
    }

}