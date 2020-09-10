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
 * DepartmentGetrootsResDepinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentGetrootsResDepinfo   {
  @JsonProperty("depid")
  private String depid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isconfigable")
  private Boolean isconfigable = null;

  public DepartmentGetrootsResDepinfo depid(String depid) {
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

  public DepartmentGetrootsResDepinfo name(String name) {
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

  public DepartmentGetrootsResDepinfo isconfigable(Boolean isconfigable) {
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
    DepartmentGetrootsResDepinfo departmentGetrootsResDepinfo = (DepartmentGetrootsResDepinfo) o;
    return Objects.equals(this.depid, departmentGetrootsResDepinfo.depid) &&
        Objects.equals(this.name, departmentGetrootsResDepinfo.name) &&
        Objects.equals(this.isconfigable, departmentGetrootsResDepinfo.isconfigable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depid, name, isconfigable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetrootsResDepinfo {\n");
    
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
