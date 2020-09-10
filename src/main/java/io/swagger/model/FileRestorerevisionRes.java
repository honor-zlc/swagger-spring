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
 * FileRestorerevisionRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileRestorerevisionRes   {
  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  public FileRestorerevisionRes editor(String editor) {
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

  public FileRestorerevisionRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * UTC时间，此为还原产生新版本时的服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "UTC时间，此为还原产生新版本时的服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public FileRestorerevisionRes clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  
   * @return clientMtime
  **/
  @ApiModelProperty(required = true, value = "如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  ")
      @NotNull

    public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public FileRestorerevisionRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 版本所对应文件的名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "版本所对应文件的名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileRestorerevisionRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 新的版本号
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "新的版本号")
      @NotNull

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
    FileRestorerevisionRes fileRestorerevisionRes = (FileRestorerevisionRes) o;
    return Objects.equals(this.editor, fileRestorerevisionRes.editor) &&
        Objects.equals(this.modified, fileRestorerevisionRes.modified) &&
        Objects.equals(this.clientMtime, fileRestorerevisionRes.clientMtime) &&
        Objects.equals(this.name, fileRestorerevisionRes.name) &&
        Objects.equals(this.rev, fileRestorerevisionRes.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editor, modified, clientMtime, name, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRestorerevisionRes {\n");
    
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
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
