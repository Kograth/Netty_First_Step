
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
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SendExitNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="SendBarcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "_return",
    "sendExitNumber",
    "sendBarcode"
})
@XmlRootElement(name = "GetDataPushExitResponse")
public class GetDataPushExitResponse {

    @XmlElement(name = "return", required = true)
    protected String _return;
    @XmlElement(name = "SendExitNumber", required = true, type = Byte.class, nillable = true)
    protected Byte sendExitNumber;
    @XmlElement(name = "SendBarcode", required = true, nillable = true)
    protected String sendBarcode;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturn(String value) {
        this._return = value;
    }

    /**
     * Gets the value of the sendExitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSendExitNumber() {
        return sendExitNumber;
    }

    /**
     * Sets the value of the sendExitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSendExitNumber(Byte value) {
        this.sendExitNumber = value;
    }

    /**
     * Gets the value of the sendBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendBarcode() {
        return sendBarcode;
    }

    /**
     * Sets the value of the sendBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendBarcode(String value) {
        this.sendBarcode = value;
    }

}
