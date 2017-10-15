
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowedSign.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllowedSign"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Nonnegative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AllowedSign")
@XmlEnum
public enum AllowedSign {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Nonnegative")
    NONNEGATIVE("Nonnegative");
    private final String value;

    AllowedSign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllowedSign fromValue(String v) {
        for (AllowedSign c: AllowedSign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
