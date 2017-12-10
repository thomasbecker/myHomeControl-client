
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
 *         &lt;element name="SCMS_getChangedStatesResult" type="{http://bootup.ch/}ArrayOfGuid" minOccurs="0"/>
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
    "scmsGetChangedStatesResult"
})
@XmlRootElement(name = "SCMS_getChangedStatesResponse")
public class SCMSGetChangedStatesResponse {

    @XmlElement(name = "SCMS_getChangedStatesResult")
    protected ArrayOfGuid scmsGetChangedStatesResult;

    /**
     * Gets the value of the scmsGetChangedStatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getSCMSGetChangedStatesResult() {
        return scmsGetChangedStatesResult;
    }

    /**
     * Sets the value of the scmsGetChangedStatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setSCMSGetChangedStatesResult(ArrayOfGuid value) {
        this.scmsGetChangedStatesResult = value;
    }

}
