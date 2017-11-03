
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputSettingsCustomersGoodsReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputSettingsCustomersGoodsReport3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberWaybill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfoWaybill" type="{http://www.cse-cargo.ru/client}InfoWaybillReports" minOccurs="0"/&gt;
 *         &lt;element name="InfoCargo" type="{http://www.cse-cargo.ru/client}InfoCargoReports" minOccurs="0"/&gt;
 *         &lt;element name="InfoDelivery" type="{http://www.cse-cargo.ru/client}InfoDeliveryReports" minOccurs="0"/&gt;
 *         &lt;element name="InfoTrace" type="{http://www.cse-cargo.ru/client}InfoTraceReports" minOccurs="0"/&gt;
 *         &lt;element name="InfoState" type="{http://www.cse-cargo.ru/client}InfoStateReports" minOccurs="0"/&gt;
 *         &lt;element name="InfoDeliveryTime" type="{http://www.cse-cargo.ru/client}InfoDeliveryTimeReports" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputSettingsCustomersGoodsReport3", propOrder = {
    "numberWaybill",
    "numberOfOrder",
    "infoWaybill",
    "infoCargo",
    "infoDelivery",
    "infoTrace",
    "infoState",
    "infoDeliveryTime"
})
public class OutputSettingsCustomersGoodsReport3 {

    @XmlElementRef(name = "NumberWaybill", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberWaybill;
    @XmlElementRef(name = "NumberOfOrder", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberOfOrder;
    @XmlElementRef(name = "InfoWaybill", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<InfoWaybillReports> infoWaybill;
    @XmlElementRef(name = "InfoCargo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<InfoCargoReports> infoCargo;
    @XmlElementRef(name = "InfoDelivery", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<InfoDeliveryReports> infoDelivery;
    @XmlElementRef(name = "InfoTrace", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<InfoTraceReports> infoTrace;
    @XmlElementRef(name = "InfoState", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<InfoStateReports> infoState;
    @XmlElementRef(name = "InfoDeliveryTime", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<InfoDeliveryTimeReports> infoDeliveryTime;

    /**
     * Gets the value of the numberWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberWaybill() {
        return numberWaybill;
    }

    /**
     * Sets the value of the numberWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberWaybill(JAXBElement<String> value) {
        this.numberWaybill = value;
    }

    /**
     * Gets the value of the numberOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberOfOrder() {
        return numberOfOrder;
    }

    /**
     * Sets the value of the numberOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberOfOrder(JAXBElement<String> value) {
        this.numberOfOrder = value;
    }

    /**
     * Gets the value of the infoWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfoWaybillReports }{@code >}
     *     
     */
    public JAXBElement<InfoWaybillReports> getInfoWaybill() {
        return infoWaybill;
    }

    /**
     * Sets the value of the infoWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfoWaybillReports }{@code >}
     *     
     */
    public void setInfoWaybill(JAXBElement<InfoWaybillReports> value) {
        this.infoWaybill = value;
    }

    /**
     * Gets the value of the infoCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfoCargoReports }{@code >}
     *     
     */
    public JAXBElement<InfoCargoReports> getInfoCargo() {
        return infoCargo;
    }

    /**
     * Sets the value of the infoCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfoCargoReports }{@code >}
     *     
     */
    public void setInfoCargo(JAXBElement<InfoCargoReports> value) {
        this.infoCargo = value;
    }

    /**
     * Gets the value of the infoDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfoDeliveryReports }{@code >}
     *     
     */
    public JAXBElement<InfoDeliveryReports> getInfoDelivery() {
        return infoDelivery;
    }

    /**
     * Sets the value of the infoDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfoDeliveryReports }{@code >}
     *     
     */
    public void setInfoDelivery(JAXBElement<InfoDeliveryReports> value) {
        this.infoDelivery = value;
    }

    /**
     * Gets the value of the infoTrace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfoTraceReports }{@code >}
     *     
     */
    public JAXBElement<InfoTraceReports> getInfoTrace() {
        return infoTrace;
    }

    /**
     * Sets the value of the infoTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfoTraceReports }{@code >}
     *     
     */
    public void setInfoTrace(JAXBElement<InfoTraceReports> value) {
        this.infoTrace = value;
    }

    /**
     * Gets the value of the infoState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfoStateReports }{@code >}
     *     
     */
    public JAXBElement<InfoStateReports> getInfoState() {
        return infoState;
    }

    /**
     * Sets the value of the infoState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfoStateReports }{@code >}
     *     
     */
    public void setInfoState(JAXBElement<InfoStateReports> value) {
        this.infoState = value;
    }

    /**
     * Gets the value of the infoDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InfoDeliveryTimeReports }{@code >}
     *     
     */
    public JAXBElement<InfoDeliveryTimeReports> getInfoDeliveryTime() {
        return infoDeliveryTime;
    }

    /**
     * Sets the value of the infoDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InfoDeliveryTimeReports }{@code >}
     *     
     */
    public void setInfoDeliveryTime(JAXBElement<InfoDeliveryTimeReports> value) {
        this.infoDeliveryTime = value;
    }

}
