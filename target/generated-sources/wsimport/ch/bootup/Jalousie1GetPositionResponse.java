
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
 *         &lt;element name="Jalousie_1_getPositionResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "jalousie1GetPositionResult"
})
@XmlRootElement(name = "Jalousie_1_getPositionResponse")
public class Jalousie1GetPositionResponse {

    @XmlElement(name = "Jalousie_1_getPositionResult")
    protected double jalousie1GetPositionResult;

    /**
     * Gets the value of the jalousie1GetPositionResult property.
     * 
     */
    public double getJalousie1GetPositionResult() {
        return jalousie1GetPositionResult;
    }

    /**
     * Sets the value of the jalousie1GetPositionResult property.
     * 
     */
    public void setJalousie1GetPositionResult(double value) {
        this.jalousie1GetPositionResult = value;
    }

}
