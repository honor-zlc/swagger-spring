package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ConfigGetResCache;
import io.swagger.model.ConfigGetResLocalsync;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConfigGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ConfigGetRes   {
  @JsonProperty("cache")
  @Valid
  private List<ConfigGetResCache> cache = new ArrayList<ConfigGetResCache>();

  @JsonProperty("detect_interval")
  private Long detectInterval = null;

  @JsonProperty("localsync")
  private ConfigGetResLocalsync localsync = null;

  @JsonProperty("needquickstart")
  private Boolean needquickstart = null;

  public ConfigGetRes cache(List<ConfigGetResCache> cache) {
    this.cache = cache;
    return this;
  }

  public ConfigGetRes addCacheItem(ConfigGetResCache cacheItem) {
    this.cache.add(cacheItem);
    return this;
  }

  /**
   * 缓存相关配置信息
   * @return cache
  **/
  @ApiModelProperty(required = true, value = "缓存相关配置信息")
      @NotNull
    @Valid
    public List<ConfigGetResCache> getCache() {
    return cache;
  }

  public void setCache(List<ConfigGetResCache> cache) {
    this.cache = cache;
  }

  public ConfigGetRes detectInterval(Long detectInterval) {
    this.detectInterval = detectInterval;
    return this;
  }

  /**
   * 客户端探测时间
   * @return detectInterval
  **/
  @ApiModelProperty(required = true, value = "客户端探测时间")
      @NotNull

    public Long getDetectInterval() {
    return detectInterval;
  }

  public void setDetectInterval(Long detectInterval) {
    this.detectInterval = detectInterval;
  }

  public ConfigGetRes localsync(ConfigGetResLocalsync localsync) {
    this.localsync = localsync;
    return this;
  }

  /**
   * Get localsync
   * @return localsync
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ConfigGetResLocalsync getLocalsync() {
    return localsync;
  }

  public void setLocalsync(ConfigGetResLocalsync localsync) {
    this.localsync = localsync;
  }

  public ConfigGetRes needquickstart(Boolean needquickstart) {
    this.needquickstart = needquickstart;
    return this;
  }

  /**
   * 快速入门文档阅读状态
   * @return needquickstart
  **/
  @ApiModelProperty(required = true, value = "快速入门文档阅读状态")
      @NotNull

    public Boolean isNeedquickstart() {
    return needquickstart;
  }

  public void setNeedquickstart(Boolean needquickstart) {
    this.needquickstart = needquickstart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigGetRes configGetRes = (ConfigGetRes) o;
    return Objects.equals(this.cache, configGetRes.cache) &&
        Objects.equals(this.detectInterval, configGetRes.detectInterval) &&
        Objects.equals(this.localsync, configGetRes.localsync) &&
        Objects.equals(this.needquickstart, configGetRes.needquickstart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cache, detectInterval, localsync, needquickstart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGetRes {\n");
    
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    detectInterval: ").append(toIndentedString(detectInterval)).append("\n");
    sb.append("    localsync: ").append(toIndentedString(localsync)).append("\n");
    sb.append("    needquickstart: ").append(toIndentedString(needquickstart)).append("\n");
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
