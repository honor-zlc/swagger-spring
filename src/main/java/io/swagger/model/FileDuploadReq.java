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
 * FileDuploadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileDuploadReq   {
  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  @JsonProperty("crc32")
  private String crc32 = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("md5")
  private String md5 = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  public FileDuploadReq clientMtime(Long clientMtime) {
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

  public FileDuploadReq crc32(String crc32) {
    this.crc32 = crc32;
    return this;
  }

  /**
   * 文件的CRC32校验码，如果为空文件, 此字段为空
   * @return crc32
  **/
  @ApiModelProperty(required = true, value = "文件的CRC32校验码，如果为空文件, 此字段为空")
      @NotNull

    public String getCrc32() {
    return crc32;
  }

  public void setCrc32(String crc32) {
    this.crc32 = crc32;
  }

  public FileDuploadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * gns（全局名字空间）路径，创建或者列举协议返回    说明：如果name不为空，gns为待创建文件的父目录gns；否则为文件的gns。  
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "gns（全局名字空间）路径，创建或者列举协议返回    说明：如果name不为空，gns为待创建文件的父目录gns；否则为文件的gns。  ")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileDuploadReq length(Long length) {
    this.length = length;
    return this;
  }

  /**
   * 整个文件的长度，如果为空文件, 此字段为空
   * @return length
  **/
  @ApiModelProperty(required = true, value = "整个文件的长度，如果为空文件, 此字段为空")
      @NotNull

    public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public FileDuploadReq md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * 文件MD5值，如果为空文件, 此字段为空
   * @return md5
  **/
  @ApiModelProperty(required = true, value = "文件MD5值，如果为空文件, 此字段为空")
      @NotNull

    public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public FileDuploadReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名称，UTF8编码    说明：1、如果为空，在父目录文件下生成版本；2、如果不为空，在父目录下创建文件，同时生成版本  
   * @return name
  **/
  @ApiModelProperty(value = "文件名称，UTF8编码    说明：1、如果为空，在父目录文件下生成版本；2、如果不为空，在父目录下创建文件，同时生成版本  ")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileDuploadReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * 仅当name不为空时才会生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @ApiModelProperty(value = "仅当name不为空时才会生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  ")
  
    public Long getOndup() {
    return ondup;
  }

  public void setOndup(Long ondup) {
    this.ondup = ondup;
  }

  public FileDuploadReq csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级  
   * @return csflevel
  **/
  @ApiModelProperty(value = "文件密级  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级  ")
  
    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDuploadReq fileDuploadReq = (FileDuploadReq) o;
    return Objects.equals(this.clientMtime, fileDuploadReq.clientMtime) &&
        Objects.equals(this.crc32, fileDuploadReq.crc32) &&
        Objects.equals(this.docid, fileDuploadReq.docid) &&
        Objects.equals(this.length, fileDuploadReq.length) &&
        Objects.equals(this.md5, fileDuploadReq.md5) &&
        Objects.equals(this.name, fileDuploadReq.name) &&
        Objects.equals(this.ondup, fileDuploadReq.ondup) &&
        Objects.equals(this.csflevel, fileDuploadReq.csflevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientMtime, crc32, docid, length, md5, name, ondup, csflevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDuploadReq {\n");
    
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    crc32: ").append(toIndentedString(crc32)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ondup: ").append(toIndentedString(ondup)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
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
