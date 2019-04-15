package io.swagger.api;

import io.swagger.model.User;
import io.swagger.model.UserEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.spring.web.json.Json;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-26T05:19:37.458Z")

@RestController
public class UserApiController {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @ApiOperation(value = "Create user", nickname = "createUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user",
            produces = { "application/json", "application/xml" },
            method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid username supplied"),
            @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{idOrEmail}",
            produces = { "application/json" },
            method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The id of the user who needs to be deleted",required=true) @PathVariable("idOrEmail") String idOrEmail) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get user by user id", nickname = "getUserByIdOrEmail", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = User.class),
            @ApiResponse(code = 403, message = "access denied"),
            @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{idOrEmail}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<User> getUserByIdOrEmail(@ApiParam(value = "The id/email of user to be fetched",required=true) @PathVariable("idOrEmail") String idOrEmail) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                log.debug("Going to map object ");
                return new ResponseEntity<User>(objectMapper.readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"phone\" : \"phone\",  \"providerId\" : \"providerId\",  \"id\" : \"id\",  \"email\" : \"email\",  \"passwordHash\" : \"passwordHash\",  \"identityProvider\" : \"identityProvider\"}", User.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "get user events", nickname = "getUserEvents", notes = "This can only be done by the logged in user.", response = UserEvent.class, responseContainer = "List", tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = UserEvent.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid user id or email supplied"),
            @ApiResponse(code = 403, message = "Access Denied"),
            @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{idOrEmail}/events",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<List<UserEvent>> getUserEvents(@ApiParam(value = "The id or email of user",required=true) @PathVariable("idOrEmail") String idOrEmail,@ApiParam(value = "Specify the type of events.", allowableValues = "all, upcoming, invited, requested, past") @Valid @RequestParam(value = "eventType", required = false) String eventType,@ApiParam(value = "number of current results for pagination") @Valid @RequestParam(value = "count", required = false) Integer count,@ApiParam(value = "pgination offset") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "") @Valid @RequestParam(value = "total", required = false) Integer total) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserEvent>>(objectMapper.readValue("[ {  \"eventId\" : \"eventId\",  \"userEventType\" : \"all\",  \"userId\" : \"userId\",  \"eventDate\" : \"2000-01-23\"}, {  \"eventId\" : \"eventId\",  \"userEventType\" : \"all\",  \"userId\" : \"userId\",  \"eventDate\" : \"2000-01-23\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserEvent>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserEvent>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "autorization redirect", nickname = "authorize", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = String.class),
            @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(value = "/authorize",
            produces = { "application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<Json> authorize(@ApiParam(value = "The code from ID provider",required=true) @PathVariable("code") String code,
                                          @ApiParam(value = "The generated state",required=true) @PathVariable("state") String state) {

        return new ResponseEntity<Json>(new Json("{\"success\" : true}"), HttpStatus.OK);
    }


    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = String.class),
            @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
            produces = { "application/json", "application/xml" },
            method = RequestMethod.GET)
    public ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password hash for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("aeiou", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/logout",
            produces = { "application/json", "application/xml" },
            method = RequestMethod.GET)
    public ResponseEntity<Void> logoutUser() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "Updated user", nickname = "updateUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid user supplied"),
            @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{idOrEmail}",
            produces = { "application/json" },
            method = RequestMethod.PUT)
    public ResponseEntity<Void> updateUser(@ApiParam(value = "id of the user that need to be updated",required=true) @PathVariable("idOrEmail") String idOrEmail,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
