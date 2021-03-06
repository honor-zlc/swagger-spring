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
 * FileRenameReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileRenameReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  public FileRenameReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 要重命名的文件gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "要重命名的文件gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileRenameReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 重命名成功后的新文件名，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "重命名成功后的新文件名，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileRenameReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  
   * @return ondup
  **/
  @ApiModelProperty(value = "- 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  ")
  
    public Long getOndup() {
    return ondup;
  }

  public void setOndup(Long ondup) {
    this.ondup = ondup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRenameReq fileRenameReq = (FileRenameReq) o;
    return Objects.equals(this.docid, fileRenameReq.docid) &&
        Objects.equals(this.name, fileRenameReq.name) &&
        Objects.equals(this.ondup, fileRenameReq.ondup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, ondup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRenameReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ondup: ").append(toIndentedString(ondup)).append("\n");
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
