
package com.thalesgroup.rtti._2015_11_27.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual service's summary details for display on a WithDetails departure board.
 * 
 * <p>Java class for ServiceItemWithLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItemWithLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}ServiceItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="previousLocations" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}ArrayOfServiceItemLocations" minOccurs="0"/&gt;
 *         &lt;element name="subsequentLocations" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/types}ArrayOfServiceItemLocations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItemWithLocations", propOrder = {
    "previousLocations",
    "subsequentLocations"
})
public class ServiceItemWithLocations
    extends ServiceItem
{

    protected ArrayOfServiceItemLocations previousLocations;
    protected ArrayOfServiceItemLocations subsequentLocations;

    /**
     * Gets the value of the previousLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemLocations }
     *     
     */
    public ArrayOfServiceItemLocations getPreviousLocations() {
        return previousLocations;
    }

    /**
     * Sets the value of the previousLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemLocations }
     *     
     */
    public void setPreviousLocations(ArrayOfServiceItemLocations value) {
        this.previousLocations = value;
    }

    /**
     * Gets the value of the subsequentLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemLocations }
     *     
     */
    public ArrayOfServiceItemLocations getSubsequentLocations() {
        return subsequentLocations;
    }

    /**
     * Sets the value of the subsequentLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemLocations }
     *     
     */
    public void setSubsequentLocations(ArrayOfServiceItemLocations value) {
        this.subsequentLocations = value;
    }

}
