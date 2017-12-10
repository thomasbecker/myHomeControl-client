
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
 *         &lt;element name="Dimmer_1_getBrightnessResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "dimmer1GetBrightnessResult"
})
@XmlRootElement(name = "Dimmer_1_getBrightnessResponse")
public class Dimmer1GetBrightnessResponse {

    @XmlElement(name = "Dimmer_1_getBrightnessResult")
    protected double dimmer1GetBrightnessResult;

    /**
     * Gets the value of the dimmer1GetBrightnessResult property.
     * 
     */
    public double getDimmer1GetBrightnessResult() {
        return dimmer1GetBrightnessResult;
    }

    /**
     * Sets the value of the dimmer1GetBrightnessResult property.
     * 
     */
    public void setDimmer1GetBrightnessResult(double value) {
        this.dimmer1GetBrightnessResult = value;
    }

}
