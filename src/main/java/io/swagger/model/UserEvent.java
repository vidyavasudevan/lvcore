package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

public class UserEvent   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  /**
   * Gets or Sets userEventType
   */
  public enum UserEventTypeEnum {
    ALL("all"),
    
    UPCOMING("upcoming"),
    
    INVITED("invited"),
    
    REQUESTED("requested"),
    
    PAST("past");

    private String value;

    UserEventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UserEventTypeEnum fromValue(String text) {
      for (UserEventTypeEnum b : UserEventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("userEventType")
  private UserEventTypeEnum userEventType = null;

  public UserEvent userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(value = "")


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public UserEvent eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public UserEvent userEventType(UserEventTypeEnum userEventType) {
    this.userEventType = userEventType;
    return this;
  }

  /**
   * Get userEventType
   * @return userEventType
  **/
  @ApiModelProperty(value = "")


  public UserEventTypeEnum getUserEventType() {
    return userEventType;
  }

  public void setUserEventType(UserEventTypeEnum userEventType) {
    this.userEventType = userEventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEvent userEvent = (UserEvent) o;
    return Objects.equals(this.userId, userEvent.userId) &&
        Objects.equals(this.eventId, userEvent.eventId) &&
        Objects.equals(this.eventDate, userEvent.eventDate) &&
        Objects.equals(this.userEventType, userEvent.userEventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, eventId, eventDate, userEventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEvent {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    userEventType: ").append(toIndentedString(userEventType)).append("\n");
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

