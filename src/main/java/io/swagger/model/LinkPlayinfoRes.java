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
 * 注 1：docid：转码完成至少一种分辨率，认为完成转码，返回转码文件的id
 */
@ApiModel(description = "注 1：docid：转码完成至少一种分辨率，认为完成转码，返回转码文件的id")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkPlayinfoRes   {
  @JsonProperty("status")
  private Long status = null;

  @JsonProperty("odstat")
  private Long odstat = null;

  @JsonProperty("sdstat")
  private Long sdstat = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("remainingTime")
  private Long remainingTime = null;

  public LinkPlayinfoRes status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * 转码状态:  0 未开始转码；1 正在转码；2转码完成  
   * @return status
  **/
  @ApiModelProperty(required = true, value = "转码状态:  0 未开始转码；1 正在转码；2转码完成  ")
      @NotNull

    public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public LinkPlayinfoRes odstat(Long odstat) {
    this.odstat = odstat;
    return this;
  }

  /**
   * 原始画质（音质）：0无此分辨率；1已转码
   * @return odstat
  **/
  @ApiModelProperty(required = true, value = "原始画质（音质）：0无此分辨率；1已转码")
      @NotNull

    public Long getOdstat() {
    return odstat;
  }

  public void setOdstat(Long odstat) {
    this.odstat = odstat;
  }

  public LinkPlayinfoRes sdstat(Long sdstat) {
    this.sdstat = sdstat;
    return this;
  }

  /**
   * 标清：0无此分辨率；1已转码
   * @return sdstat
  **/
  @ApiModelProperty(required = true, value = "标清：0无此分辨率；1已转码")
      @NotNull

    public Long getSdstat() {
    return sdstat;
  }

  public void setSdstat(Long sdstat) {
    this.sdstat = sdstat;
  }

  public LinkPlayinfoRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 转码文件的唯一标识id，转码完成至少一种分辨率，认为完成转码，返回转码文件的id
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "转码文件的唯一标识id，转码完成至少一种分辨率，认为完成转码，返回转码文件的id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkPlayinfoRes remainingTime(Long remainingTime) {
    this.remainingTime = remainingTime;
    return this;
  }

  /**
   * 转码剩余时间（秒），status为1时返回
   * @return remainingTime
  **/
  @ApiModelProperty(value = "转码剩余时间（秒），status为1时返回")
  
    public Long getRemainingTime() {
    return remainingTime;
  }

  public void setRemainingTime(Long remainingTime) {
    this.remainingTime = remainingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPlayinfoRes linkPlayinfoRes = (LinkPlayinfoRes) o;
    return Objects.equals(this.status, linkPlayinfoRes.status) &&
        Objects.equals(this.odstat, linkPlayinfoRes.odstat) &&
        Objects.equals(this.sdstat, linkPlayinfoRes.sdstat) &&
        Objects.equals(this.docid, linkPlayinfoRes.docid) &&
        Objects.equals(this.remainingTime, linkPlayinfoRes.remainingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, odstat, sdstat, docid, remainingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPlayinfoRes {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    odstat: ").append(toIndentedString(odstat)).append("\n");
    sb.append("    sdstat: ").append(toIndentedString(sdstat)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
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
