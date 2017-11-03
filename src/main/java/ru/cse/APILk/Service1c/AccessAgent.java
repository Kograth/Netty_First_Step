
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessAgent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessAgent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddPOD" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AddReaddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AddTrace" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CloseTrace" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Manifest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAgent", propOrder = {
    "addPOD",
    "addReaddress",
    "addTrace",
    "closeTrace",
    "manifest"
})
public class AccessAgent {

    @XmlElement(name = "AddPOD")
    protected boolean addPOD;
    @XmlElement(name = "AddReaddress")
    protected boolean addReaddress;
    @XmlElement(name = "AddTrace")
    protected boolean addTrace;
    @XmlElement(name = "CloseTrace")
    protected boolean closeTrace;
    @XmlElement(name = "Manifest")
    protected boolean manifest;

    /**
     * Gets the value of the addPOD property.
     * 
     */
    public boolean isAddPOD() {
        return addPOD;
    }

    /**
     * Sets the value of the addPOD property.
     * 
     */
    public void setAddPOD(boolean value) {
        this.addPOD = value;
    }

    /**
     * Gets the value of the addReaddress property.
     * 
     */
    public boolean isAddReaddress() {
        return addReaddress;
    }

    /**
     * Sets the value of the addReaddress property.
     * 
     */
    public void setAddReaddress(boolean value) {
        this.addReaddress = value;
    }

    /**
     * Gets the value of the addTrace property.
     * 
     */
    public boolean isAddTrace() {
        return addTrace;
    }

    /**
     * Sets the value of the addTrace property.
     * 
     */
    public void setAddTrace(boolean value) {
        this.addTrace = value;
    }

    /**
     * Gets the value of the closeTrace property.
     * 
     */
    public boolean isCloseTrace() {
        return closeTrace;
    }

    /**
     * Sets the value of the closeTrace property.
     * 
     */
    public void setCloseTrace(boolean value) {
        this.closeTrace = value;
    }

    /**
     * Gets the value of the manifest property.
     * 
     */
    public boolean isManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     * 
     */
    public void setManifest(boolean value) {
        this.manifest = value;
    }

}
