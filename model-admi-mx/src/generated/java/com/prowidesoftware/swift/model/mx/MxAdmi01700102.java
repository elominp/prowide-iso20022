
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
 * Class for admi.017.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prcgReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.017.001.02")
public class MxAdmi01700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrcgReq", required = true)
    protected ProcessingRequestV02 prcgReq;
    public final static transient String BUSINESS_PROCESS = "admi";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, ClearingSystemIdentification2Choice.class, MxAdmi01700102 .class, NameAndAddress8 .class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PostalAddress1 .class, ProcessingRequestV02 .class, RequestDetails30 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:admi.017.001.02";

    public MxAdmi01700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi01700102(final String xml) {
        this();
        MxAdmi01700102 tmp = parse(xml);
        prcgReq = tmp.getPrcgReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi01700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prcgReq property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingRequestV02 }
     *     
     */
    public ProcessingRequestV02 getPrcgReq() {
        return prcgReq;
    }

    /**
     * Sets the value of the prcgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingRequestV02 }
     *     
     */
    public MxAdmi01700102 setPrcgReq(ProcessingRequestV02 value) {
        this.prcgReq = value;
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
    public static MxAdmi01700102 parse(String xml) {
        return ((MxAdmi01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAdmi01700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAdmi01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi01700102 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi01700102) parserImpl.read(MxAdmi01700102 .class, xml, _classes));
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
     * Creates an MxAdmi01700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi01700102 message
     * @return
     *     a new instance of MxAdmi01700102
     */
    public final static MxAdmi01700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi01700102 .class);
    }

}