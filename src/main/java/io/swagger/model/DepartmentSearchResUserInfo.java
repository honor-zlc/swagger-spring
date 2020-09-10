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
 * DepartmentSearchResUserInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentSearchResUserInfo   {
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

  @JsonProperty("depid")
  private String depid = null;

  @JsonProperty("depname")
  private String depname = null;

  @JsonProperty("deppath")
  private String deppath = null;

  public DepartmentSearchResUserInfo userid(String userid) {
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

  public DepartmentSearchResUserInfo account(String account) {
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

  public DepartmentSearchResUserInfo name(String name) {
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

  public DepartmentSearchResUserInfo mail(String mail) {
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

  public DepartmentSearchResUserInfo csflevel(Long csflevel) {
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

  public DepartmentSearchResUserInfo depid(String depid) {
    this.depid = depid;
    return this;
  }

  /**
   * 用户直属部门id
   * @return depid
  **/
  @ApiModelProperty(required = true, value = "用户直属部门id")
      @NotNull

    public String getDepid() {
    return depid;
  }

  public void setDepid(String depid) {
    this.depid = depid;
  }

  public DepartmentSearchResUserInfo depname(String depname) {
    this.depname = depname;
    return this;
  }

  /**
   * 用户直属部门名称
   * @return depname
  **/
  @ApiModelProperty(required = true, value = "用户直属部门名称")
      @NotNull

    public String getDepname() {
    return depname;
  }

  public void setDepname(String depname) {
    this.depname = depname;
  }

  public DepartmentSearchResUserInfo deppath(String deppath) {
    this.deppath = deppath;
    return this;
  }

  /**
   * 部门路径
   * @return deppath
  **/
  @ApiModelProperty(required = true, value = "部门路径")
      @NotNull

    public String getDeppath() {
    return deppath;
  }

  public void setDeppath(String deppath) {
    this.deppath = deppath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentSearchResUserInfo departmentSearchResUserInfo = (DepartmentSearchResUserInfo) o;
    return Objects.equals(this.userid, departmentSearchResUserInfo.userid) &&
        Objects.equals(this.account, departmentSearchResUserInfo.account) &&
        Objects.equals(this.name, departmentSearchResUserInfo.name) &&
        Objects.equals(this.mail, departmentSearchResUserInfo.mail) &&
        Objects.equals(this.csflevel, departmentSearchResUserInfo.csflevel) &&
        Objects.equals(this.depid, departmentSearchResUserInfo.depid) &&
        Objects.equals(this.depname, departmentSearchResUserInfo.depname) &&
        Objects.equals(this.deppath, departmentSearchResUserInfo.deppath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, account, name, mail, csflevel, depid, depname, deppath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentSearchResUserInfo {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    depid: ").append(toIndentedString(depid)).append("\n");
    sb.append("    depname: ").append(toIndentedString(depname)).append("\n");
    sb.append("    deppath: ").append(toIndentedString(deppath)).append("\n");
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
