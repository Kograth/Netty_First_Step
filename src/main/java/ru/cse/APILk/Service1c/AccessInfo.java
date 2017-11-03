
package ru.cse.APILk.Service1c;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Agent" type="{http://www.cse-cargo.ru/client}AccessAgent"/&gt;
 *         &lt;element name="Client" type="{http://www.cse-cargo.ru/client}AccessClient"/&gt;
 *         &lt;element name="Roles" type="{http://www.cse-cargo.ru/client}Roles"/&gt;
 *         &lt;element name="Services" type="{http://www.cse-cargo.ru/client}Correspondence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessInfo", propOrder = {
    "agent",
    "client",
    "roles",
    "services"
})
public class AccessInfo {

    @XmlElement(name = "Agent", required = true)
    protected AccessAgent agent;
    @XmlElement(name = "Client", required = true)
    protected AccessClient client;
    @XmlElement(name = "Roles", required = true)
    protected Roles roles;
    @XmlElement(name = "Services", nillable = true)
    protected List<Correspondence> services;

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link AccessAgent }
     *     
     */
    public AccessAgent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessAgent }
     *     
     */
    public void setAgent(AccessAgent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link AccessClient }
     *     
     */
    public AccessClient getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessClient }
     *     
     */
    public void setClient(AccessClient value) {
        this.client = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link Roles }
     *     
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roles }
     *     
     */
    public void setRoles(Roles value) {
        this.roles = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Correspondence }
     * 
     * 
     */
    public List<Correspondence> getServices() {
        if (services == null) {
            services = new ArrayList<Correspondence>();
        }
        return this.services;
    }

}
