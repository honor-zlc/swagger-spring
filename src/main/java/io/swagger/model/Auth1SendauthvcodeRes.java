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
 * Auth1SendauthvcodeRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1SendauthvcodeRes   {
  @JsonProperty("authway")
  private String authway = null;

  @JsonProperty("sendinterval")
  private Long sendinterval = null;

  @JsonProperty("isduplicatesended")
  private Boolean isduplicatesended = null;

  public Auth1SendauthvcodeRes authway(String authway) {
    this.authway = authway;
    return this;
  }

  /**
   * 用户手机号
   * @return authway
  **/
  @ApiModelProperty(required = true, value = "用户手机号")
      @NotNull

    public String getAuthway() {
    return authway;
  }

  public void setAuthway(String authway) {
    this.authway = authway;
  }

  public Auth1SendauthvcodeRes sendinterval(Long sendinterval) {
    this.sendinterval = sendinterval;
    return this;
  }

  /**
   * 短信发送验证码的间隔（单位/秒）
   * @return sendinterval
  **/
  @ApiModelProperty(required = true, value = "短信发送验证码的间隔（单位/秒）")
      @NotNull

    public Long getSendinterval() {
    return sendinterval;
  }

  public void setSendinterval(Long sendinterval) {
    this.sendinterval = sendinterval;
  }

  public Auth1SendauthvcodeRes isduplicatesended(Boolean isduplicatesended) {
    this.isduplicatesended = isduplicatesended;
    return this;
  }

  /**
   * 是否重复发送了 true表示在时间间隔内重复发送了 false表示未重复发送
   * @return isduplicatesended
  **/
  @ApiModelProperty(required = true, value = "是否重复发送了 true表示在时间间隔内重复发送了 false表示未重复发送")
      @NotNull

    public Boolean isIsduplicatesended() {
    return isduplicatesended;
  }

  public void setIsduplicatesended(Boolean isduplicatesended) {
    this.isduplicatesended = isduplicatesended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1SendauthvcodeRes auth1SendauthvcodeRes = (Auth1SendauthvcodeRes) o;
    return Objects.equals(this.authway, auth1SendauthvcodeRes.authway) &&
        Objects.equals(this.sendinterval, auth1SendauthvcodeRes.sendinterval) &&
        Objects.equals(this.isduplicatesended, auth1SendauthvcodeRes.isduplicatesended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authway, sendinterval, isduplicatesended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1SendauthvcodeRes {\n");
    
    sb.append("    authway: ").append(toIndentedString(authway)).append("\n");
    sb.append("    sendinterval: ").append(toIndentedString(sendinterval)).append("\n");
    sb.append("    isduplicatesended: ").append(toIndentedString(isduplicatesended)).append("\n");
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
