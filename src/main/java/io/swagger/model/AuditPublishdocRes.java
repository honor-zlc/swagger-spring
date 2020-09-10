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
 * AuditPublishdocRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditPublishdocRes   {
  @JsonProperty("applyid")
  private String applyid = null;

  @JsonProperty("audittype")
  private Long audittype = null;

  @JsonProperty("result")
  private String result = null;

  public AuditPublishdocRes applyid(String applyid) {
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

  public AuditPublishdocRes audittype(Long audittype) {
    this.audittype = audittype;
    return this;
  }

  /**
   * 流程审核模式
   * @return audittype
  **/
  @ApiModelProperty(required = true, value = "流程审核模式")
      @NotNull

    public Long getAudittype() {
    return audittype;
  }

  public void setAudittype(Long audittype) {
    this.audittype = audittype;
  }

  public AuditPublishdocRes result(String result) {
    this.result = result;
    return this;
  }

  /**
   * 操作结果
   * @return result
  **/
  @ApiModelProperty(required = true, value = "操作结果")
      @NotNull

    public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditPublishdocRes auditPublishdocRes = (AuditPublishdocRes) o;
    return Objects.equals(this.applyid, auditPublishdocRes.applyid) &&
        Objects.equals(this.audittype, auditPublishdocRes.audittype) &&
        Objects.equals(this.result, auditPublishdocRes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyid, audittype, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditPublishdocRes {\n");
    
    sb.append("    applyid: ").append(toIndentedString(applyid)).append("\n");
    sb.append("    audittype: ").append(toIndentedString(audittype)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
