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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateWithPrivateKey", propOrder = {"certificateID", "certificate", "privateKey", "any"})
public class CertificateWithPrivateKey {

  @XmlElement(name = "CertificateID")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String certificateID;
  @XmlElement(name = "Certificate", required = true)
  protected BinaryData certificate;
  @XmlElement(name = "PrivateKey", required = true)
  protected BinaryData privateKey;
  @XmlAnyElement(lax = true)
  protected List<java.lang.Object> any;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Ruft den Wert der certificateID-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getCertificateID() {
    return certificateID;
  }

  /**
   * Legt den Wert der certificateID-Eigenschaft fest.
   *
   * @param value allowed object is {@link String }
   */
  public void setCertificateID(String value) {
    this.certificateID = value;
  }

  /**
   * Ruft den Wert der certificate-Eigenschaft ab.
   *
   * @return possible object is {@link BinaryData }
   */
  public BinaryData getCertificate() {
    return certificate;
  }

  /**
   * Legt den Wert der certificate-Eigenschaft fest.
   *
   * @param value allowed object is {@link BinaryData }
   */
  public void setCertificate(BinaryData value) {
    this.certificate = value;
  }

  /**
   * Ruft den Wert der privateKey-Eigenschaft ab.
   *
   * @return possible object is {@link BinaryData }
   */
  public BinaryData getPrivateKey() {
    return privateKey;
  }

  /**
   * Legt den Wert der privateKey-Eigenschaft fest.
   *
   * @param value allowed object is {@link BinaryData }
   */
  public void setPrivateKey(BinaryData value) {
    this.privateKey = value;
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
   *
   * <pre>
   * getAny().add(newItem);
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
