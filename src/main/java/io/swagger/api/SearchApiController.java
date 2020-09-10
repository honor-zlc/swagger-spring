package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.SearchCustomattributeResItem;
import io.swagger.model.SearchSearchReq;
import io.swagger.model.SearchSearchRes;
import io.swagger.model.SearchTagsuggestReq;
import io.swagger.model.SearchTagsuggestRes;
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
public class SearchApiController implements SearchApi {

    private static final Logger log = LoggerFactory.getLogger(SearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SearchApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<SearchCustomattributeResItem>> searchCustomattributePost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SearchCustomattributeResItem>>(objectMapper.readValue("[ {\n  \"name\" : \"class\",\n  \"id\" : 1,\n  \"type\" : 0\n}, {\n  \"name\" : \"class\",\n  \"id\" : 1,\n  \"type\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SearchCustomattributeResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SearchCustomattributeResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SearchSearchRes> searchSearchPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SearchSearchReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SearchSearchRes>(objectMapper.readValue("{\n  \"response\" : {\n    \"next\" : 22,\n    \"hits\" : 6,\n    \"docs\" : [ {\n      \"basename\" : \"key1 is important\",\n      \"csflevel\" : 5,\n      \"modified\" : 1377849379097713,\n      \"size\" : 789454,\n      \"parentpath\" : \"gns://xiao.ming/myDoc\",\n      \"ext\" : \".doc\",\n      \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/31A9B9FD1B524CB49D54BF7399F82EB4/41A9B9FD1B524CB49D54BF7399F82EB4\",\n      \"editor\" : \"xiao.ming\",\n      \"access\" : 1,\n      \"sharer\" : \"xiao.qiang\",\n      \"tags\" : [ \"小明\", \"小华\", \"中国\", \"上海\" ]\n    }, {\n      \"basename\" : \"key1 is important2\",\n      \"csflevel\" : 5,\n      \"modified\" : 1377849379097713,\n      \"size\" : 555645,\n      \"parentpath\" : \"gns://xiao.hong\",\n      \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB5/31A9B9FD1B524CB49D54BF7399F82EB4\",\n      \"editor\" : \"xiao.hong\",\n      \"access\" : 0,\n      \"sharer\" : \"xiao.ming\"\n    }, {\n      \"basename\" : \"filename3\",\n      \"csflevel\" : 5,\n      \"modified\" : 1377849379097713,\n      \"size\" : 23344,\n      \"parentpath\" : \"gns://xiao.ming/myDoc\",\n      \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/31A9B9FD1B524CB49D54BF7399F82EB4/51A9B9FD1B524CB49D54BF7399F82EB4\",\n      \"editor\" : \"xiao.ming\",\n      \"access\" : 1\n    } ]\n  },\n  \"highlighting\" : {\n    \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/31A9B9FD1B524CB49D54BF7399F82EB4/41A9B9FD1B524CB49D54BF7399F82EB4\" : {\n      \"basename\" : [ \"<em>key1</em> is important\" ],\n      \"content\" : [ \"xxxx <em>key2</em> yyyy\" ]\n    },\n    \"gns://21A9B9FD1B524CB49D54BF7399F82EB5/31A9B9FD1B524CB49D54BF7399F82EB4\" : {\n      \"basename\" : [ \"<em>key1</em> is important2\" ]\n    },\n    \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/31A9B9FD1B524CB49D54BF7399F82EB4/51A9B9FD1B524CB49D54BF7399F82EB4\" : {\n      \"content\" : [ \"xxxx <em>key2</em> yyyy3\" ]\n    }\n  }\n}", SearchSearchRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SearchSearchRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SearchSearchRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SearchTagsuggestRes> searchTagsuggestPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SearchTagsuggestReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SearchTagsuggestRes>(objectMapper.readValue("{\n  \"suggestions\" : [ \"小明\", \"小华\" ]\n}", SearchTagsuggestRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SearchTagsuggestRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SearchTagsuggestRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
