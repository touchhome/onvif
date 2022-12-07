package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * Java-Klasse f�r IrCutFilterAutoAdjustmentOptions complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten
 * ist.
 *
 * <pre>
 * <complexType name="IrCutFilterAutoAdjustmentOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoundaryType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="BoundaryOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ResponseTimeRange" type="{http://www.onvif.org/ver10/schema}DurationRange" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "IrCutFilterAutoAdjustmentOptions",
    propOrder = {"boundaryType", "boundaryOffset", "responseTimeRange", "extension"})
public class IrCutFilterAutoAdjustmentOptions {

  @XmlElement(name = "BoundaryType", required = true)
  protected List<String> boundaryType;

  @XmlElement(name = "BoundaryOffset")
  protected Boolean boundaryOffset;

  @XmlElement(name = "ResponseTimeRange")
  protected DurationRange responseTimeRange;

  @XmlElement(name = "Extension")
  protected IrCutFilterAutoAdjustmentOptionsExtension extension;

  @XmlAnyAttribute private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Gets the value of the boundaryType property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the boundaryType property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   * getBoundaryType().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getBoundaryType() {
    if (boundaryType == null) {
      boundaryType = new ArrayList<String>();
    }
    return this.boundaryType;
  }

  /**
   * Ruft den Wert der boundaryOffset-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isBoundaryOffset() {
    return boundaryOffset;
  }

  /**
   * Legt den Wert der boundaryOffset-Eigenschaft fest.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setBoundaryOffset(Boolean value) {
    this.boundaryOffset = value;
  }

  /**
   * Ruft den Wert der responseTimeRange-Eigenschaft ab.
   *
   * @return possible object is {@link DurationRange }
   */
  public DurationRange getResponseTimeRange() {
    return responseTimeRange;
  }

  /**
   * Legt den Wert der responseTimeRange-Eigenschaft fest.
   *
   * @param value allowed object is {@link DurationRange }
   */
  public void setResponseTimeRange(DurationRange value) {
    this.responseTimeRange = value;
  }

  /**
   * Ruft den Wert der extension-Eigenschaft ab.
   *
   * @return possible object is {@link IrCutFilterAutoAdjustmentOptionsExtension }
   */
  public IrCutFilterAutoAdjustmentOptionsExtension getExtension() {
    return extension;
  }

  /**
   * Legt den Wert der extension-Eigenschaft fest.
   *
   * @param value allowed object is {@link IrCutFilterAutoAdjustmentOptionsExtension }
   */
  public void setExtension(IrCutFilterAutoAdjustmentOptionsExtension value) {
    this.extension = value;
  }

  /**
   * Gets a map that contains attributes that aren't bound to any typed property on this class.
   *
   * <p>the map is keyed by the name of the attribute and the value is the string value of the
   * attribute.
   *
   * <p>the map returned by this method is live, and you can add new attribute by updating the map
   * directly. Because of this design, there's no setter.
   *
   * @return always non-null
   */
  public Map<QName, String> getOtherAttributes() {
    return otherAttributes;
  }
}
