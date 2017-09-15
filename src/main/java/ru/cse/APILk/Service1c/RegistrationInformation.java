
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Geography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JuridicalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeansTheAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSMSPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OKPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalPerson" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WebPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationInformation", propOrder = {
    "actualAddress",
    "agent",
    "additionalInformation",
    "bik",
    "carsDescription",
    "companyName",
    "companyContact",
    "currentAccount",
    "eMail",
    "fax",
    "formOfIncorporation",
    "geography",
    "inn",
    "juridicalAddress",
    "kpp",
    "meansTheAgent",
    "notificationEMail",
    "notificationSMSPhone",
    "ogrn",
    "okpo",
    "phone",
    "physicalPerson",
    "webPage"
})
public class RegistrationInformation {

    @XmlElementRef(name = "ActualAddress", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actualAddress;
    @XmlElement(name = "Agent")
    protected boolean agent;
    @XmlElementRef(name = "AdditionalInformation", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalInformation;
    @XmlElementRef(name = "BIK", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bik;
    @XmlElementRef(name = "CarsDescription", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carsDescription;
    @XmlElementRef(name = "CompanyName", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "CompanyContact", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyContact;
    @XmlElementRef(name = "CurrentAccount", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentAccount;
    @XmlElementRef(name = "EMail", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eMail;
    @XmlElementRef(name = "Fax", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "FormOfIncorporation", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formOfIncorporation;
    @XmlElementRef(name = "Geography", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geography;
    @XmlElementRef(name = "INN", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inn;
    @XmlElementRef(name = "JuridicalAddress", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> juridicalAddress;
    @XmlElementRef(name = "KPP", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kpp;
    @XmlElementRef(name = "MeansTheAgent", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meansTheAgent;
    @XmlElementRef(name = "NotificationEMail", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationEMail;
    @XmlElementRef(name = "NotificationSMSPhone", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationSMSPhone;
    @XmlElementRef(name = "OGRN", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ogrn;
    @XmlElementRef(name = "OKPO", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> okpo;
    @XmlElementRef(name = "Phone", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElement(name = "PhysicalPerson")
    protected boolean physicalPerson;
    @XmlElementRef(name = "WebPage", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webPage;

    /**
     * Gets the value of the actualAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualAddress() {
        return actualAddress;
    }

    /**
     * Sets the value of the actualAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualAddress(JAXBElement<String> value) {
        this.actualAddress = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     */
    public boolean isAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     */
    public void setAgent(boolean value) {
        this.agent = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInformation(JAXBElement<String> value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the bik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBIK() {
        return bik;
    }

    /**
     * Sets the value of the bik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBIK(JAXBElement<String> value) {
        this.bik = value;
    }

    /**
     * Gets the value of the carsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarsDescription() {
        return carsDescription;
    }

    /**
     * Sets the value of the carsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarsDescription(JAXBElement<String> value) {
        this.carsDescription = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyContact() {
        return companyContact;
    }

    /**
     * Sets the value of the companyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyContact(JAXBElement<String> value) {
        this.companyContact = value;
    }

    /**
     * Gets the value of the currentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentAccount() {
        return currentAccount;
    }

    /**
     * Sets the value of the currentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentAccount(JAXBElement<String> value) {
        this.currentAccount = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMail(JAXBElement<String> value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFax(JAXBElement<String> value) {
        this.fax = value;
    }

    /**
     * Gets the value of the formOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormOfIncorporation() {
        return formOfIncorporation;
    }

    /**
     * Sets the value of the formOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormOfIncorporation(JAXBElement<String> value) {
        this.formOfIncorporation = value;
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
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINN(JAXBElement<String> value) {
        this.inn = value;
    }

    /**
     * Gets the value of the juridicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJuridicalAddress() {
        return juridicalAddress;
    }

    /**
     * Sets the value of the juridicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJuridicalAddress(JAXBElement<String> value) {
        this.juridicalAddress = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPP(JAXBElement<String> value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the meansTheAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeansTheAgent() {
        return meansTheAgent;
    }

    /**
     * Sets the value of the meansTheAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeansTheAgent(JAXBElement<String> value) {
        this.meansTheAgent = value;
    }

    /**
     * Gets the value of the notificationEMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationEMail() {
        return notificationEMail;
    }

    /**
     * Sets the value of the notificationEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationEMail(JAXBElement<String> value) {
        this.notificationEMail = value;
    }

    /**
     * Gets the value of the notificationSMSPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationSMSPhone() {
        return notificationSMSPhone;
    }

    /**
     * Sets the value of the notificationSMSPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationSMSPhone(JAXBElement<String> value) {
        this.notificationSMSPhone = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOGRN(JAXBElement<String> value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOKPO() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOKPO(JAXBElement<String> value) {
        this.okpo = value;
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
     * Gets the value of the physicalPerson property.
     * 
     */
    public boolean isPhysicalPerson() {
        return physicalPerson;
    }

    /**
     * Sets the value of the physicalPerson property.
     * 
     */
    public void setPhysicalPerson(boolean value) {
        this.physicalPerson = value;
    }

    /**
     * Gets the value of the webPage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebPage() {
        return webPage;
    }

    /**
     * Sets the value of the webPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebPage(JAXBElement<String> value) {
        this.webPage = value;
    }

}
