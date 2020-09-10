package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Perm1ListResOwnerresult;
import io.swagger.model.Perm1ListResPermresult;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Perm1ListRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1ListRes   {
  @JsonProperty("permresults")
  @Valid
  private List<Perm1ListResPermresult> permresults = new ArrayList<Perm1ListResPermresult>();

  @JsonProperty("ownerresults")
  @Valid
  private List<Perm1ListResOwnerresult> ownerresults = new ArrayList<Perm1ListResOwnerresult>();

  public Perm1ListRes permresults(List<Perm1ListResPermresult> permresults) {
    this.permresults = permresults;
    return this;
  }

  public Perm1ListRes addPermresultsItem(Perm1ListResPermresult permresultsItem) {
    this.permresults.add(permresultsItem);
    return this;
  }

  /**
   * 最终权限信息
   * @return permresults
  **/
  @ApiModelProperty(required = true, value = "最终权限信息")
      @NotNull
    @Valid
    public List<Perm1ListResPermresult> getPermresults() {
    return permresults;
  }

  public void setPermresults(List<Perm1ListResPermresult> permresults) {
    this.permresults = permresults;
  }

  public Perm1ListRes ownerresults(List<Perm1ListResOwnerresult> ownerresults) {
    this.ownerresults = ownerresults;
    return this;
  }

  public Perm1ListRes addOwnerresultsItem(Perm1ListResOwnerresult ownerresultsItem) {
    this.ownerresults.add(ownerresultsItem);
    return this;
  }

  /**
   * 最终所有者信息
   * @return ownerresults
  **/
  @ApiModelProperty(required = true, value = "最终所有者信息")
      @NotNull
    @Valid
    public List<Perm1ListResOwnerresult> getOwnerresults() {
    return ownerresults;
  }

  public void setOwnerresults(List<Perm1ListResOwnerresult> ownerresults) {
    this.ownerresults = ownerresults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1ListRes perm1ListRes = (Perm1ListRes) o;
    return Objects.equals(this.permresults, perm1ListRes.permresults) &&
        Objects.equals(this.ownerresults, perm1ListRes.ownerresults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permresults, ownerresults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1ListRes {\n");
    
    sb.append("    permresults: ").append(toIndentedString(permresults)).append("\n");
    sb.append("    ownerresults: ").append(toIndentedString(ownerresults)).append("\n");
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
