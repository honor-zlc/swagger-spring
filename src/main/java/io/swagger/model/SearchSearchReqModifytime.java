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
 * 参见condition、value、lvalue、rvalue 注：createtime与modifytime同时出现在搜索条件中时，会是\&quot;或\&quot;的关系，其余所有过滤条件都是\&quot;与\&quot;；文件夹无修改时间；时间格式同创建时间；
 */
@ApiModel(description = "参见condition、value、lvalue、rvalue 注：createtime与modifytime同时出现在搜索条件中时，会是\"或\"的关系，其余所有过滤条件都是\"与\"；文件夹无修改时间；时间格式同创建时间；")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchSearchReqModifytime   {
  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("value")
  private Long value = null;

  @JsonProperty("lvalue")
  private Long lvalue = null;

  @JsonProperty("rvalue")
  private Long rvalue = null;

  public SearchSearchReqModifytime condition(String condition) {
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

  public SearchSearchReqModifytime value(Long value) {
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

  public SearchSearchReqModifytime lvalue(Long lvalue) {
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

  public SearchSearchReqModifytime rvalue(Long rvalue) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchReqModifytime searchSearchReqModifytime = (SearchSearchReqModifytime) o;
    return Objects.equals(this.condition, searchSearchReqModifytime.condition) &&
        Objects.equals(this.value, searchSearchReqModifytime.value) &&
        Objects.equals(this.lvalue, searchSearchReqModifytime.lvalue) &&
        Objects.equals(this.rvalue, searchSearchReqModifytime.rvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, value, lvalue, rvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchReqModifytime {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    lvalue: ").append(toIndentedString(lvalue)).append("\n");
    sb.append("    rvalue: ").append(toIndentedString(rvalue)).append("\n");
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
