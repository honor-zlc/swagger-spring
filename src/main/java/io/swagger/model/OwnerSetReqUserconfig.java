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
 * OwnerSetReqUserconfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class OwnerSetReqUserconfig   {
  @JsonProperty("userid")
  private String userid = null;

  @JsonProperty("inheritpath")
  private String inheritpath = null;

  public OwnerSetReqUserconfig userid(String userid) {
    this.userid = userid;
    return this;
  }

  /**
   * 用户ID
   * @return userid
  **/
  @ApiModelProperty(required = true, value = "用户ID")
      @NotNull

    public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public OwnerSetReqUserconfig inheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
    return this;
  }

  /**
   * 所有者的继承路径，被设置为当前文档为空
   * @return inheritpath
  **/
  @ApiModelProperty(required = true, value = "所有者的继承路径，被设置为当前文档为空")
      @NotNull

    public String getInheritpath() {
    return inheritpath;
  }

  public void setInheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerSetReqUserconfig ownerSetReqUserconfig = (OwnerSetReqUserconfig) o;
    return Objects.equals(this.userid, ownerSetReqUserconfig.userid) &&
        Objects.equals(this.inheritpath, ownerSetReqUserconfig.inheritpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, inheritpath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerSetReqUserconfig {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    inheritpath: ").append(toIndentedString(inheritpath)).append("\n");
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
