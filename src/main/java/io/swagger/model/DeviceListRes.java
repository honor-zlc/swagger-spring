package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DeviceListResDeviceinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeviceListRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DeviceListRes   {
  @JsonProperty("deviceinfos")
  @Valid
  private List<DeviceListResDeviceinfo> deviceinfos = new ArrayList<DeviceListResDeviceinfo>();

  public DeviceListRes deviceinfos(List<DeviceListResDeviceinfo> deviceinfos) {
    this.deviceinfos = deviceinfos;
    return this;
  }

  public DeviceListRes addDeviceinfosItem(DeviceListResDeviceinfo deviceinfosItem) {
    this.deviceinfos.add(deviceinfosItem);
    return this;
  }

  /**
   * 设备信息数组
   * @return deviceinfos
  **/
  @ApiModelProperty(required = true, value = "设备信息数组")
      @NotNull
    @Valid
    public List<DeviceListResDeviceinfo> getDeviceinfos() {
    return deviceinfos;
  }

  public void setDeviceinfos(List<DeviceListResDeviceinfo> deviceinfos) {
    this.deviceinfos = deviceinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceListRes deviceListRes = (DeviceListRes) o;
    return Objects.equals(this.deviceinfos, deviceListRes.deviceinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListRes {\n");
    
    sb.append("    deviceinfos: ").append(toIndentedString(deviceinfos)).append("\n");
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
