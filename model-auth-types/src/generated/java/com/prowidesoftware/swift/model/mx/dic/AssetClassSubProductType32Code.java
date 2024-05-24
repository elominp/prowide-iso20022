
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassSubProductType32Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassSubProductType32Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WETF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassSubProductType32Code")
@XmlEnum
public enum AssetClassSubProductType32Code {


    /**
     * Commodity of type wet freight.
     * 
     */
    WETF;

    public String value() {
        return name();
    }

    public static AssetClassSubProductType32Code fromValue(String v) {
        return valueOf(v);
    }

}
