
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseTypeOfCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseDeliveryWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseUrgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseFromGeography" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseToGeography" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="International" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InUSSR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffProperties", propOrder = {
    "useTypeOfCargo",
    "useDeliveryWay",
    "useUrgency",
    "useFromGeography",
    "useToGeography",
    "international",
    "inUSSR"
})
public class TariffProperties {

    @XmlElement(name = "UseTypeOfCargo")
    protected boolean useTypeOfCargo;
    @XmlElement(name = "UseDeliveryWay")
    protected boolean useDeliveryWay;
    @XmlElement(name = "UseUrgency")
    protected boolean useUrgency;
    @XmlElement(name = "UseFromGeography")
    protected boolean useFromGeography;
    @XmlElement(name = "UseToGeography")
    protected boolean useToGeography;
    @XmlElement(name = "International")
    protected boolean international;
    @XmlElement(name = "InUSSR")
    protected boolean inUSSR;

    /**
     * Gets the value of the useTypeOfCargo property.
     * 
     */
    public boolean isUseTypeOfCargo() {
        return useTypeOfCargo;
    }

    /**
     * Sets the value of the useTypeOfCargo property.
     * 
     */
    public void setUseTypeOfCargo(boolean value) {
        this.useTypeOfCargo = value;
    }

    /**
     * Gets the value of the useDeliveryWay property.
     * 
     */
    public boolean isUseDeliveryWay() {
        return useDeliveryWay;
    }

    /**
     * Sets the value of the useDeliveryWay property.
     * 
     */
    public void setUseDeliveryWay(boolean value) {
        this.useDeliveryWay = value;
    }

    /**
     * Gets the value of the useUrgency property.
     * 
     */
    public boolean isUseUrgency() {
        return useUrgency;
    }

    /**
     * Sets the value of the useUrgency property.
     * 
     */
    public void setUseUrgency(boolean value) {
        this.useUrgency = value;
    }

    /**
     * Gets the value of the useFromGeography property.
     * 
     */
    public boolean isUseFromGeography() {
        return useFromGeography;
    }

    /**
     * Sets the value of the useFromGeography property.
     * 
     */
    public void setUseFromGeography(boolean value) {
        this.useFromGeography = value;
    }

    /**
     * Gets the value of the useToGeography property.
     * 
     */
    public boolean isUseToGeography() {
        return useToGeography;
    }

    /**
     * Sets the value of the useToGeography property.
     * 
     */
    public void setUseToGeography(boolean value) {
        this.useToGeography = value;
    }

    /**
     * Gets the value of the international property.
     * 
     */
    public boolean isInternational() {
        return international;
    }

    /**
     * Sets the value of the international property.
     * 
     */
    public void setInternational(boolean value) {
        this.international = value;
    }

    /**
     * Gets the value of the inUSSR property.
     * 
     */
    public boolean isInUSSR() {
        return inUSSR;
    }

    /**
     * Sets the value of the inUSSR property.
     * 
     */
    public void setInUSSR(boolean value) {
        this.inUSSR = value;
    }

}
