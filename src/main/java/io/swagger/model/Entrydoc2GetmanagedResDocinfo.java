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
 * Entrydoc2GetmanagedResDocinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetmanagedResDocinfo   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("doctype")
  private Long doctype = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("typename")
  private String typename = null;

  public Entrydoc2GetmanagedResDocinfo docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档库id
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档库id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public Entrydoc2GetmanagedResDocinfo doctype(Long doctype) {
    this.doctype = doctype;
    return this;
  }

  /**
   * 文档库类型：  1：个人文档库  2：个人群组文档库  3：自定义文档库  4：共享个人文档库  5：归档库  6：共享个人群组文档库  
   * @return doctype
  **/
  @ApiModelProperty(required = true, value = "文档库类型：  1：个人文档库  2：个人群组文档库  3：自定义文档库  4：共享个人文档库  5：归档库  6：共享个人群组文档库  ")
      @NotNull

    public Long getDoctype() {
    return doctype;
  }

  public void setDoctype(Long doctype) {
    this.doctype = doctype;
  }

  public Entrydoc2GetmanagedResDocinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文档库名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文档库名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Entrydoc2GetmanagedResDocinfo rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件库变化标识
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "文件库变化标识")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public Entrydoc2GetmanagedResDocinfo size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * -1表示文件夹
   * @return size
  **/
  @ApiModelProperty(required = true, value = "-1表示文件夹")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Entrydoc2GetmanagedResDocinfo typename(String typename) {
    this.typename = typename;
    return this;
  }

  /**
   * 文档类型名称
   * @return typename
  **/
  @ApiModelProperty(required = true, value = "文档类型名称")
      @NotNull

    public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetmanagedResDocinfo entrydoc2GetmanagedResDocinfo = (Entrydoc2GetmanagedResDocinfo) o;
    return Objects.equals(this.docid, entrydoc2GetmanagedResDocinfo.docid) &&
        Objects.equals(this.doctype, entrydoc2GetmanagedResDocinfo.doctype) &&
        Objects.equals(this.name, entrydoc2GetmanagedResDocinfo.name) &&
        Objects.equals(this.rev, entrydoc2GetmanagedResDocinfo.rev) &&
        Objects.equals(this.size, entrydoc2GetmanagedResDocinfo.size) &&
        Objects.equals(this.typename, entrydoc2GetmanagedResDocinfo.typename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, doctype, name, rev, size, typename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetmanagedResDocinfo {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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
