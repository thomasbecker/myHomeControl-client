
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
 *         &lt;element name="RoomTemperatureControl_getActualHumitiyValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "roomTemperatureControlGetActualHumitiyValueResult"
})
@XmlRootElement(name = "RoomTemperatureControl_getActualHumitiyValueResponse")
public class RoomTemperatureControlGetActualHumitiyValueResponse {

    @XmlElement(name = "RoomTemperatureControl_getActualHumitiyValueResult")
    protected double roomTemperatureControlGetActualHumitiyValueResult;

    /**
     * Gets the value of the roomTemperatureControlGetActualHumitiyValueResult property.
     * 
     */
    public double getRoomTemperatureControlGetActualHumitiyValueResult() {
        return roomTemperatureControlGetActualHumitiyValueResult;
    }

    /**
     * Sets the value of the roomTemperatureControlGetActualHumitiyValueResult property.
     * 
     */
    public void setRoomTemperatureControlGetActualHumitiyValueResult(double value) {
        this.roomTemperatureControlGetActualHumitiyValueResult = value;
    }

}
