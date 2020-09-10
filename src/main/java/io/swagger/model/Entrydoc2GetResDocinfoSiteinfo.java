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
 * 站点信息
 */
@ApiModel(description = "站点信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetResDocinfoSiteinfo   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public Entrydoc2GetResDocinfoSiteinfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 站点id，下列情况为空字符串：  个人文档库  个人群组文档库  共享个人文档库  共享个人群组文档库  站点未归属
   * @return id
  **/
  @ApiModelProperty(required = true, value = "站点id，下列情况为空字符串：  个人文档库  个人群组文档库  共享个人文档库  共享个人群组文档库  站点未归属")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Entrydoc2GetResDocinfoSiteinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 站点名称，下列情况为空字符串：  个人文档库  个人群组文档库  共享个人文档库  共享个人群组文档库  站点未归属
   * @return name
  **/
  @ApiModelProperty(required = true, value = "站点名称，下列情况为空字符串：  个人文档库  个人群组文档库  共享个人文档库  共享个人群组文档库  站点未归属")
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
    Entrydoc2GetResDocinfoSiteinfo entrydoc2GetResDocinfoSiteinfo = (Entrydoc2GetResDocinfoSiteinfo) o;
    return Objects.equals(this.id, entrydoc2GetResDocinfoSiteinfo.id) &&
        Objects.equals(this.name, entrydoc2GetResDocinfoSiteinfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetResDocinfoSiteinfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
