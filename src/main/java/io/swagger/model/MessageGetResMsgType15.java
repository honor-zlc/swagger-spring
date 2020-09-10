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
 * MessageGetResMsgType15
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType15 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("docaudittype")
  private Long docaudittype = null;

  @JsonProperty("previousauditor")
  private String previousauditor = null;

  @JsonProperty("processname")
  private String processname = null;

  @JsonProperty("requestername")
  private String requestername = null;

  public MessageGetResMsgType15 docaudittype(Long docaudittype) {
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

  public MessageGetResMsgType15 previousauditor(String previousauditor) {
    this.previousauditor = previousauditor;
    return this;
  }

  /**
   * 上一级审核员名称，如果为“”，表示没有上级审核员
   * @return previousauditor
  **/
  @ApiModelProperty(required = true, value = "上一级审核员名称，如果为“”，表示没有上级审核员")
      @NotNull

    public String getPreviousauditor() {
    return previousauditor;
  }

  public void setPreviousauditor(String previousauditor) {
    this.previousauditor = previousauditor;
  }

  public MessageGetResMsgType15 processname(String processname) {
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

  public MessageGetResMsgType15 requestername(String requestername) {
    this.requestername = requestername;
    return this;
  }

  /**
   * 流程申请者名称
   * @return requestername
  **/
  @ApiModelProperty(required = true, value = "流程申请者名称")
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
    MessageGetResMsgType15 messageGetResMsgType15 = (MessageGetResMsgType15) o;
    return Objects.equals(this.docaudittype, messageGetResMsgType15.docaudittype) &&
        Objects.equals(this.previousauditor, messageGetResMsgType15.previousauditor) &&
        Objects.equals(this.processname, messageGetResMsgType15.processname) &&
        Objects.equals(this.requestername, messageGetResMsgType15.requestername) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docaudittype, previousauditor, processname, requestername, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType15 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    docaudittype: ").append(toIndentedString(docaudittype)).append("\n");
    sb.append("    previousauditor: ").append(toIndentedString(previousauditor)).append("\n");
    sb.append("    processname: ").append(toIndentedString(processname)).append("\n");
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
