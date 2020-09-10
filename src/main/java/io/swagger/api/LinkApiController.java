package io.swagger.api;

import io.swagger.model.DirCheckwatermarkRes;
import io.swagger.model.Error;
import io.swagger.model.LinkBatchdownloadReq;
import io.swagger.model.LinkBatchdownloadRes;
import io.swagger.model.LinkCheckpermReq;
import io.swagger.model.LinkCheckpermRes;
import io.swagger.model.LinkCloseReq;
import io.swagger.model.LinkCopyReq;
import io.swagger.model.LinkCopyRes;
import io.swagger.model.LinkCopyprogressReq;
import io.swagger.model.LinkCopyprogressRes;
import io.swagger.model.LinkGetReq;
import io.swagger.model.LinkGetRes;
import io.swagger.model.LinkGetdetailReq;
import io.swagger.model.LinkGetdetailRes;
import io.swagger.model.LinkGetinfoReq;
import io.swagger.model.LinkGetinfoRes;
import io.swagger.model.LinkGetlinkedResItem;
import io.swagger.model.LinkListdirReq;
import io.swagger.model.LinkListdirRes;
import io.swagger.model.LinkOpenReq;
import io.swagger.model.LinkOpenRes;
import io.swagger.model.LinkOpfilesReq;
import io.swagger.model.LinkOpfilesRes;
import io.swagger.model.LinkOpstatisticsReq;
import io.swagger.model.LinkOpstatisticsRes;
import io.swagger.model.LinkOsbeginuploadReq;
import io.swagger.model.LinkOsbeginuploadRes;
import io.swagger.model.LinkOsdownloadReq;
import io.swagger.model.LinkOsdownloadRes;
import io.swagger.model.LinkOsenduploadReq;
import io.swagger.model.LinkOsenduploadRes;
import io.swagger.model.LinkPlayinfoReq;
import io.swagger.model.LinkPlayinfoRes;
import io.swagger.model.LinkPreviewossReq;
import io.swagger.model.LinkPreviewossRes;
import io.swagger.model.LinkSetReq;
import io.swagger.model.LinkSetRes;
import io.swagger.model.Linkcheckwatermarkreq;
import org.springframework.core.io.Resource;
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
public class LinkApiController implements LinkApi {

