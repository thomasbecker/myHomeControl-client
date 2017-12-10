
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
 *         &lt;element name="RoomTemperatureControl_getTemperatureSetpointValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "roomTemperatureControlGetTemperatureSetpointValueResult"
})
@XmlRootElement(name = "RoomTemperatureControl_getTemperatureSetpointValueResponse")
public class RoomTemperatureControlGetTemperatureSetpointValueResponse {

    @XmlElement(name = "RoomTemperatureControl_getTemperatureSetpointValueResult")
    protected double roomTemperatureControlGetTemperatureSetpointValueResult;

    /**
     * Gets the value of the roomTemperatureControlGetTemperatureSetpointValueResult property.
     * 
     */
    public double getRoomTemperatureControlGetTemperatureSetpointValueResult() {
        return roomTemperatureControlGetTemperatureSetpointValueResult;
    }

    /**
     * Sets the value of the roomTemperatureControlGetTemperatureSetpointValueResult property.
     * 
     */
    public void setRoomTemperatureControlGetTemperatureSetpointValueResult(double value) {
        this.roomTemperatureControlGetTemperatureSetpointValueResult = value;
    }

}
