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
 * LinkBatchdownloadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkBatchdownloadReq   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  @JsonProperty("files")
  @Valid
  private List<String> files = null;

  @JsonProperty("dirs")
  @Valid
  private List<String> dirs = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  public LinkBatchdownloadReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * zip压缩包名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "zip压缩包名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkBatchdownloadReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

  /**
   * 从存储服务器下载数据时的请求地址
   * @return reqhost
  **/
  @ApiModelProperty(required = true, value = "从存储服务器下载数据时的请求地址")
      @NotNull

    public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public LinkBatchdownloadReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

  /**
   * 上传是否使用https，默认为true
   * @return usehttps
  **/
  @ApiModelProperty(value = "上传是否使用https，默认为true")
  
    public Boolean isUsehttps() {
    return usehttps;
  }

  public void setUsehttps(Boolean usehttps) {
    this.usehttps = usehttps;
  }

  public LinkBatchdownloadReq files(List<String> files) {
    this.files = files;
    return this;
  }

  public LinkBatchdownloadReq addFilesItem(String filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<String>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * 文件GNS数组
   * @return files
  **/
  @ApiModelProperty(value = "文件GNS数组")
  
    public List<String> getFiles() {
    return files;
  }

  public void setFiles(List<String> files) {
    this.files = files;
  }

  public LinkBatchdownloadReq dirs(List<String> dirs) {
    this.dirs = dirs;
    return this;
  }

  public LinkBatchdownloadReq addDirsItem(String dirsItem) {
    if (this.dirs == null) {
      this.dirs = new ArrayList<String>();
    }
    this.dirs.add(dirsItem);
    return this;
  }

  /**
   * 文件夹GNS数组
   * @return dirs
  **/
  @ApiModelProperty(value = "文件夹GNS数组")
  
    public List<String> getDirs() {
    return dirs;
  }

  public void setDirs(List<String> dirs) {
    this.dirs = dirs;
  }

  public LinkBatchdownloadReq link(String link) {
    this.link = link;
    return this;
  }

  /**
   * 外链唯一标识
   * @return link
  **/
  @ApiModelProperty(required = true, value = "外链唯一标识")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LinkBatchdownloadReq password(String password) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkBatchdownloadReq linkBatchdownloadReq = (LinkBatchdownloadReq) o;
    return Objects.equals(this.name, linkBatchdownloadReq.name) &&
        Objects.equals(this.reqhost, linkBatchdownloadReq.reqhost) &&
        Objects.equals(this.usehttps, linkBatchdownloadReq.usehttps) &&
        Objects.equals(this.files, linkBatchdownloadReq.files) &&
        Objects.equals(this.dirs, linkBatchdownloadReq.dirs) &&
        Objects.equals(this.link, linkBatchdownloadReq.link) &&
        Objects.equals(this.password, linkBatchdownloadReq.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reqhost, usehttps, files, dirs, link, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkBatchdownloadReq {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    dirs: ").append(toIndentedString(dirs)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
