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
 * oem配置信息
 */
@ApiModel(description = "oem配置信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigResOemconfig   {
  @JsonProperty("allowauthlowcsfuser")
  private Boolean allowauthlowcsfuser = null;

  @JsonProperty("allowowner")
  private Boolean allowowner = null;

  @JsonProperty("cadpreview")
  private Boolean cadpreview = null;

  @JsonProperty("clearcache")
  private Boolean clearcache = null;

  @JsonProperty("clientlogouttime")
  private Long clientlogouttime = null;

  @JsonProperty("defaultpermexpireddays")
  private Long defaultpermexpireddays = null;

  @JsonProperty("enableclientmanuallogin")
  private Boolean enableclientmanuallogin = null;

  @JsonProperty("enablecsflevel")
  private Boolean enablecsflevel = null;

  @JsonProperty("enablefiletransferlimit")
  private Boolean enablefiletransferlimit = null;

  @JsonProperty("enablehttplinkaudit")
  private Boolean enablehttplinkaudit = null;

  @JsonProperty("enableonedrive")
  private Boolean enableonedrive = null;

  @JsonProperty("enableshareaudit")
  private Boolean enableshareaudit = null;

  @JsonProperty("enableuseragreement")
  private Boolean enableuseragreement = null;

  @JsonProperty("hidecachesetting")
  private Boolean hidecachesetting = null;

  @JsonProperty("indefiniteperm")
  private Boolean indefiniteperm = null;

  @JsonProperty("maxpassexpireddays")
  private Long maxpassexpireddays = null;

  @JsonProperty("owasurl")
  private String owasurl = null;

  @JsonProperty("rememberpass")
  private Boolean rememberpass = null;

  @JsonProperty("sursenpreview")
  private Boolean sursenpreview = null;

  @JsonProperty("wopiurl")
  private String wopiurl = null;

  @JsonProperty("cadtool")
  private String cadtool = null;

  @JsonProperty("cadurl")
  private String cadurl = null;

  public Auth1GetconfigResOemconfig allowauthlowcsfuser(Boolean allowauthlowcsfuser) {
    this.allowauthlowcsfuser = allowauthlowcsfuser;
    return this;
  }

  /**
   * 权限配置，是否允许给密级低于文件密级的用户配置权限
   * @return allowauthlowcsfuser
  **/
  @ApiModelProperty(required = true, value = "权限配置，是否允许给密级低于文件密级的用户配置权限")
      @NotNull

    public Boolean isAllowauthlowcsfuser() {
    return allowauthlowcsfuser;
  }

  public void setAllowauthlowcsfuser(Boolean allowauthlowcsfuser) {
    this.allowauthlowcsfuser = allowauthlowcsfuser;
  }

  public Auth1GetconfigResOemconfig allowowner(Boolean allowowner) {
    this.allowowner = allowowner;
    return this;
  }

  /**
   * 权限配置，是否允许配置所有者
   * @return allowowner
  **/
  @ApiModelProperty(required = true, value = "权限配置，是否允许配置所有者")
      @NotNull

    public Boolean isAllowowner() {
    return allowowner;
  }

  public void setAllowowner(Boolean allowowner) {
    this.allowowner = allowowner;
  }

  public Auth1GetconfigResOemconfig cadpreview(Boolean cadpreview) {
    this.cadpreview = cadpreview;
    return this;
  }

  /**
   * 是否启用CAD预览服务
   * @return cadpreview
  **/
  @ApiModelProperty(required = true, value = "是否启用CAD预览服务")
      @NotNull

    public Boolean isCadpreview() {
    return cadpreview;
  }

  public void setCadpreview(Boolean cadpreview) {
    this.cadpreview = cadpreview;
  }

  public Auth1GetconfigResOemconfig clearcache(Boolean clearcache) {
    this.clearcache = clearcache;
    return this;
  }

  /**
   * 客户端退出时，是否强制清除缓存
   * @return clearcache
  **/
  @ApiModelProperty(required = true, value = "客户端退出时，是否强制清除缓存")
      @NotNull

    public Boolean isClearcache() {
    return clearcache;
  }

  public void setClearcache(Boolean clearcache) {
    this.clearcache = clearcache;
  }

  public Auth1GetconfigResOemconfig clientlogouttime(Long clientlogouttime) {
    this.clientlogouttime = clientlogouttime;
    return this;
  }

  /**
   * 客户端超时退出时间，单位为分钟  -1表示不开启超时退出  其它值表示多少分钟后退出  例如30表示30分钟超时后退出
   * @return clientlogouttime
  **/
  @ApiModelProperty(required = true, value = "客户端超时退出时间，单位为分钟  -1表示不开启超时退出  其它值表示多少分钟后退出  例如30表示30分钟超时后退出")
      @NotNull

    public Long getClientlogouttime() {
    return clientlogouttime;
  }

  public void setClientlogouttime(Long clientlogouttime) {
    this.clientlogouttime = clientlogouttime;
  }

  public Auth1GetconfigResOemconfig defaultpermexpireddays(Long defaultpermexpireddays) {
    this.defaultpermexpireddays = defaultpermexpireddays;
    return this;
  }

  /**
   * 客户端配置权限时，默认权限有效天数  -1为无限期
   * @return defaultpermexpireddays
  **/
  @ApiModelProperty(required = true, value = "客户端配置权限时，默认权限有效天数  -1为无限期")
      @NotNull

    public Long getDefaultpermexpireddays() {
    return defaultpermexpireddays;
  }

  public void setDefaultpermexpireddays(Long defaultpermexpireddays) {
    this.defaultpermexpireddays = defaultpermexpireddays;
  }

  public Auth1GetconfigResOemconfig enableclientmanuallogin(Boolean enableclientmanuallogin) {
    this.enableclientmanuallogin = enableclientmanuallogin;
    return this;
  }

  /**
   * 是否允许AnyShare客户端手动登录
   * @return enableclientmanuallogin
  **/
  @ApiModelProperty(required = true, value = "是否允许AnyShare客户端手动登录")
      @NotNull

    public Boolean isEnableclientmanuallogin() {
    return enableclientmanuallogin;
  }

  public void setEnableclientmanuallogin(Boolean enableclientmanuallogin) {
    this.enableclientmanuallogin = enableclientmanuallogin;
  }

  public Auth1GetconfigResOemconfig enablecsflevel(Boolean enablecsflevel) {
    this.enablecsflevel = enablecsflevel;
    return this;
  }

  /**
   * 是否开启更改密级审核  true表示开启  false表示关闭
   * @return enablecsflevel
  **/
  @ApiModelProperty(required = true, value = "是否开启更改密级审核  true表示开启  false表示关闭")
      @NotNull

    public Boolean isEnablecsflevel() {
    return enablecsflevel;
  }

  public void setEnablecsflevel(Boolean enablecsflevel) {
    this.enablecsflevel = enablecsflevel;
  }

  public Auth1GetconfigResOemconfig enablefiletransferlimit(Boolean enablefiletransferlimit) {
    this.enablefiletransferlimit = enablefiletransferlimit;
    return this;
  }

  /**
   * 是否开启文件传输限制功能
   * @return enablefiletransferlimit
  **/
  @ApiModelProperty(required = true, value = "是否开启文件传输限制功能")
      @NotNull

    public Boolean isEnablefiletransferlimit() {
    return enablefiletransferlimit;
  }

  public void setEnablefiletransferlimit(Boolean enablefiletransferlimit) {
    this.enablefiletransferlimit = enablefiletransferlimit;
  }

  public Auth1GetconfigResOemconfig enablehttplinkaudit(Boolean enablehttplinkaudit) {
    this.enablehttplinkaudit = enablehttplinkaudit;
    return this;
  }

  /**
   * 是否开启http共享审核  true表示开启  false表示关闭
   * @return enablehttplinkaudit
  **/
  @ApiModelProperty(required = true, value = "是否开启http共享审核  true表示开启  false表示关闭")
      @NotNull

    public Boolean isEnablehttplinkaudit() {
    return enablehttplinkaudit;
  }

  public void setEnablehttplinkaudit(Boolean enablehttplinkaudit) {
    this.enablehttplinkaudit = enablehttplinkaudit;
  }

  public Auth1GetconfigResOemconfig enableonedrive(Boolean enableonedrive) {
    this.enableonedrive = enableonedrive;
    return this;
  }

  /**
   * 是否启用onedrive跳转，默认为false
   * @return enableonedrive
  **/
  @ApiModelProperty(required = true, value = "是否启用onedrive跳转，默认为false")
      @NotNull

    public Boolean isEnableonedrive() {
    return enableonedrive;
  }

  public void setEnableonedrive(Boolean enableonedrive) {
    this.enableonedrive = enableonedrive;
  }

  public Auth1GetconfigResOemconfig enableshareaudit(Boolean enableshareaudit) {
    this.enableshareaudit = enableshareaudit;
    return this;
  }

  /**
   * 是否开启共享审核  true表示开启  false表示关闭
   * @return enableshareaudit
  **/
  @ApiModelProperty(required = true, value = "是否开启共享审核  true表示开启  false表示关闭")
      @NotNull

    public Boolean isEnableshareaudit() {
    return enableshareaudit;
  }

  public void setEnableshareaudit(Boolean enableshareaudit) {
    this.enableshareaudit = enableshareaudit;
  }

  public Auth1GetconfigResOemconfig enableuseragreement(Boolean enableuseragreement) {
    this.enableuseragreement = enableuseragreement;
    return this;
  }

  /**
   * 是否显示用户协议，默认为false
   * @return enableuseragreement
  **/
  @ApiModelProperty(required = true, value = "是否显示用户协议，默认为false")
      @NotNull

    public Boolean isEnableuseragreement() {
    return enableuseragreement;
  }

  public void setEnableuseragreement(Boolean enableuseragreement) {
    this.enableuseragreement = enableuseragreement;
  }

  public Auth1GetconfigResOemconfig hidecachesetting(Boolean hidecachesetting) {
    this.hidecachesetting = hidecachesetting;
    return this;
  }

  /**
   * 客户端是否隐藏缓存设置
   * @return hidecachesetting
  **/
  @ApiModelProperty(required = true, value = "客户端是否隐藏缓存设置")
      @NotNull

    public Boolean isHidecachesetting() {
    return hidecachesetting;
  }

  public void setHidecachesetting(Boolean hidecachesetting) {
    this.hidecachesetting = hidecachesetting;
  }

  public Auth1GetconfigResOemconfig indefiniteperm(Boolean indefiniteperm) {
    this.indefiniteperm = indefiniteperm;
    return this;
  }

  /**
   * 权限配置，截至时间是否支持无限期
   * @return indefiniteperm
  **/
  @ApiModelProperty(required = true, value = "权限配置，截至时间是否支持无限期")
      @NotNull

    public Boolean isIndefiniteperm() {
    return indefiniteperm;
  }

  public void setIndefiniteperm(Boolean indefiniteperm) {
    this.indefiniteperm = indefiniteperm;
  }

  public Auth1GetconfigResOemconfig maxpassexpireddays(Long maxpassexpireddays) {
    this.maxpassexpireddays = maxpassexpireddays;
    return this;
  }

  /**
   * 密码配置，密码允许的最大过期天数  -1为永久
   * @return maxpassexpireddays
  **/
  @ApiModelProperty(required = true, value = "密码配置，密码允许的最大过期天数  -1为永久")
      @NotNull

    public Long getMaxpassexpireddays() {
    return maxpassexpireddays;
  }

  public void setMaxpassexpireddays(Long maxpassexpireddays) {
    this.maxpassexpireddays = maxpassexpireddays;
  }

  public Auth1GetconfigResOemconfig owasurl(String owasurl) {
    this.owasurl = owasurl;
    return this;
  }

  /**
   * OWAS的预览url，如果未配置则为空字符串
   * @return owasurl
  **/
  @ApiModelProperty(required = true, value = "OWAS的预览url，如果未配置则为空字符串")
      @NotNull

    public String getOwasurl() {
    return owasurl;
  }

  public void setOwasurl(String owasurl) {
    this.owasurl = owasurl;
  }

  public Auth1GetconfigResOemconfig rememberpass(Boolean rememberpass) {
    this.rememberpass = rememberpass;
    return this;
  }

  /**
   * 登录配置，是否允许记住用户名和密码
   * @return rememberpass
  **/
  @ApiModelProperty(required = true, value = "登录配置，是否允许记住用户名和密码")
      @NotNull

    public Boolean isRememberpass() {
    return rememberpass;
  }

  public void setRememberpass(Boolean rememberpass) {
    this.rememberpass = rememberpass;
  }

  public Auth1GetconfigResOemconfig sursenpreview(Boolean sursenpreview) {
    this.sursenpreview = sursenpreview;
    return this;
  }

  /**
   * 是否开启gd/sep预览
   * @return sursenpreview
  **/
  @ApiModelProperty(required = true, value = "是否开启gd/sep预览")
      @NotNull

    public Boolean isSursenpreview() {
    return sursenpreview;
  }

  public void setSursenpreview(Boolean sursenpreview) {
    this.sursenpreview = sursenpreview;
  }

  public Auth1GetconfigResOemconfig wopiurl(String wopiurl) {
    this.wopiurl = wopiurl;
    return this;
  }

  /**
   * WOPI的url，如果未配置则为空字符串
   * @return wopiurl
  **/
  @ApiModelProperty(required = true, value = "WOPI的url，如果未配置则为空字符串")
      @NotNull

    public String getWopiurl() {
    return wopiurl;
  }

  public void setWopiurl(String wopiurl) {
    this.wopiurl = wopiurl;
  }

  public Auth1GetconfigResOemconfig cadtool(String cadtool) {
    this.cadtool = cadtool;
    return this;
  }

  /**
   * 配置的转换服务类型，cadpreview为true时返回 \"mx\"为梦想CAD \"hc\"为浩辰CAD
   * @return cadtool
  **/
  @ApiModelProperty(value = "配置的转换服务类型，cadpreview为true时返回 \"mx\"为梦想CAD \"hc\"为浩辰CAD")
  
    public String getCadtool() {
    return cadtool;
  }

  public void setCadtool(String cadtool) {
    this.cadtool = cadtool;
  }

  public Auth1GetconfigResOemconfig cadurl(String cadurl) {
    this.cadurl = cadurl;
    return this;
  }

  /**
   * CAD服务器地址 cadpreview为true，且cadtool为\"hc\"时返回
   * @return cadurl
  **/
  @ApiModelProperty(value = "CAD服务器地址 cadpreview为true，且cadtool为\"hc\"时返回")
  
    public String getCadurl() {
    return cadurl;
  }

  public void setCadurl(String cadurl) {
    this.cadurl = cadurl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResOemconfig auth1GetconfigResOemconfig = (Auth1GetconfigResOemconfig) o;
    return Objects.equals(this.allowauthlowcsfuser, auth1GetconfigResOemconfig.allowauthlowcsfuser) &&
        Objects.equals(this.allowowner, auth1GetconfigResOemconfig.allowowner) &&
        Objects.equals(this.cadpreview, auth1GetconfigResOemconfig.cadpreview) &&
        Objects.equals(this.clearcache, auth1GetconfigResOemconfig.clearcache) &&
        Objects.equals(this.clientlogouttime, auth1GetconfigResOemconfig.clientlogouttime) &&
        Objects.equals(this.defaultpermexpireddays, auth1GetconfigResOemconfig.defaultpermexpireddays) &&
        Objects.equals(this.enableclientmanuallogin, auth1GetconfigResOemconfig.enableclientmanuallogin) &&
        Objects.equals(this.enablecsflevel, auth1GetconfigResOemconfig.enablecsflevel) &&
        Objects.equals(this.enablefiletransferlimit, auth1GetconfigResOemconfig.enablefiletransferlimit) &&
        Objects.equals(this.enablehttplinkaudit, auth1GetconfigResOemconfig.enablehttplinkaudit) &&
        Objects.equals(this.enableonedrive, auth1GetconfigResOemconfig.enableonedrive) &&
        Objects.equals(this.enableshareaudit, auth1GetconfigResOemconfig.enableshareaudit) &&
        Objects.equals(this.enableuseragreement, auth1GetconfigResOemconfig.enableuseragreement) &&
        Objects.equals(this.hidecachesetting, auth1GetconfigResOemconfig.hidecachesetting) &&
        Objects.equals(this.indefiniteperm, auth1GetconfigResOemconfig.indefiniteperm) &&
        Objects.equals(this.maxpassexpireddays, auth1GetconfigResOemconfig.maxpassexpireddays) &&
        Objects.equals(this.owasurl, auth1GetconfigResOemconfig.owasurl) &&
        Objects.equals(this.rememberpass, auth1GetconfigResOemconfig.rememberpass) &&
        Objects.equals(this.sursenpreview, auth1GetconfigResOemconfig.sursenpreview) &&
        Objects.equals(this.wopiurl, auth1GetconfigResOemconfig.wopiurl) &&
        Objects.equals(this.cadtool, auth1GetconfigResOemconfig.cadtool) &&
        Objects.equals(this.cadurl, auth1GetconfigResOemconfig.cadurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowauthlowcsfuser, allowowner, cadpreview, clearcache, clientlogouttime, defaultpermexpireddays, enableclientmanuallogin, enablecsflevel, enablefiletransferlimit, enablehttplinkaudit, enableonedrive, enableshareaudit, enableuseragreement, hidecachesetting, indefiniteperm, maxpassexpireddays, owasurl, rememberpass, sursenpreview, wopiurl, cadtool, cadurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResOemconfig {\n");
    
    sb.append("    allowauthlowcsfuser: ").append(toIndentedString(allowauthlowcsfuser)).append("\n");
    sb.append("    allowowner: ").append(toIndentedString(allowowner)).append("\n");
    sb.append("    cadpreview: ").append(toIndentedString(cadpreview)).append("\n");
    sb.append("    clearcache: ").append(toIndentedString(clearcache)).append("\n");
    sb.append("    clientlogouttime: ").append(toIndentedString(clientlogouttime)).append("\n");
    sb.append("    defaultpermexpireddays: ").append(toIndentedString(defaultpermexpireddays)).append("\n");
    sb.append("    enableclientmanuallogin: ").append(toIndentedString(enableclientmanuallogin)).append("\n");
    sb.append("    enablecsflevel: ").append(toIndentedString(enablecsflevel)).append("\n");
    sb.append("    enablefiletransferlimit: ").append(toIndentedString(enablefiletransferlimit)).append("\n");
    sb.append("    enablehttplinkaudit: ").append(toIndentedString(enablehttplinkaudit)).append("\n");
    sb.append("    enableonedrive: ").append(toIndentedString(enableonedrive)).append("\n");
    sb.append("    enableshareaudit: ").append(toIndentedString(enableshareaudit)).append("\n");
    sb.append("    enableuseragreement: ").append(toIndentedString(enableuseragreement)).append("\n");
    sb.append("    hidecachesetting: ").append(toIndentedString(hidecachesetting)).append("\n");
    sb.append("    indefiniteperm: ").append(toIndentedString(indefiniteperm)).append("\n");
    sb.append("    maxpassexpireddays: ").append(toIndentedString(maxpassexpireddays)).append("\n");
    sb.append("    owasurl: ").append(toIndentedString(owasurl)).append("\n");
    sb.append("    rememberpass: ").append(toIndentedString(rememberpass)).append("\n");
    sb.append("    sursenpreview: ").append(toIndentedString(sursenpreview)).append("\n");
    sb.append("    wopiurl: ").append(toIndentedString(wopiurl)).append("\n");
    sb.append("    cadtool: ").append(toIndentedString(cadtool)).append("\n");
    sb.append("    cadurl: ").append(toIndentedString(cadurl)).append("\n");
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
