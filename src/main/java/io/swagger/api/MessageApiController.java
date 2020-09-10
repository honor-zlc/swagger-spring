package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.MessageGetReq;
import io.swagger.model.MessageGetRes;
import io.swagger.model.MessageRead2Req;
import io.swagger.model.MessageSendmailReq;
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
public class MessageApiController implements MessageApi {

    private static final Logger log = LoggerFactory.getLogger(MessageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MessageApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<MessageGetRes> messageGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody MessageGetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MessageGetRes>(objectMapper.readValue("{\n  \"stamp\" : 1447257721605629,\n  \"msgs\" : [ {\n    \"accessorname\" : \"用户1\",\n    \"accessortype\" : \"department\",\n    \"csf\" : 1,\n    \"end\" : 1449991042578000,\n    \"id\" : \"aa7878cf-90ad-4db4-a3bd-051d07b2f280\",\n    \"isdir\" : false,\n    \"isread\" : false,\n    \"allowvalue\" : 7,\n    \"denyvalue\" : 5,\n    \"sender\" : \"用户2\",\n    \"time\" : 1447254972466688,\n    \"type\" : 1,\n    \"url\" : \"测试文档库/abc.txt\"\n  }, {\n    \"accessorname\" : \"用户1\",\n    \"accessortype\" : \"user\",\n    \"csf\" : 1,\n    \"end\" : 1449992385154000,\n    \"id\" : \"d442ea74-b744-45fd-aaac-dca728d2e83a\",\n    \"isdir\" : false,\n    \"isread\" : true,\n    \"allowvalue\" : 5,\n    \"denyvalue\" : 7,\n    \"sender\" : \"用户2\",\n    \"time\" : 1447256302467376,\n    \"type\" : 2,\n    \"url\" : \"测试文档库/abc.txt\"\n  }, {\n    \"accessorname\" : \"nas\",\n    \"accessortype\" : \"user\",\n    \"antivirusadmin\" : \"antivirusadmin\",\n    \"csf\" : 5,\n    \"gns\" : \"gns://XXX/XXX\",\n    \"id\" : \"4b356541-cad0-4f22-b8ac-9a604439fa23\",\n    \"isdir\" : false,\n    \"isread\" : false,\n    \"antivirusop\" : 1,\n    \"sender\" : \"nas\",\n    \"senderName\" : \"nas\",\n    \"time\" : 1504056147623402,\n    \"type\" : 23,\n    \"url\" : \"nas/a-6.dwg\"\n  } ]\n}", MessageGetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MessageGetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MessageGetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> messageRead2Post(@ApiParam(value = "" ,required=true )  @Valid @RequestBody MessageRead2Req body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> messageSendmailPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody MessageSendmailReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
