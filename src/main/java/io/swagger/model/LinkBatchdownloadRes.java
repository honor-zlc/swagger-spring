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
 * LinkBatchdownloadRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkBatchdownloadRes   {
  @JsonProperty("method")
  private String method = null;

  @JsonProperty("url")
  private String url = null;

  public LinkBatchdownloadRes method(String method) {
    this.method = method;
    return this;
  }

  /**
   * url请求方法
   * @return method
  **/
  @ApiModelProperty(required = true, value = "url请求方法")
      @NotNull

    public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public LinkBatchdownloadRes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * 文件批量下载地址
   * @return url
  **/
  @ApiModelProperty(required = true, value = "文件批量下载地址")
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
    LinkBatchdownloadRes linkBatchdownloadRes = (LinkBatchdownloadRes) o;
    return Objects.equals(this.method, linkBatchdownloadRes.method) &&
        Objects.equals(this.url, linkBatchdownloadRes.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkBatchdownloadRes {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
