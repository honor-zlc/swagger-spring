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
 * LinkCopyRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkCopyRes   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  public LinkCopyRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 返回复制后的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "返回复制后的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkCopyRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UTF8编码，仅当ondup为2时才返回，否则返回参数仍然为空
   * @return name
  **/
  @ApiModelProperty(value = "UTF8编码，仅当ondup为2时才返回，否则返回参数仍然为空")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkCopyRes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 发起复制任务后，如果复制对象为目录，返回任务ID,用于查询复制任务进度信息
   * @return id
  **/
  @ApiModelProperty(required = true, value = "发起复制任务后，如果复制对象为目录，返回任务ID,用于查询复制任务进度信息")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkCopyRes linkCopyRes = (LinkCopyRes) o;
    return Objects.equals(this.docid, linkCopyRes.docid) &&
        Objects.equals(this.name, linkCopyRes.name) &&
        Objects.equals(this.id, linkCopyRes.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkCopyRes {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
