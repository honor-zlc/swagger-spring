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
 * FileDuploadRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileDuploadRes   {
  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  public FileDuploadRes success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * 秒传是否成功,如果为false，忽略其它字段
   * @return success
  **/
  @ApiModelProperty(required = true, value = "秒传是否成功,如果为false，忽略其它字段")
      @NotNull

    public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public FileDuploadRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件的gns路径
   * @return docid
  **/
  @ApiModelProperty(value = "文件的gns路径")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileDuploadRes editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 编辑者名称，UTF8编码，秒传成功则返回
   * @return editor
  **/
  @ApiModelProperty(value = "编辑者名称，UTF8编码，秒传成功则返回")
  
    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FileDuploadRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 上传时间，UTC时间，此为上传版本时的服务器时间，秒传成功则返回
   * @return modified
  **/
  @ApiModelProperty(value = "上传时间，UTC时间，此为上传版本时的服务器时间，秒传成功则返回")
  
    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public FileDuploadRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(value = "文件名称，UTF8编码")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileDuploadRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件版本号
   * @return rev
  **/
  @ApiModelProperty(value = "文件版本号")
  
    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDuploadRes fileDuploadRes = (FileDuploadRes) o;
    return Objects.equals(this.success, fileDuploadRes.success) &&
        Objects.equals(this.docid, fileDuploadRes.docid) &&
        Objects.equals(this.editor, fileDuploadRes.editor) &&
        Objects.equals(this.modified, fileDuploadRes.modified) &&
        Objects.equals(this.name, fileDuploadRes.name) &&
        Objects.equals(this.rev, fileDuploadRes.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, docid, editor, modified, name, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDuploadRes {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
