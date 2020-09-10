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
 * AutolockLockReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockLockReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("force")
  private Boolean force = null;

  @JsonProperty("expiretime")
  private Long expiretime = null;

  public AutolockLockReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件id
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public AutolockLockReq force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * 是否强制获取锁，默认为false  false：不强制获取锁  true：强制获取锁
   * @return force
  **/
  @ApiModelProperty(value = "是否强制获取锁，默认为false  false：不强制获取锁  true：强制获取锁")
  
    public Boolean isForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  public AutolockLockReq expiretime(Long expiretime) {
    this.expiretime = expiretime;
    return this;
  }

  /**
   * 文件锁有效期限，默认为使用服务器可配置的超期间隔进行定期清理  -1：永久有效
   * @return expiretime
  **/
  @ApiModelProperty(value = "文件锁有效期限，默认为使用服务器可配置的超期间隔进行定期清理  -1：永久有效")
  
    public Long getExpiretime() {
    return expiretime;
  }

  public void setExpiretime(Long expiretime) {
    this.expiretime = expiretime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockLockReq autolockLockReq = (AutolockLockReq) o;
    return Objects.equals(this.docid, autolockLockReq.docid) &&
        Objects.equals(this.force, autolockLockReq.force) &&
        Objects.equals(this.expiretime, autolockLockReq.expiretime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, force, expiretime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockLockReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    expiretime: ").append(toIndentedString(expiretime)).append("\n");
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
