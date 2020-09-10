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
 * DirListReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirListReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("by")
  private String by = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("attr")
  private Boolean attr = null;

  public DirListReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 要浏览的目录的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "要浏览的目录的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirListReq by(String by) {
    this.by = by;
    return this;
  }

  /**
   * 指定按哪个字段排序    若不指定，默认按docid升序排序    说明：  - name，按文件名称（中文按拼音）排序  - size，按大小排序（目录按name升序）  - time，按服务器修改时间排序  
   * @return by
  **/
  @ApiModelProperty(value = "指定按哪个字段排序    若不指定，默认按docid升序排序    说明：  - name，按文件名称（中文按拼音）排序  - size，按大小排序（目录按name升序）  - time，按服务器修改时间排序  ")
  
    public String getBy() {
    return by;
  }

  public void setBy(String by) {
    this.by = by;
  }

  public DirListReq sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * 升序还是降序，默认为升序    说明：  - asc，升序  - desc，降序  
   * @return sort
  **/
  @ApiModelProperty(value = "升序还是降序，默认为升序    说明：  - asc，升序  - desc，降序  ")
  
    public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public DirListReq attr(Boolean attr) {
    this.attr = attr;
    return this;
  }

  /**
   * 默认为false,即不取文件或者目录属性信息,    为true时,则取文件或者目录的属性信息  
   * @return attr
  **/
  @ApiModelProperty(value = "默认为false,即不取文件或者目录属性信息,    为true时,则取文件或者目录的属性信息  ")
  
    public Boolean isAttr() {
    return attr;
  }

  public void setAttr(Boolean attr) {
    this.attr = attr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirListReq dirListReq = (DirListReq) o;
    return Objects.equals(this.docid, dirListReq.docid) &&
        Objects.equals(this.by, dirListReq.by) &&
        Objects.equals(this.sort, dirListReq.sort) &&
        Objects.equals(this.attr, dirListReq.attr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, by, sort, attr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirListReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
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
