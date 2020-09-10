package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageSendmailReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageSendmailReq   {
  @JsonProperty("mailto")
  @Valid
  private List<String> mailto = new ArrayList<String>();

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("content")
  private String content = null;

  public MessageSendmailReq mailto(List<String> mailto) {
    this.mailto = mailto;
    return this;
  }

  public MessageSendmailReq addMailtoItem(String mailtoItem) {
    this.mailto.add(mailtoItem);
    return this;
  }

  /**
   * 收件人邮箱地址列表
   * @return mailto
  **/
  @ApiModelProperty(required = true, value = "收件人邮箱地址列表")
      @NotNull

    public List<String> getMailto() {
    return mailto;
  }

  public void setMailto(List<String> mailto) {
    this.mailto = mailto;
  }

  public MessageSendmailReq subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * 邮件主题
   * @return subject
  **/
  @ApiModelProperty(value = "邮件主题")
  
    public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MessageSendmailReq content(String content) {
    this.content = content;
    return this;
  }

  /**
   * 邮件内容（由html格式组织）
   * @return content
  **/
  @ApiModelProperty(value = "邮件内容（由html格式组织）")
  
    public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageSendmailReq messageSendmailReq = (MessageSendmailReq) o;
    return Objects.equals(this.mailto, messageSendmailReq.mailto) &&
        Objects.equals(this.subject, messageSendmailReq.subject) &&
        Objects.equals(this.content, messageSendmailReq.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailto, subject, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSendmailReq {\n");
    
    sb.append("    mailto: ").append(toIndentedString(mailto)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
