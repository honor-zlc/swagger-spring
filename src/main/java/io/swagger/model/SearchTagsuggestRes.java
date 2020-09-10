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
 * SearchTagsuggestRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchTagsuggestRes   {
  @JsonProperty("suggestions")
  @Valid
  private List<String> suggestions = new ArrayList<String>();

  public SearchTagsuggestRes suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public SearchTagsuggestRes addSuggestionsItem(String suggestionsItem) {
    this.suggestions.add(suggestionsItem);
    return this;
  }

  /**
   * 建议的标签字符串数组
   * @return suggestions
  **/
  @ApiModelProperty(required = true, value = "建议的标签字符串数组")
      @NotNull

    public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTagsuggestRes searchTagsuggestRes = (SearchTagsuggestRes) o;
    return Objects.equals(this.suggestions, searchTagsuggestRes.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTagsuggestRes {\n");
    
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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
