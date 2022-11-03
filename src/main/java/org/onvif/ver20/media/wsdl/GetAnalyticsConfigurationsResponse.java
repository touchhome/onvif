package org.onvif.ver20.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.VideoAnalyticsConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configurations"
})
@XmlRootElement(name = "GetAnalyticsConfigurationsResponse")
public class GetAnalyticsConfigurationsResponse {

  @XmlElement(name = "Configurations")
  protected List<VideoAnalyticsConfiguration> configurations;

  /**
   * Gets the value of the configurations property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the configurations property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfigurations().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link VideoAnalyticsConfiguration }
   */
  public List<VideoAnalyticsConfiguration> getConfigurations() {
    if (configurations == null) {
      configurations = new ArrayList<VideoAnalyticsConfiguration>();
    }
    return this.configurations;
  }

}
