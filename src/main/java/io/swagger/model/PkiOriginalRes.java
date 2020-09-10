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
 * PkiOriginalRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class PkiOriginalRes   {
  @JsonProperty("original")
  private String original = null;

  public PkiOriginalRes original(String original) {
    this.original = original;
    return this;
  }

  /**
   * 服务器返回的original值
   * @return original
  **/
  @ApiModelProperty(required = true, value = "服务器返回的original值")
      @NotNull

    public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PkiOriginalRes pkiOriginalRes = (PkiOriginalRes) o;
    return Objects.equals(this.original, pkiOriginalRes.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PkiOriginalRes {\n");
    
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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
