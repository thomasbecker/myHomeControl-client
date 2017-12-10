
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
 *         &lt;element name="RoomTemperatureControl_getSetpointHumitiyValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "roomTemperatureControlGetSetpointHumitiyValueResult"
})
@XmlRootElement(name = "RoomTemperatureControl_getSetpointHumitiyValueResponse")
public class RoomTemperatureControlGetSetpointHumitiyValueResponse {

    @XmlElement(name = "RoomTemperatureControl_getSetpointHumitiyValueResult")
    protected double roomTemperatureControlGetSetpointHumitiyValueResult;

    /**
     * Gets the value of the roomTemperatureControlGetSetpointHumitiyValueResult property.
     * 
     */
    public double getRoomTemperatureControlGetSetpointHumitiyValueResult() {
        return roomTemperatureControlGetSetpointHumitiyValueResult;
    }

    /**
     * Sets the value of the roomTemperatureControlGetSetpointHumitiyValueResult property.
     * 
     */
    public void setRoomTemperatureControlGetSetpointHumitiyValueResult(double value) {
        this.roomTemperatureControlGetSetpointHumitiyValueResult = value;
    }

}
