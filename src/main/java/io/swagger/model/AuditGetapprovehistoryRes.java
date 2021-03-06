package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AuditGetapprovehistoryResApplyinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditGetapprovehistoryRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetapprovehistoryRes   {
  @JsonProperty("applyinfos")
  @Valid
  private List<AuditGetapprovehistoryResApplyinfo> applyinfos = new ArrayList<AuditGetapprovehistoryResApplyinfo>();

  public AuditGetapprovehistoryRes applyinfos(List<AuditGetapprovehistoryResApplyinfo> applyinfos) {
    this.applyinfos = applyinfos;
    return this;
  }

  public AuditGetapprovehistoryRes addApplyinfosItem(AuditGetapprovehistoryResApplyinfo applyinfosItem) {
    this.applyinfos.add(applyinfosItem);
    return this;
  }

  /**
   * 申请信息
   * @return applyinfos
  **/
  @ApiModelProperty(required = true, value = "申请信息")
      @NotNull
    @Valid
    public List<AuditGetapprovehistoryResApplyinfo> getApplyinfos() {
    return applyinfos;
  }

  public void setApplyinfos(List<AuditGetapprovehistoryResApplyinfo> applyinfos) {
    this.applyinfos = applyinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetapprovehistoryRes auditGetapprovehistoryRes = (AuditGetapprovehistoryRes) o;
    return Objects.equals(this.applyinfos, auditGetapprovehistoryRes.applyinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetapprovehistoryRes {\n");
    
    sb.append("    applyinfos: ").append(toIndentedString(applyinfos)).append("\n");
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
