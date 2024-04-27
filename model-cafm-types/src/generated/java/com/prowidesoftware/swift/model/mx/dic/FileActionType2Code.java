
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileActionType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDD"/&gt;
 *     &lt;enumeration value="BRPT"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *     &lt;enumeration value="DLSP"/&gt;
 *     &lt;enumeration value="ENQR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileActionType2Code")
@XmlEnum
public enum FileActionType2Code {


    /**
     * Add a new record or file.
     * 
     */
    ADDD,

    /**
     * Replacing  previously added records.
     * 
     */
    BRPT,

    /**
     * Delete an existing record or file.
     * 
     */
    DELT,

    /**
     * System purge.
     * 
     */
    DLSP,

    /**
     * Request the content of an existing record or file.
     * 
     */
    ENQR,

    /**
     * Other type of file action defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of file action defined at private level.
     * 
     */
    OTHP,

    /**
     * Add a new record or file if none exists or replace an existing record or file if one exists.
     * 
     */
    REPL,

    /**
     * Request for a file or record.
     * 
     */
    REQU,

    /**
     * Update an existing record or file.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static FileActionType2Code fromValue(String v) {
        return valueOf(v);
    }

}