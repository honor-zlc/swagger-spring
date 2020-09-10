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
 * FileSubmitcommentReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileSubmitcommentReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("answertoid")
  private String answertoid = null;

  @JsonProperty("score")
  private Long score = null;

  @JsonProperty("comment")
  private String comment = null;

  public FileSubmitcommentReq docid(String docid) {
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

  public FileSubmitcommentReq answertoid(String answertoid) {
    this.answertoid = answertoid;
    return this;
  }

  /**
   * 被回复者id 
   * @return answertoid
  **/
  @ApiModelProperty(value = "被回复者id ")
  
    public String getAnswertoid() {
    return answertoid;
  }

  public void setAnswertoid(String answertoid) {
    this.answertoid = answertoid;
  }

  public FileSubmitcommentReq score(Long score) {
    this.score = score;
    return this;
  }

  /**
   * 评分    评论模式mode 为 2 或 3 时（包含评分功能），需要此项    默认为 -1，表示无评分  
   * @return score
  **/
  @ApiModelProperty(value = "评分    评论模式mode 为 2 或 3 时（包含评分功能），需要此项    默认为 -1，表示无评分  ")
  
    public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public FileSubmitcommentReq comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 评论内容    评论模式mode 为 1 或 3 时（包含评论功能），需要此项    默认为空  
   * @return comment
  **/
  @ApiModelProperty(value = "评论内容    评论模式mode 为 1 或 3 时（包含评论功能），需要此项    默认为空  ")
  
    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSubmitcommentReq fileSubmitcommentReq = (FileSubmitcommentReq) o;
    return Objects.equals(this.docid, fileSubmitcommentReq.docid) &&
        Objects.equals(this.answertoid, fileSubmitcommentReq.answertoid) &&
        Objects.equals(this.score, fileSubmitcommentReq.score) &&
        Objects.equals(this.comment, fileSubmitcommentReq.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, answertoid, score, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSubmitcommentReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    answertoid: ").append(toIndentedString(answertoid)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
