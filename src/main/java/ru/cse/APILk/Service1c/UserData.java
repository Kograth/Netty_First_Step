
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressBook" type="{http://www.cse-cargo.ru/client}AddressBook" minOccurs="0"/&gt;
 *         &lt;element name="CargoDescriptions" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="Companies" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryMethods" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentOnlyFromPredefinedList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Departments" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypes" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="TrackingDocuments" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="TypesOfCargo" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="TypesOfPayers" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="Urgencies" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="WaysOfPayment" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="Store" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceInOrderForStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CoefficientOfVolumeWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WeightLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PrintProject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrintDepartment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CargoPackagesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CargoDiscriptionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientOfficialRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderOfficialRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientOfficialRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WriteInsuranceCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WriteDeclaredCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentWaybill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainTypeOfDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainTypeOfCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainEmailRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainPhonelRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainAddressRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainCommentRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainOfficialRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainGeographyRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainEmailSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainPhonelSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainCommentSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainAddressSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainOfficialSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainGeographySender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DetermineIntakeOffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnebleCOD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnebleDateTimeDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Contacts" type="{http://www.cse-cargo.ru/client}Address" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfDeliveryOfCargo" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="UseOptionallyAnalytics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Restrictions" type="{http://www.cse-cargo.ru/client}ListOfCorrespondences" minOccurs="0"/&gt;
 *         &lt;element name="PreliminaryCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvailableFunctionalCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChangeCustomerGoods" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateCustomerGoods" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChangeCustomerGoodsPhoto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateCustomerGoodsPhoto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FieldsProjectCustomerGoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EditRecipientInOrderForApproval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequiresOrderConfirmationWarehouse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateProjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateDepartments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateOfficials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientEmailRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderEmailRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SplitAnAddressBook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseOwnAddressBook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserData", propOrder = {
    "addressBook",
    "cargoDescriptions",
    "companies",
    "deliveryMethods",
    "departmentOnlyFromPredefinedList",
    "departmentRequired",
    "departments",
    "packageTypes",
    "services",
    "trackingDocuments",
    "typesOfCargo",
    "typesOfPayers",
    "urgencies",
    "waysOfPayment",
    "store",
    "priceInOrderForStore",
    "coefficientOfVolumeWeight",
    "weightLimit",
    "printProject",
    "printDepartment",
    "cargoPackagesRequired",
    "cargoDiscriptionRequired",
    "recipientOfficialRequired",
    "senderOfficialRequired",
    "clientOfficialRequired",
    "writeInsuranceCost",
    "writeDeclaredCost",
    "commentWaybill",
    "commentOrder",
    "mainTypeOfDelivery",
    "mainPayer",
    "mainDocument",
    "mainTypeOfCargo",
    "mainEmailRecipient",
    "mainPhonelRecipient",
    "mainAddressRecipient",
    "mainCommentRecipient",
    "mainRecipient",
    "mainOfficialRecipient",
    "mainGeographyRecipient",
    "mainEmailSender",
    "mainPhonelSender",
    "mainSender",
    "mainCommentSender",
    "mainAddressSender",
    "mainOfficialSender",
    "mainGeographySender",
    "projectRequired",
    "determineIntakeOffice",
    "enebleCOD",
    "enebleDateTimeDepart",
    "contacts",
    "typeOfDeliveryOfCargo",
    "useOptionallyAnalytics",
    "organization",
    "declaredLimit",
    "insuranceLimit",
    "restrictions",
    "preliminaryCost",
    "availableFunctionalCategory",
    "changeCustomerGoods",
    "createCustomerGoods",
    "changeCustomerGoodsPhoto",
    "createCustomerGoodsPhoto",
    "fieldsProjectCustomerGoods",
    "editRecipientInOrderForApproval",
    "requiresOrderConfirmationWarehouse",
    "createProjects",
    "createDepartments",
    "createOfficials",
    "recipientEmailRequired",
    "senderEmailRequired",
    "splitAnAddressBook",
    "useOwnAddressBook"
})
public class UserData {

    @XmlElementRef(name = "AddressBook", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressBook> addressBook;
    @XmlElementRef(name = "CargoDescriptions", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> cargoDescriptions;
    @XmlElementRef(name = "Companies", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> companies;
    @XmlElementRef(name = "DeliveryMethods", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> deliveryMethods;
    @XmlElementRef(name = "DepartmentOnlyFromPredefinedList", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> departmentOnlyFromPredefinedList;
    @XmlElementRef(name = "DepartmentRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> departmentRequired;
    @XmlElementRef(name = "Departments", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> departments;
    @XmlElementRef(name = "PackageTypes", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> packageTypes;
    @XmlElementRef(name = "Services", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> services;
    @XmlElementRef(name = "TrackingDocuments", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> trackingDocuments;
    @XmlElementRef(name = "TypesOfCargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> typesOfCargo;
    @XmlElementRef(name = "TypesOfPayers", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> typesOfPayers;
    @XmlElementRef(name = "Urgencies", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> urgencies;
    @XmlElementRef(name = "WaysOfPayment", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> waysOfPayment;
    @XmlElementRef(name = "Store", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> store;
    @XmlElementRef(name = "PriceInOrderForStore", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> priceInOrderForStore;
    @XmlElementRef(name = "CoefficientOfVolumeWeight", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> coefficientOfVolumeWeight;
    @XmlElementRef(name = "WeightLimit", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> weightLimit;
    @XmlElementRef(name = "PrintProject", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> printProject;
    @XmlElementRef(name = "PrintDepartment", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> printDepartment;
    @XmlElementRef(name = "CargoPackagesRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cargoPackagesRequired;
    @XmlElementRef(name = "CargoDiscriptionRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cargoDiscriptionRequired;
    @XmlElementRef(name = "RecipientOfficialRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> recipientOfficialRequired;
    @XmlElementRef(name = "SenderOfficialRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> senderOfficialRequired;
    @XmlElementRef(name = "ClientOfficialRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> clientOfficialRequired;
    @XmlElementRef(name = "WriteInsuranceCost", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> writeInsuranceCost;
    @XmlElementRef(name = "WriteDeclaredCost", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> writeDeclaredCost;
    @XmlElementRef(name = "CommentWaybill", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commentWaybill;
    @XmlElementRef(name = "CommentOrder", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commentOrder;
    @XmlElementRef(name = "MainTypeOfDelivery", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainTypeOfDelivery;
    @XmlElementRef(name = "MainPayer", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainPayer;
    @XmlElementRef(name = "MainDocument", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainDocument;
    @XmlElementRef(name = "MainTypeOfCargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainTypeOfCargo;
    @XmlElementRef(name = "MainEmailRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainEmailRecipient;
    @XmlElementRef(name = "MainPhonelRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainPhonelRecipient;
    @XmlElementRef(name = "MainAddressRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainAddressRecipient;
    @XmlElementRef(name = "MainCommentRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainCommentRecipient;
    @XmlElementRef(name = "MainRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainRecipient;
    @XmlElementRef(name = "MainOfficialRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainOfficialRecipient;
    @XmlElementRef(name = "MainGeographyRecipient", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainGeographyRecipient;
    @XmlElementRef(name = "MainEmailSender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainEmailSender;
    @XmlElementRef(name = "MainPhonelSender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainPhonelSender;
    @XmlElementRef(name = "MainSender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainSender;
    @XmlElementRef(name = "MainCommentSender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainCommentSender;
    @XmlElementRef(name = "MainAddressSender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainAddressSender;
    @XmlElementRef(name = "MainOfficialSender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainOfficialSender;
    @XmlElementRef(name = "MainGeographySender", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainGeographySender;
    @XmlElementRef(name = "ProjectRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> projectRequired;
    @XmlElementRef(name = "DetermineIntakeOffice", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> determineIntakeOffice;
    @XmlElementRef(name = "EnebleCOD", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enebleCOD;
    @XmlElementRef(name = "EnebleDateTimeDepart", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enebleDateTimeDepart;
    @XmlElementRef(name = "Contacts", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> contacts;
    @XmlElementRef(name = "TypeOfDeliveryOfCargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> typeOfDeliveryOfCargo;
    @XmlElementRef(name = "UseOptionallyAnalytics", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useOptionallyAnalytics;
    @XmlElementRef(name = "Organization", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organization;
    @XmlElementRef(name = "DeclaredLimit", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> declaredLimit;
    @XmlElementRef(name = "InsuranceLimit", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> insuranceLimit;
    @XmlElementRef(name = "Restrictions", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCorrespondences> restrictions;
    @XmlElementRef(name = "PreliminaryCost", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preliminaryCost;
    @XmlElementRef(name = "AvailableFunctionalCategory", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> availableFunctionalCategory;
    @XmlElementRef(name = "ChangeCustomerGoods", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> changeCustomerGoods;
    @XmlElementRef(name = "CreateCustomerGoods", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> createCustomerGoods;
    @XmlElementRef(name = "ChangeCustomerGoodsPhoto", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> changeCustomerGoodsPhoto;
    @XmlElementRef(name = "CreateCustomerGoodsPhoto", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> createCustomerGoodsPhoto;
    @XmlElementRef(name = "FieldsProjectCustomerGoods", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldsProjectCustomerGoods;
    @XmlElementRef(name = "EditRecipientInOrderForApproval", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> editRecipientInOrderForApproval;
    @XmlElementRef(name = "RequiresOrderConfirmationWarehouse", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> requiresOrderConfirmationWarehouse;
    @XmlElementRef(name = "CreateProjects", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> createProjects;
    @XmlElementRef(name = "CreateDepartments", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> createDepartments;
    @XmlElementRef(name = "CreateOfficials", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> createOfficials;
    @XmlElementRef(name = "RecipientEmailRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> recipientEmailRequired;
    @XmlElementRef(name = "SenderEmailRequired", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> senderEmailRequired;
    @XmlElementRef(name = "SplitAnAddressBook", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> splitAnAddressBook;
    @XmlElementRef(name = "UseOwnAddressBook", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useOwnAddressBook;

    /**
     * Gets the value of the addressBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressBook }{@code >}
     *     
     */
    public JAXBElement<AddressBook> getAddressBook() {
        return addressBook;
    }

    /**
     * Sets the value of the addressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressBook }{@code >}
     *     
     */
    public void setAddressBook(JAXBElement<AddressBook> value) {
        this.addressBook = value;
    }

    /**
     * Gets the value of the cargoDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getCargoDescriptions() {
        return cargoDescriptions;
    }

    /**
     * Sets the value of the cargoDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setCargoDescriptions(JAXBElement<ListOfCorrespondences> value) {
        this.cargoDescriptions = value;
    }

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setCompanies(JAXBElement<ListOfCorrespondences> value) {
        this.companies = value;
    }

    /**
     * Gets the value of the deliveryMethods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getDeliveryMethods() {
        return deliveryMethods;
    }

    /**
     * Sets the value of the deliveryMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setDeliveryMethods(JAXBElement<ListOfCorrespondences> value) {
        this.deliveryMethods = value;
    }

    /**
     * Gets the value of the departmentOnlyFromPredefinedList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDepartmentOnlyFromPredefinedList() {
        return departmentOnlyFromPredefinedList;
    }

    /**
     * Sets the value of the departmentOnlyFromPredefinedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDepartmentOnlyFromPredefinedList(JAXBElement<Boolean> value) {
        this.departmentOnlyFromPredefinedList = value;
    }

    /**
     * Gets the value of the departmentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDepartmentRequired() {
        return departmentRequired;
    }

    /**
     * Sets the value of the departmentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDepartmentRequired(JAXBElement<Boolean> value) {
        this.departmentRequired = value;
    }

    /**
     * Gets the value of the departments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getDepartments() {
        return departments;
    }

    /**
     * Sets the value of the departments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setDepartments(JAXBElement<ListOfCorrespondences> value) {
        this.departments = value;
    }

    /**
     * Gets the value of the packageTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getPackageTypes() {
        return packageTypes;
    }

    /**
     * Sets the value of the packageTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setPackageTypes(JAXBElement<ListOfCorrespondences> value) {
        this.packageTypes = value;
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
     * Gets the value of the trackingDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getTrackingDocuments() {
        return trackingDocuments;
    }

    /**
     * Sets the value of the trackingDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setTrackingDocuments(JAXBElement<ListOfCorrespondences> value) {
        this.trackingDocuments = value;
    }

    /**
     * Gets the value of the typesOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getTypesOfCargo() {
        return typesOfCargo;
    }

    /**
     * Sets the value of the typesOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setTypesOfCargo(JAXBElement<ListOfCorrespondences> value) {
        this.typesOfCargo = value;
    }

    /**
     * Gets the value of the typesOfPayers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getTypesOfPayers() {
        return typesOfPayers;
    }

    /**
     * Sets the value of the typesOfPayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setTypesOfPayers(JAXBElement<ListOfCorrespondences> value) {
        this.typesOfPayers = value;
    }

    /**
     * Gets the value of the urgencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getUrgencies() {
        return urgencies;
    }

    /**
     * Sets the value of the urgencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setUrgencies(JAXBElement<ListOfCorrespondences> value) {
        this.urgencies = value;
    }

    /**
     * Gets the value of the waysOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getWaysOfPayment() {
        return waysOfPayment;
    }

    /**
     * Sets the value of the waysOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setWaysOfPayment(JAXBElement<ListOfCorrespondences> value) {
        this.waysOfPayment = value;
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
     * Gets the value of the priceInOrderForStore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPriceInOrderForStore() {
        return priceInOrderForStore;
    }

    /**
     * Sets the value of the priceInOrderForStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPriceInOrderForStore(JAXBElement<Boolean> value) {
        this.priceInOrderForStore = value;
    }

    /**
     * Gets the value of the coefficientOfVolumeWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCoefficientOfVolumeWeight() {
        return coefficientOfVolumeWeight;
    }

    /**
     * Sets the value of the coefficientOfVolumeWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCoefficientOfVolumeWeight(JAXBElement<Integer> value) {
        this.coefficientOfVolumeWeight = value;
    }

    /**
     * Gets the value of the weightLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getWeightLimit() {
        return weightLimit;
    }

    /**
     * Sets the value of the weightLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setWeightLimit(JAXBElement<Float> value) {
        this.weightLimit = value;
    }

    /**
     * Gets the value of the printProject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrintProject() {
        return printProject;
    }

    /**
     * Sets the value of the printProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrintProject(JAXBElement<Boolean> value) {
        this.printProject = value;
    }

    /**
     * Gets the value of the printDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrintDepartment() {
        return printDepartment;
    }

    /**
     * Sets the value of the printDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrintDepartment(JAXBElement<Boolean> value) {
        this.printDepartment = value;
    }

    /**
     * Gets the value of the cargoPackagesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCargoPackagesRequired() {
        return cargoPackagesRequired;
    }

    /**
     * Sets the value of the cargoPackagesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCargoPackagesRequired(JAXBElement<Boolean> value) {
        this.cargoPackagesRequired = value;
    }

    /**
     * Gets the value of the cargoDiscriptionRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCargoDiscriptionRequired() {
        return cargoDiscriptionRequired;
    }

    /**
     * Sets the value of the cargoDiscriptionRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCargoDiscriptionRequired(JAXBElement<Boolean> value) {
        this.cargoDiscriptionRequired = value;
    }

    /**
     * Gets the value of the recipientOfficialRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecipientOfficialRequired() {
        return recipientOfficialRequired;
    }

    /**
     * Sets the value of the recipientOfficialRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecipientOfficialRequired(JAXBElement<Boolean> value) {
        this.recipientOfficialRequired = value;
    }

    /**
     * Gets the value of the senderOfficialRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSenderOfficialRequired() {
        return senderOfficialRequired;
    }

    /**
     * Sets the value of the senderOfficialRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSenderOfficialRequired(JAXBElement<Boolean> value) {
        this.senderOfficialRequired = value;
    }

    /**
     * Gets the value of the clientOfficialRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getClientOfficialRequired() {
        return clientOfficialRequired;
    }

    /**
     * Sets the value of the clientOfficialRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setClientOfficialRequired(JAXBElement<Boolean> value) {
        this.clientOfficialRequired = value;
    }

    /**
     * Gets the value of the writeInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWriteInsuranceCost() {
        return writeInsuranceCost;
    }

    /**
     * Sets the value of the writeInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWriteInsuranceCost(JAXBElement<String> value) {
        this.writeInsuranceCost = value;
    }

    /**
     * Gets the value of the writeDeclaredCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWriteDeclaredCost() {
        return writeDeclaredCost;
    }

    /**
     * Sets the value of the writeDeclaredCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWriteDeclaredCost(JAXBElement<String> value) {
        this.writeDeclaredCost = value;
    }

    /**
     * Gets the value of the commentWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommentWaybill() {
        return commentWaybill;
    }

    /**
     * Sets the value of the commentWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommentWaybill(JAXBElement<String> value) {
        this.commentWaybill = value;
    }

    /**
     * Gets the value of the commentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommentOrder() {
        return commentOrder;
    }

    /**
     * Sets the value of the commentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommentOrder(JAXBElement<String> value) {
        this.commentOrder = value;
    }

    /**
     * Gets the value of the mainTypeOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainTypeOfDelivery() {
        return mainTypeOfDelivery;
    }

    /**
     * Sets the value of the mainTypeOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainTypeOfDelivery(JAXBElement<String> value) {
        this.mainTypeOfDelivery = value;
    }

    /**
     * Gets the value of the mainPayer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainPayer() {
        return mainPayer;
    }

    /**
     * Sets the value of the mainPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainPayer(JAXBElement<String> value) {
        this.mainPayer = value;
    }

    /**
     * Gets the value of the mainDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainDocument() {
        return mainDocument;
    }

    /**
     * Sets the value of the mainDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainDocument(JAXBElement<String> value) {
        this.mainDocument = value;
    }

    /**
     * Gets the value of the mainTypeOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainTypeOfCargo() {
        return mainTypeOfCargo;
    }

    /**
     * Sets the value of the mainTypeOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainTypeOfCargo(JAXBElement<String> value) {
        this.mainTypeOfCargo = value;
    }

    /**
     * Gets the value of the mainEmailRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainEmailRecipient() {
        return mainEmailRecipient;
    }

    /**
     * Sets the value of the mainEmailRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainEmailRecipient(JAXBElement<String> value) {
        this.mainEmailRecipient = value;
    }

    /**
     * Gets the value of the mainPhonelRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainPhonelRecipient() {
        return mainPhonelRecipient;
    }

    /**
     * Sets the value of the mainPhonelRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainPhonelRecipient(JAXBElement<String> value) {
        this.mainPhonelRecipient = value;
    }

    /**
     * Gets the value of the mainAddressRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainAddressRecipient() {
        return mainAddressRecipient;
    }

    /**
     * Sets the value of the mainAddressRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainAddressRecipient(JAXBElement<String> value) {
        this.mainAddressRecipient = value;
    }

    /**
     * Gets the value of the mainCommentRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainCommentRecipient() {
        return mainCommentRecipient;
    }

    /**
     * Sets the value of the mainCommentRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainCommentRecipient(JAXBElement<String> value) {
        this.mainCommentRecipient = value;
    }

    /**
     * Gets the value of the mainRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainRecipient() {
        return mainRecipient;
    }

    /**
     * Sets the value of the mainRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainRecipient(JAXBElement<String> value) {
        this.mainRecipient = value;
    }

    /**
     * Gets the value of the mainOfficialRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainOfficialRecipient() {
        return mainOfficialRecipient;
    }

    /**
     * Sets the value of the mainOfficialRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainOfficialRecipient(JAXBElement<String> value) {
        this.mainOfficialRecipient = value;
    }

    /**
     * Gets the value of the mainGeographyRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainGeographyRecipient() {
        return mainGeographyRecipient;
    }

    /**
     * Sets the value of the mainGeographyRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainGeographyRecipient(JAXBElement<String> value) {
        this.mainGeographyRecipient = value;
    }

    /**
     * Gets the value of the mainEmailSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainEmailSender() {
        return mainEmailSender;
    }

    /**
     * Sets the value of the mainEmailSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainEmailSender(JAXBElement<String> value) {
        this.mainEmailSender = value;
    }

    /**
     * Gets the value of the mainPhonelSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainPhonelSender() {
        return mainPhonelSender;
    }

    /**
     * Sets the value of the mainPhonelSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainPhonelSender(JAXBElement<String> value) {
        this.mainPhonelSender = value;
    }

    /**
     * Gets the value of the mainSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainSender() {
        return mainSender;
    }

    /**
     * Sets the value of the mainSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainSender(JAXBElement<String> value) {
        this.mainSender = value;
    }

    /**
     * Gets the value of the mainCommentSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainCommentSender() {
        return mainCommentSender;
    }

    /**
     * Sets the value of the mainCommentSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainCommentSender(JAXBElement<String> value) {
        this.mainCommentSender = value;
    }

    /**
     * Gets the value of the mainAddressSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainAddressSender() {
        return mainAddressSender;
    }

    /**
     * Sets the value of the mainAddressSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainAddressSender(JAXBElement<String> value) {
        this.mainAddressSender = value;
    }

    /**
     * Gets the value of the mainOfficialSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainOfficialSender() {
        return mainOfficialSender;
    }

    /**
     * Sets the value of the mainOfficialSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainOfficialSender(JAXBElement<String> value) {
        this.mainOfficialSender = value;
    }

    /**
     * Gets the value of the mainGeographySender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainGeographySender() {
        return mainGeographySender;
    }

    /**
     * Sets the value of the mainGeographySender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainGeographySender(JAXBElement<String> value) {
        this.mainGeographySender = value;
    }

    /**
     * Gets the value of the projectRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getProjectRequired() {
        return projectRequired;
    }

    /**
     * Sets the value of the projectRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setProjectRequired(JAXBElement<Boolean> value) {
        this.projectRequired = value;
    }

    /**
     * Gets the value of the determineIntakeOffice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDetermineIntakeOffice() {
        return determineIntakeOffice;
    }

    /**
     * Sets the value of the determineIntakeOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDetermineIntakeOffice(JAXBElement<Boolean> value) {
        this.determineIntakeOffice = value;
    }

    /**
     * Gets the value of the enebleCOD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnebleCOD() {
        return enebleCOD;
    }

    /**
     * Sets the value of the enebleCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnebleCOD(JAXBElement<Boolean> value) {
        this.enebleCOD = value;
    }

    /**
     * Gets the value of the enebleDateTimeDepart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnebleDateTimeDepart() {
        return enebleDateTimeDepart;
    }

    /**
     * Sets the value of the enebleDateTimeDepart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnebleDateTimeDepart(JAXBElement<Boolean> value) {
        this.enebleDateTimeDepart = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setContacts(JAXBElement<Address> value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the typeOfDeliveryOfCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getTypeOfDeliveryOfCargo() {
        return typeOfDeliveryOfCargo;
    }

    /**
     * Sets the value of the typeOfDeliveryOfCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setTypeOfDeliveryOfCargo(JAXBElement<ListOfCorrespondences> value) {
        this.typeOfDeliveryOfCargo = value;
    }

    /**
     * Gets the value of the useOptionallyAnalytics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseOptionallyAnalytics() {
        return useOptionallyAnalytics;
    }

    /**
     * Sets the value of the useOptionallyAnalytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseOptionallyAnalytics(JAXBElement<Boolean> value) {
        this.useOptionallyAnalytics = value;
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

    /**
     * Gets the value of the declaredLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDeclaredLimit() {
        return declaredLimit;
    }

    /**
     * Sets the value of the declaredLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDeclaredLimit(JAXBElement<Float> value) {
        this.declaredLimit = value;
    }

    /**
     * Gets the value of the insuranceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getInsuranceLimit() {
        return insuranceLimit;
    }

    /**
     * Sets the value of the insuranceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setInsuranceLimit(JAXBElement<Float> value) {
        this.insuranceLimit = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public JAXBElement<ListOfCorrespondences> getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}
     *     
     */
    public void setRestrictions(JAXBElement<ListOfCorrespondences> value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the preliminaryCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreliminaryCost() {
        return preliminaryCost;
    }

    /**
     * Sets the value of the preliminaryCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreliminaryCost(JAXBElement<Boolean> value) {
        this.preliminaryCost = value;
    }

    /**
     * Gets the value of the availableFunctionalCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAvailableFunctionalCategory() {
        return availableFunctionalCategory;
    }

    /**
     * Sets the value of the availableFunctionalCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAvailableFunctionalCategory(JAXBElement<Boolean> value) {
        this.availableFunctionalCategory = value;
    }

    /**
     * Gets the value of the changeCustomerGoods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getChangeCustomerGoods() {
        return changeCustomerGoods;
    }

    /**
     * Sets the value of the changeCustomerGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setChangeCustomerGoods(JAXBElement<Boolean> value) {
        this.changeCustomerGoods = value;
    }

    /**
     * Gets the value of the createCustomerGoods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateCustomerGoods() {
        return createCustomerGoods;
    }

    /**
     * Sets the value of the createCustomerGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateCustomerGoods(JAXBElement<Boolean> value) {
        this.createCustomerGoods = value;
    }

    /**
     * Gets the value of the changeCustomerGoodsPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getChangeCustomerGoodsPhoto() {
        return changeCustomerGoodsPhoto;
    }

    /**
     * Sets the value of the changeCustomerGoodsPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setChangeCustomerGoodsPhoto(JAXBElement<Boolean> value) {
        this.changeCustomerGoodsPhoto = value;
    }

    /**
     * Gets the value of the createCustomerGoodsPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateCustomerGoodsPhoto() {
        return createCustomerGoodsPhoto;
    }

    /**
     * Sets the value of the createCustomerGoodsPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateCustomerGoodsPhoto(JAXBElement<Boolean> value) {
        this.createCustomerGoodsPhoto = value;
    }

    /**
     * Gets the value of the fieldsProjectCustomerGoods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldsProjectCustomerGoods() {
        return fieldsProjectCustomerGoods;
    }

    /**
     * Sets the value of the fieldsProjectCustomerGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldsProjectCustomerGoods(JAXBElement<String> value) {
        this.fieldsProjectCustomerGoods = value;
    }

    /**
     * Gets the value of the editRecipientInOrderForApproval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEditRecipientInOrderForApproval() {
        return editRecipientInOrderForApproval;
    }

    /**
     * Sets the value of the editRecipientInOrderForApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEditRecipientInOrderForApproval(JAXBElement<Boolean> value) {
        this.editRecipientInOrderForApproval = value;
    }

    /**
     * Gets the value of the requiresOrderConfirmationWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRequiresOrderConfirmationWarehouse() {
        return requiresOrderConfirmationWarehouse;
    }

    /**
     * Sets the value of the requiresOrderConfirmationWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRequiresOrderConfirmationWarehouse(JAXBElement<Boolean> value) {
        this.requiresOrderConfirmationWarehouse = value;
    }

    /**
     * Gets the value of the createProjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateProjects() {
        return createProjects;
    }

    /**
     * Sets the value of the createProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateProjects(JAXBElement<Boolean> value) {
        this.createProjects = value;
    }

    /**
     * Gets the value of the createDepartments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateDepartments() {
        return createDepartments;
    }

    /**
     * Sets the value of the createDepartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateDepartments(JAXBElement<Boolean> value) {
        this.createDepartments = value;
    }

    /**
     * Gets the value of the createOfficials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateOfficials() {
        return createOfficials;
    }

    /**
     * Sets the value of the createOfficials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateOfficials(JAXBElement<Boolean> value) {
        this.createOfficials = value;
    }

    /**
     * Gets the value of the recipientEmailRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecipientEmailRequired() {
        return recipientEmailRequired;
    }

    /**
     * Sets the value of the recipientEmailRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecipientEmailRequired(JAXBElement<Boolean> value) {
        this.recipientEmailRequired = value;
    }

    /**
     * Gets the value of the senderEmailRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSenderEmailRequired() {
        return senderEmailRequired;
    }

    /**
     * Sets the value of the senderEmailRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSenderEmailRequired(JAXBElement<Boolean> value) {
        this.senderEmailRequired = value;
    }

    /**
     * Gets the value of the splitAnAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSplitAnAddressBook() {
        return splitAnAddressBook;
    }

    /**
     * Sets the value of the splitAnAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSplitAnAddressBook(JAXBElement<Boolean> value) {
        this.splitAnAddressBook = value;
    }

    /**
     * Gets the value of the useOwnAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseOwnAddressBook() {
        return useOwnAddressBook;
    }

    /**
     * Sets the value of the useOwnAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseOwnAddressBook(JAXBElement<Boolean> value) {
        this.useOwnAddressBook = value;
    }

}
