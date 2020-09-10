package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SearchSearchReqCreatetime;
import io.swagger.model.SearchSearchReqCustomattr;
import io.swagger.model.SearchSearchReqModifytime;
import io.swagger.model.SearchSearchReqSize;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchSearchReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchSearchReq   {
  @JsonProperty("customattr")
  @Valid
  private List<SearchSearchReqCustomattr> customattr = null;

  @JsonProperty("ext")
  @Valid
  private List<String> ext = null;

  @JsonProperty("keys")
  private String keys = null;

  @JsonProperty("range")
  @Valid
  private List<String> range = null;

  @JsonProperty("rows")
  private Long rows = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("hl")
  private Boolean hl = null;

  @JsonProperty("style")
  private Long style = null;

  @JsonProperty("doctype")
  private Long doctype = null;

  @JsonProperty("keysfields")
  @Valid
  private List<String> keysfields = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("size")
  private SearchSearchReqSize size = null;

  @JsonProperty("createtime")
  private SearchSearchReqCreatetime createtime = null;

  @JsonProperty("modifytime")
  private SearchSearchReqModifytime modifytime = null;

  public SearchSearchReq customattr(List<SearchSearchReqCustomattr> customattr) {
    this.customattr = customattr;
    return this;
  }

  public SearchSearchReq addCustomattrItem(SearchSearchReqCustomattr customattrItem) {
    if (this.customattr == null) {
      this.customattr = new ArrayList<SearchSearchReqCustomattr>();
    }
    this.customattr.add(customattrItem);
    return this;
  }

  /**
   * 自定义属性搜索条件数组
   * @return customattr
  **/
  @ApiModelProperty(value = "自定义属性搜索条件数组")
      @Valid
    public List<SearchSearchReqCustomattr> getCustomattr() {
    return customattr;
  }

  public void setCustomattr(List<SearchSearchReqCustomattr> customattr) {
    this.customattr = customattr;
  }

  public SearchSearchReq ext(List<String> ext) {
    this.ext = ext;
    return this;
  }

  public SearchSearchReq addExtItem(String extItem) {
    if (this.ext == null) {
      this.ext = new ArrayList<String>();
    }
    this.ext.add(extItem);
    return this;
  }

  /**
   * 搜索匹配后缀，以点开头（例如”.doc”）
   * @return ext
  **/
  @ApiModelProperty(value = "搜索匹配后缀，以点开头（例如”.doc”）")
  
    public List<String> getExt() {
    return ext;
  }

  public void setExt(List<String> ext) {
    this.ext = ext;
  }

  public SearchSearchReq keys(String keys) {
    this.keys = keys;
    return this;
  }

  /**
   * 搜索关键字  默认按照短语搜索，需要单独搜索的关键字用“%20”分割  
   * @return keys
  **/
  @ApiModelProperty(value = "搜索关键字  默认按照短语搜索，需要单独搜索的关键字用“%20”分割  ")
  
    public String getKeys() {
    return keys;
  }

  public void setKeys(String keys) {
    this.keys = keys;
  }

  public SearchSearchReq range(List<String> range) {
    this.range = range;
    return this;
  }

  public SearchSearchReq addRangeItem(String rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<String>();
    }
    this.range.add(rangeItem);
    return this;
  }

  /**
   * 指定的某个目录下，具体为gns路径（例如gns://XXX/_*），  搜索所有目录：传空  搜索某个目录及子目录：gns://XXX/_*  搜索仅某个目录下文件：gns://XXX/  
   * @return range
  **/
  @ApiModelProperty(value = "指定的某个目录下，具体为gns路径（例如gns://XXX/_*），  搜索所有目录：传空  搜索某个目录及子目录：gns://XXX/_*  搜索仅某个目录下文件：gns://XXX/  ")
  
    public List<String> getRange() {
    return range;
  }

  public void setRange(List<String> range) {
    this.range = range;
  }

  public SearchSearchReq rows(Long rows) {
    this.rows = rows;
    return this;
  }

  /**
   * 请求返回的查询记录条数，如果返回的条数少于当前值，则表示服务端已无更多数据无需再取
   * @return rows
  **/
  @ApiModelProperty(required = true, value = "请求返回的查询记录条数，如果返回的条数少于当前值，则表示服务端已无更多数据无需再取")
      @NotNull

    public Long getRows() {
    return rows;
  }

  public void setRows(Long rows) {
    this.rows = rows;
  }

  public SearchSearchReq start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * 第一页从0开始，往后的页传入回复消息中的next
   * @return start
  **/
  @ApiModelProperty(required = true, value = "第一页从0开始，往后的页传入回复消息中的next")
      @NotNull

    public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public SearchSearchReq tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SearchSearchReq addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 欲搜索的标签字符串数组
   * @return tags
  **/
  @ApiModelProperty(value = "欲搜索的标签字符串数组")
  
    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SearchSearchReq hl(Boolean hl) {
    this.hl = hl;
    return this;
  }

  /**
   * 是否需要返回高亮内容，默认true   返回形式：\"<em></em>\"  
   * @return hl
  **/
  @ApiModelProperty(value = "是否需要返回高亮内容，默认true   返回形式：\"<em></em>\"  ")
  
    public Boolean isHl() {
    return hl;
  }

  public void setHl(Boolean hl) {
    this.hl = hl;
  }

  public SearchSearchReq style(Long style) {
    this.style = style;
    return this;
  }

  /**
   * 为0，查找range下的有权限文件  为1，查找range下有权限文件和发现共享文件  为2，查找range下的发现共享文件  
   * @return style
  **/
  @ApiModelProperty(value = "为0，查找range下的有权限文件  为1，查找range下有权限文件和发现共享文件  为2，查找range下的发现共享文件  ")
  
    public Long getStyle() {
    return style;
  }

  public void setStyle(Long style) {
    this.style = style;
  }

  public SearchSearchReq doctype(Long doctype) {
    this.doctype = doctype;
    return this;
  }

  /**
   * 为1，查找文件  为2，查找文件夹  为3，查找文件&文件夹  默认3  
   * @return doctype
  **/
  @ApiModelProperty(value = "为1，查找文件  为2，查找文件夹  为3，查找文件&文件夹  默认3  ")
  
    public Long getDoctype() {
    return doctype;
  }

  public void setDoctype(Long doctype) {
    this.doctype = doctype;
  }

  public SearchSearchReq keysfields(List<String> keysfields) {
    this.keysfields = keysfields;
    return this;
  }

  public SearchSearchReq addKeysfieldsItem(String keysfieldsItem) {
    if (this.keysfields == null) {
      this.keysfields = new ArrayList<String>();
    }
    this.keysfields.add(keysfieldsItem);
    return this;
  }

  /**
   * 搜索关键字所在字段（仅当keys不为空时有效），数组中有效元素为”basename”,”content”。 [”basename”]表示匹配文件名；[”content”]表示匹配文件内容；[”basename”, ”content”]表示匹配全文
   * @return keysfields
  **/
  @ApiModelProperty(value = "搜索关键字所在字段（仅当keys不为空时有效），数组中有效元素为”basename”,”content”。 [”basename”]表示匹配文件名；[”content”]表示匹配文件内容；[”basename”, ”content”]表示匹配全文")
  
    public List<String> getKeysfields() {
    return keysfields;
  }

  public void setKeysfields(List<String> keysfields) {
    this.keysfields = keysfields;
  }

  public SearchSearchReq sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * 排序规则：默认为按相关度排序  按文件大小升序为”size”,降序为”-size”；  按修改时间升序为”modified”,降序为”-modified”；  按创建时间升序为”created”,降序为”-created”；  
   * @return sort
  **/
  @ApiModelProperty(value = "排序规则：默认为按相关度排序  按文件大小升序为”size”,降序为”-size”；  按修改时间升序为”modified”,降序为”-modified”；  按创建时间升序为”created”,降序为”-created”；  ")
  
    public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public SearchSearchReq size(SearchSearchReqSize size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SearchSearchReqSize getSize() {
    return size;
  }

  public void setSize(SearchSearchReqSize size) {
    this.size = size;
  }

  public SearchSearchReq createtime(SearchSearchReqCreatetime createtime) {
    this.createtime = createtime;
    return this;
  }

  /**
   * Get createtime
   * @return createtime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SearchSearchReqCreatetime getCreatetime() {
    return createtime;
  }

  public void setCreatetime(SearchSearchReqCreatetime createtime) {
    this.createtime = createtime;
  }

  public SearchSearchReq modifytime(SearchSearchReqModifytime modifytime) {
    this.modifytime = modifytime;
    return this;
  }

  /**
   * Get modifytime
   * @return modifytime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SearchSearchReqModifytime getModifytime() {
    return modifytime;
  }

  public void setModifytime(SearchSearchReqModifytime modifytime) {
    this.modifytime = modifytime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchReq searchSearchReq = (SearchSearchReq) o;
    return Objects.equals(this.customattr, searchSearchReq.customattr) &&
        Objects.equals(this.ext, searchSearchReq.ext) &&
        Objects.equals(this.keys, searchSearchReq.keys) &&
        Objects.equals(this.range, searchSearchReq.range) &&
        Objects.equals(this.rows, searchSearchReq.rows) &&
        Objects.equals(this.start, searchSearchReq.start) &&
        Objects.equals(this.tags, searchSearchReq.tags) &&
        Objects.equals(this.hl, searchSearchReq.hl) &&
        Objects.equals(this.style, searchSearchReq.style) &&
        Objects.equals(this.doctype, searchSearchReq.doctype) &&
        Objects.equals(this.keysfields, searchSearchReq.keysfields) &&
        Objects.equals(this.sort, searchSearchReq.sort) &&
        Objects.equals(this.size, searchSearchReq.size) &&
        Objects.equals(this.createtime, searchSearchReq.createtime) &&
        Objects.equals(this.modifytime, searchSearchReq.modifytime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customattr, ext, keys, range, rows, start, tags, hl, style, doctype, keysfields, sort, size, createtime, modifytime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchReq {\n");
    
    sb.append("    customattr: ").append(toIndentedString(customattr)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    hl: ").append(toIndentedString(hl)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    keysfields: ").append(toIndentedString(keysfields)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createtime: ").append(toIndentedString(createtime)).append("\n");
    sb.append("    modifytime: ").append(toIndentedString(modifytime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
