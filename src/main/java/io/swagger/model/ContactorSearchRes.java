package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContactorSearchResGroup;
import io.swagger.model.ContactorSearchResUserinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactorSearchRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorSearchRes   {
  @JsonProperty("userinfos")
  @Valid
  private List<ContactorSearchResUserinfo> userinfos = new ArrayList<ContactorSearchResUserinfo>();

  @JsonProperty("groups")
  @Valid
  private List<ContactorSearchResGroup> groups = new ArrayList<ContactorSearchResGroup>();

  public ContactorSearchRes userinfos(List<ContactorSearchResUserinfo> userinfos) {
    this.userinfos = userinfos;
    return this;
  }

  public ContactorSearchRes addUserinfosItem(ContactorSearchResUserinfo userinfosItem) {
    this.userinfos.add(userinfosItem);
    return this;
  }

  /**
   * 用户信息
   * @return userinfos
  **/
  @ApiModelProperty(required = true, value = "用户信息")
      @NotNull
    @Valid
    public List<ContactorSearchResUserinfo> getUserinfos() {
    return userinfos;
  }

  public void setUserinfos(List<ContactorSearchResUserinfo> userinfos) {
    this.userinfos = userinfos;
  }

  public ContactorSearchRes groups(List<ContactorSearchResGroup> groups) {
    this.groups = groups;
    return this;
  }

  public ContactorSearchRes addGroupsItem(ContactorSearchResGroup groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * 联系人组信息
   * @return groups
  **/
  @ApiModelProperty(required = true, value = "联系人组信息")
      @NotNull
    @Valid
    public List<ContactorSearchResGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<ContactorSearchResGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorSearchRes contactorSearchRes = (ContactorSearchRes) o;
    return Objects.equals(this.userinfos, contactorSearchRes.userinfos) &&
        Objects.equals(this.groups, contactorSearchRes.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userinfos, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorSearchRes {\n");
    
    sb.append("    userinfos: ").append(toIndentedString(userinfos)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
