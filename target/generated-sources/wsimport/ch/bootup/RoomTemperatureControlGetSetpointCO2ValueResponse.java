
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
 *         &lt;element name="RoomTemperatureControl_getSetpointCO2ValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "roomTemperatureControlGetSetpointCO2ValueResult"
})
@XmlRootElement(name = "RoomTemperatureControl_getSetpointCO2ValueResponse")
public class RoomTemperatureControlGetSetpointCO2ValueResponse {

    @XmlElement(name = "RoomTemperatureControl_getSetpointCO2ValueResult")
    protected double roomTemperatureControlGetSetpointCO2ValueResult;

    /**
     * Gets the value of the roomTemperatureControlGetSetpointCO2ValueResult property.
     * 
     */
    public double getRoomTemperatureControlGetSetpointCO2ValueResult() {
        return roomTemperatureControlGetSetpointCO2ValueResult;
    }

    /**
     * Sets the value of the roomTemperatureControlGetSetpointCO2ValueResult property.
     * 
     */
    public void setRoomTemperatureControlGetSetpointCO2ValueResult(double value) {
        this.roomTemperatureControlGetSetpointCO2ValueResult = value;
    }

}
