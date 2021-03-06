
package oasis.names.tc.spml._2._0.password;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.spml._2._0.PSOIdentifierType;
import oasis.names.tc.spml._2._0.RequestType;


/**
 * <p>Java class for ExpirePasswordRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpirePasswordRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SPML:2:0}RequestType">
 *       &lt;sequence>
 *         &lt;element name="psoID" type="{urn:oasis:names:tc:SPML:2:0}PSOIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="remainingLogins" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpirePasswordRequestType", propOrder = {
    "psoID"
})
public class ExpirePasswordRequestType
    extends RequestType
{

    protected PSOIdentifierType psoID;
    @XmlAttribute(name = "remainingLogins")
    protected Integer remainingLogins;

    /**
     * Gets the value of the psoID property.
     * 
     * @return
     *     possible object is
     *     {@link PSOIdentifierType }
     *     
     */
    public PSOIdentifierType getPsoID() {
        return psoID;
    }

    /**
     * Sets the value of the psoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSOIdentifierType }
     *     
     */
    public void setPsoID(PSOIdentifierType value) {
        this.psoID = value;
    }

    /**
     * Gets the value of the remainingLogins property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRemainingLogins() {
        if (remainingLogins == null) {
            return  1;
        } else {
            return remainingLogins;
        }
    }

    /**
     * Sets the value of the remainingLogins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingLogins(Integer value) {
        this.remainingLogins = value;
    }

}
