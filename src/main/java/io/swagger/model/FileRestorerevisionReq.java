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
 * FileRestorerevisionReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileRestorerevisionReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  public FileRestorerevisionReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 需要还原版本的文件gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "需要还原版本的文件gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileRestorerevisionReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 版本号
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "版本号")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRestorerevisionReq fileRestorerevisionReq = (FileRestorerevisionReq) o;
    return Objects.equals(this.docid, fileRestorerevisionReq.docid) &&
        Objects.equals(this.rev, fileRestorerevisionReq.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRestorerevisionReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
