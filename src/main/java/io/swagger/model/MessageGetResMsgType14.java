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
 * MessageGetResMsgType14
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType14 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("perm")
  private Long perm = null;

  @JsonProperty("end")
  private Long end = null;

  @JsonProperty("auditorname")
  private String auditorname = null;

  @JsonProperty("auditresult")
  private Boolean auditresult = null;

  @JsonProperty("auditmsg")
  private String auditmsg = null;

  public MessageGetResMsgType14 perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 外链权限，参考外链
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "外链权限，参考外链")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public MessageGetResMsgType14 end(Long end) {
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

  public MessageGetResMsgType14 auditorname(String auditorname) {
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

  public MessageGetResMsgType14 auditresult(Boolean auditresult) {
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

  public MessageGetResMsgType14 auditmsg(String auditmsg) {
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
    MessageGetResMsgType14 messageGetResMsgType14 = (MessageGetResMsgType14) o;
    return Objects.equals(this.perm, messageGetResMsgType14.perm) &&
        Objects.equals(this.end, messageGetResMsgType14.end) &&
        Objects.equals(this.auditorname, messageGetResMsgType14.auditorname) &&
        Objects.equals(this.auditresult, messageGetResMsgType14.auditresult) &&
        Objects.equals(this.auditmsg, messageGetResMsgType14.auditmsg) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perm, end, auditorname, auditresult, auditmsg, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType14 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
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
