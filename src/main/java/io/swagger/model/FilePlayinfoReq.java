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
 * FilePlayinfoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FilePlayinfoReq   {
  @JsonProperty("definition")
  private String definition = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  public FilePlayinfoReq definition(String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * 视频画质（音频音质），为空默认为原始画质    有效值：空； od；sd    注：对于视频，od表示原始画质，sd表示标清；对于音频，sd请求无效
   * @return definition
  **/
  @ApiModelProperty(value = "视频画质（音频音质），为空默认为原始画质    有效值：空； od；sd    注：对于视频，od表示原始画质，sd表示标清；对于音频，sd请求无效")
  
    public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public FilePlayinfoReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径（列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件gns路径（列举协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FilePlayinfoReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 版本号，为空默认获取最新版本
   * @return rev
  **/
  @ApiModelProperty(value = "版本号，为空默认获取最新版本")
  
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
    FilePlayinfoReq filePlayinfoReq = (FilePlayinfoReq) o;
    return Objects.equals(this.definition, filePlayinfoReq.definition) &&
        Objects.equals(this.docid, filePlayinfoReq.docid) &&
        Objects.equals(this.rev, filePlayinfoReq.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, docid, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePlayinfoReq {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
