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
 * 限速配置信息
 */
@ApiModel(description = "限速配置信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigResLimitrateconfig   {
  @JsonProperty("isenabled")
  private Boolean isenabled = null;

  @JsonProperty("limittype")
  private Long limittype = null;

  public Auth1GetconfigResLimitrateconfig isenabled(Boolean isenabled) {
    this.isenabled = isenabled;
    return this;
  }

  /**
   * 是否开启网络限速
   * @return isenabled
  **/
  @ApiModelProperty(required = true, value = "是否开启网络限速")
      @NotNull

    public Boolean isIsenabled() {
    return isenabled;
  }

  public void setIsenabled(Boolean isenabled) {
    this.isenabled = isenabled;
  }

  public Auth1GetconfigResLimitrateconfig limittype(Long limittype) {
    this.limittype = limittype;
    return this;
  }

  /**
   * 限速类型 0 用户级别限速 1 用户组总体限速
   * @return limittype
  **/
  @ApiModelProperty(required = true, value = "限速类型 0 用户级别限速 1 用户组总体限速")
      @NotNull

    public Long getLimittype() {
    return limittype;
  }

  public void setLimittype(Long limittype) {
    this.limittype = limittype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResLimitrateconfig auth1GetconfigResLimitrateconfig = (Auth1GetconfigResLimitrateconfig) o;
    return Objects.equals(this.isenabled, auth1GetconfigResLimitrateconfig.isenabled) &&
        Objects.equals(this.limittype, auth1GetconfigResLimitrateconfig.limittype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isenabled, limittype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResLimitrateconfig {\n");
    
    sb.append("    isenabled: ").append(toIndentedString(isenabled)).append("\n");
    sb.append("    limittype: ").append(toIndentedString(limittype)).append("\n");
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
