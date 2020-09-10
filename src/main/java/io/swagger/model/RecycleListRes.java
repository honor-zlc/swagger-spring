package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecycleListResDirs;
import io.swagger.model.RecycleListResFiles;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecycleListRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class RecycleListRes   {
  @JsonProperty("dirs")
  @Valid
  private List<RecycleListResDirs> dirs = null;

  @JsonProperty("files")
  @Valid
  private List<RecycleListResFiles> files = null;

  @JsonProperty("servertime")
  private Long servertime = null;

  public RecycleListRes dirs(List<RecycleListResDirs> dirs) {
    this.dirs = dirs;
    return this;
  }

  public RecycleListRes addDirsItem(RecycleListResDirs dirsItem) {
    if (this.dirs == null) {
      this.dirs = new ArrayList<RecycleListResDirs>();
    }
    this.dirs.add(dirsItem);
    return this;
  }

  /**
   * 文件夹信息
   * @return dirs
  **/
  @ApiModelProperty(value = "文件夹信息")
      @Valid
    public List<RecycleListResDirs> getDirs() {
    return dirs;
  }

  public void setDirs(List<RecycleListResDirs> dirs) {
    this.dirs = dirs;
  }

  public RecycleListRes files(List<RecycleListResFiles> files) {
    this.files = files;
    return this;
  }

  public RecycleListRes addFilesItem(RecycleListResFiles filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<RecycleListResFiles>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * 文件信息
   * @return files
  **/
  @ApiModelProperty(value = "文件信息")
      @Valid
    public List<RecycleListResFiles> getFiles() {
    return files;
  }

  public void setFiles(List<RecycleListResFiles> files) {
    this.files = files;
  }

  public RecycleListRes servertime(Long servertime) {
    this.servertime = servertime;
    return this;
  }

  /**
   * 服务器时间，用来计算保留时间
   * @return servertime
  **/
  @ApiModelProperty(required = true, value = "服务器时间，用来计算保留时间")
      @NotNull

    public Long getServertime() {
    return servertime;
  }

  public void setServertime(Long servertime) {
    this.servertime = servertime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecycleListRes recycleListRes = (RecycleListRes) o;
    return Objects.equals(this.dirs, recycleListRes.dirs) &&
        Objects.equals(this.files, recycleListRes.files) &&
        Objects.equals(this.servertime, recycleListRes.servertime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirs, files, servertime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleListRes {\n");
    
    sb.append("    dirs: ").append(toIndentedString(dirs)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    servertime: ").append(toIndentedString(servertime)).append("\n");
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
