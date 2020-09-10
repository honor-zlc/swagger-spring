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
 * LinkPlayinfoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkPlayinfoReq   {
  @JsonProperty("definition")
  private String definition = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  public LinkPlayinfoReq definition(String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * 视频画质（音频音质），为空默认为原始画质  有效值：空； od；sd  对于视频，od表示原始画质，sd表示标清；对于音频，sd请求无效
   * @return definition
  **/
  @ApiModelProperty(value = "视频画质（音频音质），为空默认为原始画质  有效值：空； od；sd  对于视频，od表示原始画质，sd表示标清；对于音频，sd请求无效")
  
    public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public LinkPlayinfoReq link(String link) {
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

  public LinkPlayinfoReq password(String password) {
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

  public LinkPlayinfoReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径，通过文件夹外链在线播放时，需要该参数，默认为空
   * @return docid
  **/
  @ApiModelProperty(value = "文件gns路径，通过文件夹外链在线播放时，需要该参数，默认为空")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkPlayinfoReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 版本号，为空默认获取最新版本
   * @return rev
  **/
  @ApiModelProperty(value = "版本号，为空默认获取最新版本")
  
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
    LinkPlayinfoReq linkPlayinfoReq = (LinkPlayinfoReq) o;
    return Objects.equals(this.definition, linkPlayinfoReq.definition) &&
        Objects.equals(this.link, linkPlayinfoReq.link) &&
        Objects.equals(this.password, linkPlayinfoReq.password) &&
        Objects.equals(this.docid, linkPlayinfoReq.docid) &&
        Objects.equals(this.rev, linkPlayinfoReq.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, link, password, docid, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPlayinfoReq {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
