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
 * RecycleListResDirs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class RecycleListResDirs   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("size")
  private Long size = null;

  public RecycleListResDirs docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 回收站中文件/目录的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "回收站中文件/目录的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public RecycleListResDirs editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 回收站中文件/目录删除者的名称
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "回收站中文件/目录删除者的名称")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public RecycleListResDirs modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 回收站中文件/目录的删除时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "回收站中文件/目录的删除时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public RecycleListResDirs name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 回收站中文件/目录的名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "回收站中文件/目录的名称，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RecycleListResDirs path(String path) {
    this.path = path;
    return this;
  }

  /**
   * 回收站中文件/目录的原路径，UTF8编码
   * @return path
  **/
  @ApiModelProperty(required = true, value = "回收站中文件/目录的原路径，UTF8编码")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RecycleListResDirs size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 回收站中文件的大小，目录大小为-1
   * @return size
  **/
  @ApiModelProperty(required = true, value = "回收站中文件的大小，目录大小为-1")
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
    RecycleListResDirs recycleListResDirs = (RecycleListResDirs) o;
    return Objects.equals(this.docid, recycleListResDirs.docid) &&
        Objects.equals(this.editor, recycleListResDirs.editor) &&
        Objects.equals(this.modified, recycleListResDirs.modified) &&
        Objects.equals(this.name, recycleListResDirs.name) &&
        Objects.equals(this.path, recycleListResDirs.path) &&
        Objects.equals(this.size, recycleListResDirs.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, editor, modified, name, path, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleListResDirs {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
