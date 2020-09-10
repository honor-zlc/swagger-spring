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
 * Entrydoc2GetdocinfoRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetdocinfoRes   {
  @JsonProperty("doctype")
  private Long doctype = null;

  public Entrydoc2GetdocinfoRes doctype(Long doctype) {
    this.doctype = doctype;
    return this;
  }

  /**
   * 文档库类型：  1：个人文档库  2：个人群组文档库  3：自定义文档库  4：共享个人文档库  5：归档库  6：共享个人群组文档库  
   * @return doctype
  **/
  @ApiModelProperty(required = true, value = "文档库类型：  1：个人文档库  2：个人群组文档库  3：自定义文档库  4：共享个人文档库  5：归档库  6：共享个人群组文档库  ")
      @NotNull

    public Long getDoctype() {
    return doctype;
  }

  public void setDoctype(Long doctype) {
    this.doctype = doctype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetdocinfoRes entrydoc2GetdocinfoRes = (Entrydoc2GetdocinfoRes) o;
    return Objects.equals(this.doctype, entrydoc2GetdocinfoRes.doctype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetdocinfoRes {\n");
    
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
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
