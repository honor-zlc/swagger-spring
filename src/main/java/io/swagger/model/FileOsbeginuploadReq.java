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
 * FileOsbeginuploadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsbeginuploadReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  @JsonProperty("reqmethod")
  private String reqmethod = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("editedrev")
  private String editedrev = null;

  public FileOsbeginuploadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsbeginuploadReq length(Long length) {
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

  public FileOsbeginuploadReq name(String name) {
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

  public FileOsbeginuploadReq clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 由客户端设置的文件本地修改时间  创建新版本（rev为空或name为为空）时，写入版本
   * @return clientMtime
  **/
  @ApiModelProperty(value = "由客户端设置的文件本地修改时间  创建新版本（rev为空或name为为空）时，写入版本")
  
    public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public FileOsbeginuploadReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * 当name不为空时生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @ApiModelProperty(value = "当name不为空时生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  ")
  
    public Long getOndup() {
    return ondup;
  }

  public void setOndup(Long ondup) {
    this.ondup = ondup;
  }

  public FileOsbeginuploadReq reqmethod(String reqmethod) {
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

  public FileOsbeginuploadReq reqhost(String reqhost) {
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

  public FileOsbeginuploadReq usehttps(Boolean usehttps) {
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

  public FileOsbeginuploadReq csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级预检查，要设置密级必须在osendupload中设置  - 0：默认值，不检查密级  - 5~15：正常密级  - 0x7FFF：空密级  
   * @return csflevel
  **/
  @ApiModelProperty(value = "文件密级预检查，要设置密级必须在osendupload中设置  - 0：默认值，不检查密级  - 5~15：正常密级  - 0x7FFF：空密级  ")
  
    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public FileOsbeginuploadReq editedrev(String editedrev) {
    this.editedrev = editedrev;
    return this;
  }

  /**
   * 表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”  
   * @return editedrev
  **/
  @ApiModelProperty(value = "表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”  ")
  
    public String getEditedrev() {
    return editedrev;
  }

  public void setEditedrev(String editedrev) {
    this.editedrev = editedrev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsbeginuploadReq fileOsbeginuploadReq = (FileOsbeginuploadReq) o;
    return Objects.equals(this.docid, fileOsbeginuploadReq.docid) &&
        Objects.equals(this.length, fileOsbeginuploadReq.length) &&
        Objects.equals(this.name, fileOsbeginuploadReq.name) &&
        Objects.equals(this.clientMtime, fileOsbeginuploadReq.clientMtime) &&
        Objects.equals(this.ondup, fileOsbeginuploadReq.ondup) &&
        Objects.equals(this.reqmethod, fileOsbeginuploadReq.reqmethod) &&
        Objects.equals(this.reqhost, fileOsbeginuploadReq.reqhost) &&
        Objects.equals(this.usehttps, fileOsbeginuploadReq.usehttps) &&
        Objects.equals(this.csflevel, fileOsbeginuploadReq.csflevel) &&
        Objects.equals(this.editedrev, fileOsbeginuploadReq.editedrev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, length, name, clientMtime, ondup, reqmethod, reqhost, usehttps, csflevel, editedrev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsbeginuploadReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    ondup: ").append(toIndentedString(ondup)).append("\n");
    sb.append("    reqmethod: ").append(toIndentedString(reqmethod)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    editedrev: ").append(toIndentedString(editedrev)).append("\n");
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
