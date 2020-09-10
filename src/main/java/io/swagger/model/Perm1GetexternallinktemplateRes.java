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
 * Perm1GetexternallinktemplateRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1GetexternallinktemplateRes   {
  @JsonProperty("limitexpiredays")
  private Boolean limitexpiredays = null;

  @JsonProperty("allowexpiredays")
  private Long allowexpiredays = null;

  @JsonProperty("allowperm")
  private Long allowperm = null;

  @JsonProperty("defaultperm")
  private Long defaultperm = null;

  @JsonProperty("limitaccesstimes")
  private Boolean limitaccesstimes = null;

  @JsonProperty("allowaccesstimes")
  private Long allowaccesstimes = null;

  @JsonProperty("accesspassword")
  private Boolean accesspassword = null;

  public Perm1GetexternallinktemplateRes limitexpiredays(Boolean limitexpiredays) {
    this.limitexpiredays = limitexpiredays;
    return this;
  }

  /**
   * 是否限制外链有效期
   * @return limitexpiredays
  **/
  @ApiModelProperty(required = true, value = "是否限制外链有效期")
      @NotNull

    public Boolean isLimitexpiredays() {
    return limitexpiredays;
  }

  public void setLimitexpiredays(Boolean limitexpiredays) {
    this.limitexpiredays = limitexpiredays;
  }

  public Perm1GetexternallinktemplateRes allowexpiredays(Long allowexpiredays) {
    this.allowexpiredays = allowexpiredays;
    return this;
  }

  /**
   * limitexpireday=fasle  表示默认有效期  limitexpireday=true  表示最大有效期
   * @return allowexpiredays
  **/
  @ApiModelProperty(required = true, value = "limitexpireday=fasle  表示默认有效期  limitexpireday=true  表示最大有效期")
      @NotNull

    public Long getAllowexpiredays() {
    return allowexpiredays;
  }

  public void setAllowexpiredays(Long allowexpiredays) {
    this.allowexpiredays = allowexpiredays;
  }

  public Perm1GetexternallinktemplateRes allowperm(Long allowperm) {
    this.allowperm = allowperm;
    return this;
  }

  /**
   * 可设定的权限
   * @return allowperm
  **/
  @ApiModelProperty(required = true, value = "可设定的权限")
      @NotNull

    public Long getAllowperm() {
    return allowperm;
  }

  public void setAllowperm(Long allowperm) {
    this.allowperm = allowperm;
  }

  public Perm1GetexternallinktemplateRes defaultperm(Long defaultperm) {
    this.defaultperm = defaultperm;
    return this;
  }

  /**
   * 默认权限
   * @return defaultperm
  **/
  @ApiModelProperty(required = true, value = "默认权限")
      @NotNull

    public Long getDefaultperm() {
    return defaultperm;
  }

  public void setDefaultperm(Long defaultperm) {
    this.defaultperm = defaultperm;
  }

  public Perm1GetexternallinktemplateRes limitaccesstimes(Boolean limitaccesstimes) {
    this.limitaccesstimes = limitaccesstimes;
    return this;
  }

  /**
   * 是否限制打开次数
   * @return limitaccesstimes
  **/
  @ApiModelProperty(required = true, value = "是否限制打开次数")
      @NotNull

    public Boolean isLimitaccesstimes() {
    return limitaccesstimes;
  }

  public void setLimitaccesstimes(Boolean limitaccesstimes) {
    this.limitaccesstimes = limitaccesstimes;
  }

  public Perm1GetexternallinktemplateRes allowaccesstimes(Long allowaccesstimes) {
    this.allowaccesstimes = allowaccesstimes;
    return this;
  }

  /**
   * limitaccesstimes=false  表示默认打开次数  limitaccesstimes=true  表示最大打开次数
   * @return allowaccesstimes
  **/
  @ApiModelProperty(required = true, value = "limitaccesstimes=false  表示默认打开次数  limitaccesstimes=true  表示最大打开次数")
      @NotNull

    public Long getAllowaccesstimes() {
    return allowaccesstimes;
  }

  public void setAllowaccesstimes(Long allowaccesstimes) {
    this.allowaccesstimes = allowaccesstimes;
  }

  public Perm1GetexternallinktemplateRes accesspassword(Boolean accesspassword) {
    this.accesspassword = accesspassword;
    return this;
  }

  /**
   * 是否强制使用访问密码
   * @return accesspassword
  **/
  @ApiModelProperty(required = true, value = "是否强制使用访问密码")
      @NotNull

    public Boolean isAccesspassword() {
    return accesspassword;
  }

  public void setAccesspassword(Boolean accesspassword) {
    this.accesspassword = accesspassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1GetexternallinktemplateRes perm1GetexternallinktemplateRes = (Perm1GetexternallinktemplateRes) o;
    return Objects.equals(this.limitexpiredays, perm1GetexternallinktemplateRes.limitexpiredays) &&
        Objects.equals(this.allowexpiredays, perm1GetexternallinktemplateRes.allowexpiredays) &&
        Objects.equals(this.allowperm, perm1GetexternallinktemplateRes.allowperm) &&
        Objects.equals(this.defaultperm, perm1GetexternallinktemplateRes.defaultperm) &&
        Objects.equals(this.limitaccesstimes, perm1GetexternallinktemplateRes.limitaccesstimes) &&
        Objects.equals(this.allowaccesstimes, perm1GetexternallinktemplateRes.allowaccesstimes) &&
        Objects.equals(this.accesspassword, perm1GetexternallinktemplateRes.accesspassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitexpiredays, allowexpiredays, allowperm, defaultperm, limitaccesstimes, allowaccesstimes, accesspassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1GetexternallinktemplateRes {\n");
    
    sb.append("    limitexpiredays: ").append(toIndentedString(limitexpiredays)).append("\n");
    sb.append("    allowexpiredays: ").append(toIndentedString(allowexpiredays)).append("\n");
    sb.append("    allowperm: ").append(toIndentedString(allowperm)).append("\n");
    sb.append("    defaultperm: ").append(toIndentedString(defaultperm)).append("\n");
    sb.append("    limitaccesstimes: ").append(toIndentedString(limitaccesstimes)).append("\n");
    sb.append("    allowaccesstimes: ").append(toIndentedString(allowaccesstimes)).append("\n");
    sb.append("    accesspassword: ").append(toIndentedString(accesspassword)).append("\n");
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
