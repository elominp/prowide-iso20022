
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information on the remittance advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation8", propOrder = {
    "rmtId",
    "rmtLctnDtls"
})
public class RemittanceLocation8 {

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "RmtLctnDtls")
    protected List<RemittanceLocationData2> rmtLctnDtls;

    /**
     * Gets the value of the rmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtId() {
        return rmtId;
    }

    /**
     * Sets the value of the rmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RemittanceLocation8 setRmtId(String value) {
        this.rmtId = value;
        return this;
    }

    /**
     * Gets the value of the rmtLctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmtLctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtLctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocationData2 }
     * 
     * 
     */
    public List<RemittanceLocationData2> getRmtLctnDtls() {
        if (rmtLctnDtls == null) {
            rmtLctnDtls = new ArrayList<RemittanceLocationData2>();
        }
        return this.rmtLctnDtls;
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
     * Adds a new item to the rmtLctnDtls list.
     * @see #getRmtLctnDtls()
     * 
     */
    public RemittanceLocation8 addRmtLctnDtls(RemittanceLocationData2 rmtLctnDtls) {
        getRmtLctnDtls().add(rmtLctnDtls);
        return this;
    }

}