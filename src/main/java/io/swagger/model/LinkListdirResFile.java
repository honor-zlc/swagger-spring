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
 * LinkListdirResFile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkListdirResFile   {
  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("modified")
  private Long modified = null;

  public LinkListdirResFile clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 如果是文件，返回由客户端设置的文件本地修改时间  若未设置，返回modified的值  
   * @return clientMtime
  **/
  @ApiModelProperty(required = true, value = "如果是文件，返回由客户端设置的文件本地修改时间  若未设置，返回modified的值  ")
      @NotNull

    public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public LinkListdirResFile docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 目录中文件/目录的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "目录中文件/目录的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkListdirResFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 目录中文件/目录的名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "目录中文件/目录的名称，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkListdirResFile rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 目录中文件版本号或目录数据变化标识
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "目录中文件版本号或目录数据变化标识")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public LinkListdirResFile size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 目录中文件的大小，目录大小为-1
   * @return size
  **/
  @ApiModelProperty(required = true, value = "目录中文件的大小，目录大小为-1")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LinkListdirResFile modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkListdirResFile linkListdirResFile = (LinkListdirResFile) o;
    return Objects.equals(this.clientMtime, linkListdirResFile.clientMtime) &&
        Objects.equals(this.docid, linkListdirResFile.docid) &&
        Objects.equals(this.name, linkListdirResFile.name) &&
        Objects.equals(this.rev, linkListdirResFile.rev) &&
        Objects.equals(this.size, linkListdirResFile.size) &&
        Objects.equals(this.modified, linkListdirResFile.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientMtime, docid, name, rev, size, modified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkListdirResFile {\n");
    
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
