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
 * InvitationGetReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class InvitationGetReq   {
  @JsonProperty("invitationid")
  private String invitationid = null;

  public InvitationGetReq invitationid(String invitationid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationGetReq invitationGetReq = (InvitationGetReq) o;
    return Objects.equals(this.invitationid, invitationGetReq.invitationid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitationid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationGetReq {\n");
    
    sb.append("    invitationid: ").append(toIndentedString(invitationid)).append("\n");
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
