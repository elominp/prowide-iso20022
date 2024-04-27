
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutcomeOfPRINValueAssessmentOrReviewUKType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutcomeOfPRINValueAssessmentOrReviewUKType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRI2"/&gt;
 *     &lt;enumeration value="PRI1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutcomeOfPRINValueAssessmentOrReviewUKType1Code")
@XmlEnum
public enum OutcomeOfPRINValueAssessmentOrReviewUKType1Code {


    /**
     * Review indicates significant changes are required in order to provide fair value.
     * 
     */
    @XmlEnumValue("PRI2")
    PRI_2("PRI2"),

    /**
     * Product expected to provide fair value for a reasonably foreseeable period.
     * 
     */
    @XmlEnumValue("PRI1")
    PRI_1("PRI1");
    private final String value;

    OutcomeOfPRINValueAssessmentOrReviewUKType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutcomeOfPRINValueAssessmentOrReviewUKType1Code fromValue(String v) {
        for (OutcomeOfPRINValueAssessmentOrReviewUKType1Code c: OutcomeOfPRINValueAssessmentOrReviewUKType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}