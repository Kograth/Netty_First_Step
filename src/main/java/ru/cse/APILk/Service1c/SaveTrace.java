
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WaybillNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TraceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TraceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "language",
    "login",
    "password",
    "waybillNumber",
    "traceCode",
    "traceDescription"
})
@XmlRootElement(name = "SaveTrace")
public class SaveTrace {

    @XmlElement(name = "Language", required = true, nillable = true)
    protected String language;
    @XmlElement(name = "Login", required = true, nillable = true)
    protected String login;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "WaybillNumber", required = true)
    protected String waybillNumber;
    @XmlElement(name = "TraceCode", required = true)
    protected String traceCode;
    @XmlElement(name = "TraceDescription", required = true, nillable = true)
    protected String traceDescription;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the waybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNumber() {
        return waybillNumber;
    }

    /**
     * Sets the value of the waybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNumber(String value) {
        this.waybillNumber = value;
    }

    /**
     * Gets the value of the traceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceCode() {
        return traceCode;
    }

    /**
     * Sets the value of the traceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceCode(String value) {
        this.traceCode = value;
    }

    /**
     * Gets the value of the traceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceDescription() {
        return traceDescription;
    }

    /**
     * Sets the value of the traceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceDescription(String value) {
        this.traceDescription = value;
    }

}
