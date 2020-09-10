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
 * AuditGetdocprocessesResProcessinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetdocprocessesResProcessinfo   {
  @JsonProperty("auditornames")
  @Valid
  private List<String> auditornames = new ArrayList<String>();

  @JsonProperty("audittype")
  private Long audittype = null;

  @JsonProperty("destpath")
  private String destpath = null;

  @JsonProperty("processid")
  private String processid = null;

  @JsonProperty("processname")
  private String processname = null;

  public AuditGetdocprocessesResProcessinfo auditornames(List<String> auditornames) {
    this.auditornames = auditornames;
    return this;
  }

  public AuditGetdocprocessesResProcessinfo addAuditornamesItem(String auditornamesItem) {
    this.auditornames.add(auditornamesItem);
    return this;
  }

  /**
   * 所有审核员名称列表
   * @return auditornames
  **/
  @ApiModelProperty(required = true, value = "所有审核员名称列表")
      @NotNull

    public List<String> getAuditornames() {
    return auditornames;
  }

  public void setAuditornames(List<String> auditornames) {
    this.auditornames = auditornames;
  }

  public AuditGetdocprocessesResProcessinfo audittype(Long audittype) {
    this.audittype = audittype;
    return this;
  }

  /**
   * 审核模式  1：同级审核  2：汇签审核  3：逐级审核
   * @return audittype
  **/
  @ApiModelProperty(required = true, value = "审核模式  1：同级审核  2：汇签审核  3：逐级审核")
      @NotNull

    public Long getAudittype() {
    return audittype;
  }

  public void setAudittype(Long audittype) {
    this.audittype = audittype;
  }

  public AuditGetdocprocessesResProcessinfo destpath(String destpath) {
    this.destpath = destpath;
    return this;
  }

  /**
   * 发布目的路径
   * @return destpath
  **/
  @ApiModelProperty(required = true, value = "发布目的路径")
      @NotNull

    public String getDestpath() {
    return destpath;
  }

  public void setDestpath(String destpath) {
    this.destpath = destpath;
  }

  public AuditGetdocprocessesResProcessinfo processid(String processid) {
    this.processid = processid;
    return this;
  }

  /**
   * 流程id
   * @return processid
  **/
  @ApiModelProperty(required = true, value = "流程id")
      @NotNull

    public String getProcessid() {
    return processid;
  }

  public void setProcessid(String processid) {
    this.processid = processid;
  }

  public AuditGetdocprocessesResProcessinfo processname(String processname) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetdocprocessesResProcessinfo auditGetdocprocessesResProcessinfo = (AuditGetdocprocessesResProcessinfo) o;
    return Objects.equals(this.auditornames, auditGetdocprocessesResProcessinfo.auditornames) &&
        Objects.equals(this.audittype, auditGetdocprocessesResProcessinfo.audittype) &&
        Objects.equals(this.destpath, auditGetdocprocessesResProcessinfo.destpath) &&
        Objects.equals(this.processid, auditGetdocprocessesResProcessinfo.processid) &&
        Objects.equals(this.processname, auditGetdocprocessesResProcessinfo.processname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditornames, audittype, destpath, processid, processname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetdocprocessesResProcessinfo {\n");
    
    sb.append("    auditornames: ").append(toIndentedString(auditornames)).append("\n");
    sb.append("    audittype: ").append(toIndentedString(audittype)).append("\n");
    sb.append("    destpath: ").append(toIndentedString(destpath)).append("\n");
    sb.append("    processid: ").append(toIndentedString(processid)).append("\n");
    sb.append("    processname: ").append(toIndentedString(processname)).append("\n");
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
