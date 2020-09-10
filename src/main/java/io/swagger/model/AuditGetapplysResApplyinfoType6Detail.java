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
 * 具体的申请信息，根据apptype，所包含的字段不同
 */
@ApiModel(description = "具体的申请信息，根据apptype，所包含的字段不同")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetapplysResApplyinfoType6Detail   {
  @JsonProperty("inherit")
  private Boolean inherit = null;

  public AuditGetapplysResApplyinfoType6Detail inherit(Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

  /**
   * 是否启用继承  false表示禁用  true表示启用
   * @return inherit
  **/
  @ApiModelProperty(required = true, value = "是否启用继承  false表示禁用  true表示启用")
      @NotNull

    public Boolean isInherit() {
    return inherit;
  }

  public void setInherit(Boolean inherit) {
    this.inherit = inherit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetapplysResApplyinfoType6Detail auditGetapplysResApplyinfoType6Detail = (AuditGetapplysResApplyinfoType6Detail) o;
    return Objects.equals(this.inherit, auditGetapplysResApplyinfoType6Detail.inherit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetapplysResApplyinfoType6Detail {\n");
    
    sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
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
