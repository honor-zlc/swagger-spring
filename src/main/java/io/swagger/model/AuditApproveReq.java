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
 * AuditApproveReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditApproveReq   {
  @JsonProperty("applyid")
  private String applyid = null;

  @JsonProperty("result")
  private Boolean result = null;

  @JsonProperty("msg")
  private String msg = null;

  public AuditApproveReq applyid(String applyid) {
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

  public AuditApproveReq result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * true表示通过 false表示拒绝 null表示拒绝
   * @return result
  **/
  @ApiModelProperty(required = true, value = "true表示通过 false表示拒绝 null表示拒绝")
      @NotNull

    public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public AuditApproveReq msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * 审核说明
   * @return msg
  **/
  @ApiModelProperty(required = true, value = "审核说明")
      @NotNull

    public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditApproveReq auditApproveReq = (AuditApproveReq) o;
    return Objects.equals(this.applyid, auditApproveReq.applyid) &&
        Objects.equals(this.result, auditApproveReq.result) &&
        Objects.equals(this.msg, auditApproveReq.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyid, result, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditApproveReq {\n");
    
    sb.append("    applyid: ").append(toIndentedString(applyid)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
