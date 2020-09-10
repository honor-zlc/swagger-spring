/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.OwnerAddReq;
import io.swagger.model.OwnerCheckReq;
import io.swagger.model.OwnerCheckRes;
import io.swagger.model.OwnerDeleteReq;
import io.swagger.model.OwnerGetReq;
import io.swagger.model.OwnerGetRes;
import io.swagger.model.OwnerSetReq;
import io.swagger.model.OwnerSetRes;
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
@Api(value = "owner", description = "the owner API")
public interface OwnerApi {

    @ApiOperation(value = "添加所有者", nickname = "ownerAddPost", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "所有者管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/owner/add",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> ownerAddPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerAddReq body
);


    @ApiOperation(value = "检查是否是所有者", nickname = "ownerCheckPost", notes = "", response = OwnerCheckRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "所有者管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = OwnerCheckRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/owner/check",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OwnerCheckRes> ownerCheckPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerCheckReq body
);


    @ApiOperation(value = "删除所有者", nickname = "ownerDeletePost", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "所有者管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/owner/delete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> ownerDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerDeleteReq body
);


    @ApiOperation(value = "获取所有者", nickname = "ownerGetPost", notes = "", response = OwnerGetRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "所有者管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = OwnerGetRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/owner/get",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OwnerGetRes> ownerGetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerGetReq body
);


    @ApiOperation(value = "设置所有者", nickname = "ownerSetPost", notes = "", response = OwnerSetRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "所有者管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = OwnerSetRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/owner/set",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OwnerSetRes> ownerSetPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OwnerSetReq body
);

}
