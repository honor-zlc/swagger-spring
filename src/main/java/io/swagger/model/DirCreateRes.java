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
 * DirCreateRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirCreateRes   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("name")
  private String name = null;

  public DirCreateRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 创建的目录的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "创建的目录的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirCreateRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 数据变化标识
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "数据变化标识")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public DirCreateRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 创建时间，UTC时间，此为服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "创建时间，UTC时间，此为服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public DirCreateRes createTime(Long createTime) {
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

  public DirCreateRes creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 目录创建者
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "目录创建者")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public DirCreateRes editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 目录修改者
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "目录修改者")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public DirCreateRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UTF8编码，仅当ondup为2时才返回
   * @return name
  **/
  @ApiModelProperty(value = "UTF8编码，仅当ondup为2时才返回")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirCreateRes dirCreateRes = (DirCreateRes) o;
    return Objects.equals(this.docid, dirCreateRes.docid) &&
        Objects.equals(this.rev, dirCreateRes.rev) &&
        Objects.equals(this.modified, dirCreateRes.modified) &&
        Objects.equals(this.createTime, dirCreateRes.createTime) &&
        Objects.equals(this.creator, dirCreateRes.creator) &&
        Objects.equals(this.editor, dirCreateRes.editor) &&
        Objects.equals(this.name, dirCreateRes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, modified, createTime, creator, editor, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCreateRes {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
