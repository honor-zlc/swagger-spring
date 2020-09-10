package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContactorGetResUserinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactorGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorGetRes   {
  @JsonProperty("userinfos")
  @Valid
  private List<ContactorGetResUserinfo> userinfos = new ArrayList<ContactorGetResUserinfo>();

  public ContactorGetRes userinfos(List<ContactorGetResUserinfo> userinfos) {
    this.userinfos = userinfos;
    return this;
  }

  public ContactorGetRes addUserinfosItem(ContactorGetResUserinfo userinfosItem) {
    this.userinfos.add(userinfosItem);
    return this;
  }

  /**
   * 用户信息
   * @return userinfos
  **/
  @ApiModelProperty(required = true, value = "用户信息")
      @NotNull
    @Valid
    public List<ContactorGetResUserinfo> getUserinfos() {
    return userinfos;
  }

  public void setUserinfos(List<ContactorGetResUserinfo> userinfos) {
    this.userinfos = userinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorGetRes contactorGetRes = (ContactorGetRes) o;
    return Objects.equals(this.userinfos, contactorGetRes.userinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorGetRes {\n");
    
    sb.append("    userinfos: ").append(toIndentedString(userinfos)).append("\n");
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
