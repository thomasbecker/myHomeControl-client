
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
 *         &lt;element name="PulseCounter_getCounterValueResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pulseCounterGetCounterValueResult"
})
@XmlRootElement(name = "PulseCounter_getCounterValueResponse")
public class PulseCounterGetCounterValueResponse {

    @XmlElement(name = "PulseCounter_getCounterValueResult")
    protected int pulseCounterGetCounterValueResult;

    /**
     * Gets the value of the pulseCounterGetCounterValueResult property.
     * 
     */
    public int getPulseCounterGetCounterValueResult() {
        return pulseCounterGetCounterValueResult;
    }

    /**
     * Sets the value of the pulseCounterGetCounterValueResult property.
     * 
     */
    public void setPulseCounterGetCounterValueResult(int value) {
        this.pulseCounterGetCounterValueResult = value;
    }

}
