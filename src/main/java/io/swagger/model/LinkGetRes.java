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
 * LinkGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkGetRes   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("perm")
  private Long perm = null;

  @JsonProperty("endtime")
  private Long endtime = null;

  @JsonProperty("usrdisplayname")
  private String usrdisplayname = null;

  @JsonProperty("usrloginname")
  private String usrloginname = null;

  @JsonProperty("client_mtime")
  private Integer clientMtime = null;

  @JsonProperty("docid")
  private String docid = null;

  public LinkGetRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkGetRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 文件大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "文件大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LinkGetRes modified(Long modified) {
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

  public LinkGetRes perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 按位存储的权限值（返回的是十进制），获取该值后，需要转化成二级制，检查对应的位码是否被设置。  右数第一位表示该外链可以被预览  右数第二位表示该外链可以被下载  右数第三位表示该外链可以上传文件  例如：返回1表示只能被预览  返回2表示只能被下载  返回4表示只能上传文件  返回3表示可被预览和下载  
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "按位存储的权限值（返回的是十进制），获取该值后，需要转化成二级制，检查对应的位码是否被设置。  右数第一位表示该外链可以被预览  右数第二位表示该外链可以被下载  右数第三位表示该外链可以上传文件  例如：返回1表示只能被预览  返回2表示只能被下载  返回4表示只能上传文件  返回3表示可被预览和下载  ")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public LinkGetRes endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 到期时间，单位：微秒
   * @return endtime
  **/
  @ApiModelProperty(required = true, value = "到期时间，单位：微秒")
      @NotNull

    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public LinkGetRes usrdisplayname(String usrdisplayname) {
    this.usrdisplayname = usrdisplayname;
    return this;
  }

  /**
   * 用户显示名
   * @return usrdisplayname
  **/
  @ApiModelProperty(required = true, value = "用户显示名")
      @NotNull

    public String getUsrdisplayname() {
    return usrdisplayname;
  }

  public void setUsrdisplayname(String usrdisplayname) {
    this.usrdisplayname = usrdisplayname;
  }

  public LinkGetRes usrloginname(String usrloginname) {
    this.usrloginname = usrloginname;
    return this;
  }

  /**
   * 用户登录名
   * @return usrloginname
  **/
  @ApiModelProperty(required = true, value = "用户登录名")
      @NotNull

    public String getUsrloginname() {
    return usrloginname;
  }

  public void setUsrloginname(String usrloginname) {
    this.usrloginname = usrloginname;
  }

  public LinkGetRes clientMtime(Integer clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 客户端设置的文件本地修改时间
   * @return clientMtime
  **/
  @ApiModelProperty(required = true, value = "客户端设置的文件本地修改时间")
      @NotNull

    public Integer getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Integer clientMtime) {
    this.clientMtime = clientMtime;
  }

  public LinkGetRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档ID
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档ID")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGetRes linkGetRes = (LinkGetRes) o;
    return Objects.equals(this.name, linkGetRes.name) &&
        Objects.equals(this.size, linkGetRes.size) &&
        Objects.equals(this.modified, linkGetRes.modified) &&
        Objects.equals(this.perm, linkGetRes.perm) &&
        Objects.equals(this.endtime, linkGetRes.endtime) &&
        Objects.equals(this.usrdisplayname, linkGetRes.usrdisplayname) &&
        Objects.equals(this.usrloginname, linkGetRes.usrloginname) &&
        Objects.equals(this.clientMtime, linkGetRes.clientMtime) &&
        Objects.equals(this.docid, linkGetRes.docid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, modified, perm, endtime, usrdisplayname, usrloginname, clientMtime, docid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGetRes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    usrdisplayname: ").append(toIndentedString(usrdisplayname)).append("\n");
    sb.append("    usrloginname: ").append(toIndentedString(usrloginname)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
