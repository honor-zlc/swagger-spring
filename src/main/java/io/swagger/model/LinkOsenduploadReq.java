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
 * LinkOsenduploadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOsenduploadReq   {
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

  @JsonProperty("link")
  private String link = null;

  public LinkOsenduploadReq crc32(String crc32) {
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

  public LinkOsenduploadReq docid(String docid) {
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

  public LinkOsenduploadReq md5(String md5) {
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

  public LinkOsenduploadReq sliceMd5(String sliceMd5) {
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

  public LinkOsenduploadReq rev(String rev) {
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

  public LinkOsenduploadReq link(String link) {
    this.link = link;
    return this;
  }

  /**
   * 外链ID
   * @return link
  **/
  @ApiModelProperty(required = true, value = "外链ID")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOsenduploadReq linkOsenduploadReq = (LinkOsenduploadReq) o;
    return Objects.equals(this.crc32, linkOsenduploadReq.crc32) &&
        Objects.equals(this.docid, linkOsenduploadReq.docid) &&
        Objects.equals(this.md5, linkOsenduploadReq.md5) &&
        Objects.equals(this.sliceMd5, linkOsenduploadReq.sliceMd5) &&
        Objects.equals(this.rev, linkOsenduploadReq.rev) &&
        Objects.equals(this.link, linkOsenduploadReq.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crc32, docid, md5, sliceMd5, rev, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOsenduploadReq {\n");
    
    sb.append("    crc32: ").append(toIndentedString(crc32)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sliceMd5: ").append(toIndentedString(sliceMd5)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
