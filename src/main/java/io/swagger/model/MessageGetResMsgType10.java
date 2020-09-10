package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MessageGetResMsgBase;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageGetResMsgType10
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType10 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("allowvalue")
  private Long allowvalue = null;

  @JsonProperty("denyvalue")
  private Long denyvalue = null;

  @JsonProperty("end")
  private Long end = null;

  @JsonProperty("auditorname")
  private String auditorname = null;

  @JsonProperty("auditresult")
  private Boolean auditresult = null;

  @JsonProperty("auditmsg")
  private String auditmsg = null;

  public MessageGetResMsgType10 allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

  /**
   * 允许的权限值，按bit为存储，参考权限获取
   * @return allowvalue
  **/
  @ApiModelProperty(required = true, value = "允许的权限值，按bit为存储，参考权限获取")
      @NotNull

    public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public MessageGetResMsgType10 denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

  /**
   * 拒绝的权限值，按bit为存储，参考权限获取
   * @return denyvalue
  **/
  @ApiModelProperty(required = true, value = "拒绝的权限值，按bit为存储，参考权限获取")
      @NotNull

    public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }

  public MessageGetResMsgType10 end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * 有效到期时间 (unix utc 精确到微秒)  -1 无限期
   * @return end
  **/
  @ApiModelProperty(required = true, value = "有效到期时间 (unix utc 精确到微秒)  -1 无限期")
      @NotNull

    public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public MessageGetResMsgType10 auditorname(String auditorname) {
    this.auditorname = auditorname;
    return this;
  }

  /**
   * 审核员名字
   * @return auditorname
  **/
  @ApiModelProperty(required = true, value = "审核员名字")
      @NotNull

    public String getAuditorname() {
    return auditorname;
  }

  public void setAuditorname(String auditorname) {
    this.auditorname = auditorname;
  }

  public MessageGetResMsgType10 auditresult(Boolean auditresult) {
    this.auditresult = auditresult;
    return this;
  }

  /**
   * 审核结果 true表示通过 false表示拒绝
   * @return auditresult
  **/
  @ApiModelProperty(required = true, value = "审核结果 true表示通过 false表示拒绝")
      @NotNull

    public Boolean isAuditresult() {
    return auditresult;
  }

  public void setAuditresult(Boolean auditresult) {
    this.auditresult = auditresult;
  }

  public MessageGetResMsgType10 auditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
    return this;
  }

  /**
   * 审核意见
   * @return auditmsg
  **/
  @ApiModelProperty(required = true, value = "审核意见")
      @NotNull

    public String getAuditmsg() {
    return auditmsg;
  }

  public void setAuditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType10 messageGetResMsgType10 = (MessageGetResMsgType10) o;
    return Objects.equals(this.allowvalue, messageGetResMsgType10.allowvalue) &&
        Objects.equals(this.denyvalue, messageGetResMsgType10.denyvalue) &&
        Objects.equals(this.end, messageGetResMsgType10.end) &&
        Objects.equals(this.auditorname, messageGetResMsgType10.auditorname) &&
        Objects.equals(this.auditresult, messageGetResMsgType10.auditresult) &&
        Objects.equals(this.auditmsg, messageGetResMsgType10.auditmsg) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowvalue, denyvalue, end, auditorname, auditresult, auditmsg, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType10 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    auditorname: ").append(toIndentedString(auditorname)).append("\n");
    sb.append("    auditresult: ").append(toIndentedString(auditresult)).append("\n");
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
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
