/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.UserAgreedtotermsofuseRes;
import io.swagger.model.UserGetRes;
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
@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "同意用户使用协议", nickname = "userAgreedtotermsofusePost", notes = "", response = UserAgreedtotermsofuseRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "用户管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = UserAgreedtotermsofuseRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/user/agreedtotermsofuse",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<UserAgreedtotermsofuseRes> userAgreedtotermsofusePost();


    @ApiOperation(value = "获取userid对应的用户信息", nickname = "userGetPost", notes = "", response = UserGetRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "用户管理", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = UserGetRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/user/get",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<UserGetRes> userGetPost();

}

