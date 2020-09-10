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
 * RecycleRestoreReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class RecycleRestoreReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  public RecycleRestoreReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 要还原的文件/目录在回收站的gns路径（可以是回收站的子目录或者子文件）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "要还原的文件/目录在回收站的gns路径（可以是回收站的子目录或者子文件）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public RecycleRestoreReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * 1:检查是否重命名，重名则抛异常  2:如果重名冲突，自动重名  
   * @return ondup
  **/
  @ApiModelProperty(required = true, value = "1:检查是否重命名，重名则抛异常  2:如果重名冲突，自动重名  ")
      @NotNull

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
    RecycleRestoreReq recycleRestoreReq = (RecycleRestoreReq) o;
    return Objects.equals(this.docid, recycleRestoreReq.docid) &&
        Objects.equals(this.ondup, recycleRestoreReq.ondup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, ondup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleRestoreReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
