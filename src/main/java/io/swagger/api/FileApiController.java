package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.FileAddtagReq;
import io.swagger.model.FileAddtagsReq;
import io.swagger.model.FileAddtagsRes;
import io.swagger.model.FileAttributeReq;
import io.swagger.model.FileAttributeRes;
import io.swagger.model.FileBatchdownloadReq;
import io.swagger.model.FileBatchdownloadRes;
import io.swagger.model.FileConvertpathReq;
import io.swagger.model.FileConvertpathRes;
import io.swagger.model.FileCopyReq;
import io.swagger.model.FileCopyRes;
import io.swagger.model.FileCustomattributevalueReq;
import io.swagger.model.FileCustomattributevalueResItem;
import io.swagger.model.FileDeleteReq;
import io.swagger.model.FileDeletecommentReq;
import io.swagger.model.FileDeletetagReq;
import io.swagger.model.FileDuploadReq;
import io.swagger.model.FileDuploadRes;
import io.swagger.model.FileGetappmetadataReq;
import io.swagger.model.FileGetappmetadataResItem;
import io.swagger.model.FileGetcommentReq;
import io.swagger.model.FileGetcommentRes;
import io.swagger.model.FileGetfilecustomattributeReq;
import io.swagger.model.FileGetfilecustomattributeResItem;
import io.swagger.model.FileGetinfobypathReq;
import io.swagger.model.FileGetinfobypathRes;
import io.swagger.model.FileGetsuggestnameReq;
import io.swagger.model.FileGetsuggestnameRes;
import io.swagger.model.FileMetadataReq;
import io.swagger.model.FileMetadataRes;
import io.swagger.model.FileMoveReq;
import io.swagger.model.FileMoveRes;
import io.swagger.model.FileOpstatisticsReq;
import io.swagger.model.FileOpstatisticsRes;
import io.swagger.model.FileOsbeginuploadReq;
import io.swagger.model.FileOsbeginuploadRes;
import io.swagger.model.FileOscompleteuploadReq;
import io.swagger.model.FileOsdownloadReq;
import io.swagger.model.FileOsdownloadRes;
import io.swagger.model.FileOsenduploadReq;
import io.swagger.model.FileOsenduploadRes;
import io.swagger.model.FileOsinitmultiuploadReq;
import io.swagger.model.FileOsinitmultiuploadRes;
import io.swagger.model.FileOsoptionRes;
import io.swagger.model.FileOsuploadpartReq;
import io.swagger.model.FileOsuploadpartRes;
import io.swagger.model.FileOsuploadrefreshReq;
import io.swagger.model.FileOsuploadrefreshRes;
import io.swagger.model.FilePlayinfoReq;
import io.swagger.model.FilePlayinfoRes;
import io.swagger.model.FilePreduploadReq;
import io.swagger.model.FilePreduploadRes;
import io.swagger.model.FilePreviewossReq;
import io.swagger.model.FilePreviewossRes;
import io.swagger.model.FileRenameReq;
import io.swagger.model.FileRenameRes;
import io.swagger.model.FileRestorerevisionReq;
import io.swagger.model.FileRestorerevisionRes;
import io.swagger.model.FileRevisionsReq;
import io.swagger.model.FileRevisionsResItem;
import io.swagger.model.FileSendReq;
import io.swagger.model.FileSendRes;
import io.swagger.model.FileSetappmetadataReq;
import io.swagger.model.FileSetcsflevelReq;
import io.swagger.model.FileSetcsflevelRes;
import io.swagger.model.FileSetfilecustomattributeReq;
import io.swagger.model.FileSubmitcommentReq;
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
public class FileApiController implements FileApi {

