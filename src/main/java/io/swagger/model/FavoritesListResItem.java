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
 * FavoritesListResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FavoritesListResItem   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  public FavoritesListResItem docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件/目录的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件/目录的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FavoritesListResItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件/目录的名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件/目录的名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FavoritesListResItem path(String path) {
    this.path = path;
    return this;
  }

  /**
   * 文件/目录的name路径
   * @return path
  **/
  @ApiModelProperty(required = true, value = "文件/目录的name路径")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FavoritesListResItem size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 文件的大小，目录大小为-1
   * @return size
  **/
  @ApiModelProperty(required = true, value = "文件的大小，目录大小为-1")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FavoritesListResItem creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 文件/目录创建者 
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "文件/目录创建者 ")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public FavoritesListResItem createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * 文件/目录创建时间
   * @return createTime
  **/
  @ApiModelProperty(required = true, value = "文件/目录创建时间")
      @NotNull

    public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public FavoritesListResItem editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 文件/文件编辑者
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "文件/文件编辑者")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FavoritesListResItem modified(Long modified) {
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

  public FavoritesListResItem clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  
   * @return clientMtime
  **/
  @ApiModelProperty(value = "如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  ")
  
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
    FavoritesListResItem favoritesListResItem = (FavoritesListResItem) o;
    return Objects.equals(this.docid, favoritesListResItem.docid) &&
        Objects.equals(this.name, favoritesListResItem.name) &&
        Objects.equals(this.path, favoritesListResItem.path) &&
        Objects.equals(this.size, favoritesListResItem.size) &&
        Objects.equals(this.creator, favoritesListResItem.creator) &&
        Objects.equals(this.createTime, favoritesListResItem.createTime) &&
        Objects.equals(this.editor, favoritesListResItem.editor) &&
        Objects.equals(this.modified, favoritesListResItem.modified) &&
        Objects.equals(this.clientMtime, favoritesListResItem.clientMtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, path, size, creator, createTime, editor, modified, clientMtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoritesListResItem {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
