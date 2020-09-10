/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AutolockGetdirlockinfoReq;
import io.swagger.model.AutolockGetdirlockinfoRes;
import io.swagger.model.AutolockGetlockedfileinfosReq;
import io.swagger.model.AutolockGetlockedfileinfosRes;
import io.swagger.model.AutolockGetlockinfoReq;
import io.swagger.model.AutolockGetlockinfoRes;
import io.swagger.model.AutolockLockReq;
import io.swagger.model.AutolockRefreshReq;
import io.swagger.model.AutolockRefreshRes;
import io.swagger.model.AutolockTrylockReq;
import io.swagger.model.AutolockTrylockRes;
import io.swagger.model.AutolockUnlockReq;
import io.swagger.model.Error;
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
@Api(value = "autolock", description = "the autolock API")
public interface AutolockApi {

    @ApiOperation(value = "获取文件夹锁信息", nickname = "autolockGetdirlockinfoPost", notes = "", response = AutolockGetdirlockinfoRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "文件锁管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = AutolockGetdirlockinfoRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/autolock/getdirlockinfo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AutolockGetdirlockinfoRes> autolockGetdirlockinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockGetdirlockinfoReq body
);


    @ApiOperation(value = "获取当前用户锁信息", nickname = "autolockGetlockedfileinfosPost", notes = "", response = AutolockGetlockedfileinfosRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "文件锁管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = AutolockGetlockedfileinfosRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/autolock/getlockedfileinfos",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AutolockGetlockedfileinfosRes> autolockGetlockedfileinfosPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockGetlockedfileinfosReq body
);


    @ApiOperation(value = "获取文件锁信息", nickname = "autolockGetlockinfoPost", notes = "备注：只有在文件被锁定的情况下，才会返回有效的lockerid、lockeraccount、  lockname等信息。", response = AutolockGetlockinfoRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "文件锁管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = AutolockGetlockinfoRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/autolock/getlockinfo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AutolockGetlockinfoRes> autolockGetlockinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockGetlockinfoReq body
);


    @ApiOperation(value = "锁定文件", nickname = "autolockLockPost", notes = "文件只能被一个具有写权限的用户锁定。", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "文件锁管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/autolock/lock",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> autolockLockPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockLockReq body
);


    @ApiOperation(value = "刷新文件锁", nickname = "autolockRefreshPost", notes = "刷新文件锁的最后访问时间。", response = AutolockRefreshRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "文件锁管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = AutolockRefreshRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/autolock/refresh",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AutolockRefreshRes> autolockRefreshPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockRefreshReq body
);


    @ApiOperation(value = "尝试锁定文件", nickname = "autolockTrylockPost", notes = "trylock时文件未锁定，则锁定文件；文件已被锁定时，返回锁定者的信息。", response = AutolockTrylockRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "文件锁管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = AutolockTrylockRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/autolock/trylock",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AutolockTrylockRes> autolockTrylockPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockTrylockReq body
);


    @ApiOperation(value = "解锁文件", nickname = "autolockUnlockPost", notes = "只有锁定文件的用户才能对文件解锁", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "文件锁管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/autolock/unlock",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> autolockUnlockPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutolockUnlockReq body
);

}

