
package ru.cse.APILk.Service1c;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Official" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Recipient" type="{http://www.cse-cargo.ru/client}DestinationInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReplyEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplySMSPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://www.cse-cargo.ru/client}DestinationInformation" minOccurs="0"/&gt;
 *         &lt;element name="TakeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TakeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WayOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WithReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderPowerOfAttorney" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipientPowerOfAttorney" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OrderForAutoReservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoreDoor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOfCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Insurance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Declared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PersonallyInHand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LUW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Distribution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notifications" type="{http://www.cse-cargo.ru/client}Notifications" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CallCourer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfParentForWaybill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrderForWaybill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrayOfDocumentsPhoto" type="{http://www.cse-cargo.ru/client}DocumentsPhoto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="Store" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnalyticsInfoBase" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "client",
    "clientContact",
    "contract",
    "createDate",
    "deliveryDate",
    "deliveryMethod",
    "deliveryTime",
    "department",
    "office",
    "official",
    "project",
    "recipient",
    "replyEMail",
    "replySMSPhone",
    "sender",
    "takeDate",
    "takeTime",
    "typeOfCargo",
    "typeOfPayer",
    "urgency",
    "wayOfPayment",
    "withReturn",
    "autoType",
    "autoModel",
    "senderPowerOfAttorney",
    "recipientPowerOfAttorney",
    "orderForAutoReservation",
    "comment",
    "storeDoor",
    "deliveryOfCargo",
    "insurance",
    "declared",
    "personallyInHand",
    "luw",
    "withSignature",
    "typeOfOrder",
    "distribution",
    "notifications",
    "callCourer",
    "typeOfParentForWaybill",
    "parentOrderForWaybill",
    "clientNumber",
    "arrayOfDocumentsPhoto",
    "services",
    "store",
    "analyticsInfoBase"
})
public class Order {

