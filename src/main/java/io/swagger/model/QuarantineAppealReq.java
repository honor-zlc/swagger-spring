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
 * QuarantineAppealReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class QuarantineAppealReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("reason")
  private String reason = null;

  public QuarantineAppealReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件docid
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件docid")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public QuarantineAppealReq reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * 申诉理由
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "申诉理由")
      @NotNull

    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantineAppealReq quarantineAppealReq = (QuarantineAppealReq) o;
    return Objects.equals(this.docid, quarantineAppealReq.docid) &&
        Objects.equals(this.reason, quarantineAppealReq.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantineAppealReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
