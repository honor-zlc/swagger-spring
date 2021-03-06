package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.PkiAuthenReq;
import io.swagger.model.PkiAuthenRes;
import io.swagger.model.PkiOriginalRes;
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
public class PkiApiController implements PkiApi {

    private static final Logger log = LoggerFactory.getLogger(PkiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PkiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<PkiAuthenRes> pkiAuthenPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PkiAuthenReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PkiAuthenRes>(objectMapper.readValue("{\n  \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n  \"tokenid\" : \"f46d296a-0c66-35e4-b23c-77e2d304a7a8\",\n  \"expires\" : 3600\n}", PkiAuthenRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PkiAuthenRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PkiAuthenRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PkiOriginalRes> pkiOriginalPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PkiOriginalRes>(objectMapper.readValue("{\n  \"original\" : \"d22f7ec5\"\n}", PkiOriginalRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PkiOriginalRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PkiOriginalRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
