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
 * MessageGetResMsgType12
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType12 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("auditorname")
  private String auditorname = null;

  @JsonProperty("auditresult")
  private Boolean auditresult = null;

  @JsonProperty("auditmsg")
  private String auditmsg = null;

  public MessageGetResMsgType12 auditorname(String auditorname) {
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

  public MessageGetResMsgType12 auditresult(Boolean auditresult) {
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

  public MessageGetResMsgType12 auditmsg(String auditmsg) {
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
    MessageGetResMsgType12 messageGetResMsgType12 = (MessageGetResMsgType12) o;
    return Objects.equals(this.auditorname, messageGetResMsgType12.auditorname) &&
        Objects.equals(this.auditresult, messageGetResMsgType12.auditresult) &&
        Objects.equals(this.auditmsg, messageGetResMsgType12.auditmsg) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditorname, auditresult, auditmsg, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType12 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
