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
 * DirCopyprogressRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirCopyprogressRes   {
  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("filecount")
  private Long filecount = null;

  @JsonProperty("dircount")
  private Long dircount = null;

  @JsonProperty("filecopied")
  private Long filecopied = null;

  @JsonProperty("dircopied")
  private Long dircopied = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("sizecopied")
  private Long sizecopied = null;

  @JsonProperty("filecopying")
  private String filecopying = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("destination")
  private String destination = null;

  public DirCopyprogressRes success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * 是否查询成功，如果没有找到，可能是复制任务不存在或者已经完成
   * @return success
  **/
  @ApiModelProperty(required = true, value = "是否查询成功，如果没有找到，可能是复制任务不存在或者已经完成")
      @NotNull

    public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public DirCopyprogressRes filecount(Long filecount) {
    this.filecount = filecount;
    return this;
  }

  /**
   * 如果查询成功，返回总文件个数
   * @return filecount
  **/
  @ApiModelProperty(value = "如果查询成功，返回总文件个数")
  
    public Long getFilecount() {
    return filecount;
  }

  public void setFilecount(Long filecount) {
    this.filecount = filecount;
  }

  public DirCopyprogressRes dircount(Long dircount) {
    this.dircount = dircount;
    return this;
  }

  /**
   * 如果查询成功，返回总目录个数
   * @return dircount
  **/
  @ApiModelProperty(value = "如果查询成功，返回总目录个数")
  
    public Long getDircount() {
    return dircount;
  }

  public void setDircount(Long dircount) {
    this.dircount = dircount;
  }

  public DirCopyprogressRes filecopied(Long filecopied) {
    this.filecopied = filecopied;
    return this;
  }

  /**
   * 如果查询成功，返回已复制的文件个数
   * @return filecopied
  **/
  @ApiModelProperty(value = "如果查询成功，返回已复制的文件个数")
  
    public Long getFilecopied() {
    return filecopied;
  }

  public void setFilecopied(Long filecopied) {
    this.filecopied = filecopied;
  }

  public DirCopyprogressRes dircopied(Long dircopied) {
    this.dircopied = dircopied;
    return this;
  }

  /**
   * 如果查询成功，返回已复制的目录个数
   * @return dircopied
  **/
  @ApiModelProperty(value = "如果查询成功，返回已复制的目录个数")
  
    public Long getDircopied() {
    return dircopied;
  }

  public void setDircopied(Long dircopied) {
    this.dircopied = dircopied;
  }

  public DirCopyprogressRes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 如果查询成功，返回总大小
   * @return size
  **/
  @ApiModelProperty(value = "如果查询成功，返回总大小")
  
    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DirCopyprogressRes sizecopied(Long sizecopied) {
    this.sizecopied = sizecopied;
    return this;
  }

  /**
   * 如果查询成功，返回已复制的大小
   * @return sizecopied
  **/
  @ApiModelProperty(value = "如果查询成功，返回已复制的大小")
  
    public Long getSizecopied() {
    return sizecopied;
  }

  public void setSizecopied(Long sizecopied) {
    this.sizecopied = sizecopied;
  }

  public DirCopyprogressRes filecopying(String filecopying) {
    this.filecopying = filecopying;
    return this;
  }

  /**
   * 如果查询成功，返回正在复制的文件名
   * @return filecopying
  **/
  @ApiModelProperty(value = "如果查询成功，返回正在复制的文件名")
  
    public String getFilecopying() {
    return filecopying;
  }

  public void setFilecopying(String filecopying) {
    this.filecopying = filecopying;
  }

  public DirCopyprogressRes source(String source) {
    this.source = source;
    return this;
  }

  /**
   * 如果查询成功，返回复制源位置的父目录名称，如果为根目录，返回空
   * @return source
  **/
  @ApiModelProperty(value = "如果查询成功，返回复制源位置的父目录名称，如果为根目录，返回空")
  
    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DirCopyprogressRes destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * 如果查询成功，返回复制目标父目录的名称
   * @return destination
  **/
  @ApiModelProperty(value = "如果查询成功，返回复制目标父目录的名称")
  
    public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirCopyprogressRes dirCopyprogressRes = (DirCopyprogressRes) o;
    return Objects.equals(this.success, dirCopyprogressRes.success) &&
        Objects.equals(this.filecount, dirCopyprogressRes.filecount) &&
        Objects.equals(this.dircount, dirCopyprogressRes.dircount) &&
        Objects.equals(this.filecopied, dirCopyprogressRes.filecopied) &&
        Objects.equals(this.dircopied, dirCopyprogressRes.dircopied) &&
        Objects.equals(this.size, dirCopyprogressRes.size) &&
        Objects.equals(this.sizecopied, dirCopyprogressRes.sizecopied) &&
        Objects.equals(this.filecopying, dirCopyprogressRes.filecopying) &&
        Objects.equals(this.source, dirCopyprogressRes.source) &&
        Objects.equals(this.destination, dirCopyprogressRes.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, filecount, dircount, filecopied, dircopied, size, sizecopied, filecopying, source, destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCopyprogressRes {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    filecount: ").append(toIndentedString(filecount)).append("\n");
    sb.append("    dircount: ").append(toIndentedString(dircount)).append("\n");
    sb.append("    filecopied: ").append(toIndentedString(filecopied)).append("\n");
    sb.append("    dircopied: ").append(toIndentedString(dircopied)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizecopied: ").append(toIndentedString(sizecopied)).append("\n");
    sb.append("    filecopying: ").append(toIndentedString(filecopying)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
