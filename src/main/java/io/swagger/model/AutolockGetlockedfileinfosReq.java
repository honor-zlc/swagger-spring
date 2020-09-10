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
 * AutolockGetlockedfileinfosReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockGetlockedfileinfosReq   {
  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("limit")
  private Long limit = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("locker")
  private String locker = null;

  public AutolockGetlockedfileinfosReq start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * 开始位置，默认为0
   * @return start
  **/
  @ApiModelProperty(value = "开始位置，默认为0")
  
    public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public AutolockGetlockedfileinfosReq limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * 分页条数，默认为-1，返回start后面的所有记录
   * @return limit
  **/
  @ApiModelProperty(value = "分页条数，默认为-1，返回start后面的所有记录")
  
    public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public AutolockGetlockedfileinfosReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 按照文件名查找，默认为空，不进行过滤
   * @return name
  **/
  @ApiModelProperty(value = "按照文件名查找，默认为空，不进行过滤")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AutolockGetlockedfileinfosReq locker(String locker) {
    this.locker = locker;
    return this;
  }

  /**
   * 按照锁定者查找，默认为空，不进行过滤
   * @return locker
  **/
  @ApiModelProperty(value = "按照锁定者查找，默认为空，不进行过滤")
  
    public String getLocker() {
    return locker;
  }

  public void setLocker(String locker) {
    this.locker = locker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockGetlockedfileinfosReq autolockGetlockedfileinfosReq = (AutolockGetlockedfileinfosReq) o;
    return Objects.equals(this.start, autolockGetlockedfileinfosReq.start) &&
        Objects.equals(this.limit, autolockGetlockedfileinfosReq.limit) &&
        Objects.equals(this.name, autolockGetlockedfileinfosReq.name) &&
        Objects.equals(this.locker, autolockGetlockedfileinfosReq.locker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, name, locker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockGetlockedfileinfosReq {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locker: ").append(toIndentedString(locker)).append("\n");
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
