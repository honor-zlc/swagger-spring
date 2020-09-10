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
 * UserGetResDirectdeptinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class UserGetResDirectdeptinfo   {
  @JsonProperty("depid")
  private String depid = null;

  @JsonProperty("name")
  private String name = null;

  public UserGetResDirectdeptinfo depid(String depid) {
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

  public UserGetResDirectdeptinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 部门的显示名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "部门的显示名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetResDirectdeptinfo userGetResDirectdeptinfo = (UserGetResDirectdeptinfo) o;
    return Objects.equals(this.depid, userGetResDirectdeptinfo.depid) &&
        Objects.equals(this.name, userGetResDirectdeptinfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depid, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetResDirectdeptinfo {\n");
    
    sb.append("    depid: ").append(toIndentedString(depid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
