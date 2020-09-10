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
 * AutolockGetlockedfileinfosResDocinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockGetlockedfileinfosResDocinfo   {
  @JsonProperty("locktime")
  private Long locktime = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("lockeraccount")
  private String lockeraccount = null;

  @JsonProperty("lockerid")
  private String lockerid = null;

  @JsonProperty("lockername")
  private String lockername = null;

  @JsonProperty("path")
  private String path = null;

  public AutolockGetlockedfileinfosResDocinfo locktime(Long locktime) {
    this.locktime = locktime;
    return this;
  }

  /**
   * 文件锁创建时间（微秒时间戳）
   * @return locktime
  **/
  @ApiModelProperty(required = true, value = "文件锁创建时间（微秒时间戳）")
      @NotNull

    public Long getLocktime() {
    return locktime;
  }

  public void setLocktime(Long locktime) {
    this.locktime = locktime;
  }

  public AutolockGetlockedfileinfosResDocinfo docid(String docid) {
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

  public AutolockGetlockedfileinfosResDocinfo lockeraccount(String lockeraccount) {
    this.lockeraccount = lockeraccount;
    return this;
  }

  /**
   * 锁定者用户名
   * @return lockeraccount
  **/
  @ApiModelProperty(required = true, value = "锁定者用户名")
      @NotNull

    public String getLockeraccount() {
    return lockeraccount;
  }

  public void setLockeraccount(String lockeraccount) {
    this.lockeraccount = lockeraccount;
  }

  public AutolockGetlockedfileinfosResDocinfo lockerid(String lockerid) {
    this.lockerid = lockerid;
    return this;
  }

  /**
   * 锁定者id
   * @return lockerid
  **/
  @ApiModelProperty(required = true, value = "锁定者id")
      @NotNull

    public String getLockerid() {
    return lockerid;
  }

  public void setLockerid(String lockerid) {
    this.lockerid = lockerid;
  }

  public AutolockGetlockedfileinfosResDocinfo lockername(String lockername) {
    this.lockername = lockername;
    return this;
  }

  /**
   * 锁定者显示名
   * @return lockername
  **/
  @ApiModelProperty(required = true, value = "锁定者显示名")
      @NotNull

    public String getLockername() {
    return lockername;
  }

  public void setLockername(String lockername) {
    this.lockername = lockername;
  }

  public AutolockGetlockedfileinfosResDocinfo path(String path) {
    this.path = path;
    return this;
  }

  /**
   * 文件路径
   * @return path
  **/
  @ApiModelProperty(required = true, value = "文件路径")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockGetlockedfileinfosResDocinfo autolockGetlockedfileinfosResDocinfo = (AutolockGetlockedfileinfosResDocinfo) o;
    return Objects.equals(this.locktime, autolockGetlockedfileinfosResDocinfo.locktime) &&
        Objects.equals(this.docid, autolockGetlockedfileinfosResDocinfo.docid) &&
        Objects.equals(this.lockeraccount, autolockGetlockedfileinfosResDocinfo.lockeraccount) &&
        Objects.equals(this.lockerid, autolockGetlockedfileinfosResDocinfo.lockerid) &&
        Objects.equals(this.lockername, autolockGetlockedfileinfosResDocinfo.lockername) &&
        Objects.equals(this.path, autolockGetlockedfileinfosResDocinfo.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, docid, lockeraccount, lockerid, lockername, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockGetlockedfileinfosResDocinfo {\n");
    
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    lockeraccount: ").append(toIndentedString(lockeraccount)).append("\n");
    sb.append("    lockerid: ").append(toIndentedString(lockerid)).append("\n");
    sb.append("    lockername: ").append(toIndentedString(lockername)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
