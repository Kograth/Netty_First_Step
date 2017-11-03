
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
 * <p>Java class for Correspondence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Correspondence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueOtherLanguages" type="{http://www.cse-cargo.ru/client}Correspondence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InformationOtherLanguages" type="{http://www.cse-cargo.ru/client}Correspondence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Codes" type="{http://www.cse-cargo.ru/client}Codes" minOccurs="0"/&gt;
 *         &lt;element name="BankProperties" type="{http://www.cse-cargo.ru/client}BankProperties" minOccurs="0"/&gt;
 *         &lt;element name="DocumentProperties" type="{http://www.cse-cargo.ru/client}DocumentProperties" minOccurs="0"/&gt;
 *         &lt;element name="GeographyProperties" type="{http://www.cse-cargo.ru/client}GeographyProperties" minOccurs="0"/&gt;
 *         &lt;element name="TariffProperties" type="{http://www.cse-cargo.ru/client}TariffProperties" minOccurs="0"/&gt;
 *         &lt;element name="Erase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PackageProperties" type="{http://www.cse-cargo.ru/client}PackageProperties" minOccurs="0"/&gt;
 *         &lt;element name="ContactsProperties" type="{http://www.cse-cargo.ru/client}Contacts" minOccurs="0"/&gt;
 *         &lt;element name="ProductParties" type="{http://www.cse-cargo.ru/client}ProductParties" minOccurs="0"/&gt;
 *         &lt;element name="ClientProducts" type="{http://www.cse-cargo.ru/client}ClientProducts" minOccurs="0"/&gt;
 *         &lt;element name="Payables" type="{http://www.cse-cargo.ru/client}Payable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Correspondence", propOrder = {
    "key",
    "value",
    "valueOtherLanguages",
    "information",
    "informationOtherLanguages",
    "_default",
    "codes",
    "bankProperties",
    "documentProperties",
    "geographyProperties",
    "tariffProperties",
    "erase",
    "packageProperties",
    "contactsProperties",
    "productParties",
    "clientProducts",
    "payables"
})
public class Correspondence {

