
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
 *         &lt;element name="iBrightnessValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "iBrightnessValue"
})
@XmlRootElement(name = "Dimmer_1_setBrightness")
public class Dimmer1SetBrightness {

    @XmlElement(name = "BlockGuid", required = true)
    protected String blockGuid;
    protected double iBrightnessValue;

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
     * Gets the value of the iBrightnessValue property.
     * 
     */
    public double getIBrightnessValue() {
        return iBrightnessValue;
    }

    /**
     * Sets the value of the iBrightnessValue property.
     * 
     */
    public void setIBrightnessValue(double value) {
        this.iBrightnessValue = value;
    }

}
