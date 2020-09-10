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
 * DirAttributeRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirAttributeRes   {
  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = new ArrayList<String>();

  public DirAttributeRes createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * 目录创建的服务端时间
   * @return createTime
  **/
  @ApiModelProperty(required = true, value = "目录创建的服务端时间")
      @NotNull

    public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public DirAttributeRes creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 目录创建者
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "目录创建者")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public DirAttributeRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 目录的修改时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "目录的修改时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public DirAttributeRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 目录名，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "目录名，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DirAttributeRes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DirAttributeRes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 目录的标签，字符串数组
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "目录的标签，字符串数组")
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
    DirAttributeRes dirAttributeRes = (DirAttributeRes) o;
    return Objects.equals(this.createTime, dirAttributeRes.createTime) &&
        Objects.equals(this.creator, dirAttributeRes.creator) &&
        Objects.equals(this.modified, dirAttributeRes.modified) &&
        Objects.equals(this.name, dirAttributeRes.name) &&
        Objects.equals(this.tags, dirAttributeRes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, creator, modified, name, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirAttributeRes {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
