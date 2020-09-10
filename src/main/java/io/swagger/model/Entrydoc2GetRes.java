package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Entrydoc2GetResDocinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Entrydoc2GetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetRes   {
  @JsonProperty("docinfos")
  @Valid
  private List<Entrydoc2GetResDocinfo> docinfos = new ArrayList<Entrydoc2GetResDocinfo>();

  public Entrydoc2GetRes docinfos(List<Entrydoc2GetResDocinfo> docinfos) {
    this.docinfos = docinfos;
    return this;
  }

  public Entrydoc2GetRes addDocinfosItem(Entrydoc2GetResDocinfo docinfosItem) {
    this.docinfos.add(docinfosItem);
    return this;
  }

  /**
   * 文档库信息数组
   * @return docinfos
  **/
  @ApiModelProperty(required = true, value = "文档库信息数组")
      @NotNull
    @Valid
    public List<Entrydoc2GetResDocinfo> getDocinfos() {
    return docinfos;
  }

  public void setDocinfos(List<Entrydoc2GetResDocinfo> docinfos) {
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
    Entrydoc2GetRes entrydoc2GetRes = (Entrydoc2GetRes) o;
    return Objects.equals(this.docinfos, entrydoc2GetRes.docinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetRes {\n");
    
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
