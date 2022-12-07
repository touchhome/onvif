package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZConfiguration;

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
 *         <element name="PTZConfiguration" type="{http://www.onvif.org/ver10/schema}PTZConfiguration"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"ptzConfiguration"})
@XmlRootElement(name = "GetConfigurationResponse")
public class GetConfigurationResponse {

  @XmlElement(name = "PTZConfiguration", required = true)
  protected PTZConfiguration ptzConfiguration;

  /**
   * Ruft den Wert der ptzConfiguration-Eigenschaft ab.
   *
   * @return possible object is {@link PTZConfiguration }
   */
  public PTZConfiguration getPTZConfiguration() {
    return ptzConfiguration;
  }

  /**
   * Legt den Wert der ptzConfiguration-Eigenschaft fest.
   *
   * @param value allowed object is {@link PTZConfiguration }
   */
  public void setPTZConfiguration(PTZConfiguration value) {
    this.ptzConfiguration = value;
  }
}
