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
 * 第三方标密系统配置，如果未开启，则不会有
 */
@ApiModel(description = "第三方标密系统配置，如果未开启，则不会有")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigResThirdcsfsysconfig   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("only_upload_classified")
  private Boolean onlyUploadClassified = null;

  @JsonProperty("only_share_classified")
  private Boolean onlyShareClassified = null;

  @JsonProperty("auto_match_doc_classfication")
  private Boolean autoMatchDocClassfication = null;

  public Auth1GetconfigResThirdcsfsysconfig id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 第三方标密系统唯一标识
   * @return id
  **/
  @ApiModelProperty(required = true, value = "第三方标密系统唯一标识")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Auth1GetconfigResThirdcsfsysconfig onlyUploadClassified(Boolean onlyUploadClassified) {
    this.onlyUploadClassified = onlyUploadClassified;
    return this;
  }

  /**
   * 是否仅上传已标密文件
   * @return onlyUploadClassified
  **/
  @ApiModelProperty(required = true, value = "是否仅上传已标密文件")
      @NotNull

    public Boolean isOnlyUploadClassified() {
    return onlyUploadClassified;
  }

  public void setOnlyUploadClassified(Boolean onlyUploadClassified) {
    this.onlyUploadClassified = onlyUploadClassified;
  }

  public Auth1GetconfigResThirdcsfsysconfig onlyShareClassified(Boolean onlyShareClassified) {
    this.onlyShareClassified = onlyShareClassified;
    return this;
  }

  /**
   * 是否仅共享已标密文件
   * @return onlyShareClassified
  **/
  @ApiModelProperty(required = true, value = "是否仅共享已标密文件")
      @NotNull

    public Boolean isOnlyShareClassified() {
    return onlyShareClassified;
  }

  public void setOnlyShareClassified(Boolean onlyShareClassified) {
    this.onlyShareClassified = onlyShareClassified;
  }

  public Auth1GetconfigResThirdcsfsysconfig autoMatchDocClassfication(Boolean autoMatchDocClassfication) {
    this.autoMatchDocClassfication = autoMatchDocClassfication;
    return this;
  }

  /**
   * 是否自动识别文件密级
   * @return autoMatchDocClassfication
  **/
  @ApiModelProperty(required = true, value = "是否自动识别文件密级")
      @NotNull

    public Boolean isAutoMatchDocClassfication() {
    return autoMatchDocClassfication;
  }

  public void setAutoMatchDocClassfication(Boolean autoMatchDocClassfication) {
    this.autoMatchDocClassfication = autoMatchDocClassfication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResThirdcsfsysconfig auth1GetconfigResThirdcsfsysconfig = (Auth1GetconfigResThirdcsfsysconfig) o;
    return Objects.equals(this.id, auth1GetconfigResThirdcsfsysconfig.id) &&
        Objects.equals(this.onlyUploadClassified, auth1GetconfigResThirdcsfsysconfig.onlyUploadClassified) &&
        Objects.equals(this.onlyShareClassified, auth1GetconfigResThirdcsfsysconfig.onlyShareClassified) &&
        Objects.equals(this.autoMatchDocClassfication, auth1GetconfigResThirdcsfsysconfig.autoMatchDocClassfication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, onlyUploadClassified, onlyShareClassified, autoMatchDocClassfication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResThirdcsfsysconfig {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onlyUploadClassified: ").append(toIndentedString(onlyUploadClassified)).append("\n");
    sb.append("    onlyShareClassified: ").append(toIndentedString(onlyShareClassified)).append("\n");
    sb.append("    autoMatchDocClassfication: ").append(toIndentedString(autoMatchDocClassfication)).append("\n");
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
