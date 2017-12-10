
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
 *         &lt;element name="WindowContact_getStateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "windowContactGetStateResult"
})
@XmlRootElement(name = "WindowContact_getStateResponse")
public class WindowContactGetStateResponse {

    @XmlElement(name = "WindowContact_getStateResult")
    protected boolean windowContactGetStateResult;

    /**
     * Gets the value of the windowContactGetStateResult property.
     * 
     */
    public boolean isWindowContactGetStateResult() {
        return windowContactGetStateResult;
    }

    /**
     * Sets the value of the windowContactGetStateResult property.
     * 
     */
    public void setWindowContactGetStateResult(boolean value) {
        this.windowContactGetStateResult = value;
    }

}
