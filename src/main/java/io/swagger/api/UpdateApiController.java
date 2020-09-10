package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.UpdateCheckReq;
import io.swagger.model.UpdateCheckRes;
import io.swagger.model.UpdateDownloadReq;
import io.swagger.model.UpdateDownloadRes;
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
public class UpdateApiController implements UpdateApi {

    private static final Logger log = LoggerFactory.getLogger(UpdateApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UpdateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UpdateCheckRes> updateCheckPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdateCheckReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UpdateCheckRes>(objectMapper.readValue("{\n  \"result\" : \"optional\",\n  \"latest\" : \"3.5.1.205\",\n  \"ostype\" : 5,\n  \"downloadurl\" : \"res/clientsetups/AnyShareClient_Windows_All_x64-1.4.2-20140121-alpha-477.exe\",\n  \"size\" : 79655053\n}", UpdateCheckRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UpdateCheckRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UpdateCheckRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UpdateDownloadRes> updateDownloadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdateDownloadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UpdateDownloadRes>(objectMapper.readValue("{\n  \"URL\" : \"https://192.168.136.41:9039/anyshares3accesstestbucket/e3af9c80bb6611e58ecb000c2999898e/0476542cbb6711e58ecb000c2999898e-i?response-content-disposition=attachment%3b%20filename*%3dutf%2d8''JiangBei%255fWindows%255fAll%255fx64%252d3.5.4%252d20150306%252drelease%252d1373.exe&userid=AKIAI6IFWLK557WYM23A&Expires=1610872699&Signature=ylgoMfmfc9aSbZsUdnqu2hDGPOE%3d\"\n}", UpdateDownloadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UpdateDownloadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UpdateDownloadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
