package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FileCustomattributevalueResItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileCustomattributevalueResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileCustomattributevalueResItem   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("level")
  private Long level = null;

  @JsonProperty("child")
  @Valid
  private List<FileCustomattributevalueResItem> child = null;

  public FileCustomattributevalueResItem id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 属性值ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "属性值ID")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FileCustomattributevalueResItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 属性值名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "属性值名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileCustomattributevalueResItem level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * 属性值层级
   * @return level
  **/
  @ApiModelProperty(required = true, value = "属性值层级")
      @NotNull

    public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public FileCustomattributevalueResItem child(List<FileCustomattributevalueResItem> child) {
    this.child = child;
    return this;
  }

  public FileCustomattributevalueResItem addChildItem(FileCustomattributevalueResItem childItem) {
    if (this.child == null) {
      this.child = new ArrayList<FileCustomattributevalueResItem>();
    }
    this.child.add(childItem);
    return this;
  }

  /**
   * 属性值子属性：包括以上三个字段的数组
   * @return child
  **/
  @ApiModelProperty(value = "属性值子属性：包括以上三个字段的数组")
      @Valid
    public List<FileCustomattributevalueResItem> getChild() {
    return child;
  }

  public void setChild(List<FileCustomattributevalueResItem> child) {
    this.child = child;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileCustomattributevalueResItem fileCustomattributevalueResItem = (FileCustomattributevalueResItem) o;
    return Objects.equals(this.id, fileCustomattributevalueResItem.id) &&
        Objects.equals(this.name, fileCustomattributevalueResItem.name) &&
        Objects.equals(this.level, fileCustomattributevalueResItem.level) &&
        Objects.equals(this.child, fileCustomattributevalueResItem.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, level, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCustomattributevalueResItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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
