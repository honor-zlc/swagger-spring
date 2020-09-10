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
 * LinkOpstatisticsResStatistic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpstatisticsResStatistic   {
  @JsonProperty("ip")
  private String ip = null;

  @JsonProperty("download")
  private Long download = null;

  @JsonProperty("preview")
  private Long preview = null;

  public LinkOpstatisticsResStatistic ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * 访问ip
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "访问ip")
      @NotNull

    public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public LinkOpstatisticsResStatistic download(Long download) {
    this.download = download;
    return this;
  }

  /**
   * 下载量
   * @return download
  **/
  @ApiModelProperty(required = true, value = "下载量")
      @NotNull

    public Long getDownload() {
    return download;
  }

  public void setDownload(Long download) {
    this.download = download;
  }

  public LinkOpstatisticsResStatistic preview(Long preview) {
    this.preview = preview;
    return this;
  }

  /**
   * 预览量
   * @return preview
  **/
  @ApiModelProperty(required = true, value = "预览量")
      @NotNull

    public Long getPreview() {
    return preview;
  }

  public void setPreview(Long preview) {
    this.preview = preview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOpstatisticsResStatistic linkOpstatisticsResStatistic = (LinkOpstatisticsResStatistic) o;
    return Objects.equals(this.ip, linkOpstatisticsResStatistic.ip) &&
        Objects.equals(this.download, linkOpstatisticsResStatistic.download) &&
        Objects.equals(this.preview, linkOpstatisticsResStatistic.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, download, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpstatisticsResStatistic {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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
