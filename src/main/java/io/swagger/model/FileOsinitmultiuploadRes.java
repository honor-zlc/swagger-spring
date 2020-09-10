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
 * FileOsinitmultiuploadRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsinitmultiuploadRes   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("uploadid")
  private String uploadid = null;

  public FileOsinitmultiuploadRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsinitmultiuploadRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名称，UTF8编码，创建版本时返回
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件名称，UTF8编码，创建版本时返回")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileOsinitmultiuploadRes rev(String rev) {
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

  public FileOsinitmultiuploadRes uploadid(String uploadid) {
    this.uploadid = uploadid;
    return this;
  }

  /**
   * 标识本次Multipart Upload事件
   * @return uploadid
  **/
  @ApiModelProperty(required = true, value = "标识本次Multipart Upload事件")
      @NotNull

    public String getUploadid() {
    return uploadid;
  }

  public void setUploadid(String uploadid) {
    this.uploadid = uploadid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsinitmultiuploadRes fileOsinitmultiuploadRes = (FileOsinitmultiuploadRes) o;
    return Objects.equals(this.docid, fileOsinitmultiuploadRes.docid) &&
        Objects.equals(this.name, fileOsinitmultiuploadRes.name) &&
        Objects.equals(this.rev, fileOsinitmultiuploadRes.rev) &&
        Objects.equals(this.uploadid, fileOsinitmultiuploadRes.uploadid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, rev, uploadid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsinitmultiuploadRes {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    uploadid: ").append(toIndentedString(uploadid)).append("\n");
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
