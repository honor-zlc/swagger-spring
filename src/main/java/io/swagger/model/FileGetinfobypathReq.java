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
 * FileGetinfobypathReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetinfobypathReq   {
  @JsonProperty("namepath")
  private String namepath = null;

  public FileGetinfobypathReq namepath(String namepath) {
    this.namepath = namepath;
    return this;
  }

  /**
   * 名字路径，由顶级入口（个人文档/文档库/群组等）开始的对象全路径，以”/”分隔
   * @return namepath
  **/
  @ApiModelProperty(required = true, value = "名字路径，由顶级入口（个人文档/文档库/群组等）开始的对象全路径，以”/”分隔")
      @NotNull

    public String getNamepath() {
    return namepath;
  }

  public void setNamepath(String namepath) {
    this.namepath = namepath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGetinfobypathReq fileGetinfobypathReq = (FileGetinfobypathReq) o;
    return Objects.equals(this.namepath, fileGetinfobypathReq.namepath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namepath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetinfobypathReq {\n");
    
    sb.append("    namepath: ").append(toIndentedString(namepath)).append("\n");
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
