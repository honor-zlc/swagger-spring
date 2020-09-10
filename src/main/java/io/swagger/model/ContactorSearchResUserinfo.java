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
 * ContactorSearchResUserinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorSearchResUserinfo   {
  @JsonProperty("userid")
  private String userid = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("groupid")
  private String groupid = null;

  @JsonProperty("groupname")
  private String groupname = null;

  public ContactorSearchResUserinfo userid(String userid) {
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

  public ContactorSearchResUserinfo account(String account) {
    this.account = account;
    return this;
  }

  /**
   * 用户登录账号
   * @return account
  **/
  @ApiModelProperty(required = true, value = "用户登录账号")
      @NotNull

    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public ContactorSearchResUserinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 用户显示名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "用户显示名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactorSearchResUserinfo mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * 用户邮箱地址
   * @return mail
  **/
  @ApiModelProperty(required = true, value = "用户邮箱地址")
      @NotNull

    public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public ContactorSearchResUserinfo csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 用户密级，5~15
   * @return csflevel
  **/
  @ApiModelProperty(required = true, value = "用户密级，5~15")
      @NotNull

    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public ContactorSearchResUserinfo groupid(String groupid) {
    this.groupid = groupid;
    return this;
  }

  /**
   * 用户直属联系人组id
   * @return groupid
  **/
  @ApiModelProperty(required = true, value = "用户直属联系人组id")
      @NotNull

    public String getGroupid() {
    return groupid;
  }

  public void setGroupid(String groupid) {
    this.groupid = groupid;
  }

  public ContactorSearchResUserinfo groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

  /**
   * 用户直属联系人组名称
   * @return groupname
  **/
  @ApiModelProperty(required = true, value = "用户直属联系人组名称")
      @NotNull

    public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorSearchResUserinfo contactorSearchResUserinfo = (ContactorSearchResUserinfo) o;
    return Objects.equals(this.userid, contactorSearchResUserinfo.userid) &&
        Objects.equals(this.account, contactorSearchResUserinfo.account) &&
        Objects.equals(this.name, contactorSearchResUserinfo.name) &&
        Objects.equals(this.mail, contactorSearchResUserinfo.mail) &&
        Objects.equals(this.csflevel, contactorSearchResUserinfo.csflevel) &&
        Objects.equals(this.groupid, contactorSearchResUserinfo.groupid) &&
        Objects.equals(this.groupname, contactorSearchResUserinfo.groupname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, account, name, mail, csflevel, groupid, groupname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorSearchResUserinfo {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
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
