
package ch.bootup;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlockGuid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="inSzeneIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "blockGuid",
    "inSzeneIndex"
})
@XmlRootElement(name = "SzeneController_activateScene")
public class SzeneControllerActivateScene {

    @XmlElement(name = "BlockGuid", required = true)
    protected String blockGuid;
    protected int inSzeneIndex;

    /**
     * Gets the value of the blockGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockGuid() {
        return blockGuid;
    }

    /**
     * Sets the value of the blockGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockGuid(String value) {
        this.blockGuid = value;
    }

    /**
     * Gets the value of the inSzeneIndex property.
     * 
     */
    public int getInSzeneIndex() {
        return inSzeneIndex;
    }

    /**
     * Sets the value of the inSzeneIndex property.
     * 
     */
    public void setInSzeneIndex(int value) {
        this.inSzeneIndex = value;
    }

}
