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
 * Perm2GetResPerminfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm2GetResPerminfo   {
  @JsonProperty("inheritdocid")
  private String inheritdocid = null;

  @JsonProperty("inheritpath")
  private String inheritpath = null;

  @JsonProperty("accessorid")
  private String accessorid = null;

  @JsonProperty("accessorname")
  private String accessorname = null;

  @JsonProperty("accessorcsflevel")
  private Long accessorcsflevel = null;

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

  @JsonProperty("createtime")
  private Long createtime = null;

  @JsonProperty("modifytime")
  private Long modifytime = null;

  @JsonProperty("endtime")
  private Long endtime = null;

  public Perm2GetResPerminfo inheritdocid(String inheritdocid) {
    this.inheritdocid = inheritdocid;
    return this;
  }

  /**
   * 权限继承docid
   * @return inheritdocid
  **/
  @ApiModelProperty(required = true, value = "权限继承docid")
      @NotNull

    public String getInheritdocid() {
    return inheritdocid;
  }

  public void setInheritdocid(String inheritdocid) {
    this.inheritdocid = inheritdocid;
  }

  public Perm2GetResPerminfo inheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
    return this;
  }

  /**
   * 权限继承路径
   * @return inheritpath
  **/
  @ApiModelProperty(required = true, value = "权限继承路径")
      @NotNull

    public String getInheritpath() {
    return inheritpath;
  }

  public void setInheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
  }

  public Perm2GetResPerminfo accessorid(String accessorid) {
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

  public Perm2GetResPerminfo accessorname(String accessorname) {
    this.accessorname = accessorname;
    return this;
  }

  /**
   * 访问者名字
   * @return accessorname
  **/
  @ApiModelProperty(required = true, value = "访问者名字")
      @NotNull

    public String getAccessorname() {
    return accessorname;
  }

  public void setAccessorname(String accessorname) {
    this.accessorname = accessorname;
  }

  public Perm2GetResPerminfo accessorcsflevel(Long accessorcsflevel) {
    this.accessorcsflevel = accessorcsflevel;
    return this;
  }

  /**
   * 访问者密级
   * @return accessorcsflevel
  **/
  @ApiModelProperty(required = true, value = "访问者密级")
      @NotNull

    public Long getAccessorcsflevel() {
    return accessorcsflevel;
  }

  public void setAccessorcsflevel(Long accessorcsflevel) {
    this.accessorcsflevel = accessorcsflevel;
  }

  public Perm2GetResPerminfo accessortype(AccessortypeEnum accessortype) {
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

  public Perm2GetResPerminfo denyvalue(Long denyvalue) {
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

  public Perm2GetResPerminfo allowvalue(Long allowvalue) {
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

  public Perm2GetResPerminfo createtime(Long createtime) {
    this.createtime = createtime;
    return this;
  }

  /**
   * 权限创建时间
   * @return createtime
  **/
  @ApiModelProperty(required = true, value = "权限创建时间")
      @NotNull

    public Long getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Long createtime) {
    this.createtime = createtime;
  }

  public Perm2GetResPerminfo modifytime(Long modifytime) {
    this.modifytime = modifytime;
    return this;
  }

  /**
   * 权限修改时间
   * @return modifytime
  **/
  @ApiModelProperty(required = true, value = "权限修改时间")
      @NotNull

    public Long getModifytime() {
    return modifytime;
  }

  public void setModifytime(Long modifytime) {
    this.modifytime = modifytime;
  }

  public Perm2GetResPerminfo endtime(Long endtime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm2GetResPerminfo perm2GetResPerminfo = (Perm2GetResPerminfo) o;
    return Objects.equals(this.inheritdocid, perm2GetResPerminfo.inheritdocid) &&
        Objects.equals(this.inheritpath, perm2GetResPerminfo.inheritpath) &&
        Objects.equals(this.accessorid, perm2GetResPerminfo.accessorid) &&
        Objects.equals(this.accessorname, perm2GetResPerminfo.accessorname) &&
        Objects.equals(this.accessorcsflevel, perm2GetResPerminfo.accessorcsflevel) &&
        Objects.equals(this.accessortype, perm2GetResPerminfo.accessortype) &&
        Objects.equals(this.denyvalue, perm2GetResPerminfo.denyvalue) &&
        Objects.equals(this.allowvalue, perm2GetResPerminfo.allowvalue) &&
        Objects.equals(this.createtime, perm2GetResPerminfo.createtime) &&
        Objects.equals(this.modifytime, perm2GetResPerminfo.modifytime) &&
        Objects.equals(this.endtime, perm2GetResPerminfo.endtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritdocid, inheritpath, accessorid, accessorname, accessorcsflevel, accessortype, denyvalue, allowvalue, createtime, modifytime, endtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm2GetResPerminfo {\n");
    
    sb.append("    inheritdocid: ").append(toIndentedString(inheritdocid)).append("\n");
    sb.append("    inheritpath: ").append(toIndentedString(inheritpath)).append("\n");
    sb.append("    accessorid: ").append(toIndentedString(accessorid)).append("\n");
    sb.append("    accessorname: ").append(toIndentedString(accessorname)).append("\n");
    sb.append("    accessorcsflevel: ").append(toIndentedString(accessorcsflevel)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    createtime: ").append(toIndentedString(createtime)).append("\n");
    sb.append("    modifytime: ").append(toIndentedString(modifytime)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
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
