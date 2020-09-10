package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Perm2SetReqPerminfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm2SetReqPerminfo   {
  @JsonProperty("accessorid")
  private String accessorid = null;

  /**
   * 访问者类型
   */
  public enum AccessortypeEnum {
    USER("user"),
    
    DEPARTMENT("department"),
    
    CONTACTOR("contactor");

    private String value;

    AccessortypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessortypeEnum fromValue(String text) {
      for (AccessortypeEnum b : AccessortypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("accessortype")
  private AccessortypeEnum accessortype = null;

  @JsonProperty("denyvalue")
  private Long denyvalue = null;

  @JsonProperty("allowvalue")
  private Long allowvalue = null;

  @JsonProperty("endtime")
  private Long endtime = null;

  @JsonProperty("inheritpath")
  private String inheritpath = null;

  public Perm2SetReqPerminfo accessorid(String accessorid) {
    this.accessorid = accessorid;
    return this;
  }

  /**
   * 访问者id，可能是用户、部门、联系人
   * @return accessorid
  **/
  @ApiModelProperty(required = true, value = "访问者id，可能是用户、部门、联系人")
      @NotNull

    public String getAccessorid() {
    return accessorid;
  }

  public void setAccessorid(String accessorid) {
    this.accessorid = accessorid;
  }

  public Perm2SetReqPerminfo accessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
    return this;
  }

  /**
   * 访问者类型
   * @return accessortype
  **/
  @ApiModelProperty(required = true, value = "访问者类型")
      @NotNull

    public AccessortypeEnum getAccessortype() {
    return accessortype;
  }

  public void setAccessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
  }

  public Perm2SetReqPerminfo denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

  /**
   * 拒绝权限  权限值，按bit位存储  0x00000000，未设置  0x00000001，显示  0x00000002，预览  0x00000004，下载  0x00000008，新建  0x00000010，修改  0x00000020，删除  0x00000040，复制  
   * @return denyvalue
  **/
  @ApiModelProperty(required = true, value = "拒绝权限  权限值，按bit位存储  0x00000000，未设置  0x00000001，显示  0x00000002，预览  0x00000004，下载  0x00000008，新建  0x00000010，修改  0x00000020，删除  0x00000040，复制  ")
      @NotNull

    public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }

  public Perm2SetReqPerminfo allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

  /**
   * 允许权限，值与denyvalue相同
   * @return allowvalue
  **/
  @ApiModelProperty(required = true, value = "允许权限，值与denyvalue相同")
      @NotNull

    public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public Perm2SetReqPerminfo endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 权限到期时间，单位：微秒，-1表示无限期
   * @return endtime
  **/
  @ApiModelProperty(required = true, value = "权限到期时间，单位：微秒，-1表示无限期")
      @NotNull

    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public Perm2SetReqPerminfo inheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
    return this;
  }

  /**
   * 值为非空字符串时，忽略该条权限
   * @return inheritpath
  **/
  @ApiModelProperty(value = "值为非空字符串时，忽略该条权限")
  
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
    Perm2SetReqPerminfo perm2SetReqPerminfo = (Perm2SetReqPerminfo) o;
    return Objects.equals(this.accessorid, perm2SetReqPerminfo.accessorid) &&
        Objects.equals(this.accessortype, perm2SetReqPerminfo.accessortype) &&
        Objects.equals(this.denyvalue, perm2SetReqPerminfo.denyvalue) &&
        Objects.equals(this.allowvalue, perm2SetReqPerminfo.allowvalue) &&
        Objects.equals(this.endtime, perm2SetReqPerminfo.endtime) &&
        Objects.equals(this.inheritpath, perm2SetReqPerminfo.inheritpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorid, accessortype, denyvalue, allowvalue, endtime, inheritpath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm2SetReqPerminfo {\n");
    
    sb.append("    accessorid: ").append(toIndentedString(accessorid)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
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
