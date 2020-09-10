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
 * SearchCustomattributeResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchCustomattributeResItem   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("type")
  private Long type = null;

  public SearchCustomattributeResItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 属性名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "属性名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SearchCustomattributeResItem id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 属性唯一ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "属性唯一ID")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SearchCustomattributeResItem type(Long type) {
    this.type = type;
    return this;
  }

  /**
   * 属性类型  0：层级  1：枚举  2：数字  3：文本  4：时间 （时间戳）  
   * @return type
  **/
  @ApiModelProperty(required = true, value = "属性类型  0：层级  1：枚举  2：数字  3：文本  4：时间 （时间戳）  ")
      @NotNull

    public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCustomattributeResItem searchCustomattributeResItem = (SearchCustomattributeResItem) o;
    return Objects.equals(this.name, searchCustomattributeResItem.name) &&
        Objects.equals(this.id, searchCustomattributeResItem.id) &&
        Objects.equals(this.type, searchCustomattributeResItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCustomattributeResItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
