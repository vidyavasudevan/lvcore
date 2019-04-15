package io.swagger.api;

import io.swagger.model.InvitationRequest;
import io.swagger.model.Event;
import io.swagger.model.Invitation;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

@Controller
public class EventsApiController implements EventsApi {

    private static final Logger log = LoggerFactory.getLogger(EventsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EventsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Event> createEvent(@ApiParam(value = "The event details" ,required=true )  @Valid @RequestBody Event event) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Event>(objectMapper.readValue("{  \"summary\" : {    \"dateTime\" : 0.80082819046101150206595775671303272247314453125,    \"organization\" : \"organization\",    \"host\" : {      \"level\" : \"level\",      \"name\" : \"name\",      \"id\" : \"id\",      \"email\" : \"email\"    },    \"location\" : {      \"country\" : \"country\",      \"zipCode\" : 6,      \"city\" : \"city\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"state\" : \"state\"    },    \"title\" : \"title\",    \"category\" : \"category\"  },  \"details\" : {    \"eventUrl\" : \"eventUrl\",    \"organization\" : \"organization\",    \"roles\" : [ \"roles\", \"roles\" ],    \"bannerUrl\" : \"bannerUrl\",    \"description\" : \"description\",    \"volunteerCount\" : {      \"confirmed\" : 5,      \"required\" : 1    }  },  \"id\" : \"id\"}", Event.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Event>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Event>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteEventById(@ApiParam(value = "",required=true) @PathVariable("eventId") String eventId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Invitation> eventsEventIdInvitationsPost(@ApiParam(value = "",required=true) @PathVariable("eventId") String eventId,@ApiParam(value = ""  )  @Valid @RequestBody InvitationRequest invitationRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Invitation>(objectMapper.readValue("{  \"roles\" : [ \"roles\", \"roles\" ],  \"id\" : 0,  \"email\" : 6,  \"status\" : \"pending\"}", Invitation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Invitation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Invitation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Event> getEventById(@ApiParam(value = "",required=true) @PathVariable("eventId") String eventId,@ApiParam(value = "true if the event details are needed.", defaultValue = "false") @Valid @RequestParam(value = "withDetails", required = false, defaultValue="false") Boolean withDetails) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Event>(objectMapper.readValue("{  \"summary\" : {    \"dateTime\" : 0.80082819046101150206595775671303272247314453125,    \"organization\" : \"organization\",    \"host\" : {      \"level\" : \"level\",      \"name\" : \"name\",      \"id\" : \"id\",      \"email\" : \"email\"    },    \"location\" : {      \"country\" : \"country\",      \"zipCode\" : 6,      \"city\" : \"city\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"state\" : \"state\"    },    \"title\" : \"title\",    \"category\" : \"category\"  },  \"details\" : {    \"eventUrl\" : \"eventUrl\",    \"organization\" : \"organization\",    \"roles\" : [ \"roles\", \"roles\" ],    \"bannerUrl\" : \"bannerUrl\",    \"description\" : \"description\",    \"volunteerCount\" : {      \"confirmed\" : 5,      \"required\" : 1    }  },  \"id\" : \"id\"}", Event.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Event>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Event>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Event>> getEvents(@ApiParam(value = "", allowableValues = "location, category") @Valid @RequestParam(value = "filterBy", required = false) String filterBy,@ApiParam(value = "") @Valid @RequestParam(value = "filterFor", required = false) String filterFor,@ApiParam(value = "", allowableValues = "distance, date") @Valid @RequestParam(value = "sortBy", required = false) String sortBy) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Event>>(objectMapper.readValue("[ {  \"summary\" : {    \"dateTime\" : 0.80082819046101150206595775671303272247314453125,    \"organization\" : \"organization\",    \"host\" : {      \"level\" : \"level\",      \"name\" : \"name\",      \"id\" : \"id\",      \"email\" : \"email\"    },    \"location\" : {      \"country\" : \"country\",      \"zipCode\" : 6,      \"city\" : \"city\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"state\" : \"state\"    },    \"title\" : \"title\",    \"category\" : \"category\"  },  \"details\" : {    \"eventUrl\" : \"eventUrl\",    \"organization\" : \"organization\",    \"roles\" : [ \"roles\", \"roles\" ],    \"bannerUrl\" : \"bannerUrl\",    \"description\" : \"description\",    \"volunteerCount\" : {      \"confirmed\" : 5,      \"required\" : 1    }  },  \"id\" : \"id\"}, {  \"summary\" : {    \"dateTime\" : 0.80082819046101150206595775671303272247314453125,    \"organization\" : \"organization\",    \"host\" : {      \"level\" : \"level\",      \"name\" : \"name\",      \"id\" : \"id\",      \"email\" : \"email\"    },    \"location\" : {      \"country\" : \"country\",      \"zipCode\" : 6,      \"city\" : \"city\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"state\" : \"state\"    },    \"title\" : \"title\",    \"category\" : \"category\"  },  \"details\" : {    \"eventUrl\" : \"eventUrl\",    \"organization\" : \"organization\",    \"roles\" : [ \"roles\", \"roles\" ],    \"bannerUrl\" : \"bannerUrl\",    \"description\" : \"description\",    \"volunteerCount\" : {      \"confirmed\" : 5,      \"required\" : 1    }  },  \"id\" : \"id\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Event>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Event>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Event> updateEvent(@ApiParam(value = "The id of the event to be updated",required=true) @PathVariable("eventId") String eventId,@ApiParam(value = "The updated event details" ,required=true )  @Valid @RequestBody Event event) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Event>(objectMapper.readValue("{  \"summary\" : {    \"dateTime\" : 0.80082819046101150206595775671303272247314453125,    \"organization\" : \"organization\",    \"host\" : {      \"level\" : \"level\",      \"name\" : \"name\",      \"id\" : \"id\",      \"email\" : \"email\"    },    \"location\" : {      \"country\" : \"country\",      \"zipCode\" : 6,      \"city\" : \"city\",      \"addressLine1\" : \"addressLine1\",      \"addressLine2\" : \"addressLine2\",      \"state\" : \"state\"    },    \"title\" : \"title\",    \"category\" : \"category\"  },  \"details\" : {    \"eventUrl\" : \"eventUrl\",    \"organization\" : \"organization\",    \"roles\" : [ \"roles\", \"roles\" ],    \"bannerUrl\" : \"bannerUrl\",    \"description\" : \"description\",    \"volunteerCount\" : {      \"confirmed\" : 5,      \"required\" : 1    }  },  \"id\" : \"id\"}", Event.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Event>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Event>(HttpStatus.NOT_IMPLEMENTED);
    }

}
