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
 * LinkOpfilesReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpfilesReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("limit")
  private Long limit = null;

  public LinkOpfilesReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 外链文件或文件夹gns路径（getlinked协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "外链文件或文件夹gns路径（getlinked协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOpfilesReq start(Long start) {
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

  public LinkOpfilesReq limit(Long limit) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOpfilesReq linkOpfilesReq = (LinkOpfilesReq) o;
    return Objects.equals(this.docid, linkOpfilesReq.docid) &&
        Objects.equals(this.start, linkOpfilesReq.start) &&
        Objects.equals(this.limit, linkOpfilesReq.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpfilesReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
