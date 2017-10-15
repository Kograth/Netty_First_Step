
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FillChecking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FillChecking"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DontCheck"/&gt;
 *     &lt;enumeration value="ShowError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FillChecking")
@XmlEnum
public enum FillChecking {

    @XmlEnumValue("DontCheck")
    DONT_CHECK("DontCheck"),
    @XmlEnumValue("ShowError")
    SHOW_ERROR("ShowError");
    private final String value;

    FillChecking(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FillChecking fromValue(String v) {
        for (FillChecking c: FillChecking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
