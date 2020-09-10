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
 * AutolockTrylockRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockTrylockRes   {
  @JsonProperty("issucceed")
  private Boolean issucceed = null;

  @JsonProperty("lockerid")
  private String lockerid = null;

  @JsonProperty("lockeraccount")
  private String lockeraccount = null;

  @JsonProperty("lockername")
  private String lockername = null;

  public AutolockTrylockRes issucceed(Boolean issucceed) {
    this.issucceed = issucceed;
    return this;
  }

  /**
   * 锁定文件成功则返回true，文件已被其他用户锁定则返回false
   * @return issucceed
  **/
  @ApiModelProperty(required = true, value = "锁定文件成功则返回true，文件已被其他用户锁定则返回false")
      @NotNull

    public Boolean isIssucceed() {
    return issucceed;
  }

  public void setIssucceed(Boolean issucceed) {
    this.issucceed = issucceed;
  }

  public AutolockTrylockRes lockerid(String lockerid) {
    this.lockerid = lockerid;
    return this;
  }

  /**
   * 文件已被其他用户时，锁定者的用户id
   * @return lockerid
  **/
  @ApiModelProperty(value = "文件已被其他用户时，锁定者的用户id")
  
    public String getLockerid() {
    return lockerid;
  }

  public void setLockerid(String lockerid) {
    this.lockerid = lockerid;
  }

  public AutolockTrylockRes lockeraccount(String lockeraccount) {
    this.lockeraccount = lockeraccount;
    return this;
  }

  /**
   * 文件已被其他用户时，锁定者用户名
   * @return lockeraccount
  **/
  @ApiModelProperty(value = "文件已被其他用户时，锁定者用户名")
  
    public String getLockeraccount() {
    return lockeraccount;
  }

  public void setLockeraccount(String lockeraccount) {
    this.lockeraccount = lockeraccount;
  }

  public AutolockTrylockRes lockername(String lockername) {
    this.lockername = lockername;
    return this;
  }

  /**
   * 文件已被其他用户时，锁定者显示名
   * @return lockername
  **/
  @ApiModelProperty(value = "文件已被其他用户时，锁定者显示名")
  
    public String getLockername() {
    return lockername;
  }

  public void setLockername(String lockername) {
    this.lockername = lockername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockTrylockRes autolockTrylockRes = (AutolockTrylockRes) o;
    return Objects.equals(this.issucceed, autolockTrylockRes.issucceed) &&
        Objects.equals(this.lockerid, autolockTrylockRes.lockerid) &&
        Objects.equals(this.lockeraccount, autolockTrylockRes.lockeraccount) &&
        Objects.equals(this.lockername, autolockTrylockRes.lockername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issucceed, lockerid, lockeraccount, lockername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockTrylockRes {\n");
    
    sb.append("    issucceed: ").append(toIndentedString(issucceed)).append("\n");
    sb.append("    lockerid: ").append(toIndentedString(lockerid)).append("\n");
    sb.append("    lockeraccount: ").append(toIndentedString(lockeraccount)).append("\n");
    sb.append("    lockername: ").append(toIndentedString(lockername)).append("\n");
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
