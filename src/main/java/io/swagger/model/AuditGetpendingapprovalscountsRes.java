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
 * AuditGetpendingapprovalscountsRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetpendingapprovalscountsRes   {
  @JsonProperty("counts")
  private Long counts = null;

  @JsonProperty("csfauditcount")
  private Long csfauditcount = null;

  @JsonProperty("docauditcount")
  private Long docauditcount = null;

  @JsonProperty("pemcount")
  private Long pemcount = null;

  @JsonProperty("shareauditcount")
  private Long shareauditcount = null;

  public AuditGetpendingapprovalscountsRes counts(Long counts) {
    this.counts = counts;
    return this;
  }

  /**
   * 待审核的记录总数
   * @return counts
  **/
  @ApiModelProperty(required = true, value = "待审核的记录总数")
      @NotNull

    public Long getCounts() {
    return counts;
  }

  public void setCounts(Long counts) {
    this.counts = counts;
  }

  public AuditGetpendingapprovalscountsRes csfauditcount(Long csfauditcount) {
    this.csfauditcount = csfauditcount;
    return this;
  }

  /**
   * 待审核的定密审核数
   * @return csfauditcount
  **/
  @ApiModelProperty(required = true, value = "待审核的定密审核数")
      @NotNull

    public Long getCsfauditcount() {
    return csfauditcount;
  }

  public void setCsfauditcount(Long csfauditcount) {
    this.csfauditcount = csfauditcount;
  }

  public AuditGetpendingapprovalscountsRes docauditcount(Long docauditcount) {
    this.docauditcount = docauditcount;
    return this;
  }

  /**
   * 待审核的流程审核数
   * @return docauditcount
  **/
  @ApiModelProperty(required = true, value = "待审核的流程审核数")
      @NotNull

    public Long getDocauditcount() {
    return docauditcount;
  }

  public void setDocauditcount(Long docauditcount) {
    this.docauditcount = docauditcount;
  }

  public AuditGetpendingapprovalscountsRes pemcount(Long pemcount) {
    this.pemcount = pemcount;
    return this;
  }

  /**
   * 待审核的共享审核数（包含定密审核）
   * @return pemcount
  **/
  @ApiModelProperty(required = true, value = "待审核的共享审核数（包含定密审核）")
      @NotNull

    public Long getPemcount() {
    return pemcount;
  }

  public void setPemcount(Long pemcount) {
    this.pemcount = pemcount;
  }

  public AuditGetpendingapprovalscountsRes shareauditcount(Long shareauditcount) {
    this.shareauditcount = shareauditcount;
    return this;
  }

  /**
   * 待审核的共享审核数（不包含定密审核）
   * @return shareauditcount
  **/
  @ApiModelProperty(required = true, value = "待审核的共享审核数（不包含定密审核）")
      @NotNull

    public Long getShareauditcount() {
    return shareauditcount;
  }

  public void setShareauditcount(Long shareauditcount) {
    this.shareauditcount = shareauditcount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetpendingapprovalscountsRes auditGetpendingapprovalscountsRes = (AuditGetpendingapprovalscountsRes) o;
    return Objects.equals(this.counts, auditGetpendingapprovalscountsRes.counts) &&
        Objects.equals(this.csfauditcount, auditGetpendingapprovalscountsRes.csfauditcount) &&
        Objects.equals(this.docauditcount, auditGetpendingapprovalscountsRes.docauditcount) &&
        Objects.equals(this.pemcount, auditGetpendingapprovalscountsRes.pemcount) &&
        Objects.equals(this.shareauditcount, auditGetpendingapprovalscountsRes.shareauditcount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, csfauditcount, docauditcount, pemcount, shareauditcount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetpendingapprovalscountsRes {\n");
    
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    csfauditcount: ").append(toIndentedString(csfauditcount)).append("\n");
    sb.append("    docauditcount: ").append(toIndentedString(docauditcount)).append("\n");
    sb.append("    pemcount: ").append(toIndentedString(pemcount)).append("\n");
    sb.append("    shareauditcount: ").append(toIndentedString(shareauditcount)).append("\n");
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
