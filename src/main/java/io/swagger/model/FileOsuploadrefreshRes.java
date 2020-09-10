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
 * FileOsuploadrefreshRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsuploadrefreshRes   {
  @JsonProperty("uploadid")
  private String uploadid = null;

  @JsonProperty("authrequest")
  @Valid
  private List<String> authrequest = null;

  public FileOsuploadrefreshRes uploadid(String uploadid) {
    this.uploadid = uploadid;
    return this;
  }

  /**
   * 标识本次Multipart Upload事件
   * @return uploadid
  **/
  @ApiModelProperty(value = "标识本次Multipart Upload事件")
  
    public String getUploadid() {
    return uploadid;
  }

  public void setUploadid(String uploadid) {
    this.uploadid = uploadid;
  }

  public FileOsuploadrefreshRes authrequest(List<String> authrequest) {
    this.authrequest = authrequest;
    return this;
  }

  public FileOsuploadrefreshRes addAuthrequestItem(String authrequestItem) {
    if (this.authrequest == null) {
      this.authrequest = new ArrayList<String>();
    }
    this.authrequest.add(authrequestItem);
    return this;
  }

  /**
   * - authrequest[0]：请求方法  - authrequest[1]: 待上传的资源URL  - authrequest[2]及以后项：请求头；若请求时reqmethod的值为“POST”，则为POST表单域的项，格式为“key: value”
   * @return authrequest
  **/
  @ApiModelProperty(value = "- authrequest[0]：请求方法  - authrequest[1]: 待上传的资源URL  - authrequest[2]及以后项：请求头；若请求时reqmethod的值为“POST”，则为POST表单域的项，格式为“key: value”")
  
    public List<String> getAuthrequest() {
    return authrequest;
  }

  public void setAuthrequest(List<String> authrequest) {
    this.authrequest = authrequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsuploadrefreshRes fileOsuploadrefreshRes = (FileOsuploadrefreshRes) o;
    return Objects.equals(this.uploadid, fileOsuploadrefreshRes.uploadid) &&
        Objects.equals(this.authrequest, fileOsuploadrefreshRes.authrequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadid, authrequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsuploadrefreshRes {\n");
    
    sb.append("    uploadid: ").append(toIndentedString(uploadid)).append("\n");
    sb.append("    authrequest: ").append(toIndentedString(authrequest)).append("\n");
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
