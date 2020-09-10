package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FileOscompleteuploadReqPartinfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileOscompleteuploadReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOscompleteuploadReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("uploadid")
  private String uploadid = null;

  @JsonProperty("reqhost")
  private String reqhost = null;

  @JsonProperty("usehttps")
  private Boolean usehttps = null;

  @JsonProperty("partinfo")
  private FileOscompleteuploadReqPartinfo partinfo = null;

  public FileOscompleteuploadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件的gns路径（创建协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件的gns路径（创建协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOscompleteuploadReq rev(String rev) {
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

  public FileOscompleteuploadReq uploadid(String uploadid) {
    this.uploadid = uploadid;
    return this;
  }

  /**
   * Multiupload事件Id
   * @return uploadid
  **/
  @ApiModelProperty(required = true, value = "Multiupload事件Id")
      @NotNull

    public String getUploadid() {
    return uploadid;
  }

  public void setUploadid(String uploadid) {
    this.uploadid = uploadid;
  }

  public FileOscompleteuploadReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

  /**
   * 向存储服务器上传数据时的请求地址
   * @return reqhost
  **/
  @ApiModelProperty(value = "向存储服务器上传数据时的请求地址")
  
    public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public FileOscompleteuploadReq usehttps(Boolean usehttps) {
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

  public FileOscompleteuploadReq partinfo(FileOscompleteuploadReqPartinfo partinfo) {
    this.partinfo = partinfo;
    return this;
  }

  /**
   * Get partinfo
   * @return partinfo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public FileOscompleteuploadReqPartinfo getPartinfo() {
    return partinfo;
  }

  public void setPartinfo(FileOscompleteuploadReqPartinfo partinfo) {
    this.partinfo = partinfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOscompleteuploadReq fileOscompleteuploadReq = (FileOscompleteuploadReq) o;
    return Objects.equals(this.docid, fileOscompleteuploadReq.docid) &&
        Objects.equals(this.rev, fileOscompleteuploadReq.rev) &&
        Objects.equals(this.uploadid, fileOscompleteuploadReq.uploadid) &&
        Objects.equals(this.reqhost, fileOscompleteuploadReq.reqhost) &&
        Objects.equals(this.usehttps, fileOscompleteuploadReq.usehttps) &&
        Objects.equals(this.partinfo, fileOscompleteuploadReq.partinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, uploadid, reqhost, usehttps, partinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOscompleteuploadReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    uploadid: ").append(toIndentedString(uploadid)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
    sb.append("    partinfo: ").append(toIndentedString(partinfo)).append("\n");
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