    private static final Logger log = LoggerFactory.getLogger(FileApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FileApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> fileAddtagPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileAddtagReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileAddtagsRes> fileAddtagsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileAddtagsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileAddtagsRes>(objectMapper.readValue("{\n  \"tag_max_num\" : 6,\n  \"unsettagnum\" : 1,\n  \"unsettags\" : [ \"标签3\" ]\n}", FileAddtagsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileAddtagsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileAddtagsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileAttributeRes> fileAttributePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileAttributeReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileAttributeRes>(objectMapper.readValue("{\n  \"create_time\" : 1380245084296354,\n  \"creator\" : \"user1\",\n  \"csflevel\" : 5,\n  \"name\" : \"test.txt\",\n  \"tags\" : [ \"xiaoming\", \"beijing\", \"henan\" ],\n  \"uniqueid\" : \"91E6CBAFE45B4E4D884DC59805E60A5C\"\n}", FileAttributeRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileAttributeRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileAttributeRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileBatchdownloadRes> fileBatchdownloadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileBatchdownloadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileBatchdownloadRes>(objectMapper.readValue("{\n  \"method\" : \"GET\",\n  \"url\" : \"http://192.168.137.43/openapi/batchdownload/filebatchdownload?id=17AB35944B8446658B33DBE24C6924E1&userid=e36938e4-0fed-11e7-badd-005056922306&tokenid=469d002e-5b99-46c0-903d-9a49688ba526\"\n}", FileBatchdownloadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileBatchdownloadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileBatchdownloadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileConvertpathRes> fileConvertpathPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileConvertpathReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileConvertpathRes>(objectMapper.readValue("{\n  \"namepath\" : \"user1/文件夹2\"\n}", FileConvertpathRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileConvertpathRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileConvertpathRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileCopyRes> fileCopyPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileCopyReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileCopyRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/4283DE754B2A4261A2A59B9812D8C682/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"name\" : \"test (1).txt\"\n}", FileCopyRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileCopyRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileCopyRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FileCustomattributevalueResItem>> fileCustomattributevaluePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileCustomattributevalueReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FileCustomattributevalueResItem>>(objectMapper.readValue("[ {\n  \"level\" : 6,\n  \"name\" : \"name\",\n  \"id\" : 0,\n  \"child\" : [ null, null ]\n}, {\n  \"level\" : 6,\n  \"name\" : \"name\",\n  \"id\" : 0,\n  \"child\" : [ null, null ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FileCustomattributevalueResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FileCustomattributevalueResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fileDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileDeleteReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fileDeletecommentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileDeletecommentReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fileDeletetagPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileDeletetagReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileDuploadRes> fileDuploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileDuploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileDuploadRes>(objectMapper.readValue("{\n  \"success\" : true,\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"editor\" : \"user1\",\n  \"modified\" : 1380502294452719,\n  \"name\" : \"test.txt\",\n  \"rev\" : \"91E6CBAFE45B4E4D884DC59805E60A5C\"\n}", FileDuploadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileDuploadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileDuploadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FileGetappmetadataResItem>> fileGetappmetadataPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileGetappmetadataReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FileGetappmetadataResItem>>(objectMapper.readValue("[ {\n  \"appid\" : \"44e7a244-541b-4bf2-86bd-935a0e5f06b7\",\n  \"appname\" : \"订餐系统\",\n  \"appmetadata\" : {\n    \"文件名\" : \"订餐记录_20170303_1745123.pdf\",\n    \"订餐人\" : \"小王\",\n    \"订餐时间\" : \"2017-03-03 11:30:00\",\n    \"菜品\" : \"[\\"蒸蛋\\",\\"回锅肉\\"]\",\n    \"是否堂食\" : \"false\"\n  }\n}, {\n  \"appid\" : \"44e7a244-541b-4bf2-86bd-935a0e5f06b7\",\n  \"appname\" : \"订餐系统\",\n  \"appmetadata\" : {\n    \"文件名\" : \"订餐记录_20170303_1745123.pdf\",\n    \"订餐人\" : \"小王\",\n    \"订餐时间\" : \"2017-03-03 11:30:00\",\n    \"菜品\" : \"[\\"蒸蛋\\",\\"回锅肉\\"]\",\n    \"是否堂食\" : \"false\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FileGetappmetadataResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FileGetappmetadataResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileGetcommentRes> fileGetcommentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileGetcommentReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileGetcommentRes>(objectMapper.readValue("{\n  \"averagescore\" : 4,\n  \"comments\" : [ {\n    \"answerto\" : \"小李\",\n    \"comment\" : \"这篇文章不错\",\n    \"commentator\" : \"小王\",\n    \"commentatorid\" : \"9c506d88-9bdf-11e6-9834-005056927d49\",\n    \"id\" : 1380502294452719,\n    \"score\" : 4,\n    \"time\" : 1380245084296354\n  } ],\n  \"hasscored\" : false,\n  \"mode\" : 3\n}", FileGetcommentRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileGetcommentRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileGetcommentRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FileGetfilecustomattributeResItem>> fileGetfilecustomattributePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileGetfilecustomattributeReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FileGetfilecustomattributeResItem>>(objectMapper.readValue("[ [ {\n  \"id\" : 1,\n  \"name\" : \"学科分类\",\n  \"value\" : [ \"物理\", \"初中\", \"一班\" ],\n  \"valueid\" : [ 1, 2, 3 ],\n  \"type\" : 0\n}, {\n  \"id\" : 2,\n  \"name\" : \"简介\",\n  \"value\" : \"value123\",\n  \"type\" : 3\n}, {\n  \"id\" : 3,\n  \"name\" : \"页数\",\n  \"value\" : 156,\n  \"type\" : 2\n} ], [ {\n  \"id\" : 1,\n  \"name\" : \"学科分类\",\n  \"value\" : [ \"物理\", \"初中\", \"一班\" ],\n  \"valueid\" : [ 1, 2, 3 ],\n  \"type\" : 0\n}, {\n  \"id\" : 2,\n  \"name\" : \"简介\",\n  \"value\" : \"value123\",\n  \"type\" : 3\n}, {\n  \"id\" : 3,\n  \"name\" : \"页数\",\n  \"value\" : 156,\n  \"type\" : 2\n} ] ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FileGetfilecustomattributeResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FileGetfilecustomattributeResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileGetinfobypathRes> fileGetinfobypathPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileGetinfobypathReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileGetinfobypathRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"name\" : \"文件夹2\",\n  \"rev\" : \"f439e966-4319-4142-a412-fd4e1821b709\",\n  \"size\" : -1,\n  \"modified\" : 1380502294452719\n}", FileGetinfobypathRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileGetinfobypathRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileGetinfobypathRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileGetsuggestnameRes> fileGetsuggestnamePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileGetsuggestnameReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileGetsuggestnameRes>(objectMapper.readValue("{\n  \"name\" : \"test_file_name\"\n}", FileGetsuggestnameRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileGetsuggestnameRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileGetsuggestnameRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileMetadataRes> fileMetadataPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileMetadataReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileMetadataRes>(objectMapper.readValue("{\n  \"client_mtime\" : 1564993451247000,\n  \"editor\" : \"test2\",\n  \"modified\" : 1565232100251413,\n  \"name\" : \"2019-08-05_162407.png\",\n  \"needdownloadwatermark\" : false,\n  \"rev\" : \"87E91EA985004AD892E1BD768376E23F\",\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"site\" : \"localhost\",\n  \"size\" : 34842,\n  \"tags\" : [ \"xiaoming\", \"beijing\", \"henan\" ]\n}", FileMetadataRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileMetadataRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileMetadataRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileMoveRes> fileMovePost(@ApiParam(value = "无法移动到原位置（指定目标父对象为待移动对象的父对象）" ,required=true )  @Valid @RequestBody FileMoveReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileMoveRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/4283DE754B2A4261A2A59B9812D8C682/91E6CBAFE45B4E4D884DC59805E60A5C\"\n}", FileMoveRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileMoveRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileMoveRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOpstatisticsRes> fileOpstatisticsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOpstatisticsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOpstatisticsRes>(objectMapper.readValue("{\n  \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\" : {\n    \"download\" : 12,\n    \"preview\" : 10\n  },\n  \"gns://14437010D2854FCD8E3EE5BE0044E056/1B030F9B17D94835BBF3544579828BCE\" : {\n    \"download\" : 20,\n    \"preview\" : 8\n  }\n}", FileOpstatisticsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOpstatisticsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOpstatisticsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOsbeginuploadRes> fileOsbeginuploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOsbeginuploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOsbeginuploadRes>(objectMapper.readValue("{\n  \"authrequest\" : [ \"PUT\", \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\", \"Content-Type: application/octet-stream\", \"Date: Tue, 07 Apr 2015 02:35:36 GMT\", \"Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4=\" ],\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"name\" : \"testfile\",\n  \"rev\" : \"AAA6CBAFE45B4E4D884DC59805E60A5C\"\n}", FileOsbeginuploadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOsbeginuploadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOsbeginuploadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> fileOscompleteuploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOscompleteuploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOsdownloadRes> fileOsdownloadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOsdownloadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOsdownloadRes>(objectMapper.readValue("{\n  \"need_watermark\" : false,\n  \"authrequest\" : [ \"GET\", \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\", \"Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4=\", \"Date: Tue, 07 Apr 2015 02:35:36 GMT\" ],\n  \"client_mtime\" : 1380245084296354,\n  \"editor\" : \"user1\",\n  \"modified\" : 1380502294452719,\n  \"name\" : \"testfile\",\n  \"rev\" : \"91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"size\" : 42\n}", FileOsdownloadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOsdownloadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOsdownloadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOsenduploadRes> fileOsenduploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOsenduploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOsenduploadRes>(objectMapper.readValue("{\n  \"editor\" : \"6019dc28-924e-11e5-94e2-000c29b7abd8\",\n  \"modified\" : 1380502294452719\n}", FileOsenduploadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOsenduploadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOsenduploadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOsinitmultiuploadRes> fileOsinitmultiuploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOsinitmultiuploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOsinitmultiuploadRes>(objectMapper.readValue("{\n  \"docid\" : \"gns://21A9B9FD1B524CB49D54BF7399F82EB4/91E6CBAFE45B4E4D884DC59805E60A5C\",\n  \"name\" : \"testfile\",\n  \"rev\" : \"AAA6CBAFE45B4E4D884DC59805E60A5C\",\n  \"uploadid\" : \"21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\"\n}", FileOsinitmultiuploadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOsinitmultiuploadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOsinitmultiuploadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOsoptionRes> fileOsoptionPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOsoptionRes>(objectMapper.readValue("{\n  \"partminsize\" : 204800,\n  \"partmaxsize\" : 5368709120,\n  \"partmaxnum\" : 10000\n}", FileOsoptionRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOsoptionRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOsoptionRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOsuploadpartRes> fileOsuploadpartPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOsuploadpartReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOsuploadpartRes>(objectMapper.readValue("{\n  \"authrequests\" : {\n    \"1\" : [ \"PUT\", \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C?partNumber=1&uploadId=0004B9895DBBB6EC98E36\", \"Date: Tue, 07 Apr 2015 02:35:36 GMT\", \"Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4=\" ],\n    \"2\" : [ \"PUT\", \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C?partNumber=2&uploadId=0004B9895DBBB6EC98E36\", \"Date: Tue, 07 Apr 2015 02:35:36 GMT\", \"Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4=\" ]\n  }\n}", FileOsuploadpartRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOsuploadpartRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOsuploadpartRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileOsuploadrefreshRes> fileOsuploadrefreshPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileOsuploadrefreshReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileOsuploadrefreshRes>(objectMapper.readValue("{\n  \"uploadid\" : \"21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\"\n}", FileOsuploadrefreshRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileOsuploadrefreshRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileOsuploadrefreshRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> filePlayGet(@NotNull @ApiParam(value = "转码文件id（在线播放请求协议返回）", required = true) @Valid @RequestParam(value = "docid", required = true) String docid
,@NotNull @ApiParam(value = "鉴权", required = true) @Valid @RequestParam(value = "tokenid", required = true) String tokenid
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

    public ResponseEntity<FilePlayinfoRes> filePlayinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FilePlayinfoReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FilePlayinfoRes>(objectMapper.readValue("{\n  \"status\" : 1,\n  \"odstat\" : 0,\n  \"sdstat\" : 0,\n  \"docid\" : \"A07EBED031054F8896657ACE72193984\",\n  \"remainingTime\" : 12345\n}", FilePlayinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FilePlayinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FilePlayinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> filePlaythumbnailGet(@NotNull @ApiParam(value = "文件gns路径（列举协议返回）", required = true) @Valid @RequestParam(value = "docid", required = true) String docid
,@NotNull @ApiParam(value = "鉴权", required = true) @Valid @RequestParam(value = "tokenid", required = true) String tokenid
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

    public ResponseEntity<FilePreduploadRes> filePreduploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FilePreduploadReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FilePreduploadRes>(objectMapper.readValue("{\n  \"match\" : false\n}", FilePreduploadRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FilePreduploadRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FilePreduploadRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FilePreviewossRes> filePreviewossPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FilePreviewossReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FilePreviewossRes>(objectMapper.readValue("{\n  \"size\" : \"123456\",\n  \"url\" : \"https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C\"\n}", FilePreviewossRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FilePreviewossRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FilePreviewossRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileRenameRes> fileRenamePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileRenameReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileRenameRes>(objectMapper.readValue("{\n  \"name\" : \"name\"\n}", FileRenameRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileRenameRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileRenameRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileRestorerevisionRes> fileRestorerevisionPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileRestorerevisionReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileRestorerevisionRes>(objectMapper.readValue("{\n  \"editor\" : \"6019dc28-924e-11e5-94e2-000c29b7abd8\",\n  \"modified\" : 1380502294452719,\n  \"client_mtime\" : 1380245084296354,\n  \"name\" : \"name\",\n  \"rev\" : \"123457D5752346D0838BDD05C67CF311\"\n}", FileRestorerevisionRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileRestorerevisionRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileRestorerevisionRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FileRevisionsResItem>> fileRevisionsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileRevisionsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FileRevisionsResItem>>(objectMapper.readValue("[ {\n  \"editor\" : \"editor\",\n  \"rev\" : \"rev\",\n  \"client_mtime\" : 1,\n  \"size\" : 6,\n  \"name\" : \"name\",\n  \"modified\" : 0\n}, {\n  \"editor\" : \"editor\",\n  \"rev\" : \"rev\",\n  \"client_mtime\" : 1,\n  \"size\" : 6,\n  \"name\" : \"name\",\n  \"modified\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FileRevisionsResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FileRevisionsResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileSendRes> fileSendPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileSendReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileSendRes>(objectMapper.readValue("{\n  \"result\" : [ {\n    \"causemsg\" : \"\",\n    \"msg\" : \"\",\n    \"recipient\" : \"user1\",\n    \"success\" : true\n  }, {\n    \"causemsg\" : \"获取用户信息 (user2) 失败 (userid is not found)。\",\n    \"msg\" : \"获取用户信息 (user2) 失败。\",\n    \"recipient\" : \"user2\",\n    \"success\" : false\n  }, {\n    \"causemsg\" : \"发送文件到用户 (user3) 的收件箱失败 (配额空间已满，配额：79559871，已用配额：79559871。（错误提供者：EVFS_SPACE_QUOTA，错误值：16777473，错误位置：... \",\n    \"msg\" : \"发送文件到用户 (user3) 的收件箱失败。\",\n    \"recipient\" : \"user3\",\n    \"success\" : false\n  } ]\n}", FileSendRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileSendRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileSendRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fileSetappmetadataPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileSetappmetadataReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FileSetcsflevelRes> fileSetcsflevelPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileSetcsflevelReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FileSetcsflevelRes>(objectMapper.readValue("{\n  \"result\" : 0\n}", FileSetcsflevelRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FileSetcsflevelRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FileSetcsflevelRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fileSetfilecustomattributePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileSetfilecustomattributeReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fileSubmitcommentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FileSubmitcommentReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> fileThumbnailGet(@NotNull @ApiParam(value = "文件gns路径（列举协议返回）", required = true) @Valid @RequestParam(value = "docid", required = true) String docid
,@NotNull @ApiParam(value = "缩略图的高度", required = true) @Valid @RequestParam(value = "height", required = true) Long height
,@NotNull @ApiParam(value = "缩略图的宽度", required = true) @Valid @RequestParam(value = "width", required = true) Long width
,@NotNull @ApiParam(value = "鉴权", required = true) @Valid @RequestParam(value = "tokenid", required = true) String tokenid
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
