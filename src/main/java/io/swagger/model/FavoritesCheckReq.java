package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FavoritesCheckReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FavoritesCheckReq   {
  @JsonProperty("docids")
  @Valid
  private List<String> docids = new ArrayList<String>();

  public FavoritesCheckReq docids(List<String> docids) {
    this.docids = docids;
    return this;
  }

  public FavoritesCheckReq addDocidsItem(String docidsItem) {
    this.docids.add(docidsItem);
    return this;
  }

  /**
   * 文件或文件夹gns数组
   * @return docids
  **/
  @ApiModelProperty(required = true, value = "文件或文件夹gns数组")
      @NotNull

    public List<String> getDocids() {
    return docids;
  }

  public void setDocids(List<String> docids) {
    this.docids = docids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoritesCheckReq favoritesCheckReq = (FavoritesCheckReq) o;
    return Objects.equals(this.docids, favoritesCheckReq.docids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoritesCheckReq {\n");
    
    sb.append("    docids: ").append(toIndentedString(docids)).append("\n");
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
