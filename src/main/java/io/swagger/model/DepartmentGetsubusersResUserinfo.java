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
 * DepartmentGetsubusersResUserinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentGetsubusersResUserinfo   {
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

  public DepartmentGetsubusersResUserinfo userid(String userid) {
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

  public DepartmentGetsubusersResUserinfo account(String account) {
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

  public DepartmentGetsubusersResUserinfo name(String name) {
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

  public DepartmentGetsubusersResUserinfo mail(String mail) {
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

  public DepartmentGetsubusersResUserinfo csflevel(Long csflevel) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentGetsubusersResUserinfo departmentGetsubusersResUserinfo = (DepartmentGetsubusersResUserinfo) o;
    return Objects.equals(this.userid, departmentGetsubusersResUserinfo.userid) &&
        Objects.equals(this.account, departmentGetsubusersResUserinfo.account) &&
        Objects.equals(this.name, departmentGetsubusersResUserinfo.name) &&
        Objects.equals(this.mail, departmentGetsubusersResUserinfo.mail) &&
        Objects.equals(this.csflevel, departmentGetsubusersResUserinfo.csflevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, account, name, mail, csflevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetsubusersResUserinfo {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
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
