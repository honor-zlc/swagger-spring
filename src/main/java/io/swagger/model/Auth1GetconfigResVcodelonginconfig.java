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
 * 登录验证码配置信息
 */
@ApiModel(description = "登录验证码配置信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigResVcodelonginconfig   {
  @JsonProperty("isenable")
  private Boolean isenable = null;

  @JsonProperty("passwderrcnt")
  private Long passwderrcnt = null;

  public Auth1GetconfigResVcodelonginconfig isenable(Boolean isenable) {
    this.isenable = isenable;
    return this;
  }

  /**
   * 是否启用登录验证码功能
   * @return isenable
  **/
  @ApiModelProperty(required = true, value = "是否启用登录验证码功能")
      @NotNull

    public Boolean isIsenable() {
    return isenable;
  }

  public void setIsenable(Boolean isenable) {
    this.isenable = isenable;
  }

  public Auth1GetconfigResVcodelonginconfig passwderrcnt(Long passwderrcnt) {
    this.passwderrcnt = passwderrcnt;
    return this;
  }

  /**
   * 达到开启登录验证码的密码出错次数
   * @return passwderrcnt
  **/
  @ApiModelProperty(required = true, value = "达到开启登录验证码的密码出错次数")
      @NotNull

    public Long getPasswderrcnt() {
    return passwderrcnt;
  }

  public void setPasswderrcnt(Long passwderrcnt) {
    this.passwderrcnt = passwderrcnt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResVcodelonginconfig auth1GetconfigResVcodelonginconfig = (Auth1GetconfigResVcodelonginconfig) o;
    return Objects.equals(this.isenable, auth1GetconfigResVcodelonginconfig.isenable) &&
        Objects.equals(this.passwderrcnt, auth1GetconfigResVcodelonginconfig.passwderrcnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isenable, passwderrcnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResVcodelonginconfig {\n");
    
    sb.append("    isenable: ").append(toIndentedString(isenable)).append("\n");
    sb.append("    passwderrcnt: ").append(toIndentedString(passwderrcnt)).append("\n");
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
