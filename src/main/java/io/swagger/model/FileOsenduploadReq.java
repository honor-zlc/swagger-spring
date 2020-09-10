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
 * FileOsenduploadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsenduploadReq   {
  @JsonProperty("crc32")
  private String crc32 = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("md5")
  private String md5 = null;

  @JsonProperty("slice_md5")
  private String sliceMd5 = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("editedrev")
  private String editedrev = null;

  public FileOsenduploadReq crc32(String crc32) {
    this.crc32 = crc32;
    return this;
  }

  /**
   * 文件的CRC32校验码
   * @return crc32
  **/
  @ApiModelProperty(value = "文件的CRC32校验码")
  
    public String getCrc32() {
    return crc32;
  }

  public void setCrc32(String crc32) {
    this.crc32 = crc32;
  }

  public FileOsenduploadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径（创建协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件gns路径（创建协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsenduploadReq md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * 文件MD5值
   * @return md5
  **/
  @ApiModelProperty(value = "文件MD5值")
  
    public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public FileOsenduploadReq sliceMd5(String sliceMd5) {
    this.sliceMd5 = sliceMd5;
    return this;
  }

  /**
   * 文件的slice_md5
   * @return sliceMd5
  **/
  @ApiModelProperty(value = "文件的slice_md5")
  
    public String getSliceMd5() {
    return sliceMd5;
  }

  public void setSliceMd5(String sliceMd5) {
    this.sliceMd5 = sliceMd5;
  }

  public FileOsenduploadReq rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 文件版本号
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "文件版本号")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileOsenduploadReq csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级，仅上传定密时需要设置  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级  
   * @return csflevel
  **/
  @ApiModelProperty(value = "文件密级，仅上传定密时需要设置  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级  ")
  
    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public FileOsenduploadReq editedrev(String editedrev) {
    this.editedrev = editedrev;
    return this;
  }

  /**
   * 表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”；  
   * @return editedrev
  **/
  @ApiModelProperty(value = "表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”；  ")
  
    public String getEditedrev() {
    return editedrev;
  }

  public void setEditedrev(String editedrev) {
    this.editedrev = editedrev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsenduploadReq fileOsenduploadReq = (FileOsenduploadReq) o;
    return Objects.equals(this.crc32, fileOsenduploadReq.crc32) &&
        Objects.equals(this.docid, fileOsenduploadReq.docid) &&
        Objects.equals(this.md5, fileOsenduploadReq.md5) &&
        Objects.equals(this.sliceMd5, fileOsenduploadReq.sliceMd5) &&
        Objects.equals(this.rev, fileOsenduploadReq.rev) &&
        Objects.equals(this.csflevel, fileOsenduploadReq.csflevel) &&
        Objects.equals(this.editedrev, fileOsenduploadReq.editedrev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crc32, docid, md5, sliceMd5, rev, csflevel, editedrev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsenduploadReq {\n");
    
    sb.append("    crc32: ").append(toIndentedString(crc32)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sliceMd5: ").append(toIndentedString(sliceMd5)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    editedrev: ").append(toIndentedString(editedrev)).append("\n");
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
