
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
 *         &lt;element name="SCMS_attachBlockResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "scmsAttachBlockResult"
})
@XmlRootElement(name = "SCMS_attachBlockResponse")
public class SCMSAttachBlockResponse {

    @XmlElement(name = "SCMS_attachBlockResult")
    protected boolean scmsAttachBlockResult;

    /**
     * Gets the value of the scmsAttachBlockResult property.
     * 
     */
    public boolean isSCMSAttachBlockResult() {
        return scmsAttachBlockResult;
    }

    /**
     * Sets the value of the scmsAttachBlockResult property.
     * 
     */
    public void setSCMSAttachBlockResult(boolean value) {
        this.scmsAttachBlockResult = value;
    }

}
