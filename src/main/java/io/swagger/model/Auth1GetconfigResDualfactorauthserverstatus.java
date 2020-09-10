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
 * 双因子认证配置信息
 */
@ApiModel(description = "双因子认证配置信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigResDualfactorauthserverstatus   {
  @JsonProperty("auth_by_OTP")
  private Boolean authByOTP = null;

  @JsonProperty("auth_by_Ukey")
  private Boolean authByUkey = null;

  @JsonProperty("auth_by_email")
  private Boolean authByEmail = null;

  @JsonProperty("auth_by_sms")
  private Boolean authBySms = null;

  public Auth1GetconfigResDualfactorauthserverstatus authByOTP(Boolean authByOTP) {
    this.authByOTP = authByOTP;
    return this;
  }

  /**
   * 是否使用动态密保验证
   * @return authByOTP
  **/
  @ApiModelProperty(required = true, value = "是否使用动态密保验证")
      @NotNull

    public Boolean isAuthByOTP() {
    return authByOTP;
  }

  public void setAuthByOTP(Boolean authByOTP) {
    this.authByOTP = authByOTP;
  }

  public Auth1GetconfigResDualfactorauthserverstatus authByUkey(Boolean authByUkey) {
    this.authByUkey = authByUkey;
    return this;
  }

  /**
   * 是否使用Ukey验证
   * @return authByUkey
  **/
  @ApiModelProperty(required = true, value = "是否使用Ukey验证")
      @NotNull

    public Boolean isAuthByUkey() {
    return authByUkey;
  }

  public void setAuthByUkey(Boolean authByUkey) {
    this.authByUkey = authByUkey;
  }

  public Auth1GetconfigResDualfactorauthserverstatus authByEmail(Boolean authByEmail) {
    this.authByEmail = authByEmail;
    return this;
  }

  /**
   * 是否使用邮箱验证
   * @return authByEmail
  **/
  @ApiModelProperty(required = true, value = "是否使用邮箱验证")
      @NotNull

    public Boolean isAuthByEmail() {
    return authByEmail;
  }

  public void setAuthByEmail(Boolean authByEmail) {
    this.authByEmail = authByEmail;
  }

  public Auth1GetconfigResDualfactorauthserverstatus authBySms(Boolean authBySms) {
    this.authBySms = authBySms;
    return this;
  }

  /**
   * 是否使用短信验证
   * @return authBySms
  **/
  @ApiModelProperty(required = true, value = "是否使用短信验证")
      @NotNull

    public Boolean isAuthBySms() {
    return authBySms;
  }

  public void setAuthBySms(Boolean authBySms) {
    this.authBySms = authBySms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResDualfactorauthserverstatus auth1GetconfigResDualfactorauthserverstatus = (Auth1GetconfigResDualfactorauthserverstatus) o;
    return Objects.equals(this.authByOTP, auth1GetconfigResDualfactorauthserverstatus.authByOTP) &&
        Objects.equals(this.authByUkey, auth1GetconfigResDualfactorauthserverstatus.authByUkey) &&
        Objects.equals(this.authByEmail, auth1GetconfigResDualfactorauthserverstatus.authByEmail) &&
        Objects.equals(this.authBySms, auth1GetconfigResDualfactorauthserverstatus.authBySms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authByOTP, authByUkey, authByEmail, authBySms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResDualfactorauthserverstatus {\n");
    
    sb.append("    authByOTP: ").append(toIndentedString(authByOTP)).append("\n");
    sb.append("    authByUkey: ").append(toIndentedString(authByUkey)).append("\n");
    sb.append("    authByEmail: ").append(toIndentedString(authByEmail)).append("\n");
    sb.append("    authBySms: ").append(toIndentedString(authBySms)).append("\n");
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
