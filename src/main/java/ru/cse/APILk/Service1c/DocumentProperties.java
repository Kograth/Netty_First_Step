
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AgentDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentProperties", propOrder = {
    "clientDocument",
    "agentDocument"
})
public class DocumentProperties {

    @XmlElement(name = "ClientDocument")
    protected boolean clientDocument;
    @XmlElement(name = "AgentDocument")
    protected boolean agentDocument;

    /**
     * Gets the value of the clientDocument property.
     * 
     */
    public boolean isClientDocument() {
        return clientDocument;
    }

    /**
     * Sets the value of the clientDocument property.
     * 
     */
    public void setClientDocument(boolean value) {
        this.clientDocument = value;
    }

    /**
     * Gets the value of the agentDocument property.
     * 
     */
    public boolean isAgentDocument() {
        return agentDocument;
    }

    /**
     * Sets the value of the agentDocument property.
     * 
     */
    public void setAgentDocument(boolean value) {
        this.agentDocument = value;
    }

}
