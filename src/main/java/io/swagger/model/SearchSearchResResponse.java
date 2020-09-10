package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SearchSearchResResponseDoc;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 文档相关信息和下次请求的边界值
 */
@ApiModel(description = "文档相关信息和下次请求的边界值")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchSearchResResponse   {
  @JsonProperty("next")
  private String next = null;

  @JsonProperty("docs")
  @Valid
  private List<SearchSearchResResponseDoc> docs = new ArrayList<SearchSearchResResponseDoc>();

  @JsonProperty("hits")
  private Long hits = null;

  public SearchSearchResResponse next(String next) {
    this.next = next;
    return this;
  }

  /**
   * 返回下次发起请求的start
   * @return next
  **/
  @ApiModelProperty(required = true, value = "返回下次发起请求的start")
      @NotNull

    public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public SearchSearchResResponse docs(List<SearchSearchResResponseDoc> docs) {
    this.docs = docs;
    return this;
  }

  public SearchSearchResResponse addDocsItem(SearchSearchResResponseDoc docsItem) {
    this.docs.add(docsItem);
    return this;
  }

  /**
   * 返回各个文档的信息
   * @return docs
  **/
  @ApiModelProperty(required = true, value = "返回各个文档的信息")
      @NotNull
    @Valid
    public List<SearchSearchResResponseDoc> getDocs() {
    return docs;
  }

  public void setDocs(List<SearchSearchResResponseDoc> docs) {
    this.docs = docs;
  }

  public SearchSearchResResponse hits(Long hits) {
    this.hits = hits;
    return this;
  }

  /**
   * 返回检索命中总数（查询第一页时返回）
   * @return hits
  **/
  @ApiModelProperty(value = "返回检索命中总数（查询第一页时返回）")
  
    public Long getHits() {
    return hits;
  }

  public void setHits(Long hits) {
    this.hits = hits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchResResponse searchSearchResResponse = (SearchSearchResResponse) o;
    return Objects.equals(this.next, searchSearchResResponse.next) &&
        Objects.equals(this.docs, searchSearchResResponse.docs) &&
        Objects.equals(this.hits, searchSearchResResponse.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, docs, hits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchResResponse {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
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
