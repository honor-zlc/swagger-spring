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
 * OwnerGetResOwnerinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class OwnerGetResOwnerinfo   {
  @JsonProperty("userid")
  private String userid = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("inheritpath")
  private String inheritpath = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  public OwnerGetResOwnerinfo userid(String userid) {
    this.userid = userid;
    return this;
  }

  /**
   * 用户ID
   * @return userid
  **/
  @ApiModelProperty(required = true, value = "用户ID")
      @NotNull

    public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public OwnerGetResOwnerinfo account(String account) {
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

  public OwnerGetResOwnerinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 用户的显示名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "用户的显示名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OwnerGetResOwnerinfo inheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
    return this;
  }

  /**
   * 所有者的继承路径
   * @return inheritpath
  **/
  @ApiModelProperty(required = true, value = "所有者的继承路径")
      @NotNull

    public String getInheritpath() {
    return inheritpath;
  }

  public void setInheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
  }

  public OwnerGetResOwnerinfo csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 用户密级
   * @return csflevel
  **/
  @ApiModelProperty(required = true, value = "用户密级")
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
    OwnerGetResOwnerinfo ownerGetResOwnerinfo = (OwnerGetResOwnerinfo) o;
    return Objects.equals(this.userid, ownerGetResOwnerinfo.userid) &&
        Objects.equals(this.account, ownerGetResOwnerinfo.account) &&
        Objects.equals(this.name, ownerGetResOwnerinfo.name) &&
        Objects.equals(this.inheritpath, ownerGetResOwnerinfo.inheritpath) &&
        Objects.equals(this.csflevel, ownerGetResOwnerinfo.csflevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, account, name, inheritpath, csflevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerGetResOwnerinfo {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inheritpath: ").append(toIndentedString(inheritpath)).append("\n");
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
