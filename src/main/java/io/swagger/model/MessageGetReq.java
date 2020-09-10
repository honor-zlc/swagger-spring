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
 * MessageGetReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetReq   {
  @JsonProperty("stamp")
  private Long stamp = null;

  @JsonProperty("sort")
  private String sort = null;

  public MessageGetReq stamp(Long stamp) {
    this.stamp = stamp;
    return this;
  }

  /**
   * 通知的时间 (unix utc ms)的起始点，可由上一次get提供。第一次get，值为0表示所有
   * @return stamp
  **/
  @ApiModelProperty(value = "通知的时间 (unix utc ms)的起始点，可由上一次get提供。第一次get，值为0表示所有")
  
    public Long getStamp() {
    return stamp;
  }

  public void setStamp(Long stamp) {
    this.stamp = stamp;
  }

  public MessageGetReq sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * 返回结果的排序方式。asc：按照消息生成时间升序排列；desc：按照消息生成时间降序排列；默认按照升序排列，即新消息在后面。
   * @return sort
  **/
  @ApiModelProperty(value = "返回结果的排序方式。asc：按照消息生成时间升序排列；desc：按照消息生成时间降序排列；默认按照升序排列，即新消息在后面。")
  
    public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetReq messageGetReq = (MessageGetReq) o;
    return Objects.equals(this.stamp, messageGetReq.stamp) &&
        Objects.equals(this.sort, messageGetReq.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stamp, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetReq {\n");
    
    sb.append("    stamp: ").append(toIndentedString(stamp)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
