package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioEncoder2ConfigurationOptions", propOrder = {
    "encoding",
    "bitrateList",
    "sampleRateList",
    "any"
})
public class AudioEncoder2ConfigurationOptions {

  @XmlElement(name = "Encoding", required = true)
  protected String encoding;
  @XmlElement(name = "BitrateList", required = true)
  protected IntList bitrateList;
  @XmlElement(name = "SampleRateList", required = true)
  protected IntList sampleRateList;
  @XmlAnyElement(lax = true)
  protected List<java.lang.Object> any;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Ruft den Wert der encoding-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getEncoding() {
    return encoding;
  }

  /**
   * Legt den Wert der encoding-Eigenschaft fest.
   *
   * @param value allowed object is {@link String }
   */
  public void setEncoding(String value) {
    this.encoding = value;
  }

  /**
   * Ruft den Wert der bitrateList-Eigenschaft ab.
   *
   * @return possible object is {@link IntList }
   */
  public IntList getBitrateList() {
    return bitrateList;
  }

  /**
   * Legt den Wert der bitrateList-Eigenschaft fest.
   *
   * @param value allowed object is {@link IntList }
   */
  public void setBitrateList(IntList value) {
    this.bitrateList = value;
  }

  /**
   * Ruft den Wert der sampleRateList-Eigenschaft ab.
   *
   * @return possible object is {@link IntList }
   */
  public IntList getSampleRateList() {
    return sampleRateList;
  }

  /**
   * Legt den Wert der sampleRateList-Eigenschaft fest.
   *
   * @param value allowed object is {@link IntList }
   */
  public void setSampleRateList(IntList value) {
    this.sampleRateList = value;
  }

  /**
   * Gets the value of the any property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the any property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAny().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
   */
  public List<java.lang.Object> getAny() {
    if (any == null) {
      any = new ArrayList<java.lang.Object>();
    }
    return this.any;
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
