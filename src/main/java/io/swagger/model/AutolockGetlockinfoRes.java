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
 * AutolockGetlockinfoRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockGetlockinfoRes   {
  @JsonProperty("lockerid")
  private String lockerid = null;

  @JsonProperty("lockeraccount")
  private String lockeraccount = null;

  @JsonProperty("lockername")
  private String lockername = null;

  @JsonProperty("islocked")
  private Boolean islocked = null;

  public AutolockGetlockinfoRes lockerid(String lockerid) {
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

  public AutolockGetlockinfoRes lockeraccount(String lockeraccount) {
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

  public AutolockGetlockinfoRes lockername(String lockername) {
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

  public AutolockGetlockinfoRes islocked(Boolean islocked) {
    this.islocked = islocked;
    return this;
  }

  /**
   * 文件锁定则返回true，文件未锁定则返回false
   * @return islocked
  **/
  @ApiModelProperty(required = true, value = "文件锁定则返回true，文件未锁定则返回false")
      @NotNull

    public Boolean isIslocked() {
    return islocked;
  }

  public void setIslocked(Boolean islocked) {
    this.islocked = islocked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockGetlockinfoRes autolockGetlockinfoRes = (AutolockGetlockinfoRes) o;
    return Objects.equals(this.lockerid, autolockGetlockinfoRes.lockerid) &&
        Objects.equals(this.lockeraccount, autolockGetlockinfoRes.lockeraccount) &&
        Objects.equals(this.lockername, autolockGetlockinfoRes.lockername) &&
        Objects.equals(this.islocked, autolockGetlockinfoRes.islocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockerid, lockeraccount, lockername, islocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockGetlockinfoRes {\n");
    
    sb.append("    lockerid: ").append(toIndentedString(lockerid)).append("\n");
    sb.append("    lockeraccount: ").append(toIndentedString(lockeraccount)).append("\n");
    sb.append("    lockername: ").append(toIndentedString(lockername)).append("\n");
    sb.append("    islocked: ").append(toIndentedString(islocked)).append("\n");
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
