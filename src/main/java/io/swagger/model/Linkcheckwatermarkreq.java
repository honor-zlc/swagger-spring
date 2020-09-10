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
 * 外链水印检查传参
 */
@ApiModel(description = "外链水印检查传参")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Linkcheckwatermarkreq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("link")
  private String link = null;

  public Linkcheckwatermarkreq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档docid
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档docid")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public Linkcheckwatermarkreq link(String link) {
    this.link = link;
    return this;
  }

  /**
   * 外链id
   * @return link
  **/
  @ApiModelProperty(value = "外链id")
  
    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Linkcheckwatermarkreq linkcheckwatermarkreq = (Linkcheckwatermarkreq) o;
    return Objects.equals(this.docid, linkcheckwatermarkreq.docid) &&
        Objects.equals(this.link, linkcheckwatermarkreq.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Linkcheckwatermarkreq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
