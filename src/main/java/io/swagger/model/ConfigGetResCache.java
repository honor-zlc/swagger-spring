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
 * ConfigGetResCache
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ConfigGetResCache   {
  @JsonProperty("interval")
  private Long interval = null;

  @JsonProperty("size")
  private Long size = null;

  public ConfigGetResCache interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * 缓存清除时间间隔
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "缓存清除时间间隔")
      @NotNull

    public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public ConfigGetResCache size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 缓存清除空间上限
   * @return size
  **/
  @ApiModelProperty(required = true, value = "缓存清除空间上限")
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
    ConfigGetResCache configGetResCache = (ConfigGetResCache) o;
    return Objects.equals(this.interval, configGetResCache.interval) &&
        Objects.equals(this.size, configGetResCache.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGetResCache {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
