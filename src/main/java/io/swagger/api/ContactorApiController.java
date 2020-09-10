package io.swagger.api;

import io.swagger.model.ContactorAddgroupReq;
import io.swagger.model.ContactorAddgroupRes;
import io.swagger.model.ContactorAddpersonsReq;
import io.swagger.model.ContactorDeletegroupReq;
import io.swagger.model.ContactorDeletepersonsReq;
import io.swagger.model.ContactorEditgroupReq;
import io.swagger.model.ContactorGetReq;
import io.swagger.model.ContactorGetRes;
import io.swagger.model.ContactorGetgroupsRes;
import io.swagger.model.ContactorGetpersonsReq;
import io.swagger.model.ContactorGetpersonsRes;
import io.swagger.model.ContactorSearchReq;
import io.swagger.model.ContactorSearchRes;
import io.swagger.model.ContactorSearchcountReq;
import io.swagger.model.ContactorSearchcountRes;
import io.swagger.model.ContactorSearchpersonsReq;
import io.swagger.model.ContactorSearchpersonsRes;
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
public class ContactorApiController implements ContactorApi {

    private static final Logger log = LoggerFactory.getLogger(ContactorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContactorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ContactorAddgroupRes> contactorAddgroupPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorAddgroupReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContactorAddgroupRes>(objectMapper.readValue("{\n  \"groupid\" : \"cc75af56-2378-11e8-b259-005056af48ce\"\n}", ContactorAddgroupRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContactorAddgroupRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContactorAddgroupRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contactorAddpersonsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorAddpersonsReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contactorDeletegroupPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorDeletegroupReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contactorDeletepersonsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorDeletepersonsReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contactorEditgroupPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorEditgroupReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContactorGetRes> contactorGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorGetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContactorGetRes>(objectMapper.readValue("{\n  \"userinfos\" : [ {\n    \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"zgd@eisoo.com\",\n    \"name\" : \"user01\",\n    \"mail\" : \"zhou@qq.com\",\n    \"csflevel\" : 5\n  }, {\n    \"userid\" : \"d7bdf7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"mzy@eisoo.com\",\n    \"name\" : \"user21\",\n    \"mail\" : \"mzy@qq.com\",\n    \"csflevel\" : 5\n  } ]\n}", ContactorGetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContactorGetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContactorGetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContactorGetgroupsRes> contactorGetgroupsPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContactorGetgroupsRes>(objectMapper.readValue("{\n  \"groups\" : [ {\n    \"id\" : \"22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"groupname\" : \"国栋的联系人\",\n    \"count\" : 10\n  }, {\n    \"id\" : \"dfsd7ec5-231f-35f5-a495-9194b66193e4\",\n    \"groupname\" : \"勇波的联系人\",\n    \"count\" : 10\n  } ]\n}", ContactorGetgroupsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContactorGetgroupsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContactorGetgroupsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContactorGetpersonsRes> contactorGetpersonsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorGetpersonsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContactorGetpersonsRes>(objectMapper.readValue("{\n  \"userinfos\" : [ {\n    \"departname\" : [ \"部门1\" ],\n    \"email\" : \"\",\n    \"userid\" : \"a84390c2-2d7c-11e8-83dd-005056af48ce\",\n    \"username\" : \"1\"\n  }, {\n    \"departname\" : [ \"部门1\", \"部门2\" ],\n    \"email\" : \"\",\n    \"userid\" : \"a87890c2-2d7c-11e8-83dd-875078af48ce\",\n    \"username\" : \"2\"\n  } ]\n}", ContactorGetpersonsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContactorGetpersonsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContactorGetpersonsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContactorSearchRes> contactorSearchPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorSearchReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContactorSearchRes>(objectMapper.readValue("{\n  \"userinfos\" : [ {\n    \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"abc01@eisoo.com\",\n    \"name\" : \"爱白痴01\",\n    \"mail\" : \"abc01@qq.com\",\n    \"groupid\" : \"eec3fd5-2d1f-35a5-a425-9194bd629344\",\n    \"groupname\" : \"联系人组01\"\n  }, {\n    \"userid\" : \"d7bdf7ec5-231f-35f5-a495-9194b66193e4\",\n    \"account\" : \"abc02@eisoo.com\",\n    \"name\" : \"爱白痴02\",\n    \"mail\" : \"abc02@qq.com\",\n    \"groupid\" : \"eec3fd5-2d1f-35a5-a425-9194bd629344\",\n    \"groupname\" : \"联系人组02\"\n  } ],\n  \"groups\" : [ {\n    \"id\" : \"22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"createrid\" : \"zgd\",\n    \"groupname\" : \"aabc02\",\n    \"count\" : 10\n  }, {\n    \"id\" : \"dfsd7ec5-231f-35f5-a495-9194b66193e4\",\n    \"createrid\" : \"zyb\",\n    \"groupname\" : \"aabc01\",\n    \"count\" : 10\n  } ]\n}", ContactorSearchRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContactorSearchRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContactorSearchRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContactorSearchcountRes> contactorSearchcountPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorSearchcountReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContactorSearchcountRes>(objectMapper.readValue("{\n  \"count\" : 10\n}", ContactorSearchcountRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContactorSearchcountRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContactorSearchcountRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContactorSearchpersonsRes> contactorSearchpersonsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactorSearchpersonsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContactorSearchpersonsRes>(objectMapper.readValue("{\n  \"userinfos\" : [ {\n    \"account\" : \"user0\",\n    \"groupid\" : \"67ab05f2-cdf0-11e9-81b8-005056826171\",\n    \"groupname\" : \"同事\",\n    \"name\" : \"liuXXX0\",\n    \"userid\" : \"676d62c4-cdf0-11e9-92f9-005056826178\"\n  }, {\n    \"account\" : \"user1\",\n    \"groupid\" : \"67ab05f2-cdf0-11e9-81b8-005056826179\",\n    \"groupname\" : \"同学\",\n    \"name\" : \"liuXXX1\",\n    \"userid\" : \"680389c0-cdf0-11e9-bae2-0050568200a3\"\n  }, {\n    \"account\" : \"user2\",\n    \"groupid\" : \"67ab05f2-cdf0-11e9-81b8-005056826178\",\n    \"groupname\" : \"家人\",\n    \"name\" : \"liuXXX2\",\n    \"userid\" : \"6791ef72-cdf0-11e9-a73d-005056826178\"\n  } ]\n}", ContactorSearchpersonsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContactorSearchpersonsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContactorSearchpersonsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
