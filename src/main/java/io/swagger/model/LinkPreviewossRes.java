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
 * LinkPreviewossRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkPreviewossRes   {
  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("url")
  private String url = null;

  public LinkPreviewossRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 所预览文件的大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "所预览文件的大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LinkPreviewossRes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * 下载转换后文件的url(15分钟过期)
   * @return url
  **/
  @ApiModelProperty(required = true, value = "下载转换后文件的url(15分钟过期)")
      @NotNull

    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPreviewossRes linkPreviewossRes = (LinkPreviewossRes) o;
    return Objects.equals(this.size, linkPreviewossRes.size) &&
        Objects.equals(this.url, linkPreviewossRes.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPreviewossRes {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
