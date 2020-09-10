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
 * Auth1RefreshtokenReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1RefreshtokenReq   {
  @JsonProperty("tokenid")
  private String tokenid = null;

  @JsonProperty("expirestype")
  private Long expirestype = null;

  @JsonProperty("userid")
  private String userid = null;

  public Auth1RefreshtokenReq tokenid(String tokenid) {
    this.tokenid = tokenid;
    return this;
  }

  /**
   * 用户身份凭证
   * @return tokenid
  **/
  @ApiModelProperty(required = true, value = "用户身份凭证")
      @NotNull

    public String getTokenid() {
    return tokenid;
  }

  public void setTokenid(String tokenid) {
    this.tokenid = tokenid;
  }

  public Auth1RefreshtokenReq expirestype(Long expirestype) {
    this.expirestype = expirestype;
    return this;
  }

  /**
   * 刷新有效期类型： expirestype等于1时，刷新后token有效期为3天； expirestype等于2时，刷新后token有效期为1年； expirestype为其他值时，抛错参数值非法。
   * @return expirestype
  **/
  @ApiModelProperty(required = true, value = "刷新有效期类型： expirestype等于1时，刷新后token有效期为3天； expirestype等于2时，刷新后token有效期为1年； expirestype为其他值时，抛错参数值非法。")
      @NotNull

    public Long getExpirestype() {
    return expirestype;
  }

  public void setExpirestype(Long expirestype) {
    this.expirestype = expirestype;
  }

  public Auth1RefreshtokenReq userid(String userid) {
    this.userid = userid;
    return this;
  }

  /**
   * 用户id
   * @return userid
  **/
  @ApiModelProperty(required = true, value = "用户id")
      @NotNull

    public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1RefreshtokenReq auth1RefreshtokenReq = (Auth1RefreshtokenReq) o;
    return Objects.equals(this.tokenid, auth1RefreshtokenReq.tokenid) &&
        Objects.equals(this.expirestype, auth1RefreshtokenReq.expirestype) &&
        Objects.equals(this.userid, auth1RefreshtokenReq.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenid, expirestype, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1RefreshtokenReq {\n");
    
    sb.append("    tokenid: ").append(toIndentedString(tokenid)).append("\n");
    sb.append("    expirestype: ").append(toIndentedString(expirestype)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
