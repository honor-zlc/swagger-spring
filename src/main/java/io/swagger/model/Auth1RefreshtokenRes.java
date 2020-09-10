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
 * Auth1RefreshtokenRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1RefreshtokenRes   {
  @JsonProperty("expires")
  private Long expires = null;

  public Auth1RefreshtokenRes expires(Long expires) {
    this.expires = expires;
    return this;
  }

  /**
   * 刷新以后token的有效期，单位为秒
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "刷新以后token的有效期，单位为秒")
      @NotNull

    public Long getExpires() {
    return expires;
  }

  public void setExpires(Long expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1RefreshtokenRes auth1RefreshtokenRes = (Auth1RefreshtokenRes) o;
    return Objects.equals(this.expires, auth1RefreshtokenRes.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1RefreshtokenRes {\n");
    
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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
