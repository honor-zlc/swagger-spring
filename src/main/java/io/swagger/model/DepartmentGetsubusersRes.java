package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DepartmentGetsubusersResUserinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepartmentGetsubusersRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentGetsubusersRes   {
  @JsonProperty("userinfos")
  @Valid
  private List<DepartmentGetsubusersResUserinfo> userinfos = new ArrayList<DepartmentGetsubusersResUserinfo>();

  public DepartmentGetsubusersRes userinfos(List<DepartmentGetsubusersResUserinfo> userinfos) {
    this.userinfos = userinfos;
    return this;
  }

  public DepartmentGetsubusersRes addUserinfosItem(DepartmentGetsubusersResUserinfo userinfosItem) {
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
    public List<DepartmentGetsubusersResUserinfo> getUserinfos() {
    return userinfos;
  }

  public void setUserinfos(List<DepartmentGetsubusersResUserinfo> userinfos) {
    this.userinfos = userinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentGetsubusersRes departmentGetsubusersRes = (DepartmentGetsubusersRes) o;
    return Objects.equals(this.userinfos, departmentGetsubusersRes.userinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetsubusersRes {\n");
    
    sb.append("    userinfos: ").append(toIndentedString(userinfos)).append("\n");
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
