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


public class Auth1GetconfigResDeviceinfo   {
  @JsonProperty("auth_days")
  private Long authDays = null;

  @JsonProperty("auth_status")
  private Long authStatus = null;

  @JsonProperty("auth_type")
  private Long authType = null;

  @JsonProperty("hardware_type")
  private String hardwareType = null;

  @JsonProperty("software_type")
  private String softwareType = null;

  public Auth1GetconfigResDeviceinfo authDays(Long authDays) {
    this.authDays = authDays;
    return this;
  }

  /**
   * 授权天数
   * @return authDays
  **/
  @ApiModelProperty(required = true, value = "授权天数")
      @NotNull

    public Long getAuthDays() {
    return authDays;
  }

  public void setAuthDays(Long authDays) {
    this.authDays = authDays;
  }

  public Auth1GetconfigResDeviceinfo authStatus(Long authStatus) {
    this.authStatus = authStatus;
    return this;
  }

  /**
   * 授权状态 1未授权 2已授权 3已过期 4已失效
   * @return authStatus
  **/
  @ApiModelProperty(required = true, value = "授权状态 1未授权 2已授权 3已过期 4已失效")
      @NotNull

    public Long getAuthStatus() {
    return authStatus;
  }

  public void setAuthStatus(Long authStatus) {
    this.authStatus = authStatus;
  }

  public Auth1GetconfigResDeviceinfo authType(Long authType) {
    this.authType = authType;
    return this;
  }

  /**
   * 授权类型 1未授权 2测试授权 3正式授权
   * @return authType
  **/
  @ApiModelProperty(required = true, value = "授权类型 1未授权 2测试授权 3正式授权")
      @NotNull

    public Long getAuthType() {
    return authType;
  }

  public void setAuthType(Long authType) {
    this.authType = authType;
  }

  public Auth1GetconfigResDeviceinfo hardwareType(String hardwareType) {
    this.hardwareType = hardwareType;
    return this;
  }

  /**
   * 设备型号
   * @return hardwareType
  **/
  @ApiModelProperty(required = true, value = "设备型号")
      @NotNull

    public String getHardwareType() {
    return hardwareType;
  }

  public void setHardwareType(String hardwareType) {
    this.hardwareType = hardwareType;
  }

  public Auth1GetconfigResDeviceinfo softwareType(String softwareType) {
    this.softwareType = softwareType;
    return this;
  }

  /**
   * 当前产品类型信息  EDMS: 涉密一体机  ASE：AnyShare Enterprise  ASS：AnyShare Express  ASC：AnyShare Cloud
   * @return softwareType
  **/
  @ApiModelProperty(required = true, value = "当前产品类型信息  EDMS: 涉密一体机  ASE：AnyShare Enterprise  ASS：AnyShare Express  ASC：AnyShare Cloud")
      @NotNull

    public String getSoftwareType() {
    return softwareType;
  }

  public void setSoftwareType(String softwareType) {
    this.softwareType = softwareType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResDeviceinfo auth1GetconfigResDeviceinfo = (Auth1GetconfigResDeviceinfo) o;
    return Objects.equals(this.authDays, auth1GetconfigResDeviceinfo.authDays) &&
        Objects.equals(this.authStatus, auth1GetconfigResDeviceinfo.authStatus) &&
        Objects.equals(this.authType, auth1GetconfigResDeviceinfo.authType) &&
        Objects.equals(this.hardwareType, auth1GetconfigResDeviceinfo.hardwareType) &&
        Objects.equals(this.softwareType, auth1GetconfigResDeviceinfo.softwareType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authDays, authStatus, authType, hardwareType, softwareType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResDeviceinfo {\n");
    
    sb.append("    authDays: ").append(toIndentedString(authDays)).append("\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    hardwareType: ").append(toIndentedString(hardwareType)).append("\n");
    sb.append("    softwareType: ").append(toIndentedString(softwareType)).append("\n");
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
