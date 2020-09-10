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
 * 设备信息  注意：  1、传参deviceinfo时，需要同时提供name、ostype、devicetype、udid参数  2、不确定操作系统类型时，ostype 可以传递 0
 */
@ApiModel(description = "设备信息  注意：  1、传参deviceinfo时，需要同时提供name、ostype、devicetype、udid参数  2、不确定操作系统类型时，ostype 可以传递 0")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1ExtloginclientReqDeviceinfo   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ostype")
  private Integer ostype = null;

  @JsonProperty("devicetype")
  private String devicetype = null;

  @JsonProperty("udid")
  private String udid = null;

  public Auth1ExtloginclientReqDeviceinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 设备名称
   * @return name
  **/
  @ApiModelProperty(value = "设备名称")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Auth1ExtloginclientReqDeviceinfo ostype(Integer ostype) {
    this.ostype = ostype;
    return this;
  }

  /**
   * 操作系统类型    0：Unknown    1：IOS    2：Android    3：Windows phone    4：Windows    5：MacOSX    6：Web    7：MobileWeb
   * @return ostype
  **/
  @ApiModelProperty(value = "操作系统类型    0：Unknown    1：IOS    2：Android    3：Windows phone    4：Windows    5：MacOSX    6：Web    7：MobileWeb")
  
    public Integer getOstype() {
    return ostype;
  }

  public void setOstype(Integer ostype) {
    this.ostype = ostype;
  }

  public Auth1ExtloginclientReqDeviceinfo devicetype(String devicetype) {
    this.devicetype = devicetype;
    return this;
  }

  /**
   * 设备硬件类型，自定义，例如：ipad、联想一体机
   * @return devicetype
  **/
  @ApiModelProperty(value = "设备硬件类型，自定义，例如：ipad、联想一体机")
  
    public String getDevicetype() {
    return devicetype;
  }

  public void setDevicetype(String devicetype) {
    this.devicetype = devicetype;
  }

  public Auth1ExtloginclientReqDeviceinfo udid(String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * 设备唯一标识号，windows下取mac地址
   * @return udid
  **/
  @ApiModelProperty(value = "设备唯一标识号，windows下取mac地址")
  
    public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1ExtloginclientReqDeviceinfo auth1ExtloginclientReqDeviceinfo = (Auth1ExtloginclientReqDeviceinfo) o;
    return Objects.equals(this.name, auth1ExtloginclientReqDeviceinfo.name) &&
        Objects.equals(this.ostype, auth1ExtloginclientReqDeviceinfo.ostype) &&
        Objects.equals(this.devicetype, auth1ExtloginclientReqDeviceinfo.devicetype) &&
        Objects.equals(this.udid, auth1ExtloginclientReqDeviceinfo.udid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ostype, devicetype, udid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1ExtloginclientReqDeviceinfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ostype: ").append(toIndentedString(ostype)).append("\n");
    sb.append("    devicetype: ").append(toIndentedString(devicetype)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
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
