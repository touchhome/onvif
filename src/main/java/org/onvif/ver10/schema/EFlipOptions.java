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
 * <p>
 * Java-Klasse f�r EFlipOptions complex type.
 *
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * <complexType name="EFlipOptions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}EFlipMode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}EFlipOptionsExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFlipOptions", propOrder = {"mode", "extension"})
public class EFlipOptions {

  @XmlElement(name = "Mode")
  protected List<EFlipMode> mode;
  @XmlElement(name = "Extension")
  protected EFlipOptionsExtension extension;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Gets the value of the mode property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the mode property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   *
   * <pre>
   * getMode().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link EFlipMode }
   */
  public List<EFlipMode> getMode() {
    if (mode == null) {
      mode = new ArrayList<EFlipMode>();
    }
    return this.mode;
  }

  /**
   * Ruft den Wert der extension-Eigenschaft ab.
   *
   * @return possible object is {@link EFlipOptionsExtension }
   */
  public EFlipOptionsExtension getExtension() {
    return extension;
  }

  /**
   * Legt den Wert der extension-Eigenschaft fest.
   *
   * @param value allowed object is {@link EFlipOptionsExtension }
   */
  public void setExtension(EFlipOptionsExtension value) {
    this.extension = value;
  }

  /**
   * Gets a map that contains attributes that aren't bound to any typed property on this class.
   *
   * <p>
   * the map is keyed by the name of the attribute and the value is the string value of the attribute.
   * <p>
   * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
   *
   * @return always non-null
   */
  public Map<QName, String> getOtherAttributes() {
    return otherAttributes;
  }

}