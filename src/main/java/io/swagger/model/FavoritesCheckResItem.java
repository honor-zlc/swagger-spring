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
 * FavoritesCheckResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FavoritesCheckResItem   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("favorited")
  private Boolean favorited = null;

  public FavoritesCheckResItem docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件或文件夹gns路径（目录列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件或文件夹gns路径（目录列举协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FavoritesCheckResItem favorited(Boolean favorited) {
    this.favorited = favorited;
    return this;
  }

  /**
   * 文件或文件夹是否被收藏
   * @return favorited
  **/
  @ApiModelProperty(required = true, value = "文件或文件夹是否被收藏")
      @NotNull

    public Boolean isFavorited() {
    return favorited;
  }

  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoritesCheckResItem favoritesCheckResItem = (FavoritesCheckResItem) o;
    return Objects.equals(this.docid, favoritesCheckResItem.docid) &&
        Objects.equals(this.favorited, favoritesCheckResItem.favorited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, favorited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoritesCheckResItem {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
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
