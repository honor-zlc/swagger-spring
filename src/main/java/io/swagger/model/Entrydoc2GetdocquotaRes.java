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
 * Entrydoc2GetdocquotaRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetdocquotaRes   {
  @JsonProperty("quota")
  private Long quota = null;

  @JsonProperty("used")
  private Long used = null;

  public Entrydoc2GetdocquotaRes quota(Long quota) {
    this.quota = quota;
    return this;
  }

  /**
   * 配额
   * @return quota
  **/
  @ApiModelProperty(required = true, value = "配额")
      @NotNull

    public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public Entrydoc2GetdocquotaRes used(Long used) {
    this.used = used;
    return this;
  }

  /**
   * 已用空间
   * @return used
  **/
  @ApiModelProperty(required = true, value = "已用空间")
      @NotNull

    public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetdocquotaRes entrydoc2GetdocquotaRes = (Entrydoc2GetdocquotaRes) o;
    return Objects.equals(this.quota, entrydoc2GetdocquotaRes.quota) &&
        Objects.equals(this.used, entrydoc2GetdocquotaRes.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quota, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetdocquotaRes {\n");
    
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
