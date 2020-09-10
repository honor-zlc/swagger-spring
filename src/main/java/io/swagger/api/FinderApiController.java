package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.FinderDisableReq;
import io.swagger.model.FinderEnableReq;
import io.swagger.model.FinderGetenabledRes;
import io.swagger.model.FinderGetstatusReq;
import io.swagger.model.FinderGetstatusRes;
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
public class FinderApiController implements FinderApi {

    private static final Logger log = LoggerFactory.getLogger(FinderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FinderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> finderDisablePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinderDisableReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> finderEnablePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinderEnableReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FinderGetenabledRes> finderGetenabledPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FinderGetenabledRes>(objectMapper.readValue("{\n  \"docinfos\" : [ {\n    \"docid\" : \"gns://8CFF1A05F851452C9EE140819B931155\",\n    \"path\" : \"张三\\算法1\",\n    \"size\" : -1,\n    \"client_mtim\" : 1380502294452719\n  }, {\n    \"docid\" : \"gns://8CFF1A05F851452C9EE140819B931133\",\n    \"path\" : \"张三\\算法2\\file.txt\",\n    \"size\" : 1024,\n    \"client_mtim\" : 1380502294452719\n  } ]\n}", FinderGetenabledRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FinderGetenabledRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FinderGetenabledRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FinderGetstatusRes> finderGetstatusPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinderGetstatusReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FinderGetstatusRes>(objectMapper.readValue("{\n  \"status\" : true\n}", FinderGetstatusRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FinderGetstatusRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FinderGetstatusRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
