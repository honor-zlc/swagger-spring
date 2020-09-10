package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditGetdocapprovalsResApplyinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetdocapprovalsResApplyinfo   {
  @JsonProperty("applyid")
  private String applyid = null;

  @JsonProperty("applymsg")
  private String applymsg = null;

  @JsonProperty("auditornames")
  @Valid
  private List<String> auditornames = new ArrayList<String>();

  @JsonProperty("auditprogress")
  private Long auditprogress = null;

  @JsonProperty("audittype")
  private Long audittype = null;

  @JsonProperty("createdate")
  private Long createdate = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("docname")
  private String docname = null;

  @JsonProperty("isdir")
  private Boolean isdir = null;

  @JsonProperty("processname")
  private String processname = null;

  @JsonProperty("creatorname")
  private String creatorname = null;

  public AuditGetdocapprovalsResApplyinfo applyid(String applyid) {
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

  public AuditGetdocapprovalsResApplyinfo applymsg(String applymsg) {
    this.applymsg = applymsg;
    return this;
  }

  /**
   * 发起流程时的理由
   * @return applymsg
  **/
  @ApiModelProperty(required = true, value = "发起流程时的理由")
      @NotNull

    public String getApplymsg() {
    return applymsg;
  }

  public void setApplymsg(String applymsg) {
    this.applymsg = applymsg;
  }

  public AuditGetdocapprovalsResApplyinfo auditornames(List<String> auditornames) {
    this.auditornames = auditornames;
    return this;
  }

  public AuditGetdocapprovalsResApplyinfo addAuditornamesItem(String auditornamesItem) {
    this.auditornames.add(auditornamesItem);
    return this;
  }

  /**
   * 审核员的名称  [0, auditprogress）表示已审核过的名称  [auditprogress, ]表示尚未审核过的名称
   * @return auditornames
  **/
  @ApiModelProperty(required = true, value = "审核员的名称  [0, auditprogress）表示已审核过的名称  [auditprogress, ]表示尚未审核过的名称")
      @NotNull

    public List<String> getAuditornames() {
    return auditornames;
  }

  public void setAuditornames(List<String> auditornames) {
    this.auditornames = auditornames;
  }

  public AuditGetdocapprovalsResApplyinfo auditprogress(Long auditprogress) {
    this.auditprogress = auditprogress;
    return this;
  }

  /**
   * 审核进度，表示当前审核员在auditornames中的位置  同级审核，该字段为0  汇签审核，逐级审核，参考auditornames
   * @return auditprogress
  **/
  @ApiModelProperty(required = true, value = "审核进度，表示当前审核员在auditornames中的位置  同级审核，该字段为0  汇签审核，逐级审核，参考auditornames")
      @NotNull

    public Long getAuditprogress() {
    return auditprogress;
  }

  public void setAuditprogress(Long auditprogress) {
    this.auditprogress = auditprogress;
  }

  public AuditGetdocapprovalsResApplyinfo audittype(Long audittype) {
    this.audittype = audittype;
    return this;
  }

  /**
   * 审核模式  1表示同级审核  2表示汇签审核  3表示逐级审核
   * @return audittype
  **/
  @ApiModelProperty(required = true, value = "审核模式  1表示同级审核  2表示汇签审核  3表示逐级审核")
      @NotNull

    public Long getAudittype() {
    return audittype;
  }

  public void setAudittype(Long audittype) {
    this.audittype = audittype;
  }

  public AuditGetdocapprovalsResApplyinfo createdate(Long createdate) {
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

  public AuditGetdocapprovalsResApplyinfo csflevel(Long csflevel) {
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

  public AuditGetdocapprovalsResApplyinfo docid(String docid) {
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

  public AuditGetdocapprovalsResApplyinfo docname(String docname) {
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

  public AuditGetdocapprovalsResApplyinfo isdir(Boolean isdir) {
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

  public AuditGetdocapprovalsResApplyinfo processname(String processname) {
    this.processname = processname;
    return this;
  }

  /**
   * 流程名称
   * @return processname
  **/
  @ApiModelProperty(required = true, value = "流程名称")
      @NotNull

    public String getProcessname() {
    return processname;
  }

  public void setProcessname(String processname) {
    this.processname = processname;
  }

  public AuditGetdocapprovalsResApplyinfo creatorname(String creatorname) {
    this.creatorname = creatorname;
    return this;
  }

  /**
   * 申请者名称
   * @return creatorname
  **/
  @ApiModelProperty(required = true, value = "申请者名称")
      @NotNull

    public String getCreatorname() {
    return creatorname;
  }

  public void setCreatorname(String creatorname) {
    this.creatorname = creatorname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetdocapprovalsResApplyinfo auditGetdocapprovalsResApplyinfo = (AuditGetdocapprovalsResApplyinfo) o;
    return Objects.equals(this.applyid, auditGetdocapprovalsResApplyinfo.applyid) &&
        Objects.equals(this.applymsg, auditGetdocapprovalsResApplyinfo.applymsg) &&
        Objects.equals(this.auditornames, auditGetdocapprovalsResApplyinfo.auditornames) &&
        Objects.equals(this.auditprogress, auditGetdocapprovalsResApplyinfo.auditprogress) &&
        Objects.equals(this.audittype, auditGetdocapprovalsResApplyinfo.audittype) &&
        Objects.equals(this.createdate, auditGetdocapprovalsResApplyinfo.createdate) &&
        Objects.equals(this.csflevel, auditGetdocapprovalsResApplyinfo.csflevel) &&
        Objects.equals(this.docid, auditGetdocapprovalsResApplyinfo.docid) &&
        Objects.equals(this.docname, auditGetdocapprovalsResApplyinfo.docname) &&
        Objects.equals(this.isdir, auditGetdocapprovalsResApplyinfo.isdir) &&
        Objects.equals(this.processname, auditGetdocapprovalsResApplyinfo.processname) &&
        Objects.equals(this.creatorname, auditGetdocapprovalsResApplyinfo.creatorname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyid, applymsg, auditornames, auditprogress, audittype, createdate, csflevel, docid, docname, isdir, processname, creatorname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetdocapprovalsResApplyinfo {\n");
    
    sb.append("    applyid: ").append(toIndentedString(applyid)).append("\n");
    sb.append("    applymsg: ").append(toIndentedString(applymsg)).append("\n");
    sb.append("    auditornames: ").append(toIndentedString(auditornames)).append("\n");
    sb.append("    auditprogress: ").append(toIndentedString(auditprogress)).append("\n");
    sb.append("    audittype: ").append(toIndentedString(audittype)).append("\n");
    sb.append("    createdate: ").append(toIndentedString(createdate)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    docname: ").append(toIndentedString(docname)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
    sb.append("    processname: ").append(toIndentedString(processname)).append("\n");
    sb.append("    creatorname: ").append(toIndentedString(creatorname)).append("\n");
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
