package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * List of values.
 *
 * <p>Java-Klasse f�r IntList complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten
 * ist.
 *
 * <pre>
 * <complexType name="IntList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Items" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "IntList",
    propOrder = {"items"})
public class IntList {

  @XmlElement(name = "Items", type = Integer.class)
  protected List<Integer> items;

  /**
   * Gets the value of the items property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the items property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   * getItems().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Integer }
   */
  public List<Integer> getItems() {
    if (items == null) {
      items = new ArrayList<Integer>();
    }
    return this.items;
  }
}
