package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Auth1GetconfigResCsflevelenum;
import io.swagger.model.Auth1GetconfigResDeviceinfo;
import io.swagger.model.Auth1GetconfigResDualfactorauthserverstatus;
import io.swagger.model.Auth1GetconfigResExtapp;
import io.swagger.model.Auth1GetconfigResLimitrateconfig;
import io.swagger.model.Auth1GetconfigResOemconfig;
import io.swagger.model.Auth1GetconfigResThirdauth;
import io.swagger.model.Auth1GetconfigResThirdcsfsysconfig;
import io.swagger.model.Auth1GetconfigResVcodelonginconfig;
import io.swagger.model.Auth1GetconfigResWindowsadsso;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Auth1GetconfigRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigRes   {
  @JsonProperty("api_version")
  private String apiVersion = null;

  @JsonProperty("auto_lock_remind")
  private Boolean autoLockRemind = null;

  @JsonProperty("cad_plugin_threshold")
  private Long cadPluginThreshold = null;

  @JsonProperty("csf_level_enum")
  private Auth1GetconfigResCsflevelenum csfLevelEnum = null;

  @JsonProperty("device_info")
  private Auth1GetconfigResDeviceinfo deviceInfo = null;

  @JsonProperty("dualfactor_auth_server_status")
  private Auth1GetconfigResDualfactorauthserverstatus dualfactorAuthServerStatus = null;

  @JsonProperty("enable_doc_comment")
  private Boolean enableDocComment = null;

  @JsonProperty("enable_doc_due_remind")
  private Boolean enableDocDueRemind = null;

  @JsonProperty("enable_exit_pwd")
  private Boolean enableExitPwd = null;

  @JsonProperty("enable_invitation_share")
  private Boolean enableInvitationShare = null;

  @JsonProperty("enable_link_access_code")
  private Boolean enableLinkAccessCode = null;

  @JsonProperty("enable_message_notify")
  private Boolean enableMessageNotify = null;

  @JsonProperty("enable_outlink_watermark")
  private Boolean enableOutlinkWatermark = null;

  @JsonProperty("enable_secret_mode")
  private Boolean enableSecretMode = null;

  @JsonProperty("enable_set_folder_security_level")
  private Boolean enableSetFolderSecurityLevel = null;

  @JsonProperty("enable_strong_pwd")
  private Boolean enableStrongPwd = null;

  @JsonProperty("entrydoc_view_config")
  private Long entrydocViewConfig = null;

  @JsonProperty("extapp")
  private Auth1GetconfigResExtapp extapp = null;

  @JsonProperty("file_crawl_status")
  private Boolean fileCrawlStatus = null;

  @JsonProperty("forbid_ostype")
  private String forbidOstype = null;

  @JsonProperty("https")
  private Boolean https = null;

  @JsonProperty("id_card_login_status")
  private Boolean idCardLoginStatus = null;

  @JsonProperty("internal_link_prefix")
  private String internalLinkPrefix = null;

  @JsonProperty("limit_rate_config")
  private Auth1GetconfigResLimitrateconfig limitRateConfig = null;

  @JsonProperty("only_share_to_user")
  private Boolean onlyShareToUser = null;

  @JsonProperty("server_version")
  private String serverVersion = null;

  @JsonProperty("show_knowledge_page")
  private Long showKnowledgePage = null;

  @JsonProperty("strong_pwd_length")
  private Long strongPwdLength = null;

  @JsonProperty("tag_max_num")
  private Long tagMaxNum = null;

  @JsonProperty("third_pwd_modify_url")
  private String thirdPwdModifyUrl = null;

  @JsonProperty("vcode_login_config")
  private Auth1GetconfigResVcodelonginconfig vcodeLoginConfig = null;

  @JsonProperty("windows_ad_sso")
  private Auth1GetconfigResWindowsadsso windowsAdSso = null;

  @JsonProperty("thirdauth")
  private Auth1GetconfigResThirdauth thirdauth = null;

  @JsonProperty("third_csfsys_config")
  private Auth1GetconfigResThirdcsfsysconfig thirdCsfsysConfig = null;

  @JsonProperty("custome_application_config")
  private String customeApplicationConfig = null;

  @JsonProperty("oemconfig")
  private Auth1GetconfigResOemconfig oemconfig = null;

  @JsonProperty("smtp_server_exists")
  private Boolean smtpServerExists = null;

  public Auth1GetconfigRes apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API版本，如6.0.8    当前主版本为6；    当前次版本从0开始，若次版本发生变化，则意味着本版本的API不再向下兼容；    当小版本的格式发生变化，代表服务端升级，但API仍然向下兼容。
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "API版本，如6.0.8    当前主版本为6；    当前次版本从0开始，若次版本发生变化，则意味着本版本的API不再向下兼容；    当小版本的格式发生变化，代表服务端升级，但API仍然向下兼容。")
      @NotNull

    public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public Auth1GetconfigRes autoLockRemind(Boolean autoLockRemind) {
    this.autoLockRemind = autoLockRemind;
    return this;
  }

  /**
   * 是否开启文件锁提醒，默认开启
   * @return autoLockRemind
  **/
  @ApiModelProperty(required = true, value = "是否开启文件锁提醒，默认开启")
      @NotNull

    public Boolean isAutoLockRemind() {
    return autoLockRemind;
  }

  public void setAutoLockRemind(Boolean autoLockRemind) {
    this.autoLockRemind = autoLockRemind;
  }

  public Auth1GetconfigRes cadPluginThreshold(Long cadPluginThreshold) {
    this.cadPluginThreshold = cadPluginThreshold;
    return this;
  }

  /**
   * 浩辰CAD使用大图插件的临界值
   * @return cadPluginThreshold
  **/
  @ApiModelProperty(required = true, value = "浩辰CAD使用大图插件的临界值")
      @NotNull

    public Long getCadPluginThreshold() {
    return cadPluginThreshold;
  }

  public void setCadPluginThreshold(Long cadPluginThreshold) {
    this.cadPluginThreshold = cadPluginThreshold;
  }

  public Auth1GetconfigRes csfLevelEnum(Auth1GetconfigResCsflevelenum csfLevelEnum) {
    this.csfLevelEnum = csfLevelEnum;
    return this;
  }

  /**
   * Get csfLevelEnum
   * @return csfLevelEnum
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResCsflevelenum getCsfLevelEnum() {
    return csfLevelEnum;
  }

  public void setCsfLevelEnum(Auth1GetconfigResCsflevelenum csfLevelEnum) {
    this.csfLevelEnum = csfLevelEnum;
  }

  public Auth1GetconfigRes deviceInfo(Auth1GetconfigResDeviceinfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  /**
   * Get deviceInfo
   * @return deviceInfo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResDeviceinfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(Auth1GetconfigResDeviceinfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public Auth1GetconfigRes dualfactorAuthServerStatus(Auth1GetconfigResDualfactorauthserverstatus dualfactorAuthServerStatus) {
    this.dualfactorAuthServerStatus = dualfactorAuthServerStatus;
    return this;
  }

  /**
   * Get dualfactorAuthServerStatus
   * @return dualfactorAuthServerStatus
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResDualfactorauthserverstatus getDualfactorAuthServerStatus() {
    return dualfactorAuthServerStatus;
  }

  public void setDualfactorAuthServerStatus(Auth1GetconfigResDualfactorauthserverstatus dualfactorAuthServerStatus) {
    this.dualfactorAuthServerStatus = dualfactorAuthServerStatus;
  }

  public Auth1GetconfigRes enableDocComment(Boolean enableDocComment) {
    this.enableDocComment = enableDocComment;
    return this;
  }

  /**
   * 是否开启文件评论功能
   * @return enableDocComment
  **/
  @ApiModelProperty(required = true, value = "是否开启文件评论功能")
      @NotNull

    public Boolean isEnableDocComment() {
    return enableDocComment;
  }

  public void setEnableDocComment(Boolean enableDocComment) {
    this.enableDocComment = enableDocComment;
  }

  public Auth1GetconfigRes enableDocDueRemind(Boolean enableDocDueRemind) {
    this.enableDocDueRemind = enableDocDueRemind;
    return this;
  }

  /**
   * 是否开启文件到期提醒
   * @return enableDocDueRemind
  **/
  @ApiModelProperty(required = true, value = "是否开启文件到期提醒")
      @NotNull

    public Boolean isEnableDocDueRemind() {
    return enableDocDueRemind;
  }

  public void setEnableDocDueRemind(Boolean enableDocDueRemind) {
    this.enableDocDueRemind = enableDocDueRemind;
  }

  public Auth1GetconfigRes enableExitPwd(Boolean enableExitPwd) {
    this.enableExitPwd = enableExitPwd;
    return this;
  }

  /**
   * 是否使用退出口令
   * @return enableExitPwd
  **/
  @ApiModelProperty(required = true, value = "是否使用退出口令")
      @NotNull

    public Boolean isEnableExitPwd() {
    return enableExitPwd;
  }

  public void setEnableExitPwd(Boolean enableExitPwd) {
    this.enableExitPwd = enableExitPwd;
  }

  public Auth1GetconfigRes enableInvitationShare(Boolean enableInvitationShare) {
    this.enableInvitationShare = enableInvitationShare;
    return this;
  }

  /**
   * 是否开启共享邀请链接  true表示开启  false表示关闭
   * @return enableInvitationShare
  **/
  @ApiModelProperty(required = true, value = "是否开启共享邀请链接  true表示开启  false表示关闭")
      @NotNull

    public Boolean isEnableInvitationShare() {
    return enableInvitationShare;
  }

  public void setEnableInvitationShare(Boolean enableInvitationShare) {
    this.enableInvitationShare = enableInvitationShare;
  }

  public Auth1GetconfigRes enableLinkAccessCode(Boolean enableLinkAccessCode) {
    this.enableLinkAccessCode = enableLinkAccessCode;
    return this;
  }

  /**
   * 是否启用提取码 true表示启用 false 表示不启用
   * @return enableLinkAccessCode
  **/
  @ApiModelProperty(required = true, value = "是否启用提取码 true表示启用 false 表示不启用")
      @NotNull

    public Boolean isEnableLinkAccessCode() {
    return enableLinkAccessCode;
  }

  public void setEnableLinkAccessCode(Boolean enableLinkAccessCode) {
    this.enableLinkAccessCode = enableLinkAccessCode;
  }

  public Auth1GetconfigRes enableMessageNotify(Boolean enableMessageNotify) {
    this.enableMessageNotify = enableMessageNotify;
    return this;
  }

  /**
   * 是否启用消息通知功能
   * @return enableMessageNotify
  **/
  @ApiModelProperty(required = true, value = "是否启用消息通知功能")
      @NotNull

    public Boolean isEnableMessageNotify() {
    return enableMessageNotify;
  }

  public void setEnableMessageNotify(Boolean enableMessageNotify) {
    this.enableMessageNotify = enableMessageNotify;
  }

  public Auth1GetconfigRes enableOutlinkWatermark(Boolean enableOutlinkWatermark) {
    this.enableOutlinkWatermark = enableOutlinkWatermark;
    return this;
  }

  /**
   * 是否允许用户设置外链水印
   * @return enableOutlinkWatermark
  **/
  @ApiModelProperty(required = true, value = "是否允许用户设置外链水印")
      @NotNull

    public Boolean isEnableOutlinkWatermark() {
    return enableOutlinkWatermark;
  }

  public void setEnableOutlinkWatermark(Boolean enableOutlinkWatermark) {
    this.enableOutlinkWatermark = enableOutlinkWatermark;
  }

  public Auth1GetconfigRes enableSecretMode(Boolean enableSecretMode) {
    this.enableSecretMode = enableSecretMode;
    return this;
  }

  /**
   * 是否开启涉密模式  true表示开启  false表示关闭
   * @return enableSecretMode
  **/
  @ApiModelProperty(required = true, value = "是否开启涉密模式  true表示开启  false表示关闭")
      @NotNull

    public Boolean isEnableSecretMode() {
    return enableSecretMode;
  }

  public void setEnableSecretMode(Boolean enableSecretMode) {
    this.enableSecretMode = enableSecretMode;
  }

  public Auth1GetconfigRes enableSetFolderSecurityLevel(Boolean enableSetFolderSecurityLevel) {
    this.enableSetFolderSecurityLevel = enableSetFolderSecurityLevel;
    return this;
  }

  /**
   * 是否允许设置文件夹密级
   * @return enableSetFolderSecurityLevel
  **/
  @ApiModelProperty(required = true, value = "是否允许设置文件夹密级")
      @NotNull

    public Boolean isEnableSetFolderSecurityLevel() {
    return enableSetFolderSecurityLevel;
  }

  public void setEnableSetFolderSecurityLevel(Boolean enableSetFolderSecurityLevel) {
    this.enableSetFolderSecurityLevel = enableSetFolderSecurityLevel;
  }

  public Auth1GetconfigRes enableStrongPwd(Boolean enableStrongPwd) {
    this.enableStrongPwd = enableStrongPwd;
    return this;
  }

  /**
   * 是否开启强密码配置
   * @return enableStrongPwd
  **/
  @ApiModelProperty(required = true, value = "是否开启强密码配置")
      @NotNull

    public Boolean isEnableStrongPwd() {
    return enableStrongPwd;
  }

  public void setEnableStrongPwd(Boolean enableStrongPwd) {
    this.enableStrongPwd = enableStrongPwd;
  }

  public Auth1GetconfigRes entrydocViewConfig(Long entrydocViewConfig) {
    this.entrydocViewConfig = entrydocViewConfig;
    return this;
  }

  /**
   * Default: 2 返回入口文档视图模式 1 代表旧视图 2 代表新视图（默认）
   * @return entrydocViewConfig
  **/
  @ApiModelProperty(required = true, value = "Default: 2 返回入口文档视图模式 1 代表旧视图 2 代表新视图（默认）")
      @NotNull

    public Long getEntrydocViewConfig() {
    return entrydocViewConfig;
  }

  public void setEntrydocViewConfig(Long entrydocViewConfig) {
    this.entrydocViewConfig = entrydocViewConfig;
  }

  public Auth1GetconfigRes extapp(Auth1GetconfigResExtapp extapp) {
    this.extapp = extapp;
    return this;
  }

  /**
   * Get extapp
   * @return extapp
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResExtapp getExtapp() {
    return extapp;
  }

  public void setExtapp(Auth1GetconfigResExtapp extapp) {
    this.extapp = extapp;
  }

  public Auth1GetconfigRes fileCrawlStatus(Boolean fileCrawlStatus) {
    this.fileCrawlStatus = fileCrawlStatus;
    return this;
  }

  /**
   * 是否开启文件抓取
   * @return fileCrawlStatus
  **/
  @ApiModelProperty(required = true, value = "是否开启文件抓取")
      @NotNull

    public Boolean isFileCrawlStatus() {
    return fileCrawlStatus;
  }

  public void setFileCrawlStatus(Boolean fileCrawlStatus) {
    this.fileCrawlStatus = fileCrawlStatus;
  }

  public Auth1GetconfigRes forbidOstype(String forbidOstype) {
    this.forbidOstype = forbidOstype;
    return this;
  }

  /**
   * 按bit位计算  IOS = 1  ANDROID = 2  WINDOWSPHONE = 3  WINDOWS = 4  MACOSX = 5  WEB = 6  MOBILEWEB = 7
   * @return forbidOstype
  **/
  @ApiModelProperty(required = true, value = "按bit位计算  IOS = 1  ANDROID = 2  WINDOWSPHONE = 3  WINDOWS = 4  MACOSX = 5  WEB = 6  MOBILEWEB = 7")
      @NotNull

    public String getForbidOstype() {
    return forbidOstype;
  }

  public void setForbidOstype(String forbidOstype) {
    this.forbidOstype = forbidOstype;
  }

  public Auth1GetconfigRes https(Boolean https) {
    this.https = https;
    return this;
  }

  /**
   * 客户端是否使用https
   * @return https
  **/
  @ApiModelProperty(required = true, value = "客户端是否使用https")
      @NotNull

    public Boolean isHttps() {
    return https;
  }

  public void setHttps(Boolean https) {
    this.https = https;
  }

  public Auth1GetconfigRes idCardLoginStatus(Boolean idCardLoginStatus) {
    this.idCardLoginStatus = idCardLoginStatus;
    return this;
  }

  /**
   * 是否使用身份证登录
   * @return idCardLoginStatus
  **/
  @ApiModelProperty(required = true, value = "是否使用身份证登录")
      @NotNull

    public Boolean isIdCardLoginStatus() {
    return idCardLoginStatus;
  }

  public void setIdCardLoginStatus(Boolean idCardLoginStatus) {
    this.idCardLoginStatus = idCardLoginStatus;
  }

  public Auth1GetconfigRes internalLinkPrefix(String internalLinkPrefix) {
    this.internalLinkPrefix = internalLinkPrefix;
    return this;
  }

  /**
   * 内链地址的前缀
   * @return internalLinkPrefix
  **/
  @ApiModelProperty(required = true, value = "内链地址的前缀")
      @NotNull

    public String getInternalLinkPrefix() {
    return internalLinkPrefix;
  }

  public void setInternalLinkPrefix(String internalLinkPrefix) {
    this.internalLinkPrefix = internalLinkPrefix;
  }

  public Auth1GetconfigRes limitRateConfig(Auth1GetconfigResLimitrateconfig limitRateConfig) {
    this.limitRateConfig = limitRateConfig;
    return this;
  }

  /**
   * Get limitRateConfig
   * @return limitRateConfig
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResLimitrateconfig getLimitRateConfig() {
    return limitRateConfig;
  }

  public void setLimitRateConfig(Auth1GetconfigResLimitrateconfig limitRateConfig) {
    this.limitRateConfig = limitRateConfig;
  }

  public Auth1GetconfigRes onlyShareToUser(Boolean onlyShareToUser) {
    this.onlyShareToUser = onlyShareToUser;
    return this;
  }

  /**
   * 是否只允许共享给用户
   * @return onlyShareToUser
  **/
  @ApiModelProperty(required = true, value = "是否只允许共享给用户")
      @NotNull

    public Boolean isOnlyShareToUser() {
    return onlyShareToUser;
  }

  public void setOnlyShareToUser(Boolean onlyShareToUser) {
    this.onlyShareToUser = onlyShareToUser;
  }

  public Auth1GetconfigRes serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

  /**
   * 服务器版本信息
   * @return serverVersion
  **/
  @ApiModelProperty(required = true, value = "服务器版本信息")
      @NotNull

    public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public Auth1GetconfigRes showKnowledgePage(Long showKnowledgePage) {
    this.showKnowledgePage = showKnowledgePage;
    return this;
  }

  /**
   * 是否显示知识主页
   * @return showKnowledgePage
  **/
  @ApiModelProperty(required = true, value = "是否显示知识主页")
      @NotNull

    public Long getShowKnowledgePage() {
    return showKnowledgePage;
  }

  public void setShowKnowledgePage(Long showKnowledgePage) {
    this.showKnowledgePage = showKnowledgePage;
  }

  public Auth1GetconfigRes strongPwdLength(Long strongPwdLength) {
    this.strongPwdLength = strongPwdLength;
    return this;
  }

  /**
   * 强密码最小长度
   * @return strongPwdLength
  **/
  @ApiModelProperty(required = true, value = "强密码最小长度")
      @NotNull

    public Long getStrongPwdLength() {
    return strongPwdLength;
  }

  public void setStrongPwdLength(Long strongPwdLength) {
    this.strongPwdLength = strongPwdLength;
  }

  public Auth1GetconfigRes tagMaxNum(Long tagMaxNum) {
    this.tagMaxNum = tagMaxNum;
    return this;
  }

  /**
   * 标签的最大数量
   * @return tagMaxNum
  **/
  @ApiModelProperty(required = true, value = "标签的最大数量")
      @NotNull

    public Long getTagMaxNum() {
    return tagMaxNum;
  }

  public void setTagMaxNum(Long tagMaxNum) {
    this.tagMaxNum = tagMaxNum;
  }

  public Auth1GetconfigRes thirdPwdModifyUrl(String thirdPwdModifyUrl) {
    this.thirdPwdModifyUrl = thirdPwdModifyUrl;
    return this;
  }

  /**
   * 第三方用户密码修改地址
   * @return thirdPwdModifyUrl
  **/
  @ApiModelProperty(required = true, value = "第三方用户密码修改地址")
      @NotNull

    public String getThirdPwdModifyUrl() {
    return thirdPwdModifyUrl;
  }

  public void setThirdPwdModifyUrl(String thirdPwdModifyUrl) {
    this.thirdPwdModifyUrl = thirdPwdModifyUrl;
  }

  public Auth1GetconfigRes vcodeLoginConfig(Auth1GetconfigResVcodelonginconfig vcodeLoginConfig) {
    this.vcodeLoginConfig = vcodeLoginConfig;
    return this;
  }

  /**
   * Get vcodeLoginConfig
   * @return vcodeLoginConfig
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResVcodelonginconfig getVcodeLoginConfig() {
    return vcodeLoginConfig;
  }

  public void setVcodeLoginConfig(Auth1GetconfigResVcodelonginconfig vcodeLoginConfig) {
    this.vcodeLoginConfig = vcodeLoginConfig;
  }

  public Auth1GetconfigRes windowsAdSso(Auth1GetconfigResWindowsadsso windowsAdSso) {
    this.windowsAdSso = windowsAdSso;
    return this;
  }

  /**
   * Get windowsAdSso
   * @return windowsAdSso
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResWindowsadsso getWindowsAdSso() {
    return windowsAdSso;
  }

  public void setWindowsAdSso(Auth1GetconfigResWindowsadsso windowsAdSso) {
    this.windowsAdSso = windowsAdSso;
  }

  public Auth1GetconfigRes thirdauth(Auth1GetconfigResThirdauth thirdauth) {
    this.thirdauth = thirdauth;
    return this;
  }

  /**
   * Get thirdauth
   * @return thirdauth
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Auth1GetconfigResThirdauth getThirdauth() {
    return thirdauth;
  }

  public void setThirdauth(Auth1GetconfigResThirdauth thirdauth) {
    this.thirdauth = thirdauth;
  }

  public Auth1GetconfigRes thirdCsfsysConfig(Auth1GetconfigResThirdcsfsysconfig thirdCsfsysConfig) {
    this.thirdCsfsysConfig = thirdCsfsysConfig;
    return this;
  }

  /**
   * Get thirdCsfsysConfig
   * @return thirdCsfsysConfig
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Auth1GetconfigResThirdcsfsysconfig getThirdCsfsysConfig() {
    return thirdCsfsysConfig;
  }

  public void setThirdCsfsysConfig(Auth1GetconfigResThirdcsfsysconfig thirdCsfsysConfig) {
    this.thirdCsfsysConfig = thirdCsfsysConfig;
  }

  public Auth1GetconfigRes customeApplicationConfig(String customeApplicationConfig) {
    this.customeApplicationConfig = customeApplicationConfig;
    return this;
  }

  /**
   * 定制化的客户应用配置，用于给客户端做定制化功能的开关，格式为Json字符串。如：{\"appid\": \"CUFE\"}
   * @return customeApplicationConfig
  **/
  @ApiModelProperty(value = "定制化的客户应用配置，用于给客户端做定制化功能的开关，格式为Json字符串。如：{\"appid\": \"CUFE\"}")
  
    public String getCustomeApplicationConfig() {
    return customeApplicationConfig;
  }

  public void setCustomeApplicationConfig(String customeApplicationConfig) {
    this.customeApplicationConfig = customeApplicationConfig;
  }

  public Auth1GetconfigRes oemconfig(Auth1GetconfigResOemconfig oemconfig) {
    this.oemconfig = oemconfig;
    return this;
  }

  /**
   * Get oemconfig
   * @return oemconfig
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Auth1GetconfigResOemconfig getOemconfig() {
    return oemconfig;
  }

  public void setOemconfig(Auth1GetconfigResOemconfig oemconfig) {
    this.oemconfig = oemconfig;
  }

  public Auth1GetconfigRes smtpServerExists(Boolean smtpServerExists) {
    this.smtpServerExists = smtpServerExists;
    return this;
  }

  /**
   * SMTP服务器是否配置
   * @return smtpServerExists
  **/
  @ApiModelProperty(required = true, value = "SMTP服务器是否配置")
      @NotNull

    public Boolean isSmtpServerExists() {
    return smtpServerExists;
  }

  public void setSmtpServerExists(Boolean smtpServerExists) {
    this.smtpServerExists = smtpServerExists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigRes auth1GetconfigRes = (Auth1GetconfigRes) o;
    return Objects.equals(this.apiVersion, auth1GetconfigRes.apiVersion) &&
        Objects.equals(this.autoLockRemind, auth1GetconfigRes.autoLockRemind) &&
        Objects.equals(this.cadPluginThreshold, auth1GetconfigRes.cadPluginThreshold) &&
        Objects.equals(this.csfLevelEnum, auth1GetconfigRes.csfLevelEnum) &&
        Objects.equals(this.deviceInfo, auth1GetconfigRes.deviceInfo) &&
        Objects.equals(this.dualfactorAuthServerStatus, auth1GetconfigRes.dualfactorAuthServerStatus) &&
        Objects.equals(this.enableDocComment, auth1GetconfigRes.enableDocComment) &&
        Objects.equals(this.enableDocDueRemind, auth1GetconfigRes.enableDocDueRemind) &&
        Objects.equals(this.enableExitPwd, auth1GetconfigRes.enableExitPwd) &&
        Objects.equals(this.enableInvitationShare, auth1GetconfigRes.enableInvitationShare) &&
        Objects.equals(this.enableLinkAccessCode, auth1GetconfigRes.enableLinkAccessCode) &&
        Objects.equals(this.enableMessageNotify, auth1GetconfigRes.enableMessageNotify) &&
        Objects.equals(this.enableOutlinkWatermark, auth1GetconfigRes.enableOutlinkWatermark) &&
        Objects.equals(this.enableSecretMode, auth1GetconfigRes.enableSecretMode) &&
        Objects.equals(this.enableSetFolderSecurityLevel, auth1GetconfigRes.enableSetFolderSecurityLevel) &&
        Objects.equals(this.enableStrongPwd, auth1GetconfigRes.enableStrongPwd) &&
        Objects.equals(this.entrydocViewConfig, auth1GetconfigRes.entrydocViewConfig) &&
        Objects.equals(this.extapp, auth1GetconfigRes.extapp) &&
        Objects.equals(this.fileCrawlStatus, auth1GetconfigRes.fileCrawlStatus) &&
        Objects.equals(this.forbidOstype, auth1GetconfigRes.forbidOstype) &&
        Objects.equals(this.https, auth1GetconfigRes.https) &&
        Objects.equals(this.idCardLoginStatus, auth1GetconfigRes.idCardLoginStatus) &&
        Objects.equals(this.internalLinkPrefix, auth1GetconfigRes.internalLinkPrefix) &&
        Objects.equals(this.limitRateConfig, auth1GetconfigRes.limitRateConfig) &&
        Objects.equals(this.onlyShareToUser, auth1GetconfigRes.onlyShareToUser) &&
        Objects.equals(this.serverVersion, auth1GetconfigRes.serverVersion) &&
        Objects.equals(this.showKnowledgePage, auth1GetconfigRes.showKnowledgePage) &&
        Objects.equals(this.strongPwdLength, auth1GetconfigRes.strongPwdLength) &&
        Objects.equals(this.tagMaxNum, auth1GetconfigRes.tagMaxNum) &&
        Objects.equals(this.thirdPwdModifyUrl, auth1GetconfigRes.thirdPwdModifyUrl) &&
        Objects.equals(this.vcodeLoginConfig, auth1GetconfigRes.vcodeLoginConfig) &&
        Objects.equals(this.windowsAdSso, auth1GetconfigRes.windowsAdSso) &&
        Objects.equals(this.thirdauth, auth1GetconfigRes.thirdauth) &&
        Objects.equals(this.thirdCsfsysConfig, auth1GetconfigRes.thirdCsfsysConfig) &&
        Objects.equals(this.customeApplicationConfig, auth1GetconfigRes.customeApplicationConfig) &&
        Objects.equals(this.oemconfig, auth1GetconfigRes.oemconfig) &&
        Objects.equals(this.smtpServerExists, auth1GetconfigRes.smtpServerExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, autoLockRemind, cadPluginThreshold, csfLevelEnum, deviceInfo, dualfactorAuthServerStatus, enableDocComment, enableDocDueRemind, enableExitPwd, enableInvitationShare, enableLinkAccessCode, enableMessageNotify, enableOutlinkWatermark, enableSecretMode, enableSetFolderSecurityLevel, enableStrongPwd, entrydocViewConfig, extapp, fileCrawlStatus, forbidOstype, https, idCardLoginStatus, internalLinkPrefix, limitRateConfig, onlyShareToUser, serverVersion, showKnowledgePage, strongPwdLength, tagMaxNum, thirdPwdModifyUrl, vcodeLoginConfig, windowsAdSso, thirdauth, thirdCsfsysConfig, customeApplicationConfig, oemconfig, smtpServerExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigRes {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    autoLockRemind: ").append(toIndentedString(autoLockRemind)).append("\n");
    sb.append("    cadPluginThreshold: ").append(toIndentedString(cadPluginThreshold)).append("\n");
    sb.append("    csfLevelEnum: ").append(toIndentedString(csfLevelEnum)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    dualfactorAuthServerStatus: ").append(toIndentedString(dualfactorAuthServerStatus)).append("\n");
    sb.append("    enableDocComment: ").append(toIndentedString(enableDocComment)).append("\n");
    sb.append("    enableDocDueRemind: ").append(toIndentedString(enableDocDueRemind)).append("\n");
    sb.append("    enableExitPwd: ").append(toIndentedString(enableExitPwd)).append("\n");
    sb.append("    enableInvitationShare: ").append(toIndentedString(enableInvitationShare)).append("\n");
    sb.append("    enableLinkAccessCode: ").append(toIndentedString(enableLinkAccessCode)).append("\n");
    sb.append("    enableMessageNotify: ").append(toIndentedString(enableMessageNotify)).append("\n");
    sb.append("    enableOutlinkWatermark: ").append(toIndentedString(enableOutlinkWatermark)).append("\n");
    sb.append("    enableSecretMode: ").append(toIndentedString(enableSecretMode)).append("\n");
    sb.append("    enableSetFolderSecurityLevel: ").append(toIndentedString(enableSetFolderSecurityLevel)).append("\n");
    sb.append("    enableStrongPwd: ").append(toIndentedString(enableStrongPwd)).append("\n");
    sb.append("    entrydocViewConfig: ").append(toIndentedString(entrydocViewConfig)).append("\n");
    sb.append("    extapp: ").append(toIndentedString(extapp)).append("\n");
    sb.append("    fileCrawlStatus: ").append(toIndentedString(fileCrawlStatus)).append("\n");
    sb.append("    forbidOstype: ").append(toIndentedString(forbidOstype)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
    sb.append("    idCardLoginStatus: ").append(toIndentedString(idCardLoginStatus)).append("\n");
    sb.append("    internalLinkPrefix: ").append(toIndentedString(internalLinkPrefix)).append("\n");
    sb.append("    limitRateConfig: ").append(toIndentedString(limitRateConfig)).append("\n");
    sb.append("    onlyShareToUser: ").append(toIndentedString(onlyShareToUser)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    showKnowledgePage: ").append(toIndentedString(showKnowledgePage)).append("\n");
    sb.append("    strongPwdLength: ").append(toIndentedString(strongPwdLength)).append("\n");
    sb.append("    tagMaxNum: ").append(toIndentedString(tagMaxNum)).append("\n");
    sb.append("    thirdPwdModifyUrl: ").append(toIndentedString(thirdPwdModifyUrl)).append("\n");
    sb.append("    vcodeLoginConfig: ").append(toIndentedString(vcodeLoginConfig)).append("\n");
    sb.append("    windowsAdSso: ").append(toIndentedString(windowsAdSso)).append("\n");
    sb.append("    thirdauth: ").append(toIndentedString(thirdauth)).append("\n");
    sb.append("    thirdCsfsysConfig: ").append(toIndentedString(thirdCsfsysConfig)).append("\n");
    sb.append("    customeApplicationConfig: ").append(toIndentedString(customeApplicationConfig)).append("\n");
    sb.append("    oemconfig: ").append(toIndentedString(oemconfig)).append("\n");
    sb.append("    smtpServerExists: ").append(toIndentedString(smtpServerExists)).append("\n");
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
