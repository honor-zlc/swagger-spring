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
 * DirCreatemultileveldirRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirCreatemultileveldirRes   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("modified")
  private Long modified = null;

  public DirCreatemultileveldirRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 创建的多级目录最后一级的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "创建的多级目录最后一级的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirCreatemultileveldirRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 数据变化标识
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "数据变化标识")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public DirCreatemultileveldirRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 创建时间，UTC时间，此为服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "创建时间，UTC时间，此为服务器时间")
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
    DirCreatemultileveldirRes dirCreatemultileveldirRes = (DirCreatemultileveldirRes) o;
    return Objects.equals(this.docid, dirCreatemultileveldirRes.docid) &&
        Objects.equals(this.rev, dirCreatemultileveldirRes.rev) &&
        Objects.equals(this.modified, dirCreatemultileveldirRes.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, modified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCreatemultileveldirRes {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
