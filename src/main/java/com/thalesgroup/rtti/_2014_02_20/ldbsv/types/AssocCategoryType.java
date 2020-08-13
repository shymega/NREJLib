
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssocCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssocCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="join"/&gt;
 *     &lt;enumeration value="divide"/&gt;
 *     &lt;enumeration value="LinkFrom"/&gt;
 *     &lt;enumeration value="LinkTo"/&gt;
 *     &lt;enumeration value="next"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssocCategoryType")
@XmlEnum
public enum AssocCategoryType {

    @XmlEnumValue("join")
    JOIN("join"),
    @XmlEnumValue("divide")
    DIVIDE("divide"),
    @XmlEnumValue("LinkFrom")
    LINK_FROM("LinkFrom"),
    @XmlEnumValue("LinkTo")
    LINK_TO("LinkTo"),
    @XmlEnumValue("next")
    NEXT("next");
    private final String value;

    AssocCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssocCategoryType fromValue(String v) {
        for (AssocCategoryType c: AssocCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