    @XmlElementRef(name = "Key", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElementRef(name = "Value", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> value;
    @XmlElement(name = "ValueOtherLanguages", nillable = true)
    protected List<Correspondence> valueOtherLanguages;
    @XmlElementRef(name = "Information", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> information;
    @XmlElement(name = "InformationOtherLanguages", nillable = true)
    protected List<Correspondence> informationOtherLanguages;
    @XmlElementRef(name = "Default", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> _default;
    @XmlElementRef(name = "Codes", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Codes> codes;
    @XmlElementRef(name = "BankProperties", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<BankProperties> bankProperties;
    @XmlElementRef(name = "DocumentProperties", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentProperties> documentProperties;
    @XmlElementRef(name = "GeographyProperties", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<GeographyProperties> geographyProperties;
    @XmlElementRef(name = "TariffProperties", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<TariffProperties> tariffProperties;
    @XmlElementRef(name = "Erase", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erase;
    @XmlElementRef(name = "PackageProperties", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<PackageProperties> packageProperties;
    @XmlElementRef(name = "ContactsProperties", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Contacts> contactsProperties;
    @XmlElementRef(name = "ProductParties", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductParties> productParties;
    @XmlElementRef(name = "ClientProducts", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientProducts> clientProducts;
    @XmlElement(name = "Payables", nillable = true)
    protected List<Payable> payables;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKey(JAXBElement<String> value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueOtherLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueOtherLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueOtherLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Correspondence }
     * 
     * 
     */
    public List<Correspondence> getValueOtherLanguages() {
        if (valueOtherLanguages == null) {
            valueOtherLanguages = new ArrayList<Correspondence>();
        }
        return this.valueOtherLanguages;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInformation(JAXBElement<String> value) {
        this.information = value;
    }

    /**
     * Gets the value of the informationOtherLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationOtherLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationOtherLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Correspondence }
     * 
     * 
     */
    public List<Correspondence> getInformationOtherLanguages() {
        if (informationOtherLanguages == null) {
            informationOtherLanguages = new ArrayList<Correspondence>();
        }
        return this.informationOtherLanguages;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDefault(JAXBElement<Boolean> value) {
        this._default = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Codes }{@code >}
     *     
     */
    public JAXBElement<Codes> getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Codes }{@code >}
     *     
     */
    public void setCodes(JAXBElement<Codes> value) {
        this.codes = value;
    }

    /**
     * Gets the value of the bankProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankProperties }{@code >}
     *     
     */
    public JAXBElement<BankProperties> getBankProperties() {
        return bankProperties;
    }

    /**
     * Sets the value of the bankProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankProperties }{@code >}
     *     
     */
    public void setBankProperties(JAXBElement<BankProperties> value) {
        this.bankProperties = value;
    }

    /**
     * Gets the value of the documentProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentProperties }{@code >}
     *     
     */
    public JAXBElement<DocumentProperties> getDocumentProperties() {
        return documentProperties;
    }

    /**
     * Sets the value of the documentProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentProperties }{@code >}
     *     
     */
    public void setDocumentProperties(JAXBElement<DocumentProperties> value) {
        this.documentProperties = value;
    }

    /**
     * Gets the value of the geographyProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeographyProperties }{@code >}
     *     
     */
    public JAXBElement<GeographyProperties> getGeographyProperties() {
        return geographyProperties;
    }

    /**
     * Sets the value of the geographyProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeographyProperties }{@code >}
     *     
     */
    public void setGeographyProperties(JAXBElement<GeographyProperties> value) {
        this.geographyProperties = value;
    }

    /**
     * Gets the value of the tariffProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffProperties }{@code >}
     *     
     */
    public JAXBElement<TariffProperties> getTariffProperties() {
        return tariffProperties;
    }

    /**
     * Sets the value of the tariffProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffProperties }{@code >}
     *     
     */
    public void setTariffProperties(JAXBElement<TariffProperties> value) {
        this.tariffProperties = value;
    }

    /**
     * Gets the value of the erase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErase() {
        return erase;
    }

    /**
     * Sets the value of the erase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErase(JAXBElement<Boolean> value) {
        this.erase = value;
    }

    /**
     * Gets the value of the packageProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PackageProperties }{@code >}
     *     
     */
    public JAXBElement<PackageProperties> getPackageProperties() {
        return packageProperties;
    }

    /**
     * Sets the value of the packageProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PackageProperties }{@code >}
     *     
     */
    public void setPackageProperties(JAXBElement<PackageProperties> value) {
        this.packageProperties = value;
    }

    /**
     * Gets the value of the contactsProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contacts }{@code >}
     *     
     */
    public JAXBElement<Contacts> getContactsProperties() {
        return contactsProperties;
    }

    /**
     * Sets the value of the contactsProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contacts }{@code >}
     *     
     */
    public void setContactsProperties(JAXBElement<Contacts> value) {
        this.contactsProperties = value;
    }

    /**
     * Gets the value of the productParties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductParties }{@code >}
     *     
     */
    public JAXBElement<ProductParties> getProductParties() {
        return productParties;
    }

    /**
     * Sets the value of the productParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductParties }{@code >}
     *     
     */
    public void setProductParties(JAXBElement<ProductParties> value) {
        this.productParties = value;
    }

    /**
     * Gets the value of the clientProducts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientProducts }{@code >}
     *     
     */
    public JAXBElement<ClientProducts> getClientProducts() {
        return clientProducts;
    }

    /**
     * Sets the value of the clientProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientProducts }{@code >}
     *     
     */
    public void setClientProducts(JAXBElement<ClientProducts> value) {
        this.clientProducts = value;
    }

    /**
     * Gets the value of the payables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payable }
     * 
     * 
     */
    public List<Payable> getPayables() {
        if (payables == null) {
            payables = new ArrayList<Payable>();
        }
        return this.payables;
    }

}
