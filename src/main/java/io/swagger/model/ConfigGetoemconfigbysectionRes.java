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
 * ConfigGetoemconfigbysectionRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ConfigGetoemconfigbysectionRes   {
  @JsonProperty("background.png")
  private String backgroundPng = null;

  @JsonProperty("favicon.ico")
  private String faviconIco = null;

  @JsonProperty("logo.png")
  private String logoPng = null;

  @JsonProperty("org.png")
  private String orgPng = null;

  @JsonProperty("helper")
  private String helper = null;

  @JsonProperty("organization")
  private String organization = null;

  @JsonProperty("product")
  private String product = null;

  @JsonProperty("site")
  private String site = null;

  @JsonProperty("userAgreement")
  private String userAgreement = null;

  @JsonProperty("agreementText")
  private String agreementText = null;

  @JsonProperty("android")
  private String android = null;

  @JsonProperty("ios")
  private String ios = null;

  @JsonProperty("office")
  private String office = null;

  @JsonProperty("mac")
  private String mac = null;

  @JsonProperty("windows")
  private String windows = null;

  @JsonProperty("allowCn")
  private String allowCn = null;

  @JsonProperty("allowTw")
  private String allowTw = null;

  @JsonProperty("allowEn")
  private String allowEn = null;

  @JsonProperty("theme")
  private String theme = null;

  @JsonProperty("showProduct")
  private String showProduct = null;

  @JsonProperty("showHardware")
  private String showHardware = null;

  @JsonProperty("showLicense")
  private String showLicense = null;

  @JsonProperty("showCopyright")
  private String showCopyright = null;

  public ConfigGetoemconfigbysectionRes backgroundPng(String backgroundPng) {
    this.backgroundPng = backgroundPng;
    return this;
  }

  /**
   * OEM图片资源
   * @return backgroundPng
  **/
  @ApiModelProperty(required = true, value = "OEM图片资源")
      @NotNull

    public String getBackgroundPng() {
    return backgroundPng;
  }

  public void setBackgroundPng(String backgroundPng) {
    this.backgroundPng = backgroundPng;
  }

  public ConfigGetoemconfigbysectionRes faviconIco(String faviconIco) {
    this.faviconIco = faviconIco;
    return this;
  }

  /**
   * OEM图片资源
   * @return faviconIco
  **/
  @ApiModelProperty(required = true, value = "OEM图片资源")
      @NotNull

    public String getFaviconIco() {
    return faviconIco;
  }

  public void setFaviconIco(String faviconIco) {
    this.faviconIco = faviconIco;
  }

  public ConfigGetoemconfigbysectionRes logoPng(String logoPng) {
    this.logoPng = logoPng;
    return this;
  }

  /**
   * OEM图片资源
   * @return logoPng
  **/
  @ApiModelProperty(required = true, value = "OEM图片资源")
      @NotNull

    public String getLogoPng() {
    return logoPng;
  }

  public void setLogoPng(String logoPng) {
    this.logoPng = logoPng;
  }

  public ConfigGetoemconfigbysectionRes orgPng(String orgPng) {
    this.orgPng = orgPng;
    return this;
  }

  /**
   * OEM图片资源
   * @return orgPng
  **/
  @ApiModelProperty(required = true, value = "OEM图片资源")
      @NotNull

    public String getOrgPng() {
    return orgPng;
  }

  public void setOrgPng(String orgPng) {
    this.orgPng = orgPng;
  }

  public ConfigGetoemconfigbysectionRes helper(String helper) {
    this.helper = helper;
    return this;
  }

  /**
   * 帮助文档链接地址
   * @return helper
  **/
  @ApiModelProperty(required = true, value = "帮助文档链接地址")
      @NotNull

    public String getHelper() {
    return helper;
  }

  public void setHelper(String helper) {
    this.helper = helper;
  }

  public ConfigGetoemconfigbysectionRes organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * 组织机构
   * @return organization
  **/
  @ApiModelProperty(required = true, value = "组织机构")
      @NotNull

    public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public ConfigGetoemconfigbysectionRes product(String product) {
    this.product = product;
    return this;
  }

  /**
   * 产品名称
   * @return product
  **/
  @ApiModelProperty(required = true, value = "产品名称")
      @NotNull

    public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public ConfigGetoemconfigbysectionRes site(String site) {
    this.site = site;
    return this;
  }

  /**
   * 官方链接
   * @return site
  **/
  @ApiModelProperty(required = true, value = "官方链接")
      @NotNull

    public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public ConfigGetoemconfigbysectionRes userAgreement(String userAgreement) {
    this.userAgreement = userAgreement;
    return this;
  }

  /**
   * 是否开启用户许可协议
   * @return userAgreement
  **/
  @ApiModelProperty(required = true, value = "是否开启用户许可协议")
      @NotNull

    public String getUserAgreement() {
    return userAgreement;
  }

  public void setUserAgreement(String userAgreement) {
    this.userAgreement = userAgreement;
  }

  public ConfigGetoemconfigbysectionRes agreementText(String agreementText) {
    this.agreementText = agreementText;
    return this;
  }

  /**
   * 用户许可协议
   * @return agreementText
  **/
  @ApiModelProperty(required = true, value = "用户许可协议")
      @NotNull

    public String getAgreementText() {
    return agreementText;
  }

  public void setAgreementText(String agreementText) {
    this.agreementText = agreementText;
  }

  public ConfigGetoemconfigbysectionRes android(String android) {
    this.android = android;
    return this;
  }

  /**
   * 开放android客户端下载
   * @return android
  **/
  @ApiModelProperty(required = true, value = "开放android客户端下载")
      @NotNull

    public String getAndroid() {
    return android;
  }

  public void setAndroid(String android) {
    this.android = android;
  }

  public ConfigGetoemconfigbysectionRes ios(String ios) {
    this.ios = ios;
    return this;
  }

  /**
   * 开放iOS客户端下载
   * @return ios
  **/
  @ApiModelProperty(required = true, value = "开放iOS客户端下载")
      @NotNull

    public String getIos() {
    return ios;
  }

  public void setIos(String ios) {
    this.ios = ios;
  }

  public ConfigGetoemconfigbysectionRes office(String office) {
    this.office = office;
    return this;
  }

  /**
   * 开放office插件下载
   * @return office
  **/
  @ApiModelProperty(required = true, value = "开放office插件下载")
      @NotNull

    public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public ConfigGetoemconfigbysectionRes mac(String mac) {
    this.mac = mac;
    return this;
  }

  /**
   * 开放mac客户端下载
   * @return mac
  **/
  @ApiModelProperty(required = true, value = "开放mac客户端下载")
      @NotNull

    public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public ConfigGetoemconfigbysectionRes windows(String windows) {
    this.windows = windows;
    return this;
  }

  /**
   * 开放windows客户端下载
   * @return windows
  **/
  @ApiModelProperty(required = true, value = "开放windows客户端下载")
      @NotNull

    public String getWindows() {
    return windows;
  }

  public void setWindows(String windows) {
    this.windows = windows;
  }

  public ConfigGetoemconfigbysectionRes allowCn(String allowCn) {
    this.allowCn = allowCn;
    return this;
  }

  /**
   * 允许简体中文
   * @return allowCn
  **/
  @ApiModelProperty(required = true, value = "允许简体中文")
      @NotNull

    public String getAllowCn() {
    return allowCn;
  }

  public void setAllowCn(String allowCn) {
    this.allowCn = allowCn;
  }

  public ConfigGetoemconfigbysectionRes allowTw(String allowTw) {
    this.allowTw = allowTw;
    return this;
  }

  /**
   * 允许繁体中文
   * @return allowTw
  **/
  @ApiModelProperty(required = true, value = "允许繁体中文")
      @NotNull

    public String getAllowTw() {
    return allowTw;
  }

  public void setAllowTw(String allowTw) {
    this.allowTw = allowTw;
  }

  public ConfigGetoemconfigbysectionRes allowEn(String allowEn) {
    this.allowEn = allowEn;
    return this;
  }

  /**
   * 允许英文语言
   * @return allowEn
  **/
  @ApiModelProperty(required = true, value = "允许英文语言")
      @NotNull

    public String getAllowEn() {
    return allowEn;
  }

  public void setAllowEn(String allowEn) {
    this.allowEn = allowEn;
  }

  public ConfigGetoemconfigbysectionRes theme(String theme) {
    this.theme = theme;
    return this;
  }

  /**
   * 基本颜色值
   * @return theme
  **/
  @ApiModelProperty(required = true, value = "基本颜色值")
      @NotNull

    public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public ConfigGetoemconfigbysectionRes showProduct(String showProduct) {
    this.showProduct = showProduct;
    return this;
  }

  /**
   * 显示产品信息
   * @return showProduct
  **/
  @ApiModelProperty(required = true, value = "显示产品信息")
      @NotNull

    public String getShowProduct() {
    return showProduct;
  }

  public void setShowProduct(String showProduct) {
    this.showProduct = showProduct;
  }

  public ConfigGetoemconfigbysectionRes showHardware(String showHardware) {
    this.showHardware = showHardware;
    return this;
  }

  /**
   * 显示型号信息
   * @return showHardware
  **/
  @ApiModelProperty(required = true, value = "显示型号信息")
      @NotNull

    public String getShowHardware() {
    return showHardware;
  }

  public void setShowHardware(String showHardware) {
    this.showHardware = showHardware;
  }

  public ConfigGetoemconfigbysectionRes showLicense(String showLicense) {
    this.showLicense = showLicense;
    return this;
  }

  /**
   * 显示授权信息
   * @return showLicense
  **/
  @ApiModelProperty(required = true, value = "显示授权信息")
      @NotNull

    public String getShowLicense() {
    return showLicense;
  }

  public void setShowLicense(String showLicense) {
    this.showLicense = showLicense;
  }

  public ConfigGetoemconfigbysectionRes showCopyright(String showCopyright) {
    this.showCopyright = showCopyright;
    return this;
  }

  /**
   * 显示版权信息
   * @return showCopyright
  **/
  @ApiModelProperty(required = true, value = "显示版权信息")
      @NotNull

    public String getShowCopyright() {
    return showCopyright;
  }

  public void setShowCopyright(String showCopyright) {
    this.showCopyright = showCopyright;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigGetoemconfigbysectionRes configGetoemconfigbysectionRes = (ConfigGetoemconfigbysectionRes) o;
    return Objects.equals(this.backgroundPng, configGetoemconfigbysectionRes.backgroundPng) &&
        Objects.equals(this.faviconIco, configGetoemconfigbysectionRes.faviconIco) &&
        Objects.equals(this.logoPng, configGetoemconfigbysectionRes.logoPng) &&
        Objects.equals(this.orgPng, configGetoemconfigbysectionRes.orgPng) &&
        Objects.equals(this.helper, configGetoemconfigbysectionRes.helper) &&
        Objects.equals(this.organization, configGetoemconfigbysectionRes.organization) &&
        Objects.equals(this.product, configGetoemconfigbysectionRes.product) &&
        Objects.equals(this.site, configGetoemconfigbysectionRes.site) &&
        Objects.equals(this.userAgreement, configGetoemconfigbysectionRes.userAgreement) &&
        Objects.equals(this.agreementText, configGetoemconfigbysectionRes.agreementText) &&
        Objects.equals(this.android, configGetoemconfigbysectionRes.android) &&
        Objects.equals(this.ios, configGetoemconfigbysectionRes.ios) &&
        Objects.equals(this.office, configGetoemconfigbysectionRes.office) &&
        Objects.equals(this.mac, configGetoemconfigbysectionRes.mac) &&
        Objects.equals(this.windows, configGetoemconfigbysectionRes.windows) &&
        Objects.equals(this.allowCn, configGetoemconfigbysectionRes.allowCn) &&
        Objects.equals(this.allowTw, configGetoemconfigbysectionRes.allowTw) &&
        Objects.equals(this.allowEn, configGetoemconfigbysectionRes.allowEn) &&
        Objects.equals(this.theme, configGetoemconfigbysectionRes.theme) &&
        Objects.equals(this.showProduct, configGetoemconfigbysectionRes.showProduct) &&
        Objects.equals(this.showHardware, configGetoemconfigbysectionRes.showHardware) &&
        Objects.equals(this.showLicense, configGetoemconfigbysectionRes.showLicense) &&
        Objects.equals(this.showCopyright, configGetoemconfigbysectionRes.showCopyright);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundPng, faviconIco, logoPng, orgPng, helper, organization, product, site, userAgreement, agreementText, android, ios, office, mac, windows, allowCn, allowTw, allowEn, theme, showProduct, showHardware, showLicense, showCopyright);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGetoemconfigbysectionRes {\n");
    
    sb.append("    backgroundPng: ").append(toIndentedString(backgroundPng)).append("\n");
    sb.append("    faviconIco: ").append(toIndentedString(faviconIco)).append("\n");
    sb.append("    logoPng: ").append(toIndentedString(logoPng)).append("\n");
    sb.append("    orgPng: ").append(toIndentedString(orgPng)).append("\n");
    sb.append("    helper: ").append(toIndentedString(helper)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    userAgreement: ").append(toIndentedString(userAgreement)).append("\n");
    sb.append("    agreementText: ").append(toIndentedString(agreementText)).append("\n");
    sb.append("    android: ").append(toIndentedString(android)).append("\n");
    sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    windows: ").append(toIndentedString(windows)).append("\n");
    sb.append("    allowCn: ").append(toIndentedString(allowCn)).append("\n");
    sb.append("    allowTw: ").append(toIndentedString(allowTw)).append("\n");
    sb.append("    allowEn: ").append(toIndentedString(allowEn)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    showProduct: ").append(toIndentedString(showProduct)).append("\n");
    sb.append("    showHardware: ").append(toIndentedString(showHardware)).append("\n");
    sb.append("    showLicense: ").append(toIndentedString(showLicense)).append("\n");
    sb.append("    showCopyright: ").append(toIndentedString(showCopyright)).append("\n");
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
