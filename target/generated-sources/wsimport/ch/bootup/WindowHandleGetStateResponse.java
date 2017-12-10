
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
 *         &lt;element name="WindowHandle_getStateResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "windowHandleGetStateResult"
})
@XmlRootElement(name = "WindowHandle_getStateResponse")
public class WindowHandleGetStateResponse {

    @XmlElement(name = "WindowHandle_getStateResult")
    protected int windowHandleGetStateResult;

    /**
     * Gets the value of the windowHandleGetStateResult property.
     * 
     */
    public int getWindowHandleGetStateResult() {
        return windowHandleGetStateResult;
    }

    /**
     * Sets the value of the windowHandleGetStateResult property.
     * 
     */
    public void setWindowHandleGetStateResult(int value) {
        this.windowHandleGetStateResult = value;
    }

}
