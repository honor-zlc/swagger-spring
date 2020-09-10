package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.OwnerAddReq;
import io.swagger.model.OwnerCheckReq;
import io.swagger.model.OwnerCheckRes;
import io.swagger.model.OwnerDeleteReq;
import io.swagger.model.OwnerGetReq;
import io.swagger.model.OwnerGetRes;
import io.swagger.model.OwnerSetReq;
import io.swagger.model.OwnerSetRes;
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
public class OwnerApiController implements OwnerApi {

    private static final Logger log = LoggerFactory.getLogger(OwnerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OwnerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> ownerAddPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerAddReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OwnerCheckRes> ownerCheckPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerCheckReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OwnerCheckRes>(objectMapper.readValue("{\n  \"isowner\" : true\n}", OwnerCheckRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OwnerCheckRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OwnerCheckRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> ownerDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerDeleteReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OwnerGetRes> ownerGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerGetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OwnerGetRes>(objectMapper.readValue("{\n  \"ownerinfos\" : [ {\n    \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"zgd@eisoo.com\",\n    \"name\" : \"user01\",\n    \"inheritpath\" : \"gns://BEFFFD6967DC454B804AA7D8EACE7694\",\n    \"csflevel\" : 5\n  }, {\n    \"userid\" : \"d7bdf7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"mzy@eisoo.com\",\n    \"name\" : \"user21\",\n    \"inheritpath\" : \"gns://BEFFFD6967DC454B804AA7D8EACE7694/DF3318CEE414477E89D9350438EFDB03\",\n    \"csflevel\" : 5\n  } ]\n}", OwnerGetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OwnerGetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OwnerGetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OwnerSetRes> ownerSetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerSetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OwnerSetRes>(objectMapper.readValue("{\n  \"result\" : 0\n}", OwnerSetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OwnerSetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OwnerSetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
