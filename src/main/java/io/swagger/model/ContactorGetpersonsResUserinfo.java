package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactorGetpersonsResUserinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorGetpersonsResUserinfo   {
  @JsonProperty("departname")
  @Valid
  private List<String> departname = new ArrayList<String>();

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("userid")
  private String userid = null;

  @JsonProperty("username")
  private String username = null;

  public ContactorGetpersonsResUserinfo departname(List<String> departname) {
    this.departname = departname;
    return this;
  }

  public ContactorGetpersonsResUserinfo addDepartnameItem(String departnameItem) {
    this.departname.add(departnameItem);
    return this;
  }

  /**
   * 联系人所属部门名称
   * @return departname
  **/
  @ApiModelProperty(required = true, value = "联系人所属部门名称")
      @NotNull

    public List<String> getDepartname() {
    return departname;
  }

  public void setDepartname(List<String> departname) {
    this.departname = departname;
  }

  public ContactorGetpersonsResUserinfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * 用户邮箱地址
   * @return email
  **/
  @ApiModelProperty(required = true, value = "用户邮箱地址")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactorGetpersonsResUserinfo userid(String userid) {
    this.userid = userid;
    return this;
  }

  /**
   * 用户唯一标识
   * @return userid
  **/
  @ApiModelProperty(required = true, value = "用户唯一标识")
      @NotNull

    public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public ContactorGetpersonsResUserinfo username(String username) {
    this.username = username;
    return this;
  }

  /**
   * 用户显示名
   * @return username
  **/
  @ApiModelProperty(required = true, value = "用户显示名")
      @NotNull

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorGetpersonsResUserinfo contactorGetpersonsResUserinfo = (ContactorGetpersonsResUserinfo) o;
    return Objects.equals(this.departname, contactorGetpersonsResUserinfo.departname) &&
        Objects.equals(this.email, contactorGetpersonsResUserinfo.email) &&
        Objects.equals(this.userid, contactorGetpersonsResUserinfo.userid) &&
        Objects.equals(this.username, contactorGetpersonsResUserinfo.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departname, email, userid, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorGetpersonsResUserinfo {\n");
    
    sb.append("    departname: ").append(toIndentedString(departname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
