/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Perm1CheckReq;
import io.swagger.model.Perm1CheckRes;
import io.swagger.model.Perm1CheckallReq;
import io.swagger.model.Perm1CheckallRes;
import io.swagger.model.Perm1GetexternallinktemplateRes;
import io.swagger.model.Perm1GetinternallinktemplateRes;
import io.swagger.model.Perm1GetsharedRes;
import io.swagger.model.Perm1GetsharedocconfigRes;
import io.swagger.model.Perm1ListReq;
import io.swagger.model.Perm1ListRes;
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
@Api(value = "perm1", description = "the perm1 API")
public interface Perm1Api {

    @ApiOperation(value = "检查单个权限", nickname = "perm1CheckPost", notes = "", response = Perm1CheckRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "权限管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Perm1CheckRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/perm1/check",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Perm1CheckRes> perm1CheckPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm1CheckReq body
);


    @ApiOperation(value = "检查所有权限", nickname = "perm1CheckallPost", notes = "", response = Perm1CheckallRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "权限管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Perm1CheckallRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/perm1/checkall",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Perm1CheckallRes> perm1CheckallPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm1CheckallReq body
);


    @ApiOperation(value = "获取外链共享模板", nickname = "perm1GetexternallinktemplatePost", notes = "", response = Perm1GetexternallinktemplateRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "权限管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Perm1GetexternallinktemplateRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/perm1/getexternallinktemplate",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Perm1GetexternallinktemplateRes> perm1GetexternallinktemplatePost();


    @ApiOperation(value = "获取内链共享模板", nickname = "perm1GetinternallinktemplatePost", notes = "", response = Perm1GetinternallinktemplateRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "权限管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Perm1GetinternallinktemplateRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/perm1/getinternallinktemplate",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Perm1GetinternallinktemplateRes> perm1GetinternallinktemplatePost();


    @ApiOperation(value = "获取用户已共享的文档", nickname = "perm1GetsharedPost", notes = "", response = Perm1GetsharedRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "权限管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Perm1GetsharedRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/perm1/getshared",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Perm1GetsharedRes> perm1GetsharedPost();


    @ApiOperation(value = "获取共享文档开关配置", nickname = "perm1GetsharedocconfigPost", notes = "", response = Perm1GetsharedocconfigRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "权限管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Perm1GetsharedocconfigRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/perm1/getsharedocconfig",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Perm1GetsharedocconfigRes> perm1GetsharedocconfigPost();


    @ApiOperation(value = "展示各访问者的最终权限", nickname = "perm1ListPost", notes = "", response = Perm1ListRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "权限管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = Perm1ListRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/perm1/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Perm1ListRes> perm1ListPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Perm1ListReq body
);

}

