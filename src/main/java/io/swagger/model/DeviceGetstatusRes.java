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
 * DeviceGetstatusRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DeviceGetstatusRes   {
  @JsonProperty("eraseflag")
  private Long eraseflag = null;

  @JsonProperty("disableflag")
  private Long disableflag = null;

  public DeviceGetstatusRes eraseflag(Long eraseflag) {
    this.eraseflag = eraseflag;
    return this;
  }

  /**
   * 数据擦除状态  0表示正常  1表示正在请求擦除
   * @return eraseflag
  **/
  @ApiModelProperty(required = true, value = "数据擦除状态  0表示正常  1表示正在请求擦除")
      @NotNull

    public Long getEraseflag() {
    return eraseflag;
  }

  public void setEraseflag(Long eraseflag) {
    this.eraseflag = eraseflag;
  }

  public DeviceGetstatusRes disableflag(Long disableflag) {
    this.disableflag = disableflag;
    return this;
  }

  /**
   * 设备禁用状态  0表示正常  1表示处于禁用状态
   * @return disableflag
  **/
  @ApiModelProperty(required = true, value = "设备禁用状态  0表示正常  1表示处于禁用状态")
      @NotNull

    public Long getDisableflag() {
    return disableflag;
  }

  public void setDisableflag(Long disableflag) {
    this.disableflag = disableflag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceGetstatusRes deviceGetstatusRes = (DeviceGetstatusRes) o;
    return Objects.equals(this.eraseflag, deviceGetstatusRes.eraseflag) &&
        Objects.equals(this.disableflag, deviceGetstatusRes.disableflag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eraseflag, disableflag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGetstatusRes {\n");
    
    sb.append("    eraseflag: ").append(toIndentedString(eraseflag)).append("\n");
    sb.append("    disableflag: ").append(toIndentedString(disableflag)).append("\n");
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
