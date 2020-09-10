package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileRevisionsResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileRevisionsResItem   {
  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  public FileRevisionsResItem rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 版本号
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "版本号")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileRevisionsResItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 版本所对应文件的最新名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "版本所对应文件的最新名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileRevisionsResItem editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 版本编辑者名称
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "版本编辑者名称")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FileRevisionsResItem modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 版本上传时间，UTC时间，此为上传版本时记录的服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "版本上传时间，UTC时间，此为上传版本时记录的服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public FileRevisionsResItem size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 版本的大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "版本的大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FileRevisionsResItem clientMtime(Long clientMtime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRevisionsResItem fileRevisionsResItem = (FileRevisionsResItem) o;
    return Objects.equals(this.rev, fileRevisionsResItem.rev) &&
        Objects.equals(this.name, fileRevisionsResItem.name) &&
        Objects.equals(this.editor, fileRevisionsResItem.editor) &&
        Objects.equals(this.modified, fileRevisionsResItem.modified) &&
        Objects.equals(this.size, fileRevisionsResItem.size) &&
        Objects.equals(this.clientMtime, fileRevisionsResItem.clientMtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rev, name, editor, modified, size, clientMtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRevisionsResItem {\n");
    
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
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
