
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintDocuments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaybillDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TakeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://www.cse-cargo.ru/client}DestinationInformation" minOccurs="0"/&gt;
 *         &lt;element name="Recipient" type="{http://www.cse-cargo.ru/client}DestinationInformation" minOccurs="0"/&gt;
 *         &lt;element name="FlagPaySender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FlagPayRecipient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FlagPayClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FlagGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FlagCash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FlagCashless" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cargo" type="{http://www.cse-cargo.ru/client}Cargo" minOccurs="0"/&gt;
 *         &lt;element name="FlagInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FlagDeclaredValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAmountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarCodeOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarCodeClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentFull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Courer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintDocuments", propOrder = {
    "barCode",
    "waybillNumber",
    "orderNumber",
    "orderDate",
    "waybillDate",
    "takeDate",
    "contractNumber",
    "packageNumber",
    "clientNumber",
    "project",
    "departmentRecipient",
    "departmentSender",
    "sender",
    "recipient",
    "flagPaySender",
    "flagPayRecipient",
    "flagPayClient",
    "flagGuarantee",
    "flagCash",
    "flagCashless",
    "typeOfCargo",
    "cargo",
    "flagInsurance",
    "flagDeclaredValue",
    "withReturn",
    "withNotification",
    "serviceAmount",
    "serviceAmountCurrency",
    "paymentAmount",
    "paymentAmountCurrency",
    "barCodeOrder",
    "barCodeClientCode",
    "urgency",
    "comment",
    "commentFull",
    "courer",
    "client",
    "organization"
})
public class PrintDocuments {

