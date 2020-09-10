package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FileGetcommentResComments;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileGetcommentRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetcommentRes   {
  @JsonProperty("mode")
  private Long mode = null;

  @JsonProperty("averagescore")
  private Double averagescore = null;

  @JsonProperty("hasscored")
  private Boolean hasscored = null;

  @JsonProperty("comments")
  @Valid
  private List<FileGetcommentResComments> comments = null;

  public FileGetcommentRes mode(Long mode) {
    this.mode = mode;
    return this;
  }

  /**
   * 评论模式  - 0:未启用评论和评分  - 1:只启用评论  - 2:只启用评分  - 3:同时启用评论和评分  
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "评论模式  - 0:未启用评论和评分  - 1:只启用评论  - 2:只启用评分  - 3:同时启用评论和评分  ")
      @NotNull

    public Long getMode() {
    return mode;
  }

  public void setMode(Long mode) {
    this.mode = mode;
  }

  public FileGetcommentRes averagescore(Double averagescore) {
    this.averagescore = averagescore;
    return this;
  }

  /**
   * 总评分    mode 为 2 或 3 时，返回此项  
   * @return averagescore
  **/
  @ApiModelProperty(value = "总评分    mode 为 2 或 3 时，返回此项  ")
  
    public Double getAveragescore() {
    return averagescore;
  }

  public void setAveragescore(Double averagescore) {
    this.averagescore = averagescore;
  }

  public FileGetcommentRes hasscored(Boolean hasscored) {
    this.hasscored = hasscored;
    return this;
  }

  /**
   * 用户是否已经评分    mode 为 2 或 3 时，返回此项  
   * @return hasscored
  **/
  @ApiModelProperty(value = "用户是否已经评分    mode 为 2 或 3 时，返回此项  ")
  
    public Boolean isHasscored() {
    return hasscored;
  }

  public void setHasscored(Boolean hasscored) {
    this.hasscored = hasscored;
  }

  public FileGetcommentRes comments(List<FileGetcommentResComments> comments) {
    this.comments = comments;
    return this;
  }

  public FileGetcommentRes addCommentsItem(FileGetcommentResComments commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<FileGetcommentResComments>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * 评论内容的数组    mode 不为 0 时，返回此项  
   * @return comments
  **/
  @ApiModelProperty(value = "评论内容的数组    mode 不为 0 时，返回此项  ")
      @Valid
    public List<FileGetcommentResComments> getComments() {
    return comments;
  }

  public void setComments(List<FileGetcommentResComments> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGetcommentRes fileGetcommentRes = (FileGetcommentRes) o;
    return Objects.equals(this.mode, fileGetcommentRes.mode) &&
        Objects.equals(this.averagescore, fileGetcommentRes.averagescore) &&
        Objects.equals(this.hasscored, fileGetcommentRes.hasscored) &&
        Objects.equals(this.comments, fileGetcommentRes.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, averagescore, hasscored, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetcommentRes {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    averagescore: ").append(toIndentedString(averagescore)).append("\n");
    sb.append("    hasscored: ").append(toIndentedString(hasscored)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
