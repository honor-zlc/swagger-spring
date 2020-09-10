package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirAddtagsRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirAddtagsRes   {
  @JsonProperty("tag_max_num")
  private Long tagMaxNum = null;

  @JsonProperty("unsettagnum")
  private Long unsettagnum = null;

  @JsonProperty("unsettags")
  @Valid
  private List<String> unsettags = new ArrayList<String>();

  public DirAddtagsRes tagMaxNum(Long tagMaxNum) {
    this.tagMaxNum = tagMaxNum;
    return this;
  }

  /**
   * 允许目录拥有的标签的最大数量
   * @return tagMaxNum
  **/
  @ApiModelProperty(required = true, value = "允许目录拥有的标签的最大数量")
      @NotNull

    public Long getTagMaxNum() {
    return tagMaxNum;
  }

  public void setTagMaxNum(Long tagMaxNum) {
    this.tagMaxNum = tagMaxNum;
  }

  public DirAddtagsRes unsettagnum(Long unsettagnum) {
    this.unsettagnum = unsettagnum;
    return this;
  }

  /**
   * 由于标签数量限制未设置成功的标签数
   * @return unsettagnum
  **/
  @ApiModelProperty(required = true, value = "由于标签数量限制未设置成功的标签数")
      @NotNull

    public Long getUnsettagnum() {
    return unsettagnum;
  }

  public void setUnsettagnum(Long unsettagnum) {
    this.unsettagnum = unsettagnum;
  }

  public DirAddtagsRes unsettags(List<String> unsettags) {
    this.unsettags = unsettags;
    return this;
  }

  public DirAddtagsRes addUnsettagsItem(String unsettagsItem) {
    this.unsettags.add(unsettagsItem);
    return this;
  }

  /**
   * 未设置成功的标签数组
   * @return unsettags
  **/
  @ApiModelProperty(required = true, value = "未设置成功的标签数组")
      @NotNull

    public List<String> getUnsettags() {
    return unsettags;
  }

  public void setUnsettags(List<String> unsettags) {
    this.unsettags = unsettags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirAddtagsRes dirAddtagsRes = (DirAddtagsRes) o;
    return Objects.equals(this.tagMaxNum, dirAddtagsRes.tagMaxNum) &&
        Objects.equals(this.unsettagnum, dirAddtagsRes.unsettagnum) &&
        Objects.equals(this.unsettags, dirAddtagsRes.unsettags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagMaxNum, unsettagnum, unsettags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirAddtagsRes {\n");
    
    sb.append("    tagMaxNum: ").append(toIndentedString(tagMaxNum)).append("\n");
    sb.append("    unsettagnum: ").append(toIndentedString(unsettagnum)).append("\n");
    sb.append("    unsettags: ").append(toIndentedString(unsettags)).append("\n");
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
