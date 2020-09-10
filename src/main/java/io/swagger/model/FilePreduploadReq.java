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
 * FilePreduploadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FilePreduploadReq   {
  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("slice_md5")
  private String sliceMd5 = null;

  public FilePreduploadReq length(Long length) {
    this.length = length;
    return this;
  }

  /**
   * 整个文件的长度
   * @return length
  **/
  @ApiModelProperty(required = true, value = "整个文件的长度")
      @NotNull

    public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public FilePreduploadReq sliceMd5(String sliceMd5) {
    this.sliceMd5 = sliceMd5;
    return this;
  }

  /**
   * - 校验段校验码 - 如果文件大于200KB，slice_md5为文件的前200KB的MD5值 - 如果文件小于等于200KB，slice_md5为整个文件的MD5值 - 如果是空文件，slilce为空。
   * @return sliceMd5
  **/
  @ApiModelProperty(required = true, value = "- 校验段校验码 - 如果文件大于200KB，slice_md5为文件的前200KB的MD5值 - 如果文件小于等于200KB，slice_md5为整个文件的MD5值 - 如果是空文件，slilce为空。")
      @NotNull

    public String getSliceMd5() {
    return sliceMd5;
  }

  public void setSliceMd5(String sliceMd5) {
    this.sliceMd5 = sliceMd5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilePreduploadReq filePreduploadReq = (FilePreduploadReq) o;
    return Objects.equals(this.length, filePreduploadReq.length) &&
        Objects.equals(this.sliceMd5, filePreduploadReq.sliceMd5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, sliceMd5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePreduploadReq {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    sliceMd5: ").append(toIndentedString(sliceMd5)).append("\n");
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
