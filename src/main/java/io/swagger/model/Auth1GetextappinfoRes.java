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
 * Auth1GetextappinfoRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetextappinfoRes   {
  @JsonProperty("value")
  @Valid
  private Map<String, Object> value = new HashMap<String, Object>();

  public Auth1GetextappinfoRes value(Map<String, Object> value) {
    this.value = value;
    return this;
  }

  public Auth1GetextappinfoRes putValueItem(String key, Object valueItem) {
    this.value.put(key, valueItem);
    return this;
  }

  /**
   * 返回登录信息
   * @return value
  **/
  @ApiModelProperty(required = true, value = "返回登录信息")
      @NotNull

    public Map<String, Object> getValue() {
    return value;
  }

  public void setValue(Map<String, Object> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetextappinfoRes auth1GetextappinfoRes = (Auth1GetextappinfoRes) o;
    return Objects.equals(this.value, auth1GetextappinfoRes.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetextappinfoRes {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
