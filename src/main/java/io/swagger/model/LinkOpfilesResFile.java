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
 * LinkOpfilesResFile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpfilesResFile   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  public LinkOpfilesResFile docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件gns")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOpfilesResFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkOpfilesResFile path(String path) {
    this.path = path;
    return this;
  }

  /**
   * 文件路径，以外链文件或文件夹为根
   * @return path
  **/
  @ApiModelProperty(required = true, value = "文件路径，以外链文件或文件夹为根")
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
    LinkOpfilesResFile linkOpfilesResFile = (LinkOpfilesResFile) o;
    return Objects.equals(this.docid, linkOpfilesResFile.docid) &&
        Objects.equals(this.name, linkOpfilesResFile.name) &&
        Objects.equals(this.path, linkOpfilesResFile.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpfilesResFile {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
