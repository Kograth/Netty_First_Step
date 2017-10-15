
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InParametrs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BagCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inParametrs",
    "bagCode",
    "exitNumber"
})
@XmlRootElement(name = "ReplacingTheBag", namespace = "http://www.cse-cargo.ru/client")
public class ReplacingTheBag {

    @XmlElement(name = "InParametrs", namespace = "http://www.cse-cargo.ru/client", required = true, nillable = true)
    protected String inParametrs;
    @XmlElement(name = "BagCode", namespace = "http://www.cse-cargo.ru/client", required = true, nillable = true)
    protected String bagCode;
    @XmlElement(name = "ExitNumber", namespace = "http://www.cse-cargo.ru/client", required = true, nillable = true)
    protected String exitNumber;

    /**
     * Gets the value of the inParametrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametrs() {
        return inParametrs;
    }

    /**
     * Sets the value of the inParametrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametrs(String value) {
        this.inParametrs = value;
    }

    /**
     * Gets the value of the bagCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagCode() {
        return bagCode;
    }

    /**
     * Sets the value of the bagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagCode(String value) {
        this.bagCode = value;
    }

    /**
     * Gets the value of the exitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitNumber() {
        return exitNumber;
    }

    /**
     * Sets the value of the exitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitNumber(String value) {
        this.exitNumber = value;
    }

}
