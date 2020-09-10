package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.QuarantineAppealReq;
import io.swagger.model.QuarantineListResItem;
import io.swagger.model.QuarantineListreversionReq;
import io.swagger.model.QuarantineListreversionRes;
import io.swagger.model.QuarantinePreviewReq;
import io.swagger.model.QuarantinePreviewRes;
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
public class QuarantineApiController implements QuarantineApi {

    private static final Logger log = LoggerFactory.getLogger(QuarantineApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QuarantineApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> quarantineAppealPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody QuarantineAppealReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<QuarantineListResItem>> quarantineListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<QuarantineListResItem>>(objectMapper.readValue("[ {\n  \"appealexpiredtime\" : 1512738144272960,\n  \"docid\" : \"gns://9855124D1B60466F98308C30951F2C49/8F4105AD927B40CFA0661B61BA6EA96F\",\n  \"name\" : \"Cmder.exe\",\n  \"parentpath\" : \"AnyShare://123/\",\n  \"servertime\" : 1505378970304054,\n  \"status\" : 2\n}, {\n  \"appealexpiredtime\" : 1512738144272960,\n  \"docid\" : \"gns://9855124D1B60466F98308C30951F2C49/8F4105AD927B40CFA0661B61BA6EA96F\",\n  \"name\" : \"Cmder.exe\",\n  \"parentpath\" : \"AnyShare://123/\",\n  \"servertime\" : 1505378970304054,\n  \"status\" : 2\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<QuarantineListResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<QuarantineListResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QuarantineListreversionRes> quarantineListreversionPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody QuarantineListreversionReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QuarantineListreversionRes>(objectMapper.readValue("[ {\n  \"modified\" : 1504853290186399,\n  \"modifier\" : \"123\",\n  \"name\" : \"Cmder.exe\",\n  \"reason\" : \"政治反动\",\n  \"rev\" : \"9E879DB714FA44DCB945185A596C2991\"\n}, {\n  \"modified\" : 1504852433906236,\n  \"modifier\" : \"123\",\n  \"name\" : \"Cmder.exe\",\n  \"reason\" : \"涉黄卖淫\",\n  \"rev\" : \"AD29EE5EA9C244ACA9127C0A79B66554\"\n}, {\n  \"modified\" : 1499239324365283,\n  \"modifier\" : \"123\",\n  \"name\" : \"Cmder.exe\",\n  \"reason\" : \"赌博败家\",\n  \"rev\" : \"74E112A8EDDC40AD8D7A0B5AB25302F2\"\n} ]", QuarantineListreversionRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QuarantineListreversionRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QuarantineListreversionRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<QuarantinePreviewRes> quarantinePreviewPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody QuarantinePreviewReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<QuarantinePreviewRes>(objectMapper.readValue("{\n  \"size\" : \"123456\",\n  \"url\" : \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\"\n}", QuarantinePreviewRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<QuarantinePreviewRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<QuarantinePreviewRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
