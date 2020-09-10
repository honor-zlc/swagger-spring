package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Auth1GetnewReqDeviceinfo;
import io.swagger.model.Auth1GetnewReqVcodeinfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Auth1GetnewReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetnewReq   {
  @JsonProperty("account")
  private String account = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("deviceinfo")
  private Auth1GetnewReqDeviceinfo deviceinfo = null;

  @JsonProperty("vcodeinfo")
  private Auth1GetnewReqVcodeinfo vcodeinfo = null;

  @JsonProperty("dualfactorauthinfo")
  @Valid
  private Map<String, Object> dualfactorauthinfo = null;

  public Auth1GetnewReq account(String account) {
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

  public Auth1GetnewReq password(String password) {
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

  public Auth1GetnewReq deviceinfo(Auth1GetnewReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
    return this;
  }

  /**
   * Get deviceinfo
   * @return deviceinfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Auth1GetnewReqDeviceinfo getDeviceinfo() {
    return deviceinfo;
  }

  public void setDeviceinfo(Auth1GetnewReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
  }

  public Auth1GetnewReq vcodeinfo(Auth1GetnewReqVcodeinfo vcodeinfo) {
    this.vcodeinfo = vcodeinfo;
    return this;
  }

  /**
   * Get vcodeinfo
   * @return vcodeinfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Auth1GetnewReqVcodeinfo getVcodeinfo() {
    return vcodeinfo;
  }

  public void setVcodeinfo(Auth1GetnewReqVcodeinfo vcodeinfo) {
    this.vcodeinfo = vcodeinfo;
  }

  public Auth1GetnewReq dualfactorauthinfo(Map<String, Object> dualfactorauthinfo) {
    this.dualfactorauthinfo = dualfactorauthinfo;
    return this;
  }

  public Auth1GetnewReq putDualfactorauthinfoItem(String key, Object dualfactorauthinfoItem) {
    if (this.dualfactorauthinfo == null) {
      this.dualfactorauthinfo = new HashMap<String, Object>();
    }
    this.dualfactorauthinfo.put(key, dualfactorauthinfoItem);
    return this;
  }

  /**
   * 双因子登录的验证信息
   * @return dualfactorauthinfo
  **/
  @ApiModelProperty(value = "双因子登录的验证信息")
  
    public Map<String, Object> getDualfactorauthinfo() {
    return dualfactorauthinfo;
  }

  public void setDualfactorauthinfo(Map<String, Object> dualfactorauthinfo) {
    this.dualfactorauthinfo = dualfactorauthinfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetnewReq auth1GetnewReq = (Auth1GetnewReq) o;
    return Objects.equals(this.account, auth1GetnewReq.account) &&
        Objects.equals(this.password, auth1GetnewReq.password) &&
        Objects.equals(this.deviceinfo, auth1GetnewReq.deviceinfo) &&
        Objects.equals(this.vcodeinfo, auth1GetnewReq.vcodeinfo) &&
        Objects.equals(this.dualfactorauthinfo, auth1GetnewReq.dualfactorauthinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, password, deviceinfo, vcodeinfo, dualfactorauthinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetnewReq {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    deviceinfo: ").append(toIndentedString(deviceinfo)).append("\n");
    sb.append("    vcodeinfo: ").append(toIndentedString(vcodeinfo)).append("\n");
    sb.append("    dualfactorauthinfo: ").append(toIndentedString(dualfactorauthinfo)).append("\n");
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
