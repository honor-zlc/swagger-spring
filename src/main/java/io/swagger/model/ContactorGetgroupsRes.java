package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContactorGetgroupsResGroup;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactorGetgroupsRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorGetgroupsRes   {
  @JsonProperty("groups")
  @Valid
  private List<ContactorGetgroupsResGroup> groups = new ArrayList<ContactorGetgroupsResGroup>();

  public ContactorGetgroupsRes groups(List<ContactorGetgroupsResGroup> groups) {
    this.groups = groups;
    return this;
  }

  public ContactorGetgroupsRes addGroupsItem(ContactorGetgroupsResGroup groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * 联系人分组信息
   * @return groups
  **/
  @ApiModelProperty(required = true, value = "联系人分组信息")
      @NotNull
    @Valid
    public List<ContactorGetgroupsResGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<ContactorGetgroupsResGroup> groups) {
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
    ContactorGetgroupsRes contactorGetgroupsRes = (ContactorGetgroupsRes) o;
    return Objects.equals(this.groups, contactorGetgroupsRes.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorGetgroupsRes {\n");
    
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
