
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMethod11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMethod11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APKI"/&gt;
 *     &lt;enumeration value="ADVF"/&gt;
 *     &lt;enumeration value="ARNB"/&gt;
 *     &lt;enumeration value="ARPC"/&gt;
 *     &lt;enumeration value="ARQC"/&gt;
 *     &lt;enumeration value="ATCC"/&gt;
 *     &lt;enumeration value="BTHD"/&gt;
 *     &lt;enumeration value="CHSA"/&gt;
 *     &lt;enumeration value="CHDN"/&gt;
 *     &lt;enumeration value="CUID"/&gt;
 *     &lt;enumeration value="DRVI"/&gt;
 *     &lt;enumeration value="DRLN"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="EMIN"/&gt;
 *     &lt;enumeration value="EMRN"/&gt;
 *     &lt;enumeration value="IDCN"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="NVSC"/&gt;
 *     &lt;enumeration value="FBIG"/&gt;
 *     &lt;enumeration value="FBIO"/&gt;
 *     &lt;enumeration value="OLDA"/&gt;
 *     &lt;enumeration value="OLDS"/&gt;
 *     &lt;enumeration value="OFPE"/&gt;
 *     &lt;enumeration value="FCPN"/&gt;
 *     &lt;enumeration value="OTPW"/&gt;
 *     &lt;enumeration value="NBIG"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="OCHI"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PPSG"/&gt;
 *     &lt;enumeration value="PSVE"/&gt;
 *     &lt;enumeration value="PASN"/&gt;
 *     &lt;enumeration value="PSWD"/&gt;
 *     &lt;enumeration value="TOKP"/&gt;
 *     &lt;enumeration value="PKIS"/&gt;
 *     &lt;enumeration value="PLOB"/&gt;
 *     &lt;enumeration value="PCDV"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SCNL"/&gt;
 *     &lt;enumeration value="CSEC"/&gt;
 *     &lt;enumeration value="SHAF"/&gt;
 *     &lt;enumeration value="SHAT"/&gt;
 *     &lt;enumeration value="CPSG"/&gt;
 *     &lt;enumeration value="SSNB"/&gt;
 *     &lt;enumeration value="TXIN"/&gt;
 *     &lt;enumeration value="TOKA"/&gt;
 *     &lt;enumeration value="CDHI"/&gt;
 *     &lt;enumeration value="TOKN"/&gt;
 *     &lt;enumeration value="QWAC"/&gt;
 *     &lt;enumeration value="PHOM"/&gt;
 *     &lt;enumeration value="PWOR"/&gt;
 *     &lt;enumeration value="THDS"/&gt;
 *     &lt;enumeration value="ADDB"/&gt;
 *     &lt;enumeration value="ADDS"/&gt;
 *     &lt;enumeration value="CSCV"/&gt;
 *     &lt;enumeration value="CRYP"/&gt;
 *     &lt;enumeration value="BIOM"/&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *     &lt;enumeration value="FPIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationMethod11Code")
@XmlEnum
public enum AuthenticationMethod11Code {


    /**
     * Account-based digital signature authentication.
     * 
     */
    APKI,

    /**
     * Digits of the address.
     * 
     */
    ADVF,

    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    ARNB,

    /**
     * Response Card Cryptogram (ARPC)  verification.
     * 
     */
    ARPC,

    /**
     * Verification of a cryptogram generated by a chip card, for instance an ARQC (Authorisation Request Cryptogram).
     * 
     */
    ARQC,

    /**
     * Application Transaction Counter
     * 
     */
    ATCC,

    /**
     * Date of birth of a person.
     * 
     */
    BTHD,

    /**
     * Verification whether the address corresponds to the cardholder's one.
     * 
     */
    CHSA,

    /**
     * Name of cardholder
     * 
     */
    CHDN,

    /**
     * Customer number used as a mechanism of authentication.
     * 
     */
    CUID,

    /**
     * Identification of a driver in a fleet of vehicles.
     * 
     */
    DRVI,

    /**
     * Number assigned by a driving license authority to a person driving a car.
     * 
     */
    DRLN,

