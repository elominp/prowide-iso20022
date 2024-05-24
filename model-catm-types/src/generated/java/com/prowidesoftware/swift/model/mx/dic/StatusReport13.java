
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status of the acceptor system containing the identification of the POI (Point Of Interaction), its components and their installed versions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReport13", propOrder = {
    "poiId",
    "initgTrggr",
    "termnlMgrId",
    "dataSet"
})
public class StatusReport13 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification176 poiId;
    @XmlElement(name = "InitgTrggr")
    protected TriggerInformation2 initgTrggr;
    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "DataSet", required = true)
    protected StatusReportDataSetRequest5 dataSet;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public StatusReport13 setPOIId(GenericIdentification176 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the initgTrggr property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerInformation2 }
     *     
     */
    public TriggerInformation2 getInitgTrggr() {
        return initgTrggr;
    }

    /**
     * Sets the value of the initgTrggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerInformation2 }
     *     
     */
    public StatusReport13 setInitgTrggr(TriggerInformation2 value) {
        this.initgTrggr = value;
        return this;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public StatusReport13 setTermnlMgrId(GenericIdentification176 value) {
        this.termnlMgrId = value;
        return this;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportDataSetRequest5 }
     *     
     */
    public StatusReportDataSetRequest5 getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportDataSetRequest5 }
     *     
     */
    public StatusReport13 setDataSet(StatusReportDataSetRequest5 value) {
        this.dataSet = value;
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
