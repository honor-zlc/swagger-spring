package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AutolockRefreshResLockinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AutolockRefreshRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockRefreshRes   {
  @JsonProperty("lockinfos")
  @Valid
  private List<AutolockRefreshResLockinfo> lockinfos = new ArrayList<AutolockRefreshResLockinfo>();

  public AutolockRefreshRes lockinfos(List<AutolockRefreshResLockinfo> lockinfos) {
    this.lockinfos = lockinfos;
    return this;
  }

  public AutolockRefreshRes addLockinfosItem(AutolockRefreshResLockinfo lockinfosItem) {
    this.lockinfos.add(lockinfosItem);
    return this;
  }

  /**
   * 文件锁刷新后的状态
   * @return lockinfos
  **/
  @ApiModelProperty(required = true, value = "文件锁刷新后的状态")
      @NotNull
    @Valid
    public List<AutolockRefreshResLockinfo> getLockinfos() {
    return lockinfos;
  }

  public void setLockinfos(List<AutolockRefreshResLockinfo> lockinfos) {
    this.lockinfos = lockinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockRefreshRes autolockRefreshRes = (AutolockRefreshRes) o;
    return Objects.equals(this.lockinfos, autolockRefreshRes.lockinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockRefreshRes {\n");
    
    sb.append("    lockinfos: ").append(toIndentedString(lockinfos)).append("\n");
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
