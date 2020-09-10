/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
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
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")
@Api(value = "link", description = "the link API")
public interface LinkApi {

    @ApiOperation(value = "文件及文件夹批量下载", nickname = "linkBatchdownloadPost", notes = "", response = LinkBatchdownloadRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkBatchdownloadRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/batchdownload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkBatchdownloadRes> linkBatchdownloadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkBatchdownloadReq body
);


    @ApiOperation(value = "权限检查", nickname = "linkCheckpermPost", notes = "", response = LinkCheckpermRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkCheckpermRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/checkperm",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkCheckpermRes> linkCheckpermPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCheckpermReq body
);


    @ApiOperation(value = "检查是否需要水印", nickname = "linkCheckwatermarkPost", notes = "", response = DirCheckwatermarkRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "返回参数，watermarktype 0：无水印，1预览水印，2下载水印，3下载预览水印, watermarkconfig:水印配置信息", response = DirCheckwatermarkRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/checkwatermark",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<DirCheckwatermarkRes> linkCheckwatermarkPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Linkcheckwatermarkreq body
);


    @ApiOperation(value = "关闭外链", nickname = "linkClosePost", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/close",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> linkClosePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCloseReq body
);


    @ApiOperation(value = "复制协议", nickname = "linkCopyPost", notes = "1. 用于复制外链中的对象到其它目录下，外链需要配置下载权限。 2. 用户需要登录，验证用户token并检查用户对复制目标端的权限。", response = LinkCopyRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkCopyRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/copy",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkCopyRes> linkCopyPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCopyReq body
);


    @ApiOperation(value = "复制目录进度查询协议", nickname = "linkCopyprogressPost", notes = "复制的对象为目录时，copy协议返回复制任务的id，调用该协议查询对应任务的复制进度", response = LinkCopyprogressRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkCopyprogressRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/copyprogress",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkCopyprogressRes> linkCopyprogressPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkCopyprogressReq body
);


    @ApiOperation(value = "获取外链文件信息", nickname = "linkGetPost", notes = "本协议为外链入口。使用外链前请先调用本协议。调用时会增加一次外链使用计数。", response = LinkGetRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkGetRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/get",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkGetRes> linkGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkGetReq body
);


    @ApiOperation(value = "获取外链开启信息", nickname = "linkGetdetailPost", notes = "", response = LinkGetdetailRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkGetdetailRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/getdetail",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkGetdetailRes> linkGetdetailPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkGetdetailReq body
);


    @ApiOperation(value = "获取外链信息", nickname = "linkGetinfoPost", notes = "", response = LinkGetinfoRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkGetinfoRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/getinfo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkGetinfoRes> linkGetinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkGetinfoReq body
);


