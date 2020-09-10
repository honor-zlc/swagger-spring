package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AuditGetdocprocessesResProcessinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditGetdocprocessesRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetdocprocessesRes   {
  @JsonProperty("processinfos")
  @Valid
  private List<AuditGetdocprocessesResProcessinfo> processinfos = new ArrayList<AuditGetdocprocessesResProcessinfo>();

  public AuditGetdocprocessesRes processinfos(List<AuditGetdocprocessesResProcessinfo> processinfos) {
    this.processinfos = processinfos;
    return this;
  }

  public AuditGetdocprocessesRes addProcessinfosItem(AuditGetdocprocessesResProcessinfo processinfosItem) {
    this.processinfos.add(processinfosItem);
    return this;
  }

  /**
   * 流程信息
   * @return processinfos
  **/
  @ApiModelProperty(required = true, value = "流程信息")
      @NotNull
    @Valid
    public List<AuditGetdocprocessesResProcessinfo> getProcessinfos() {
    return processinfos;
  }

  public void setProcessinfos(List<AuditGetdocprocessesResProcessinfo> processinfos) {
    this.processinfos = processinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetdocprocessesRes auditGetdocprocessesRes = (AuditGetdocprocessesRes) o;
    return Objects.equals(this.processinfos, auditGetdocprocessesRes.processinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetdocprocessesRes {\n");
    
    sb.append("    processinfos: ").append(toIndentedString(processinfos)).append("\n");
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
