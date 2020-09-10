package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AuditGetshareapplyhistoryResApplyinfoBase;
import io.swagger.model.AuditGetshareapplyhistoryResApplyinfoType5Detail;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditGetshareapplyhistoryResApplyinfoType5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetshareapplyhistoryResApplyinfoType5 extends AuditGetshareapplyhistoryResApplyinfoBase implements OneOfauditGetshareapplyhistoryResApplyinfosItems {
  @JsonProperty("detail")
  private AuditGetshareapplyhistoryResApplyinfoType5Detail detail = null;

  public AuditGetshareapplyhistoryResApplyinfoType5 detail(AuditGetshareapplyhistoryResApplyinfoType5Detail detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AuditGetshareapplyhistoryResApplyinfoType5Detail getDetail() {
    return detail;
  }

  public void setDetail(AuditGetshareapplyhistoryResApplyinfoType5Detail detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetshareapplyhistoryResApplyinfoType5 auditGetshareapplyhistoryResApplyinfoType5 = (AuditGetshareapplyhistoryResApplyinfoType5) o;
    return Objects.equals(this.detail, auditGetshareapplyhistoryResApplyinfoType5.detail) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapplyhistoryResApplyinfoType5 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
