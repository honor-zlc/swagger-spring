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
 * FileSetfilecustomattributeReqAttribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileSetfilecustomattributeReqAttribute   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("value")
  private OneOffileSetfilecustomattributeReqAttributeValue value = null;

  public FileSetfilecustomattributeReqAttribute id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 属性ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "属性ID")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FileSetfilecustomattributeReqAttribute value(OneOffileSetfilecustomattributeReqAttributeValue value) {
    this.value = value;
    return this;
  }

  /**
   * 属性值string/int/int array    type等于3时value类型为string，0为int array, 其余均为int    注： 时长单位为秒  
   * @return value
  **/
  @ApiModelProperty(value = "属性值string/int/int array    type等于3时value类型为string，0为int array, 其余均为int    注： 时长单位为秒  ")
  
    public OneOffileSetfilecustomattributeReqAttributeValue getValue() {
    return value;
  }

  public void setValue(OneOffileSetfilecustomattributeReqAttributeValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSetfilecustomattributeReqAttribute fileSetfilecustomattributeReqAttribute = (FileSetfilecustomattributeReqAttribute) o;
    return Objects.equals(this.id, fileSetfilecustomattributeReqAttribute.id) &&
        Objects.equals(this.value, fileSetfilecustomattributeReqAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSetfilecustomattributeReqAttribute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
