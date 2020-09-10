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
 * InvitationJoinRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class InvitationJoinRes   {
  @JsonProperty("docname")
  private String docname = null;

  @JsonProperty("result")
  private Boolean result = null;

  public InvitationJoinRes docname(String docname) {
    this.docname = docname;
    return this;
  }

  /**
   * 文档内链地址
   * @return docname
  **/
  @ApiModelProperty(required = true, value = "文档内链地址")
      @NotNull

    public String getDocname() {
    return docname;
  }

  public void setDocname(String docname) {
    this.docname = docname;
  }

  public InvitationJoinRes result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * 本次加入是否成功
   * @return result
  **/
  @ApiModelProperty(required = true, value = "本次加入是否成功")
      @NotNull

    public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationJoinRes invitationJoinRes = (InvitationJoinRes) o;
    return Objects.equals(this.docname, invitationJoinRes.docname) &&
        Objects.equals(this.result, invitationJoinRes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docname, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationJoinRes {\n");
    
    sb.append("    docname: ").append(toIndentedString(docname)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
