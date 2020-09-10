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
 * Perm1CheckReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Perm1CheckReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("perm")
  private Long perm = null;

  public Perm1CheckReq docid(String docid) {
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

  public Perm1CheckReq perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 权限值，这里只能是1,2,4,8,16,32,64
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "权限值，这里只能是1,2,4,8,16,32,64")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1CheckReq perm1CheckReq = (Perm1CheckReq) o;
    return Objects.equals(this.docid, perm1CheckReq.docid) &&
        Objects.equals(this.perm, perm1CheckReq.perm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, perm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1CheckReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
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
