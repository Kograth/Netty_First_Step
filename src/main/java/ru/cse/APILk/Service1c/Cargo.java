
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
 * <p>Java class for Cargo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cargo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CargoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoPackageQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="VolumeWeight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="InsuranceRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceRateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValueRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValueRateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueForCustomsPurposes" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ValueForCustomsPurposesCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COD" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CODPayer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderShippingCost" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CargoPackages" type="{http://www.cse-cargo.ru/client}CargoPackages" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CargoDescriptionWhithoutType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceRateFee" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceRateFeeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cargo", propOrder = {
    "cargoDescription",
    "cargoPackageQty",
    "weight",
    "volumeWeight",
    "length",
    "width",
    "height",
    "insuranceRate",
    "insuranceRateCurrency",
    "declaredValueRate",
    "declaredValueRateCurrency",
    "valueForCustomsPurposes",
    "valueForCustomsPurposesCurrency",
    "packageID",
    "cod",
    "codPayer",
    "codDescription",
    "senderShippingCost",
    "cargoPackages",
    "cargoDescriptionWhithoutType",
    "insuranceRateFee",
    "insuranceRateFeeCurrency"
})
public class Cargo {

    @XmlElementRef(name = "CargoDescription", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoDescription;
    @XmlElement(name = "CargoPackageQty", required = true, type = Integer.class, nillable = true)
    protected Integer cargoPackageQty;
    @XmlElement(name = "Weight", required = true, type = Float.class, nillable = true)
    protected Float weight;
    @XmlElement(name = "VolumeWeight", required = true, type = Float.class, nillable = true)
    protected Float volumeWeight;
    @XmlElement(name = "Length", required = true, type = Float.class, nillable = true)
    protected Float length;
    @XmlElement(name = "Width", required = true, type = Float.class, nillable = true)
    protected Float width;
    @XmlElement(name = "Height", required = true, type = Float.class, nillable = true)
    protected Float height;
    @XmlElementRef(name = "InsuranceRate", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> insuranceRate;
    @XmlElementRef(name = "InsuranceRateCurrency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceRateCurrency;
    @XmlElementRef(name = "DeclaredValueRate", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> declaredValueRate;
    @XmlElementRef(name = "DeclaredValueRateCurrency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> declaredValueRateCurrency;
    @XmlElementRef(name = "ValueForCustomsPurposes", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> valueForCustomsPurposes;
    @XmlElementRef(name = "ValueForCustomsPurposesCurrency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valueForCustomsPurposesCurrency;
    @XmlElementRef(name = "PackageID", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageID;
    @XmlElement(name = "COD", required = true, type = Float.class, nillable = true)
    protected Float cod;
    @XmlElement(name = "CODPayer", required = true, nillable = true)
    protected String codPayer;
    @XmlElementRef(name = "CODDescription", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDescription;
    @XmlElementRef(name = "SenderShippingCost", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> senderShippingCost;
    @XmlElement(name = "CargoPackages", nillable = true)
    protected List<CargoPackages> cargoPackages;
    @XmlElementRef(name = "CargoDescriptionWhithoutType", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoDescriptionWhithoutType;
    @XmlElementRef(name = "InsuranceRateFee", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> insuranceRateFee;
    @XmlElementRef(name = "InsuranceRateFeeCurrency", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceRateFeeCurrency;

    /**
     * Gets the value of the cargoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoDescription() {
        return cargoDescription;
    }

    /**
     * Sets the value of the cargoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoDescription(JAXBElement<String> value) {
        this.cargoDescription = value;
    }

    /**
     * Gets the value of the cargoPackageQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCargoPackageQty() {
        return cargoPackageQty;
    }

    /**
     * Sets the value of the cargoPackageQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCargoPackageQty(Integer value) {
        this.cargoPackageQty = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the volumeWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolumeWeight() {
        return volumeWeight;
    }

    /**
     * Sets the value of the volumeWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolumeWeight(Float value) {
        this.volumeWeight = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLength(Float value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWidth(Float value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Gets the value of the insuranceRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getInsuranceRate() {
        return insuranceRate;
    }

    /**
     * Sets the value of the insuranceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setInsuranceRate(JAXBElement<Float> value) {
        this.insuranceRate = value;
    }

    /**
     * Gets the value of the insuranceRateCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceRateCurrency() {
        return insuranceRateCurrency;
    }

    /**
     * Sets the value of the insuranceRateCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceRateCurrency(JAXBElement<String> value) {
        this.insuranceRateCurrency = value;
    }

    /**
     * Gets the value of the declaredValueRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDeclaredValueRate() {
        return declaredValueRate;
    }

    /**
     * Sets the value of the declaredValueRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDeclaredValueRate(JAXBElement<Float> value) {
        this.declaredValueRate = value;
    }

    /**
     * Gets the value of the declaredValueRateCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeclaredValueRateCurrency() {
        return declaredValueRateCurrency;
    }

    /**
     * Sets the value of the declaredValueRateCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeclaredValueRateCurrency(JAXBElement<String> value) {
        this.declaredValueRateCurrency = value;
    }

    /**
     * Gets the value of the valueForCustomsPurposes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getValueForCustomsPurposes() {
        return valueForCustomsPurposes;
    }

    /**
     * Sets the value of the valueForCustomsPurposes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setValueForCustomsPurposes(JAXBElement<Float> value) {
        this.valueForCustomsPurposes = value;
    }

    /**
     * Gets the value of the valueForCustomsPurposesCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValueForCustomsPurposesCurrency() {
        return valueForCustomsPurposesCurrency;
    }

    /**
     * Sets the value of the valueForCustomsPurposesCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValueForCustomsPurposesCurrency(JAXBElement<String> value) {
        this.valueForCustomsPurposesCurrency = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageID(JAXBElement<String> value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the cod property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCOD() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCOD(Float value) {
        this.cod = value;
    }

    /**
     * Gets the value of the codPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPayer() {
        return codPayer;
    }

    /**
     * Sets the value of the codPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPayer(String value) {
        this.codPayer = value;
    }

    /**
     * Gets the value of the codDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODDescription() {
        return codDescription;
    }

    /**
     * Sets the value of the codDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODDescription(JAXBElement<String> value) {
        this.codDescription = value;
    }

    /**
     * Gets the value of the senderShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getSenderShippingCost() {
        return senderShippingCost;
    }

    /**
     * Sets the value of the senderShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setSenderShippingCost(JAXBElement<Float> value) {
        this.senderShippingCost = value;
    }

    /**
     * Gets the value of the cargoPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CargoPackages }
     * 
     * 
     */
    public List<CargoPackages> getCargoPackages() {
        if (cargoPackages == null) {
            cargoPackages = new ArrayList<CargoPackages>();
        }
        return this.cargoPackages;
    }

    /**
     * Gets the value of the cargoDescriptionWhithoutType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoDescriptionWhithoutType() {
        return cargoDescriptionWhithoutType;
    }

    /**
     * Sets the value of the cargoDescriptionWhithoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoDescriptionWhithoutType(JAXBElement<String> value) {
        this.cargoDescriptionWhithoutType = value;
    }

    /**
     * Gets the value of the insuranceRateFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getInsuranceRateFee() {
        return insuranceRateFee;
    }

    /**
     * Sets the value of the insuranceRateFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setInsuranceRateFee(JAXBElement<Float> value) {
        this.insuranceRateFee = value;
    }

    /**
     * Gets the value of the insuranceRateFeeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceRateFeeCurrency() {
        return insuranceRateFeeCurrency;
    }

    /**
     * Sets the value of the insuranceRateFeeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceRateFeeCurrency(JAXBElement<String> value) {
        this.insuranceRateFeeCurrency = value;
    }

}
