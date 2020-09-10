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
 * AuditGetapplyhistoryResApplyinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetapplyhistoryResApplyinfo   {
  @JsonProperty("approveindex")
  private Long approveindex = null;

  @JsonProperty("auditornames")
  @Valid
  private List<String> auditornames = new ArrayList<String>();

  @JsonProperty("audittype")
  private Long audittype = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("docname")
  private String docname = null;

  @JsonProperty("isdir")
  private Boolean isdir = null;

  @JsonProperty("processname")
  private String processname = null;

  @JsonProperty("requestdate")
  private Long requestdate = null;

  @JsonProperty("vetoindex")
  private Long vetoindex = null;

  public AuditGetapplyhistoryResApplyinfo approveindex(Long approveindex) {
    this.approveindex = approveindex;
    return this;
  }

  /**
   * 结合auditorname,小于等于该值的表示审批通过的审核员，从0开始
   * @return approveindex
  **/
  @ApiModelProperty(required = true, value = "结合auditorname,小于等于该值的表示审批通过的审核员，从0开始")
      @NotNull

    public Long getApproveindex() {
    return approveindex;
  }

  public void setApproveindex(Long approveindex) {
    this.approveindex = approveindex;
  }

  public AuditGetapplyhistoryResApplyinfo auditornames(List<String> auditornames) {
    this.auditornames = auditornames;
    return this;
  }

  public AuditGetapplyhistoryResApplyinfo addAuditornamesItem(String auditornamesItem) {
    this.auditornames.add(auditornamesItem);
    return this;
  }

  /**
   * 提交审核时，所有能看到该申请记录的审核员的名称  [0, approveindex]表示审核通过的审核员列表，-1表示没有审核员通过  如果vetoindex不为-1，则auditornames[vetoindex]表示否决的审核员  剩下的为未参与审核的
   * @return auditornames
  **/
  @ApiModelProperty(required = true, value = "提交审核时，所有能看到该申请记录的审核员的名称  [0, approveindex]表示审核通过的审核员列表，-1表示没有审核员通过  如果vetoindex不为-1，则auditornames[vetoindex]表示否决的审核员  剩下的为未参与审核的")
      @NotNull

    public List<String> getAuditornames() {
    return auditornames;
  }

  public void setAuditornames(List<String> auditornames) {
    this.auditornames = auditornames;
  }

  public AuditGetapplyhistoryResApplyinfo audittype(Long audittype) {
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

  public AuditGetapplyhistoryResApplyinfo csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级，5~15，如果是文件夹，则为0
   * @return csflevel
  **/
  @ApiModelProperty(required = true, value = "文件密级，5~15，如果是文件夹，则为0")
      @NotNull

    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public AuditGetapplyhistoryResApplyinfo docname(String docname) {
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

  public AuditGetapplyhistoryResApplyinfo isdir(Boolean isdir) {
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

  public AuditGetapplyhistoryResApplyinfo processname(String processname) {
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

  public AuditGetapplyhistoryResApplyinfo requestdate(Long requestdate) {
    this.requestdate = requestdate;
    return this;
  }

  /**
   * 申请时间（微秒时间戳）
   * @return requestdate
  **/
  @ApiModelProperty(required = true, value = "申请时间（微秒时间戳）")
      @NotNull

    public Long getRequestdate() {
    return requestdate;
  }

  public void setRequestdate(Long requestdate) {
    this.requestdate = requestdate;
  }

  public AuditGetapplyhistoryResApplyinfo vetoindex(Long vetoindex) {
    this.vetoindex = vetoindex;
    return this;
  }

  /**
   * 结合auditorname，该位置表示否决的人在auditornames中的位置，从0开始，  -1表示没有人否决
   * @return vetoindex
  **/
  @ApiModelProperty(required = true, value = "结合auditorname，该位置表示否决的人在auditornames中的位置，从0开始，  -1表示没有人否决")
      @NotNull

    public Long getVetoindex() {
    return vetoindex;
  }

  public void setVetoindex(Long vetoindex) {
    this.vetoindex = vetoindex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetapplyhistoryResApplyinfo auditGetapplyhistoryResApplyinfo = (AuditGetapplyhistoryResApplyinfo) o;
    return Objects.equals(this.approveindex, auditGetapplyhistoryResApplyinfo.approveindex) &&
        Objects.equals(this.auditornames, auditGetapplyhistoryResApplyinfo.auditornames) &&
        Objects.equals(this.audittype, auditGetapplyhistoryResApplyinfo.audittype) &&
        Objects.equals(this.csflevel, auditGetapplyhistoryResApplyinfo.csflevel) &&
        Objects.equals(this.docname, auditGetapplyhistoryResApplyinfo.docname) &&
        Objects.equals(this.isdir, auditGetapplyhistoryResApplyinfo.isdir) &&
        Objects.equals(this.processname, auditGetapplyhistoryResApplyinfo.processname) &&
        Objects.equals(this.requestdate, auditGetapplyhistoryResApplyinfo.requestdate) &&
        Objects.equals(this.vetoindex, auditGetapplyhistoryResApplyinfo.vetoindex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approveindex, auditornames, audittype, csflevel, docname, isdir, processname, requestdate, vetoindex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetapplyhistoryResApplyinfo {\n");
    
    sb.append("    approveindex: ").append(toIndentedString(approveindex)).append("\n");
    sb.append("    auditornames: ").append(toIndentedString(auditornames)).append("\n");
    sb.append("    audittype: ").append(toIndentedString(audittype)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    docname: ").append(toIndentedString(docname)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
    sb.append("    processname: ").append(toIndentedString(processname)).append("\n");
    sb.append("    requestdate: ").append(toIndentedString(requestdate)).append("\n");
    sb.append("    vetoindex: ").append(toIndentedString(vetoindex)).append("\n");
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
