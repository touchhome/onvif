package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigDescriptionExtension", propOrder = {"any"})
public class ConfigDescriptionExtension {

  @XmlAnyElement(lax = true)
  protected List<java.lang.Object> any;

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

}
