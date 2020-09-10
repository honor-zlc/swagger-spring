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
 * Perm1ListResPermresult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1ListResPermresult   {
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

  @JsonProperty("accessorname")
  private String accessorname = null;

  @JsonProperty("allowvalue")
  private Long allowvalue = null;

  @JsonProperty("denyvalue")
  private Long denyvalue = null;

  public Perm1ListResPermresult accessorid(String accessorid) {
    this.accessorid = accessorid;
    return this;
  }

  /**
   * 访问者id
   * @return accessorid
  **/
  @ApiModelProperty(required = true, value = "访问者id")
      @NotNull

    public String getAccessorid() {
    return accessorid;
  }

  public void setAccessorid(String accessorid) {
    this.accessorid = accessorid;
  }

  public Perm1ListResPermresult accessortype(AccessortypeEnum accessortype) {
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

  public Perm1ListResPermresult accessorname(String accessorname) {
    this.accessorname = accessorname;
    return this;
  }

  /**
   * 访问者的名称
   * @return accessorname
  **/
  @ApiModelProperty(required = true, value = "访问者的名称")
      @NotNull

    public String getAccessorname() {
    return accessorname;
  }

  public void setAccessorname(String accessorname) {
    this.accessorname = accessorname;
  }

  public Perm1ListResPermresult allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

  /**
   * 允许的权限值
   * @return allowvalue
  **/
  @ApiModelProperty(required = true, value = "允许的权限值")
      @NotNull

    public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public Perm1ListResPermresult denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

  /**
   * 拒绝的权限值
   * @return denyvalue
  **/
  @ApiModelProperty(required = true, value = "拒绝的权限值")
      @NotNull

    public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1ListResPermresult perm1ListResPermresult = (Perm1ListResPermresult) o;
    return Objects.equals(this.accessorid, perm1ListResPermresult.accessorid) &&
        Objects.equals(this.accessortype, perm1ListResPermresult.accessortype) &&
        Objects.equals(this.accessorname, perm1ListResPermresult.accessorname) &&
        Objects.equals(this.allowvalue, perm1ListResPermresult.allowvalue) &&
        Objects.equals(this.denyvalue, perm1ListResPermresult.denyvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorid, accessortype, accessorname, allowvalue, denyvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1ListResPermresult {\n");
    
    sb.append("    accessorid: ").append(toIndentedString(accessorid)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    accessorname: ").append(toIndentedString(accessorname)).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
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
