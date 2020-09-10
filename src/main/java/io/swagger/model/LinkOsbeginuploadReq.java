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
 * LinkOsbeginuploadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOsbeginuploadReq   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  @JsonProperty("reqmethod")
  private String reqmethod = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  public LinkOsbeginuploadReq link(String link) {
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

  public LinkOsbeginuploadReq clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 由客户端设置的文件本地修改时间
   * @return clientMtime
  **/
  @ApiModelProperty(value = "由客户端设置的文件本地修改时间")
  
    public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public LinkOsbeginuploadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns  
   * @return docid
  **/
  @ApiModelProperty(value = "gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns  ")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOsbeginuploadReq length(Long length) {
    this.length = length;
    return this;
  }

  /**
   * 整个文件的长度，支持最大5G
   * @return length
  **/
  @ApiModelProperty(required = true, value = "整个文件的长度，支持最大5G")
      @NotNull

    public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public LinkOsbeginuploadReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名称，UTF8编码  - 创建文件时， name为文件名；  - 编辑文件时（文件生成新版本），参数为空  
   * @return name
  **/
  @ApiModelProperty(value = "文件名称，UTF8编码  - 创建文件时， name为文件名；  - 编辑文件时（文件生成新版本），参数为空  ")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkOsbeginuploadReq password(String password) {
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

  public LinkOsbeginuploadReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * 默认为1。  1:检查是否重命名，重名则抛异常  3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @ApiModelProperty(value = "默认为1。  1:检查是否重命名，重名则抛异常  3:如果重名冲突，自动覆盖  ")
  
    public Long getOndup() {
    return ondup;
  }

  public void setOndup(Long ondup) {
    this.ondup = ondup;
  }

  public LinkOsbeginuploadReq reqmethod(String reqmethod) {
    this.reqmethod = reqmethod;
    return this;
  }

  /**
   * 向存储服务器上传数据时的请求方法。  默认为“PUT”；参数值“POST”表示使用POST表单的方式上传  
   * @return reqmethod
  **/
  @ApiModelProperty(value = "向存储服务器上传数据时的请求方法。  默认为“PUT”；参数值“POST”表示使用POST表单的方式上传  ")
  
    public String getReqmethod() {
    return reqmethod;
  }

  public void setReqmethod(String reqmethod) {
    this.reqmethod = reqmethod;
  }

  public LinkOsbeginuploadReq reqhost(String reqhost) {
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

  public LinkOsbeginuploadReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * 上传是否使用https，默认为true，只对一体机自有对象存储EOSS生效
   * @return usehttps
  **/
  @ApiModelProperty(value = "上传是否使用https，默认为true，只对一体机自有对象存储EOSS生效")
  
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
    LinkOsbeginuploadReq linkOsbeginuploadReq = (LinkOsbeginuploadReq) o;
    return Objects.equals(this.link, linkOsbeginuploadReq.link) &&
        Objects.equals(this.clientMtime, linkOsbeginuploadReq.clientMtime) &&
        Objects.equals(this.docid, linkOsbeginuploadReq.docid) &&
        Objects.equals(this.length, linkOsbeginuploadReq.length) &&
        Objects.equals(this.name, linkOsbeginuploadReq.name) &&
        Objects.equals(this.password, linkOsbeginuploadReq.password) &&
        Objects.equals(this.ondup, linkOsbeginuploadReq.ondup) &&
        Objects.equals(this.reqmethod, linkOsbeginuploadReq.reqmethod) &&
        Objects.equals(this.reqhost, linkOsbeginuploadReq.reqhost) &&
        Objects.equals(this.usehttps, linkOsbeginuploadReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, clientMtime, docid, length, name, password, ondup, reqmethod, reqhost, usehttps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOsbeginuploadReq {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ondup: ").append(toIndentedString(ondup)).append("\n");
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
