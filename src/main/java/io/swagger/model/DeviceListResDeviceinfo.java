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
 * DeviceListResDeviceinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DeviceListResDeviceinfo   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ostype")
  private Long ostype = null;

  @JsonProperty("devicetype")
  private String devicetype = null;

  @JsonProperty("udid")
  private String udid = null;

  @JsonProperty("lastloginip")
  private String lastloginip = null;

  @JsonProperty("lastlogintime")
  private Long lastlogintime = null;

  @JsonProperty("eraseflag")
  private Long eraseflag = null;

  @JsonProperty("lasterasetime")
  private Long lasterasetime = null;

  @JsonProperty("disableflag")
  private Long disableflag = null;

  @JsonProperty("loginflag")
  private Long loginflag = null;

  @JsonProperty("bindflag")
  private Long bindflag = null;

  public DeviceListResDeviceinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 设备名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "设备名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceListResDeviceinfo ostype(Long ostype) {
    this.ostype = ostype;
    return this;
  }

  /**
   * 操作系统类型  0：Unknown  1：IOS  2：Android  3：Windows phone  4：Windows  5：MacOSX  6：Web  7：MobileWeb
   * @return ostype
  **/
  @ApiModelProperty(required = true, value = "操作系统类型  0：Unknown  1：IOS  2：Android  3：Windows phone  4：Windows  5：MacOSX  6：Web  7：MobileWeb")
      @NotNull

    public Long getOstype() {
    return ostype;
  }

  public void setOstype(Long ostype) {
    this.ostype = ostype;
  }

  public DeviceListResDeviceinfo devicetype(String devicetype) {
    this.devicetype = devicetype;
    return this;
  }

  /**
   * 设备硬件类型，自定义，例如：  iphone5s  ipad  联想一体机  mac
   * @return devicetype
  **/
  @ApiModelProperty(required = true, value = "设备硬件类型，自定义，例如：  iphone5s  ipad  联想一体机  mac")
      @NotNull

    public String getDevicetype() {
    return devicetype;
  }

  public void setDevicetype(String devicetype) {
    this.devicetype = devicetype;
  }

  public DeviceListResDeviceinfo udid(String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * 设备唯一标识号
   * @return udid
  **/
  @ApiModelProperty(required = true, value = "设备唯一标识号")
      @NotNull

    public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public DeviceListResDeviceinfo lastloginip(String lastloginip) {
    this.lastloginip = lastloginip;
    return this;
  }

  /**
   * 上次登录ip
   * @return lastloginip
  **/
  @ApiModelProperty(required = true, value = "上次登录ip")
      @NotNull

    public String getLastloginip() {
    return lastloginip;
  }

  public void setLastloginip(String lastloginip) {
    this.lastloginip = lastloginip;
  }

  public DeviceListResDeviceinfo lastlogintime(Long lastlogintime) {
    this.lastlogintime = lastlogintime;
    return this;
  }

  /**
   * 上次登录时间
   * @return lastlogintime
  **/
  @ApiModelProperty(required = true, value = "上次登录时间")
      @NotNull

    public Long getLastlogintime() {
    return lastlogintime;
  }

  public void setLastlogintime(Long lastlogintime) {
    this.lastlogintime = lastlogintime;
  }

  public DeviceListResDeviceinfo eraseflag(Long eraseflag) {
    this.eraseflag = eraseflag;
    return this;
  }

  /**
   * 缓存数据擦除状态  0表示正常  1表示正在请求擦除
   * @return eraseflag
  **/
  @ApiModelProperty(required = true, value = "缓存数据擦除状态  0表示正常  1表示正在请求擦除")
      @NotNull

    public Long getEraseflag() {
    return eraseflag;
  }

  public void setEraseflag(Long eraseflag) {
    this.eraseflag = eraseflag;
  }

  public DeviceListResDeviceinfo lasterasetime(Long lasterasetime) {
    this.lasterasetime = lasterasetime;
    return this;
  }

  /**
   * 上次成功清除缓存的时间
   * @return lasterasetime
  **/
  @ApiModelProperty(required = true, value = "上次成功清除缓存的时间")
      @NotNull

    public Long getLasterasetime() {
    return lasterasetime;
  }

  public void setLasterasetime(Long lasterasetime) {
    this.lasterasetime = lasterasetime;
  }

  public DeviceListResDeviceinfo disableflag(Long disableflag) {
    this.disableflag = disableflag;
    return this;
  }

  /**
   * 设备禁用状态  0表示未禁用  1表示已禁用
   * @return disableflag
  **/
  @ApiModelProperty(required = true, value = "设备禁用状态  0表示未禁用  1表示已禁用")
      @NotNull

    public Long getDisableflag() {
    return disableflag;
  }

  public void setDisableflag(Long disableflag) {
    this.disableflag = disableflag;
  }

  public DeviceListResDeviceinfo loginflag(Long loginflag) {
    this.loginflag = loginflag;
    return this;
  }

  /**
   * 设备登录状态  0表示未登录  1表示已登录
   * @return loginflag
  **/
  @ApiModelProperty(required = true, value = "设备登录状态  0表示未登录  1表示已登录")
      @NotNull

    public Long getLoginflag() {
    return loginflag;
  }

  public void setLoginflag(Long loginflag) {
    this.loginflag = loginflag;
  }

  public DeviceListResDeviceinfo bindflag(Long bindflag) {
    this.bindflag = bindflag;
    return this;
  }

  /**
   * 设备绑定状态  0表示未绑定  1表示已绑定
   * @return bindflag
  **/
  @ApiModelProperty(required = true, value = "设备绑定状态  0表示未绑定  1表示已绑定")
      @NotNull

    public Long getBindflag() {
    return bindflag;
  }

  public void setBindflag(Long bindflag) {
    this.bindflag = bindflag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceListResDeviceinfo deviceListResDeviceinfo = (DeviceListResDeviceinfo) o;
    return Objects.equals(this.name, deviceListResDeviceinfo.name) &&
        Objects.equals(this.ostype, deviceListResDeviceinfo.ostype) &&
        Objects.equals(this.devicetype, deviceListResDeviceinfo.devicetype) &&
        Objects.equals(this.udid, deviceListResDeviceinfo.udid) &&
        Objects.equals(this.lastloginip, deviceListResDeviceinfo.lastloginip) &&
        Objects.equals(this.lastlogintime, deviceListResDeviceinfo.lastlogintime) &&
        Objects.equals(this.eraseflag, deviceListResDeviceinfo.eraseflag) &&
        Objects.equals(this.lasterasetime, deviceListResDeviceinfo.lasterasetime) &&
        Objects.equals(this.disableflag, deviceListResDeviceinfo.disableflag) &&
        Objects.equals(this.loginflag, deviceListResDeviceinfo.loginflag) &&
        Objects.equals(this.bindflag, deviceListResDeviceinfo.bindflag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ostype, devicetype, udid, lastloginip, lastlogintime, eraseflag, lasterasetime, disableflag, loginflag, bindflag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListResDeviceinfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ostype: ").append(toIndentedString(ostype)).append("\n");
    sb.append("    devicetype: ").append(toIndentedString(devicetype)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    lastloginip: ").append(toIndentedString(lastloginip)).append("\n");
    sb.append("    lastlogintime: ").append(toIndentedString(lastlogintime)).append("\n");
    sb.append("    eraseflag: ").append(toIndentedString(eraseflag)).append("\n");
    sb.append("    lasterasetime: ").append(toIndentedString(lasterasetime)).append("\n");
    sb.append("    disableflag: ").append(toIndentedString(disableflag)).append("\n");
    sb.append("    loginflag: ").append(toIndentedString(loginflag)).append("\n");
    sb.append("    bindflag: ").append(toIndentedString(bindflag)).append("\n");
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
