package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Auth1SendauthvcodeReqDeviceinfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Auth1SendauthvcodeReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1SendauthvcodeReq   {
  @JsonProperty("account")
  private String account = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("oldtelnum")
  private String oldtelnum = null;

  @JsonProperty("deviceinfo")
  private Auth1SendauthvcodeReqDeviceinfo deviceinfo = null;

  public Auth1SendauthvcodeReq account(String account) {
    this.account = account;
    return this;
  }

  /**
   * 用户登录账号
   * @return account
  **/
  @ApiModelProperty(required = true, value = "用户登录账号")
      @NotNull

    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Auth1SendauthvcodeReq password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 加密后的密文
   * @return password
  **/
  @ApiModelProperty(required = true, value = "加密后的密文")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Auth1SendauthvcodeReq oldtelnum(String oldtelnum) {
    this.oldtelnum = oldtelnum;
    return this;
  }

  /**
   * 上一次的获取的手机号（处理管理员修改手机号的情况）
   * @return oldtelnum
  **/
  @ApiModelProperty(required = true, value = "上一次的获取的手机号（处理管理员修改手机号的情况）")
      @NotNull

    public String getOldtelnum() {
    return oldtelnum;
  }

  public void setOldtelnum(String oldtelnum) {
    this.oldtelnum = oldtelnum;
  }

  public Auth1SendauthvcodeReq deviceinfo(Auth1SendauthvcodeReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
    return this;
  }

  /**
   * Get deviceinfo
   * @return deviceinfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Auth1SendauthvcodeReqDeviceinfo getDeviceinfo() {
    return deviceinfo;
  }

  public void setDeviceinfo(Auth1SendauthvcodeReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1SendauthvcodeReq auth1SendauthvcodeReq = (Auth1SendauthvcodeReq) o;
    return Objects.equals(this.account, auth1SendauthvcodeReq.account) &&
        Objects.equals(this.password, auth1SendauthvcodeReq.password) &&
        Objects.equals(this.oldtelnum, auth1SendauthvcodeReq.oldtelnum) &&
        Objects.equals(this.deviceinfo, auth1SendauthvcodeReq.deviceinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, password, oldtelnum, deviceinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1SendauthvcodeReq {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    oldtelnum: ").append(toIndentedString(oldtelnum)).append("\n");
    sb.append("    deviceinfo: ").append(toIndentedString(deviceinfo)).append("\n");
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
