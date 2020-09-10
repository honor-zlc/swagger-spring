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
 * ConfigGetReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ConfigGetReq   {
  @JsonProperty("ostype")
  private Long ostype = null;

  public ConfigGetReq ostype(Long ostype) {
    this.ostype = ostype;
    return this;
  }

  /**
   * 设备类型
   * @return ostype
  **/
  @ApiModelProperty(value = "设备类型")
  
    public Long getOstype() {
    return ostype;
  }

  public void setOstype(Long ostype) {
    this.ostype = ostype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigGetReq configGetReq = (ConfigGetReq) o;
    return Objects.equals(this.ostype, configGetReq.ostype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ostype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGetReq {\n");
    
    sb.append("    ostype: ").append(toIndentedString(ostype)).append("\n");
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
