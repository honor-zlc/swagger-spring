package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Auth1GetbythirdpartyReqDeviceinfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Auth1GetbythirdpartyReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetbythirdpartyReq   {
  @JsonProperty("thirdpartyid")
  private String thirdpartyid = null;

  @JsonProperty("params")
  @Valid
  private Map<String, Object> params = new HashMap<String, Object>();

  @JsonProperty("deviceinfo")
  private Auth1GetbythirdpartyReqDeviceinfo deviceinfo = null;

  public Auth1GetbythirdpartyReq thirdpartyid(String thirdpartyid) {
    this.thirdpartyid = thirdpartyid;
    return this;
  }

  /**
   * 标识第三方认证类型
   * @return thirdpartyid
  **/
  @ApiModelProperty(required = true, value = "标识第三方认证类型")
      @NotNull

    public String getThirdpartyid() {
    return thirdpartyid;
  }

  public void setThirdpartyid(String thirdpartyid) {
    this.thirdpartyid = thirdpartyid;
  }

  public Auth1GetbythirdpartyReq params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  public Auth1GetbythirdpartyReq putParamsItem(String key, Object paramsItem) {
    this.params.put(key, paramsItem);
    return this;
  }

  /**
   * 保存第三方认证系统相关的参数
   * @return params
  **/
  @ApiModelProperty(required = true, value = "保存第三方认证系统相关的参数")
      @NotNull

    public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  public Auth1GetbythirdpartyReq deviceinfo(Auth1GetbythirdpartyReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
    return this;
  }

  /**
   * Get deviceinfo
   * @return deviceinfo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetbythirdpartyReqDeviceinfo getDeviceinfo() {
    return deviceinfo;
  }

  public void setDeviceinfo(Auth1GetbythirdpartyReqDeviceinfo deviceinfo) {
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
    Auth1GetbythirdpartyReq auth1GetbythirdpartyReq = (Auth1GetbythirdpartyReq) o;
    return Objects.equals(this.thirdpartyid, auth1GetbythirdpartyReq.thirdpartyid) &&
        Objects.equals(this.params, auth1GetbythirdpartyReq.params) &&
        Objects.equals(this.deviceinfo, auth1GetbythirdpartyReq.deviceinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdpartyid, params, deviceinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetbythirdpartyReq {\n");
    
    sb.append("    thirdpartyid: ").append(toIndentedString(thirdpartyid)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
