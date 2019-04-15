package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VolunteerCount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

public class VolunteerCount   {
  @JsonProperty("required")
  private Integer required = null;

  @JsonProperty("confirmed")
  private Integer confirmed = null;

  public VolunteerCount required(Integer required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")


  public Integer getRequired() {
    return required;
  }

  public void setRequired(Integer required) {
    this.required = required;
  }

  public VolunteerCount confirmed(Integer confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(value = "")


  public Integer getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Integer confirmed) {
    this.confirmed = confirmed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolunteerCount volunteerCount = (VolunteerCount) o;
    return Objects.equals(this.required, volunteerCount.required) &&
        Objects.equals(this.confirmed, volunteerCount.confirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, confirmed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolunteerCount {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
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

