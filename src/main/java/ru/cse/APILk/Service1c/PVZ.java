
package ru.cse.APILk.Service1c;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PVZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PVZ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Geography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfPVZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodePVZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightLimite" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HightLimite" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="LengthLimite" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="WidthLimite" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MaxDimensionLimite" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SumDimensionLimite" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="QtyLimite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CODLimite" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="IssuanceOfShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentByCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentByCash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReceivingSending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TryOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartialBuyout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpeningHours" type="{http://www.cse-cargo.ru/client}OpeningHours" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Geo" type="{http://www.cse-cargo.ru/client}Geo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PVZ", propOrder = {
    "guid",
    "name",
    "office",
    "geography",
    "phone",
    "address",
    "typeOfPVZ",
    "codePVZ",
    "weightLimite",
    "hightLimite",
    "lengthLimite",
    "widthLimite",
    "maxDimensionLimite",
    "sumDimensionLimite",
    "qtyLimite",
    "codLimite",
    "issuanceOfShipping",
    "paymentByCard",
    "paymentByCash",
    "receivingSending",
    "tryOn",
    "partialBuyout",
    "openingHours",
    "geo"
})
public class PVZ {

    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElementRef(name = "Office", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "Geography", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geography;
    @XmlElementRef(name = "Phone", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "Address", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "TypeOfPVZ", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeOfPVZ;
    @XmlElementRef(name = "CodePVZ", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codePVZ;
    @XmlElementRef(name = "WeightLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> weightLimite;
    @XmlElementRef(name = "HightLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> hightLimite;
    @XmlElementRef(name = "LengthLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> lengthLimite;
    @XmlElementRef(name = "WidthLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> widthLimite;
    @XmlElementRef(name = "MaxDimensionLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> maxDimensionLimite;
    @XmlElementRef(name = "SumDimensionLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> sumDimensionLimite;
    @XmlElementRef(name = "QtyLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qtyLimite;
    @XmlElementRef(name = "CODLimite", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> codLimite;
    @XmlElementRef(name = "IssuanceOfShipping", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> issuanceOfShipping;
    @XmlElementRef(name = "PaymentByCard", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paymentByCard;
    @XmlElementRef(name = "PaymentByCash", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paymentByCash;
    @XmlElementRef(name = "ReceivingSending", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> receivingSending;
    @XmlElementRef(name = "TryOn", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tryOn;
    @XmlElementRef(name = "PartialBuyout", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> partialBuyout;
    @XmlElement(name = "OpeningHours", nillable = true)
    protected List<OpeningHours> openingHours;
    @XmlElement(name = "Geo", nillable = true)
    protected List<Geo> geo;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the geography property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeography() {
        return geography;
    }

    /**
     * Sets the value of the geography property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeography(JAXBElement<String> value) {
        this.geography = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the typeOfPVZ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeOfPVZ() {
        return typeOfPVZ;
    }

    /**
     * Sets the value of the typeOfPVZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeOfPVZ(JAXBElement<String> value) {
        this.typeOfPVZ = value;
    }

    /**
     * Gets the value of the codePVZ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodePVZ() {
        return codePVZ;
    }

    /**
     * Sets the value of the codePVZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodePVZ(JAXBElement<String> value) {
        this.codePVZ = value;
    }

    /**
     * Gets the value of the weightLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getWeightLimite() {
        return weightLimite;
    }

    /**
     * Sets the value of the weightLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setWeightLimite(JAXBElement<Float> value) {
        this.weightLimite = value;
    }

    /**
     * Gets the value of the hightLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getHightLimite() {
        return hightLimite;
    }

    /**
     * Sets the value of the hightLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setHightLimite(JAXBElement<Float> value) {
        this.hightLimite = value;
    }

    /**
     * Gets the value of the lengthLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getLengthLimite() {
        return lengthLimite;
    }

    /**
     * Sets the value of the lengthLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setLengthLimite(JAXBElement<Float> value) {
        this.lengthLimite = value;
    }

    /**
     * Gets the value of the widthLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getWidthLimite() {
        return widthLimite;
    }

    /**
     * Sets the value of the widthLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setWidthLimite(JAXBElement<Float> value) {
        this.widthLimite = value;
    }

    /**
     * Gets the value of the maxDimensionLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getMaxDimensionLimite() {
        return maxDimensionLimite;
    }

    /**
     * Sets the value of the maxDimensionLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setMaxDimensionLimite(JAXBElement<Float> value) {
        this.maxDimensionLimite = value;
    }

    /**
     * Gets the value of the sumDimensionLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getSumDimensionLimite() {
        return sumDimensionLimite;
    }

    /**
     * Sets the value of the sumDimensionLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setSumDimensionLimite(JAXBElement<Float> value) {
        this.sumDimensionLimite = value;
    }

    /**
     * Gets the value of the qtyLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQtyLimite() {
        return qtyLimite;
    }

    /**
     * Sets the value of the qtyLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQtyLimite(JAXBElement<Integer> value) {
        this.qtyLimite = value;
    }

    /**
     * Gets the value of the codLimite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getCODLimite() {
        return codLimite;
    }

    /**
     * Sets the value of the codLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setCODLimite(JAXBElement<Float> value) {
        this.codLimite = value;
    }

    /**
     * Gets the value of the issuanceOfShipping property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIssuanceOfShipping() {
        return issuanceOfShipping;
    }

    /**
     * Sets the value of the issuanceOfShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIssuanceOfShipping(JAXBElement<Boolean> value) {
        this.issuanceOfShipping = value;
    }

    /**
     * Gets the value of the paymentByCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaymentByCard() {
        return paymentByCard;
    }

    /**
     * Sets the value of the paymentByCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaymentByCard(JAXBElement<Boolean> value) {
        this.paymentByCard = value;
    }

    /**
     * Gets the value of the paymentByCash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaymentByCash() {
        return paymentByCash;
    }

    /**
     * Sets the value of the paymentByCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaymentByCash(JAXBElement<Boolean> value) {
        this.paymentByCash = value;
    }

    /**
     * Gets the value of the receivingSending property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReceivingSending() {
        return receivingSending;
    }

    /**
     * Sets the value of the receivingSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReceivingSending(JAXBElement<Boolean> value) {
        this.receivingSending = value;
    }

    /**
     * Gets the value of the tryOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTryOn() {
        return tryOn;
    }

    /**
     * Sets the value of the tryOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTryOn(JAXBElement<Boolean> value) {
        this.tryOn = value;
    }

    /**
     * Gets the value of the partialBuyout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPartialBuyout() {
        return partialBuyout;
    }

    /**
     * Sets the value of the partialBuyout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPartialBuyout(JAXBElement<Boolean> value) {
        this.partialBuyout = value;
    }

    /**
     * Gets the value of the openingHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openingHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpeningHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpeningHours }
     * 
     * 
     */
    public List<OpeningHours> getOpeningHours() {
        if (openingHours == null) {
            openingHours = new ArrayList<OpeningHours>();
        }
        return this.openingHours;
    }

    /**
     * Gets the value of the geo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Geo }
     * 
     * 
     */
    public List<Geo> getGeo() {
        if (geo == null) {
            geo = new ArrayList<Geo>();
        }
        return this.geo;
    }

}
