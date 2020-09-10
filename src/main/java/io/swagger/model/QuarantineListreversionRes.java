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
 * QuarantineListreversionRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class QuarantineListreversionRes   {
  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("modifier")
  private String modifier = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("rev")
  private String rev = null;

  public QuarantineListreversionRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 版本修改时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "版本修改时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public QuarantineListreversionRes modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * 版本修改者名称
   * @return modifier
  **/
  @ApiModelProperty(required = true, value = "版本修改者名称")
      @NotNull

    public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public QuarantineListreversionRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 版本名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "版本名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QuarantineListreversionRes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * 版本隔离原因
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "版本隔离原因")
      @NotNull

    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public QuarantineListreversionRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 版本id
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "版本id")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantineListreversionRes quarantineListreversionRes = (QuarantineListreversionRes) o;
    return Objects.equals(this.modified, quarantineListreversionRes.modified) &&
        Objects.equals(this.modifier, quarantineListreversionRes.modifier) &&
        Objects.equals(this.name, quarantineListreversionRes.name) &&
        Objects.equals(this.reason, quarantineListreversionRes.reason) &&
        Objects.equals(this.rev, quarantineListreversionRes.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modified, modifier, name, reason, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantineListreversionRes {\n");
    
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
