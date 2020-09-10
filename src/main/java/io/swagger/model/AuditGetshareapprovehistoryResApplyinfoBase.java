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
 * AuditGetshareapprovehistoryResApplyinfoBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetshareapprovehistoryResApplyinfoBase   {
  @JsonProperty("approveindex")
  private Long approveindex = null;

  @JsonProperty("auditornames")
  @Valid
  private List<String> auditornames = new ArrayList<String>();

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("docname")
  private String docname = null;

  @JsonProperty("isdir")
  private Boolean isdir = null;

  @JsonProperty("requestdate")
  private Long requestdate = null;

  @JsonProperty("vetoindex")
  private Long vetoindex = null;

  @JsonProperty("apptype")
  private Long apptype = null;

  @JsonProperty("requestername")
  private String requestername = null;

  public AuditGetshareapprovehistoryResApplyinfoBase approveindex(Long approveindex) {
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

  public AuditGetshareapprovehistoryResApplyinfoBase auditornames(List<String> auditornames) {
    this.auditornames = auditornames;
    return this;
  }

  public AuditGetshareapprovehistoryResApplyinfoBase addAuditornamesItem(String auditornamesItem) {
    this.auditornames.add(auditornamesItem);
    return this;
  }

  /**
   * 提交审核时，所有能看到该申请记录的审核员的名称  auditornames[approveindex]表示审核通过的审核员如auditornames[vetoindex]表示否决的审核员  approveindex 和 vetoindex 都为 -1 表示免审核
   * @return auditornames
  **/
  @ApiModelProperty(required = true, value = "提交审核时，所有能看到该申请记录的审核员的名称  auditornames[approveindex]表示审核通过的审核员如auditornames[vetoindex]表示否决的审核员  approveindex 和 vetoindex 都为 -1 表示免审核")
      @NotNull

    public List<String> getAuditornames() {
    return auditornames;
  }

  public void setAuditornames(List<String> auditornames) {
    this.auditornames = auditornames;
  }

  public AuditGetshareapprovehistoryResApplyinfoBase csflevel(Long csflevel) {
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

  public AuditGetshareapprovehistoryResApplyinfoBase docname(String docname) {
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

  public AuditGetshareapprovehistoryResApplyinfoBase isdir(Boolean isdir) {
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

  public AuditGetshareapprovehistoryResApplyinfoBase requestdate(Long requestdate) {
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

  public AuditGetshareapprovehistoryResApplyinfoBase vetoindex(Long vetoindex) {
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

  public AuditGetshareapprovehistoryResApplyinfoBase apptype(Long apptype) {
    this.apptype = apptype;
    return this;
  }

  /**
   * 申请类型  1表示共享申请  2表示外链申请  3表示所有者申请  5更改密级申请  6表示更改继承申请
   * @return apptype
  **/
  @ApiModelProperty(required = true, value = "申请类型  1表示共享申请  2表示外链申请  3表示所有者申请  5更改密级申请  6表示更改继承申请")
      @NotNull

    public Long getApptype() {
    return apptype;
  }

  public void setApptype(Long apptype) {
    this.apptype = apptype;
  }

  public AuditGetshareapprovehistoryResApplyinfoBase requestername(String requestername) {
    this.requestername = requestername;
    return this;
  }

  /**
   * 共享者名称
   * @return requestername
  **/
  @ApiModelProperty(required = true, value = "共享者名称")
      @NotNull

    public String getRequestername() {
    return requestername;
  }

  public void setRequestername(String requestername) {
    this.requestername = requestername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetshareapprovehistoryResApplyinfoBase auditGetshareapprovehistoryResApplyinfoBase = (AuditGetshareapprovehistoryResApplyinfoBase) o;
    return Objects.equals(this.approveindex, auditGetshareapprovehistoryResApplyinfoBase.approveindex) &&
        Objects.equals(this.auditornames, auditGetshareapprovehistoryResApplyinfoBase.auditornames) &&
        Objects.equals(this.csflevel, auditGetshareapprovehistoryResApplyinfoBase.csflevel) &&
        Objects.equals(this.docname, auditGetshareapprovehistoryResApplyinfoBase.docname) &&
        Objects.equals(this.isdir, auditGetshareapprovehistoryResApplyinfoBase.isdir) &&
        Objects.equals(this.requestdate, auditGetshareapprovehistoryResApplyinfoBase.requestdate) &&
        Objects.equals(this.vetoindex, auditGetshareapprovehistoryResApplyinfoBase.vetoindex) &&
        Objects.equals(this.apptype, auditGetshareapprovehistoryResApplyinfoBase.apptype) &&
        Objects.equals(this.requestername, auditGetshareapprovehistoryResApplyinfoBase.requestername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approveindex, auditornames, csflevel, docname, isdir, requestdate, vetoindex, apptype, requestername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapprovehistoryResApplyinfoBase {\n");
    
    sb.append("    approveindex: ").append(toIndentedString(approveindex)).append("\n");
    sb.append("    auditornames: ").append(toIndentedString(auditornames)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    docname: ").append(toIndentedString(docname)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
    sb.append("    requestdate: ").append(toIndentedString(requestdate)).append("\n");
    sb.append("    vetoindex: ").append(toIndentedString(vetoindex)).append("\n");
    sb.append("    apptype: ").append(toIndentedString(apptype)).append("\n");
    sb.append("    requestername: ").append(toIndentedString(requestername)).append("\n");
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
