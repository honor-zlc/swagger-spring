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
 * FileGetsuggestnameRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetsuggestnameRes   {
  @JsonProperty("name")
  private String name = null;

  public FileGetsuggestnameRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UTF8编码，服务端如果不存在同名的name，则直接返回name；如果存在同名的name，则根据重名冲突策略找到不冲突的文件名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "UTF8编码，服务端如果不存在同名的name，则直接返回name；如果存在同名的name，则根据重名冲突策略找到不冲突的文件名")
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
    FileGetsuggestnameRes fileGetsuggestnameRes = (FileGetsuggestnameRes) o;
    return Objects.equals(this.name, fileGetsuggestnameRes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetsuggestnameRes {\n");
    
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
