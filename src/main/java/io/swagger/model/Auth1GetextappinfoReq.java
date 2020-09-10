package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Auth1GetextappinfoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetextappinfoReq   {
  @JsonProperty("apptype")
  private Long apptype = null;

  @JsonProperty("params")
  @Valid
  private Map<String, Object> params = new HashMap<String, Object>();

  public Auth1GetextappinfoReq apptype(Long apptype) {
    this.apptype = apptype;
    return this;
  }

  /**
   * 外部应用标识
   * @return apptype
  **/
  @ApiModelProperty(required = true, value = "外部应用标识")
      @NotNull

    public Long getApptype() {
    return apptype;
  }

  public void setApptype(Long apptype) {
    this.apptype = apptype;
  }

  public Auth1GetextappinfoReq params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  public Auth1GetextappinfoReq putParamsItem(String key, Object paramsItem) {
    this.params.put(key, paramsItem);
    return this;
  }

  /**
   * 应用系统相关配置
   * @return params
  **/
  @ApiModelProperty(required = true, value = "应用系统相关配置")
      @NotNull

    public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetextappinfoReq auth1GetextappinfoReq = (Auth1GetextappinfoReq) o;
    return Objects.equals(this.apptype, auth1GetextappinfoReq.apptype) &&
        Objects.equals(this.params, auth1GetextappinfoReq.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apptype, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetextappinfoReq {\n");
    
    sb.append("    apptype: ").append(toIndentedString(apptype)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
