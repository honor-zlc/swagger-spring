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
 * Entrydoc2GetuserquotaResQuotainfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetuserquotaResQuotainfo   {
  @JsonProperty("doctype")
  private Long doctype = null;

  @JsonProperty("typename")
  private String typename = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quota")
  private Long quota = null;

  @JsonProperty("used")
  private Long used = null;

  public Entrydoc2GetuserquotaResQuotainfo doctype(Long doctype) {
    this.doctype = doctype;
    return this;
  }

  /**
   * 文档库类型：  1：个人文档库  2：个人群组文档库  
   * @return doctype
  **/
  @ApiModelProperty(required = true, value = "文档库类型：  1：个人文档库  2：个人群组文档库  ")
      @NotNull

    public Long getDoctype() {
    return doctype;
  }

  public void setDoctype(Long doctype) {
    this.doctype = doctype;
  }

  public Entrydoc2GetuserquotaResQuotainfo typename(String typename) {
    this.typename = typename;
    return this;
  }

  /**
   * 文档库类型名称
   * @return typename
  **/
  @ApiModelProperty(required = true, value = "文档库类型名称")
      @NotNull

    public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }

  public Entrydoc2GetuserquotaResQuotainfo docid(String docid) {
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

  public Entrydoc2GetuserquotaResQuotainfo name(String name) {
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

  public Entrydoc2GetuserquotaResQuotainfo quota(Long quota) {
    this.quota = quota;
    return this;
  }

  /**
   * 配额
   * @return quota
  **/
  @ApiModelProperty(required = true, value = "配额")
      @NotNull

    public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public Entrydoc2GetuserquotaResQuotainfo used(Long used) {
    this.used = used;
    return this;
  }

  /**
   * 已用空间
   * @return used
  **/
  @ApiModelProperty(required = true, value = "已用空间")
      @NotNull

    public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetuserquotaResQuotainfo entrydoc2GetuserquotaResQuotainfo = (Entrydoc2GetuserquotaResQuotainfo) o;
    return Objects.equals(this.doctype, entrydoc2GetuserquotaResQuotainfo.doctype) &&
        Objects.equals(this.typename, entrydoc2GetuserquotaResQuotainfo.typename) &&
        Objects.equals(this.docid, entrydoc2GetuserquotaResQuotainfo.docid) &&
        Objects.equals(this.name, entrydoc2GetuserquotaResQuotainfo.name) &&
        Objects.equals(this.quota, entrydoc2GetuserquotaResQuotainfo.quota) &&
        Objects.equals(this.used, entrydoc2GetuserquotaResQuotainfo.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctype, typename, docid, name, quota, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetuserquotaResQuotainfo {\n");
    
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
