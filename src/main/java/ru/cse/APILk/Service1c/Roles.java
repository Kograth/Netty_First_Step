
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Roles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Roles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Client" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Administrator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Demo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ClientAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roles", propOrder = {
    "client",
    "agent",
    "administrator",
    "demo",
    "clientAdmin"
})
public class Roles {

    @XmlElement(name = "Client")
    protected boolean client;
    @XmlElement(name = "Agent")
    protected boolean agent;
    @XmlElement(name = "Administrator")
    protected boolean administrator;
    @XmlElement(name = "Demo")
    protected boolean demo;
    @XmlElement(name = "ClientAdmin")
    protected boolean clientAdmin;

    /**
     * Gets the value of the client property.
     * 
     */
    public boolean isClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     */
    public void setClient(boolean value) {
        this.client = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     */
    public boolean isAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     */
    public void setAgent(boolean value) {
        this.agent = value;
    }

    /**
     * Gets the value of the administrator property.
     * 
     */
    public boolean isAdministrator() {
        return administrator;
    }

    /**
     * Sets the value of the administrator property.
     * 
     */
    public void setAdministrator(boolean value) {
        this.administrator = value;
    }

    /**
     * Gets the value of the demo property.
     * 
     */
    public boolean isDemo() {
        return demo;
    }

    /**
     * Sets the value of the demo property.
     * 
     */
    public void setDemo(boolean value) {
        this.demo = value;
    }

    /**
     * Gets the value of the clientAdmin property.
     * 
     */
    public boolean isClientAdmin() {
        return clientAdmin;
    }

    /**
     * Sets the value of the clientAdmin property.
     * 
     */
    public void setClientAdmin(boolean value) {
        this.clientAdmin = value;
    }

}
