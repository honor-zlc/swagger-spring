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
 * Auth1LogoutReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1LogoutReq   {
  @JsonProperty("ostype")
  private Long ostype = null;

  public Auth1LogoutReq ostype(Long ostype) {
    this.ostype = ostype;
    return this;
  }

  /**
   * 操作系统类型    0: Unknown    1: Ios    2: Android    3: Windows phone    4: Windows    5: MacOSX    6: Web    7: Mobile Web    8: NAS 
   * @return ostype
  **/
  @ApiModelProperty(required = true, value = "操作系统类型    0: Unknown    1: Ios    2: Android    3: Windows phone    4: Windows    5: MacOSX    6: Web    7: Mobile Web    8: NAS ")
      @NotNull

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
    Auth1LogoutReq auth1LogoutReq = (Auth1LogoutReq) o;
    return Objects.equals(this.ostype, auth1LogoutReq.ostype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ostype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1LogoutReq {\n");
    
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