    @ApiOperation(value = "获取我的外链", nickname = "linkGetlinkedPost", notes = "", response = LinkGetlinkedResItem.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkGetlinkedResItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/getlinked",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<LinkGetlinkedResItem>> linkGetlinkedPost();


    @ApiOperation(value = "浏览目录", nickname = "linkListdirPost", notes = "", response = LinkListdirRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkListdirRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/listdir",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkListdirRes> linkListdirPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkListdirReq body
);


    @ApiOperation(value = "开启外链", nickname = "linkOpenPost", notes = "四项可选参数，缺失的会用外链模板补齐", response = LinkOpenRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkOpenRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/open",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkOpenRes> linkOpenPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOpenReq body
);


    @ApiOperation(value = "获取被访问文件列表", nickname = "linkOpfilesPost", notes = "", response = LinkOpfilesRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkOpfilesRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/opfiles",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkOpfilesRes> linkOpfilesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOpfilesReq body
);


    @ApiOperation(value = "获取文件访问详情", nickname = "linkOpstatisticsPost", notes = "", response = LinkOpstatisticsRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkOpstatisticsRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/opstatistics",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkOpstatisticsRes> linkOpstatisticsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOpstatisticsReq body
);


    @ApiOperation(value = "开始上传文件", nickname = "linkOsbeginuploadPost", notes = "1. 如果reqmethod为PUT，收到该请求后，客户端自行发送上传文件内容的请求到云存储平台，填入Authorization和Date，然后15分钟内发送PUT请求        Header包含：      ```      “Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4=”      “Date: Tue, 07 Apr 2015 02:35:36 GMT”      “Content-Length: 42”      “Content-Type: application/octet-stream”      ```        URL为：https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C            Body为：文件内容  2. 如果reqmethod为POST，收到该请求后，客户端自行设置发送上传文件内容的表单请求到云存储平台，填入各表单项，然后15分钟内发送POST请求。阿里云OSS和亚马逊S3要求file必须为表单中最后一个域。  ", response = LinkOsbeginuploadRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkOsbeginuploadRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/osbeginupload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkOsbeginuploadRes> linkOsbeginuploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOsbeginuploadReq body
);


    @ApiOperation(value = "获取文件", nickname = "linkOsdownloadPost", notes = "1. 收到该请求，客户端以返回的url作为参数，15分钟内向云存储平台发送下载文件内容的请求  2. 如果想分块下载，请自行在Header中加入Range  ", response = LinkOsdownloadRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkOsdownloadRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/osdownload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkOsdownloadRes> linkOsdownloadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOsdownloadReq body
);


    @ApiOperation(value = "上传文件完成", nickname = "linkOsenduploadPost", notes = "", response = LinkOsenduploadRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkOsenduploadRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/osendupload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkOsenduploadRes> linkOsenduploadPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkOsenduploadReq body
);


    @ApiOperation(value = "在线播放", nickname = "linkPlayGet", notes = "在线播放采用HLS（HTTP Live Streaming）方式，转码时对音视频进行切片，并生成用于视频播放索引的m3u8文件。m3u8文件内每一个非注释行指向一个音视频切片，客户端只需获取m3u8文件即可播放。", response = Resource.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Resource.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/play",
        produces = { "application/vnd.apple.mpegurl", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Resource> linkPlayGet(@NotNull @ApiParam(value = "转码文件id（外链在线播放请求返回）", required = true) @Valid @RequestParam(value = "docid", required = true) String docid
,@ApiParam(value = "从存储服务器下载数据时的请求地址") @Valid @RequestParam(value = "reqhost", required = false) String reqhost
,@ApiParam(value = "是否使用https下载数据，默认为true") @Valid @RequestParam(value = "usehttps", required = false) Boolean usehttps
);


    @ApiOperation(value = "在线播放请求", nickname = "linkPlayinfoPost", notes = "", response = LinkPlayinfoRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkPlayinfoRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/playinfo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkPlayinfoRes> linkPlayinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkPlayinfoReq body
);


    @ApiOperation(value = "获取视频缩略图", nickname = "linkPlaythumbnailGet", notes = "", response = Resource.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Resource.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/playthumbnail",
        produces = { "image/jpeg", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Resource> linkPlaythumbnailGet(@NotNull @ApiParam(value = "文件gns路径（列举协议返回）", required = true) @Valid @RequestParam(value = "docid", required = true) String docid
,@ApiParam(value = "版本号，为空默认获取最新版本") @Valid @RequestParam(value = "rev", required = false) String rev
);


    @ApiOperation(value = "文档预览", nickname = "linkPreviewossPost", notes = "- 目前支持的格式为：pdf、wps、doc、docx、et、xls、xlsx、dps、ppt、pptx、txt  - 首次预览时会进行转换，会返回提交转换的错误码，需要循环重试，直到发生错误或者返回二进制数据  ", response = LinkPreviewossRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkPreviewossRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/previewoss",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkPreviewossRes> linkPreviewossPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkPreviewossReq body
);


    @ApiOperation(value = "修改外链", nickname = "linkSetPost", notes = "", response = LinkSetRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = LinkSetRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/set",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LinkSetRes> linkSetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LinkSetReq body
);


    @ApiOperation(value = "缩略图预览", nickname = "linkThumbnailGet", notes = "1. 缩略后的图片以传入的大小按比例缩放，而非拉伸处理。  2. 图片的大小如果小于等于传入的大小，不做缩放处理，仅做质量处理。  3. 目前支持的格式为：bmp、jpg、png、gif、tif。  4. 默认支持对大小小于等于20M的图片进行缩略。  5. tif格式的缩略图为jpg格式用于Web展示，其他为原始格式。  ", response = Resource.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "外链协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Resource.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/link/thumbnail",
        produces = { "image/_*", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Resource> linkThumbnailGet(@NotNull @ApiParam(value = "外链唯一标识，如FC5E038D38A57032085441E7FE7010B0", required = true) @Valid @RequestParam(value = "link", required = true) String link
,@NotNull @ApiParam(value = "密码", required = true) @Valid @RequestParam(value = "password", required = true) String password
,@NotNull @ApiParam(value = "缩略图的高度", required = true) @Valid @RequestParam(value = "height", required = true) Long height
,@NotNull @ApiParam(value = "缩略图的宽度", required = true) @Valid @RequestParam(value = "width", required = true) Long width
,@ApiParam(value = "文件gns路径，通过文件夹外链获取缩略图时，需要该参数，默认为空") @Valid @RequestParam(value = "docid", required = false) String docid
,@ApiParam(value = "版本号，为空默认获取最新版本。") @Valid @RequestParam(value = "rev", required = false) String rev
,@ApiParam(value = "缩略图质量，默认为75") @Valid @RequestParam(value = "quality", required = false) Long quality
);

}

