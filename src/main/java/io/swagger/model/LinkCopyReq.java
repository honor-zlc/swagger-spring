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
 * LinkCopyReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkCopyReq   {
  @JsonProperty("destparent")
  private String destparent = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("ondup")
  private Long ondup = null;

  public LinkCopyReq destparent(String destparent) {
    this.destparent = destparent;
    return this;
  }

  /**
   * 目标父对象的gns路径，无法复制到原位置的子目录下
   * @return destparent
  **/
  @ApiModelProperty(required = true, value = "目标父对象的gns路径，无法复制到原位置的子目录下")
      @NotNull

    public String getDestparent() {
    return destparent;
  }

  public void setDestparent(String destparent) {
    this.destparent = destparent;
  }

  public LinkCopyReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * gns路径，通过文件夹外链复制其中的子对象时，需要该参数，默认为空
   * @return docid
  **/
  @ApiModelProperty(value = "gns路径，通过文件夹外链复制其中的子对象时，需要该参数，默认为空")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkCopyReq link(String link) {
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

  public LinkCopyReq password(String password) {
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

  public LinkCopyReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

  /**
   * 1:检查是否重命名，重名则抛异常  2:默认值，如果重名冲突，自动重名  3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @ApiModelProperty(value = "1:检查是否重命名，重名则抛异常  2:默认值，如果重名冲突，自动重名  3:如果重名冲突，自动覆盖  ")
  
    public Long getOndup() {
    return ondup;
  }

  public void setOndup(Long ondup) {
    this.ondup = ondup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkCopyReq linkCopyReq = (LinkCopyReq) o;
    return Objects.equals(this.destparent, linkCopyReq.destparent) &&
        Objects.equals(this.docid, linkCopyReq.docid) &&
        Objects.equals(this.link, linkCopyReq.link) &&
        Objects.equals(this.password, linkCopyReq.password) &&
        Objects.equals(this.ondup, linkCopyReq.ondup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destparent, docid, link, password, ondup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkCopyReq {\n");
    
    sb.append("    destparent: ").append(toIndentedString(destparent)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ondup: ").append(toIndentedString(ondup)).append("\n");
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
