package io.swagger.api;

import io.swagger.model.DirAddtagReq;
import io.swagger.model.DirAddtagsReq;
import io.swagger.model.DirAddtagsRes;
import io.swagger.model.DirAttributeReq;
import io.swagger.model.DirAttributeRes;
import io.swagger.model.DirCheckwatermarkReq;
import io.swagger.model.DirCheckwatermarkRes;
import io.swagger.model.DirCopyReq;
import io.swagger.model.DirCopyRes;
import io.swagger.model.DirCopyprogressReq;
import io.swagger.model.DirCopyprogressRes;
import io.swagger.model.DirCreateReq;
import io.swagger.model.DirCreateRes;
import io.swagger.model.DirCreatemultileveldirReq;
import io.swagger.model.DirCreatemultileveldirRes;
import io.swagger.model.DirDeleteReq;
import io.swagger.model.DirDeleteRes;
import io.swagger.model.DirDeletetagReq;
import io.swagger.model.DirGetsuggestnameReq;
import io.swagger.model.DirGetsuggestnameRes;
import io.swagger.model.DirIsfileoutboxReq;
import io.swagger.model.DirIsfileoutboxRes;
import io.swagger.model.DirListReq;
import io.swagger.model.DirListRes;
import io.swagger.model.DirMoveReq;
import io.swagger.model.DirMoveRes;
import io.swagger.model.DirRenameReq;
import io.swagger.model.DirRenameRes;
import io.swagger.model.DirSetcsflevelReq;
import io.swagger.model.DirSetcsflevelRes;
import io.swagger.model.DirSizeReq;
import io.swagger.model.DirSizeRes;
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
public class DirApiController implements DirApi {

