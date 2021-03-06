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
 * DepartmentGetsubdepsReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentGetsubdepsReq   {
  @JsonProperty("depid")
  private String depid = null;

  public DepartmentGetsubdepsReq depid(String depid) {
    this.depid = depid;
    return this;
  }

  /**
   * 部门id
   * @return depid
  **/
  @ApiModelProperty(required = true, value = "部门id")
      @NotNull

    public String getDepid() {
    return depid;
  }

  public void setDepid(String depid) {
    this.depid = depid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentGetsubdepsReq departmentGetsubdepsReq = (DepartmentGetsubdepsReq) o;
    return Objects.equals(this.depid, departmentGetsubdepsReq.depid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetsubdepsReq {\n");
    
    sb.append("    depid: ").append(toIndentedString(depid)).append("\n");
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
