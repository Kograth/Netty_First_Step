
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessClient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AddOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Calc" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CancelOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CustomersGoods" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EditAddressBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EditCargoDescriptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EditContacts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EditDepartments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EditOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EditProjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EnableSelectAnotherContact" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InternetShop" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InvoicesDetailing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OrderForAutoReservation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RegisterOfOrders" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShipmentOfGoodsInWaybills" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StorehouseBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Tracking" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewWaybill" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanSeeAnyDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkOwnDocumentOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseTemplateDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportAgentCod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GetScan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GoodsWarehouse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GetPhotoGoods" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseAddressFromBookOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessClient", propOrder = {
    "addDistribution",
    "addOrder",
    "calc",
    "cancelOrder",
    "customersGoods",
    "editAddressBook",
    "editCargoDescriptions",
    "editContacts",
    "editDepartments",
    "editOrder",
    "editProjects",
    "enableSelectAnotherContact",
    "internetShop",
    "invoicesDetailing",
    "orderForAutoReservation",
    "registerOfOrders",
    "shipmentOfGoodsInWaybills",
    "storehouseBalance",
    "tracking",
    "viewOrder",
    "viewWaybill",
    "canChangePassword",
    "canSeeAnyDocuments",
    "workOwnDocumentOnly",
    "useTemplateDocuments",
    "reportAgentCod",
    "getScan",
    "goodsWarehouse",
    "getPhotoGoods",
    "useAddressFromBookOnly"
})
public class AccessClient {

