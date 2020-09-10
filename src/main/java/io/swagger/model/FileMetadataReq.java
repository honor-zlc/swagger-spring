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
 * docid与objectid都为可选，body中可选一种方式获取文件元数据，不能同时为空
 */
@ApiModel(description = "docid与objectid都为可选，body中可选一种方式获取文件元数据，不能同时为空")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileMetadataReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("objectid")
  private String objectid = null;

  public FileMetadataReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径（列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(value = "文件gns路径（列举协议返回）")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileMetadataReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 版本号，为空默认获取最新版本的元数据
   * @return rev
  **/
  @ApiModelProperty(value = "版本号，为空默认获取最新版本的元数据")
  
    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileMetadataReq objectid(String objectid) {
    this.objectid = objectid;
    return this;
  }

  /**
   * 文件对象id
   * @return objectid
  **/
  @ApiModelProperty(value = "文件对象id")
  
    public String getObjectid() {
    return objectid;
  }

  public void setObjectid(String objectid) {
    this.objectid = objectid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMetadataReq fileMetadataReq = (FileMetadataReq) o;
    return Objects.equals(this.docid, fileMetadataReq.docid) &&
        Objects.equals(this.rev, fileMetadataReq.rev) &&
        Objects.equals(this.objectid, fileMetadataReq.objectid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, objectid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMetadataReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    objectid: ").append(toIndentedString(objectid)).append("\n");
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