    @XmlElementRef(name = "BarCode", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barCode;
    @XmlElementRef(name = "WaybillNumber", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> waybillNumber;
    @XmlElementRef(name = "OrderNumber", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "OrderDate", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderDate;
    @XmlElementRef(name = "WaybillDate", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> waybillDate;
    @XmlElementRef(name = "TakeDate", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> takeDate;
    @XmlElementRef(name = "ContractNumber", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNumber;
    @XmlElementRef(name = "PackageNumber", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageNumber;
    @XmlElementRef(name = "ClientNumber", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientNumber;
    @XmlElementRef(name = "Project", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> project;
    @XmlElementRef(name = "DepartmentRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentRecipient;
    @XmlElementRef(name = "DepartmentSender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentSender;
    @XmlElementRef(name = "Sender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<DestinationInformation> sender;
    @XmlElementRef(name = "Recipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<DestinationInformation> recipient;
    @XmlElementRef(name = "FlagPaySender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagPaySender;
    @XmlElementRef(name = "FlagPayRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagPayRecipient;
    @XmlElementRef(name = "FlagPayClient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagPayClient;
    @XmlElementRef(name = "FlagGuarantee", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagGuarantee;
    @XmlElementRef(name = "FlagCash", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagCash;
    @XmlElementRef(name = "FlagCashless", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagCashless;
    @XmlElementRef(name = "TypeOfCargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfCargo;
    @XmlElementRef(name = "Cargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Cargo> cargo;
    @XmlElementRef(name = "FlagInsurance", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagInsurance;
    @XmlElementRef(name = "FlagDeclaredValue", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> flagDeclaredValue;
    @XmlElementRef(name = "WithReturn", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> withReturn;
    @XmlElementRef(name = "WithNotification", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> withNotification;
    @XmlElementRef(name = "ServiceAmount", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> serviceAmount;
    @XmlElementRef(name = "ServiceAmountCurrency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAmountCurrency;
    @XmlElementRef(name = "PaymentAmount", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> paymentAmount;
    @XmlElementRef(name = "PaymentAmountCurrency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentAmountCurrency;
    @XmlElementRef(name = "BarCodeOrder", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barCodeOrder;
    @XmlElementRef(name = "BarCodeClientCode", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barCodeClientCode;
    @XmlElementRef(name = "Urgency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urgency;
    @XmlElementRef(name = "Comment", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "CommentFull", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commentFull;
    @XmlElementRef(name = "Courer", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> courer;
    @XmlElementRef(name = "Client", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> client;
    @XmlElementRef(name = "Organization", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organization;

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarCode(JAXBElement<String> value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the waybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWaybillNumber() {
        return waybillNumber;
    }

    /**
     * Sets the value of the waybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWaybillNumber(JAXBElement<String> value) {
        this.waybillNumber = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderDate(JAXBElement<String> value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the waybillDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWaybillDate() {
        return waybillDate;
    }

    /**
     * Sets the value of the waybillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWaybillDate(JAXBElement<String> value) {
        this.waybillDate = value;
    }

    /**
     * Gets the value of the takeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTakeDate() {
        return takeDate;
    }

    /**
     * Sets the value of the takeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTakeDate(JAXBElement<String> value) {
        this.takeDate = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractNumber(JAXBElement<String> value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the packageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageNumber() {
        return packageNumber;
    }

    /**
     * Sets the value of the packageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageNumber(JAXBElement<String> value) {
        this.packageNumber = value;
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
     * Gets the value of the departmentRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentRecipient() {
        return departmentRecipient;
    }

    /**
     * Sets the value of the departmentRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentRecipient(JAXBElement<String> value) {
        this.departmentRecipient = value;
    }

    /**
     * Gets the value of the departmentSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentSender() {
        return departmentSender;
    }

    /**
     * Sets the value of the departmentSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentSender(JAXBElement<String> value) {
        this.departmentSender = value;
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
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}
     *     
     */
    public JAXBElement<DestinationInformation> getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}
     *     
     */
    public void setRecipient(JAXBElement<DestinationInformation> value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the flagPaySender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagPaySender() {
        return flagPaySender;
    }

    /**
     * Sets the value of the flagPaySender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagPaySender(JAXBElement<Boolean> value) {
        this.flagPaySender = value;
    }

    /**
     * Gets the value of the flagPayRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagPayRecipient() {
        return flagPayRecipient;
    }

    /**
     * Sets the value of the flagPayRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagPayRecipient(JAXBElement<Boolean> value) {
        this.flagPayRecipient = value;
    }

    /**
     * Gets the value of the flagPayClient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagPayClient() {
        return flagPayClient;
    }

    /**
     * Sets the value of the flagPayClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagPayClient(JAXBElement<Boolean> value) {
        this.flagPayClient = value;
    }

    /**
     * Gets the value of the flagGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagGuarantee() {
        return flagGuarantee;
    }

    /**
     * Sets the value of the flagGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagGuarantee(JAXBElement<Boolean> value) {
        this.flagGuarantee = value;
    }

    /**
     * Gets the value of the flagCash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagCash() {
        return flagCash;
    }

    /**
     * Sets the value of the flagCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagCash(JAXBElement<Boolean> value) {
        this.flagCash = value;
    }

    /**
     * Gets the value of the flagCashless property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagCashless() {
        return flagCashless;
    }

    /**
     * Sets the value of the flagCashless property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagCashless(JAXBElement<Boolean> value) {
        this.flagCashless = value;
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
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cargo }{@code >}
     *     
     */
    public JAXBElement<Cargo> getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cargo }{@code >}
     *     
     */
    public void setCargo(JAXBElement<Cargo> value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the flagInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagInsurance() {
        return flagInsurance;
    }

    /**
     * Sets the value of the flagInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagInsurance(JAXBElement<Boolean> value) {
        this.flagInsurance = value;
    }

    /**
     * Gets the value of the flagDeclaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFlagDeclaredValue() {
        return flagDeclaredValue;
    }

    /**
     * Sets the value of the flagDeclaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFlagDeclaredValue(JAXBElement<Boolean> value) {
        this.flagDeclaredValue = value;
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
     * Gets the value of the withNotification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWithNotification() {
        return withNotification;
    }

    /**
     * Sets the value of the withNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWithNotification(JAXBElement<Boolean> value) {
        this.withNotification = value;
    }

    /**
     * Gets the value of the serviceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getServiceAmount() {
        return serviceAmount;
    }

    /**
     * Sets the value of the serviceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setServiceAmount(JAXBElement<Float> value) {
        this.serviceAmount = value;
    }

    /**
     * Gets the value of the serviceAmountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceAmountCurrency() {
        return serviceAmountCurrency;
    }

    /**
     * Sets the value of the serviceAmountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceAmountCurrency(JAXBElement<String> value) {
        this.serviceAmountCurrency = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setPaymentAmount(JAXBElement<Float> value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentAmountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentAmountCurrency() {
        return paymentAmountCurrency;
    }

    /**
     * Sets the value of the paymentAmountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentAmountCurrency(JAXBElement<String> value) {
        this.paymentAmountCurrency = value;
    }

    /**
     * Gets the value of the barCodeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarCodeOrder() {
        return barCodeOrder;
    }

    /**
     * Sets the value of the barCodeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarCodeOrder(JAXBElement<String> value) {
        this.barCodeOrder = value;
    }

    /**
     * Gets the value of the barCodeClientCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarCodeClientCode() {
        return barCodeClientCode;
    }

    /**
     * Sets the value of the barCodeClientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarCodeClientCode(JAXBElement<String> value) {
        this.barCodeClientCode = value;
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
     * Gets the value of the commentFull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommentFull() {
        return commentFull;
    }

    /**
     * Sets the value of the commentFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommentFull(JAXBElement<String> value) {
        this.commentFull = value;
    }

    /**
     * Gets the value of the courer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCourer() {
        return courer;
    }

    /**
     * Sets the value of the courer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCourer(JAXBElement<String> value) {
        this.courer = value;
    }

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
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<String> value) {
        this.organization = value;
    }

}
