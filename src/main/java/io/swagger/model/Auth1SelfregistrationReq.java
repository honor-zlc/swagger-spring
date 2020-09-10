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
 * Auth1SelfregistrationReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1SelfregistrationReq   {
  @JsonProperty("registerid")
  private String registerid = null;

  @JsonProperty("certid")
  private String certid = null;

  @JsonProperty("realname")
  private String realname = null;

  @JsonProperty("password")
  private String password = null;

  public Auth1SelfregistrationReq registerid(String registerid) {
    this.registerid = registerid;
    return this;
  }

  /**
   * 注册号
   * @return registerid
  **/
  @ApiModelProperty(required = true, value = "注册号")
      @NotNull

    public String getRegisterid() {
    return registerid;
  }

  public void setRegisterid(String registerid) {
    this.registerid = registerid;
  }

  public Auth1SelfregistrationReq certid(String certid) {
    this.certid = certid;
    return this;
  }

  /**
   * 身份证号
   * @return certid
  **/
  @ApiModelProperty(required = true, value = "身份证号")
      @NotNull

    public String getCertid() {
    return certid;
  }

  public void setCertid(String certid) {
    this.certid = certid;
  }

  public Auth1SelfregistrationReq realname(String realname) {
    this.realname = realname;
    return this;
  }

  /**
   * 真实姓名
   * @return realname
  **/
  @ApiModelProperty(required = true, value = "真实姓名")
      @NotNull

    public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public Auth1SelfregistrationReq password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 用户密码（采用RSA加密并将加密结果使用base64编码）
   * @return password
  **/
  @ApiModelProperty(required = true, value = "用户密码（采用RSA加密并将加密结果使用base64编码）")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1SelfregistrationReq auth1SelfregistrationReq = (Auth1SelfregistrationReq) o;
    return Objects.equals(this.registerid, auth1SelfregistrationReq.registerid) &&
        Objects.equals(this.certid, auth1SelfregistrationReq.certid) &&
        Objects.equals(this.realname, auth1SelfregistrationReq.realname) &&
        Objects.equals(this.password, auth1SelfregistrationReq.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registerid, certid, realname, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1SelfregistrationReq {\n");
    
    sb.append("    registerid: ").append(toIndentedString(registerid)).append("\n");
    sb.append("    certid: ").append(toIndentedString(certid)).append("\n");
    sb.append("    realname: ").append(toIndentedString(realname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
