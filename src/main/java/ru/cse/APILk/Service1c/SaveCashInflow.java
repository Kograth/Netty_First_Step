
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
 *         &lt;element name="CostOfDelivery" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CurrencyOfDelivery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "costOfDelivery",
    "currencyOfDelivery"
})
@XmlRootElement(name = "SaveCashInflow")
public class SaveCashInflow {

    @XmlElement(name = "Language", required = true, nillable = true)
    protected String language;
    @XmlElement(name = "Login", required = true, nillable = true)
    protected String login;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "WaybillNumber", required = true)
    protected String waybillNumber;
    @XmlElement(name = "CostOfDelivery", required = true, type = Float.class, nillable = true)
    protected Float costOfDelivery;
    @XmlElement(name = "CurrencyOfDelivery", required = true, nillable = true)
    protected String currencyOfDelivery;

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
     * Gets the value of the costOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCostOfDelivery() {
        return costOfDelivery;
    }

    /**
     * Sets the value of the costOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCostOfDelivery(Float value) {
        this.costOfDelivery = value;
    }

    /**
     * Gets the value of the currencyOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyOfDelivery() {
        return currencyOfDelivery;
    }

    /**
     * Sets the value of the currencyOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyOfDelivery(String value) {
        this.currencyOfDelivery = value;
    }

}
