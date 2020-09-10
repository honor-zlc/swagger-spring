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
 * DirCheckwatermarkRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirCheckwatermarkRes   {
  @JsonProperty("watermarktype ")
  private Long watermarktype_ = null;

  @JsonProperty("watermarkconfig")
  private Object watermarkconfig = null;

  public DirCheckwatermarkRes watermarktype_(Long watermarktype_) {
    this.watermarktype_ = watermarktype_;
    return this;
  }

  /**
   * 水印类型(0:无水印，1：预览水印，2:下载水印，3：预览下载水印)
   * @return watermarktype_
  **/
  @ApiModelProperty(required = true, value = "水印类型(0:无水印，1：预览水印，2:下载水印，3：预览下载水印)")
      @NotNull

    public Long getWatermarktype_() {
    return watermarktype_;
  }

  public void setWatermarktype_(Long watermarktype_) {
    this.watermarktype_ = watermarktype_;
  }

  public DirCheckwatermarkRes watermarkconfig(Object watermarkconfig) {
    this.watermarkconfig = watermarkconfig;
    return this;
  }

  /**
   * 水印配置信息
   * @return watermarkconfig
  **/
  @ApiModelProperty(required = true, value = "水印配置信息")
      @NotNull

    public Object getWatermarkconfig() {
    return watermarkconfig;
  }

  public void setWatermarkconfig(Object watermarkconfig) {
    this.watermarkconfig = watermarkconfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirCheckwatermarkRes dirCheckwatermarkRes = (DirCheckwatermarkRes) o;
    return Objects.equals(this.watermarktype_, dirCheckwatermarkRes.watermarktype_) &&
        Objects.equals(this.watermarkconfig, dirCheckwatermarkRes.watermarkconfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watermarktype_, watermarkconfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCheckwatermarkRes {\n");
    
    sb.append("    watermarktype_: ").append(toIndentedString(watermarktype_)).append("\n");
    sb.append("    watermarkconfig: ").append(toIndentedString(watermarkconfig)).append("\n");
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
