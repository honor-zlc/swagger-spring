package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DepartmentSearchResDepinfo;
import io.swagger.model.DepartmentSearchResUserInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepartmentSearchRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentSearchRes   {
  @JsonProperty("userinfos")
  @Valid
  private List<DepartmentSearchResUserInfo> userinfos = new ArrayList<DepartmentSearchResUserInfo>();

  @JsonProperty("depinfos")
  @Valid
  private List<DepartmentSearchResDepinfo> depinfos = new ArrayList<DepartmentSearchResDepinfo>();

  public DepartmentSearchRes userinfos(List<DepartmentSearchResUserInfo> userinfos) {
    this.userinfos = userinfos;
    return this;
  }

  public DepartmentSearchRes addUserinfosItem(DepartmentSearchResUserInfo userinfosItem) {
    this.userinfos.add(userinfosItem);
    return this;
  }

  /**
   * 用户信息
   * @return userinfos
  **/
  @ApiModelProperty(required = true, value = "用户信息")
      @NotNull
    @Valid
    public List<DepartmentSearchResUserInfo> getUserinfos() {
    return userinfos;
  }

  public void setUserinfos(List<DepartmentSearchResUserInfo> userinfos) {
    this.userinfos = userinfos;
  }

  public DepartmentSearchRes depinfos(List<DepartmentSearchResDepinfo> depinfos) {
    this.depinfos = depinfos;
    return this;
  }

  public DepartmentSearchRes addDepinfosItem(DepartmentSearchResDepinfo depinfosItem) {
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
    public List<DepartmentSearchResDepinfo> getDepinfos() {
    return depinfos;
  }

  public void setDepinfos(List<DepartmentSearchResDepinfo> depinfos) {
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
    DepartmentSearchRes departmentSearchRes = (DepartmentSearchRes) o;
    return Objects.equals(this.userinfos, departmentSearchRes.userinfos) &&
        Objects.equals(this.depinfos, departmentSearchRes.depinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userinfos, depinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentSearchRes {\n");
    
    sb.append("    userinfos: ").append(toIndentedString(userinfos)).append("\n");
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
