
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
 * Class for acmt.024.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "idVrfctnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.024.001.04")
public class MxAcmt02400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IdVrfctnRpt", required = true)
    protected IdentificationVerificationReportV04 idVrfctnRpt;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 24;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, IdentificationAssignment4 .class, IdentificationInformation5 .class, IdentificationVerificationReportV04 .class, MessageIdentification8 .class, MxAcmt02400104 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, VerificationReason1Choice.class, VerificationReport5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.024.001.04";

    public MxAcmt02400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt02400104(final String xml) {
        this();
        MxAcmt02400104 tmp = parse(xml);
        idVrfctnRpt = tmp.getIdVrfctnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt02400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the idVrfctnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationVerificationReportV04 }
     *     
     */
    public IdentificationVerificationReportV04 getIdVrfctnRpt() {
        return idVrfctnRpt;
    }

    /**
     * Sets the value of the idVrfctnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationVerificationReportV04 }
     *     
     */
    public MxAcmt02400104 setIdVrfctnRpt(IdentificationVerificationReportV04 value) {
        this.idVrfctnRpt = value;
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
    public static MxAcmt02400104 parse(String xml) {
        return ((MxAcmt02400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt02400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt02400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt02400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt02400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt02400104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt02400104) parserImpl.read(MxAcmt02400104 .class, xml, _classes));
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
     * Creates an MxAcmt02400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt02400104 message
     * @return
     *     a new instance of MxAcmt02400104
     */
    public final static MxAcmt02400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt02400104 .class);
    }

}