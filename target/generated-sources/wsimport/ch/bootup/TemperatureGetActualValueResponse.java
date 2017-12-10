
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
 *         &lt;element name="Temperature_getActualValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "temperatureGetActualValueResult"
})
@XmlRootElement(name = "Temperature_getActualValueResponse")
public class TemperatureGetActualValueResponse {

    @XmlElement(name = "Temperature_getActualValueResult")
    protected double temperatureGetActualValueResult;

    /**
     * Gets the value of the temperatureGetActualValueResult property.
     * 
     */
    public double getTemperatureGetActualValueResult() {
        return temperatureGetActualValueResult;
    }

    /**
     * Sets the value of the temperatureGetActualValueResult property.
     * 
     */
    public void setTemperatureGetActualValueResult(double value) {
        this.temperatureGetActualValueResult = value;
    }

}
