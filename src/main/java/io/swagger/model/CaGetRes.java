package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CaGetResCainfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class CaGetRes   {
  @JsonProperty("enable")
  private Boolean enable = null;

  @JsonProperty("cainfo")
  private CaGetResCainfo cainfo = null;

  public CaGetRes enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * 是否开启了CA认证 true表示开启 false表示关闭
   * @return enable
  **/
  @ApiModelProperty(required = true, value = "是否开启了CA认证 true表示开启 false表示关闭")
      @NotNull

    public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public CaGetRes cainfo(CaGetResCainfo cainfo) {
    this.cainfo = cainfo;
    return this;
  }

  /**
   * Get cainfo
   * @return cainfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CaGetResCainfo getCainfo() {
    return cainfo;
  }

  public void setCainfo(CaGetResCainfo cainfo) {
    this.cainfo = cainfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaGetRes caGetRes = (CaGetRes) o;
    return Objects.equals(this.enable, caGetRes.enable) &&
        Objects.equals(this.cainfo, caGetRes.cainfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, cainfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaGetRes {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    cainfo: ").append(toIndentedString(cainfo)).append("\n");
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
