
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
 *         &lt;element name="EnergyMeter_getTariffResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "energyMeterGetTariffResult"
})
@XmlRootElement(name = "EnergyMeter_getTariffResponse")
public class EnergyMeterGetTariffResponse {

    @XmlElement(name = "EnergyMeter_getTariffResult")
    protected int energyMeterGetTariffResult;

    /**
     * Gets the value of the energyMeterGetTariffResult property.
     * 
     */
    public int getEnergyMeterGetTariffResult() {
        return energyMeterGetTariffResult;
    }

    /**
     * Sets the value of the energyMeterGetTariffResult property.
     * 
     */
    public void setEnergyMeterGetTariffResult(int value) {
        this.energyMeterGetTariffResult = value;
    }

}
