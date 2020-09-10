package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InvitationCloseReq;
import io.swagger.model.InvitationGetReq;
import io.swagger.model.InvitationGetRes;
import io.swagger.model.InvitationGetbaseinfobydocidReq;
import io.swagger.model.InvitationGetbaseinfobydocidRes;
import io.swagger.model.InvitationGetnoteinfobydocidReq;
import io.swagger.model.InvitationGetnoteinfobydocidRes;
import io.swagger.model.InvitationJoinReq;
import io.swagger.model.InvitationJoinRes;
import io.swagger.model.InvitationOpenReq;
import io.swagger.model.InvitationOpenRes;
import io.swagger.model.InvitationSetbaseinfoReq;
import io.swagger.model.InvitationSetnoteinfoReq;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")
@Controller
public class InvitationApiController implements InvitationApi {

    private static final Logger log = LoggerFactory.getLogger(InvitationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InvitationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> invitationClosePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationCloseReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InvitationGetRes> invitationGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationGetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InvitationGetRes>(objectMapper.readValue("{\n  \"invitationendtime\" : 1487951999000000,\n  \"perm\" : 3,\n  \"permendtime\" : 1487951999000000,\n  \"image\" : \"\",\n  \"description\" : \"\",\n  \"docname\" : \"t1\",\n  \"isdir\" : true\n}", InvitationGetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InvitationGetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InvitationGetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InvitationGetbaseinfobydocidRes> invitationGetbaseinfobydocidPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationGetbaseinfobydocidReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InvitationGetbaseinfobydocidRes>(objectMapper.readValue("{\n  \"invitationendtime\" : 1487951999000000,\n  \"invitationid\" : \"c084a4e9-384b-4059-a4e8-a64b7b1b792b\",\n  \"perm\" : 3,\n  \"permendtime\" : 1487951999000000\n}", InvitationGetbaseinfobydocidRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InvitationGetbaseinfobydocidRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InvitationGetbaseinfobydocidRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InvitationGetnoteinfobydocidRes> invitationGetnoteinfobydocidPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationGetnoteinfobydocidReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InvitationGetnoteinfobydocidRes>(objectMapper.readValue("{\n  \"image\" : \"\",\n  \"description\" : \"\"\n}", InvitationGetnoteinfobydocidRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InvitationGetnoteinfobydocidRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InvitationGetnoteinfobydocidRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InvitationJoinRes> invitationJoinPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationJoinReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InvitationJoinRes>(objectMapper.readValue("{\n  \"docname\" : \"AnyShare://t1\",\n  \"result\" : true\n}", InvitationJoinRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InvitationJoinRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InvitationJoinRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InvitationOpenRes> invitationOpenPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationOpenReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InvitationOpenRes>(objectMapper.readValue("{\n  \"invitationendtime\" : 1487951999000000,\n  \"invitationid\" : \"c084a4e9-384b-4059-a4e8-a64b7b1b792b\",\n  \"perm\" : 3,\n  \"permendtime\" : 1487951999000000\n}", InvitationOpenRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InvitationOpenRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InvitationOpenRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> invitationSetbaseinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationSetbaseinfoReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> invitationSetnoteinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InvitationSetnoteinfoReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
