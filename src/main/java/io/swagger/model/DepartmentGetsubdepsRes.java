package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DepartmentGetsubdepsResDepinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepartmentGetsubdepsRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentGetsubdepsRes   {
  @JsonProperty("depinfos")
  @Valid
  private List<DepartmentGetsubdepsResDepinfo> depinfos = new ArrayList<DepartmentGetsubdepsResDepinfo>();

  public DepartmentGetsubdepsRes depinfos(List<DepartmentGetsubdepsResDepinfo> depinfos) {
    this.depinfos = depinfos;
    return this;
  }

  public DepartmentGetsubdepsRes addDepinfosItem(DepartmentGetsubdepsResDepinfo depinfosItem) {
    this.depinfos.add(depinfosItem);
    return this;
  }

  /**
   * 部门信息
   * @return depinfos
  **/
  @ApiModelProperty(required = true, value = "部门信息")
      @NotNull
    @Valid
    public List<DepartmentGetsubdepsResDepinfo> getDepinfos() {
    return depinfos;
  }

  public void setDepinfos(List<DepartmentGetsubdepsResDepinfo> depinfos) {
    this.depinfos = depinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentGetsubdepsRes departmentGetsubdepsRes = (DepartmentGetsubdepsRes) o;
    return Objects.equals(this.depinfos, departmentGetsubdepsRes.depinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetsubdepsRes {\n");
    
    sb.append("    depinfos: ").append(toIndentedString(depinfos)).append("\n");
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
