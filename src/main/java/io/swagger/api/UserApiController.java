package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.UserAgreedtotermsofuseRes;
import io.swagger.model.UserGetRes;
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
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UserAgreedtotermsofuseRes> userAgreedtotermsofusePost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserAgreedtotermsofuseRes>(objectMapper.readValue("{\n  \"result\" : \"ok\"\n}", UserAgreedtotermsofuseRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserAgreedtotermsofuseRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserAgreedtotermsofuseRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserGetRes> userGetPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserGetRes>(objectMapper.readValue("{\n  \"userid\" : \"e81bf6f8-8484-11e3-b4ef-5254000a13e9\",\n  \"account\" : \"zgd@eisoo.com\",\n  \"name\" : \"user01\",\n  \"mail\" : \"zhou@qq.com\",\n  \"csflevel\" : 1,\n  \"leakproofvalue\" : 2,\n  \"pwdcontrol\" : 1,\n  \"usertype\" : 1,\n  \"roletypes\" : [ 1 ],\n  \"directdepinfos\" : [ {\n    \"depid\" : \"e4ce4aa0-8484-11e3-8a54-5254000a13e9\",\n    \"name\" : \"dep2\"\n  }, {\n    \"depid\" : \"617b35fc-8185-11e3-a3ba-5254000a13e9\",\n    \"name\" : \"dep3\"\n  } ],\n  \"needsecondauth\" : true,\n  \"freezestatus\" : false,\n  \"agreedtotermsofuse\" : false,\n  \"ismanager\" : true,\n  \"telnumber\" : \"123***\",\n  \"roleinfos\" : [ {\n    \"id\" : \"e4ce4aa0-8484-11e3-8a54-5254000a13e9\",\n    \"name\" : \"组织管理员\"\n  } ]\n}", UserGetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserGetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserGetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
