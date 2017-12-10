
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
 *         &lt;element name="Counter_getValueResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "counterGetValueResult"
})
@XmlRootElement(name = "Counter_getValueResponse")
public class CounterGetValueResponse {

    @XmlElement(name = "Counter_getValueResult")
    protected double counterGetValueResult;

    /**
     * Gets the value of the counterGetValueResult property.
     * 
     */
    public double getCounterGetValueResult() {
        return counterGetValueResult;
    }

    /**
     * Sets the value of the counterGetValueResult property.
     * 
     */
    public void setCounterGetValueResult(double value) {
        this.counterGetValueResult = value;
    }

}
