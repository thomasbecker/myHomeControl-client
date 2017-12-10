
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
 *         &lt;element name="Brightness_getValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "brightnessGetValueResult"
})
@XmlRootElement(name = "Brightness_getValueResponse")
public class BrightnessGetValueResponse {

    @XmlElement(name = "Brightness_getValueResult")
    protected double brightnessGetValueResult;

    /**
     * Gets the value of the brightnessGetValueResult property.
     * 
     */
    public double getBrightnessGetValueResult() {
        return brightnessGetValueResult;
    }

    /**
     * Sets the value of the brightnessGetValueResult property.
     * 
     */
    public void setBrightnessGetValueResult(double value) {
        this.brightnessGetValueResult = value;
    }

}
