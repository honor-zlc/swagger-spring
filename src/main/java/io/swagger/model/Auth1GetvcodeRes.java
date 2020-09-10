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
 * Auth1GetvcodeRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetvcodeRes   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcode")
  private String vcode = null;

  public Auth1GetvcodeRes uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * 验证码唯一标识
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "验证码唯一标识")
      @NotNull

    public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Auth1GetvcodeRes vcode(String vcode) {
    this.vcode = vcode;
    return this;
  }

  /**
   * 编码后的验证码字符串
   * @return vcode
  **/
  @ApiModelProperty(required = true, value = "编码后的验证码字符串")
      @NotNull

    public String getVcode() {
    return vcode;
  }

  public void setVcode(String vcode) {
    this.vcode = vcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetvcodeRes auth1GetvcodeRes = (Auth1GetvcodeRes) o;
    return Objects.equals(this.uuid, auth1GetvcodeRes.uuid) &&
        Objects.equals(this.vcode, auth1GetvcodeRes.vcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, vcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetvcodeRes {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcode: ").append(toIndentedString(vcode)).append("\n");
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
