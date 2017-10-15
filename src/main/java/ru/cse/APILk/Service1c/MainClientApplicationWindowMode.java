
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MainClientApplicationWindowMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MainClientApplicationWindowMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Workplace"/&gt;
 *     &lt;enumeration value="FullscreenWorkplace"/&gt;
 *     &lt;enumeration value="Kiosk"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MainClientApplicationWindowMode")
@XmlEnum
public enum MainClientApplicationWindowMode {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Workplace")
    WORKPLACE("Workplace"),
    @XmlEnumValue("FullscreenWorkplace")
    FULLSCREEN_WORKPLACE("FullscreenWorkplace"),
    @XmlEnumValue("Kiosk")
    KIOSK("Kiosk");
    private final String value;

    MainClientApplicationWindowMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MainClientApplicationWindowMode fromValue(String v) {
        for (MainClientApplicationWindowMode c: MainClientApplicationWindowMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
