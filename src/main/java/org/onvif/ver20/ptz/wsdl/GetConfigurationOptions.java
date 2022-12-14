package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java-Klasse f�r anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten
 * ist.
 *
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"configurationToken"})
@XmlRootElement(name = "GetConfigurationOptions")
public class GetConfigurationOptions {

  @XmlElement(name = "ConfigurationToken", required = true)
  protected String configurationToken;

  /**
   * Ruft den Wert der configurationToken-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getConfigurationToken() {
    return configurationToken;
  }

  /**
   * Legt den Wert der configurationToken-Eigenschaft fest.
   *
   * @param value allowed object is {@link String }
   */
  public void setConfigurationToken(String value) {
    this.configurationToken = value;
  }
}
