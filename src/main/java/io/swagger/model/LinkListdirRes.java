package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LinkListdirResDir;
import io.swagger.model.LinkListdirResFile;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LinkListdirRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkListdirRes   {
  @JsonProperty("dirs")
  @Valid
  private List<LinkListdirResDir> dirs = new ArrayList<LinkListdirResDir>();

  @JsonProperty("files")
  @Valid
  private List<LinkListdirResFile> files = new ArrayList<LinkListdirResFile>();

  public LinkListdirRes dirs(List<LinkListdirResDir> dirs) {
    this.dirs = dirs;
    return this;
  }

  public LinkListdirRes addDirsItem(LinkListdirResDir dirsItem) {
    this.dirs.add(dirsItem);
    return this;
  }

  /**
   * 文件夹信息
   * @return dirs
  **/
  @ApiModelProperty(required = true, value = "文件夹信息")
      @NotNull
    @Valid
    public List<LinkListdirResDir> getDirs() {
    return dirs;
  }

  public void setDirs(List<LinkListdirResDir> dirs) {
    this.dirs = dirs;
  }

  public LinkListdirRes files(List<LinkListdirResFile> files) {
    this.files = files;
    return this;
  }

  public LinkListdirRes addFilesItem(LinkListdirResFile filesItem) {
    this.files.add(filesItem);
    return this;
  }

  /**
   * 文件信息
   * @return files
  **/
  @ApiModelProperty(required = true, value = "文件信息")
      @NotNull
    @Valid
    public List<LinkListdirResFile> getFiles() {
    return files;
  }

  public void setFiles(List<LinkListdirResFile> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkListdirRes linkListdirRes = (LinkListdirRes) o;
    return Objects.equals(this.dirs, linkListdirRes.dirs) &&
        Objects.equals(this.files, linkListdirRes.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirs, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkListdirRes {\n");
    
    sb.append("    dirs: ").append(toIndentedString(dirs)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
