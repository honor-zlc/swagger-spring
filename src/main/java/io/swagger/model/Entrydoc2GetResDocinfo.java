package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Entrydoc2GetResDocinfoSiteinfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Entrydoc2GetResDocinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetResDocinfo   {
  @JsonProperty("attr")
  private Long attr = null;

  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("displayorder")
  private Long displayorder = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("doctype")
  private Long doctype = null;

  @JsonProperty("downloadwatermark")
  private Boolean downloadwatermark = null;

  @JsonProperty("duedate")
  private Long duedate = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("siteinfo")
  private Entrydoc2GetResDocinfoSiteinfo siteinfo = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("typename")
  private String typename = null;

  public Entrydoc2GetResDocinfo attr(Long attr) {
    this.attr = attr;
    return this;
  }

  /**
   * 总共32位，右下角表示最低位，左上角表示最高位，如：    0<sub>32</sub>000,0000,0000,0000<sub>17</sub>    0<sub>16</sub>000,0000,0000,0000<sub>1</sub>  - 1：只读（用户针对访问对象是否是只读属性）  - 2：锁定（表示访问对象是否被锁定）  - 3：允许显示  - 4：拒绝显示  - 5：允许预览  - 6：拒绝预览  - 7：允许下载  - 8：拒绝下载  - 9：允许新建  - 10：拒绝新建  - 11：允许修改  - 12：拒绝修改  - 13：允许删除  - 14：拒绝删除  - 15：允许复制  - 16：拒绝复制     第25位到28位表示该用户的密级    可能为以下值：    0101(5)~1111(15)    attr中带上用户的密级是方便客户端探测到用户的密级变化，从而探测到新的文件（因为密级变大或者变小，看到的文件会变多或变少）  
   * @return attr
  **/
  @ApiModelProperty(required = true, value = "总共32位，右下角表示最低位，左上角表示最高位，如：    0<sub>32</sub>000,0000,0000,0000<sub>17</sub>    0<sub>16</sub>000,0000,0000,0000<sub>1</sub>  - 1：只读（用户针对访问对象是否是只读属性）  - 2：锁定（表示访问对象是否被锁定）  - 3：允许显示  - 4：拒绝显示  - 5：允许预览  - 6：拒绝预览  - 7：允许下载  - 8：拒绝下载  - 9：允许新建  - 10：拒绝新建  - 11：允许修改  - 12：拒绝修改  - 13：允许删除  - 14：拒绝删除  - 15：允许复制  - 16：拒绝复制     第25位到28位表示该用户的密级    可能为以下值：    0101(5)~1111(15)    attr中带上用户的密级是方便客户端探测到用户的密级变化，从而探测到新的文件（因为密级变大或者变小，看到的文件会变多或变少）  ")
      @NotNull

    public Long getAttr() {
    return attr;
  }

  public void setAttr(Long attr) {
    this.attr = attr;
  }

  public Entrydoc2GetResDocinfo createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * 目录创建的服务端时间
   * @return createTime
  **/
  @ApiModelProperty(required = true, value = "目录创建的服务端时间")
      @NotNull

    public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public Entrydoc2GetResDocinfo creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 创建者名称
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "创建者名称")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public Entrydoc2GetResDocinfo displayorder(Long displayorder) {
    this.displayorder = displayorder;
    return this;
  }

  /**
   * 排序权重，-1表示未设置
   * @return displayorder
  **/
  @ApiModelProperty(required = true, value = "排序权重，-1表示未设置")
      @NotNull

    public Long getDisplayorder() {
    return displayorder;
  }

  public void setDisplayorder(Long displayorder) {
    this.displayorder = displayorder;
  }

  public Entrydoc2GetResDocinfo docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档库id
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档库id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public Entrydoc2GetResDocinfo doctype(Long doctype) {
    this.doctype = doctype;
    return this;
  }

  /**
   * 文档库类型：  1：个人文档库  2：个人群组文档库  3：自定义文档库  4：共享个人文档库  5：归档库  6：共享个人群组文档库  
   * @return doctype
  **/
  @ApiModelProperty(required = true, value = "文档库类型：  1：个人文档库  2：个人群组文档库  3：自定义文档库  4：共享个人文档库  5：归档库  6：共享个人群组文档库  ")
      @NotNull

    public Long getDoctype() {
    return doctype;
  }

  public void setDoctype(Long doctype) {
    this.doctype = doctype;
  }

  public Entrydoc2GetResDocinfo downloadwatermark(Boolean downloadwatermark) {
    this.downloadwatermark = downloadwatermark;
    return this;
  }

  /**
   * 是否需要下载水印
   * @return downloadwatermark
  **/
  @ApiModelProperty(required = true, value = "是否需要下载水印")
      @NotNull

    public Boolean isDownloadwatermark() {
    return downloadwatermark;
  }

  public void setDownloadwatermark(Boolean downloadwatermark) {
    this.downloadwatermark = downloadwatermark;
  }

  public Entrydoc2GetResDocinfo duedate(Long duedate) {
    this.duedate = duedate;
    return this;
  }

  /**
   * 到期时间，-1表示未设置
   * @return duedate
  **/
  @ApiModelProperty(required = true, value = "到期时间，-1表示未设置")
      @NotNull

    public Long getDuedate() {
    return duedate;
  }

  public void setDuedate(Long duedate) {
    this.duedate = duedate;
  }

  public Entrydoc2GetResDocinfo editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 修改者名称
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "修改者名称")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public Entrydoc2GetResDocinfo modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public Entrydoc2GetResDocinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文档库名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文档库名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Entrydoc2GetResDocinfo rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文档库变化标识
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "文档库变化标识")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public Entrydoc2GetResDocinfo siteinfo(Entrydoc2GetResDocinfoSiteinfo siteinfo) {
    this.siteinfo = siteinfo;
    return this;
  }

  /**
   * Get siteinfo
   * @return siteinfo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Entrydoc2GetResDocinfoSiteinfo getSiteinfo() {
    return siteinfo;
  }

  public void setSiteinfo(Entrydoc2GetResDocinfoSiteinfo siteinfo) {
    this.siteinfo = siteinfo;
  }

  public Entrydoc2GetResDocinfo size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * -1表示文件夹
   * @return size
  **/
  @ApiModelProperty(required = true, value = "-1表示文件夹")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Entrydoc2GetResDocinfo typename(String typename) {
    this.typename = typename;
    return this;
  }

  /**
   * 文档库类型名称
   * @return typename
  **/
  @ApiModelProperty(required = true, value = "文档库类型名称")
      @NotNull

    public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetResDocinfo entrydoc2GetResDocinfo = (Entrydoc2GetResDocinfo) o;
    return Objects.equals(this.attr, entrydoc2GetResDocinfo.attr) &&
        Objects.equals(this.createTime, entrydoc2GetResDocinfo.createTime) &&
        Objects.equals(this.creator, entrydoc2GetResDocinfo.creator) &&
        Objects.equals(this.displayorder, entrydoc2GetResDocinfo.displayorder) &&
        Objects.equals(this.docid, entrydoc2GetResDocinfo.docid) &&
        Objects.equals(this.doctype, entrydoc2GetResDocinfo.doctype) &&
        Objects.equals(this.downloadwatermark, entrydoc2GetResDocinfo.downloadwatermark) &&
        Objects.equals(this.duedate, entrydoc2GetResDocinfo.duedate) &&
        Objects.equals(this.editor, entrydoc2GetResDocinfo.editor) &&
        Objects.equals(this.modified, entrydoc2GetResDocinfo.modified) &&
        Objects.equals(this.name, entrydoc2GetResDocinfo.name) &&
        Objects.equals(this.rev, entrydoc2GetResDocinfo.rev) &&
        Objects.equals(this.siteinfo, entrydoc2GetResDocinfo.siteinfo) &&
        Objects.equals(this.size, entrydoc2GetResDocinfo.size) &&
        Objects.equals(this.typename, entrydoc2GetResDocinfo.typename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attr, createTime, creator, displayorder, docid, doctype, downloadwatermark, duedate, editor, modified, name, rev, siteinfo, size, typename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetResDocinfo {\n");
    
    sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    displayorder: ").append(toIndentedString(displayorder)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    downloadwatermark: ").append(toIndentedString(downloadwatermark)).append("\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    siteinfo: ").append(toIndentedString(siteinfo)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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
