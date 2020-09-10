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
 * FileOsdownloadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsdownloadReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("authtype")
  private String authtype = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  @JsonProperty("savename")
  private String savename = null;

  public FileOsdownloadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档id
   * @return docid
  **/
  @ApiModelProperty(example = "gns://337CF682A29B4B4AAE37947BE99E817B/FD6C37F52BE446FEA563D0A117DC487F", required = true, value = "文档id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsdownloadReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件版本号，为空默认下载最新版本
   * @return rev
  **/
  @ApiModelProperty(value = "文件版本号，为空默认下载最新版本")
  
    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileOsdownloadReq authtype(String authtype) {
    this.authtype = authtype;
    return this;
  }

  /**
   * 默认为空，在header中包含鉴权，否则在url中包含鉴权。QUERY_STRING，url中包含鉴权
   * @return authtype
  **/
  @ApiModelProperty(value = "默认为空，在header中包含鉴权，否则在url中包含鉴权。QUERY_STRING，url中包含鉴权")
  
    public String getAuthtype() {
    return authtype;
  }

  public void setAuthtype(String authtype) {
    this.authtype = authtype;
  }

  public FileOsdownloadReq reqhost(String reqhost) {
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

  public FileOsdownloadReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * 是否使用https下载，默认为true；使用亚马逊AWS S3时，参数usehttps的设置无效，统一使用https
   * @return usehttps
  **/
  @ApiModelProperty(value = "是否使用https下载，默认为true；使用亚马逊AWS S3时，参数usehttps的设置无效，统一使用https")
  
    public Boolean isUsehttps() {
    return usehttps;
  }

  public void setUsehttps(Boolean usehttps) {
    this.usehttps = usehttps;
  }

  public FileOsdownloadReq savename(String savename) {
    this.savename = savename;
    return this;
  }

  /**
   * 使用QUERY_STRING方式下载时（浏览器），可以设置要保存的文件名
   * @return savename
  **/
  @ApiModelProperty(value = "使用QUERY_STRING方式下载时（浏览器），可以设置要保存的文件名")
  
    public String getSavename() {
    return savename;
  }

  public void setSavename(String savename) {
    this.savename = savename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsdownloadReq fileOsdownloadReq = (FileOsdownloadReq) o;
    return Objects.equals(this.docid, fileOsdownloadReq.docid) &&
        Objects.equals(this.rev, fileOsdownloadReq.rev) &&
        Objects.equals(this.authtype, fileOsdownloadReq.authtype) &&
        Objects.equals(this.reqhost, fileOsdownloadReq.reqhost) &&
        Objects.equals(this.usehttps, fileOsdownloadReq.usehttps) &&
        Objects.equals(this.savename, fileOsdownloadReq.savename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, authtype, reqhost, usehttps, savename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsdownloadReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    authtype: ").append(toIndentedString(authtype)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
    sb.append("    savename: ").append(toIndentedString(savename)).append("\n");
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
