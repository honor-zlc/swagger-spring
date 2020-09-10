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
 * Auth1GetoauthinfoRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetoauthinfoRes   {
  @JsonProperty("isenabled")
  private Boolean isenabled = null;

  @JsonProperty("authurl")
  private String authurl = null;

  @JsonProperty("authserver")
  private String authserver = null;

  @JsonProperty("redirectserver")
  private String redirectserver = null;

  public Auth1GetoauthinfoRes isenabled(Boolean isenabled) {
    this.isenabled = isenabled;
    return this;
  }

  /**
   * 是否开启
   * @return isenabled
  **/
  @ApiModelProperty(required = true, value = "是否开启")
      @NotNull

    public Boolean isIsenabled() {
    return isenabled;
  }

  public void setIsenabled(Boolean isenabled) {
    this.isenabled = isenabled;
  }

  public Auth1GetoauthinfoRes authurl(String authurl) {
    this.authurl = authurl;
    return this;
  }

  /**
   * 完整的OAuth认证地址
   * @return authurl
  **/
  @ApiModelProperty(required = true, value = "完整的OAuth认证地址")
      @NotNull

    public String getAuthurl() {
    return authurl;
  }

  public void setAuthurl(String authurl) {
    this.authurl = authurl;
  }

  public Auth1GetoauthinfoRes authserver(String authserver) {
    this.authserver = authserver;
    return this;
  }

  /**
   * 认证服务器地址
   * @return authserver
  **/
  @ApiModelProperty(required = true, value = "认证服务器地址")
      @NotNull

    public String getAuthserver() {
    return authserver;
  }

  public void setAuthserver(String authserver) {
    this.authserver = authserver;
  }

  public Auth1GetoauthinfoRes redirectserver(String redirectserver) {
    this.redirectserver = redirectserver;
    return this;
  }

  /**
   * 第三方认证完毕后，跳转到AnyShare服务器的地址
   * @return redirectserver
  **/
  @ApiModelProperty(required = true, value = "第三方认证完毕后，跳转到AnyShare服务器的地址")
      @NotNull

    public String getRedirectserver() {
    return redirectserver;
  }

  public void setRedirectserver(String redirectserver) {
    this.redirectserver = redirectserver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetoauthinfoRes auth1GetoauthinfoRes = (Auth1GetoauthinfoRes) o;
    return Objects.equals(this.isenabled, auth1GetoauthinfoRes.isenabled) &&
        Objects.equals(this.authurl, auth1GetoauthinfoRes.authurl) &&
        Objects.equals(this.authserver, auth1GetoauthinfoRes.authserver) &&
        Objects.equals(this.redirectserver, auth1GetoauthinfoRes.redirectserver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isenabled, authurl, authserver, redirectserver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetoauthinfoRes {\n");
    
    sb.append("    isenabled: ").append(toIndentedString(isenabled)).append("\n");
    sb.append("    authurl: ").append(toIndentedString(authurl)).append("\n");
    sb.append("    authserver: ").append(toIndentedString(authserver)).append("\n");
    sb.append("    redirectserver: ").append(toIndentedString(redirectserver)).append("\n");
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
