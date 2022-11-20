
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The SaleTOPOIDeviceRequest message is sent by the sale system to POI system to request a device service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIDeviceRequestV04", propOrder = {
    "hdr",
    "dvcReq",
    "sctyTrlr"
})
public class SaleToPOIDeviceRequestV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "DvcReq", required = true)
    protected DeviceRequest5 dvcReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType29 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header41 }
     *     
     */
    public Header41 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header41 }
     *     
     */
    public SaleToPOIDeviceRequestV04 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceRequest5 }
     *     
     */
    public DeviceRequest5 getDvcReq() {
        return dvcReq;
    }

    /**
     * Sets the value of the dvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceRequest5 }
     *     
     */
    public SaleToPOIDeviceRequestV04 setDvcReq(DeviceRequest5 value) {
        this.dvcReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType29 }
     *     
     */
    public ContentInformationType29 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType29 }
     *     
     */
    public SaleToPOIDeviceRequestV04 setSctyTrlr(ContentInformationType29 value) {
        this.sctyTrlr = value;
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