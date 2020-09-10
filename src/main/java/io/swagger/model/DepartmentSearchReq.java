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
 * DepartmentSearchReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DepartmentSearchReq   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("limit")
  private Long limit = null;

  public DepartmentSearchReq key(String key) {
    this.key = key;
    return this;
  }

  /**
   * 关键字
   * @return key
  **/
  @ApiModelProperty(required = true, value = "关键字")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DepartmentSearchReq start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * 分页开始号，从0开始
   * @return start
  **/
  @ApiModelProperty(value = "分页开始号，从0开始")
  
    public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public DepartmentSearchReq limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * 条数，表示取多少用户或部门，-1表示不限制
   * @return limit
  **/
  @ApiModelProperty(value = "条数，表示取多少用户或部门，-1表示不限制")
  
    public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentSearchReq departmentSearchReq = (DepartmentSearchReq) o;
    return Objects.equals(this.key, departmentSearchReq.key) &&
        Objects.equals(this.start, departmentSearchReq.start) &&
        Objects.equals(this.limit, departmentSearchReq.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentSearchReq {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