    private static final Logger log = LoggerFactory.getLogger(DirApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DirApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> dirAddtagPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirAddtagReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirAddtagsRes> dirAddtagsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirAddtagsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirAddtagsRes>(objectMapper.readValue("{\n  \"tag_max_num\" : 6,\n  \"unsettagnum\" : 1,\n  \"unsettags\" : [ \"标签3\" ]\n}", DirAddtagsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirAddtagsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirAddtagsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirAttributeRes> dirAttributePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirAttributeReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirAttributeRes>(objectMapper.readValue("{\n  \"create_time\" : 1380245084296354,\n  \"creator\" : \"user1\",\n  \"modified\" : 1480245084296354,\n  \"name\" : \"dir2\",\n  \"tags\" : [ \"9\", \"40\", \"AA\", \"BB\", \"CC\", \"DD\" ]\n}", DirAttributeRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirAttributeRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirAttributeRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirCheckwatermarkRes> dirCheckwatermarkPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirCheckwatermarkReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirCheckwatermarkRes>(objectMapper.readValue("{\n  \"watermarktype \" : 0,\n  \"watermarkconfig\" : {\n    \"text\" : {\n      \"layout\" : 1,\n      \"color\" : \"#999999\",\n      \"enabled\" : true,\n      \"content\" : \"dsfsf\",\n      \"fontSize\" : 28,\n      \"transparency\" : 100\n    },\n    \"user\" : {\n      \"color\" : \"#999999\",\n      \"enabled\" : true,\n      \"fontSize\" : 18,\n      \"transparency\" : 100,\n      \"layout\" : 1\n    },\n    \"date\" : {\n      \"color\" : \"#999999\",\n      \"enabled\" : true,\n      \"fontSize\" : 18,\n      \"layout\" : 1,\n      \"transparency\" : 100\n    }\n  }\n}", DirCheckwatermarkRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirCheckwatermarkRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirCheckwatermarkRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirCopyRes> dirCopyPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirCopyReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirCopyRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/4283DE754B2A4261A2A59B9812D8C682/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"name\" : \"test (1)\",\n  \"id\" : \"99326FF8-B2F3-42d3-B9F3-C7B3A3C2289B\"\n}", DirCopyRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirCopyRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirCopyRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirCopyprogressRes> dirCopyprogressPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirCopyprogressReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirCopyprogressRes>(objectMapper.readValue("{\n  \"success\" : true,\n  \"filecount\" : \"20\",\n  \"dircount\" : \"2\",\n  \"filecopied\" : \"12\",\n  \"dircopied\" : \"1\",\n  \"size\" : \"5215698\",\n  \"sizecopied\" : \"2150485\",\n  \"filecopying\" : \"test.jpg\",\n  \"source\" : \"\",\n  \"destination\" : \"test\"\n}", DirCopyprogressRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirCopyprogressRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirCopyprogressRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirCreateRes> dirCreatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirCreateReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirCreateRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"rev\" : \"9b499ef7-e055-4567-b772-a43dd3f0da4d\",\n  \"modified\" : 1380502294452719,\n  \"create_time\" : 1380502294452719,\n  \"creator\" : \"001\",\n  \"editor\" : \"001\"\n}", DirCreateRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirCreateRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirCreateRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirCreatemultileveldirRes> dirCreatemultileveldirPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirCreatemultileveldirReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirCreatemultileveldirRes>(objectMapper.readValue("{\n  \"docid\" : \" gns://3986CEC7BF81411386F31013D16FECCD/6BC3BEF82CB44CCDAAE823700AC593C6/536C165AB28B41D7B3C7899C4EFB0187\",\n  \"rev\" : \"fb8bd45a-cc2f-4f0a-af7e-347a0ad53f5e\",\n  \"modified\" : 1472279588858216\n}", DirCreatemultileveldirRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirCreatemultileveldirRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirCreatemultileveldirRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirDeleteRes> dirDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirDeleteReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirDeleteRes>(objectMapper.readValue("{\n  \"isdirexist\" : false\n}", DirDeleteRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirDeleteRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirDeleteRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> dirDeletetagPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirDeletetagReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirGetsuggestnameRes> dirGetsuggestnamePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirGetsuggestnameReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirGetsuggestnameRes>(objectMapper.readValue("{\n  \"name\" : \"test_dir_name\"\n}", DirGetsuggestnameRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirGetsuggestnameRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirGetsuggestnameRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirIsfileoutboxRes> dirIsfileoutboxPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirIsfileoutboxReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirIsfileoutboxRes>(objectMapper.readValue("{\n  \"isfileoutbox\" : true\n}", DirIsfileoutboxRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirIsfileoutboxRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirIsfileoutboxRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirListRes> dirListPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirListReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirListRes>(objectMapper.readValue("{\n  \"dirs\" : [ {\n    \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/E7DC359B503744F5964B903A7280BC84\",\n    \"name\" : \"dir1\",\n    \"rev\" : \"f439e966-4319-4142-a412-fd4e1821b709\",\n    \"size\" : -1,\n    \"modified\" : 1380502294452719\n  } ],\n  \"files\" : [ {\n    \"client_mtime\" : 1380245084296354,\n    \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/BCC857D5752346D0838BDD05C67CF3EF\",\n    \"name\" : \"file1\",\n    \"rev\" : \"F245E03387174B568D4666218555AB2D\",\n    \"size\" : 32563,\n    \"modified\" : 1380502294452719\n  } ]\n}", DirListRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirListRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirListRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirMoveRes> dirMovePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirMoveReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirMoveRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/4283DE754B2A4261A2A59B9812D8C682/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"isdirexist\" : false\n}", DirMoveRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirMoveRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirMoveRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirRenameRes> dirRenamePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirRenameReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirRenameRes>(objectMapper.readValue("{\n  \"name\" : \"name\"\n}", DirRenameRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirRenameRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirRenameRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirSetcsflevelRes> dirSetcsflevelPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirSetcsflevelReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirSetcsflevelRes>(objectMapper.readValue("{\n  \"result\" : 0\n}", DirSetcsflevelRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirSetcsflevelRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirSetcsflevelRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirSizeRes> dirSizePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody DirSizeReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DirSizeRes>(objectMapper.readValue("{\n  \"dirnum\" : 2,\n  \"filenum\" : 10,\n  \"recyclesize\" : 12345,\n  \"totalsize\" : 123456\n}", DirSizeRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DirSizeRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DirSizeRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
