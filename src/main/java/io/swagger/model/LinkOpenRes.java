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
 * LinkOpenRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpenRes   {
  @JsonProperty("endtime")
  private Long endtime = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("perm")
  private Long perm = null;

  @JsonProperty("limittimes")
  private Long limittimes = null;

  @JsonProperty("result")
  private Long result = null;

  public LinkOpenRes endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 到期时间，如果为-1，表示无限期
   * @return endtime
  **/
  @ApiModelProperty(required = true, value = "到期时间，如果为-1，表示无限期")
      @NotNull

    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public LinkOpenRes link(String link) {
    this.link = link;
    return this;
  }

  /**
   * 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0
   * @return link
  **/
  @ApiModelProperty(required = true, value = "外链唯一标识，如FC5E038D38A57032085441E7FE7010B0")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LinkOpenRes password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 空表示没有
   * @return password
  **/
  @ApiModelProperty(required = true, value = "空表示没有")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LinkOpenRes perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 按位存储的权限值（返回的是十进制），获取该值后，需要转化成二级制，检查对应的位码是否被设置。    右数第一位表示该外链可以被预览    右数第二位表示该外链可以被下载    右数第三位表示该外链可以上传文件  例如：  - 返回1表示只能被预览  - 返回2表示只能被下载  - 返回4表示只能上传文件  - 返回3表示可被预览和下载    开启外链时，默认返回的是3  
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "按位存储的权限值（返回的是十进制），获取该值后，需要转化成二级制，检查对应的位码是否被设置。    右数第一位表示该外链可以被预览    右数第二位表示该外链可以被下载    右数第三位表示该外链可以上传文件  例如：  - 返回1表示只能被预览  - 返回2表示只能被下载  - 返回4表示只能上传文件  - 返回3表示可被预览和下载    开启外链时，默认返回的是3  ")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public LinkOpenRes limittimes(Long limittimes) {
    this.limittimes = limittimes;
    return this;
  }

  /**
   * 外链使用次数。  -1为无限制  
   * @return limittimes
  **/
  @ApiModelProperty(required = true, value = "外链使用次数。  -1为无限制  ")
      @NotNull

    public Long getLimittimes() {
    return limittimes;
  }

  public void setLimittimes(Long limittimes) {
    this.limittimes = limittimes;
  }

  public LinkOpenRes result(Long result) {
    this.result = result;
    return this;
  }

  /**
   * 0，请求已生效，返回为最新信息    1，请求正在审核，返回为创建前信息  
   * @return result
  **/
  @ApiModelProperty(required = true, value = "0，请求已生效，返回为最新信息    1，请求正在审核，返回为创建前信息  ")
      @NotNull

    public Long getResult() {
    return result;
  }

  public void setResult(Long result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOpenRes linkOpenRes = (LinkOpenRes) o;
    return Objects.equals(this.endtime, linkOpenRes.endtime) &&
        Objects.equals(this.link, linkOpenRes.link) &&
        Objects.equals(this.password, linkOpenRes.password) &&
        Objects.equals(this.perm, linkOpenRes.perm) &&
        Objects.equals(this.limittimes, linkOpenRes.limittimes) &&
        Objects.equals(this.result, linkOpenRes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endtime, link, password, perm, limittimes, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpenRes {\n");
    
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    limittimes: ").append(toIndentedString(limittimes)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
