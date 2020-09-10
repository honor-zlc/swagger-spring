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
 * DirCopyReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirCopyReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("destparent")
  private String destparent = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  public DirCopyReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 要复制的目录gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "要复制的目录gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirCopyReq destparent(String destparent) {
    this.destparent = destparent;
    return this;
  }

  /**
   * 目标父对象的gns路径
   * @return destparent
  **/
  @ApiModelProperty(required = true, value = "目标父对象的gns路径")
      @NotNull

    public String getDestparent() {
    return destparent;
  }

  public void setDestparent(String destparent) {
    this.destparent = destparent;
  }

  public DirCopyReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * - 1:检查是否重命名，重名则抛异常  - 2:默认值，如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @ApiModelProperty(value = "- 1:检查是否重命名，重名则抛异常  - 2:默认值，如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  ")
  
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
    DirCopyReq dirCopyReq = (DirCopyReq) o;
    return Objects.equals(this.docid, dirCopyReq.docid) &&
        Objects.equals(this.destparent, dirCopyReq.destparent) &&
        Objects.equals(this.ondup, dirCopyReq.ondup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, destparent, ondup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCopyReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    destparent: ").append(toIndentedString(destparent)).append("\n");
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
