
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessRights" type="{http://www.cse-cargo.ru/client}AccessInfo"/&gt;
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyGUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.cse-cargo.ru/client}UserData" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeographyGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOfficial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OfficeGUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfficialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserGUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "accessRights",
    "companyCode",
    "companyGUID",
    "companyName",
    "data",
    "description",
    "eMail",
    "error",
    "errorInfo",
    "fullCompanyName",
    "geographyGUID",
    "isOfficial",
    "officeGUID",
    "officialName",
    "phone",
    "userGUID"
})
public class UserInfo {

    @XmlElement(name = "AccessRights", required = true)
    protected AccessInfo accessRights;
    @XmlElementRef(name = "CompanyCode", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyCode;
    @XmlElement(name = "CompanyGUID", required = true)
    protected String companyGUID;
    @XmlElementRef(name = "CompanyName", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "Data", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<UserData> data;
    @XmlElementRef(name = "Description", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EMail", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eMail;
    @XmlElement(name = "Error")
    protected boolean error;
    @XmlElementRef(name = "ErrorInfo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorInfo;
    @XmlElementRef(name = "FullCompanyName", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullCompanyName;
    @XmlElementRef(name = "GeographyGUID", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geographyGUID;
    @XmlElement(name = "IsOfficial")
    protected boolean isOfficial;
    @XmlElement(name = "OfficeGUID", required = true)
    protected String officeGUID;
    @XmlElementRef(name = "OfficialName", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officialName;
    @XmlElementRef(name = "Phone", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElement(name = "UserGUID", required = true)
    protected String userGUID;

    /**
     * Gets the value of the accessRights property.
     * 
     * @return
     *     possible object is
     *     {@link AccessInfo }
     *     
     */
    public AccessInfo getAccessRights() {
        return accessRights;
    }

    /**
     * Sets the value of the accessRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessInfo }
     *     
     */
    public void setAccessRights(AccessInfo value) {
        this.accessRights = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyCode(JAXBElement<String> value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the companyGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyGUID() {
        return companyGUID;
    }

    /**
     * Sets the value of the companyGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyGUID(String value) {
        this.companyGUID = value;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserData }{@code >}
     *     
     */
    public JAXBElement<UserData> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserData }{@code >}
     *     
     */
    public void setData(JAXBElement<UserData> value) {
        this.data = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * Gets the value of the error property.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorInfo(JAXBElement<String> value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the fullCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullCompanyName() {
        return fullCompanyName;
    }

    /**
     * Sets the value of the fullCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullCompanyName(JAXBElement<String> value) {
        this.fullCompanyName = value;
    }

    /**
     * Gets the value of the geographyGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeographyGUID() {
        return geographyGUID;
    }

    /**
     * Sets the value of the geographyGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeographyGUID(JAXBElement<String> value) {
        this.geographyGUID = value;
    }

    /**
     * Gets the value of the isOfficial property.
     * 
     */
    public boolean isIsOfficial() {
        return isOfficial;
    }

    /**
     * Sets the value of the isOfficial property.
     * 
     */
    public void setIsOfficial(boolean value) {
        this.isOfficial = value;
    }

    /**
     * Gets the value of the officeGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeGUID() {
        return officeGUID;
    }

    /**
     * Sets the value of the officeGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeGUID(String value) {
        this.officeGUID = value;
    }

    /**
     * Gets the value of the officialName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficialName() {
        return officialName;
    }

    /**
     * Sets the value of the officialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficialName(JAXBElement<String> value) {
        this.officialName = value;
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
     * Gets the value of the userGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGUID() {
        return userGUID;
    }

    /**
     * Sets the value of the userGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGUID(String value) {
        this.userGUID = value;
    }

}
