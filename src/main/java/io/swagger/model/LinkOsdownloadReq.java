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
 * LinkOsdownloadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOsdownloadReq   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  @JsonProperty("savename")
  private String savename = null;

  public LinkOsdownloadReq link(String link) {
    this.link = link;
    return this;
  }

  /**
   * 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0
   * @return link
  **/
  @ApiModelProperty(required = true, value = "外链唯一标识，如FC5E038D38A57032085441E7FE7010B0")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LinkOsdownloadReq password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 密码
   * @return password
  **/
  @ApiModelProperty(required = true, value = "密码")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LinkOsdownloadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径，通过文件夹外链下载文件时，需要该参数，默认为空
   * @return docid
  **/
  @ApiModelProperty(value = "文件gns路径，通过文件夹外链下载文件时，需要该参数，默认为空")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOsdownloadReq reqhost(String reqhost) {
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

  public LinkOsdownloadReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * 是否使用https下载，默认为true,使用亚马逊AWS S3时，参数usehttps的设置无效，统一使用https。
   * @return usehttps
  **/
  @ApiModelProperty(value = "是否使用https下载，默认为true,使用亚马逊AWS S3时，参数usehttps的设置无效，统一使用https。")
  
    public Boolean isUsehttps() {
    return usehttps;
  }

  public void setUsehttps(Boolean usehttps) {
    this.usehttps = usehttps;
  }

  public LinkOsdownloadReq savename(String savename) {
    this.savename = savename;
    return this;
  }

  /**
   * 要保存的文件名
   * @return savename
  **/
  @ApiModelProperty(value = "要保存的文件名")
  
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
    LinkOsdownloadReq linkOsdownloadReq = (LinkOsdownloadReq) o;
    return Objects.equals(this.link, linkOsdownloadReq.link) &&
        Objects.equals(this.password, linkOsdownloadReq.password) &&
        Objects.equals(this.docid, linkOsdownloadReq.docid) &&
        Objects.equals(this.reqhost, linkOsdownloadReq.reqhost) &&
        Objects.equals(this.usehttps, linkOsdownloadReq.usehttps) &&
        Objects.equals(this.savename, linkOsdownloadReq.savename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, password, docid, reqhost, usehttps, savename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOsdownloadReq {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
