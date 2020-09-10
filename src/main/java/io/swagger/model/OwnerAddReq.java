package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OwnerAddReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class OwnerAddReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("userids")
  @Valid
  private List<String> userids = new ArrayList<String>();

  public OwnerAddReq docid(String docid) {
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

  public OwnerAddReq userids(List<String> userids) {
    this.userids = userids;
    return this;
  }

  public OwnerAddReq addUseridsItem(String useridsItem) {
    this.userids.add(useridsItem);
    return this;
  }

  /**
   * 用户的id数组
   * @return userids
  **/
  @ApiModelProperty(required = true, value = "用户的id数组")
      @NotNull

    public List<String> getUserids() {
    return userids;
  }

  public void setUserids(List<String> userids) {
    this.userids = userids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerAddReq ownerAddReq = (OwnerAddReq) o;
    return Objects.equals(this.docid, ownerAddReq.docid) &&
        Objects.equals(this.userids, ownerAddReq.userids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, userids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerAddReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    userids: ").append(toIndentedString(userids)).append("\n");
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
