
package com.thalesgroup.rtti._2016_02_16.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure containing details of a departure board for a specific location with a QoS value.
 * 
 * <p>Java class for StationHeaderQos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationHeaderQos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}StationHeaderTrunc"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qos" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="1.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationHeaderQos", propOrder = {
    "qos"
})
@XmlSeeAlso({
    com.thalesgroup.rtti._2016_02_16.ldbsv.types.StationBoard.class,
    com.thalesgroup.rtti._2017_10_01.ldbsv.types.StationBoard.class
})
public class StationHeaderQos
    extends StationHeaderTrunc
{

    protected Float qos;

    /**
     * Gets the value of the qos property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQos() {
        return qos;
    }

    /**
     * Sets the value of the qos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQos(Float value) {
        this.qos = value;
    }

}
