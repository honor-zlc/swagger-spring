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
 * DirDeleteRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirDeleteRes   {
  @JsonProperty("isdirexist")
  private Boolean isdirexist = null;

  public DirDeleteRes isdirexist(Boolean isdirexist) {
    this.isdirexist = isdirexist;
    return this;
  }

  /**
   * 当前文件夹最后是否还存在（用于前端判断刷新界面）  
   * @return isdirexist
  **/
  @ApiModelProperty(required = true, value = "当前文件夹最后是否还存在（用于前端判断刷新界面）  ")
      @NotNull

    public Boolean isIsdirexist() {
    return isdirexist;
  }

  public void setIsdirexist(Boolean isdirexist) {
    this.isdirexist = isdirexist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirDeleteRes dirDeleteRes = (DirDeleteRes) o;
    return Objects.equals(this.isdirexist, dirDeleteRes.isdirexist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isdirexist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirDeleteRes {\n");
    
    sb.append("    isdirexist: ").append(toIndentedString(isdirexist)).append("\n");
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
