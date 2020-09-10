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
 * DirCreateReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirCreateReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  public DirCreateReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 待创建目录的父目录gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "待创建目录的父目录gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirCreateReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 目录名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "目录名称，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DirCreateReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * 默认值 ：1  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @ApiModelProperty(value = "默认值 ：1  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  ")
  
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
    DirCreateReq dirCreateReq = (DirCreateReq) o;
    return Objects.equals(this.docid, dirCreateReq.docid) &&
        Objects.equals(this.name, dirCreateReq.name) &&
        Objects.equals(this.ondup, dirCreateReq.ondup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, ondup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCreateReq {\n");
    
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
