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
 * LinkListdirReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkListdirReq   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("by")
  private String by = null;

  @JsonProperty("sort")
  private String sort = null;

  public LinkListdirReq link(String link) {
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

  public LinkListdirReq password(String password) {
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

  public LinkListdirReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径，通过文件夹外链访问子目录时，需要该参数，默认为空
   * @return docid
  **/
  @ApiModelProperty(value = "文件gns路径，通过文件夹外链访问子目录时，需要该参数，默认为空")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkListdirReq by(String by) {
    this.by = by;
    return this;
  }

  /**
   * 指定按哪个字段排序  若不指定，默认按docid升序排序  说明：  name，按文件名称（中文按拼音）排序  size，按大小排序（目录按name升序）  time，按服务器修改时间排序  
   * @return by
  **/
  @ApiModelProperty(value = "指定按哪个字段排序  若不指定，默认按docid升序排序  说明：  name，按文件名称（中文按拼音）排序  size，按大小排序（目录按name升序）  time，按服务器修改时间排序  ")
  
    public String getBy() {
    return by;
  }

  public void setBy(String by) {
    this.by = by;
  }

  public LinkListdirReq sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * 升序还是降序，默认为升序  说明：  asc，升序  desc，降序  
   * @return sort
  **/
  @ApiModelProperty(value = "升序还是降序，默认为升序  说明：  asc，升序  desc，降序  ")
  
    public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkListdirReq linkListdirReq = (LinkListdirReq) o;
    return Objects.equals(this.link, linkListdirReq.link) &&
        Objects.equals(this.password, linkListdirReq.password) &&
        Objects.equals(this.docid, linkListdirReq.docid) &&
        Objects.equals(this.by, linkListdirReq.by) &&
        Objects.equals(this.sort, linkListdirReq.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, password, docid, by, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkListdirReq {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
