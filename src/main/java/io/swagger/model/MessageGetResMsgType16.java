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
 * MessageGetResMsgType16
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType16 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("auditmsg")
  private String auditmsg = null;

  @JsonProperty("auditorname")
  private String auditorname = null;

  @JsonProperty("auditresult")
  private Boolean auditresult = null;

  @JsonProperty("docaudittype")
  private Long docaudittype = null;

  @JsonProperty("nextauditor")
  private String nextauditor = null;

  @JsonProperty("nextlevel")
  private Long nextlevel = null;

  @JsonProperty("processname")
  private String processname = null;

  public MessageGetResMsgType16 auditmsg(String auditmsg) {
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

  public MessageGetResMsgType16 auditorname(String auditorname) {
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

  public MessageGetResMsgType16 auditresult(Boolean auditresult) {
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

  public MessageGetResMsgType16 docaudittype(Long docaudittype) {
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

  public MessageGetResMsgType16 nextauditor(String nextauditor) {
    this.nextauditor = nextauditor;
    return this;
  }

  /**
   * 下一级审核员名称
   * @return nextauditor
  **/
  @ApiModelProperty(required = true, value = "下一级审核员名称")
      @NotNull

    public String getNextauditor() {
    return nextauditor;
  }

  public void setNextauditor(String nextauditor) {
    this.nextauditor = nextauditor;
  }

  public MessageGetResMsgType16 nextlevel(Long nextlevel) {
    this.nextlevel = nextlevel;
    return this;
  }

  /**
   * 下一级审核员级别
   * @return nextlevel
  **/
  @ApiModelProperty(required = true, value = "下一级审核员级别")
      @NotNull

    public Long getNextlevel() {
    return nextlevel;
  }

  public void setNextlevel(Long nextlevel) {
    this.nextlevel = nextlevel;
  }

  public MessageGetResMsgType16 processname(String processname) {
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
    MessageGetResMsgType16 messageGetResMsgType16 = (MessageGetResMsgType16) o;
    return Objects.equals(this.auditmsg, messageGetResMsgType16.auditmsg) &&
        Objects.equals(this.auditorname, messageGetResMsgType16.auditorname) &&
        Objects.equals(this.auditresult, messageGetResMsgType16.auditresult) &&
        Objects.equals(this.docaudittype, messageGetResMsgType16.docaudittype) &&
        Objects.equals(this.nextauditor, messageGetResMsgType16.nextauditor) &&
        Objects.equals(this.nextlevel, messageGetResMsgType16.nextlevel) &&
        Objects.equals(this.processname, messageGetResMsgType16.processname) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditmsg, auditorname, auditresult, docaudittype, nextauditor, nextlevel, processname, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType16 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
    sb.append("    auditorname: ").append(toIndentedString(auditorname)).append("\n");
    sb.append("    auditresult: ").append(toIndentedString(auditresult)).append("\n");
    sb.append("    docaudittype: ").append(toIndentedString(docaudittype)).append("\n");
    sb.append("    nextauditor: ").append(toIndentedString(nextauditor)).append("\n");
    sb.append("    nextlevel: ").append(toIndentedString(nextlevel)).append("\n");
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
