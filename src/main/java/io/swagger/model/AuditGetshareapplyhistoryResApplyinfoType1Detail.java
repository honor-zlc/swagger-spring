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
 * 具体的申请信息，根据apptype，所包含的字段不同
 */
@ApiModel(description = "具体的申请信息，根据apptype，所包含的字段不同")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetshareapplyhistoryResApplyinfoType1Detail   {
  @JsonProperty("accessorid")
  private String accessorid = null;

  @JsonProperty("accessorname")
  private String accessorname = null;

  @JsonProperty("accessortype")
  private Long accessortype = null;

  @JsonProperty("allowvalue")
  private Long allowvalue = null;

  @JsonProperty("auditmsg")
  private String auditmsg = null;

  @JsonProperty("denyvalue")
  private Long denyvalue = null;

  @JsonProperty("endtime")
  private Long endtime = null;

  @JsonProperty("optype")
  private Long optype = null;

  public AuditGetshareapplyhistoryResApplyinfoType1Detail accessorid(String accessorid) {
    this.accessorid = accessorid;
    return this;
  }

  /**
   * 访问者id
   * @return accessorid
  **/
  @ApiModelProperty(required = true, value = "访问者id")
      @NotNull

    public String getAccessorid() {
    return accessorid;
  }

  public void setAccessorid(String accessorid) {
    this.accessorid = accessorid;
  }

  public AuditGetshareapplyhistoryResApplyinfoType1Detail accessorname(String accessorname) {
    this.accessorname = accessorname;
    return this;
  }

  /**
   * 访问者名称
   * @return accessorname
  **/
  @ApiModelProperty(required = true, value = "访问者名称")
      @NotNull

    public String getAccessorname() {
    return accessorname;
  }

  public void setAccessorname(String accessorname) {
    this.accessorname = accessorname;
  }

  public AuditGetshareapplyhistoryResApplyinfoType1Detail accessortype(Long accessortype) {
    this.accessortype = accessortype;
    return this;
  }

  /**
   * 访问者类型
   * @return accessortype
  **/
  @ApiModelProperty(required = true, value = "访问者类型")
      @NotNull

    public Long getAccessortype() {
    return accessortype;
  }

  public void setAccessortype(Long accessortype) {
    this.accessortype = accessortype;
  }

  public AuditGetshareapplyhistoryResApplyinfoType1Detail allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

  /**
   * 允许权限值
   * @return allowvalue
  **/
  @ApiModelProperty(required = true, value = "允许权限值")
      @NotNull

    public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public AuditGetshareapplyhistoryResApplyinfoType1Detail auditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
    return this;
  }

  /**
   * 审核说明
   * @return auditmsg
  **/
  @ApiModelProperty(required = true, value = "审核说明")
      @NotNull

    public String getAuditmsg() {
    return auditmsg;
  }

  public void setAuditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
  }

  public AuditGetshareapplyhistoryResApplyinfoType1Detail denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

  /**
   * 拒绝的权限值
   * @return denyvalue
  **/
  @ApiModelProperty(required = true, value = "拒绝的权限值")
      @NotNull

    public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }

  public AuditGetshareapplyhistoryResApplyinfoType1Detail endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 截止时间
   * @return endtime
  **/
  @ApiModelProperty(required = true, value = "截止时间")
      @NotNull

    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public AuditGetshareapplyhistoryResApplyinfoType1Detail optype(Long optype) {
    this.optype = optype;
    return this;
  }

  /**
   * 权限操作类型  1表示新增  2表示编辑  3表示删除
   * @return optype
  **/
  @ApiModelProperty(required = true, value = "权限操作类型  1表示新增  2表示编辑  3表示删除")
      @NotNull

    public Long getOptype() {
    return optype;
  }

  public void setOptype(Long optype) {
    this.optype = optype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetshareapplyhistoryResApplyinfoType1Detail auditGetshareapplyhistoryResApplyinfoType1Detail = (AuditGetshareapplyhistoryResApplyinfoType1Detail) o;
    return Objects.equals(this.accessorid, auditGetshareapplyhistoryResApplyinfoType1Detail.accessorid) &&
        Objects.equals(this.accessorname, auditGetshareapplyhistoryResApplyinfoType1Detail.accessorname) &&
        Objects.equals(this.accessortype, auditGetshareapplyhistoryResApplyinfoType1Detail.accessortype) &&
        Objects.equals(this.allowvalue, auditGetshareapplyhistoryResApplyinfoType1Detail.allowvalue) &&
        Objects.equals(this.auditmsg, auditGetshareapplyhistoryResApplyinfoType1Detail.auditmsg) &&
        Objects.equals(this.denyvalue, auditGetshareapplyhistoryResApplyinfoType1Detail.denyvalue) &&
        Objects.equals(this.endtime, auditGetshareapplyhistoryResApplyinfoType1Detail.endtime) &&
        Objects.equals(this.optype, auditGetshareapplyhistoryResApplyinfoType1Detail.optype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorid, accessorname, accessortype, allowvalue, auditmsg, denyvalue, endtime, optype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapplyhistoryResApplyinfoType1Detail {\n");
    
    sb.append("    accessorid: ").append(toIndentedString(accessorid)).append("\n");
    sb.append("    accessorname: ").append(toIndentedString(accessorname)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    optype: ").append(toIndentedString(optype)).append("\n");
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
