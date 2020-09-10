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
 * GroupdocAddReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class GroupdocAddReq   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quota")
  private Long quota = null;

  public GroupdocAddReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 新建群组的名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "新建群组的名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupdocAddReq quota(Long quota) {
    this.quota = quota;
    return this;
  }

  /**
   * 新建群组的配额
   * @return quota
  **/
  @ApiModelProperty(required = true, value = "新建群组的配额")
      @NotNull

    public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupdocAddReq groupdocAddReq = (GroupdocAddReq) o;
    return Objects.equals(this.name, groupdocAddReq.name) &&
        Objects.equals(this.quota, groupdocAddReq.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupdocAddReq {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
