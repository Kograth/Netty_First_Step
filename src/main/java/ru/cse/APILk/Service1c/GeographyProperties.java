
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographyProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographyProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TypeOfGeography" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UseAsTown" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Russia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocatedInUSSR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HaveDependentObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LocationInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalculatorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographyProperties", propOrder = {
    "town",
    "country",
    "typeOfGeography",
    "useAsTown",
    "russia",
    "locatedInUSSR",
    "haveDependentObjects",
    "locationInfo",
    "calculatorInfo",
    "countryGUID",
    "priority",
    "region",
    "district"
})
public class GeographyProperties {

    @XmlElement(name = "Town")
    protected boolean town;
    @XmlElement(name = "Country")
    protected boolean country;
    @XmlElement(name = "TypeOfGeography", required = true)
    protected String typeOfGeography;
    @XmlElement(name = "UseAsTown")
    protected boolean useAsTown;
    @XmlElementRef(name = "Russia", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> russia;
    @XmlElementRef(name = "LocatedInUSSR", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> locatedInUSSR;
    @XmlElement(name = "HaveDependentObjects")
    protected boolean haveDependentObjects;
    @XmlElementRef(name = "LocationInfo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationInfo;
    @XmlElementRef(name = "CalculatorInfo", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calculatorInfo;
    @XmlElementRef(name = "CountryGUID", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryGUID;
    @XmlElementRef(name = "Priority", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priority;
    @XmlElementRef(name = "Region", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "District", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> district;

    /**
     * Gets the value of the town property.
     * 
     */
    public boolean isTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     */
    public void setTown(boolean value) {
        this.town = value;
    }

    /**
     * Gets the value of the country property.
     * 
     */
    public boolean isCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     */
    public void setCountry(boolean value) {
        this.country = value;
    }

    /**
     * Gets the value of the typeOfGeography property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfGeography() {
        return typeOfGeography;
    }

    /**
     * Sets the value of the typeOfGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfGeography(String value) {
        this.typeOfGeography = value;
    }

    /**
     * Gets the value of the useAsTown property.
     * 
     */
    public boolean isUseAsTown() {
        return useAsTown;
    }

    /**
     * Sets the value of the useAsTown property.
     * 
     */
    public void setUseAsTown(boolean value) {
        this.useAsTown = value;
    }

    /**
     * Gets the value of the russia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRussia() {
        return russia;
    }

    /**
     * Sets the value of the russia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRussia(JAXBElement<Boolean> value) {
        this.russia = value;
    }

    /**
     * Gets the value of the locatedInUSSR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLocatedInUSSR() {
        return locatedInUSSR;
    }

    /**
     * Sets the value of the locatedInUSSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLocatedInUSSR(JAXBElement<Boolean> value) {
        this.locatedInUSSR = value;
    }

    /**
     * Gets the value of the haveDependentObjects property.
     * 
     */
    public boolean isHaveDependentObjects() {
        return haveDependentObjects;
    }

    /**
     * Sets the value of the haveDependentObjects property.
     * 
     */
    public void setHaveDependentObjects(boolean value) {
        this.haveDependentObjects = value;
    }

    /**
     * Gets the value of the locationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationInfo() {
        return locationInfo;
    }

    /**
     * Sets the value of the locationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationInfo(JAXBElement<String> value) {
        this.locationInfo = value;
    }

    /**
     * Gets the value of the calculatorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalculatorInfo() {
        return calculatorInfo;
    }

    /**
     * Sets the value of the calculatorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalculatorInfo(JAXBElement<String> value) {
        this.calculatorInfo = value;
    }

    /**
     * Gets the value of the countryGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryGUID() {
        return countryGUID;
    }

    /**
     * Sets the value of the countryGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryGUID(JAXBElement<String> value) {
        this.countryGUID = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriority(JAXBElement<Integer> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrict(JAXBElement<String> value) {
        this.district = value;
    }

}
