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
 * DirSizeReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirSizeReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("onlyrecycle")
  private Boolean onlyrecycle = null;

  public DirSizeReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 目录/文件gns路径（列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "目录/文件gns路径（列举协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirSizeReq onlyrecycle(Boolean onlyrecycle) {
    this.onlyrecycle = onlyrecycle;
    return this;
  }

  /**
   * - 默认为false  - 对于非顶级目录，参数onlyrecycle无影响  - 对顶级目录： 如果为false，统计整个顶级目录的大小；如果为true，只统计其中回收站的大小  
   * @return onlyrecycle
  **/
  @ApiModelProperty(value = "- 默认为false  - 对于非顶级目录，参数onlyrecycle无影响  - 对顶级目录： 如果为false，统计整个顶级目录的大小；如果为true，只统计其中回收站的大小  ")
  
    public Boolean isOnlyrecycle() {
    return onlyrecycle;
  }

  public void setOnlyrecycle(Boolean onlyrecycle) {
    this.onlyrecycle = onlyrecycle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirSizeReq dirSizeReq = (DirSizeReq) o;
    return Objects.equals(this.docid, dirSizeReq.docid) &&
        Objects.equals(this.onlyrecycle, dirSizeReq.onlyrecycle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, onlyrecycle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirSizeReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    onlyrecycle: ").append(toIndentedString(onlyrecycle)).append("\n");
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
