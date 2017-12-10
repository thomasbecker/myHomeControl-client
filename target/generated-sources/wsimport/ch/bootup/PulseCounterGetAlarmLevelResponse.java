
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
 *         &lt;element name="PulseCounter_getAlarmLevelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pulseCounterGetAlarmLevelResult"
})
@XmlRootElement(name = "PulseCounter_getAlarmLevelResponse")
public class PulseCounterGetAlarmLevelResponse {

    @XmlElement(name = "PulseCounter_getAlarmLevelResult")
    protected int pulseCounterGetAlarmLevelResult;

    /**
     * Gets the value of the pulseCounterGetAlarmLevelResult property.
     * 
     */
    public int getPulseCounterGetAlarmLevelResult() {
        return pulseCounterGetAlarmLevelResult;
    }

    /**
     * Sets the value of the pulseCounterGetAlarmLevelResult property.
     * 
     */
    public void setPulseCounterGetAlarmLevelResult(int value) {
        this.pulseCounterGetAlarmLevelResult = value;
    }

}
