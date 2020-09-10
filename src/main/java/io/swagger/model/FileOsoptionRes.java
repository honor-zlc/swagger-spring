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
 * FileOsoptionRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsoptionRes   {
  @JsonProperty("partminsize")
  private Long partminsize = null;

  @JsonProperty("partmaxsize")
  private Long partmaxsize = null;

  @JsonProperty("partmaxnum")
  private Long partmaxnum = null;

  public FileOsoptionRes partminsize(Long partminsize) {
    this.partminsize = partminsize;
    return this;
  }

  /**
   * 大文件分片上传，除最后一块外，其它分片的最小值；当partminsize小于等于4M时，可按照4M分块；当partminsize大于4M时，分块的大小必须大于等于partminsize。
   * @return partminsize
  **/
  @ApiModelProperty(required = true, value = "大文件分片上传，除最后一块外，其它分片的最小值；当partminsize小于等于4M时，可按照4M分块；当partminsize大于4M时，分块的大小必须大于等于partminsize。")
      @NotNull

    public Long getPartminsize() {
    return partminsize;
  }

  public void setPartminsize(Long partminsize) {
    this.partminsize = partminsize;
  }

  public FileOsoptionRes partmaxsize(Long partmaxsize) {
    this.partmaxsize = partmaxsize;
    return this;
  }

  /**
   * 大文件分片上传，除最后一块外，其它分片的最大值
   * @return partmaxsize
  **/
  @ApiModelProperty(required = true, value = "大文件分片上传，除最后一块外，其它分片的最大值")
      @NotNull

    public Long getPartmaxsize() {
    return partmaxsize;
  }

  public void setPartmaxsize(Long partmaxsize) {
    this.partmaxsize = partmaxsize;
  }

  public FileOsoptionRes partmaxnum(Long partmaxnum) {
    this.partmaxnum = partmaxnum;
    return this;
  }

  /**
   * 大文件分片上传，最大的分片数量
   * @return partmaxnum
  **/
  @ApiModelProperty(required = true, value = "大文件分片上传，最大的分片数量")
      @NotNull

    public Long getPartmaxnum() {
    return partmaxnum;
  }

  public void setPartmaxnum(Long partmaxnum) {
    this.partmaxnum = partmaxnum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsoptionRes fileOsoptionRes = (FileOsoptionRes) o;
    return Objects.equals(this.partminsize, fileOsoptionRes.partminsize) &&
        Objects.equals(this.partmaxsize, fileOsoptionRes.partmaxsize) &&
        Objects.equals(this.partmaxnum, fileOsoptionRes.partmaxnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partminsize, partmaxsize, partmaxnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsoptionRes {\n");
    
    sb.append("    partminsize: ").append(toIndentedString(partminsize)).append("\n");
    sb.append("    partmaxsize: ").append(toIndentedString(partmaxsize)).append("\n");
    sb.append("    partmaxnum: ").append(toIndentedString(partmaxnum)).append("\n");
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
