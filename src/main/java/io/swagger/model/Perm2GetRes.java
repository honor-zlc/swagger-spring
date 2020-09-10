package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Perm2GetResPerminfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Perm2GetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm2GetRes   {
  @JsonProperty("perminfos")
  @Valid
  private List<Perm2GetResPerminfo> perminfos = new ArrayList<Perm2GetResPerminfo>();

  @JsonProperty("inherit")
  private Boolean inherit = null;

  public Perm2GetRes perminfos(List<Perm2GetResPerminfo> perminfos) {
    this.perminfos = perminfos;
    return this;
  }

  public Perm2GetRes addPerminfosItem(Perm2GetResPerminfo perminfosItem) {
    this.perminfos.add(perminfosItem);
    return this;
  }

  /**
   * 权限配置条目数组
   * @return perminfos
  **/
  @ApiModelProperty(required = true, value = "权限配置条目数组")
      @NotNull
    @Valid
    public List<Perm2GetResPerminfo> getPerminfos() {
    return perminfos;
  }

  public void setPerminfos(List<Perm2GetResPerminfo> perminfos) {
    this.perminfos = perminfos;
  }

  public Perm2GetRes inherit(Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

  /**
   * 启用继承：true，上级所有权限对该对象及下级对象有效  禁用继承：false，上级所有权限对该对象及下级对象无效
   * @return inherit
  **/
  @ApiModelProperty(required = true, value = "启用继承：true，上级所有权限对该对象及下级对象有效  禁用继承：false，上级所有权限对该对象及下级对象无效")
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
    Perm2GetRes perm2GetRes = (Perm2GetRes) o;
    return Objects.equals(this.perminfos, perm2GetRes.perminfos) &&
        Objects.equals(this.inherit, perm2GetRes.inherit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perminfos, inherit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm2GetRes {\n");
    
    sb.append("    perminfos: ").append(toIndentedString(perminfos)).append("\n");
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