    private static final Logger log = LoggerFactory.getLogger(LinkApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LinkApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<LinkBatchdownloadRes> linkBatchdownloadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkBatchdownloadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkBatchdownloadRes>(objectMapper.readValue("{\n  \"method\" : \"GET\",\n  \"url\" : \"http://192.168.137.43/openapi/batchdownload/linkbatchdownload?id=17AB35944B8446658B33DBE24C6924E1\"\n}", LinkBatchdownloadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkBatchdownloadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkBatchdownloadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkCheckpermRes> linkCheckpermPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCheckpermReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkCheckpermRes>(objectMapper.readValue("{\n  \"result\" : false\n}", LinkCheckpermRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkCheckpermRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkCheckpermRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DirCheckwatermarkRes> linkCheckwatermarkPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Linkcheckwatermarkreq body
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

    public ResponseEntity<Void> linkClosePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCloseReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkCopyRes> linkCopyPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCopyReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkCopyRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/4283DE754B2A4261A2A59B9812D8C682/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"name\" : \"test (1)\",\n  \"id\" : \"99326FF8-B2F3-42d3-B9F3-C7B3A3C2289B\"\n}", LinkCopyRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkCopyRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkCopyRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkCopyprogressRes> linkCopyprogressPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCopyprogressReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkCopyprogressRes>(objectMapper.readValue("{\n  \"success\" : true,\n  \"filecount\" : \"20\",\n  \"dircount\" : \"2\",\n  \"filecopied\" : \"12\",\n  \"dircopied\" : \"1\",\n  \"size\" : \"5215698\",\n  \"sizecopied\" : \"2150485\",\n  \"filecopying\" : \"test.jpg\",\n  \"source\" : \"\",\n  \"destination\" : \"test\"\n}", LinkCopyprogressRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkCopyprogressRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkCopyprogressRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkGetRes> linkGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkGetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkGetRes>(objectMapper.readValue("{\n  \"client_mtime\" : 1546594169000000,\n  \"docid\" : \"gns://5A39E47D9E374070A8D9602DD0F1E43D/5EF6F44F21AD43E4BDDF8AE36ED3E7FA/54464548511E4E268D47E7A0063588F6\",\n  \"endtime\" : 1567612799000000,\n  \"modified\" : 1559524894594478,\n  \"name\" : \"OpenDocAPI-5.0.31-20190110-8668\",\n  \"perm\" : 3,\n  \"size\" : -1,\n  \"usrdisplayname\" : \"张三\",\n  \"usrloginname\" : \"zhang.san@eisoo.com\"\n}", LinkGetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkGetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkGetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkGetdetailRes> linkGetdetailPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkGetdetailReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkGetdetailRes>(objectMapper.readValue("{\n  \"endtime\" : 1380502542876354,\n  \"link\" : \"FC5E038D38A57032085441E7FE7010B0\",\n  \"password\" : \"puja\",\n  \"perm\" : 3\n}", LinkGetdetailRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkGetdetailRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkGetdetailRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkGetinfoRes> linkGetinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkGetinfoReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkGetinfoRes>(objectMapper.readValue("{\n  \"name\" : \"file.docx\",\n  \"modified\" : 123456789,\n  \"size\" : 1024,\n  \"site\" : \"localhost\"\n}", LinkGetinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkGetinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkGetinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<LinkGetlinkedResItem>> linkGetlinkedPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<LinkGetlinkedResItem>>(objectMapper.readValue("[ {\n  \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n  \"namepath\" : \"gns://xiao.ming/eps.doc\",\n  \"size\" : 4235,\n  \"modified\" : 1380502542876354\n}, {\n  \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n  \"namepath\" : \"gns://xiao.ming/eps.doc\",\n  \"size\" : 4235,\n  \"modified\" : 1380502542876354\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<LinkGetlinkedResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<LinkGetlinkedResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkListdirRes> linkListdirPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkListdirReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkListdirRes>(objectMapper.readValue("{\n  \"dirs\" : [ {\n    \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/E7DC359B503744F5964B903A7280BC84\",\n    \"name\" : \"dir1\",\n    \"rev\" : \"f439e966-4319-4142-a412-fd4e1821b709\",\n    \"size\" : -1,\n    \"modified\" : 1380502294452719\n  } ],\n  \"files\" : [ {\n    \"client_mtime\" : 1380245084296354,\n    \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/BCC857D5752346D0838BDD05C67CF3EF\",\n    \"name\" : \"file1\",\n    \"rev\" : \"F245E03387174B568D4666218555AB2D\",\n    \"size\" : 32563,\n    \"modified\" : 1380502294452719\n  } ]\n}", LinkListdirRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkListdirRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkListdirRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkOpenRes> linkOpenPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOpenReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkOpenRes>(objectMapper.readValue("{\n  \"endtime\" : 1380502542876354,\n  \"link\" : \"FC5E038D38A57032085441E7FE7010B0\",\n  \"password\" : \"puja\",\n  \"perm\" : 3,\n  \"limittimes\" : -1,\n  \"result\" : 0\n}", LinkOpenRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkOpenRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkOpenRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkOpfilesRes> linkOpfilesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOpfilesReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkOpfilesRes>(objectMapper.readValue("{\n  \"files\" : [ {\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/21A9B9FD1B524CB49D54BF7399F82EB4/E7DC359B503744F5964B903A7280BC84\",\n    \"name\" : \"file1\",\n    \"path\" : \"dir1/dir2\"\n  } ]\n}", LinkOpfilesRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkOpfilesRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkOpfilesRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkOpstatisticsRes> linkOpstatisticsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOpstatisticsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkOpstatisticsRes>(objectMapper.readValue("{\n  \"statistics\" : [ {\n    \"ip\" : \"192.168.1.68\",\n    \"download\" : 89,\n    \"preview\" : 99\n  } ]\n}", LinkOpstatisticsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkOpstatisticsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkOpstatisticsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkOsbeginuploadRes> linkOsbeginuploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOsbeginuploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkOsbeginuploadRes>(objectMapper.readValue("{\n  \"authrequest\" : [ \"PUT\", \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\", \"Content-Type: application/octet-stream\", \"Date: Tue, 07 Apr 2015 02:35:36 GMT\", \"Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4=\" ],\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"name\" : \"testfile\",\n  \"rev\" : \"AAA6CBAFE45B4E4D884DC59805E60A5C\"\n}", LinkOsbeginuploadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkOsbeginuploadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkOsbeginuploadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkOsdownloadRes> linkOsdownloadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOsdownloadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkOsdownloadRes>(objectMapper.readValue("{\n  \"need_watermark\" : false,\n  \"authrequest\" : [ \"GET\", \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C?AWSAccessKeyId=AKIAJEROARV2UTTADY6A&Expires=1428384700&Signature=lnOy3CUh9KNknNDX8aB8Mhur7%2Bw%3D\" ],\n  \"name\" : \"testfile\",\n  \"rev\" : \"91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"size\" : 42\n}", LinkOsdownloadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkOsdownloadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkOsdownloadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkOsenduploadRes> linkOsenduploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOsenduploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkOsenduploadRes>(objectMapper.readValue("{\n  \"editor\" : \"6019dc28-924e-11e5-94e2-000c29b7abd8\",\n  \"modified\" : 1380502294452719\n}", LinkOsenduploadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkOsenduploadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkOsenduploadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> linkPlayGet(@NotNull @ApiParam(value = "转码文件id（外链在线播放请求返回）", required = true) @Valid @RequestParam(value = "docid", required = true) String docid
,@ApiParam(value = "从存储服务器下载数据时的请求地址") @Valid @RequestParam(value = "reqhost", required = false) String reqhost
,@ApiParam(value = "是否使用https下载数据，默认为true") @Valid @RequestParam(value = "usehttps", required = false) Boolean usehttps
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkPlayinfoRes> linkPlayinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkPlayinfoReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkPlayinfoRes>(objectMapper.readValue("{\n  \"status\" : 1,\n  \"odstat\" : 0,\n  \"sdstat\" : 0,\n  \"docid\" : \"A07EBED031054F8896657ACE72193984\",\n  \"remainingTime\" : 12345\n}", LinkPlayinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkPlayinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkPlayinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> linkPlaythumbnailGet(@NotNull @ApiParam(value = "文件gns路径（列举协议返回）", required = true) @Valid @RequestParam(value = "docid", required = true) String docid
,@ApiParam(value = "版本号，为空默认获取最新版本") @Valid @RequestParam(value = "rev", required = false) String rev
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkPreviewossRes> linkPreviewossPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkPreviewossReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkPreviewossRes>(objectMapper.readValue("{\n  \"size\" : \"123456\",\n  \"url\" : \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\"\n}", LinkPreviewossRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkPreviewossRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkPreviewossRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LinkSetRes> linkSetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkSetReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LinkSetRes>(objectMapper.readValue("{\n  \"endtime\" : 1380556799000000,\n  \"link\" : \"FC5E038D38A57032085441E7FE7010B0\",\n  \"password\" : \"\",\n  \"perm\" : 3,\n  \"limittimes\" : -1,\n  \"result\" : 0\n}", LinkSetRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LinkSetRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LinkSetRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> linkThumbnailGet(@NotNull @ApiParam(value = "外链唯一标识，如FC5E038D38A57032085441E7FE7010B0", required = true) @Valid @RequestParam(value = "link", required = true) String link
,@NotNull @ApiParam(value = "密码", required = true) @Valid @RequestParam(value = "password", required = true) String password
,@NotNull @ApiParam(value = "缩略图的高度", required = true) @Valid @RequestParam(value = "height", required = true) Long height
,@NotNull @ApiParam(value = "缩略图的宽度", required = true) @Valid @RequestParam(value = "width", required = true) Long width
,@ApiParam(value = "文件gns路径，通过文件夹外链获取缩略图时，需要该参数，默认为空") @Valid @RequestParam(value = "docid", required = false) String docid
,@ApiParam(value = "版本号，为空默认获取最新版本。") @Valid @RequestParam(value = "rev", required = false) String rev
,@ApiParam(value = "缩略图质量，默认为75") @Valid @RequestParam(value = "quality", required = false) Long quality
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

}
