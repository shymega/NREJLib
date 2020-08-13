
package com.thalesgroup.rtti._2016_02_16.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure containing details of a services query.
 * 
 * <p>Java class for ServiceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="serviceList" type="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ArrayOfServiceListItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceList", propOrder = {
    "scheduleStartDate",
    "serviceList"
})
public class ServiceList {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleStartDate;
    protected ArrayOfServiceListItem serviceList;

    /**
     * Gets the value of the scheduleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStartDate(XMLGregorianCalendar value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the serviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceListItem }
     *     
     */
    public ArrayOfServiceListItem getServiceList() {
        return serviceList;
    }

    /**
     * Sets the value of the serviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceListItem }
     *     
     */
    public void setServiceList(ArrayOfServiceListItem value) {
        this.serviceList = value;
    }

}
