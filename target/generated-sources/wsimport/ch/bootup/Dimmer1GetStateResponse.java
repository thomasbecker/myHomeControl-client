
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
 *         &lt;element name="Dimmer_1_getStateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dimmer1GetStateResult"
})
@XmlRootElement(name = "Dimmer_1_getStateResponse")
public class Dimmer1GetStateResponse {

    @XmlElement(name = "Dimmer_1_getStateResult")
    protected String dimmer1GetStateResult;

    /**
     * Gets the value of the dimmer1GetStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimmer1GetStateResult() {
        return dimmer1GetStateResult;
    }

    /**
     * Sets the value of the dimmer1GetStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimmer1GetStateResult(String value) {
        this.dimmer1GetStateResult = value;
    }

}
