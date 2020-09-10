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
 * LinkSetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkSetRes   {
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

  public LinkSetRes endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

  /**
   * 到期时间 
   * @return endtime
  **/
  @ApiModelProperty(required = true, value = "到期时间 ")
      @NotNull

    public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public LinkSetRes link(String link) {
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

  public LinkSetRes password(String password) {
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

  public LinkSetRes perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 权限值，值域为[1,7]，具体说明参见开启外链中的描述
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "权限值，值域为[1,7]，具体说明参见开启外链中的描述")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public LinkSetRes limittimes(Long limittimes) {
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

  public LinkSetRes result(Long result) {
    this.result = result;
    return this;
  }

  /**
   * 0，请求已生效，返回为最新信息    1，请求正在审核，返回为更改前信息  
   * @return result
  **/
  @ApiModelProperty(required = true, value = "0，请求已生效，返回为最新信息    1，请求正在审核，返回为更改前信息  ")
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
    LinkSetRes linkSetRes = (LinkSetRes) o;
    return Objects.equals(this.endtime, linkSetRes.endtime) &&
        Objects.equals(this.link, linkSetRes.link) &&
        Objects.equals(this.password, linkSetRes.password) &&
        Objects.equals(this.perm, linkSetRes.perm) &&
        Objects.equals(this.limittimes, linkSetRes.limittimes) &&
        Objects.equals(this.result, linkSetRes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endtime, link, password, perm, limittimes, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSetRes {\n");
    
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
