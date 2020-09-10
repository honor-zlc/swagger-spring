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
 * InvitationSetbaseinfoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class InvitationSetbaseinfoReq   {
  @JsonProperty("invitationendtime")
  private Long invitationendtime = null;

  @JsonProperty("invitationid")
  private String invitationid = null;

  @JsonProperty("perm")
  private Long perm = null;

  @JsonProperty("permendtime")
  private Long permendtime = null;

  public InvitationSetbaseinfoReq invitationendtime(Long invitationendtime) {
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

  public InvitationSetbaseinfoReq invitationid(String invitationid) {
    this.invitationid = invitationid;
    return this;
  }

  /**
   * 邀请链接唯一标识
   * @return invitationid
  **/
  @ApiModelProperty(required = true, value = "邀请链接唯一标识")
      @NotNull

    public String getInvitationid() {
    return invitationid;
  }

  public void setInvitationid(String invitationid) {
    this.invitationid = invitationid;
  }

  public InvitationSetbaseinfoReq perm(Long perm) {
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

  public InvitationSetbaseinfoReq permendtime(Long permendtime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationSetbaseinfoReq invitationSetbaseinfoReq = (InvitationSetbaseinfoReq) o;
    return Objects.equals(this.invitationendtime, invitationSetbaseinfoReq.invitationendtime) &&
        Objects.equals(this.invitationid, invitationSetbaseinfoReq.invitationid) &&
        Objects.equals(this.perm, invitationSetbaseinfoReq.perm) &&
        Objects.equals(this.permendtime, invitationSetbaseinfoReq.permendtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitationendtime, invitationid, perm, permendtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationSetbaseinfoReq {\n");
    
    sb.append("    invitationendtime: ").append(toIndentedString(invitationendtime)).append("\n");
    sb.append("    invitationid: ").append(toIndentedString(invitationid)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    permendtime: ").append(toIndentedString(permendtime)).append("\n");
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
