package org.onvif.ver20.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * Java-Klasse f�r StreamingCapabilities complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten
 * ist.
 *
 * <pre>
 * &lt;complexType name="StreamingCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RTSPStreaming" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RTPMulticast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NonAggregateControl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "StreamingCapabilities",
    propOrder = {"any"})
public class StreamingCapabilities {

  @XmlAnyElement(lax = true)
  protected List<Object> any;

  @XmlAttribute(name = "RTSPStreaming")
  protected Boolean rtspStreaming;

  @XmlAttribute(name = "RTPMulticast")
  protected Boolean rtpMulticast;

  @XmlAttribute(name = "RTP_RTSP_TCP")
  protected Boolean rtprtsptcp;

  @XmlAttribute(name = "NonAggregateControl")
  protected Boolean nonAggregateControl;

  @XmlAnyAttribute private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Gets the value of the any property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the any property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getAny().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
   */
  public List<Object> getAny() {
    if (any == null) {
      any = new ArrayList<Object>();
    }
    return this.any;
  }

  /**
   * Ruft den Wert der rtspStreaming-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isRTSPStreaming() {
    return rtspStreaming;
  }

  /**
   * Legt den Wert der rtspStreaming-Eigenschaft fest.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setRTSPStreaming(Boolean value) {
    this.rtspStreaming = value;
  }

  /**
   * Ruft den Wert der rtpMulticast-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isRTPMulticast() {
    return rtpMulticast;
  }

  /**
   * Legt den Wert der rtpMulticast-Eigenschaft fest.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setRTPMulticast(Boolean value) {
    this.rtpMulticast = value;
  }

  /**
   * Ruft den Wert der rtprtsptcp-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isRTPRTSPTCP() {
    return rtprtsptcp;
  }

  /**
   * Legt den Wert der rtprtsptcp-Eigenschaft fest.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setRTPRTSPTCP(Boolean value) {
    this.rtprtsptcp = value;
  }

  /**
   * Ruft den Wert der nonAggregateControl-Eigenschaft ab.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isNonAggregateControl() {
    return nonAggregateControl;
  }

  /**
   * Legt den Wert der nonAggregateControl-Eigenschaft fest.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setNonAggregateControl(Boolean value) {
    this.nonAggregateControl = value;
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
