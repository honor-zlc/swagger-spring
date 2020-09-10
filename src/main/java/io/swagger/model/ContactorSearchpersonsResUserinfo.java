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
 * 联系人信息
 */
@ApiModel(description = "联系人信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorSearchpersonsResUserinfo   {
  @JsonProperty("account")
  private String account = null;

  @JsonProperty("groupid")
  private String groupid = null;

  @JsonProperty("groupname")
  private String groupname = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("userid")
  private String userid = null;

  public ContactorSearchpersonsResUserinfo account(String account) {
    this.account = account;
    return this;
  }

  /**
   * 用户名
   * @return account
  **/
  @ApiModelProperty(required = true, value = "用户名")
      @NotNull

    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public ContactorSearchpersonsResUserinfo groupid(String groupid) {
    this.groupid = groupid;
    return this;
  }

  /**
   * 联系人组id
   * @return groupid
  **/
  @ApiModelProperty(required = true, value = "联系人组id")
      @NotNull

    public String getGroupid() {
    return groupid;
  }

  public void setGroupid(String groupid) {
    this.groupid = groupid;
  }

  public ContactorSearchpersonsResUserinfo groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

  /**
   * 联系人组名
   * @return groupname
  **/
  @ApiModelProperty(required = true, value = "联系人组名")
      @NotNull

    public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  public ContactorSearchpersonsResUserinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 显示名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "显示名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactorSearchpersonsResUserinfo userid(String userid) {
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
    ContactorSearchpersonsResUserinfo contactorSearchpersonsResUserinfo = (ContactorSearchpersonsResUserinfo) o;
    return Objects.equals(this.account, contactorSearchpersonsResUserinfo.account) &&
        Objects.equals(this.groupid, contactorSearchpersonsResUserinfo.groupid) &&
        Objects.equals(this.groupname, contactorSearchpersonsResUserinfo.groupname) &&
        Objects.equals(this.name, contactorSearchpersonsResUserinfo.name) &&
        Objects.equals(this.userid, contactorSearchpersonsResUserinfo.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, groupid, groupname, name, userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorSearchpersonsResUserinfo {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
