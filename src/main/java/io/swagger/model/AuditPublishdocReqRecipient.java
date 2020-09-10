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
 * AuditPublishdocReqRecipient
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditPublishdocReqRecipient   {
  @JsonProperty("recvareaid")
  private String recvareaid = null;

  @JsonProperty("dstdocname")
  private String dstdocname = null;

  public AuditPublishdocReqRecipient recvareaid(String recvareaid) {
    this.recvareaid = recvareaid;
    return this;
  }

  /**
   * 发送目录
   * @return recvareaid
  **/
  @ApiModelProperty(required = true, value = "发送目录")
      @NotNull

    public String getRecvareaid() {
    return recvareaid;
  }

  public void setRecvareaid(String recvareaid) {
    this.recvareaid = recvareaid;
  }

  public AuditPublishdocReqRecipient dstdocname(String dstdocname) {
    this.dstdocname = dstdocname;
    return this;
  }

  /**
   * 交换目的位置
   * @return dstdocname
  **/
  @ApiModelProperty(required = true, value = "交换目的位置")
      @NotNull

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
    AuditPublishdocReqRecipient auditPublishdocReqRecipient = (AuditPublishdocReqRecipient) o;
    return Objects.equals(this.recvareaid, auditPublishdocReqRecipient.recvareaid) &&
        Objects.equals(this.dstdocname, auditPublishdocReqRecipient.dstdocname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recvareaid, dstdocname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditPublishdocReqRecipient {\n");
    
    sb.append("    recvareaid: ").append(toIndentedString(recvareaid)).append("\n");
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
