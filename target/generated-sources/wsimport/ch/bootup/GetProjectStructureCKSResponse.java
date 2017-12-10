
package ch.bootup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getProjectStructureCKSResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getProjectStructureCKSResult"
})
@XmlRootElement(name = "getProjectStructureCKSResponse")
public class GetProjectStructureCKSResponse {

    protected int getProjectStructureCKSResult;

    /**
     * Gets the value of the getProjectStructureCKSResult property.
     * 
     */
    public int getGetProjectStructureCKSResult() {
        return getProjectStructureCKSResult;
    }

    /**
     * Sets the value of the getProjectStructureCKSResult property.
     * 
     */
    public void setGetProjectStructureCKSResult(int value) {
        this.getProjectStructureCKSResult = value;
    }

}
