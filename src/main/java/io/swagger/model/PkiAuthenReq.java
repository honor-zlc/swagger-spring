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
 * PkiAuthenReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class PkiAuthenReq   {
  @JsonProperty("original")
  private String original = null;

  @JsonProperty("detach")
  private String detach = null;

  public PkiAuthenReq original(String original) {
    this.original = original;
    return this;
  }

  /**
   * 通过pki?method=original获取的值
   * @return original
  **/
  @ApiModelProperty(required = true, value = "通过pki?method=original获取的值")
      @NotNull

    public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }

  public PkiAuthenReq detach(String detach) {
    this.detach = detach;
    return this;
  }

  /**
   * 使用key与original计算后的值
   * @return detach
  **/
  @ApiModelProperty(required = true, value = "使用key与original计算后的值")
      @NotNull

    public String getDetach() {
    return detach;
  }

  public void setDetach(String detach) {
    this.detach = detach;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PkiAuthenReq pkiAuthenReq = (PkiAuthenReq) o;
    return Objects.equals(this.original, pkiAuthenReq.original) &&
        Objects.equals(this.detach, pkiAuthenReq.detach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, detach);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PkiAuthenReq {\n");
    
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    detach: ").append(toIndentedString(detach)).append("\n");
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
