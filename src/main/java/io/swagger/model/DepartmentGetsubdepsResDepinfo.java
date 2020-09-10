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
 * DepartmentGetsubdepsResDepinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentGetsubdepsResDepinfo   {
  @JsonProperty("depid")
  private String depid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isconfigable")
  private Boolean isconfigable = null;

  public DepartmentGetsubdepsResDepinfo depid(String depid) {
    this.depid = depid;
    return this;
  }

  /**
   * 部门唯一标识
   * @return depid
  **/
  @ApiModelProperty(required = true, value = "部门唯一标识")
      @NotNull

    public String getDepid() {
    return depid;
  }

  public void setDepid(String depid) {
    this.depid = depid;
  }

  public DepartmentGetsubdepsResDepinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 部门显示名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "部门显示名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DepartmentGetsubdepsResDepinfo isconfigable(Boolean isconfigable) {
    this.isconfigable = isconfigable;
    return this;
  }

  /**
   * 是否可配置权限
   * @return isconfigable
  **/
  @ApiModelProperty(required = true, value = "是否可配置权限")
      @NotNull

    public Boolean isIsconfigable() {
    return isconfigable;
  }

  public void setIsconfigable(Boolean isconfigable) {
    this.isconfigable = isconfigable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentGetsubdepsResDepinfo departmentGetsubdepsResDepinfo = (DepartmentGetsubdepsResDepinfo) o;
    return Objects.equals(this.depid, departmentGetsubdepsResDepinfo.depid) &&
        Objects.equals(this.name, departmentGetsubdepsResDepinfo.name) &&
        Objects.equals(this.isconfigable, departmentGetsubdepsResDepinfo.isconfigable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depid, name, isconfigable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetsubdepsResDepinfo {\n");
    
    sb.append("    depid: ").append(toIndentedString(depid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isconfigable: ").append(toIndentedString(isconfigable)).append("\n");
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
