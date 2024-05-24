
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
 * Class for sese.031.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondModStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.031.002.02")
public class MxSese03100202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
    protected SecuritiesSettlementConditionModificationStatusAdviceV02Subset sctiesSttlmCondModStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus6Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AutoBorrowing2Code.class, AutomaticBorrowing3Choice.class, DeniedReason4 .class, DeniedReason4Code.class, DeniedReason6Choice.class, DeniedStatus4Choice.class, DocumentNumber3Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification34 .class, HoldIndicator3 .class, Identification4 .class, LinkageType1Code.class, LinkageType2Choice.class, Linkages11 .class, MatchingDenied2Choice.class, MatchingProcess1Code.class, MxSese03100202 .class, NoReasonCode.class, NoSpecifiedReason1 .class, PartyIdentification51Choice.class, PartyIdentification64Choice.class, PendingReason3 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus7Choice.class, PriorityNumeric2Choice.class, ProcessingPosition1Code.class, ProcessingPosition4Choice.class, ProcessingStatus15Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, References15Choice.class, References8 .class, Registration2Code.class, Registration4Choice.class, RegistrationReason2 .class, RejectionAndRepairReason11Choice.class, RejectionOrRepairReason11 .class, RejectionOrRepairStatus12Choice.class, RejectionReason21Code.class, RequestDetails7 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesSettlementConditionModificationStatusAdviceV02Subset.class, SecuritiesTransactionType5Code.class, SettlementTransactionCondition5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnilateralSplit2Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.031.002.02";

    public MxSese03100202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03100202(final String xml) {
        this();
        MxSese03100202 tmp = parse(xml);
        sctiesSttlmCondModStsAdvc = tmp.getSctiesSttlmCondModStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03100202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV02Subset }
     *     
     */
    public SecuritiesSettlementConditionModificationStatusAdviceV02Subset getSctiesSttlmCondModStsAdvc() {
        return sctiesSttlmCondModStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmCondModStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionModificationStatusAdviceV02Subset }
     *     
     */
    public MxSese03100202 setSctiesSttlmCondModStsAdvc(SecuritiesSettlementConditionModificationStatusAdviceV02Subset value) {
        this.sctiesSttlmCondModStsAdvc = value;
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
    public static MxSese03100202 parse(String xml) {
        return ((MxSese03100202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03100202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03100202 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03100202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03100202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03100202 parse(String xml, MxRead parserImpl) {
        return ((MxSese03100202) parserImpl.read(MxSese03100202 .class, xml, _classes));
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
     * Creates an MxSese03100202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03100202 message
     * @return
     *     a new instance of MxSese03100202
     */
    public static final MxSese03100202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03100202 .class);
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
