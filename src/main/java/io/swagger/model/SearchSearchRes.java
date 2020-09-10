package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SearchSearchResHighlighting;
import io.swagger.model.SearchSearchResResponse;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchSearchRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchSearchRes   {
  @JsonProperty("response")
  private SearchSearchResResponse response = null;

  @JsonProperty("highlighting")
  private SearchSearchResHighlighting highlighting = null;

  public SearchSearchRes response(SearchSearchResResponse response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public SearchSearchResResponse getResponse() {
    return response;
  }

  public void setResponse(SearchSearchResResponse response) {
    this.response = response;
  }

  public SearchSearchRes highlighting(SearchSearchResHighlighting highlighting) {
    this.highlighting = highlighting;
    return this;
  }

  /**
   * Get highlighting
   * @return highlighting
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SearchSearchResHighlighting getHighlighting() {
    return highlighting;
  }

  public void setHighlighting(SearchSearchResHighlighting highlighting) {
    this.highlighting = highlighting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchRes searchSearchRes = (SearchSearchRes) o;
    return Objects.equals(this.response, searchSearchRes.response) &&
        Objects.equals(this.highlighting, searchSearchRes.highlighting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, highlighting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchRes {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    highlighting: ").append(toIndentedString(highlighting)).append("\n");
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
