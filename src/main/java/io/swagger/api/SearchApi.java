/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.SearchCustomattributeResItem;
import io.swagger.model.SearchSearchReq;
import io.swagger.model.SearchSearchRes;
import io.swagger.model.SearchTagsuggestReq;
import io.swagger.model.SearchTagsuggestRes;
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
@Api(value = "search", description = "the search API")
public interface SearchApi {

    @ApiOperation(value = "获取自定义属性协议", nickname = "searchCustomattributePost", notes = "用于获取全文检索高级检索页面中的自定义属性", response = SearchCustomattributeResItem.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "全文检索协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = SearchCustomattributeResItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/search/customattribute",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<SearchCustomattributeResItem>> searchCustomattributePost();


    @ApiOperation(value = "搜索协议", nickname = "searchSearchPost", notes = "", response = SearchSearchRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "全文检索协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = SearchSearchRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/search/search",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SearchSearchRes> searchSearchPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SearchSearchReq body
);


    @ApiOperation(value = "标签补全协议", nickname = "searchTagsuggestPost", notes = "", response = SearchTagsuggestRes.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "全文检索协议", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "接口调用成功", response = SearchTagsuggestRes.class),
        @ApiResponse(code = 400, message = "接口调用失败，HTTP状态码可能为4xx、5xx，具体参见错误码说明章节", response = Error.class) })
    @RequestMapping(value = "/search/tagsuggest/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SearchTagsuggestRes> searchTagsuggestPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SearchTagsuggestReq body
);

}

