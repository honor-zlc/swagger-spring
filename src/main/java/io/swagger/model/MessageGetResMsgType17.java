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
 * MessageGetResMsgType17
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType17 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("auditmsg")
  private String auditmsg = null;

  @JsonProperty("auditorname")
  private String auditorname = null;

  @JsonProperty("auditresult")
  private Boolean auditresult = null;

  @JsonProperty("docaudittype")
  private Long docaudittype = null;

  @JsonProperty("processname")
  private String processname = null;

  public MessageGetResMsgType17 auditmsg(String auditmsg) {
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

  public MessageGetResMsgType17 auditorname(String auditorname) {
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

  public MessageGetResMsgType17 auditresult(Boolean auditresult) {
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

  public MessageGetResMsgType17 docaudittype(Long docaudittype) {
    this.docaudittype = docaudittype;
    return this;
  }

  /**
   * 审核模式
   * @return docaudittype
  **/
  @ApiModelProperty(required = true, value = "审核模式")
      @NotNull

    public Long getDocaudittype() {
    return docaudittype;
  }

  public void setDocaudittype(Long docaudittype) {
    this.docaudittype = docaudittype;
  }

  public MessageGetResMsgType17 processname(String processname) {
    this.processname = processname;
    return this;
  }

  /**
   * 文档流程名称
   * @return processname
  **/
  @ApiModelProperty(required = true, value = "文档流程名称")
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
    MessageGetResMsgType17 messageGetResMsgType17 = (MessageGetResMsgType17) o;
    return Objects.equals(this.auditmsg, messageGetResMsgType17.auditmsg) &&
        Objects.equals(this.auditorname, messageGetResMsgType17.auditorname) &&
        Objects.equals(this.auditresult, messageGetResMsgType17.auditresult) &&
        Objects.equals(this.docaudittype, messageGetResMsgType17.docaudittype) &&
        Objects.equals(this.processname, messageGetResMsgType17.processname) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditmsg, auditorname, auditresult, docaudittype, processname, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType17 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
    sb.append("    auditorname: ").append(toIndentedString(auditorname)).append("\n");
    sb.append("    auditresult: ").append(toIndentedString(auditresult)).append("\n");
    sb.append("    docaudittype: ").append(toIndentedString(docaudittype)).append("\n");
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
