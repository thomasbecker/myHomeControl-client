
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
 *         &lt;element name="FSVoltageSensor_getStateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "fsVoltageSensorGetStateResult"
})
@XmlRootElement(name = "FSVoltageSensor_getStateResponse")
public class FSVoltageSensorGetStateResponse {

    @XmlElement(name = "FSVoltageSensor_getStateResult")
    protected boolean fsVoltageSensorGetStateResult;

    /**
     * Gets the value of the fsVoltageSensorGetStateResult property.
     * 
     */
    public boolean isFSVoltageSensorGetStateResult() {
        return fsVoltageSensorGetStateResult;
    }

    /**
     * Sets the value of the fsVoltageSensorGetStateResult property.
     * 
     */
    public void setFSVoltageSensorGetStateResult(boolean value) {
        this.fsVoltageSensorGetStateResult = value;
    }

}
