package io.swagger.api;

import io.swagger.model.ConfigGetReq;
import io.swagger.model.ConfigGetRes;
import io.swagger.model.ConfigGetdocwatermarkconfigRes;
import io.swagger.model.ConfigGetoemconfigbysectionReq;
import io.swagger.model.ConfigGetoemconfigbysectionRes;
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
public class ConfigApiController implements ConfigApi {

    private static final Logger log = LoggerFactory.getLogger(ConfigApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConfigApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ConfigGetRes> configGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ConfigGetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConfigGetRes>(objectMapper.readValue("{\n  \"cache\" : [ {\n    \"interval\" : 7,\n    \"size\" : 5368709120\n  } ],\n  \"detect_interval\" : 30,\n  \"localsync\" : {\n    \"openstatus\" : true,\n    \"deletestatus\" : false\n  },\n  \"needquickstart\" : true\n}", ConfigGetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConfigGetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConfigGetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ConfigGetdocwatermarkconfigRes> configGetdocwatermarkconfigPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConfigGetdocwatermarkconfigRes>(objectMapper.readValue("{\n  \"visitor\" : {\n    \"color\" : \"#999999\",\n    \"enable\" : true,\n    \"fontSize\" : 18,\n    \"transparency\" : 30\n  },\n  \"image\" : {\n    \"base64\" : \"\",\n    \"enable\" : false,\n    \"layout\" : \"fullPage\",\n    \"zoom\" : 100,\n    \"transparency\" : 30\n  },\n  \"text\" : {\n    \"enable\" : false,\n    \"layout\" : \"fullpage\",\n    \"color\" : \"#d70000\",\n    \"content\" : \"\",\n    \"fontSize\" : 36,\n    \"transparency\" : 30\n  }\n}", ConfigGetdocwatermarkconfigRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConfigGetdocwatermarkconfigRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConfigGetdocwatermarkconfigRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ConfigGetoemconfigbysectionRes> configGetoemconfigbysectionPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ConfigGetoemconfigbysectionReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConfigGetoemconfigbysectionRes>(objectMapper.readValue("{\n  \"agreementText\" : \"\",\n  \"android\" : \"true\",\n  \"helper\" : \"/download/help_AS_CN.pdf\",\n  \"ios\" : \"true\",\n  \"office\" : \"false\",\n  \"organization\" : \"\",\n  \"product\" : \"爱数 AnyShare\",\n  \"site\" : \"http://www.eisoo.com/cn\",\n  \"userAgreement\" : \"false\"\n}", ConfigGetoemconfigbysectionRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConfigGetoemconfigbysectionRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConfigGetoemconfigbysectionRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
