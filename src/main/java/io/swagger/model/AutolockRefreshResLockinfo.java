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
 * AutolockRefreshResLockinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockRefreshResLockinfo   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("state")
  private Long state = null;

  @JsonProperty("errmsg")
  private String errmsg = null;

  public AutolockRefreshResLockinfo docid(String docid) {
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

  public AutolockRefreshResLockinfo state(Long state) {
    this.state = state;
    return this;
  }

  /**
   * state等于0时表示刷新成功  state等于1表示发生异常
   * @return state
  **/
  @ApiModelProperty(required = true, value = "state等于0时表示刷新成功  state等于1表示发生异常")
      @NotNull

    public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }

  public AutolockRefreshResLockinfo errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

  /**
   * 异常内容，state等于1时会填充该字段
   * @return errmsg
  **/
  @ApiModelProperty(value = "异常内容，state等于1时会填充该字段")
  
    public String getErrmsg() {
    return errmsg;
  }

  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockRefreshResLockinfo autolockRefreshResLockinfo = (AutolockRefreshResLockinfo) o;
    return Objects.equals(this.docid, autolockRefreshResLockinfo.docid) &&
        Objects.equals(this.state, autolockRefreshResLockinfo.state) &&
        Objects.equals(this.errmsg, autolockRefreshResLockinfo.errmsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, state, errmsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockRefreshResLockinfo {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
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
