package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.GroupdocAddReq;
import io.swagger.model.GroupdocAddRes;
import io.swagger.model.GroupdocDeleteReq;
import io.swagger.model.GroupdocEditReq;
import io.swagger.model.GroupdocEditquotaReq;
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
public class GroupdocApiController implements GroupdocApi {

    private static final Logger log = LoggerFactory.getLogger(GroupdocApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GroupdocApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GroupdocAddRes> groupdocAddPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody GroupdocAddReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GroupdocAddRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926\",\n  \"typename\" : \"群组文档\"\n}", GroupdocAddRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GroupdocAddRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GroupdocAddRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> groupdocDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody GroupdocDeleteReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> groupdocEditPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody GroupdocEditReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> groupdocEditquotaPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody GroupdocEditquotaReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
