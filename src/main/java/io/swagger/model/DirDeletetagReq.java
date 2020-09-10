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
 * DirDeletetagReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirDeletetagReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("tag")
  private String tag = null;

  public DirDeletetagReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 目录gns路径（列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "目录gns路径（列举协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirDeletetagReq tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * 标签名
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "标签名")
      @NotNull

    public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirDeletetagReq dirDeletetagReq = (DirDeletetagReq) o;
    return Objects.equals(this.docid, dirDeletetagReq.docid) &&
        Objects.equals(this.tag, dirDeletetagReq.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirDeletetagReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
