
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
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberWaybill" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeOfRecipient" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnWeight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ReturnVolumeWeight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ReturnQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnTypeOfCargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReturnDescriptionCargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReturnComment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "company",
    "numberWaybill",
    "typeOfRecipient",
    "returnWeight",
    "returnVolumeWeight",
    "returnQty",
    "returnTypeOfCargo",
    "returnDescriptionCargo",
    "returnComment"
})
@XmlRootElement(name = "SaveWaybillReturn")
public class SaveWaybillReturn {

    @XmlElement(name = "Language", required = true, nillable = true)
    protected String language;
    @XmlElement(name = "Login", required = true)
    protected String login;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Company", required = true, nillable = true)
    protected String company;
    @XmlElement(name = "NumberWaybill", required = true)
    protected String numberWaybill;
    @XmlElement(name = "TypeOfRecipient")
    protected int typeOfRecipient;
    @XmlElement(name = "ReturnWeight", required = true, type = Float.class, nillable = true)
    protected Float returnWeight;
    @XmlElement(name = "ReturnVolumeWeight", required = true, type = Float.class, nillable = true)
    protected Float returnVolumeWeight;
    @XmlElement(name = "ReturnQty", required = true, type = Integer.class, nillable = true)
    protected Integer returnQty;
    @XmlElement(name = "ReturnTypeOfCargo", required = true, nillable = true)
    protected String returnTypeOfCargo;
    @XmlElement(name = "ReturnDescriptionCargo", required = true, nillable = true)
    protected String returnDescriptionCargo;
    @XmlElement(name = "ReturnComment", required = true, nillable = true)
    protected String returnComment;

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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the numberWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberWaybill() {
        return numberWaybill;
    }

    /**
     * Sets the value of the numberWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberWaybill(String value) {
        this.numberWaybill = value;
    }

    /**
     * Gets the value of the typeOfRecipient property.
     * 
     */
    public int getTypeOfRecipient() {
        return typeOfRecipient;
    }

    /**
     * Sets the value of the typeOfRecipient property.
     * 
     */
    public void setTypeOfRecipient(int value) {
        this.typeOfRecipient = value;
    }

    /**
     * Gets the value of the returnWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReturnWeight() {
        return returnWeight;
    }

    /**
     * Sets the value of the returnWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReturnWeight(Float value) {
        this.returnWeight = value;
    }

    /**
     * Gets the value of the returnVolumeWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReturnVolumeWeight() {
        return returnVolumeWeight;
    }

    /**
     * Sets the value of the returnVolumeWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReturnVolumeWeight(Float value) {
        this.returnVolumeWeight = value;
    }

    /**
     * Gets the value of the returnQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnQty() {
        return returnQty;
    }

    /**
     * Sets the value of the returnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnQty(Integer value) {
        this.returnQty = value;
    }

    /**
     * Gets the value of the returnTypeOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTypeOfCargo() {
        return returnTypeOfCargo;
    }

    /**
     * Sets the value of the returnTypeOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTypeOfCargo(String value) {
        this.returnTypeOfCargo = value;
    }

    /**
     * Gets the value of the returnDescriptionCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDescriptionCargo() {
        return returnDescriptionCargo;
    }

    /**
     * Sets the value of the returnDescriptionCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDescriptionCargo(String value) {
        this.returnDescriptionCargo = value;
    }

    /**
     * Gets the value of the returnComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnComment() {
        return returnComment;
    }

    /**
     * Sets the value of the returnComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnComment(String value) {
        this.returnComment = value;
    }

}
