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
 * FileDeletecommentReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileDeletecommentReq   {
  @JsonProperty("commentid")
  private Long commentid = null;

  @JsonProperty("docid")
  private String docid = null;

  public FileDeletecommentReq commentid(Long commentid) {
    this.commentid = commentid;
    return this;
  }

  /**
   * 评论id（由获取文件评论协议返回）
   * @return commentid
  **/
  @ApiModelProperty(required = true, value = "评论id（由获取文件评论协议返回）")
      @NotNull

    public Long getCommentid() {
    return commentid;
  }

  public void setCommentid(Long commentid) {
    this.commentid = commentid;
  }

  public FileDeletecommentReq docid(String docid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDeletecommentReq fileDeletecommentReq = (FileDeletecommentReq) o;
    return Objects.equals(this.commentid, fileDeletecommentReq.commentid) &&
        Objects.equals(this.docid, fileDeletecommentReq.docid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentid, docid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDeletecommentReq {\n");
    
    sb.append("    commentid: ").append(toIndentedString(commentid)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
