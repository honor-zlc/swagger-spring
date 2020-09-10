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
 * ContactorGetpersonsReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorGetpersonsReq   {
  @JsonProperty("groupid")
  private String groupid = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("limit")
  private Long limit = null;

  public ContactorGetpersonsReq groupid(String groupid) {
    this.groupid = groupid;
    return this;
  }

  /**
   * 联系人组唯一标识
   * @return groupid
  **/
  @ApiModelProperty(required = true, value = "联系人组唯一标识")
      @NotNull

    public String getGroupid() {
    return groupid;
  }

  public void setGroupid(String groupid) {
    this.groupid = groupid;
  }

  public ContactorGetpersonsReq start(Long start) {
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

  public ContactorGetpersonsReq limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * 条数，表示取多少联系人，-1表示不限制
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "条数，表示取多少联系人，-1表示不限制")
      @NotNull

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
    ContactorGetpersonsReq contactorGetpersonsReq = (ContactorGetpersonsReq) o;
    return Objects.equals(this.groupid, contactorGetpersonsReq.groupid) &&
        Objects.equals(this.start, contactorGetpersonsReq.start) &&
        Objects.equals(this.limit, contactorGetpersonsReq.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupid, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorGetpersonsReq {\n");
    
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
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
