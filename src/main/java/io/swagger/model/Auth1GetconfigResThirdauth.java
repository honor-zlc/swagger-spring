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
 * 表示开启了第三方认证，如果未开启，则不会有
 */
@ApiModel(description = "表示开启了第三方认证，如果未开启，则不会有")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigResThirdauth   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("config")
  @Valid
  private Map<String, Object> config = new HashMap<String, Object>();

  public Auth1GetconfigResThirdauth id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 唯一第三方认证系统
   * @return id
  **/
  @ApiModelProperty(required = true, value = "唯一第三方认证系统")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Auth1GetconfigResThirdauth config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  public Auth1GetconfigResThirdauth putConfigItem(String key, Object configItem) {
    this.config.put(key, configItem);
    return this;
  }

  /**
   * 第三方认证系统的配置参数
   * @return config
  **/
  @ApiModelProperty(required = true, value = "第三方认证系统的配置参数")
      @NotNull

    public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResThirdauth auth1GetconfigResThirdauth = (Auth1GetconfigResThirdauth) o;
    return Objects.equals(this.id, auth1GetconfigResThirdauth.id) &&
        Objects.equals(this.config, auth1GetconfigResThirdauth.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResThirdauth {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
