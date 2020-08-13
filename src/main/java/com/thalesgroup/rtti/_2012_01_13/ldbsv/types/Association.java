
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An individual association that occurs at a ServiceLocation
 * 
 * <p>Java class for Association complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Association"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}AssocCategoryType"/&gt;
 *         &lt;element name="rid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}RIDType"/&gt;
 *         &lt;element name="uid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}UIDType"/&gt;
 *         &lt;element name="trainid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TrainIDType"/&gt;
 *         &lt;element name="rsid" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}RSIDType" minOccurs="0"/&gt;
 *         &lt;element name="sdd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="origin" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/&gt;
 *         &lt;element name="originCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/&gt;
 *         &lt;element name="originTiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/&gt;
 *         &lt;element name="destination" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/&gt;
 *         &lt;element name="destCRS" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/&gt;
 *         &lt;element name="destTiploc" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Association", propOrder = {
    "category",
    "rid",
    "uid",
    "trainid",
    "rsid",
    "sdd",
    "origin",
    "originCRS",
    "originTiploc",
    "destination",
    "destCRS",
    "destTiploc"
})
public class Association {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AssocCategoryType category;
    @XmlElement(required = true)
    protected String rid;
    @XmlElement(required = true)
    protected String uid;
    @XmlElement(required = true)
    protected String trainid;
    protected String rsid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sdd;
    @XmlElement(required = true)
    protected String origin;
    protected String originCRS;
    @XmlElement(required = true)
    protected String originTiploc;
    @XmlElement(required = true)
    protected String destination;
    protected String destCRS;
    @XmlElement(required = true)
    protected String destTiploc;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link AssocCategoryType }
     *     
     */
    public AssocCategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssocCategoryType }
     *     
     */
    public void setCategory(AssocCategoryType value) {
        this.category = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRid() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRid(String value) {
        this.rid = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the trainid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainid() {
        return trainid;
    }

    /**
     * Sets the value of the trainid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainid(String value) {
        this.trainid = value;
    }

    /**
     * Gets the value of the rsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsid() {
        return rsid;
    }

    /**
     * Sets the value of the rsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsid(String value) {
        this.rsid = value;
    }

    /**
     * Gets the value of the sdd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSdd() {
        return sdd;
    }

    /**
     * Sets the value of the sdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSdd(XMLGregorianCalendar value) {
        this.sdd = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the originCRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCRS() {
        return originCRS;
    }

    /**
     * Sets the value of the originCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCRS(String value) {
        this.originCRS = value;
    }

    /**
     * Gets the value of the originTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTiploc() {
        return originTiploc;
    }

    /**
     * Sets the value of the originTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTiploc(String value) {
        this.originTiploc = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the destCRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCRS() {
        return destCRS;
    }

    /**
     * Sets the value of the destCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCRS(String value) {
        this.destCRS = value;
    }

    /**
     * Gets the value of the destTiploc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestTiploc() {
        return destTiploc;
    }

    /**
     * Sets the value of the destTiploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestTiploc(String value) {
        this.destTiploc = value;
    }

}
