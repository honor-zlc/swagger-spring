package io.swagger.api;

import io.swagger.model.DeviceDisableReq;
import io.swagger.model.DeviceEnableReq;
import io.swagger.model.DeviceEraseReq;
import io.swagger.model.DeviceGetstatusReq;
import io.swagger.model.DeviceGetstatusRes;
import io.swagger.model.DeviceListRes;
import io.swagger.model.DeviceOnerasesucReq;
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
public class DeviceApiController implements DeviceApi {

    private static final Logger log = LoggerFactory.getLogger(DeviceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DeviceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deviceDisablePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DeviceDisableReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deviceEnablePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DeviceEnableReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deviceErasePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DeviceEraseReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DeviceGetstatusRes> deviceGetstatusPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DeviceGetstatusReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DeviceGetstatusRes>(objectMapper.readValue("{\n  \"eraseflag\" : 0,\n  \"disableflag\" : 1\n}", DeviceGetstatusRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DeviceGetstatusRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DeviceGetstatusRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DeviceListRes> deviceListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DeviceListRes>(objectMapper.readValue("{\n  \"deviceinfos\" : [ {\n    \"name\" : \"LiLei的小米\",\n    \"ostype\" : 1,\n    \"devicetype\" : \"IPhone\",\n    \"udid\" : \"AB-DE-CF-AD-DD-CF\",\n    \"lastloginip\" : \"192.168.136.23\",\n    \"lastlogintime\" : 1435219944207023,\n    \"eraseflag\" : 0,\n    \"lasterasetime\" : 1380502542876354,\n    \"disableflag\" : 0,\n    \"loginflag\" : 1,\n    \"bindflag\" : 1\n  }, {\n    \"name\" : \"Eisoo测试机\",\n    \"ostype\" : 2,\n    \"devicetype\" : \"小米Note Android 4.1\",\n    \"udid\" : \"12-34-67-AD-DD-CF\",\n    \"lastloginip\" : \"192.168.136.24\",\n    \"lastlogintime\" : 1435219944207023,\n    \"eraseflag\" : 1,\n    \"lasterasetime\" : 1380502542876354,\n    \"disableflag\" : 1,\n    \"loginflag\" : 0,\n    \"bindflag\" : 0\n  } ]\n}", DeviceListRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DeviceListRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DeviceListRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deviceOnerasesucPost(@NotNull @ApiParam(value = "用户唯一标识", required = true) @Valid @RequestParam(value = "userid", required = true) String userid
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody DeviceOnerasesucReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
