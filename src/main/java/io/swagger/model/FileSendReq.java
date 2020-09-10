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
 * FileSendReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileSendReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("recipients")
  @Valid
  private List<String> recipients = new ArrayList<String>();

  public FileSendReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 要发送的文件gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "要发送的文件gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileSendReq recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public FileSendReq addRecipientsItem(String recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * 收件人名字，为用户登录名，UTF8编码
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "收件人名字，为用户登录名，UTF8编码")
      @NotNull

    public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSendReq fileSendReq = (FileSendReq) o;
    return Objects.equals(this.docid, fileSendReq.docid) &&
        Objects.equals(this.recipients, fileSendReq.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSendReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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
