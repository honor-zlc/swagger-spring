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
 * FilePreviewossReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FilePreviewossReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  @JsonProperty("watermark")
  private Boolean watermark = null;

  public FilePreviewossReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径（列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件gns路径（列举协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FilePreviewossReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 版本号，为空默认获取最新版本
   * @return rev
  **/
  @ApiModelProperty(value = "版本号，为空默认获取最新版本")
  
    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FilePreviewossReq type(String type) {
    this.type = type;
    return this;
  }

  /**
   * 需要预览的转换文件类型  默认参数pdf，获取转换后pdf文件的链接  （参数html，获取转换后html打包文件的链接，需单独部署html转换服务器）  
   * @return type
  **/
  @ApiModelProperty(value = "需要预览的转换文件类型  默认参数pdf，获取转换后pdf文件的链接  （参数html，获取转换后html打包文件的链接，需单独部署html转换服务器）  ")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FilePreviewossReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

  /**
   * 从存储服务器下载数据时的请求地址
   * @return reqhost
  **/
  @ApiModelProperty(value = "从存储服务器下载数据时的请求地址")
  
    public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public FilePreviewossReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * 是否使用https下载数据，默认为true
   * @return usehttps
  **/
  @ApiModelProperty(value = "是否使用https下载数据，默认为true")
  
    public Boolean isUsehttps() {
    return usehttps;
  }

  public void setUsehttps(Boolean usehttps) {
    this.usehttps = usehttps;
  }

  public FilePreviewossReq watermark(Boolean watermark) {
    this.watermark = watermark;
    return this;
  }

  /**
   * 是否增加水印，默认为true
   * @return watermark
  **/
  @ApiModelProperty(value = "是否增加水印，默认为true")
  
    public Boolean isWatermark() {
    return watermark;
  }

  public void setWatermark(Boolean watermark) {
    this.watermark = watermark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilePreviewossReq filePreviewossReq = (FilePreviewossReq) o;
    return Objects.equals(this.docid, filePreviewossReq.docid) &&
        Objects.equals(this.rev, filePreviewossReq.rev) &&
        Objects.equals(this.type, filePreviewossReq.type) &&
        Objects.equals(this.reqhost, filePreviewossReq.reqhost) &&
        Objects.equals(this.usehttps, filePreviewossReq.usehttps) &&
        Objects.equals(this.watermark, filePreviewossReq.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, type, reqhost, usehttps, watermark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePreviewossReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
