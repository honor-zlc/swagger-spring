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
 * UpdateCheckRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class UpdateCheckRes   {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("latest")
  private String latest = null;

  @JsonProperty("ostype")
  private Long ostype = null;

  @JsonProperty("downloadurl")
  private String downloadurl = null;

  @JsonProperty("size")
  private Long size = null;

  public UpdateCheckRes result(String result) {
    this.result = result;
    return this;
  }

  /**
   * 客户端是否需要更新 “ok”表示客户端版本是最新的 “optional”表示客户端可选择更新 “forced”表示客户端必须进行更新
   * @return result
  **/
  @ApiModelProperty(required = true, value = "客户端是否需要更新 “ok”表示客户端版本是最新的 “optional”表示客户端可选择更新 “forced”表示客户端必须进行更新")
      @NotNull

    public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public UpdateCheckRes latest(String latest) {
    this.latest = latest;
    return this;
  }

  /**
   * 可用客户端安装包的版本信息，如3.5.4.244形式
   * @return latest
  **/
  @ApiModelProperty(required = true, value = "可用客户端安装包的版本信息，如3.5.4.244形式")
      @NotNull

    public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public UpdateCheckRes ostype(Long ostype) {
    this.ostype = ostype;
    return this;
  }

  /**
   * 可用客户端安装包对应的ostype
   * @return ostype
  **/
  @ApiModelProperty(required = true, value = "可用客户端安装包对应的ostype")
      @NotNull

    public Long getOstype() {
    return ostype;
  }

  public void setOstype(Long ostype) {
    this.ostype = ostype;
  }

  public UpdateCheckRes downloadurl(String downloadurl) {
    this.downloadurl = downloadurl;
    return this;
  }

  /**
   * 可用客户端安装包的相对下载路径，需要加上服务器的ip后才能进行下载
   * @return downloadurl
  **/
  @ApiModelProperty(required = true, value = "可用客户端安装包的相对下载路径，需要加上服务器的ip后才能进行下载")
      @NotNull

    public String getDownloadurl() {
    return downloadurl;
  }

  public void setDownloadurl(String downloadurl) {
    this.downloadurl = downloadurl;
  }

  public UpdateCheckRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 可用客户端安装包的大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "可用客户端安装包的大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCheckRes updateCheckRes = (UpdateCheckRes) o;
    return Objects.equals(this.result, updateCheckRes.result) &&
        Objects.equals(this.latest, updateCheckRes.latest) &&
        Objects.equals(this.ostype, updateCheckRes.ostype) &&
        Objects.equals(this.downloadurl, updateCheckRes.downloadurl) &&
        Objects.equals(this.size, updateCheckRes.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, latest, ostype, downloadurl, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCheckRes {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    ostype: ").append(toIndentedString(ostype)).append("\n");
    sb.append("    downloadurl: ").append(toIndentedString(downloadurl)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
