package io.swagger.api;

import io.swagger.model.InvitationStatus;
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

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

@Controller
public class InvitationsApiController implements InvitationsApi {

    private static final Logger log = LoggerFactory.getLogger(InvitationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InvitationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> invitationsInvitationIdDelete(@ApiParam(value = "",required=true) @PathVariable("invitationId") String invitationId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Invitation> invitationsInvitationIdPut(@ApiParam(value = "",required=true) @PathVariable("invitationId") String invitationId,@ApiParam(value = ""  )  @Valid @RequestBody InvitationStatus data) {
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

}
