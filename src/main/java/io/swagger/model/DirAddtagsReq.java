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
 * DirAddtagsReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirAddtagsReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = new ArrayList<String>();

  public DirAddtagsReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 目录gns路径（列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "目录gns路径（列举协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirAddtagsReq tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DirAddtagsReq addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 标签数组，添加的标签中，不允许包含 \\/:*?\\\"<>|#
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "标签数组，添加的标签中，不允许包含 \\/:*?\\\"<>|#")
      @NotNull

    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirAddtagsReq dirAddtagsReq = (DirAddtagsReq) o;
    return Objects.equals(this.docid, dirAddtagsReq.docid) &&
        Objects.equals(this.tags, dirAddtagsReq.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirAddtagsReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
