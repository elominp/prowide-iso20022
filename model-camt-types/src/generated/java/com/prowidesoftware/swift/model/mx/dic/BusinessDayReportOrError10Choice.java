
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between business day information details or a business error when the requested data cannot be retrieved.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayReportOrError10Choice", propOrder = {
    "bizDayInf",
    "bizErr"
})
public class BusinessDayReportOrError10Choice {

    @XmlElement(name = "BizDayInf")
    protected BusinessDay9 bizDayInf;
    @XmlElement(name = "BizErr")
    protected List<ErrorHandling5> bizErr;

    /**
     * Gets the value of the bizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDay9 }
     *     
     */
    public BusinessDay9 getBizDayInf() {
        return bizDayInf;
    }

    /**
     * Sets the value of the bizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDay9 }
     *     
     */
    public BusinessDayReportOrError10Choice setBizDayInf(BusinessDay9 value) {
        this.bizDayInf = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bizErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling5 }
     * 
     * 
     * @return
     *     The value of the bizErr property.
     */
    public List<ErrorHandling5> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<>();
        }
        return this.bizErr;
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
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public BusinessDayReportOrError10Choice addBizErr(ErrorHandling5 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
