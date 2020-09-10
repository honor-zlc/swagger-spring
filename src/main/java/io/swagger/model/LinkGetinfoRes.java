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
 * LinkGetinfoRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkGetinfoRes   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("site")
  private String site = null;

  public LinkGetinfoRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件或文件夹名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件或文件夹名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkGetinfoRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 修改时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "修改时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public LinkGetinfoRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 文件大小，文件夹为-1
   * @return size
  **/
  @ApiModelProperty(required = true, value = "文件大小，文件夹为-1")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LinkGetinfoRes site(String site) {
    this.site = site;
    return this;
  }

  /**
   * 站点名
   * @return site
  **/
  @ApiModelProperty(required = true, value = "站点名")
      @NotNull

    public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGetinfoRes linkGetinfoRes = (LinkGetinfoRes) o;
    return Objects.equals(this.name, linkGetinfoRes.name) &&
        Objects.equals(this.modified, linkGetinfoRes.modified) &&
        Objects.equals(this.size, linkGetinfoRes.size) &&
        Objects.equals(this.site, linkGetinfoRes.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, modified, size, site);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGetinfoRes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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
