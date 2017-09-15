
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
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GMH" type="{http://www.cse-cargo.ru/client}ArrayGMH"/&gt;
 *         &lt;element name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderData" type="{http://www.cse-cargo.ru/client}Order"/&gt;
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
    "number",
    "gmh",
    "startNumber",
    "orderData"
})
@XmlRootElement(name = "SaveWaybillLG")
public class SaveWaybillLG {

    @XmlElement(name = "Language", required = true, nillable = true)
    protected String language;
    @XmlElement(name = "Login", required = true, nillable = true)
    protected String login;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "Number", required = true, nillable = true)
    protected String number;
    @XmlElement(name = "GMH", required = true)
    protected ArrayGMH gmh;
    @XmlElement(name = "StartNumber")
    protected int startNumber;
    @XmlElement(name = "OrderData", required = true)
    protected Order orderData;

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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the gmh property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayGMH }
     *     
     */
    public ArrayGMH getGMH() {
        return gmh;
    }

    /**
     * Sets the value of the gmh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayGMH }
     *     
     */
    public void setGMH(ArrayGMH value) {
        this.gmh = value;
    }

    /**
     * Gets the value of the startNumber property.
     * 
     */
    public int getStartNumber() {
        return startNumber;
    }

    /**
     * Sets the value of the startNumber property.
     * 
     */
    public void setStartNumber(int value) {
        this.startNumber = value;
    }

    /**
     * Gets the value of the orderData property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrderData() {
        return orderData;
    }

    /**
     * Sets the value of the orderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrderData(Order value) {
        this.orderData = value;
    }

}
