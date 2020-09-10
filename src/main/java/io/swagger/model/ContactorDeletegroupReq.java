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
 * ContactorDeletegroupReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorDeletegroupReq   {
  @JsonProperty("groupid")
  private String groupid = null;

  public ContactorDeletegroupReq groupid(String groupid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorDeletegroupReq contactorDeletegroupReq = (ContactorDeletegroupReq) o;
    return Objects.equals(this.groupid, contactorDeletegroupReq.groupid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorDeletegroupReq {\n");
    
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
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
