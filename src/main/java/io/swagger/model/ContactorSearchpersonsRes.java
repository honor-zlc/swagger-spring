package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContactorSearchpersonsResUserinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactorSearchpersonsRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ContactorSearchpersonsRes   {
  @JsonProperty("userinfos")
  @Valid
  private List<ContactorSearchpersonsResUserinfo> userinfos = new ArrayList<ContactorSearchpersonsResUserinfo>();

  public ContactorSearchpersonsRes userinfos(List<ContactorSearchpersonsResUserinfo> userinfos) {
    this.userinfos = userinfos;
    return this;
  }

  public ContactorSearchpersonsRes addUserinfosItem(ContactorSearchpersonsResUserinfo userinfosItem) {
    this.userinfos.add(userinfosItem);
    return this;
  }

  /**
   * 联系人信息
   * @return userinfos
  **/
  @ApiModelProperty(required = true, value = "联系人信息")
      @NotNull
    @Valid
    public List<ContactorSearchpersonsResUserinfo> getUserinfos() {
    return userinfos;
  }

  public void setUserinfos(List<ContactorSearchpersonsResUserinfo> userinfos) {
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
    ContactorSearchpersonsRes contactorSearchpersonsRes = (ContactorSearchpersonsRes) o;
    return Objects.equals(this.userinfos, contactorSearchpersonsRes.userinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorSearchpersonsRes {\n");
    
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
