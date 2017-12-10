
package ch.bootup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PulseCounter_getLastResetTimeStampResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "pulseCounterGetLastResetTimeStampResult"
})
@XmlRootElement(name = "PulseCounter_getLastResetTimeStampResponse")
public class PulseCounterGetLastResetTimeStampResponse {

    @XmlElement(name = "PulseCounter_getLastResetTimeStampResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pulseCounterGetLastResetTimeStampResult;

    /**
     * Gets the value of the pulseCounterGetLastResetTimeStampResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPulseCounterGetLastResetTimeStampResult() {
        return pulseCounterGetLastResetTimeStampResult;
    }

    /**
     * Sets the value of the pulseCounterGetLastResetTimeStampResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPulseCounterGetLastResetTimeStampResult(XMLGregorianCalendar value) {
        this.pulseCounterGetLastResetTimeStampResult = value;
    }

}
