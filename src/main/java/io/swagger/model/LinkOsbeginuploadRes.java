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
 * LinkOsbeginuploadRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOsbeginuploadRes   {
  @JsonProperty("authrequest")
  @Valid
  private List<String> authrequest = new ArrayList<String>();

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  public LinkOsbeginuploadRes authrequest(List<String> authrequest) {
    this.authrequest = authrequest;
    return this;
  }

  public LinkOsbeginuploadRes addAuthrequestItem(String authrequestItem) {
    this.authrequest.add(authrequestItem);
    return this;
  }

  /**
   * - authrequest[0]：请求方法  - authrequest[1]: 待上传的资源URL  - authrequest[2]及以后项：请求头，格式为“key: value”；若请求时reqmethod的值为“POST”，则为POST表单域的项，格式为“key: value”  
   * @return authrequest
  **/
  @ApiModelProperty(required = true, value = "- authrequest[0]：请求方法  - authrequest[1]: 待上传的资源URL  - authrequest[2]及以后项：请求头，格式为“key: value”；若请求时reqmethod的值为“POST”，则为POST表单域的项，格式为“key: value”  ")
      @NotNull

    public List<String> getAuthrequest() {
    return authrequest;
  }

  public void setAuthrequest(List<String> authrequest) {
    this.authrequest = authrequest;
  }

  public LinkOsbeginuploadRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOsbeginuploadRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件名称，UTF8编码，创建版本时返回
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件名称，UTF8编码，创建版本时返回")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkOsbeginuploadRes rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件版本号
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "文件版本号")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOsbeginuploadRes linkOsbeginuploadRes = (LinkOsbeginuploadRes) o;
    return Objects.equals(this.authrequest, linkOsbeginuploadRes.authrequest) &&
        Objects.equals(this.docid, linkOsbeginuploadRes.docid) &&
        Objects.equals(this.name, linkOsbeginuploadRes.name) &&
        Objects.equals(this.rev, linkOsbeginuploadRes.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authrequest, docid, name, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOsbeginuploadRes {\n");
    
    sb.append("    authrequest: ").append(toIndentedString(authrequest)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
