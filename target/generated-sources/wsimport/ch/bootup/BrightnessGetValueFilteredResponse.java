
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
 *         &lt;element name="Brightness_getValueFilteredResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "brightnessGetValueFilteredResult"
})
@XmlRootElement(name = "Brightness_getValueFilteredResponse")
public class BrightnessGetValueFilteredResponse {

    @XmlElement(name = "Brightness_getValueFilteredResult")
    protected double brightnessGetValueFilteredResult;

    /**
     * Gets the value of the brightnessGetValueFilteredResult property.
     * 
     */
    public double getBrightnessGetValueFilteredResult() {
        return brightnessGetValueFilteredResult;
    }

    /**
     * Sets the value of the brightnessGetValueFilteredResult property.
     * 
     */
    public void setBrightnessGetValueFilteredResult(double value) {
        this.brightnessGetValueFilteredResult = value;
    }

}
