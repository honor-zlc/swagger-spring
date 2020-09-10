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
 * FileBatchdownloadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileBatchdownloadReq   {
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

  public FileBatchdownloadReq name(String name) {
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

  public FileBatchdownloadReq reqhost(String reqhost) {
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

  public FileBatchdownloadReq usehttps(Boolean usehttps) {
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

  public FileBatchdownloadReq files(List<String> files) {
    this.files = files;
    return this;
  }

  public FileBatchdownloadReq addFilesItem(String filesItem) {
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

  public FileBatchdownloadReq dirs(List<String> dirs) {
    this.dirs = dirs;
    return this;
  }

  public FileBatchdownloadReq addDirsItem(String dirsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileBatchdownloadReq fileBatchdownloadReq = (FileBatchdownloadReq) o;
    return Objects.equals(this.name, fileBatchdownloadReq.name) &&
        Objects.equals(this.reqhost, fileBatchdownloadReq.reqhost) &&
        Objects.equals(this.usehttps, fileBatchdownloadReq.usehttps) &&
        Objects.equals(this.files, fileBatchdownloadReq.files) &&
        Objects.equals(this.dirs, fileBatchdownloadReq.dirs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reqhost, usehttps, files, dirs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileBatchdownloadReq {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    dirs: ").append(toIndentedString(dirs)).append("\n");
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
