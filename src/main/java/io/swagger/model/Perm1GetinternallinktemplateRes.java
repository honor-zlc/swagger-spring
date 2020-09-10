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
 * Perm1GetinternallinktemplateRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1GetinternallinktemplateRes   {
  @JsonProperty("allowperm")
  private Long allowperm = null;

  @JsonProperty("defaultperm")
  private Long defaultperm = null;

  @JsonProperty("allowowner")
  private Boolean allowowner = null;

  @JsonProperty("defaultowner")
  private Boolean defaultowner = null;

  @JsonProperty("limitexpiredays")
  private Boolean limitexpiredays = null;

  @JsonProperty("allowexpiredays")
  private Long allowexpiredays = null;

  public Perm1GetinternallinktemplateRes allowperm(Long allowperm) {
    this.allowperm = allowperm;
    return this;
  }

  /**
   * 允许设置的权限
   * @return allowperm
  **/
  @ApiModelProperty(required = true, value = "允许设置的权限")
      @NotNull

    public Long getAllowperm() {
    return allowperm;
  }

  public void setAllowperm(Long allowperm) {
    this.allowperm = allowperm;
  }

  public Perm1GetinternallinktemplateRes defaultperm(Long defaultperm) {
    this.defaultperm = defaultperm;
    return this;
  }

  /**
   * 默认设置的权限
   * @return defaultperm
  **/
  @ApiModelProperty(required = true, value = "默认设置的权限")
      @NotNull

    public Long getDefaultperm() {
    return defaultperm;
  }

  public void setDefaultperm(Long defaultperm) {
    this.defaultperm = defaultperm;
  }

  public Perm1GetinternallinktemplateRes allowowner(Boolean allowowner) {
    this.allowowner = allowowner;
    return this;
  }

  /**
   * 允许设定所有者
   * @return allowowner
  **/
  @ApiModelProperty(required = true, value = "允许设定所有者")
      @NotNull

    public Boolean isAllowowner() {
    return allowowner;
  }

  public void setAllowowner(Boolean allowowner) {
    this.allowowner = allowowner;
  }

  public Perm1GetinternallinktemplateRes defaultowner(Boolean defaultowner) {
    this.defaultowner = defaultowner;
    return this;
  }

  /**
   * 默认允许设置所有者
   * @return defaultowner
  **/
  @ApiModelProperty(required = true, value = "默认允许设置所有者")
      @NotNull

    public Boolean isDefaultowner() {
    return defaultowner;
  }

  public void setDefaultowner(Boolean defaultowner) {
    this.defaultowner = defaultowner;
  }

  public Perm1GetinternallinktemplateRes limitexpiredays(Boolean limitexpiredays) {
    this.limitexpiredays = limitexpiredays;
    return this;
  }

  /**
   * 是否限制有效期
   * @return limitexpiredays
  **/
  @ApiModelProperty(required = true, value = "是否限制有效期")
      @NotNull

    public Boolean isLimitexpiredays() {
    return limitexpiredays;
  }

  public void setLimitexpiredays(Boolean limitexpiredays) {
    this.limitexpiredays = limitexpiredays;
  }

  public Perm1GetinternallinktemplateRes allowexpiredays(Long allowexpiredays) {
    this.allowexpiredays = allowexpiredays;
    return this;
  }

  /**
   * limitexpiredays=true  表示最大有效期  limitexpiredays=false  表示默认有效期
   * @return allowexpiredays
  **/
  @ApiModelProperty(required = true, value = "limitexpiredays=true  表示最大有效期  limitexpiredays=false  表示默认有效期")
      @NotNull

    public Long getAllowexpiredays() {
    return allowexpiredays;
  }

  public void setAllowexpiredays(Long allowexpiredays) {
    this.allowexpiredays = allowexpiredays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1GetinternallinktemplateRes perm1GetinternallinktemplateRes = (Perm1GetinternallinktemplateRes) o;
    return Objects.equals(this.allowperm, perm1GetinternallinktemplateRes.allowperm) &&
        Objects.equals(this.defaultperm, perm1GetinternallinktemplateRes.defaultperm) &&
        Objects.equals(this.allowowner, perm1GetinternallinktemplateRes.allowowner) &&
        Objects.equals(this.defaultowner, perm1GetinternallinktemplateRes.defaultowner) &&
        Objects.equals(this.limitexpiredays, perm1GetinternallinktemplateRes.limitexpiredays) &&
        Objects.equals(this.allowexpiredays, perm1GetinternallinktemplateRes.allowexpiredays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowperm, defaultperm, allowowner, defaultowner, limitexpiredays, allowexpiredays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1GetinternallinktemplateRes {\n");
    
    sb.append("    allowperm: ").append(toIndentedString(allowperm)).append("\n");
    sb.append("    defaultperm: ").append(toIndentedString(defaultperm)).append("\n");
    sb.append("    allowowner: ").append(toIndentedString(allowowner)).append("\n");
    sb.append("    defaultowner: ").append(toIndentedString(defaultowner)).append("\n");
    sb.append("    limitexpiredays: ").append(toIndentedString(limitexpiredays)).append("\n");
    sb.append("    allowexpiredays: ").append(toIndentedString(allowexpiredays)).append("\n");
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
