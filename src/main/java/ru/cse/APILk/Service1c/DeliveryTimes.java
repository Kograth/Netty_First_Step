
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
 *         &lt;element name="FromGeography" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ToGeography" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "fromGeography",
    "toGeography",
    "urgency"
})
@XmlRootElement(name = "DeliveryTimes")
public class DeliveryTimes {

    @XmlElement(name = "Language", required = true, nillable = true)
    protected String language;
    @XmlElement(name = "Login", required = true, nillable = true)
    protected String login;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "FromGeography", required = true, nillable = true)
    protected String fromGeography;
    @XmlElement(name = "ToGeography", required = true, nillable = true)
    protected String toGeography;
    @XmlElement(name = "Urgency", required = true, nillable = true)
    protected String urgency;

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
     * Gets the value of the fromGeography property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromGeography() {
        return fromGeography;
    }

    /**
     * Sets the value of the fromGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromGeography(String value) {
        this.fromGeography = value;
    }

    /**
     * Gets the value of the toGeography property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToGeography() {
        return toGeography;
    }

    /**
     * Sets the value of the toGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToGeography(String value) {
        this.toGeography = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgency(String value) {
        this.urgency = value;
    }

}
