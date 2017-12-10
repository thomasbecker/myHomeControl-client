
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
 *         &lt;element name="EnergyMeter_getCumulativeValuekWhResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "energyMeterGetCumulativeValuekWhResult"
})
@XmlRootElement(name = "EnergyMeter_getCumulativeValuekWhResponse")
public class EnergyMeterGetCumulativeValuekWhResponse {

    @XmlElement(name = "EnergyMeter_getCumulativeValuekWhResult")
    protected double energyMeterGetCumulativeValuekWhResult;

    /**
     * Gets the value of the energyMeterGetCumulativeValuekWhResult property.
     * 
     */
    public double getEnergyMeterGetCumulativeValuekWhResult() {
        return energyMeterGetCumulativeValuekWhResult;
    }

    /**
     * Sets the value of the energyMeterGetCumulativeValuekWhResult property.
     * 
     */
    public void setEnergyMeterGetCumulativeValuekWhResult(double value) {
        this.energyMeterGetCumulativeValuekWhResult = value;
    }

}
