package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OwnerSetReqUserconfig;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OwnerSetReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class OwnerSetReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("userconfigs")
  @Valid
  private List<OwnerSetReqUserconfig> userconfigs = new ArrayList<OwnerSetReqUserconfig>();

  public OwnerSetReq docid(String docid) {
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

  public OwnerSetReq userconfigs(List<OwnerSetReqUserconfig> userconfigs) {
    this.userconfigs = userconfigs;
    return this;
  }

  public OwnerSetReq addUserconfigsItem(OwnerSetReqUserconfig userconfigsItem) {
    this.userconfigs.add(userconfigsItem);
    return this;
  }

  /**
   * 所有者数组
   * @return userconfigs
  **/
  @ApiModelProperty(required = true, value = "所有者数组")
      @NotNull
    @Valid
    public List<OwnerSetReqUserconfig> getUserconfigs() {
    return userconfigs;
  }

  public void setUserconfigs(List<OwnerSetReqUserconfig> userconfigs) {
    this.userconfigs = userconfigs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerSetReq ownerSetReq = (OwnerSetReq) o;
    return Objects.equals(this.docid, ownerSetReq.docid) &&
        Objects.equals(this.userconfigs, ownerSetReq.userconfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, userconfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerSetReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    userconfigs: ").append(toIndentedString(userconfigs)).append("\n");
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
