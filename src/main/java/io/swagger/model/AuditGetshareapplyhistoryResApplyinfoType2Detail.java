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
 * 具体的申请信息，根据apptype，所包含的字段不同
 */
@ApiModel(description = "具体的申请信息，根据apptype，所包含的字段不同")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetshareapplyhistoryResApplyinfoType2Detail   {
  @JsonProperty("accessLimit")
  private Long accessLimit = null;

  @JsonProperty("auditmsg")
  private String auditmsg = null;

  @JsonProperty("endtime")
  private Long endtime = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("optype")
  private Long optype = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("perm")
  private Long perm = null;

  @JsonProperty("watermarkConfig")
  private String watermarkConfig = null;

  public AuditGetshareapplyhistoryResApplyinfoType2Detail accessLimit(Long accessLimit) {
    this.accessLimit = accessLimit;
    return this;
  }

  /**
   * 最大访问次数，-1表示不限制
   * @return accessLimit
  **/
  @ApiModelProperty(required = true, value = "最大访问次数，-1表示不限制")
      @NotNull

    public Long getAccessLimit() {
    return accessLimit;
  }

  public void setAccessLimit(Long accessLimit) {
    this.accessLimit = accessLimit;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail auditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
    return this;
  }

  /**
   * 审核说明
   * @return auditmsg
  **/
  @ApiModelProperty(required = true, value = "审核说明")
      @NotNull

    public String getAuditmsg() {
    return auditmsg;
  }

  public void setAuditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 截止时间
   * @return endtime
  **/
  @ApiModelProperty(required = true, value = "截止时间")
      @NotNull

    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail link(String link) {
    this.link = link;
    return this;
  }

  /**
   * 外链唯一标识
   * @return link
  **/
  @ApiModelProperty(required = true, value = "外链唯一标识")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail optype(Long optype) {
    this.optype = optype;
    return this;
  }

  /**
   * 外链操作类型  1表示新增  2表示编辑
   * @return optype
  **/
  @ApiModelProperty(required = true, value = "外链操作类型  1表示新增  2表示编辑")
      @NotNull

    public Long getOptype() {
    return optype;
  }

  public void setOptype(Long optype) {
    this.optype = optype;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 访问密码
   * @return password
  **/
  @ApiModelProperty(required = true, value = "访问密码")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 外链权限
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "外链权限")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail watermarkConfig(String watermarkConfig) {
    this.watermarkConfig = watermarkConfig;
    return this;
  }

  /**
   * 水印配置信息
   * @return watermarkConfig
  **/
  @ApiModelProperty(required = true, value = "水印配置信息")
      @NotNull

    public String getWatermarkConfig() {
    return watermarkConfig;
  }

  public void setWatermarkConfig(String watermarkConfig) {
    this.watermarkConfig = watermarkConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetshareapplyhistoryResApplyinfoType2Detail auditGetshareapplyhistoryResApplyinfoType2Detail = (AuditGetshareapplyhistoryResApplyinfoType2Detail) o;
    return Objects.equals(this.accessLimit, auditGetshareapplyhistoryResApplyinfoType2Detail.accessLimit) &&
        Objects.equals(this.auditmsg, auditGetshareapplyhistoryResApplyinfoType2Detail.auditmsg) &&
        Objects.equals(this.endtime, auditGetshareapplyhistoryResApplyinfoType2Detail.endtime) &&
        Objects.equals(this.link, auditGetshareapplyhistoryResApplyinfoType2Detail.link) &&
        Objects.equals(this.optype, auditGetshareapplyhistoryResApplyinfoType2Detail.optype) &&
        Objects.equals(this.password, auditGetshareapplyhistoryResApplyinfoType2Detail.password) &&
        Objects.equals(this.perm, auditGetshareapplyhistoryResApplyinfoType2Detail.perm) &&
        Objects.equals(this.watermarkConfig, auditGetshareapplyhistoryResApplyinfoType2Detail.watermarkConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLimit, auditmsg, endtime, link, optype, password, perm, watermarkConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapplyhistoryResApplyinfoType2Detail {\n");
    
    sb.append("    accessLimit: ").append(toIndentedString(accessLimit)).append("\n");
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    optype: ").append(toIndentedString(optype)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    watermarkConfig: ").append(toIndentedString(watermarkConfig)).append("\n");
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
