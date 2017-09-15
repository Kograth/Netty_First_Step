
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
 *         &lt;element name="TypeOfCargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Office" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeliveryType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SumForCalc" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
    "typeOfCargo",
    "service",
    "weight",
    "office",
    "deliveryType",
    "sumForCalc"
})
@XmlRootElement(name = "CalcOffice")
public class CalcOffice {

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
    @XmlElement(name = "TypeOfCargo", required = true, nillable = true)
    protected String typeOfCargo;
    @XmlElement(name = "Service", required = true, nillable = true)
    protected String service;
    @XmlElement(name = "Weight", required = true, type = Float.class, nillable = true)
    protected Float weight;
    @XmlElement(name = "Office", required = true, nillable = true)
    protected String office;
    @XmlElement(name = "DeliveryType", required = true, nillable = true)
    protected String deliveryType;
    @XmlElement(name = "SumForCalc", required = true, type = Float.class, nillable = true)
    protected Float sumForCalc;

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
     * Gets the value of the typeOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    /**
     * Sets the value of the typeOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfCargo(String value) {
        this.typeOfCargo = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the sumForCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSumForCalc() {
        return sumForCalc;
    }

    /**
     * Sets the value of the sumForCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSumForCalc(Float value) {
        this.sumForCalc = value;
    }

}
