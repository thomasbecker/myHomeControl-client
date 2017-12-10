
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
 *         &lt;element name="Leakage_getLeakageStateResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "leakageGetLeakageStateResult"
})
@XmlRootElement(name = "Leakage_getLeakageStateResponse")
public class LeakageGetLeakageStateResponse {

    @XmlElement(name = "Leakage_getLeakageStateResult")
    protected boolean leakageGetLeakageStateResult;

    /**
     * Gets the value of the leakageGetLeakageStateResult property.
     * 
     */
    public boolean isLeakageGetLeakageStateResult() {
        return leakageGetLeakageStateResult;
    }

    /**
     * Sets the value of the leakageGetLeakageStateResult property.
     * 
     */
    public void setLeakageGetLeakageStateResult(boolean value) {
        this.leakageGetLeakageStateResult = value;
    }

}
