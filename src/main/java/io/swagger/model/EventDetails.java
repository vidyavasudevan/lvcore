package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VolunteerCount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

public class EventDetails   {
  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("volunteerCount")
  private VolunteerCount volunteerCount = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  @JsonProperty("bannerUrl")
  private String bannerUrl = null;

  @JsonProperty("eventUrl")
  private String eventUrl = null;

  public EventDetails organization(String organization) {
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

  public EventDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EventDetails volunteerCount(VolunteerCount volunteerCount) {
    this.volunteerCount = volunteerCount;
    return this;
  }

  /**
   * Get volunteerCount
   * @return volunteerCount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VolunteerCount getVolunteerCount() {
    return volunteerCount;
  }

  public void setVolunteerCount(VolunteerCount volunteerCount) {
    this.volunteerCount = volunteerCount;
  }

  public EventDetails roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public EventDetails addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public EventDetails bannerUrl(String bannerUrl) {
    this.bannerUrl = bannerUrl;
    return this;
  }

  /**
   * Get bannerUrl
   * @return bannerUrl
  **/
  @ApiModelProperty(value = "")


  public String getBannerUrl() {
    return bannerUrl;
  }

  public void setBannerUrl(String bannerUrl) {
    this.bannerUrl = bannerUrl;
  }

  public EventDetails eventUrl(String eventUrl) {
    this.eventUrl = eventUrl;
    return this;
  }

  /**
   * Get eventUrl
   * @return eventUrl
  **/
  @ApiModelProperty(value = "")


  public String getEventUrl() {
    return eventUrl;
  }

  public void setEventUrl(String eventUrl) {
    this.eventUrl = eventUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDetails eventDetails = (EventDetails) o;
    return Objects.equals(this.organization, eventDetails.organization) &&
        Objects.equals(this.description, eventDetails.description) &&
        Objects.equals(this.volunteerCount, eventDetails.volunteerCount) &&
        Objects.equals(this.roles, eventDetails.roles) &&
        Objects.equals(this.bannerUrl, eventDetails.bannerUrl) &&
        Objects.equals(this.eventUrl, eventDetails.eventUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, description, volunteerCount, roles, bannerUrl, eventUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDetails {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    volunteerCount: ").append(toIndentedString(volunteerCount)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    bannerUrl: ").append(toIndentedString(bannerUrl)).append("\n");
    sb.append("    eventUrl: ").append(toIndentedString(eventUrl)).append("\n");
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

