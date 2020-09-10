package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LinkOsdownloadRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOsdownloadRes   {
  @JsonProperty("need_watermark")
  private Boolean needWatermark = null;

  @JsonProperty("authrequest")
  @Valid
  private List<String> authrequest = new ArrayList<String>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("size")
  private Long size = null;

  public LinkOsdownloadRes needWatermark(Boolean needWatermark) {
    this.needWatermark = needWatermark;
    return this;
  }

  /**
   * 是否是下载水印文件
   * @return needWatermark
  **/
  @ApiModelProperty(required = true, value = "是否是下载水印文件")
      @NotNull

    public Boolean isNeedWatermark() {
    return needWatermark;
  }

  public void setNeedWatermark(Boolean needWatermark) {
    this.needWatermark = needWatermark;
  }

  public LinkOsdownloadRes authrequest(List<String> authrequest) {
    this.authrequest = authrequest;
    return this;
  }

  public LinkOsdownloadRes addAuthrequestItem(String authrequestItem) {
    this.authrequest.add(authrequestItem);
    return this;
  }

  /**
   * - authrequest[0]：请求方法  - authrequest[1]：资源URL
   * @return authrequest
  **/
  @ApiModelProperty(required = true, value = "- authrequest[0]：请求方法  - authrequest[1]：资源URL")
      @NotNull

    public List<String> getAuthrequest() {
    return authrequest;
  }

  public void setAuthrequest(List<String> authrequest) {
    this.authrequest = authrequest;
  }

  public LinkOsdownloadRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件名称，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkOsdownloadRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件版本号
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "文件版本号")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public LinkOsdownloadRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 当前下载版本的总大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "当前下载版本的总大小")
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
    LinkOsdownloadRes linkOsdownloadRes = (LinkOsdownloadRes) o;
    return Objects.equals(this.needWatermark, linkOsdownloadRes.needWatermark) &&
        Objects.equals(this.authrequest, linkOsdownloadRes.authrequest) &&
        Objects.equals(this.name, linkOsdownloadRes.name) &&
        Objects.equals(this.rev, linkOsdownloadRes.rev) &&
        Objects.equals(this.size, linkOsdownloadRes.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needWatermark, authrequest, name, rev, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOsdownloadRes {\n");
    
    sb.append("    needWatermark: ").append(toIndentedString(needWatermark)).append("\n");
    sb.append("    authrequest: ").append(toIndentedString(authrequest)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
