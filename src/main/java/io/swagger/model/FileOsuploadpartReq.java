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
 * FileOsuploadpartReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsuploadpartReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("uploadid")
  private String uploadid = null;

  @JsonProperty("parts")
  private String parts = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  public FileOsuploadpartReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件的gns路径（创建协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件的gns路径（创建协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsuploadpartReq rev(String rev) {
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

  public FileOsuploadpartReq uploadid(String uploadid) {
    this.uploadid = uploadid;
    return this;
  }

  /**
   * Multiupload事件Id
   * @return uploadid
  **/
  @ApiModelProperty(required = true, value = "Multiupload事件Id")
      @NotNull

    public String getUploadid() {
    return uploadid;
  }

  public void setUploadid(String uploadid) {
    this.uploadid = uploadid;
  }

  public FileOsuploadpartReq parts(String parts) {
    this.parts = parts;
    return this;
  }

  /**
   * 需要鉴权的数据块号，支持两种格式的组合，组合时以逗号分隔：  - 以“-”连接的数据块区间  - 单独的数据块号  - 如：1-100,2,3,4,23-120,130,288  - 数据块号最小为1，最大为10000。  - 根据parts参数的请求形式，可以批量申请上传数据的请求，减少上传文件时的请求次数。  
   * @return parts
  **/
  @ApiModelProperty(required = true, value = "需要鉴权的数据块号，支持两种格式的组合，组合时以逗号分隔：  - 以“-”连接的数据块区间  - 单独的数据块号  - 如：1-100,2,3,4,23-120,130,288  - 数据块号最小为1，最大为10000。  - 根据parts参数的请求形式，可以批量申请上传数据的请求，减少上传文件时的请求次数。  ")
      @NotNull

    public String getParts() {
    return parts;
  }

  public void setParts(String parts) {
    this.parts = parts;
  }

  public FileOsuploadpartReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

  /**
   * 向存储服务器上传数据时的请求地址
   * @return reqhost
  **/
  @ApiModelProperty(value = "向存储服务器上传数据时的请求地址")
  
    public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public FileOsuploadpartReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * 上传是否使用https，默认为true
   * @return usehttps
  **/
  @ApiModelProperty(value = "上传是否使用https，默认为true")
  
    public Boolean isUsehttps() {
    return usehttps;
  }

  public void setUsehttps(Boolean usehttps) {
    this.usehttps = usehttps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsuploadpartReq fileOsuploadpartReq = (FileOsuploadpartReq) o;
    return Objects.equals(this.docid, fileOsuploadpartReq.docid) &&
        Objects.equals(this.rev, fileOsuploadpartReq.rev) &&
        Objects.equals(this.uploadid, fileOsuploadpartReq.uploadid) &&
        Objects.equals(this.parts, fileOsuploadpartReq.parts) &&
        Objects.equals(this.reqhost, fileOsuploadpartReq.reqhost) &&
        Objects.equals(this.usehttps, fileOsuploadpartReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, uploadid, parts, reqhost, usehttps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsuploadpartReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    uploadid: ").append(toIndentedString(uploadid)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
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
