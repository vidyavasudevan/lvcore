package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Location;
import io.swagger.model.UserProfile;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

public class EventSummary   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("dateTime")
  private BigDecimal dateTime = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("host")
  private UserProfile host = null;

  @JsonProperty("organization")
  private String organization = null;

  public EventSummary title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the event
   * @return title
  **/
  @ApiModelProperty(required = true, value = "title of the event")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EventSummary category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public EventSummary dateTime(BigDecimal dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * event date and time as timestamp
   * @return dateTime
  **/
  @ApiModelProperty(required = true, value = "event date and time as timestamp")
  @NotNull

  @Valid

  public BigDecimal getDateTime() {
    return dateTime;
  }

  public void setDateTime(BigDecimal dateTime) {
    this.dateTime = dateTime;
  }

  public EventSummary location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public EventSummary host(UserProfile host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserProfile getHost() {
    return host;
  }

  public void setHost(UserProfile host) {
    this.host = host;
  }

  public EventSummary organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")


  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSummary eventSummary = (EventSummary) o;
    return Objects.equals(this.title, eventSummary.title) &&
        Objects.equals(this.category, eventSummary.category) &&
        Objects.equals(this.dateTime, eventSummary.dateTime) &&
        Objects.equals(this.location, eventSummary.location) &&
        Objects.equals(this.host, eventSummary.host) &&
        Objects.equals(this.organization, eventSummary.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, category, dateTime, location, host, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSummary {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

