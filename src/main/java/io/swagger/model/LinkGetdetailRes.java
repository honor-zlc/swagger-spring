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
 * LinkGetdetailRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkGetdetailRes   {
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

  public LinkGetdetailRes endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 到期时间，单位：微秒，如果为-1，表示无限期，表示从1970-01-01,00-00-00至今的时间
   * @return endtime
  **/
  @ApiModelProperty(required = true, value = "到期时间，单位：微秒，如果为-1，表示无限期，表示从1970-01-01,00-00-00至今的时间")
      @NotNull

    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public LinkGetdetailRes link(String link) {
    this.link = link;
    return this;
  }

  /**
   * - 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 - link不是完全链接，需要客户端加上域名或者ip加端口的形式，如share.eisoocloud.com:80/link/1ERSDSEc或者192.168.83.33:80/link/1ERSDSEcad
   * @return link
  **/
  @ApiModelProperty(required = true, value = "- 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 - link不是完全链接，需要客户端加上域名或者ip加端口的形式，如share.eisoocloud.com:80/link/1ERSDSEc或者192.168.83.33:80/link/1ERSDSEcad")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LinkGetdetailRes password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 密码，空表示没有
   * @return password
  **/
  @ApiModelProperty(required = true, value = "密码，空表示没有")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LinkGetdetailRes perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 按位存储的权限值（返回的是十进制），获取该值后，需要转化成二级制，检查对应的位码是否被设置。    右数第一位表示该外链可以被预览    右数第二位表示该外链可以被下载    例如：  - 返回1表示只能被预览  - 返回2表示只能被下载  - 返回3表示可被预览和下载  
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "按位存储的权限值（返回的是十进制），获取该值后，需要转化成二级制，检查对应的位码是否被设置。    右数第一位表示该外链可以被预览    右数第二位表示该外链可以被下载    例如：  - 返回1表示只能被预览  - 返回2表示只能被下载  - 返回3表示可被预览和下载  ")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public LinkGetdetailRes limittimes(Long limittimes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGetdetailRes linkGetdetailRes = (LinkGetdetailRes) o;
    return Objects.equals(this.endtime, linkGetdetailRes.endtime) &&
        Objects.equals(this.link, linkGetdetailRes.link) &&
        Objects.equals(this.password, linkGetdetailRes.password) &&
        Objects.equals(this.perm, linkGetdetailRes.perm) &&
        Objects.equals(this.limittimes, linkGetdetailRes.limittimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endtime, link, password, perm, limittimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGetdetailRes {\n");
    
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
