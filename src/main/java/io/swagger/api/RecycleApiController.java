package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.RecycleDeleteReq;
import io.swagger.model.RecycleGetretentiondaysReq;
import io.swagger.model.RecycleGetretentiondaysRes;
import io.swagger.model.RecycleGetsuggestnameReq;
import io.swagger.model.RecycleGetsuggestnameRes;
import io.swagger.model.RecycleListReq;
import io.swagger.model.RecycleListRes;
import io.swagger.model.RecycleRestoreReq;
import io.swagger.model.RecycleRestoreRes;
import io.swagger.model.RecycleSetretentiondaysReq;
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
public class RecycleApiController implements RecycleApi {

    private static final Logger log = LoggerFactory.getLogger(RecycleApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RecycleApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> recycleDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RecycleDeleteReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecycleGetretentiondaysRes> recycleGetretentiondaysPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RecycleGetretentiondaysReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecycleGetretentiondaysRes>(objectMapper.readValue("{\n  \"days\" : 30\n}", RecycleGetretentiondaysRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecycleGetretentiondaysRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecycleGetretentiondaysRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecycleGetsuggestnameRes> recycleGetsuggestnamePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RecycleGetsuggestnameReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecycleGetsuggestnameRes>(objectMapper.readValue("{\n  \"name\" : \"aaaa (3)\"\n}", RecycleGetsuggestnameRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecycleGetsuggestnameRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecycleGetsuggestnameRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecycleListRes> recycleListPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RecycleListReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecycleListRes>(objectMapper.readValue("{\n  \"dirs\" : [ {\n    \"docid\" : \"gns://24D0786E37364220A53AC914D468D3C0/81CF2BE42EBA430CA2388901B8C600EF/4B67507532D14BFB9E6506865DABD40C\",\n    \"editor\" : \"user1\",\n    \"modified\" : 1380504582157621,\n    \"name\" : \"dir1\",\n    \"path\" : \"gns://24D0786E37364220A53AC914D468D3C0/81CF2BE42EBA430CA2388901B8C600EF/BCC857D5752346D0838BDD05C67CF3EF\",\n    \"size\" : -1\n  } ],\n  \"files\" : [ {\n    \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C/81CF2BE42EBA430CA2388901B8C600EF\",\n    \"editor\" : \"user1\",\n    \"modified\" : 1380502542876354,\n    \"name\" : \"file1\",\n    \"path\" : \"gns://24D0786E37364220A53AC914D468D3C0/81CF2BE42EBA430CA2388901B8C600EF/4B67507532D14BFB9E6506865DABD40C\",\n    \"size\" : 123456\n  } ],\n  \"servertime\" : 1380502542876354\n}", RecycleListRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecycleListRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecycleListRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RecycleRestoreRes> recycleRestorePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RecycleRestoreReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RecycleRestoreRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://24D0786E37364220A53AC914D468D3C0/81CF2BE42EBA430CA2388901B8C600EF/24D0786E37364220A53AC914D468D3C0\"\n}", RecycleRestoreRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RecycleRestoreRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RecycleRestoreRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> recycleSetretentiondaysPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RecycleSetretentiondaysReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
