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
 * Auth1GetbythirdpartyRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetbythirdpartyRes   {
  @JsonProperty("userid")
  private String userid = null;

  @JsonProperty("tokenid")
  private String tokenid = null;

  @JsonProperty("expires")
  private Long expires = null;

  public Auth1GetbythirdpartyRes userid(String userid) {
    this.userid = userid;
    return this;
  }

  /**
   * 唯一标识用户的ID
   * @return userid
  **/
  @ApiModelProperty(required = true, value = "唯一标识用户的ID")
      @NotNull

    public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public Auth1GetbythirdpartyRes tokenid(String tokenid) {
    this.tokenid = tokenid;
    return this;
  }

  /**
   * 与userid一起验证请求的合法性
   * @return tokenid
  **/
  @ApiModelProperty(required = true, value = "与userid一起验证请求的合法性")
      @NotNull

    public String getTokenid() {
    return tokenid;
  }

  public void setTokenid(String tokenid) {
    this.tokenid = tokenid;
  }

  public Auth1GetbythirdpartyRes expires(Long expires) {
    this.expires = expires;
    return this;
  }

  /**
   * 获取到的token的有效期，单位为秒
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "获取到的token的有效期，单位为秒")
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
    Auth1GetbythirdpartyRes auth1GetbythirdpartyRes = (Auth1GetbythirdpartyRes) o;
    return Objects.equals(this.userid, auth1GetbythirdpartyRes.userid) &&
        Objects.equals(this.tokenid, auth1GetbythirdpartyRes.tokenid) &&
        Objects.equals(this.expires, auth1GetbythirdpartyRes.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, tokenid, expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetbythirdpartyRes {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    tokenid: ").append(toIndentedString(tokenid)).append("\n");
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
