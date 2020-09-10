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
 * FileOsdownloadRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsdownloadRes   {
  @JsonProperty("need_watermark")
  private Boolean needWatermark = null;

  @JsonProperty("authrequest")
  @Valid
  private List<String> authrequest = new ArrayList<String>();

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

  @JsonProperty("size")
  private Long size = null;

  public FileOsdownloadRes needWatermark(Boolean needWatermark) {
    this.needWatermark = needWatermark;
    return this;
  }

  /**
   * 是否是下载水印文件
   * @return needWatermark
  **/
  @ApiModelProperty(required = true, value = "是否是下载水印文件")
      @NotNull

    public Boolean isNeedWatermark() {
    return needWatermark;
  }

  public void setNeedWatermark(Boolean needWatermark) {
    this.needWatermark = needWatermark;
  }

  public FileOsdownloadRes authrequest(List<String> authrequest) {
    this.authrequest = authrequest;
    return this;
  }

  public FileOsdownloadRes addAuthrequestItem(String authrequestItem) {
    this.authrequest.add(authrequestItem);
    return this;
  }

  /**
   * - authrequest[0]：请求方法 - authrequest[1]：资源URL - authrequest[2]（如果存在）及以后项为http请求的headers，如自定义date，Content-type等，格式为“key: value”
   * @return authrequest
  **/
  @ApiModelProperty(required = true, value = "- authrequest[0]：请求方法 - authrequest[1]：资源URL - authrequest[2]（如果存在）及以后项为http请求的headers，如自定义date，Content-type等，格式为“key: value”")
      @NotNull

    public List<String> getAuthrequest() {
    return authrequest;
  }

  public void setAuthrequest(List<String> authrequest) {
    this.authrequest = authrequest;
  }

  public FileOsdownloadRes clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 由客户端设置的文件本地修改时间 下载第0块时返回，若未设置，返回modified的值
   * @return clientMtime
  **/
  @ApiModelProperty(required = true, value = "由客户端设置的文件本地修改时间 下载第0块时返回，若未设置，返回modified的值")
      @NotNull

    public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public FileOsdownloadRes editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 编辑者名称， UTF8编码
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "编辑者名称， UTF8编码")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FileOsdownloadRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 上传时间， UTC时间，此为上传版本时的服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "上传时间， UTC时间，此为上传版本时的服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public FileOsdownloadRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件的当前名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件的当前名称，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileOsdownloadRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件版本号
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "文件版本号")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileOsdownloadRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 当前下载版本的总大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "当前下载版本的总大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsdownloadRes fileOsdownloadRes = (FileOsdownloadRes) o;
    return Objects.equals(this.needWatermark, fileOsdownloadRes.needWatermark) &&
        Objects.equals(this.authrequest, fileOsdownloadRes.authrequest) &&
        Objects.equals(this.clientMtime, fileOsdownloadRes.clientMtime) &&
        Objects.equals(this.editor, fileOsdownloadRes.editor) &&
        Objects.equals(this.modified, fileOsdownloadRes.modified) &&
        Objects.equals(this.name, fileOsdownloadRes.name) &&
        Objects.equals(this.rev, fileOsdownloadRes.rev) &&
        Objects.equals(this.size, fileOsdownloadRes.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needWatermark, authrequest, clientMtime, editor, modified, name, rev, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsdownloadRes {\n");
    
    sb.append("    needWatermark: ").append(toIndentedString(needWatermark)).append("\n");
    sb.append("    authrequest: ").append(toIndentedString(authrequest)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
