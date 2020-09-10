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
 * InvitationGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class InvitationGetRes   {
  @JsonProperty("invitationendtime")
  private Long invitationendtime = null;

  @JsonProperty("perm")
  private Long perm = null;

  @JsonProperty("permendtime")
  private Long permendtime = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("docname")
  private String docname = null;

  @JsonProperty("isdir")
  private Boolean isdir = null;

  public InvitationGetRes invitationendtime(Long invitationendtime) {
    this.invitationendtime = invitationendtime;
    return this;
  }

  /**
   * 邀请链接到期时间，如果为-1，表示无限期
   * @return invitationendtime
  **/
  @ApiModelProperty(required = true, value = "邀请链接到期时间，如果为-1，表示无限期")
      @NotNull

    public Long getInvitationendtime() {
    return invitationendtime;
  }

  public void setInvitationendtime(Long invitationendtime) {
    this.invitationendtime = invitationendtime;
  }

  public InvitationGetRes perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 权限值
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "权限值")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public InvitationGetRes permendtime(Long permendtime) {
    this.permendtime = permendtime;
    return this;
  }

  /**
   * 权限到期时间，如果为-1，表示无限期
   * @return permendtime
  **/
  @ApiModelProperty(required = true, value = "权限到期时间，如果为-1，表示无限期")
      @NotNull

    public Long getPermendtime() {
    return permendtime;
  }

  public void setPermendtime(Long permendtime) {
    this.permendtime = permendtime;
  }

  public InvitationGetRes image(String image) {
    this.image = image;
    return this;
  }

  /**
   * 图片备注信息
   * @return image
  **/
  @ApiModelProperty(required = true, value = "图片备注信息")
      @NotNull

    public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public InvitationGetRes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 备注描述信息
   * @return description
  **/
  @ApiModelProperty(required = true, value = "备注描述信息")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvitationGetRes docname(String docname) {
    this.docname = docname;
    return this;
  }

  /**
   * 文档名称
   * @return docname
  **/
  @ApiModelProperty(required = true, value = "文档名称")
      @NotNull

    public String getDocname() {
    return docname;
  }

  public void setDocname(String docname) {
    this.docname = docname;
  }

  public InvitationGetRes isdir(Boolean isdir) {
    this.isdir = isdir;
    return this;
  }

  /**
   * 是否为目录
   * @return isdir
  **/
  @ApiModelProperty(required = true, value = "是否为目录")
      @NotNull

    public Boolean isIsdir() {
    return isdir;
  }

  public void setIsdir(Boolean isdir) {
    this.isdir = isdir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationGetRes invitationGetRes = (InvitationGetRes) o;
    return Objects.equals(this.invitationendtime, invitationGetRes.invitationendtime) &&
        Objects.equals(this.perm, invitationGetRes.perm) &&
        Objects.equals(this.permendtime, invitationGetRes.permendtime) &&
        Objects.equals(this.image, invitationGetRes.image) &&
        Objects.equals(this.description, invitationGetRes.description) &&
        Objects.equals(this.docname, invitationGetRes.docname) &&
        Objects.equals(this.isdir, invitationGetRes.isdir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitationendtime, perm, permendtime, image, description, docname, isdir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationGetRes {\n");
    
    sb.append("    invitationendtime: ").append(toIndentedString(invitationendtime)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    permendtime: ").append(toIndentedString(permendtime)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    docname: ").append(toIndentedString(docname)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
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
