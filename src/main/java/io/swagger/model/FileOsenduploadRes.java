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
 * FileOsenduploadRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsenduploadRes   {
  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  public FileOsenduploadRes editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 编辑者
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "编辑者")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FileOsenduploadRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 上传时间，UTC时间，此为上传版本完成时的服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "上传时间，UTC时间，此为上传版本完成时的服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsenduploadRes fileOsenduploadRes = (FileOsenduploadRes) o;
    return Objects.equals(this.editor, fileOsenduploadRes.editor) &&
        Objects.equals(this.modified, fileOsenduploadRes.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editor, modified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsenduploadRes {\n");
    
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
