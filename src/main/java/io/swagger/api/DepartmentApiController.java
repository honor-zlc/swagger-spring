package io.swagger.api;

import io.swagger.model.DepartmentGetrootsRes;
import io.swagger.model.DepartmentGetsubdepsRes;
import io.swagger.model.DepartmentGetsubusersReq;
import io.swagger.model.DepartmentGetsubusersRes;
import io.swagger.model.DepartmentSearchReq;
import io.swagger.model.DepartmentSearchRes;
import io.swagger.model.DepartmentSearchcountReq;
import io.swagger.model.DepartmentSearchcountRes;
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
public class DepartmentApiController implements DepartmentApi {

    private static final Logger log = LoggerFactory.getLogger(DepartmentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DepartmentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<DepartmentGetrootsRes> departmentGetrootsPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepartmentGetrootsRes>(objectMapper.readValue("{\n  \"depinfos\" : [ {\n    \"depid\" : \"e4ce4aa0-8484-11e3-8a54-5254000a13e9\",\n    \"name\" : \"dep2\",\n    \"isconfigable\" : true\n  }, {\n    \"depid\" : \"617b35fc-8185-11e3-a3ba-5254000a13e9\",\n    \"name\" : \"dep3\",\n    \"isconfigable\" : false\n  } ]\n}", DepartmentGetrootsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepartmentGetrootsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepartmentGetrootsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepartmentGetsubdepsRes> departmentGetsubdepsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DepartmentGetsubusersReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepartmentGetsubdepsRes>(objectMapper.readValue("{\n  \"depinfos\" : [ {\n    \"depid\" : \"e4ce4aa0-8484-11e3-8a54-5254000a13e9\",\n    \"name\" : \"dep2\",\n    \"isconfigable\" : true\n  }, {\n    \"depid\" : \"617b35fc-8185-11e3-a3ba-5254000a13e9\",\n    \"name\" : \"dep3\",\n    \"isconfigable\" : false\n  } ]\n}", DepartmentGetsubdepsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepartmentGetsubdepsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepartmentGetsubdepsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepartmentGetsubusersRes> departmentGetsubusersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DepartmentGetsubusersReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepartmentGetsubusersRes>(objectMapper.readValue("{\n  \"userinfos\" : [ {\n    \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"zgd@eisoo.com\",\n    \"name\" : \"user01\",\n    \"mail\" : \"zhou@qq.com\"\n  }, {\n    \"userid\" : \"d7bdf7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"mzy@eisoo.com\",\n    \"name\" : \"user21\",\n    \"mail\" : \"mzy@qq.com\"\n  } ]\n}", DepartmentGetsubusersRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepartmentGetsubusersRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepartmentGetsubusersRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepartmentSearchRes> departmentSearchPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DepartmentSearchReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepartmentSearchRes>(objectMapper.readValue("{\n  \"userinfos\" : [ {\n    \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"abc\",\n    \"name\" : \"爱白痴\",\n    \"mail\" : \"abc@qq.com\",\n    \"csflevel\" : 5,\n    \"depid\" : \"eec3fd5-2d1f-35a5-a425-9194bd629344\",\n    \"depname\" : \"部门01\",\n    \"path\" : \"as/研发部\"\n  } ],\n  \"depinfos\" : [ {\n    \"depid\" : \"e4ce4aa0-8484-11e3-8a54-5254000a13e9\",\n    \"name\" : \"abcdddd\",\n    \"path\" : \"as/研发部\"\n  } ]\n}", DepartmentSearchRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepartmentSearchRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepartmentSearchRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepartmentSearchcountRes> departmentSearchcountPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DepartmentSearchcountReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepartmentSearchcountRes>(objectMapper.readValue("{\n  \"count\" : 7\n}", DepartmentSearchcountRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepartmentSearchcountRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepartmentSearchcountRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
