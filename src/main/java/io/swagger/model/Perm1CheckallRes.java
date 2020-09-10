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
 * Perm1CheckallRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1CheckallRes   {
  @JsonProperty("allowvalue")
  private Long allowvalue = null;

  @JsonProperty("denyvalue")
  private Long denyvalue = null;

  public Perm1CheckallRes allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

  /**
   * 允许的权限值
   * @return allowvalue
  **/
  @ApiModelProperty(required = true, value = "允许的权限值")
      @NotNull

    public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public Perm1CheckallRes denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

  /**
   * 拒绝的权限值
   * @return denyvalue
  **/
  @ApiModelProperty(required = true, value = "拒绝的权限值")
      @NotNull

    public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1CheckallRes perm1CheckallRes = (Perm1CheckallRes) o;
    return Objects.equals(this.allowvalue, perm1CheckallRes.allowvalue) &&
        Objects.equals(this.denyvalue, perm1CheckallRes.denyvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowvalue, denyvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1CheckallRes {\n");
    
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
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
