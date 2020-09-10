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
 * SearchSearchReqCustomattr
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchSearchReqCustomattr   {
  @JsonProperty("attr")
  private Long attr = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("level")
  private Long level = null;

  @JsonProperty("value")
  private Long value = null;

  @JsonProperty("rvalue")
  private Long rvalue = null;

  @JsonProperty("lvalue")
  private Long lvalue = null;

  public SearchSearchReqCustomattr attr(Long attr) {
    this.attr = attr;
    return this;
  }

  /**
   * 自定义属性id，customattr内每个对象必须有attr
   * @return attr
  **/
  @ApiModelProperty(value = "自定义属性id，customattr内每个对象必须有attr")
  
    public Long getAttr() {
    return attr;
  }

  public void setAttr(Long attr) {
    this.attr = attr;
  }

  public SearchSearchReqCustomattr condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * 自定义属性搜索条件，customattr内每个对象必须有condition，可以为：  “=”，需要给出value  “>”，需要给出value  “<”，需要给出value  “[]”，需要给出lvalue，rvalue，搜索符合 [lvalue, rvalue] 范围内的记录  
   * @return condition
  **/
  @ApiModelProperty(value = "自定义属性搜索条件，customattr内每个对象必须有condition，可以为：  “=”，需要给出value  “>”，需要给出value  “<”，需要给出value  “[]”，需要给出lvalue，rvalue，搜索符合 [lvalue, rvalue] 范围内的记录  ")
  
    public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public SearchSearchReqCustomattr level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * 层级自定义属性的值的层数  默认为0，表示非层级属性  
   * @return level
  **/
  @ApiModelProperty(value = "层级自定义属性的值的层数  默认为0，表示非层级属性  ")
  
    public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public SearchSearchReqCustomattr value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * 自定义属性搜索关键词id或数值，condition为“=”、 “>”、 “<”时需要该项值
   * @return value
  **/
  @ApiModelProperty(value = "自定义属性搜索关键词id或数值，condition为“=”、 “>”、 “<”时需要该项值")
  
    public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public SearchSearchReqCustomattr rvalue(Long rvalue) {
    this.rvalue = rvalue;
    return this;
  }

  /**
   * 自定义属性搜索数值，condition为”[]”时需要该项值
   * @return rvalue
  **/
  @ApiModelProperty(value = "自定义属性搜索数值，condition为”[]”时需要该项值")
  
    public Long getRvalue() {
    return rvalue;
  }

  public void setRvalue(Long rvalue) {
    this.rvalue = rvalue;
  }

  public SearchSearchReqCustomattr lvalue(Long lvalue) {
    this.lvalue = lvalue;
    return this;
  }

  /**
   * 自定义属性搜索数值，condition为”[]”时需要该项值
   * @return lvalue
  **/
  @ApiModelProperty(value = "自定义属性搜索数值，condition为”[]”时需要该项值")
  
    public Long getLvalue() {
    return lvalue;
  }

  public void setLvalue(Long lvalue) {
    this.lvalue = lvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchReqCustomattr searchSearchReqCustomattr = (SearchSearchReqCustomattr) o;
    return Objects.equals(this.attr, searchSearchReqCustomattr.attr) &&
        Objects.equals(this.condition, searchSearchReqCustomattr.condition) &&
        Objects.equals(this.level, searchSearchReqCustomattr.level) &&
        Objects.equals(this.value, searchSearchReqCustomattr.value) &&
        Objects.equals(this.rvalue, searchSearchReqCustomattr.rvalue) &&
        Objects.equals(this.lvalue, searchSearchReqCustomattr.lvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attr, condition, level, value, rvalue, lvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchReqCustomattr {\n");
    
    sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    rvalue: ").append(toIndentedString(rvalue)).append("\n");
    sb.append("    lvalue: ").append(toIndentedString(lvalue)).append("\n");
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
