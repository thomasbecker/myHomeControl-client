
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
 *         &lt;element name="Jalousie_1_getStateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "jalousie1GetStateResult"
})
@XmlRootElement(name = "Jalousie_1_getStateResponse")
public class Jalousie1GetStateResponse {

    @XmlElement(name = "Jalousie_1_getStateResult")
    protected String jalousie1GetStateResult;

    /**
     * Gets the value of the jalousie1GetStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJalousie1GetStateResult() {
        return jalousie1GetStateResult;
    }

    /**
     * Sets the value of the jalousie1GetStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJalousie1GetStateResult(String value) {
        this.jalousie1GetStateResult = value;
    }

}
