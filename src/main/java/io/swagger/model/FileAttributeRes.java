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
 * FileAttributeRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileAttributeRes   {
  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = new ArrayList<String>();

  @JsonProperty("uniqueid")
  private String uniqueid = null;

  public FileAttributeRes createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * 返回服务器端modified的值
   * @return createTime
  **/
  @ApiModelProperty(required = true, value = "返回服务器端modified的值")
      @NotNull

    public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public FileAttributeRes creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 文件创建者
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "文件创建者")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public FileAttributeRes csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级，5~15
   * @return csflevel
  **/
  @ApiModelProperty(required = true, value = "文件密级，5~15")
      @NotNull

    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public FileAttributeRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件名，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileAttributeRes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FileAttributeRes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 文件的标签，字符串数组
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "文件的标签，字符串数组")
      @NotNull

    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FileAttributeRes uniqueid(String uniqueid) {
    this.uniqueid = uniqueid;
    return this;
  }

  /**
   * 对于归档库文件，返回文件唯一标识
   * @return uniqueid
  **/
  @ApiModelProperty(value = "对于归档库文件，返回文件唯一标识")
  
    public String getUniqueid() {
    return uniqueid;
  }

  public void setUniqueid(String uniqueid) {
    this.uniqueid = uniqueid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAttributeRes fileAttributeRes = (FileAttributeRes) o;
    return Objects.equals(this.createTime, fileAttributeRes.createTime) &&
        Objects.equals(this.creator, fileAttributeRes.creator) &&
        Objects.equals(this.csflevel, fileAttributeRes.csflevel) &&
        Objects.equals(this.name, fileAttributeRes.name) &&
        Objects.equals(this.tags, fileAttributeRes.tags) &&
        Objects.equals(this.uniqueid, fileAttributeRes.uniqueid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, creator, csflevel, name, tags, uniqueid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAttributeRes {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    uniqueid: ").append(toIndentedString(uniqueid)).append("\n");
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
