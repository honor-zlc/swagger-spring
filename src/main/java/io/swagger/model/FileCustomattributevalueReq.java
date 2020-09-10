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
 * FileCustomattributevalueReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileCustomattributevalueReq   {
  @JsonProperty("attributeid")
  private Long attributeid = null;

  public FileCustomattributevalueReq attributeid(Long attributeid) {
    this.attributeid = attributeid;
    return this;
  }

  /**
   * 属性ID
   * @return attributeid
  **/
  @ApiModelProperty(required = true, value = "属性ID")
      @NotNull

    public Long getAttributeid() {
    return attributeid;
  }

  public void setAttributeid(Long attributeid) {
    this.attributeid = attributeid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileCustomattributevalueReq fileCustomattributevalueReq = (FileCustomattributevalueReq) o;
    return Objects.equals(this.attributeid, fileCustomattributevalueReq.attributeid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCustomattributevalueReq {\n");
    
    sb.append("    attributeid: ").append(toIndentedString(attributeid)).append("\n");
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
