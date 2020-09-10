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
 * ContactorGetgroupsResGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorGetgroupsResGroup   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("groupname")
  private String groupname = null;

  @JsonProperty("count")
  private Long count = null;

  public ContactorGetgroupsResGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 分组id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "分组id")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContactorGetgroupsResGroup groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

  /**
   * 分组名
   * @return groupname
  **/
  @ApiModelProperty(required = true, value = "分组名")
      @NotNull

    public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  public ContactorGetgroupsResGroup count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * 分组下联系人个数
   * @return count
  **/
  @ApiModelProperty(required = true, value = "分组下联系人个数")
      @NotNull

    public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorGetgroupsResGroup contactorGetgroupsResGroup = (ContactorGetgroupsResGroup) o;
    return Objects.equals(this.id, contactorGetgroupsResGroup.id) &&
        Objects.equals(this.groupname, contactorGetgroupsResGroup.groupname) &&
        Objects.equals(this.count, contactorGetgroupsResGroup.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupname, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorGetgroupsResGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
