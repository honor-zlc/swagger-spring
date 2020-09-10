package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Perm2SetReqPerminfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Perm2SetReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm2SetReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("perminfos")
  @Valid
  private List<Perm2SetReqPerminfo> perminfos = new ArrayList<Perm2SetReqPerminfo>();

  @JsonProperty("inherit")
  private Boolean inherit = null;

  public Perm2SetReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档id
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public Perm2SetReq perminfos(List<Perm2SetReqPerminfo> perminfos) {
    this.perminfos = perminfos;
    return this;
  }

  public Perm2SetReq addPerminfosItem(Perm2SetReqPerminfo perminfosItem) {
    this.perminfos.add(perminfosItem);
    return this;
  }

  /**
   * 权限配置条目数组
   * @return perminfos
  **/
  @ApiModelProperty(required = true, value = "权限配置条目数组")
      @NotNull
    @Valid
    public List<Perm2SetReqPerminfo> getPerminfos() {
    return perminfos;
  }

  public void setPerminfos(List<Perm2SetReqPerminfo> perminfos) {
    this.perminfos = perminfos;
  }

  public Perm2SetReq inherit(Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

  /**
   * 启用继承：true，上级所有权限均继承  禁用继承：false，上级所有权限均不继承  
   * @return inherit
  **/
  @ApiModelProperty(required = true, value = "启用继承：true，上级所有权限均继承  禁用继承：false，上级所有权限均不继承  ")
      @NotNull

    public Boolean isInherit() {
    return inherit;
  }

  public void setInherit(Boolean inherit) {
    this.inherit = inherit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm2SetReq perm2SetReq = (Perm2SetReq) o;
    return Objects.equals(this.docid, perm2SetReq.docid) &&
        Objects.equals(this.perminfos, perm2SetReq.perminfos) &&
        Objects.equals(this.inherit, perm2SetReq.inherit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, perminfos, inherit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm2SetReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    perminfos: ").append(toIndentedString(perminfos)).append("\n");
    sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
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
