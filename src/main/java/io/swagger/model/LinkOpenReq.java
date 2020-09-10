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
 * LinkOpenReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpenReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("open")
  private Boolean open = null;

  @JsonProperty("endtime")
  private Long endtime = null;

  @JsonProperty("perm")
  private Long perm = null;

  @JsonProperty("limittimes")
  private Long limittimes = null;

  public LinkOpenReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 待开启外链的对象gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "待开启外链的对象gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOpenReq open(Boolean open) {
    this.open = open;
    return this;
  }

  /**
   * 如果true，返回密码，false，密码空
   * @return open
  **/
  @ApiModelProperty(value = "如果true，返回密码，false，密码空")
  
    public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public LinkOpenReq endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 到期时间，单位：微秒
   * @return endtime
  **/
  @ApiModelProperty(value = "到期时间，单位：微秒")
  
    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public LinkOpenReq perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 权限值，值域为[1,7]，具体说明参见开启外链中的描述
   * @return perm
  **/
  @ApiModelProperty(value = "权限值，值域为[1,7]，具体说明参见开启外链中的描述")
  
    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public LinkOpenReq limittimes(Long limittimes) {
    this.limittimes = limittimes;
    return this;
  }

  /**
   * 外链使用次数。  -1为无限制  
   * @return limittimes
  **/
  @ApiModelProperty(value = "外链使用次数。  -1为无限制  ")
  
    public Long getLimittimes() {
    return limittimes;
  }

  public void setLimittimes(Long limittimes) {
    this.limittimes = limittimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOpenReq linkOpenReq = (LinkOpenReq) o;
    return Objects.equals(this.docid, linkOpenReq.docid) &&
        Objects.equals(this.open, linkOpenReq.open) &&
        Objects.equals(this.endtime, linkOpenReq.endtime) &&
        Objects.equals(this.perm, linkOpenReq.perm) &&
        Objects.equals(this.limittimes, linkOpenReq.limittimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, open, endtime, perm, limittimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpenReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    limittimes: ").append(toIndentedString(limittimes)).append("\n");
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
