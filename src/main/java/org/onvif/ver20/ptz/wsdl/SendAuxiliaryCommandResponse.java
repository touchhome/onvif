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
 *         <element name="AuxiliaryResponse" type="{http://www.onvif.org/ver10/schema}AuxiliaryData"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"auxiliaryResponse"})
@XmlRootElement(name = "SendAuxiliaryCommandResponse")
public class SendAuxiliaryCommandResponse {

  @XmlElement(name = "AuxiliaryResponse", required = true)
  protected String auxiliaryResponse;

  /**
   * Ruft den Wert der auxiliaryResponse-Eigenschaft ab.
   *
   * @return possible object is {@link String }
   */
  public String getAuxiliaryResponse() {
    return auxiliaryResponse;
  }

  /**
   * Legt den Wert der auxiliaryResponse-Eigenschaft fest.
   *
   * @param value allowed object is {@link String }
   */
  public void setAuxiliaryResponse(String value) {
    this.auxiliaryResponse = value;
  }
}
