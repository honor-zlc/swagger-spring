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
 * FileGetfilecustomattributeResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetfilecustomattributeResItem   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private OneOffileGetfilecustomattributeResItemValue value = null;

  @JsonProperty("valueid")
  @Valid
  private List<Integer> valueid = null;

  @JsonProperty("type")
  private Long type = null;

  public FileGetfilecustomattributeResItem id(Long id) {
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

  public FileGetfilecustomattributeResItem name(String name) {
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

  public FileGetfilecustomattributeResItem value(OneOffileGetfilecustomattributeResItemValue value) {
    this.value = value;
    return this;
  }

  /**
   * 属性值，类型为：string/int/string array    type等于1、3时value类型为string，0为string array, 其余均为int    属性值为空时不存在此字段    
   * @return value
  **/
  @ApiModelProperty(value = "属性值，类型为：string/int/string array    type等于1、3时value类型为string，0为string array, 其余均为int    属性值为空时不存在此字段    ")
  
    public OneOffileGetfilecustomattributeResItemValue getValue() {
    return value;
  }

  public void setValue(OneOffileGetfilecustomattributeResItemValue value) {
    this.value = value;
  }

  public FileGetfilecustomattributeResItem valueid(List<Integer> valueid) {
    this.valueid = valueid;
    return this;
  }

  public FileGetfilecustomattributeResItem addValueidItem(Integer valueidItem) {
    if (this.valueid == null) {
      this.valueid = new ArrayList<Integer>();
    }
    this.valueid.add(valueidItem);
    return this;
  }

  /**
   * 属性值ID，类型为int/int array    type等于0或1时存在。0时是int array  
   * @return valueid
  **/
  @ApiModelProperty(value = "属性值ID，类型为int/int array    type等于0或1时存在。0时是int array  ")
  
    public List<Integer> getValueid() {
    return valueid;
  }

  public void setValueid(List<Integer> valueid) {
    this.valueid = valueid;
  }

  public FileGetfilecustomattributeResItem type(Long type) {
    this.type = type;
    return this;
  }

  /**
   * 属性类型  - 0：层级  - 1：枚举  - 2：数字  - 3：文本  - 4：时间 （秒）  
   * @return type
  **/
  @ApiModelProperty(required = true, value = "属性类型  - 0：层级  - 1：枚举  - 2：数字  - 3：文本  - 4：时间 （秒）  ")
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
    FileGetfilecustomattributeResItem fileGetfilecustomattributeResItem = (FileGetfilecustomattributeResItem) o;
    return Objects.equals(this.id, fileGetfilecustomattributeResItem.id) &&
        Objects.equals(this.name, fileGetfilecustomattributeResItem.name) &&
        Objects.equals(this.value, fileGetfilecustomattributeResItem.value) &&
        Objects.equals(this.valueid, fileGetfilecustomattributeResItem.valueid) &&
        Objects.equals(this.type, fileGetfilecustomattributeResItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, value, valueid, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetfilecustomattributeResItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueid: ").append(toIndentedString(valueid)).append("\n");
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
