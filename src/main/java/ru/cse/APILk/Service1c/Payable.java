
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Summa" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payable", propOrder = {
    "contract",
    "summa"
})
public class Payable {

    @XmlElementRef(name = "Contract", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contract;
    @XmlElementRef(name = "Summa", namespace = "http://www.cse-cargo.ru/client", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> summa;

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContract(JAXBElement<String> value) {
        this.contract = value;
    }

    /**
     * Gets the value of the summa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getSumma() {
        return summa;
    }

    /**
     * Sets the value of the summa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setSumma(JAXBElement<Float> value) {
        this.summa = value;
    }

}
