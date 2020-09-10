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
 * DirCreatemultileveldirReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirCreatemultileveldirReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("path")
  private String path = null;

  public DirCreatemultileveldirReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 待创建多级目录的父目录gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "待创建多级目录的父目录gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirCreatemultileveldirReq path(String path) {
    this.path = path;
    return this;
  }

  /**
   * 多级目录名称，UTF8编码
   * @return path
  **/
  @ApiModelProperty(required = true, value = "多级目录名称，UTF8编码")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirCreatemultileveldirReq dirCreatemultileveldirReq = (DirCreatemultileveldirReq) o;
    return Objects.equals(this.docid, dirCreatemultileveldirReq.docid) &&
        Objects.equals(this.path, dirCreatemultileveldirReq.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCreatemultileveldirReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
