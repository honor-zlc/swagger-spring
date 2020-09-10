package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Perm1GetsharedResDocinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Perm1GetsharedRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1GetsharedRes   {
  @JsonProperty("docinfos")
  @Valid
  private List<Perm1GetsharedResDocinfo> docinfos = new ArrayList<Perm1GetsharedResDocinfo>();

  public Perm1GetsharedRes docinfos(List<Perm1GetsharedResDocinfo> docinfos) {
    this.docinfos = docinfos;
    return this;
  }

  public Perm1GetsharedRes addDocinfosItem(Perm1GetsharedResDocinfo docinfosItem) {
    this.docinfos.add(docinfosItem);
    return this;
  }

  /**
   * 用户已共享的文档信息
   * @return docinfos
  **/
  @ApiModelProperty(required = true, value = "用户已共享的文档信息")
      @NotNull
    @Valid
    public List<Perm1GetsharedResDocinfo> getDocinfos() {
    return docinfos;
  }

  public void setDocinfos(List<Perm1GetsharedResDocinfo> docinfos) {
    this.docinfos = docinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1GetsharedRes perm1GetsharedRes = (Perm1GetsharedRes) o;
    return Objects.equals(this.docinfos, perm1GetsharedRes.docinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1GetsharedRes {\n");
    
    sb.append("    docinfos: ").append(toIndentedString(docinfos)).append("\n");
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
