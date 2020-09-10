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
 * 注 1：目前支持的格式为：pdf、wps、doc、docx、et、xls、xlsx、dps、ppt、pptx、txt  注 2：首次预览时会进行转换，会返回提交转换的错误码，需要循环重试，直到发生错误或者返回二进制数据  
 */
@ApiModel(description = "注 1：目前支持的格式为：pdf、wps、doc、docx、et、xls、xlsx、dps、ppt、pptx、txt  注 2：首次预览时会进行转换，会返回提交转换的错误码，需要循环重试，直到发生错误或者返回二进制数据  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkPreviewossReq   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  public LinkPreviewossReq link(String link) {
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

  public LinkPreviewossReq password(String password) {
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

  public LinkPreviewossReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径，通过文件夹外链进行文档预览时，需要该参数，默认为空
   * @return docid
  **/
  @ApiModelProperty(value = "文件gns路径，通过文件夹外链进行文档预览时，需要该参数，默认为空")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkPreviewossReq type(String type) {
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

  public LinkPreviewossReq reqhost(String reqhost) {
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

  public LinkPreviewossReq usehttps(Boolean usehttps) {
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
    LinkPreviewossReq linkPreviewossReq = (LinkPreviewossReq) o;
    return Objects.equals(this.link, linkPreviewossReq.link) &&
        Objects.equals(this.password, linkPreviewossReq.password) &&
        Objects.equals(this.docid, linkPreviewossReq.docid) &&
        Objects.equals(this.type, linkPreviewossReq.type) &&
        Objects.equals(this.reqhost, linkPreviewossReq.reqhost) &&
        Objects.equals(this.usehttps, linkPreviewossReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, password, docid, type, reqhost, usehttps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPreviewossReq {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
