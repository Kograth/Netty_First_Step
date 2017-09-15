
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
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrayStorageGroup" type="{http://www.cse-cargo.ru/client}ArrayString"/&gt;
 *         &lt;element name="Erase" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "contact",
    "arrayStorageGroup",
    "erase"
})
@XmlRootElement(name = "UpdateStorageGroup")
public class UpdateStorageGroup {

    @XmlElement(name = "Language", required = true, nillable = true)
    protected String language;
    @XmlElement(name = "Login", required = true)
    protected String login;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Contact", required = true)
    protected String contact;
    @XmlElement(name = "ArrayStorageGroup", required = true)
    protected ArrayString arrayStorageGroup;
    @XmlElement(name = "Erase", required = true, type = Boolean.class, nillable = true)
    protected Boolean erase;

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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the arrayStorageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayString }
     *     
     */
    public ArrayString getArrayStorageGroup() {
        return arrayStorageGroup;
    }

    /**
     * Sets the value of the arrayStorageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayString }
     *     
     */
    public void setArrayStorageGroup(ArrayString value) {
        this.arrayStorageGroup = value;
    }

    /**
     * Gets the value of the erase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErase() {
        return erase;
    }

    /**
     * Sets the value of the erase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErase(Boolean value) {
        this.erase = value;
    }

}
