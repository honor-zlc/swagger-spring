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
 * Perm1GetsharedocconfigRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1GetsharedocconfigRes   {
  @JsonProperty("enable_user_doc_inner_link_share")
  private Boolean enableUserDocInnerLinkShare = null;

  @JsonProperty("enable_user_doc_out_link_share")
  private Boolean enableUserDocOutLinkShare = null;

  @JsonProperty("enable_group_doc_out_link_share")
  private Boolean enableGroupDocOutLinkShare = null;

  @JsonProperty("enable_group_doc_inner_link_share")
  private Boolean enableGroupDocInnerLinkShare = null;

  public Perm1GetsharedocconfigRes enableUserDocInnerLinkShare(Boolean enableUserDocInnerLinkShare) {
    this.enableUserDocInnerLinkShare = enableUserDocInnerLinkShare;
    return this;
  }

  /**
   * 开启个人文档内链共享
   * @return enableUserDocInnerLinkShare
  **/
  @ApiModelProperty(required = true, value = "开启个人文档内链共享")
      @NotNull

    public Boolean isEnableUserDocInnerLinkShare() {
    return enableUserDocInnerLinkShare;
  }

  public void setEnableUserDocInnerLinkShare(Boolean enableUserDocInnerLinkShare) {
    this.enableUserDocInnerLinkShare = enableUserDocInnerLinkShare;
  }

  public Perm1GetsharedocconfigRes enableUserDocOutLinkShare(Boolean enableUserDocOutLinkShare) {
    this.enableUserDocOutLinkShare = enableUserDocOutLinkShare;
    return this;
  }

  /**
   * 开启个人文档外链共享
   * @return enableUserDocOutLinkShare
  **/
  @ApiModelProperty(required = true, value = "开启个人文档外链共享")
      @NotNull

    public Boolean isEnableUserDocOutLinkShare() {
    return enableUserDocOutLinkShare;
  }

  public void setEnableUserDocOutLinkShare(Boolean enableUserDocOutLinkShare) {
    this.enableUserDocOutLinkShare = enableUserDocOutLinkShare;
  }

  public Perm1GetsharedocconfigRes enableGroupDocOutLinkShare(Boolean enableGroupDocOutLinkShare) {
    this.enableGroupDocOutLinkShare = enableGroupDocOutLinkShare;
    return this;
  }

  /**
   * 开启群组文档外链共享
   * @return enableGroupDocOutLinkShare
  **/
  @ApiModelProperty(required = true, value = "开启群组文档外链共享")
      @NotNull

    public Boolean isEnableGroupDocOutLinkShare() {
    return enableGroupDocOutLinkShare;
  }

  public void setEnableGroupDocOutLinkShare(Boolean enableGroupDocOutLinkShare) {
    this.enableGroupDocOutLinkShare = enableGroupDocOutLinkShare;
  }

  public Perm1GetsharedocconfigRes enableGroupDocInnerLinkShare(Boolean enableGroupDocInnerLinkShare) {
    this.enableGroupDocInnerLinkShare = enableGroupDocInnerLinkShare;
    return this;
  }

  /**
   * 开启群组文档内链共享
   * @return enableGroupDocInnerLinkShare
  **/
  @ApiModelProperty(required = true, value = "开启群组文档内链共享")
      @NotNull

    public Boolean isEnableGroupDocInnerLinkShare() {
    return enableGroupDocInnerLinkShare;
  }

  public void setEnableGroupDocInnerLinkShare(Boolean enableGroupDocInnerLinkShare) {
    this.enableGroupDocInnerLinkShare = enableGroupDocInnerLinkShare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1GetsharedocconfigRes perm1GetsharedocconfigRes = (Perm1GetsharedocconfigRes) o;
    return Objects.equals(this.enableUserDocInnerLinkShare, perm1GetsharedocconfigRes.enableUserDocInnerLinkShare) &&
        Objects.equals(this.enableUserDocOutLinkShare, perm1GetsharedocconfigRes.enableUserDocOutLinkShare) &&
        Objects.equals(this.enableGroupDocOutLinkShare, perm1GetsharedocconfigRes.enableGroupDocOutLinkShare) &&
        Objects.equals(this.enableGroupDocInnerLinkShare, perm1GetsharedocconfigRes.enableGroupDocInnerLinkShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableUserDocInnerLinkShare, enableUserDocOutLinkShare, enableGroupDocOutLinkShare, enableGroupDocInnerLinkShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1GetsharedocconfigRes {\n");
    
    sb.append("    enableUserDocInnerLinkShare: ").append(toIndentedString(enableUserDocInnerLinkShare)).append("\n");
    sb.append("    enableUserDocOutLinkShare: ").append(toIndentedString(enableUserDocOutLinkShare)).append("\n");
    sb.append("    enableGroupDocOutLinkShare: ").append(toIndentedString(enableGroupDocOutLinkShare)).append("\n");
    sb.append("    enableGroupDocInnerLinkShare: ").append(toIndentedString(enableGroupDocInnerLinkShare)).append("\n");
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
