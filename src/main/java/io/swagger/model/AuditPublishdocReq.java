package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AuditPublishdocReqRecipient;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditPublishdocReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditPublishdocReq   {
  @JsonProperty("processid")
  private String processid = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("applymsg")
  private String applymsg = null;

  @JsonProperty("recipients")
  @Valid
  private List<AuditPublishdocReqRecipient> recipients = null;

  @JsonProperty("dstdocname")
  private String dstdocname = null;

  public AuditPublishdocReq processid(String processid) {
    this.processid = processid;
    return this;
  }

  /**
   * 流程id
   * @return processid
  **/
  @ApiModelProperty(required = true, value = "流程id")
      @NotNull

    public String getProcessid() {
    return processid;
  }

  public void setProcessid(String processid) {
    this.processid = processid;
  }

  public AuditPublishdocReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public AuditPublishdocReq applymsg(String applymsg) {
    this.applymsg = applymsg;
    return this;
  }

  /**
   * 发起流程时的理由
   * @return applymsg
  **/
  @ApiModelProperty(required = true, value = "发起流程时的理由")
      @NotNull

    public String getApplymsg() {
    return applymsg;
  }

  public void setApplymsg(String applymsg) {
    this.applymsg = applymsg;
  }

  public AuditPublishdocReq recipients(List<AuditPublishdocReqRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public AuditPublishdocReq addRecipientsItem(AuditPublishdocReqRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<AuditPublishdocReqRecipient>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * 内外网数据交换目的位置
   * @return recipients
  **/
  @ApiModelProperty(value = "内外网数据交换目的位置")
      @Valid
    public List<AuditPublishdocReqRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<AuditPublishdocReqRecipient> recipients) {
    this.recipients = recipients;
  }

  public AuditPublishdocReq dstdocname(String dstdocname) {
    this.dstdocname = dstdocname;
    return this;
  }

  /**
   * 内外网数据交换文档接收位置
   * @return dstdocname
  **/
  @ApiModelProperty(value = "内外网数据交换文档接收位置")
  
    public String getDstdocname() {
    return dstdocname;
  }

  public void setDstdocname(String dstdocname) {
    this.dstdocname = dstdocname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditPublishdocReq auditPublishdocReq = (AuditPublishdocReq) o;
    return Objects.equals(this.processid, auditPublishdocReq.processid) &&
        Objects.equals(this.docid, auditPublishdocReq.docid) &&
        Objects.equals(this.applymsg, auditPublishdocReq.applymsg) &&
        Objects.equals(this.recipients, auditPublishdocReq.recipients) &&
        Objects.equals(this.dstdocname, auditPublishdocReq.dstdocname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processid, docid, applymsg, recipients, dstdocname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditPublishdocReq {\n");
    
    sb.append("    processid: ").append(toIndentedString(processid)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    applymsg: ").append(toIndentedString(applymsg)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    dstdocname: ").append(toIndentedString(dstdocname)).append("\n");
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