    @XmlElement(name = "AddDistribution")
    protected boolean addDistribution;
    @XmlElement(name = "AddOrder")
    protected boolean addOrder;
    @XmlElement(name = "Calc")
    protected boolean calc;
    @XmlElement(name = "CancelOrder")
    protected boolean cancelOrder;
    @XmlElement(name = "CustomersGoods")
    protected boolean customersGoods;
    @XmlElement(name = "EditAddressBook")
    protected boolean editAddressBook;
    @XmlElement(name = "EditCargoDescriptions")
    protected boolean editCargoDescriptions;
    @XmlElement(name = "EditContacts")
    protected boolean editContacts;
    @XmlElement(name = "EditDepartments")
    protected boolean editDepartments;
    @XmlElement(name = "EditOrder")
    protected boolean editOrder;
    @XmlElement(name = "EditProjects")
    protected boolean editProjects;
    @XmlElement(name = "EnableSelectAnotherContact")
    protected boolean enableSelectAnotherContact;
    @XmlElement(name = "InternetShop")
    protected boolean internetShop;
    @XmlElement(name = "InvoicesDetailing")
    protected boolean invoicesDetailing;
    @XmlElement(name = "OrderForAutoReservation")
    protected boolean orderForAutoReservation;
    @XmlElement(name = "RegisterOfOrders")
    protected boolean registerOfOrders;
    @XmlElement(name = "ShipmentOfGoodsInWaybills")
    protected boolean shipmentOfGoodsInWaybills;
    @XmlElement(name = "StorehouseBalance")
    protected boolean storehouseBalance;
    @XmlElement(name = "Tracking")
    protected boolean tracking;
    @XmlElement(name = "ViewOrder")
    protected boolean viewOrder;
    @XmlElement(name = "ViewWaybill")
    protected boolean viewWaybill;
    @XmlElementRef(name = "CanChangePassword", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> canChangePassword;
    @XmlElementRef(name = "CanSeeAnyDocuments", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> canSeeAnyDocuments;
    @XmlElementRef(name = "WorkOwnDocumentOnly", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> workOwnDocumentOnly;
    @XmlElementRef(name = "UseTemplateDocuments", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useTemplateDocuments;
    @XmlElementRef(name = "ReportAgentCod", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reportAgentCod;
    @XmlElementRef(name = "GetScan", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> getScan;
    @XmlElement(name = "GoodsWarehouse")
    protected boolean goodsWarehouse;
    @XmlElementRef(name = "GetPhotoGoods", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> getPhotoGoods;
    @XmlElementRef(name = "UseAddressFromBookOnly", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useAddressFromBookOnly;

    /**
     * Gets the value of the addDistribution property.
     * 
     */
    public boolean isAddDistribution() {
        return addDistribution;
    }

    /**
     * Sets the value of the addDistribution property.
     * 
     */
    public void setAddDistribution(boolean value) {
        this.addDistribution = value;
    }

    /**
     * Gets the value of the addOrder property.
     * 
     */
    public boolean isAddOrder() {
        return addOrder;
    }

    /**
     * Sets the value of the addOrder property.
     * 
     */
    public void setAddOrder(boolean value) {
        this.addOrder = value;
    }

    /**
     * Gets the value of the calc property.
     * 
     */
    public boolean isCalc() {
        return calc;
    }

    /**
     * Sets the value of the calc property.
     * 
     */
    public void setCalc(boolean value) {
        this.calc = value;
    }

    /**
     * Gets the value of the cancelOrder property.
     * 
     */
    public boolean isCancelOrder() {
        return cancelOrder;
    }

    /**
     * Sets the value of the cancelOrder property.
     * 
     */
    public void setCancelOrder(boolean value) {
        this.cancelOrder = value;
    }

    /**
     * Gets the value of the customersGoods property.
     * 
     */
    public boolean isCustomersGoods() {
        return customersGoods;
    }

    /**
     * Sets the value of the customersGoods property.
     * 
     */
    public void setCustomersGoods(boolean value) {
        this.customersGoods = value;
    }

    /**
     * Gets the value of the editAddressBook property.
     * 
     */
    public boolean isEditAddressBook() {
        return editAddressBook;
    }

    /**
     * Sets the value of the editAddressBook property.
     * 
     */
    public void setEditAddressBook(boolean value) {
        this.editAddressBook = value;
    }

    /**
     * Gets the value of the editCargoDescriptions property.
     * 
     */
    public boolean isEditCargoDescriptions() {
        return editCargoDescriptions;
    }

    /**
     * Sets the value of the editCargoDescriptions property.
     * 
     */
    public void setEditCargoDescriptions(boolean value) {
        this.editCargoDescriptions = value;
    }

    /**
     * Gets the value of the editContacts property.
     * 
     */
    public boolean isEditContacts() {
        return editContacts;
    }

    /**
     * Sets the value of the editContacts property.
     * 
     */
    public void setEditContacts(boolean value) {
        this.editContacts = value;
    }

    /**
     * Gets the value of the editDepartments property.
     * 
     */
    public boolean isEditDepartments() {
        return editDepartments;
    }

    /**
     * Sets the value of the editDepartments property.
     * 
     */
    public void setEditDepartments(boolean value) {
        this.editDepartments = value;
    }

    /**
     * Gets the value of the editOrder property.
     * 
     */
    public boolean isEditOrder() {
        return editOrder;
    }

    /**
     * Sets the value of the editOrder property.
     * 
     */
    public void setEditOrder(boolean value) {
        this.editOrder = value;
    }

    /**
     * Gets the value of the editProjects property.
     * 
     */
    public boolean isEditProjects() {
        return editProjects;
    }

    /**
     * Sets the value of the editProjects property.
     * 
     */
    public void setEditProjects(boolean value) {
        this.editProjects = value;
    }

    /**
     * Gets the value of the enableSelectAnotherContact property.
     * 
     */
    public boolean isEnableSelectAnotherContact() {
        return enableSelectAnotherContact;
    }

    /**
     * Sets the value of the enableSelectAnotherContact property.
     * 
     */
    public void setEnableSelectAnotherContact(boolean value) {
        this.enableSelectAnotherContact = value;
    }

    /**
     * Gets the value of the internetShop property.
     * 
     */
    public boolean isInternetShop() {
        return internetShop;
    }

    /**
     * Sets the value of the internetShop property.
     * 
     */
    public void setInternetShop(boolean value) {
        this.internetShop = value;
    }

    /**
     * Gets the value of the invoicesDetailing property.
     * 
     */
    public boolean isInvoicesDetailing() {
        return invoicesDetailing;
    }

    /**
     * Sets the value of the invoicesDetailing property.
     * 
     */
    public void setInvoicesDetailing(boolean value) {
        this.invoicesDetailing = value;
    }

    /**
     * Gets the value of the orderForAutoReservation property.
     * 
     */
    public boolean isOrderForAutoReservation() {
        return orderForAutoReservation;
    }

    /**
     * Sets the value of the orderForAutoReservation property.
     * 
     */
    public void setOrderForAutoReservation(boolean value) {
        this.orderForAutoReservation = value;
    }

    /**
     * Gets the value of the registerOfOrders property.
     * 
     */
    public boolean isRegisterOfOrders() {
        return registerOfOrders;
    }

    /**
     * Sets the value of the registerOfOrders property.
     * 
     */
    public void setRegisterOfOrders(boolean value) {
        this.registerOfOrders = value;
    }

    /**
     * Gets the value of the shipmentOfGoodsInWaybills property.
     * 
     */
    public boolean isShipmentOfGoodsInWaybills() {
        return shipmentOfGoodsInWaybills;
    }

    /**
     * Sets the value of the shipmentOfGoodsInWaybills property.
     * 
     */
    public void setShipmentOfGoodsInWaybills(boolean value) {
        this.shipmentOfGoodsInWaybills = value;
    }

    /**
     * Gets the value of the storehouseBalance property.
     * 
     */
    public boolean isStorehouseBalance() {
        return storehouseBalance;
    }

    /**
     * Sets the value of the storehouseBalance property.
     * 
     */
    public void setStorehouseBalance(boolean value) {
        this.storehouseBalance = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     */
    public boolean isTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     */
    public void setTracking(boolean value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the viewOrder property.
     * 
     */
    public boolean isViewOrder() {
        return viewOrder;
    }

    /**
     * Sets the value of the viewOrder property.
     * 
     */
    public void setViewOrder(boolean value) {
        this.viewOrder = value;
    }

    /**
     * Gets the value of the viewWaybill property.
     * 
     */
    public boolean isViewWaybill() {
        return viewWaybill;
    }

    /**
     * Sets the value of the viewWaybill property.
     * 
     */
    public void setViewWaybill(boolean value) {
        this.viewWaybill = value;
    }

    /**
     * Gets the value of the canChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCanChangePassword() {
        return canChangePassword;
    }

    /**
     * Sets the value of the canChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCanChangePassword(JAXBElement<Boolean> value) {
        this.canChangePassword = value;
    }

    /**
     * Gets the value of the canSeeAnyDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCanSeeAnyDocuments() {
        return canSeeAnyDocuments;
    }

    /**
     * Sets the value of the canSeeAnyDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCanSeeAnyDocuments(JAXBElement<Boolean> value) {
        this.canSeeAnyDocuments = value;
    }

    /**
     * Gets the value of the workOwnDocumentOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWorkOwnDocumentOnly() {
        return workOwnDocumentOnly;
    }

    /**
     * Sets the value of the workOwnDocumentOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWorkOwnDocumentOnly(JAXBElement<Boolean> value) {
        this.workOwnDocumentOnly = value;
    }

    /**
     * Gets the value of the useTemplateDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseTemplateDocuments() {
        return useTemplateDocuments;
    }

    /**
     * Sets the value of the useTemplateDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseTemplateDocuments(JAXBElement<Boolean> value) {
        this.useTemplateDocuments = value;
    }

    /**
     * Gets the value of the reportAgentCod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReportAgentCod() {
        return reportAgentCod;
    }

    /**
     * Sets the value of the reportAgentCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReportAgentCod(JAXBElement<Boolean> value) {
        this.reportAgentCod = value;
    }

    /**
     * Gets the value of the getScan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGetScan() {
        return getScan;
    }

    /**
     * Sets the value of the getScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGetScan(JAXBElement<Boolean> value) {
        this.getScan = value;
    }

    /**
     * Gets the value of the goodsWarehouse property.
     * 
     */
    public boolean isGoodsWarehouse() {
        return goodsWarehouse;
    }

    /**
     * Sets the value of the goodsWarehouse property.
     * 
     */
    public void setGoodsWarehouse(boolean value) {
        this.goodsWarehouse = value;
    }

    /**
     * Gets the value of the getPhotoGoods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGetPhotoGoods() {
        return getPhotoGoods;
    }

    /**
     * Sets the value of the getPhotoGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGetPhotoGoods(JAXBElement<Boolean> value) {
        this.getPhotoGoods = value;
    }

    /**
     * Gets the value of the useAddressFromBookOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseAddressFromBookOnly() {
        return useAddressFromBookOnly;
    }

    /**
     * Sets the value of the useAddressFromBookOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseAddressFromBookOnly(JAXBElement<Boolean> value) {
        this.useAddressFromBookOnly = value;
    }

}
