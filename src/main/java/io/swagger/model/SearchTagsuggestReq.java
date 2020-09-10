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
 * SearchTagsuggestReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchTagsuggestReq   {
  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("prefix")
  private String prefix = null;

  public SearchTagsuggestReq count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * 需要建议的最大返回个数，大于0，默认是10
   * @return count
  **/
  @ApiModelProperty(value = "需要建议的最大返回个数，大于0，默认是10")
  
    public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public SearchTagsuggestReq prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * 需要建议的标签前缀，不能为空
   * @return prefix
  **/
  @ApiModelProperty(required = true, value = "需要建议的标签前缀，不能为空")
      @NotNull

    public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTagsuggestReq searchTagsuggestReq = (SearchTagsuggestReq) o;
    return Objects.equals(this.count, searchTagsuggestReq.count) &&
        Objects.equals(this.prefix, searchTagsuggestReq.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTagsuggestReq {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
