
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
 *         &lt;element name="KeyCard_getStateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "keyCardGetStateResult"
})
@XmlRootElement(name = "KeyCard_getStateResponse")
public class KeyCardGetStateResponse {

    @XmlElement(name = "KeyCard_getStateResult")
    protected boolean keyCardGetStateResult;

    /**
     * Gets the value of the keyCardGetStateResult property.
     * 
     */
    public boolean isKeyCardGetStateResult() {
        return keyCardGetStateResult;
    }

    /**
     * Sets the value of the keyCardGetStateResult property.
     * 
     */
    public void setKeyCardGetStateResult(boolean value) {
        this.keyCardGetStateResult = value;
    }

}
