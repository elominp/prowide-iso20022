
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthenticationMethod6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPIN"/>
 *     <enumeration value="PPSG"/>
 *     <enumeration value="PSWD"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SCNL"/>
 *     <enumeration value="SNCT"/>
 *     <enumeration value="CPSG"/>
 *     <enumeration value="ADDB"/>
 *     <enumeration value="BIOM"/>
 *     <enumeration value="CDHI"/>
 *     <enumeration value="CRYP"/>
 *     <enumeration value="CSCV"/>
 *     <enumeration value="PSVE"/>
 *     <enumeration value="CSEC"/>
 *     <enumeration value="ADDS"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="FPIN"/>
 *     <enumeration value="TOKP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthenticationMethod6Code")
@XmlEnum
public enum AuthenticationMethod6Code {


    /**
     * On-line PIN authentication (Personal Identification Number).
     * 
     */
    NPIN,

    /**
     * Handwritten paper signature.
     * 
     */
    PPSG,

    /**
     * Authentication by a password.
     * 
     */
    PSWD,

    /**
     * Electronic commerce transaction secured with the X.509 certificate of a customer.
     * 
     */
    SCRT,

    /**
     * Channel-encrypted transaction.
     * 
     */
    SCNL,

    /**
     * Secure electronic transaction without cardholder certificate.
     * 
     */
    SNCT,

    /**
     * Electronic signature capture (handwritten signature).
     * 
     */
    CPSG,

    /**
     * Cardholder billing address verification.
     * 
     */
    ADDB,

    /**
     * Biometric authentication of the cardholder.
     * 
     */
    BIOM,

    /**
     * Cardholder data provided for verification, for instance social security number, driver license number, passport number.
     * 
     */
    CDHI,

    /**
     * Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).
     * 
     */
    CRYP,

    /**
     * Verification of Card Security Code.
     * 
     */
    CSCV,

    /**
     * Authentication based on statistical cardholder behaviour.
     * 
     */
    PSVE,

    /**
     * Authentication performed during a secure electronic commerce transaction.
     * 
     */
    CSEC,

    /**
     * Cardholder shipping address verification.
     * 
     */
    ADDS,

    /**
     * Manual verification, for example passport or drivers license.
     * 
     */
    MANU,

    /**
     * Off-line PIN authentication (Personal Identification Number).
     * 
     */
    FPIN,

    /**
     * Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.
     * 
     */
    TOKP;

    public String value() {
        return name();
    }

    public static AuthenticationMethod6Code fromValue(String v) {
        return valueOf(v);
    }

}
