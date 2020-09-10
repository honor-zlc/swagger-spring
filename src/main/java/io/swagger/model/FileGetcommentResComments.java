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
 * FileGetcommentResComments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetcommentResComments   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("commentator")
  private String commentator = null;

  @JsonProperty("commentatorid")
  private String commentatorid = null;

  @JsonProperty("answerto")
  private String answerto = null;

  @JsonProperty("score")
  private Long score = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("time")
  private Long time = null;

  public FileGetcommentResComments id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 评论id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "评论id")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FileGetcommentResComments commentator(String commentator) {
    this.commentator = commentator;
    return this;
  }

  /**
   * 评论人
   * @return commentator
  **/
  @ApiModelProperty(required = true, value = "评论人")
      @NotNull

    public String getCommentator() {
    return commentator;
  }

  public void setCommentator(String commentator) {
    this.commentator = commentator;
  }

  public FileGetcommentResComments commentatorid(String commentatorid) {
    this.commentatorid = commentatorid;
    return this;
  }

  /**
   * 评论人id
   * @return commentatorid
  **/
  @ApiModelProperty(required = true, value = "评论人id")
      @NotNull

    public String getCommentatorid() {
    return commentatorid;
  }

  public void setCommentatorid(String commentatorid) {
    this.commentatorid = commentatorid;
  }

  public FileGetcommentResComments answerto(String answerto) {
    this.answerto = answerto;
    return this;
  }

  /**
   * 被回复者，无被回复者时，该项为空    mode 为 1 或 3 时，返回此项  
   * @return answerto
  **/
  @ApiModelProperty(required = true, value = "被回复者，无被回复者时，该项为空    mode 为 1 或 3 时，返回此项  ")
      @NotNull

    public String getAnswerto() {
    return answerto;
  }

  public void setAnswerto(String answerto) {
    this.answerto = answerto;
  }

  public FileGetcommentResComments score(Long score) {
    this.score = score;
    return this;
  }

  /**
   * 评分    mode 为 2 或 3 时，返回此项    默认为-1，表示未评分  
   * @return score
  **/
  @ApiModelProperty(required = true, value = "评分    mode 为 2 或 3 时，返回此项    默认为-1，表示未评分  ")
      @NotNull

    public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public FileGetcommentResComments comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * 评论内容    mode 为 1 或 3 时，返回此项    默认为空，表示无评分内容  
   * @return comment
  **/
  @ApiModelProperty(required = true, value = "评论内容    mode 为 1 或 3 时，返回此项    默认为空，表示无评分内容  ")
      @NotNull

    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public FileGetcommentResComments time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * 评论的时间戳，UTC时间，精确到微秒
   * @return time
  **/
  @ApiModelProperty(required = true, value = "评论的时间戳，UTC时间，精确到微秒")
      @NotNull

    public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGetcommentResComments fileGetcommentResComments = (FileGetcommentResComments) o;
    return Objects.equals(this.id, fileGetcommentResComments.id) &&
        Objects.equals(this.commentator, fileGetcommentResComments.commentator) &&
        Objects.equals(this.commentatorid, fileGetcommentResComments.commentatorid) &&
        Objects.equals(this.answerto, fileGetcommentResComments.answerto) &&
        Objects.equals(this.score, fileGetcommentResComments.score) &&
        Objects.equals(this.comment, fileGetcommentResComments.comment) &&
        Objects.equals(this.time, fileGetcommentResComments.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, commentator, commentatorid, answerto, score, comment, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetcommentResComments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    commentator: ").append(toIndentedString(commentator)).append("\n");
    sb.append("    commentatorid: ").append(toIndentedString(commentatorid)).append("\n");
    sb.append("    answerto: ").append(toIndentedString(answerto)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
