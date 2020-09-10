package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Perm1CheckReq;
import io.swagger.model.Perm1CheckRes;
import io.swagger.model.Perm1CheckallReq;
import io.swagger.model.Perm1CheckallRes;
import io.swagger.model.Perm1GetexternallinktemplateRes;
import io.swagger.model.Perm1GetinternallinktemplateRes;
import io.swagger.model.Perm1GetsharedRes;
import io.swagger.model.Perm1GetsharedocconfigRes;
import io.swagger.model.Perm1ListReq;
import io.swagger.model.Perm1ListRes;
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
public class Perm1ApiController implements Perm1Api {

    private static final Logger log = LoggerFactory.getLogger(Perm1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public Perm1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Perm1CheckRes> perm1CheckPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm1CheckReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm1CheckRes>(objectMapper.readValue("{\n  \"result\" : 1\n}", Perm1CheckRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm1CheckRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm1CheckRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Perm1CheckallRes> perm1CheckallPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm1CheckallReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm1CheckallRes>(objectMapper.readValue("{\n  \"allowvalue\" : 3,\n  \"denyvalue\" : 12\n}", Perm1CheckallRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm1CheckallRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm1CheckallRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Perm1GetexternallinktemplateRes> perm1GetexternallinktemplatePost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm1GetexternallinktemplateRes>(objectMapper.readValue("{\n  \"limitexpiredays\" : true,\n  \"allowexpiredays\" : 20,\n  \"allowperm\" : 1,\n  \"defaultperm\" : 1,\n  \"limitaccesstimes\" : true,\n  \"allowaccesstimes\" : 10,\n  \"accesspassword\" : false\n}", Perm1GetexternallinktemplateRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm1GetexternallinktemplateRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm1GetexternallinktemplateRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Perm1GetinternallinktemplateRes> perm1GetinternallinktemplatePost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm1GetinternallinktemplateRes>(objectMapper.readValue("{\n  \"allowperm\" : 95,\n  \"defaultperm\" : 95,\n  \"allowowner\" : false,\n  \"defaultowner\" : false,\n  \"limitexpiredays\" : true,\n  \"allowexpiredays\" : -1\n}", Perm1GetinternallinktemplateRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm1GetinternallinktemplateRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm1GetinternallinktemplateRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Perm1GetsharedRes> perm1GetsharedPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm1GetsharedRes>(objectMapper.readValue("{\n  \"docinfos\" : [ {\n    \"docid\" : \"gns://8CFF1A05F851452C9EE140819B931155\",\n    \"path\" : \"张三\\算法1\",\n    \"size\" : -1,\n    \"client_mtim\" : 1380502294452719\n  }, {\n    \"docid\" : \"gns://8CFF1A05F851452C9EE140819B931133\",\n    \"path\" : \"张三\\算法2\\file.txt\",\n    \"size\" : 1024,\n    \"client_mtim\" : 1380502294452719\n  } ]\n}", Perm1GetsharedRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm1GetsharedRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm1GetsharedRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Perm1GetsharedocconfigRes> perm1GetsharedocconfigPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm1GetsharedocconfigRes>(objectMapper.readValue("{\n  \"enable_user_doc_inner_link_share\" : true,\n  \"enable_user_doc_out_link_share\" : true,\n  \"enable_group_doc_out_link_share\" : true,\n  \"enable_group_doc_inner_link_share\" : true\n}", Perm1GetsharedocconfigRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm1GetsharedocconfigRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm1GetsharedocconfigRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Perm1ListRes> perm1ListPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm1ListReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm1ListRes>(objectMapper.readValue("{\n  \"permresults\" : [ {\n    \"accessorid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"accessortype\" : \"user\",\n    \"accessorname\" : \"zgd@eisoo.com/**eisoo**/国栋\",\n    \"allowvalue\" : 1,\n    \"denyvalue\" : 12\n  }, {\n    \"accessorid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"accessortype\" : \"department\",\n    \"accessorname\" : \"部门01\",\n    \"allowvalue\" : 3,\n    \"denyvalue\" : 12\n  } ],\n  \"ownerresults\" : [ {\n    \"accessorid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"accessortype\" : \"user\",\n    \"accessorname\" : \"zgd@eisoo.com/**eisoo**/国栋\"\n  } ]\n}", Perm1ListRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm1ListRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm1ListRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
