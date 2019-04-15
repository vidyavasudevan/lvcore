package io.swagger.api;

import io.swagger.model.VolunteerRequest;
import io.swagger.model.VolunteerRequestStatus;
import io.swagger.model.ParticipantRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

@Controller
public class EventApiController implements EventApi {

    private static final Logger log = LoggerFactory.getLogger(EventApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EventApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ParticipantRequest> requestToVolunteer(@ApiParam(value = "",required=true) @PathVariable("eventId") String eventId,@ApiParam(value = ""  )  @Valid @RequestBody VolunteerRequest data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ParticipantRequest>(objectMapper.readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"roles\" : [ \"roles\", \"roles\" ],  \"id\" : \"id\",  \"message\" : \"message\",  \"userId\" : \"userId\",  \"email\" : \"email\",  \"status\" : \"PENDING\"}", ParticipantRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ParticipantRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ParticipantRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ParticipantRequest> respondToVolunteerRequest(@ApiParam(value = "",required=true) @PathVariable("eventId") String eventId,@ApiParam(value = ""  )  @Valid @RequestBody VolunteerRequestStatus data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ParticipantRequest>(objectMapper.readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"roles\" : [ \"roles\", \"roles\" ],  \"id\" : \"id\",  \"message\" : \"message\",  \"userId\" : \"userId\",  \"email\" : \"email\",  \"status\" : \"PENDING\"}", ParticipantRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ParticipantRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ParticipantRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

}