    /**
     * Electronic mail address
     * 
     */
    EMAL,

    /**
     * Number assigned to an employee by an employer.
     * 
     */
    EMIN,

    /**
     * Number assigned to an employer by a registration authority.
     * 
     */
    EMRN,

    /**
     * Number assigned by a national authority to an identity card.
     * 
     */
    IDCN,

    /**
     * Manual verification, for example passport or drivers license.
     * 
     */
    MANU,

    /**
     * Non visible Card Security Code.
     * 
     */
    NVSC,

    /**
     * Biographics authentication in an offline mode.
     * 
     */
    FBIG,

    /**
     * Biometrics authentication in an offline mode
     * 
     */
    FBIO,

    /**
     * Authentication of data in an offline mode
     * 
     */
    OLDA,

    /**
     * Analysis of signature transmitted offline
     * 
     */
    OLDS,

    /**
     * PIN generated offline and transmitted encrypted
     * 
     */
    OFPE,

    /**
     * PIN generated offline and transmitted in clear
     * 
     */
    FCPN,

    /**
     * Verification of a one-time password provided by the issuer.
     * 
     */
    OTPW,

    /**
     * Biographics authentication in an online mode.
     * 
     */
    NBIG,

    /**
     * On-line PIN authentication (Personal Identification Number).
     * 
     */
    NPIN,

    /**
     * Other cardholder data provided for identification.
     * 
     */
    OCHI,

    /**
     * Other type of verification defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of verification defined at private level
     * 
     */
    OTHP,

    /**
     * Handwritten paper signature.
     * 
     */
    PPSG,

    /**
     * Authentication based on statistical cardholder behaviour.
     * 
     */
    PSVE,

    /**
     * Number assigned by a passport authority to a passport.
     * 
     */
    PASN,

    /**
     * Authentication by a password.
     * 
     */
    PSWD,

    /**
     * Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.
     * 
     */
    TOKP,

    /**
     * PKI (Public Key Infrastructure) based digital signature
     * 
     */
    PKIS,

    /**
     * Place of birth of a person.
     * 
     */
    PLOB,

    /**
     * Verification based on digits of the postal code.
     * 
     */
    PCDV,

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
     * Authentication performed during a secure electronic commerce transaction.
     * 
     */
    CSEC,

    /**
     * Shipping address from verification.
     * 
     */
    SHAF,

    /**
     * Shipping address to verification
     * 
     */
    SHAT,

    /**
     * Electronic signature capture (handwritten signature).
     * 
     */
    CPSG,

    /**
     * Number assigned by a social security agency.
     * 
     */
    SSNB,

    /**
     * Number assigned by a tax authority to an entity.
     * 
     */
    TXIN,

    /**
     * A token is used to verify an already performed authentication.
     * 
     */
    TOKA,

    /**
     * Cardholder data provided for verification, for instance social security number, driver license number, passport number.
     * 
     */
    CDHI,

    /**
     * Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token.
     * 
     */
    TOKN,

    /**
     * QualifiedCertificate
     * 
     */
    QWAC,

    /**
     * Customer home phone number.
     * 
     */
    PHOM,

    /**
     * Customer work phone number
     * 
     */
    PWOR,

    /**
     * Authentication performed during a secure electronic commerce transaction.
     * 
     */
    THDS,

    /**
     * Cardholder billing address verification.
     * 
     */
    ADDB,

    /**
     * Cardholder shipping address verification.
     * 
     */
    ADDS,

    /**
     * Verification of Card Security Code.
     * 
     */
    CSCV,

    /**
     * Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).
     * 
     */
    CRYP,

    /**
     * Biometric authentication of the cardholder.
     * 
     */
    BIOM,

    /**
     * Customer mobile device.
     * 
     */
    MOBL,

    /**
     * Off-line PIN authentication (Personal Identification Number).
     * 
     */
    FPIN;

    public String value() {
        return name();
    }

    public static AuthenticationMethod11Code fromValue(String v) {
        return valueOf(v);
    }

}