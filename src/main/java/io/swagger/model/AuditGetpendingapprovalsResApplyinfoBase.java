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
 * AuditGetpendingapprovalsResApplyinfoBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetpendingapprovalsResApplyinfoBase   {
  @JsonProperty("applyid")
  private String applyid = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("docname")
  private String docname = null;

  @JsonProperty("apptype")
  private Long apptype = null;

  @JsonProperty("isdir")
  private Boolean isdir = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("sharername")
  private String sharername = null;

  @JsonProperty("createdate")
  private Long createdate = null;

  public AuditGetpendingapprovalsResApplyinfoBase applyid(String applyid) {
    this.applyid = applyid;
    return this;
  }

  /**
   * 申请记录id
   * @return applyid
  **/
  @ApiModelProperty(required = true, value = "申请记录id")
      @NotNull

    public String getApplyid() {
    return applyid;
  }

  public void setApplyid(String applyid) {
    this.applyid = applyid;
  }

  public AuditGetpendingapprovalsResApplyinfoBase docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public AuditGetpendingapprovalsResApplyinfoBase docname(String docname) {
    this.docname = docname;
    return this;
  }

  /**
   * 文档名称
   * @return docname
  **/
  @ApiModelProperty(required = true, value = "文档名称")
      @NotNull

    public String getDocname() {
    return docname;
  }

  public void setDocname(String docname) {
    this.docname = docname;
  }

  public AuditGetpendingapprovalsResApplyinfoBase apptype(Long apptype) {
    this.apptype = apptype;
    return this;
  }

  /**
   * 申请类型  1表示共享申请  2表示外链申请  3表示所有者申请  5表示更改密级申请  6 表示更改继承申请
   * @return apptype
  **/
  @ApiModelProperty(required = true, value = "申请类型  1表示共享申请  2表示外链申请  3表示所有者申请  5表示更改密级申请  6 表示更改继承申请")
      @NotNull

    public Long getApptype() {
    return apptype;
  }

  public void setApptype(Long apptype) {
    this.apptype = apptype;
  }

  public AuditGetpendingapprovalsResApplyinfoBase isdir(Boolean isdir) {
    this.isdir = isdir;
    return this;
  }

  /**
   * 是否为文件夹
   * @return isdir
  **/
  @ApiModelProperty(required = true, value = "是否为文件夹")
      @NotNull

    public Boolean isIsdir() {
    return isdir;
  }

  public void setIsdir(Boolean isdir) {
    this.isdir = isdir;
  }

  public AuditGetpendingapprovalsResApplyinfoBase csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级,5~15，如果是文件夹，则为0
   * @return csflevel
  **/
  @ApiModelProperty(required = true, value = "文件密级,5~15，如果是文件夹，则为0")
      @NotNull

    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public AuditGetpendingapprovalsResApplyinfoBase sharername(String sharername) {
    this.sharername = sharername;
    return this;
  }

  /**
   * 共享者名称
   * @return sharername
  **/
  @ApiModelProperty(required = true, value = "共享者名称")
      @NotNull

    public String getSharername() {
    return sharername;
  }

  public void setSharername(String sharername) {
    this.sharername = sharername;
  }

  public AuditGetpendingapprovalsResApplyinfoBase createdate(Long createdate) {
    this.createdate = createdate;
    return this;
  }

  /**
   * 申请时间（微秒时间戳）
   * @return createdate
  **/
  @ApiModelProperty(required = true, value = "申请时间（微秒时间戳）")
      @NotNull

    public Long getCreatedate() {
    return createdate;
  }

  public void setCreatedate(Long createdate) {
    this.createdate = createdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetpendingapprovalsResApplyinfoBase auditGetpendingapprovalsResApplyinfoBase = (AuditGetpendingapprovalsResApplyinfoBase) o;
    return Objects.equals(this.applyid, auditGetpendingapprovalsResApplyinfoBase.applyid) &&
        Objects.equals(this.docid, auditGetpendingapprovalsResApplyinfoBase.docid) &&
        Objects.equals(this.docname, auditGetpendingapprovalsResApplyinfoBase.docname) &&
        Objects.equals(this.apptype, auditGetpendingapprovalsResApplyinfoBase.apptype) &&
        Objects.equals(this.isdir, auditGetpendingapprovalsResApplyinfoBase.isdir) &&
        Objects.equals(this.csflevel, auditGetpendingapprovalsResApplyinfoBase.csflevel) &&
        Objects.equals(this.sharername, auditGetpendingapprovalsResApplyinfoBase.sharername) &&
        Objects.equals(this.createdate, auditGetpendingapprovalsResApplyinfoBase.createdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyid, docid, docname, apptype, isdir, csflevel, sharername, createdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetpendingapprovalsResApplyinfoBase {\n");
    
    sb.append("    applyid: ").append(toIndentedString(applyid)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    docname: ").append(toIndentedString(docname)).append("\n");
    sb.append("    apptype: ").append(toIndentedString(apptype)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    sharername: ").append(toIndentedString(sharername)).append("\n");
    sb.append("    createdate: ").append(toIndentedString(createdate)).append("\n");
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
