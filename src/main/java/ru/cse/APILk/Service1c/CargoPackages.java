
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CargoPackages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoPackages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="VolumeWeight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PackageQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoPackages", propOrder = {
    "length",
    "width",
    "height",
    "_package",
    "weight",
    "volumeWeight",
    "packageQty",
    "packageID"
})
public class CargoPackages {

    @XmlElementRef(name = "Length", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> length;
    @XmlElementRef(name = "Width", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> width;
    @XmlElementRef(name = "Height", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> height;
    @XmlElementRef(name = "Package", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> _package;
    @XmlElementRef(name = "Weight", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> weight;
    @XmlElementRef(name = "VolumeWeight", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> volumeWeight;
    @XmlElementRef(name = "PackageQty", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packageQty;
    @XmlElementRef(name = "PackageID", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageID;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setLength(JAXBElement<Float> value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setWidth(JAXBElement<Float> value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setHeight(JAXBElement<Float> value) {
        this.height = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackage(JAXBElement<String> value) {
        this._package = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setWeight(JAXBElement<Float> value) {
        this.weight = value;
    }

    /**
     * Gets the value of the volumeWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getVolumeWeight() {
        return volumeWeight;
    }

    /**
     * Sets the value of the volumeWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setVolumeWeight(JAXBElement<Float> value) {
        this.volumeWeight = value;
    }

    /**
     * Gets the value of the packageQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPackageQty() {
        return packageQty;
    }

    /**
     * Sets the value of the packageQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPackageQty(JAXBElement<Integer> value) {
        this.packageQty = value;
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

}
