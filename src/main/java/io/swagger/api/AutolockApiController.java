package io.swagger.api;

import io.swagger.model.AutolockGetdirlockinfoReq;
import io.swagger.model.AutolockGetdirlockinfoRes;
import io.swagger.model.AutolockGetlockedfileinfosReq;
import io.swagger.model.AutolockGetlockedfileinfosRes;
import io.swagger.model.AutolockGetlockinfoReq;
import io.swagger.model.AutolockGetlockinfoRes;
import io.swagger.model.AutolockLockReq;
import io.swagger.model.AutolockRefreshReq;
import io.swagger.model.AutolockRefreshRes;
import io.swagger.model.AutolockTrylockReq;
import io.swagger.model.AutolockTrylockRes;
import io.swagger.model.AutolockUnlockReq;
import io.swagger.model.Error;
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
public class AutolockApiController implements AutolockApi {

    private static final Logger log = LoggerFactory.getLogger(AutolockApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AutolockApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AutolockGetdirlockinfoRes> autolockGetdirlockinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockGetdirlockinfoReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AutolockGetdirlockinfoRes>(objectMapper.readValue("{\n  \"islocked\" : true\n}", AutolockGetdirlockinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AutolockGetdirlockinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AutolockGetdirlockinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AutolockGetlockedfileinfosRes> autolockGetlockedfileinfosPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockGetlockedfileinfosReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AutolockGetlockedfileinfosRes>(objectMapper.readValue("{\n  \"docinfos\" : [ {\n    \"locktime\" : 1546493608591000,\n    \"docid\" : \"gns://E361F447C094484CA1BCC9D8C75F3314/FAE9E7C6A2464B3583CDF14AA4F71418\",\n    \"lockeraccount\" : \"2\",\n    \"lockerid\" : \"1f50400e-c303-11e8-acb2-005056af48ce\",\n    \"lockername\" : \"2\",\n    \"path\" : \"1\\为什么有了Office Online还需要超级表格.pptx\"\n  }, {\n    \"locktime\" : 1546499865887493,\n    \"docid\" : \"gns://E361F447C094484CA1BCC9D8C75F3314/FCCBA087467747A89D872E830BC2D79A\",\n    \"lockeraccount\" : \"2\",\n    \"lockerid\" : \"2220400e-c303-11e8-acb2-005056af48ce\",\n    \"lockername\" : \"3\",\n    \"path\" : \"1\\需要0310-PL-3149 01.doc\"\n  } ]\n}", AutolockGetlockedfileinfosRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AutolockGetlockedfileinfosRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AutolockGetlockedfileinfosRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AutolockGetlockinfoRes> autolockGetlockinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockGetlockinfoReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AutolockGetlockinfoRes>(objectMapper.readValue("{\n  \"islocked\" : true,\n  \"lockerid\" : \"fd40b9f2-91e4-11e3-9466-5254000a13e9\",\n  \"lockeraccount\" : \"欢欢\",\n  \"lockername\" : \"欢儿\"\n}", AutolockGetlockinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AutolockGetlockinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AutolockGetlockinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> autolockLockPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockLockReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AutolockRefreshRes> autolockRefreshPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockRefreshReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AutolockRefreshRes>(objectMapper.readValue("{\n  \"lockinfos\" : [ {\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58925\",\n    \"state\" : \"0\"\n  }, {\n    \"docid\" : \"gns://EED18AD77A2849509DB0A7F6BAA58926\",\n    \"state\" : \"1\",\n    \"errmsg\" : \"文件未加锁或者已经被解锁\"\n  }, {\n    \"docid\" : \"gns://EED18AD77A2849509DB0A7F6BAA58927\",\n    \"state\" : \"1\",\n    \"errmsg\" : \"gns对象不存在\"\n  } ]\n}", AutolockRefreshRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AutolockRefreshRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AutolockRefreshRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AutolockTrylockRes> autolockTrylockPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockTrylockReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AutolockTrylockRes>(objectMapper.readValue("{\n  \"issucceed\" : false,\n  \"lockerid\" : \"fd40b9f2-91e4-11e3-9466-5254000a13e9\",\n  \"lockeraccount\" : \"欢欢\",\n  \"lockername\" : \"欢儿\"\n}", AutolockTrylockRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AutolockTrylockRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AutolockTrylockRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> autolockUnlockPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockUnlockReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
