package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileMetadataRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileMetadataRes   {
  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("site")
  private String site = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = new ArrayList<String>();

  @JsonProperty("needdownloadwatermark")
  private Boolean needdownloadwatermark = null;

  @JsonProperty("docid")
  private String docid = null;

  public FileMetadataRes clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 由客户端设置的文件本地修改时间    若未设置，返回modified的值  
   * @return clientMtime
  **/
  @ApiModelProperty(required = true, value = "由客户端设置的文件本地修改时间    若未设置，返回modified的值  ")
      @NotNull

    public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public FileMetadataRes editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 文件版本上传编辑者名称，UTF8编码
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "文件版本上传编辑者名称，UTF8编码")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FileMetadataRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 文件版本上传时间，UTC时间，此为上传版本时的服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "文件版本上传时间，UTC时间，此为上传版本时的服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public FileMetadataRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件版本上传时文件名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件版本上传时文件名称，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileMetadataRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件版本ID
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "文件版本ID")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileMetadataRes site(String site) {
    this.site = site;
    return this;
  }

  /**
   * 文件版本的归属站点
   * @return site
  **/
  @ApiModelProperty(required = true, value = "文件版本的归属站点")
      @NotNull

    public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public FileMetadataRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 文件版本的大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "文件版本的大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FileMetadataRes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FileMetadataRes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 版本的标签，字符串数组
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "版本的标签，字符串数组")
      @NotNull

    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FileMetadataRes needdownloadwatermark(Boolean needdownloadwatermark) {
    this.needdownloadwatermark = needdownloadwatermark;
    return this;
  }

  /**
   * 用户下载文件对象时，是否需要下载水印
   * @return needdownloadwatermark
  **/
  @ApiModelProperty(required = true, value = "用户下载文件对象时，是否需要下载水印")
      @NotNull

    public Boolean isNeeddownloadwatermark() {
    return needdownloadwatermark;
  }

  public void setNeeddownloadwatermark(Boolean needdownloadwatermark) {
    this.needdownloadwatermark = needdownloadwatermark;
  }

  public FileMetadataRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件docid
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件docid")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMetadataRes fileMetadataRes = (FileMetadataRes) o;
    return Objects.equals(this.clientMtime, fileMetadataRes.clientMtime) &&
        Objects.equals(this.editor, fileMetadataRes.editor) &&
        Objects.equals(this.modified, fileMetadataRes.modified) &&
        Objects.equals(this.name, fileMetadataRes.name) &&
        Objects.equals(this.rev, fileMetadataRes.rev) &&
        Objects.equals(this.site, fileMetadataRes.site) &&
        Objects.equals(this.size, fileMetadataRes.size) &&
        Objects.equals(this.tags, fileMetadataRes.tags) &&
        Objects.equals(this.needdownloadwatermark, fileMetadataRes.needdownloadwatermark) &&
        Objects.equals(this.docid, fileMetadataRes.docid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientMtime, editor, modified, name, rev, site, size, tags, needdownloadwatermark, docid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMetadataRes {\n");
    
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    needdownloadwatermark: ").append(toIndentedString(needdownloadwatermark)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
