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
 * 登录验证码信息
 */
@ApiModel(description = "登录验证码信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetnewReqVcodeinfo   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcode")
  private String vcode = null;

  @JsonProperty("ismodify")
  private Boolean ismodify = null;

  public Auth1GetnewReqVcodeinfo uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * 验证码唯一标识
   * @return uuid
  **/
  @ApiModelProperty(value = "验证码唯一标识")
  
    public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Auth1GetnewReqVcodeinfo vcode(String vcode) {
    this.vcode = vcode;
    return this;
  }

  /**
   * 验证码字符串
   * @return vcode
  **/
  @ApiModelProperty(value = "验证码字符串")
  
    public String getVcode() {
    return vcode;
  }

  public void setVcode(String vcode) {
    this.vcode = vcode;
  }

  public Auth1GetnewReqVcodeinfo ismodify(Boolean ismodify) {
    this.ismodify = ismodify;
    return this;
  }

  /**
   * 修改密码界面标识符
   * @return ismodify
  **/
  @ApiModelProperty(value = "修改密码界面标识符")
  
    public Boolean isIsmodify() {
    return ismodify;
  }

  public void setIsmodify(Boolean ismodify) {
    this.ismodify = ismodify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetnewReqVcodeinfo auth1GetnewReqVcodeinfo = (Auth1GetnewReqVcodeinfo) o;
    return Objects.equals(this.uuid, auth1GetnewReqVcodeinfo.uuid) &&
        Objects.equals(this.vcode, auth1GetnewReqVcodeinfo.vcode) &&
        Objects.equals(this.ismodify, auth1GetnewReqVcodeinfo.ismodify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, vcode, ismodify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetnewReqVcodeinfo {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcode: ").append(toIndentedString(vcode)).append("\n");
    sb.append("    ismodify: ").append(toIndentedString(ismodify)).append("\n");
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
