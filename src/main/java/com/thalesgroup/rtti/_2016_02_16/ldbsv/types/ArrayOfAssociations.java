
package com.thalesgroup.rtti._2016_02_16.ldbsv.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of associations at a ServiceLocation
 * 
 * <p>Java class for ArrayOfAssociations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAssociations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="association" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}Association" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssociations", propOrder = {
    "association"
})
public class ArrayOfAssociations {

    @XmlElement(nillable = true)
    protected List<Association> association;

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Association }
     * 
     * 
     */
    public List<Association> getAssociation() {
        if (association == null) {
            association = new ArrayList<Association>();
        }
        return this.association;
    }

}
