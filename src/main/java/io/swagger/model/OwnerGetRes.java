package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OwnerGetResOwnerinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OwnerGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class OwnerGetRes   {
  @JsonProperty("ownerinfos")
  @Valid
  private List<OwnerGetResOwnerinfo> ownerinfos = new ArrayList<OwnerGetResOwnerinfo>();

  public OwnerGetRes ownerinfos(List<OwnerGetResOwnerinfo> ownerinfos) {
    this.ownerinfos = ownerinfos;
    return this;
  }

  public OwnerGetRes addOwnerinfosItem(OwnerGetResOwnerinfo ownerinfosItem) {
    this.ownerinfos.add(ownerinfosItem);
    return this;
  }

  /**
   * 多个所有者信息
   * @return ownerinfos
  **/
  @ApiModelProperty(required = true, value = "多个所有者信息")
      @NotNull
    @Valid
    public List<OwnerGetResOwnerinfo> getOwnerinfos() {
    return ownerinfos;
  }

  public void setOwnerinfos(List<OwnerGetResOwnerinfo> ownerinfos) {
    this.ownerinfos = ownerinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerGetRes ownerGetRes = (OwnerGetRes) o;
    return Objects.equals(this.ownerinfos, ownerGetRes.ownerinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerGetRes {\n");
    
    sb.append("    ownerinfos: ").append(toIndentedString(ownerinfos)).append("\n");
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
