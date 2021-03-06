/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.FinderDisableReq;
import io.swagger.model.FinderEnableReq;
import io.swagger.model.FinderGetenabledRes;
import io.swagger.model.FinderGetstatusReq;
import io.swagger.model.FinderGetstatusRes;
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
@Api(value = "finder", description = "the finder API")
public interface FinderApi {

    @ApiOperation(value = "关闭文档发现状态", nickname = "finderDisablePost", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "发现管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/finder/disable",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> finderDisablePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinderDisableReq body
);


    @ApiOperation(value = "开启文档发现状态", nickname = "finderEnablePost", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "发现管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/finder/enable",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> finderEnablePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinderEnableReq body
);


    @ApiOperation(value = "获取用户开启发现的文档", nickname = "finderGetenabledPost", notes = "", response = FinderGetenabledRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "发现管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = FinderGetenabledRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/finder/getenabled",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<FinderGetenabledRes> finderGetenabledPost();


    @ApiOperation(value = "获取文档发现状态", nickname = "finderGetstatusPost", notes = "", response = FinderGetstatusRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "发现管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = FinderGetstatusRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/finder/getstatus",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<FinderGetstatusRes> finderGetstatusPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinderGetstatusReq body
);

}

