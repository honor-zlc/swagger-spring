package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Auth1ExtloginclientReqDeviceinfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Auth1ExtloginclientReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1ExtloginclientReq   {
  @JsonProperty("account")
  private String account = null;

  @JsonProperty("appid")
  private String appid = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("deviceinfo")
  private Auth1ExtloginclientReqDeviceinfo deviceinfo = null;

  public Auth1ExtloginclientReq account(String account) {
    this.account = account;
    return this;
  }

  /**
   * 用户登录账号（不能使用admin登录）
   * @return account
  **/
  @ApiModelProperty(required = true, value = "用户登录账号（不能使用admin登录）")
      @NotNull

    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Auth1ExtloginclientReq appid(String appid) {
    this.appid = appid;
    return this;
  }

  /**
   * 爱数分配给第三方系统的应用id
   * @return appid
  **/
  @ApiModelProperty(required = true, value = "爱数分配给第三方系统的应用id")
      @NotNull

    public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public Auth1ExtloginclientReq key(String key) {
    this.key = key;
    return this;
  }

  /**
   * 组合appid，appkey，account后进行md5算法后得到（不区分大小写）  例如：  appid=eisoo  appkey=ae217ce4-bf33-11e9-aa67-665056af7572  account=xiaoming  key=md5(eisooae217ce4-bf33-11e9-aa67-665056af7572xiaoming)
   * @return key
  **/
  @ApiModelProperty(required = true, value = "组合appid，appkey，account后进行md5算法后得到（不区分大小写）  例如：  appid=eisoo  appkey=ae217ce4-bf33-11e9-aa67-665056af7572  account=xiaoming  key=md5(eisooae217ce4-bf33-11e9-aa67-665056af7572xiaoming)")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Auth1ExtloginclientReq deviceinfo(Auth1ExtloginclientReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
    return this;
  }

  /**
   * Get deviceinfo
   * @return deviceinfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Auth1ExtloginclientReqDeviceinfo getDeviceinfo() {
    return deviceinfo;
  }

  public void setDeviceinfo(Auth1ExtloginclientReqDeviceinfo deviceinfo) {
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
    Auth1ExtloginclientReq auth1ExtloginclientReq = (Auth1ExtloginclientReq) o;
    return Objects.equals(this.account, auth1ExtloginclientReq.account) &&
        Objects.equals(this.appid, auth1ExtloginclientReq.appid) &&
        Objects.equals(this.key, auth1ExtloginclientReq.key) &&
        Objects.equals(this.deviceinfo, auth1ExtloginclientReq.deviceinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, appid, key, deviceinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1ExtloginclientReq {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
