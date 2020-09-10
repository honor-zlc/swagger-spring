package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserGetResDirectdeptinfo;
import io.swagger.model.UserGetResRoleinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class UserGetRes   {
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

  @JsonProperty("leakproofvalue")
  private Long leakproofvalue = null;

  @JsonProperty("pwdcontrol")
  private Long pwdcontrol = null;

  @JsonProperty("usertype")
  private Long usertype = null;

  @JsonProperty("directdepinfos")
  @Valid
  private List<UserGetResDirectdeptinfo> directdepinfos = new ArrayList<UserGetResDirectdeptinfo>();

  @JsonProperty("needsecondauth")
  private Boolean needsecondauth = null;

  @JsonProperty("freezestatus")
  private Boolean freezestatus = null;

  @JsonProperty("agreedtotermsofuse")
  private Boolean agreedtotermsofuse = null;

  @JsonProperty("ismanager")
  private Boolean ismanager = null;

  @JsonProperty("telnumber")
  private String telnumber = null;

  @JsonProperty("needrealnameauth")
  private Boolean needrealnameauth = null;

  @JsonProperty("roletypes")
  @Valid
  private List<Long> roletypes = new ArrayList<Long>();

  @JsonProperty("roleinfos")
  @Valid
  private List<UserGetResRoleinfo> roleinfos = new ArrayList<UserGetResRoleinfo>();

  public UserGetRes userid(String userid) {
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

  public UserGetRes account(String account) {
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

  public UserGetRes name(String name) {
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

  public UserGetRes mail(String mail) {
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

  public UserGetRes csflevel(Long csflevel) {
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

  public UserGetRes leakproofvalue(Long leakproofvalue) {
    this.leakproofvalue = leakproofvalue;
    return this;
  }

  /**
   * 防泄密配置  0表示不允许打印，也不允许拷屏  1表示允许打印  2表示允许拷屏  3表示允许打印/拷屏
   * @return leakproofvalue
  **/
  @ApiModelProperty(required = true, value = "防泄密配置  0表示不允许打印，也不允许拷屏  1表示允许打印  2表示允许拷屏  3表示允许打印/拷屏")
      @NotNull

    public Long getLeakproofvalue() {
    return leakproofvalue;
  }

  public void setLeakproofvalue(Long leakproofvalue) {
    this.leakproofvalue = leakproofvalue;
  }

  public UserGetRes pwdcontrol(Long pwdcontrol) {
    this.pwdcontrol = pwdcontrol;
    return this;
  }

  /**
   * 是否开启管控密码  1 表示开启  0 表示关闭
   * @return pwdcontrol
  **/
  @ApiModelProperty(required = true, value = "是否开启管控密码  1 表示开启  0 表示关闭")
      @NotNull

    public Long getPwdcontrol() {
    return pwdcontrol;
  }

  public void setPwdcontrol(Long pwdcontrol) {
    this.pwdcontrol = pwdcontrol;
  }

  public UserGetRes usertype(Long usertype) {
    this.usertype = usertype;
    return this;
  }

  /**
   * 用户类型  1 表示本地用户  2 表示域用户  3 表示第三方认证用户
   * @return usertype
  **/
  @ApiModelProperty(required = true, value = "用户类型  1 表示本地用户  2 表示域用户  3 表示第三方认证用户")
      @NotNull

    public Long getUsertype() {
    return usertype;
  }

  public void setUsertype(Long usertype) {
    this.usertype = usertype;
  }

  public UserGetRes directdepinfos(List<UserGetResDirectdeptinfo> directdepinfos) {
    this.directdepinfos = directdepinfos;
    return this;
  }

  public UserGetRes addDirectdepinfosItem(UserGetResDirectdeptinfo directdepinfosItem) {
    this.directdepinfos.add(directdepinfosItem);
    return this;
  }

  /**
   * 用户的多个直属部门信息
   * @return directdepinfos
  **/
  @ApiModelProperty(required = true, value = "用户的多个直属部门信息")
      @NotNull
    @Valid
    public List<UserGetResDirectdeptinfo> getDirectdepinfos() {
    return directdepinfos;
  }

  public void setDirectdepinfos(List<UserGetResDirectdeptinfo> directdepinfos) {
    this.directdepinfos = directdepinfos;
  }

  public UserGetRes needsecondauth(Boolean needsecondauth) {
    this.needsecondauth = needsecondauth;
    return this;
  }

  /**
   * 是否需要二次认证
   * @return needsecondauth
  **/
  @ApiModelProperty(required = true, value = "是否需要二次认证")
      @NotNull

    public Boolean isNeedsecondauth() {
    return needsecondauth;
  }

  public void setNeedsecondauth(Boolean needsecondauth) {
    this.needsecondauth = needsecondauth;
  }

  public UserGetRes freezestatus(Boolean freezestatus) {
    this.freezestatus = freezestatus;
    return this;
  }

  /**
   * 冻结状态 true：冻结 false：未冻结
   * @return freezestatus
  **/
  @ApiModelProperty(required = true, value = "冻结状态 true：冻结 false：未冻结")
      @NotNull

    public Boolean isFreezestatus() {
    return freezestatus;
  }

  public void setFreezestatus(Boolean freezestatus) {
    this.freezestatus = freezestatus;
  }

  public UserGetRes agreedtotermsofuse(Boolean agreedtotermsofuse) {
    this.agreedtotermsofuse = agreedtotermsofuse;
    return this;
  }

  /**
   * 同意使用协议状态 true：同意  false：未同意
   * @return agreedtotermsofuse
  **/
  @ApiModelProperty(required = true, value = "同意使用协议状态 true：同意  false：未同意")
      @NotNull

    public Boolean isAgreedtotermsofuse() {
    return agreedtotermsofuse;
  }

  public void setAgreedtotermsofuse(Boolean agreedtotermsofuse) {
    this.agreedtotermsofuse = agreedtotermsofuse;
  }

  public UserGetRes ismanager(Boolean ismanager) {
    this.ismanager = ismanager;
    return this;
  }

  /**
   * 是否为组织管理员
   * @return ismanager
  **/
  @ApiModelProperty(required = true, value = "是否为组织管理员")
      @NotNull

    public Boolean isIsmanager() {
    return ismanager;
  }

  public void setIsmanager(Boolean ismanager) {
    this.ismanager = ismanager;
  }

  public UserGetRes telnumber(String telnumber) {
    this.telnumber = telnumber;
    return this;
  }

  /**
   * 用户手机号
   * @return telnumber
  **/
  @ApiModelProperty(required = true, value = "用户手机号")
      @NotNull

    public String getTelnumber() {
    return telnumber;
  }

  public void setTelnumber(String telnumber) {
    this.telnumber = telnumber;
  }

  public UserGetRes needrealnameauth(Boolean needrealnameauth) {
    this.needrealnameauth = needrealnameauth;
    return this;
  }

  /**
   * 用户是否需实名认证 true：需要 false : 不需要
   * @return needrealnameauth
  **/
  @ApiModelProperty(required = true, value = "用户是否需实名认证 true：需要 false : 不需要")
      @NotNull

    public Boolean isNeedrealnameauth() {
    return needrealnameauth;
  }

  public void setNeedrealnameauth(Boolean needrealnameauth) {
    this.needrealnameauth = needrealnameauth;
  }

  public UserGetRes roletypes(List<Long> roletypes) {
    this.roletypes = roletypes;
    return this;
  }

  public UserGetRes addRoletypesItem(Long roletypesItem) {
    this.roletypes.add(roletypesItem);
    return this;
  }

  /**
   * 所属角色，整数数组，每个整数表示不同的角色  1：表示文档审核员  [1]
   * @return roletypes
  **/
  @ApiModelProperty(required = true, value = "所属角色，整数数组，每个整数表示不同的角色  1：表示文档审核员  [1]")
      @NotNull

    public List<Long> getRoletypes() {
    return roletypes;
  }

  public void setRoletypes(List<Long> roletypes) {
    this.roletypes = roletypes;
  }

  public UserGetRes roleinfos(List<UserGetResRoleinfo> roleinfos) {
    this.roleinfos = roleinfos;
    return this;
  }

  public UserGetRes addRoleinfosItem(UserGetResRoleinfo roleinfosItem) {
    this.roleinfos.add(roleinfosItem);
    return this;
  }

  /**
   * 用户角色信息
   * @return roleinfos
  **/
  @ApiModelProperty(required = true, value = "用户角色信息")
      @NotNull
    @Valid
    public List<UserGetResRoleinfo> getRoleinfos() {
    return roleinfos;
  }

  public void setRoleinfos(List<UserGetResRoleinfo> roleinfos) {
    this.roleinfos = roleinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetRes userGetRes = (UserGetRes) o;
    return Objects.equals(this.userid, userGetRes.userid) &&
        Objects.equals(this.account, userGetRes.account) &&
        Objects.equals(this.name, userGetRes.name) &&
        Objects.equals(this.mail, userGetRes.mail) &&
        Objects.equals(this.csflevel, userGetRes.csflevel) &&
        Objects.equals(this.leakproofvalue, userGetRes.leakproofvalue) &&
        Objects.equals(this.pwdcontrol, userGetRes.pwdcontrol) &&
        Objects.equals(this.usertype, userGetRes.usertype) &&
        Objects.equals(this.directdepinfos, userGetRes.directdepinfos) &&
        Objects.equals(this.needsecondauth, userGetRes.needsecondauth) &&
        Objects.equals(this.freezestatus, userGetRes.freezestatus) &&
        Objects.equals(this.agreedtotermsofuse, userGetRes.agreedtotermsofuse) &&
        Objects.equals(this.ismanager, userGetRes.ismanager) &&
        Objects.equals(this.telnumber, userGetRes.telnumber) &&
        Objects.equals(this.needrealnameauth, userGetRes.needrealnameauth) &&
        Objects.equals(this.roletypes, userGetRes.roletypes) &&
        Objects.equals(this.roleinfos, userGetRes.roleinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, account, name, mail, csflevel, leakproofvalue, pwdcontrol, usertype, directdepinfos, needsecondauth, freezestatus, agreedtotermsofuse, ismanager, telnumber, needrealnameauth, roletypes, roleinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetRes {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    leakproofvalue: ").append(toIndentedString(leakproofvalue)).append("\n");
    sb.append("    pwdcontrol: ").append(toIndentedString(pwdcontrol)).append("\n");
    sb.append("    usertype: ").append(toIndentedString(usertype)).append("\n");
    sb.append("    directdepinfos: ").append(toIndentedString(directdepinfos)).append("\n");
    sb.append("    needsecondauth: ").append(toIndentedString(needsecondauth)).append("\n");
    sb.append("    freezestatus: ").append(toIndentedString(freezestatus)).append("\n");
    sb.append("    agreedtotermsofuse: ").append(toIndentedString(agreedtotermsofuse)).append("\n");
    sb.append("    ismanager: ").append(toIndentedString(ismanager)).append("\n");
    sb.append("    telnumber: ").append(toIndentedString(telnumber)).append("\n");
    sb.append("    needrealnameauth: ").append(toIndentedString(needrealnameauth)).append("\n");
    sb.append("    roletypes: ").append(toIndentedString(roletypes)).append("\n");
    sb.append("    roleinfos: ").append(toIndentedString(roleinfos)).append("\n");
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
