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
 * LinkCheckpermReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkCheckpermReq   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("perm")
  private Long perm = null;

  public LinkCheckpermReq link(String link) {
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

  public LinkCheckpermReq password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 密码
   * @return password
  **/
  @ApiModelProperty(required = true, value = "密码")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LinkCheckpermReq perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 权限值，值域为1、2、4，具体说明参见开启外链中的描述
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "权限值，值域为1、2、4，具体说明参见开启外链中的描述")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkCheckpermReq linkCheckpermReq = (LinkCheckpermReq) o;
    return Objects.equals(this.link, linkCheckpermReq.link) &&
        Objects.equals(this.password, linkCheckpermReq.password) &&
        Objects.equals(this.perm, linkCheckpermReq.perm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, password, perm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkCheckpermReq {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
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
