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
 * DirSizeRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirSizeRes   {
  @JsonProperty("dirnum")
  private Long dirnum = null;

  @JsonProperty("filenum")
  private Long filenum = null;

  @JsonProperty("recyclesize")
  private Long recyclesize = null;

  @JsonProperty("totalsize")
  private Long totalsize = null;

  public DirSizeRes dirnum(Long dirnum) {
    this.dirnum = dirnum;
    return this;
  }

  /**
   * 总目录数
   * @return dirnum
  **/
  @ApiModelProperty(required = true, value = "总目录数")
      @NotNull

    public Long getDirnum() {
    return dirnum;
  }

  public void setDirnum(Long dirnum) {
    this.dirnum = dirnum;
  }

  public DirSizeRes filenum(Long filenum) {
    this.filenum = filenum;
    return this;
  }

  /**
   * 总文件数
   * @return filenum
  **/
  @ApiModelProperty(required = true, value = "总文件数")
      @NotNull

    public Long getFilenum() {
    return filenum;
  }

  public void setFilenum(Long filenum) {
    this.filenum = filenum;
  }

  public DirSizeRes recyclesize(Long recyclesize) {
    this.recyclesize = recyclesize;
    return this;
  }

  /**
   * 回收站大小，如果docid不为CID或者回收站对象的gns，recyclesize返回-1
   * @return recyclesize
  **/
  @ApiModelProperty(required = true, value = "回收站大小，如果docid不为CID或者回收站对象的gns，recyclesize返回-1")
      @NotNull

    public Long getRecyclesize() {
    return recyclesize;
  }

  public void setRecyclesize(Long recyclesize) {
    this.recyclesize = recyclesize;
  }

  public DirSizeRes totalsize(Long totalsize) {
    this.totalsize = totalsize;
    return this;
  }

  /**
   * 总大小
   * @return totalsize
  **/
  @ApiModelProperty(required = true, value = "总大小")
      @NotNull

    public Long getTotalsize() {
    return totalsize;
  }

  public void setTotalsize(Long totalsize) {
    this.totalsize = totalsize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirSizeRes dirSizeRes = (DirSizeRes) o;
    return Objects.equals(this.dirnum, dirSizeRes.dirnum) &&
        Objects.equals(this.filenum, dirSizeRes.filenum) &&
        Objects.equals(this.recyclesize, dirSizeRes.recyclesize) &&
        Objects.equals(this.totalsize, dirSizeRes.totalsize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirnum, filenum, recyclesize, totalsize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirSizeRes {\n");
    
    sb.append("    dirnum: ").append(toIndentedString(dirnum)).append("\n");
    sb.append("    filenum: ").append(toIndentedString(filenum)).append("\n");
    sb.append("    recyclesize: ").append(toIndentedString(recyclesize)).append("\n");
    sb.append("    totalsize: ").append(toIndentedString(totalsize)).append("\n");
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
