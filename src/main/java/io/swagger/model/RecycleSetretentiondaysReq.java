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
 * RecycleSetretentiondaysReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class RecycleSetretentiondaysReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("days")
  private Long days = null;

  public RecycleSetretentiondaysReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 个人文档或者文档库的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "个人文档或者文档库的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public RecycleSetretentiondaysReq days(Long days) {
    this.days = days;
    return this;
  }

  /**
   * 保留天数
   * @return days
  **/
  @ApiModelProperty(required = true, value = "保留天数")
      @NotNull

    public Long getDays() {
    return days;
  }

  public void setDays(Long days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecycleSetretentiondaysReq recycleSetretentiondaysReq = (RecycleSetretentiondaysReq) o;
    return Objects.equals(this.docid, recycleSetretentiondaysReq.docid) &&
        Objects.equals(this.days, recycleSetretentiondaysReq.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleSetretentiondaysReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
