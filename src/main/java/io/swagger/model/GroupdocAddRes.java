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
 * GroupdocAddRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class GroupdocAddRes   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("typename")
  private String typename = null;

  public GroupdocAddRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 群组对应入口文档的id
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "群组对应入口文档的id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public GroupdocAddRes typename(String typename) {
    this.typename = typename;
    return this;
  }

  /**
   * 群组文档的类别显示名称
   * @return typename
  **/
  @ApiModelProperty(required = true, value = "群组文档的类别显示名称")
      @NotNull

    public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupdocAddRes groupdocAddRes = (GroupdocAddRes) o;
    return Objects.equals(this.docid, groupdocAddRes.docid) &&
        Objects.equals(this.typename, groupdocAddRes.typename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, typename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupdocAddRes {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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
