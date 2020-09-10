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
 * Auth1ModifypasswordReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1ModifypasswordReq   {
  @JsonProperty("account")
  private String account = null;

  @JsonProperty("oldpwd")
  private String oldpwd = null;

  @JsonProperty("newpwd")
  private String newpwd = null;

  public Auth1ModifypasswordReq account(String account) {
    this.account = account;
    return this;
  }

  /**
   * 用户登录名
   * @return account
  **/
  @ApiModelProperty(required = true, value = "用户登录名")
      @NotNull

    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Auth1ModifypasswordReq oldpwd(String oldpwd) {
    this.oldpwd = oldpwd;
    return this;
  }

  /**
   * 用户旧密码
   * @return oldpwd
  **/
  @ApiModelProperty(required = true, value = "用户旧密码")
      @NotNull

    public String getOldpwd() {
    return oldpwd;
  }

  public void setOldpwd(String oldpwd) {
    this.oldpwd = oldpwd;
  }

  public Auth1ModifypasswordReq newpwd(String newpwd) {
    this.newpwd = newpwd;
    return this;
  }

  /**
   * 用户新密码
   * @return newpwd
  **/
  @ApiModelProperty(required = true, value = "用户新密码")
      @NotNull

    public String getNewpwd() {
    return newpwd;
  }

  public void setNewpwd(String newpwd) {
    this.newpwd = newpwd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1ModifypasswordReq auth1ModifypasswordReq = (Auth1ModifypasswordReq) o;
    return Objects.equals(this.account, auth1ModifypasswordReq.account) &&
        Objects.equals(this.oldpwd, auth1ModifypasswordReq.oldpwd) &&
        Objects.equals(this.newpwd, auth1ModifypasswordReq.newpwd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, oldpwd, newpwd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1ModifypasswordReq {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    oldpwd: ").append(toIndentedString(oldpwd)).append("\n");
    sb.append("    newpwd: ").append(toIndentedString(newpwd)).append("\n");
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
