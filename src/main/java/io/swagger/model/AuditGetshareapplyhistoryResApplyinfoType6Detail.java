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


public class AuditGetshareapplyhistoryResApplyinfoType6Detail   {
  @JsonProperty("auditmsg")
  private String auditmsg = null;

  @JsonProperty("inherit")
  private Boolean inherit = null;

  public AuditGetshareapplyhistoryResApplyinfoType6Detail auditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
    return this;
  }

  /**
   * 审核说明
   * @return auditmsg
  **/
  @ApiModelProperty(required = true, value = "审核说明")
      @NotNull

    public String getAuditmsg() {
    return auditmsg;
  }

  public void setAuditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
  }

  public AuditGetshareapplyhistoryResApplyinfoType6Detail inherit(Boolean inherit) {
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
    AuditGetshareapplyhistoryResApplyinfoType6Detail auditGetshareapplyhistoryResApplyinfoType6Detail = (AuditGetshareapplyhistoryResApplyinfoType6Detail) o;
    return Objects.equals(this.auditmsg, auditGetshareapplyhistoryResApplyinfoType6Detail.auditmsg) &&
        Objects.equals(this.inherit, auditGetshareapplyhistoryResApplyinfoType6Detail.inherit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditmsg, inherit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapplyhistoryResApplyinfoType6Detail {\n");
    
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
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
