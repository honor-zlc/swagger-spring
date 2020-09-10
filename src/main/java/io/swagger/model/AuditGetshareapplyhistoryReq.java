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
 * AuditGetshareapplyhistoryReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetshareapplyhistoryReq   {
  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("limit")
  private Long limit = null;

  @JsonProperty("type")
  private Long type = null;

  public AuditGetshareapplyhistoryReq start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * 分页开始号，从0开始
   * @return start
  **/
  @ApiModelProperty(required = true, value = "分页开始号，从0开始")
      @NotNull

    public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public AuditGetshareapplyhistoryReq limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * 条数，表示取多少条记录，-1表示不限制
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "条数，表示取多少条记录，-1表示不限制")
      @NotNull

    public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public AuditGetshareapplyhistoryReq type(Long type) {
    this.type = type;
    return this;
  }

  /**
   * 用于标识具体获取哪种申请历史, 默认为0  0 表示获取共享申请历史和定密申请历史  1 表示获取共享申请历史(包括共享、外链、所有者和更改继承申请历史)  2 表示获取定密申请历史
   * @return type
  **/
  @ApiModelProperty(required = true, value = "用于标识具体获取哪种申请历史, 默认为0  0 表示获取共享申请历史和定密申请历史  1 表示获取共享申请历史(包括共享、外链、所有者和更改继承申请历史)  2 表示获取定密申请历史")
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
    AuditGetshareapplyhistoryReq auditGetshareapplyhistoryReq = (AuditGetshareapplyhistoryReq) o;
    return Objects.equals(this.start, auditGetshareapplyhistoryReq.start) &&
        Objects.equals(this.limit, auditGetshareapplyhistoryReq.limit) &&
        Objects.equals(this.type, auditGetshareapplyhistoryReq.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapplyhistoryReq {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
