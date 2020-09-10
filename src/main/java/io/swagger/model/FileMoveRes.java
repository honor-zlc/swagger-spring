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
 * FileMoveRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileMoveRes   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  public FileMoveRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 返回新的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "返回新的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileMoveRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UTF8编码，仅当ondup为2时才返回，否则返回参数仍然为空
   * @return name
  **/
  @ApiModelProperty(value = "UTF8编码，仅当ondup为2时才返回，否则返回参数仍然为空")
  
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
    FileMoveRes fileMoveRes = (FileMoveRes) o;
    return Objects.equals(this.docid, fileMoveRes.docid) &&
        Objects.equals(this.name, fileMoveRes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMoveRes {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
