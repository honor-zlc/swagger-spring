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
 * UpdateDownloadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class UpdateDownloadReq   {
  @JsonProperty("osType")
  private Long osType = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  public UpdateDownloadReq osType(Long osType) {
    this.osType = osType;
    return this;
  }

  /**
   * 客户端对应的平台  2: android  3: mac  4: windows 32bit  5:windows 64bit  6: office plugin
   * @return osType
  **/
  @ApiModelProperty(required = true, value = "客户端对应的平台  2: android  3: mac  4: windows 32bit  5:windows 64bit  6: office plugin")
      @NotNull

    public Long getOsType() {
    return osType;
  }

  public void setOsType(Long osType) {
    this.osType = osType;
  }

  public UpdateDownloadReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

  /**
   * 从存储服务器下载数据时的请求地址
   * @return reqhost
  **/
  @ApiModelProperty(value = "从存储服务器下载数据时的请求地址")
  
    public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public UpdateDownloadReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * 是否使用https下载数据，默认为true
   * @return usehttps
  **/
  @ApiModelProperty(value = "是否使用https下载数据，默认为true")
  
    public Boolean isUsehttps() {
    return usehttps;
  }

  public void setUsehttps(Boolean usehttps) {
    this.usehttps = usehttps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDownloadReq updateDownloadReq = (UpdateDownloadReq) o;
    return Objects.equals(this.osType, updateDownloadReq.osType) &&
        Objects.equals(this.reqhost, updateDownloadReq.reqhost) &&
        Objects.equals(this.usehttps, updateDownloadReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osType, reqhost, usehttps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDownloadReq {\n");
    
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
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
