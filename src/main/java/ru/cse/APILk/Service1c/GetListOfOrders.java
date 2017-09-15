
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SenderGeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Recipient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecipientGeo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeOfDocument" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeOfOrder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecipientContact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StateOfDocument" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastWaybillNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastWaybillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "fromDate",
    "toDate",
    "number",
    "sender",
    "senderGeo",
    "recipient",
    "recipientGeo",
    "company",
    "contact",
    "department",
    "project",
    "typeOfDocument",
    "typeOfOrder",
    "recipientContact",
    "stateOfDocument",
    "lastOrderNumber",
    "lastOrderDate",
    "lastWaybillNumber",
    "lastWaybillDate"
})
@XmlRootElement(name = "GetListOfOrders")
public class GetListOfOrders {

    @XmlElement(name = "Language", required = true, nillable = true)
    protected String language;
    @XmlElement(name = "Login", required = true, nillable = true)
    protected String login;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "FromDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "Number", required = true, nillable = true)
    protected String number;
    @XmlElement(name = "Sender", required = true, nillable = true)
    protected String sender;
    @XmlElement(name = "SenderGeo", required = true, nillable = true)
    protected String senderGeo;
    @XmlElement(name = "Recipient", required = true, nillable = true)
    protected String recipient;
    @XmlElement(name = "RecipientGeo", required = true, nillable = true)
    protected String recipientGeo;
    @XmlElement(name = "Company", required = true, nillable = true)
    protected String company;
    @XmlElement(name = "Contact", required = true, nillable = true)
    protected String contact;
    @XmlElement(name = "Department", required = true, nillable = true)
    protected String department;
    @XmlElement(name = "Project", required = true, nillable = true)
    protected String project;
    @XmlElement(name = "TypeOfDocument", required = true, nillable = true)
    protected String typeOfDocument;
    @XmlElement(name = "TypeOfOrder", required = true, nillable = true)
    protected String typeOfOrder;
    @XmlElement(name = "RecipientContact", required = true, nillable = true)
    protected String recipientContact;
    @XmlElement(name = "StateOfDocument", required = true, nillable = true)
    protected String stateOfDocument;
    @XmlElement(name = "LastOrderNumber", required = true, nillable = true)
    protected String lastOrderNumber;
    @XmlElement(name = "LastOrderDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastOrderDate;
    @XmlElement(name = "LastWaybillNumber", required = true, nillable = true)
    protected String lastWaybillNumber;
    @XmlElement(name = "LastWaybillDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastWaybillDate;

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
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the senderGeo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderGeo() {
        return senderGeo;
    }

    /**
     * Sets the value of the senderGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderGeo(String value) {
        this.senderGeo = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the recipientGeo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientGeo() {
        return recipientGeo;
    }

    /**
     * Sets the value of the recipientGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientGeo(String value) {
        this.recipientGeo = value;
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
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * Gets the value of the typeOfDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfDocument() {
        return typeOfDocument;
    }

    /**
     * Sets the value of the typeOfDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfDocument(String value) {
        this.typeOfDocument = value;
    }

    /**
     * Gets the value of the typeOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfOrder() {
        return typeOfOrder;
    }

    /**
     * Sets the value of the typeOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfOrder(String value) {
        this.typeOfOrder = value;
    }

    /**
     * Gets the value of the recipientContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientContact() {
        return recipientContact;
    }

    /**
     * Sets the value of the recipientContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientContact(String value) {
        this.recipientContact = value;
    }

    /**
     * Gets the value of the stateOfDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfDocument() {
        return stateOfDocument;
    }

    /**
     * Sets the value of the stateOfDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfDocument(String value) {
        this.stateOfDocument = value;
    }

    /**
     * Gets the value of the lastOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOrderNumber() {
        return lastOrderNumber;
    }

    /**
     * Sets the value of the lastOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOrderNumber(String value) {
        this.lastOrderNumber = value;
    }

    /**
     * Gets the value of the lastOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastOrderDate() {
        return lastOrderDate;
    }

    /**
     * Sets the value of the lastOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastOrderDate(XMLGregorianCalendar value) {
        this.lastOrderDate = value;
    }

    /**
     * Gets the value of the lastWaybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastWaybillNumber() {
        return lastWaybillNumber;
    }

    /**
     * Sets the value of the lastWaybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastWaybillNumber(String value) {
        this.lastWaybillNumber = value;
    }

    /**
     * Gets the value of the lastWaybillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastWaybillDate() {
        return lastWaybillDate;
    }

    /**
     * Sets the value of the lastWaybillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastWaybillDate(XMLGregorianCalendar value) {
        this.lastWaybillDate = value;
    }

}
