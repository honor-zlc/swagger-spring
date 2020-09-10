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
 * LinkGetlinkedResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkGetlinkedResItem   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("namepath")
  private String namepath = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("modified")
  private Long modified = null;

  public LinkGetlinkedResItem docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 外链访问的文件gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "外链访问的文件gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkGetlinkedResItem namepath(String namepath) {
    this.namepath = namepath;
    return this;
  }

  /**
   * 外链访问的文件name路径
   * @return namepath
  **/
  @ApiModelProperty(required = true, value = "外链访问的文件name路径")
      @NotNull

    public String getNamepath() {
    return namepath;
  }

  public void setNamepath(String namepath) {
    this.namepath = namepath;
  }

  public LinkGetlinkedResItem size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 外链访问的文件大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "外链访问的文件大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LinkGetlinkedResItem modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 外链访问的文件最后修改时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "外链访问的文件最后修改时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGetlinkedResItem linkGetlinkedResItem = (LinkGetlinkedResItem) o;
    return Objects.equals(this.docid, linkGetlinkedResItem.docid) &&
        Objects.equals(this.namepath, linkGetlinkedResItem.namepath) &&
        Objects.equals(this.size, linkGetlinkedResItem.size) &&
        Objects.equals(this.modified, linkGetlinkedResItem.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, namepath, size, modified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGetlinkedResItem {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    namepath: ").append(toIndentedString(namepath)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
