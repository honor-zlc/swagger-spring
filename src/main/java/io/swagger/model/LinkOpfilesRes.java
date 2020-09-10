package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LinkOpfilesResFile;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LinkOpfilesRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpfilesRes   {
  @JsonProperty("files")
  @Valid
  private List<LinkOpfilesResFile> files = new ArrayList<LinkOpfilesResFile>();

  public LinkOpfilesRes files(List<LinkOpfilesResFile> files) {
    this.files = files;
    return this;
  }

  public LinkOpfilesRes addFilesItem(LinkOpfilesResFile filesItem) {
    this.files.add(filesItem);
    return this;
  }

  /**
   * 文件信息数组
   * @return files
  **/
  @ApiModelProperty(required = true, value = "文件信息数组")
      @NotNull
    @Valid
    public List<LinkOpfilesResFile> getFiles() {
    return files;
  }

  public void setFiles(List<LinkOpfilesResFile> files) {
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
    LinkOpfilesRes linkOpfilesRes = (LinkOpfilesRes) o;
    return Objects.equals(this.files, linkOpfilesRes.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpfilesRes {\n");
    
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
