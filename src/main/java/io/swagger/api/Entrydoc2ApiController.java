package io.swagger.api;

import io.swagger.model.Entrydoc2GetReq;
import io.swagger.model.Entrydoc2GetRes;
import io.swagger.model.Entrydoc2GetdocinfoReq;
import io.swagger.model.Entrydoc2GetdocinfoRes;
import io.swagger.model.Entrydoc2GetdocquotaReq;
import io.swagger.model.Entrydoc2GetdocquotaRes;
import io.swagger.model.Entrydoc2GetmanagedRes;
import io.swagger.model.Entrydoc2GetuserquotaRes;
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
public class Entrydoc2ApiController implements Entrydoc2Api {

    private static final Logger log = LoggerFactory.getLogger(Entrydoc2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public Entrydoc2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Entrydoc2GetRes> entrydoc2GetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Entrydoc2GetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Entrydoc2GetRes>(objectMapper.readValue("{\n  \"docinfos\" : [ {\n    \"attr\" : 83907924,\n    \"create_time\" : 1540369564862524,\n    \"creator\" : \"002\",\n    \"displayorder\" : -253816928,\n    \"docid\" : \"gns://AC94C0A235F54557AB02CCBE7E17A046\",\n    \"doctype\" : 1,\n    \"downloadwatermark\" : false,\n    \"duedate\" : -1,\n    \"editor\" : \"002\",\n    \"modified\" : 1548658462140569,\n    \"name\" : \"002\",\n    \"rev\" : \"d8d9edbf-5000-4215-898e-7d05d8fcabb8\",\n    \"siteinfo\" : {\n      \"id\" : \"\",\n      \"name\" : \"\"\n    },\n    \"size\" : -1,\n    \"typename\" : \"个人文档\"\n  } ]\n}", Entrydoc2GetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Entrydoc2GetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Entrydoc2GetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Entrydoc2GetdocinfoRes> entrydoc2GetdocinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Entrydoc2GetdocinfoReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Entrydoc2GetdocinfoRes>(objectMapper.readValue("{\n  \"doctype\" : 1\n}", Entrydoc2GetdocinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Entrydoc2GetdocinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Entrydoc2GetdocinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Entrydoc2GetdocquotaRes> entrydoc2GetdocquotaPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Entrydoc2GetdocquotaReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Entrydoc2GetdocquotaRes>(objectMapper.readValue("{\n  \"quota\" : 20015520,\n  \"used\" : 5000\n}", Entrydoc2GetdocquotaRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Entrydoc2GetdocquotaRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Entrydoc2GetdocquotaRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Entrydoc2GetmanagedRes> entrydoc2GetmanagedPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Entrydoc2GetmanagedRes>(objectMapper.readValue("{\n  \"docinfos\" : [ {\n    \"docid\" : \"gns://AC94C0A235F54557AB02CCBE7E17A046\",\n    \"doctype\" : 1,\n    \"name\" : \"002\",\n    \"rev\" : \"d8d9edbf-5000-4215-898e-7d05d8fcabb8\",\n    \"size\" : -1,\n    \"typename\" : \"个人文档\"\n  }, {\n    \"docid\" : \"gns://5021AD3A483D4CF8AE388E22E7768CC0\",\n    \"doctype\" : 6,\n    \"name\" : \"gp\",\n    \"rev\" : \"22bb4925-5891-42d7-a248-1ff382b8f2f6\",\n    \"size\" : -1,\n    \"typename\" : \"共享群组文档\"\n  } ]\n}", Entrydoc2GetmanagedRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Entrydoc2GetmanagedRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Entrydoc2GetmanagedRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Entrydoc2GetuserquotaRes> entrydoc2GetuserquotaPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Entrydoc2GetuserquotaRes>(objectMapper.readValue("{\n  \"quotainfos\" : [ {\n    \"doctype\" : 1,\n    \"typename\" : \"用户文档\",\n    \"docid\" : \"gns://E0297644880D4B6F956F3DFC28896FFE\",\n    \"name\" : \"国栋的文档\",\n    \"quota\" : 20015520,\n    \"used\" : 5000\n  }, {\n    \"doctype\" : 2,\n    \"typename\" : \"群组文档\",\n    \"docid\" : \"gns://E0297644880D4B6F956F3DFC28896FFE\",\n    \"name\" : \"开发部\",\n    \"quota\" : 20015520,\n    \"used\" : 5000\n  } ]\n}", Entrydoc2GetuserquotaRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Entrydoc2GetuserquotaRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Entrydoc2GetuserquotaRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
