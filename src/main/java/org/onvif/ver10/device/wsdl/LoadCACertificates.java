//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.5-2 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2014.02.04 um 12:22:03 PM CET
//

package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Certificate;

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
 *         <element name="CACertificate" type="{http://www.onvif.org/ver10/schema}Certificate" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"caCertificate"})
@XmlRootElement(name = "LoadCACertificates")
public class LoadCACertificates {

  @XmlElement(name = "CACertificate", required = true)
  protected List<Certificate> caCertificate;

  /**
   * Gets the value of the caCertificate property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the caCertificate property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   * getCACertificate().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Certificate }
   */
  public List<Certificate> getCACertificate() {
    if (caCertificate == null) {
      caCertificate = new ArrayList<Certificate>();
    }
    return this.caCertificate;
  }
}
