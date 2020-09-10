package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Perm2GetReq;
import io.swagger.model.Perm2GetRes;
import io.swagger.model.Perm2SetReq;
import io.swagger.model.Perm2SetRes;
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
public class Perm2ApiController implements Perm2Api {

    private static final Logger log = LoggerFactory.getLogger(Perm2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public Perm2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Perm2GetRes> perm2GetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm2GetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm2GetRes>(objectMapper.readValue("{\n  \"perminfos\" : [ {\n    \"inheritdocid\" : \"gns://E0529377F00D4F3295C87E7D83E923C7/0EDC731927D6441DA891C3FD922279FC\",\n    \"inheritpath\" : \"user01/音乐\",\n    \"accessorid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"accessorname\" : \"zgd@eisoo.com/**eisoo**/国栋\",\n    \"accessorcsflevel\" : 5,\n    \"accessortype\" : \"user\",\n    \"denyvalue\" : 5,\n    \"allowvalue\" : 3,\n    \"createtime\" : 1519291821756486,\n    \"modifytime\" : 1519291821756486,\n    \"endtime\" : 1380502542876354\n  }, {\n    \"inheritdocid\" : \"\",\n    \"inheritpath\" : \"\",\n    \"accessorid\" : \"e4ce4aa0-8484-11e3-8a54-5254000a13e4\",\n    \"accessorname\" : \"研发部\",\n    \"accessorcsflevel\" : 5,\n    \"accessortype\" : \"department\",\n    \"denyvalue\" : 3,\n    \"allowvalue\" : 5,\n    \"createtime\" : 1519291821756486,\n    \"modifytime\" : 1519291821756486,\n    \"endtime\" : -1\n  }, {\n    \"inheritdocid\" : \"\",\n    \"inheritpath\" : \"\",\n    \"accessorid\" : \"e4ce4aa0-8484-11e3-8a54-5254000a13e4\",\n    \"accessorname\" : \"我的联系人\",\n    \"accessorcsflevel\" : 5,\n    \"accessortype\" : \"contactor\",\n    \"denyvalue\" : 21,\n    \"allowvalue\" : 9,\n    \"createtime\" : 1519291821756486,\n    \"modifytime\" : 1519291821756486,\n    \"endtime\" : 1380502542876354\n  } ],\n  \"inherit\" : true\n}", Perm2GetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm2GetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm2GetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Perm2SetRes> perm2SetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm2SetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Perm2SetRes>(objectMapper.readValue("{\n  \"result\" : 1\n}", Perm2SetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Perm2SetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Perm2SetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
