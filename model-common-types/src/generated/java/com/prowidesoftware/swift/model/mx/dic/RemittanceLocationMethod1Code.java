
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemittanceLocationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RemittanceLocationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAXI"/>
 *     <enumeration value="EDIC"/>
 *     <enumeration value="URID"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="POST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RemittanceLocationMethod1Code")
@XmlEnum
public enum RemittanceLocationMethod1Code {


    /**
     * Remittance advice information must be faxed.
     * 
     */
    FAXI,

    /**
     * Remittance advice information must be sent through Electronic Data Interchange (EDI).
     * 
     */
    EDIC,

    /**
     * Remittance advice information needs to be sent to a Uniform Resource Identifier (URI). URI is a compact string of characters that uniquely identify an abstract or physical resource. URI's are the super-set of identifiers, such as URLs, email addresses, ftp sites, etc, and as such, provide the syntax for all of the identification schemes.
     * 
     */
    URID,

    /**
     * Remittance advice information must be sent through e-mail.
     * 
     */
    EMAL,

    /**
     * Remittance advice information must be sent through postal services.
     * 
     */
    POST;

    public String value() {
        return name();
    }

    public static RemittanceLocationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
