/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.QuarantineAppealReq;
import io.swagger.model.QuarantineListResItem;
import io.swagger.model.QuarantineListreversionReq;
import io.swagger.model.QuarantineListreversionRes;
import io.swagger.model.QuarantinePreviewReq;
import io.swagger.model.QuarantinePreviewRes;
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
@Api(value = "quarantine", description = "the quarantine API")
public interface QuarantineApi {

    @ApiOperation(value = "浏览协议", nickname = "quarantineAppealPost", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "隔离区协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/quarantine/appeal",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> quarantineAppealPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody QuarantineAppealReq body
);


    @ApiOperation(value = "浏览协议", nickname = "quarantineListPost", notes = "", response = QuarantineListResItem.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "隔离区协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = QuarantineListResItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/quarantine/list",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<QuarantineListResItem>> quarantineListPost();


    @ApiOperation(value = "获取版本协议", nickname = "quarantineListreversionPost", notes = "", response = QuarantineListreversionRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "隔离区协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = QuarantineListreversionRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/quarantine/listreversion",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<QuarantineListreversionRes> quarantineListreversionPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody QuarantineListreversionReq body
);


    @ApiOperation(value = "获取版本协议", nickname = "quarantinePreviewPost", notes = "", response = QuarantinePreviewRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "隔离区协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = QuarantinePreviewRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/quarantine/preview",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<QuarantinePreviewRes> quarantinePreviewPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody QuarantinePreviewReq body
);

}

