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
 * ContactorDeletepersonsReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorDeletepersonsReq   {
  @JsonProperty("groupid")
  private String groupid = null;

  @JsonProperty("userids")
  @Valid
  private List<String> userids = new ArrayList<String>();

  public ContactorDeletepersonsReq groupid(String groupid) {
    this.groupid = groupid;
    return this;
  }

  /**
   * 联系人组唯一标识
   * @return groupid
  **/
  @ApiModelProperty(required = true, value = "联系人组唯一标识")
      @NotNull

    public String getGroupid() {
    return groupid;
  }

  public void setGroupid(String groupid) {
    this.groupid = groupid;
  }

  public ContactorDeletepersonsReq userids(List<String> userids) {
    this.userids = userids;
    return this;
  }

  public ContactorDeletepersonsReq addUseridsItem(String useridsItem) {
    this.userids.add(useridsItem);
    return this;
  }

  /**
   * 待添加的联系人id
   * @return userids
  **/
  @ApiModelProperty(required = true, value = "待添加的联系人id")
      @NotNull

    public List<String> getUserids() {
    return userids;
  }

  public void setUserids(List<String> userids) {
    this.userids = userids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorDeletepersonsReq contactorDeletepersonsReq = (ContactorDeletepersonsReq) o;
    return Objects.equals(this.groupid, contactorDeletepersonsReq.groupid) &&
        Objects.equals(this.userids, contactorDeletepersonsReq.userids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupid, userids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorDeletepersonsReq {\n");
    
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    userids: ").append(toIndentedString(userids)).append("\n");
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
