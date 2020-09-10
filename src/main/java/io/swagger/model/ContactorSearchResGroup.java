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
 * ContactorSearchResGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorSearchResGroup   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("groupname")
  private String groupname = null;

  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("createrid")
  private String createrid = null;

  public ContactorSearchResGroup id(String id) {
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

  public ContactorSearchResGroup groupname(String groupname) {
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

  public ContactorSearchResGroup count(Long count) {
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

  public ContactorSearchResGroup createrid(String createrid) {
    this.createrid = createrid;
    return this;
  }

  /**
   * 联系人组创建者id
   * @return createrid
  **/
  @ApiModelProperty(required = true, value = "联系人组创建者id")
      @NotNull

    public String getCreaterid() {
    return createrid;
  }

  public void setCreaterid(String createrid) {
    this.createrid = createrid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorSearchResGroup contactorSearchResGroup = (ContactorSearchResGroup) o;
    return Objects.equals(this.id, contactorSearchResGroup.id) &&
        Objects.equals(this.groupname, contactorSearchResGroup.groupname) &&
        Objects.equals(this.count, contactorSearchResGroup.count) &&
        Objects.equals(this.createrid, contactorSearchResGroup.createrid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupname, count, createrid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorSearchResGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    createrid: ").append(toIndentedString(createrid)).append("\n");
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
