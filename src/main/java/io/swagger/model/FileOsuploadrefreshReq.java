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
 * FileOsuploadrefreshReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsuploadrefreshReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("multiupload")
  private Boolean multiupload = null;

  @JsonProperty("reqmethod")
  private String reqmethod = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  public FileOsuploadrefreshReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径（创建协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件gns路径（创建协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsuploadrefreshReq rev(String rev) {
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

  public FileOsuploadrefreshReq length(Long length) {
    this.length = length;
    return this;
  }

  /**
   * 默认为-1；    不为-1时，更新版本的length为参数值；  
   * @return length
  **/
  @ApiModelProperty(value = "默认为-1；    不为-1时，更新版本的length为参数值；  ")
  
    public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public FileOsuploadrefreshReq multiupload(Boolean multiupload) {
    this.multiupload = multiupload;
    return this;
  }

  /**
   * - 默认为false  - 参数为true，返回大文件分片上传需要的uploadid  - 如果multiupload为false，length支持最大5G
   * @return multiupload
  **/
  @ApiModelProperty(value = "- 默认为false  - 参数为true，返回大文件分片上传需要的uploadid  - 如果multiupload为false，length支持最大5G")
  
    public Boolean isMultiupload() {
    return multiupload;
  }

  public void setMultiupload(Boolean multiupload) {
    this.multiupload = multiupload;
  }

  public FileOsuploadrefreshReq reqmethod(String reqmethod) {
    this.reqmethod = reqmethod;
    return this;
  }

  /**
   * 采用单文件上传方式向存储服务器上传数据时的请求方法。    默认为“PUT”；参数值“POST”表示使用POST表单的方式上传  
   * @return reqmethod
  **/
  @ApiModelProperty(value = "采用单文件上传方式向存储服务器上传数据时的请求方法。    默认为“PUT”；参数值“POST”表示使用POST表单的方式上传  ")
  
    public String getReqmethod() {
    return reqmethod;
  }

  public void setReqmethod(String reqmethod) {
    this.reqmethod = reqmethod;
  }

  public FileOsuploadrefreshReq reqhost(String reqhost) {
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

  public FileOsuploadrefreshReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * - 上传是否使用https，默认为true - 该参数只对一体机自有对象存储EOSS生效
   * @return usehttps
  **/
  @ApiModelProperty(value = "- 上传是否使用https，默认为true - 该参数只对一体机自有对象存储EOSS生效")
  
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
    FileOsuploadrefreshReq fileOsuploadrefreshReq = (FileOsuploadrefreshReq) o;
    return Objects.equals(this.docid, fileOsuploadrefreshReq.docid) &&
        Objects.equals(this.rev, fileOsuploadrefreshReq.rev) &&
        Objects.equals(this.length, fileOsuploadrefreshReq.length) &&
        Objects.equals(this.multiupload, fileOsuploadrefreshReq.multiupload) &&
        Objects.equals(this.reqmethod, fileOsuploadrefreshReq.reqmethod) &&
        Objects.equals(this.reqhost, fileOsuploadrefreshReq.reqhost) &&
        Objects.equals(this.usehttps, fileOsuploadrefreshReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, length, multiupload, reqmethod, reqhost, usehttps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsuploadrefreshReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    multiupload: ").append(toIndentedString(multiupload)).append("\n");
    sb.append("    reqmethod: ").append(toIndentedString(reqmethod)).append("\n");
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
