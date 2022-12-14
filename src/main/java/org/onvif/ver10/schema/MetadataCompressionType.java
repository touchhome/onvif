package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java-Klasse f�r MetadataCompressionType.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten
 * ist.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="MetadataCompressionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="GZIP"/>
 *     &lt;enumeration value="EXI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "MetadataCompressionType")
@XmlEnum
public enum MetadataCompressionType {
  @XmlEnumValue("None")
  NONE("None"),
  GZIP("GZIP"),
  EXI("EXI");
  private final String value;

  MetadataCompressionType(String v) {
    value = v;
  }

  public static MetadataCompressionType fromValue(String v) {
    for (MetadataCompressionType c : MetadataCompressionType.values()) {
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
