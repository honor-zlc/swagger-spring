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
 * LinkGetReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkGetReq   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("docid")
  private String docid = null;

  public LinkGetReq link(String link) {
    this.link = link;
    return this;
  }

  /**
   * 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0
   * @return link
  **/
  @ApiModelProperty(required = true, value = "外链唯一标识，如FC5E038D38A57032085441E7FE7010B0")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LinkGetReq password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 密码
   * @return password
  **/
  @ApiModelProperty(required = true, value = "密码")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LinkGetReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径，通过文件夹外链访问文件信息时，需要该参数，默认为空
   * @return docid
  **/
  @ApiModelProperty(value = "文件gns路径，通过文件夹外链访问文件信息时，需要该参数，默认为空")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGetReq linkGetReq = (LinkGetReq) o;
    return Objects.equals(this.link, linkGetReq.link) &&
        Objects.equals(this.password, linkGetReq.password) &&
        Objects.equals(this.docid, linkGetReq.docid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, password, docid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGetReq {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
