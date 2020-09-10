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
 * FileSendResResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileSendResResult   {
  @JsonProperty("causemsg")
  private String causemsg = null;

  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("recipient")
  private String recipient = null;

  @JsonProperty("success")
  private Boolean success = null;

  public FileSendResResult causemsg(String causemsg) {
    this.causemsg = causemsg;
    return this;
  }

  /**
   * 发送成功时为空；否则为详细错误信息
   * @return causemsg
  **/
  @ApiModelProperty(required = true, value = "发送成功时为空；否则为详细错误信息")
      @NotNull

    public String getCausemsg() {
    return causemsg;
  }

  public void setCausemsg(String causemsg) {
    this.causemsg = causemsg;
  }

  public FileSendResResult msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * 发送成功时为空；否则为错误信息
   * @return msg
  **/
  @ApiModelProperty(required = true, value = "发送成功时为空；否则为错误信息")
      @NotNull

    public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public FileSendResResult recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * 收件人名字
   * @return recipient
  **/
  @ApiModelProperty(required = true, value = "收件人名字")
      @NotNull

    public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public FileSendResResult success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * 发送是否成功
   * @return success
  **/
  @ApiModelProperty(required = true, value = "发送是否成功")
      @NotNull

    public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSendResResult fileSendResResult = (FileSendResResult) o;
    return Objects.equals(this.causemsg, fileSendResResult.causemsg) &&
        Objects.equals(this.msg, fileSendResResult.msg) &&
        Objects.equals(this.recipient, fileSendResResult.recipient) &&
        Objects.equals(this.success, fileSendResResult.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causemsg, msg, recipient, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSendResResult {\n");
    
    sb.append("    causemsg: ").append(toIndentedString(causemsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
