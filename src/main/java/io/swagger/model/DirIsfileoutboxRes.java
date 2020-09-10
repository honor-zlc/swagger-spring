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
 * DirIsfileoutboxRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirIsfileoutboxRes   {
  @JsonProperty("isfileoutbox")
  private Boolean isfileoutbox = null;

  public DirIsfileoutboxRes isfileoutbox(Boolean isfileoutbox) {
    this.isfileoutbox = isfileoutbox;
    return this;
  }

  /**
   * 是否是发件箱
   * @return isfileoutbox
  **/
  @ApiModelProperty(required = true, value = "是否是发件箱")
      @NotNull

    public Boolean isIsfileoutbox() {
    return isfileoutbox;
  }

  public void setIsfileoutbox(Boolean isfileoutbox) {
    this.isfileoutbox = isfileoutbox;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirIsfileoutboxRes dirIsfileoutboxRes = (DirIsfileoutboxRes) o;
    return Objects.equals(this.isfileoutbox, dirIsfileoutboxRes.isfileoutbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isfileoutbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirIsfileoutboxRes {\n");
    
    sb.append("    isfileoutbox: ").append(toIndentedString(isfileoutbox)).append("\n");
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
