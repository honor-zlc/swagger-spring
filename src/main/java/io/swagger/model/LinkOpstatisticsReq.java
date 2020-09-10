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
 * LinkOpstatisticsReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpstatisticsReq   {
  @JsonProperty("link_docid")
  private String linkDocid = null;

  @JsonProperty("file_docid")
  private String fileDocid = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("limit")
  private Long limit = null;

  public LinkOpstatisticsReq linkDocid(String linkDocid) {
    this.linkDocid = linkDocid;
    return this;
  }

  /**
   * 外链文件gns路径（getlinked协议返回）
   * @return linkDocid
  **/
  @ApiModelProperty(required = true, value = "外链文件gns路径（getlinked协议返回）")
      @NotNull

    public String getLinkDocid() {
    return linkDocid;
  }

  public void setLinkDocid(String linkDocid) {
    this.linkDocid = linkDocid;
  }

  public LinkOpstatisticsReq fileDocid(String fileDocid) {
    this.fileDocid = fileDocid;
    return this;
  }

  /**
   * 文件gns（opfiles协议返回）
   * @return fileDocid
  **/
  @ApiModelProperty(required = true, value = "文件gns（opfiles协议返回）")
      @NotNull

    public String getFileDocid() {
    return fileDocid;
  }

  public void setFileDocid(String fileDocid) {
    this.fileDocid = fileDocid;
  }

  public LinkOpstatisticsReq start(Long start) {
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

  public LinkOpstatisticsReq limit(Long limit) {
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
    LinkOpstatisticsReq linkOpstatisticsReq = (LinkOpstatisticsReq) o;
    return Objects.equals(this.linkDocid, linkOpstatisticsReq.linkDocid) &&
        Objects.equals(this.fileDocid, linkOpstatisticsReq.fileDocid) &&
        Objects.equals(this.start, linkOpstatisticsReq.start) &&
        Objects.equals(this.limit, linkOpstatisticsReq.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkDocid, fileDocid, start, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpstatisticsReq {\n");
    
    sb.append("    linkDocid: ").append(toIndentedString(linkDocid)).append("\n");
    sb.append("    fileDocid: ").append(toIndentedString(fileDocid)).append("\n");
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
