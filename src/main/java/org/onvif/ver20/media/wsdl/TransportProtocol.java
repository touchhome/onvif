package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java-Klasse f�r TransportProtocol.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten
 * ist.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="TransportProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RtspUnicast"/>
 *     &lt;enumeration value="RtspMulticast"/>
 *     &lt;enumeration value="RTSP"/>
 *     &lt;enumeration value="RtspOverHttp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "TransportProtocol")
@XmlEnum
public enum TransportProtocol {
  @XmlEnumValue("RtspUnicast")
  RTSP_UNICAST("RtspUnicast"),
  @XmlEnumValue("RtspMulticast")
  RTSP_MULTICAST("RtspMulticast"),
  RTSP("RTSP"),
  @XmlEnumValue("RtspOverHttp")
  RTSP_OVER_HTTP("RtspOverHttp");
  private final String value;

  TransportProtocol(String v) {
    value = v;
  }

  public static TransportProtocol fromValue(String v) {
    for (TransportProtocol c : TransportProtocol.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String value() {
    return value;
  }
}