    @XmlElementRef(name = "Client", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> client;
    @XmlElementRef(name = "ClientContact", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientContact;
    @XmlElementRef(name = "Contract", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contract;
    @XmlElementRef(name = "CreateDate", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createDate;
    @XmlElementRef(name = "DeliveryDate", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deliveryDate;
    @XmlElementRef(name = "DeliveryMethod", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryMethod;
    @XmlElementRef(name = "DeliveryTime", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryTime;
    @XmlElementRef(name = "Department", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "Office", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "Official", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> official;
    @XmlElementRef(name = "Project", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> project;
    @XmlElement(name = "Recipient", nillable = true)
    protected List<DestinationInformation> recipient;
    @XmlElementRef(name = "ReplyEMail", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> replyEMail;
    @XmlElementRef(name = "ReplySMSPhone", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> replySMSPhone;
    @XmlElementRef(name = "Sender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<DestinationInformation> sender;
    @XmlElement(name = "TakeDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takeDate;
    @XmlElementRef(name = "TakeTime", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> takeTime;
    @XmlElementRef(name = "TypeOfCargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfCargo;
    @XmlElementRef(name = "TypeOfPayer", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfPayer;
    @XmlElementRef(name = "Urgency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urgency;
    @XmlElementRef(name = "WayOfPayment", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wayOfPayment;
    @XmlElementRef(name = "WithReturn", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> withReturn;
    @XmlElementRef(name = "AutoType", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoType;
    @XmlElementRef(name = "AutoModel", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoModel;
    @XmlElement(name = "SenderPowerOfAttorney", required = true, type = Integer.class, nillable = true)
    protected Integer senderPowerOfAttorney;
    @XmlElement(name = "RecipientPowerOfAttorney", required = true, type = Integer.class, nillable = true)
    protected Integer recipientPowerOfAttorney;
    @XmlElement(name = "OrderForAutoReservation", required = true, type = Integer.class, nillable = true)
    protected Integer orderForAutoReservation;
    @XmlElementRef(name = "Comment", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "StoreDoor", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> storeDoor;
    @XmlElementRef(name = "DeliveryOfCargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryOfCargo;
    @XmlElementRef(name = "Insurance", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> insurance;
    @XmlElementRef(name = "Declared", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> declared;
    @XmlElementRef(name = "PersonallyInHand", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> personallyInHand;
    @XmlElementRef(name = "LUW", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> luw;
    @XmlElementRef(name = "WithSignature", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> withSignature;
    @XmlElementRef(name = "TypeOfOrder", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfOrder;
    @XmlElementRef(name = "Distribution", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> distribution;
    @XmlElement(name = "Notifications", nillable = true)
    protected List<Notifications> notifications;
    @XmlElementRef(name = "CallCourer", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> callCourer;
    @XmlElementRef(name = "TypeOfParentForWaybill", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfParentForWaybill;
    @XmlElementRef(name = "ParentOrderForWaybill", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentOrderForWaybill;
    @XmlElementRef(name = "ClientNumber", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientNumber;
    @XmlElement(name = "ArrayOfDocumentsPhoto", nillable = true)
    protected List<DocumentsPhoto> arrayOfDocumentsPhoto;
    @XmlElementRef(name = "Services", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> services;
    @XmlElementRef(name = "Store", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> store;
    @XmlElementRef(name = "AnalyticsInfoBase", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> analyticsInfoBase;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClient(JAXBElement<String> value) {
        this.client = value;
    }

    /**
     * Gets the value of the clientContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientContact() {
        return clientContact;
    }

    /**
     * Sets the value of the clientContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientContact(JAXBElement<String> value) {
        this.clientContact = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContract(JAXBElement<String> value) {
        this.contract = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeliveryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryMethod(JAXBElement<String> value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryTime(JAXBElement<String> value) {
        this.deliveryTime = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOffice(JAXBElement<String> value) {
        this.office = value;
    }

    /**
     * Gets the value of the official property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficial() {
        return official;
    }

    /**
     * Sets the value of the official property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficial(JAXBElement<String> value) {
        this.official = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProject(JAXBElement<String> value) {
        this.project = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinationInformation }
     * 
     * 
     */
    public List<DestinationInformation> getRecipient() {
        if (recipient == null) {
            recipient = new ArrayList<DestinationInformation>();
        }
        return this.recipient;
    }

    /**
     * Gets the value of the replyEMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReplyEMail() {
        return replyEMail;
    }

    /**
     * Sets the value of the replyEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReplyEMail(JAXBElement<String> value) {
        this.replyEMail = value;
    }

    /**
     * Gets the value of the replySMSPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReplySMSPhone() {
        return replySMSPhone;
    }

    /**
     * Sets the value of the replySMSPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReplySMSPhone(JAXBElement<String> value) {
        this.replySMSPhone = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}
     *     
     */
    public JAXBElement<DestinationInformation> getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}
     *     
     */
    public void setSender(JAXBElement<DestinationInformation> value) {
        this.sender = value;
    }

    /**
     * Gets the value of the takeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakeDate() {
        return takeDate;
    }

    /**
     * Sets the value of the takeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakeDate(XMLGregorianCalendar value) {
        this.takeDate = value;
    }

    /**
     * Gets the value of the takeTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTakeTime() {
        return takeTime;
    }

    /**
     * Sets the value of the takeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTakeTime(JAXBElement<String> value) {
        this.takeTime = value;
    }

    /**
     * Gets the value of the typeOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfCargo() {
        return typeOfCargo;
    }

    /**
     * Sets the value of the typeOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfCargo(JAXBElement<String> value) {
        this.typeOfCargo = value;
    }

    /**
     * Gets the value of the typeOfPayer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfPayer() {
        return typeOfPayer;
    }

    /**
     * Sets the value of the typeOfPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfPayer(JAXBElement<String> value) {
        this.typeOfPayer = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrgency(JAXBElement<String> value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the wayOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWayOfPayment() {
        return wayOfPayment;
    }

    /**
     * Sets the value of the wayOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWayOfPayment(JAXBElement<String> value) {
        this.wayOfPayment = value;
    }

    /**
     * Gets the value of the withReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWithReturn() {
        return withReturn;
    }

    /**
     * Sets the value of the withReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWithReturn(JAXBElement<Boolean> value) {
        this.withReturn = value;
    }

    /**
     * Gets the value of the autoType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoType() {
        return autoType;
    }

    /**
     * Sets the value of the autoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoType(JAXBElement<String> value) {
        this.autoType = value;
    }

    /**
     * Gets the value of the autoModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoModel() {
        return autoModel;
    }

    /**
     * Sets the value of the autoModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoModel(JAXBElement<String> value) {
        this.autoModel = value;
    }

    /**
     * Gets the value of the senderPowerOfAttorney property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSenderPowerOfAttorney() {
        return senderPowerOfAttorney;
    }

    /**
     * Sets the value of the senderPowerOfAttorney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSenderPowerOfAttorney(Integer value) {
        this.senderPowerOfAttorney = value;
    }

    /**
     * Gets the value of the recipientPowerOfAttorney property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecipientPowerOfAttorney() {
        return recipientPowerOfAttorney;
    }

    /**
     * Sets the value of the recipientPowerOfAttorney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecipientPowerOfAttorney(Integer value) {
        this.recipientPowerOfAttorney = value;
    }

    /**
     * Gets the value of the orderForAutoReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderForAutoReservation() {
        return orderForAutoReservation;
    }

    /**
     * Sets the value of the orderForAutoReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderForAutoReservation(Integer value) {
        this.orderForAutoReservation = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the storeDoor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStoreDoor() {
        return storeDoor;
    }

    /**
     * Sets the value of the storeDoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStoreDoor(JAXBElement<Boolean> value) {
        this.storeDoor = value;
    }

    /**
     * Gets the value of the deliveryOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryOfCargo() {
        return deliveryOfCargo;
    }

    /**
     * Sets the value of the deliveryOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryOfCargo(JAXBElement<String> value) {
        this.deliveryOfCargo = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInsurance(JAXBElement<Boolean> value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the declared property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeclared() {
        return declared;
    }

    /**
     * Sets the value of the declared property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeclared(JAXBElement<Boolean> value) {
        this.declared = value;
    }

    /**
     * Gets the value of the personallyInHand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPersonallyInHand() {
        return personallyInHand;
    }

    /**
     * Sets the value of the personallyInHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPersonallyInHand(JAXBElement<Boolean> value) {
        this.personallyInHand = value;
    }

    /**
     * Gets the value of the luw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLUW() {
        return luw;
    }

    /**
     * Sets the value of the luw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLUW(JAXBElement<Boolean> value) {
        this.luw = value;
    }

    /**
     * Gets the value of the withSignature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWithSignature() {
        return withSignature;
    }

    /**
     * Sets the value of the withSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWithSignature(JAXBElement<Boolean> value) {
        this.withSignature = value;
    }

    /**
     * Gets the value of the typeOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfOrder() {
        return typeOfOrder;
    }

    /**
     * Sets the value of the typeOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfOrder(JAXBElement<String> value) {
        this.typeOfOrder = value;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDistribution() {
        return distribution;
    }

    /**
     * Sets the value of the distribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDistribution(JAXBElement<Boolean> value) {
        this.distribution = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notifications }
     * 
     * 
     */
    public List<Notifications> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<Notifications>();
        }
        return this.notifications;
    }

    /**
     * Gets the value of the callCourer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCallCourer() {
        return callCourer;
    }

    /**
     * Sets the value of the callCourer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCallCourer(JAXBElement<Boolean> value) {
        this.callCourer = value;
    }

    /**
     * Gets the value of the typeOfParentForWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfParentForWaybill() {
        return typeOfParentForWaybill;
    }

    /**
     * Sets the value of the typeOfParentForWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfParentForWaybill(JAXBElement<String> value) {
        this.typeOfParentForWaybill = value;
    }

    /**
     * Gets the value of the parentOrderForWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentOrderForWaybill() {
        return parentOrderForWaybill;
    }

    /**
     * Sets the value of the parentOrderForWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentOrderForWaybill(JAXBElement<String> value) {
        this.parentOrderForWaybill = value;
    }

    /**
     * Gets the value of the clientNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientNumber() {
        return clientNumber;
    }

    /**
     * Sets the value of the clientNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientNumber(JAXBElement<String> value) {
        this.clientNumber = value;
    }

    /**
     * Gets the value of the arrayOfDocumentsPhoto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfDocumentsPhoto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfDocumentsPhoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentsPhoto }
     * 
     * 
     */
    public List<DocumentsPhoto> getArrayOfDocumentsPhoto() {
        if (arrayOfDocumentsPhoto == null) {
            arrayOfDocumentsPhoto = new ArrayList<DocumentsPhoto>();
        }
        return this.arrayOfDocumentsPhoto;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setServices(JAXBElement<ListOfCorrespondences> value) {
        this.services = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStore(JAXBElement<String> value) {
        this.store = value;
    }

    /**
     * Gets the value of the analyticsInfoBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getAnalyticsInfoBase() {
        return analyticsInfoBase;
    }

    /**
     * Sets the value of the analyticsInfoBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setAnalyticsInfoBase(JAXBElement<ListOfCorrespondences> value) {
        this.analyticsInfoBase = value;
    }

}
