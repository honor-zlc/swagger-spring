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
 * 设备信息
 */
@ApiModel(description = "设备信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetbythirdpartyReqDeviceinfo   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ostype")
  private Long ostype = null;

  @JsonProperty("devicetype")
  private String devicetype = null;

  @JsonProperty("udid")
  private String udid = null;

  public Auth1GetbythirdpartyReqDeviceinfo name(String name) {
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

  public Auth1GetbythirdpartyReqDeviceinfo ostype(Long ostype) {
    this.ostype = ostype;
    return this;
  }

  /**
   * 操作系统类型  0：Unknown  1：IOS  2：Android  3：Windows phone  4：Windows  5：MacOSX  6：Web  7：MobileWeb
   * @return ostype
  **/
  @ApiModelProperty(value = "操作系统类型  0：Unknown  1：IOS  2：Android  3：Windows phone  4：Windows  5：MacOSX  6：Web  7：MobileWeb")
  
    public Long getOstype() {
    return ostype;
  }

  public void setOstype(Long ostype) {
    this.ostype = ostype;
  }

  public Auth1GetbythirdpartyReqDeviceinfo devicetype(String devicetype) {
    this.devicetype = devicetype;
    return this;
  }

  /**
   * 设备硬件类型，自定义。如：  iphone5s  ipad  联想一体机  mac
   * @return devicetype
  **/
  @ApiModelProperty(value = "设备硬件类型，自定义。如：  iphone5s  ipad  联想一体机  mac")
  
    public String getDevicetype() {
    return devicetype;
  }

  public void setDevicetype(String devicetype) {
    this.devicetype = devicetype;
  }

  public Auth1GetbythirdpartyReqDeviceinfo udid(String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * 设备唯一标识号，  windows下取mac地址  ios取udid  web为空
   * @return udid
  **/
  @ApiModelProperty(value = "设备唯一标识号，  windows下取mac地址  ios取udid  web为空")
  
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
    Auth1GetbythirdpartyReqDeviceinfo auth1GetbythirdpartyReqDeviceinfo = (Auth1GetbythirdpartyReqDeviceinfo) o;
    return Objects.equals(this.name, auth1GetbythirdpartyReqDeviceinfo.name) &&
        Objects.equals(this.ostype, auth1GetbythirdpartyReqDeviceinfo.ostype) &&
        Objects.equals(this.devicetype, auth1GetbythirdpartyReqDeviceinfo.devicetype) &&
        Objects.equals(this.udid, auth1GetbythirdpartyReqDeviceinfo.udid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ostype, devicetype, udid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetbythirdpartyReqDeviceinfo {\n");
    
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
