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
 * OwnerCheckRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class OwnerCheckRes   {
  @JsonProperty("isowner")
  private Boolean isowner = null;

  public OwnerCheckRes isowner(Boolean isowner) {
    this.isowner = isowner;
    return this;
  }

  /**
   * 是否是所有者
   * @return isowner
  **/
  @ApiModelProperty(required = true, value = "是否是所有者")
      @NotNull

    public Boolean isIsowner() {
    return isowner;
  }

  public void setIsowner(Boolean isowner) {
    this.isowner = isowner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerCheckRes ownerCheckRes = (OwnerCheckRes) o;
    return Objects.equals(this.isowner, ownerCheckRes.isowner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isowner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerCheckRes {\n");
    
    sb.append("    isowner: ").append(toIndentedString(isowner)).append("\n");
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
