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
 * QuarantinePreviewReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class QuarantinePreviewReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  public QuarantinePreviewReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件docid
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件docid")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public QuarantinePreviewReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 预览版本ID （不可为空）
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "预览版本ID （不可为空）")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public QuarantinePreviewReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

  /**
   * 从存储服务器下载数据时的请求地址从存储服务器下载数据时的请求地址
   * @return reqhost
  **/
  @ApiModelProperty(value = "从存储服务器下载数据时的请求地址从存储服务器下载数据时的请求地址")
  
    public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public QuarantinePreviewReq usehttps(Boolean usehttps) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantinePreviewReq quarantinePreviewReq = (QuarantinePreviewReq) o;
    return Objects.equals(this.docid, quarantinePreviewReq.docid) &&
        Objects.equals(this.rev, quarantinePreviewReq.rev) &&
        Objects.equals(this.reqhost, quarantinePreviewReq.reqhost) &&
        Objects.equals(this.usehttps, quarantinePreviewReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, reqhost, usehttps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantinePreviewReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
