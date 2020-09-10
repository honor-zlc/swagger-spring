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
 * DeviceDisableReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DeviceDisableReq   {
  @JsonProperty("udid")
  private String udid = null;

  public DeviceDisableReq udid(String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * 设备唯一标识
   * @return udid
  **/
  @ApiModelProperty(required = true, value = "设备唯一标识")
      @NotNull

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
    DeviceDisableReq deviceDisableReq = (DeviceDisableReq) o;
    return Objects.equals(this.udid, deviceDisableReq.udid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(udid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDisableReq {\n");
    
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
