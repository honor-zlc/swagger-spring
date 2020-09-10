package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FinderGetenabledResDocinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinderGetenabledRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FinderGetenabledRes   {
  @JsonProperty("docinfos")
  @Valid
  private List<FinderGetenabledResDocinfo> docinfos = new ArrayList<FinderGetenabledResDocinfo>();

  public FinderGetenabledRes docinfos(List<FinderGetenabledResDocinfo> docinfos) {
    this.docinfos = docinfos;
    return this;
  }

  public FinderGetenabledRes addDocinfosItem(FinderGetenabledResDocinfo docinfosItem) {
    this.docinfos.add(docinfosItem);
    return this;
  }

  /**
   * 获取到的文档信息
   * @return docinfos
  **/
  @ApiModelProperty(required = true, value = "获取到的文档信息")
      @NotNull
    @Valid
    public List<FinderGetenabledResDocinfo> getDocinfos() {
    return docinfos;
  }

  public void setDocinfos(List<FinderGetenabledResDocinfo> docinfos) {
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
    FinderGetenabledRes finderGetenabledRes = (FinderGetenabledRes) o;
    return Objects.equals(this.docinfos, finderGetenabledRes.docinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinderGetenabledRes {\n");
    
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
