package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AutolockRefreshReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockRefreshReq   {
  @JsonProperty("lockinfos")
  @Valid
  private List<String> lockinfos = new ArrayList<String>();

  public AutolockRefreshReq lockinfos(List<String> lockinfos) {
    this.lockinfos = lockinfos;
    return this;
  }

  public AutolockRefreshReq addLockinfosItem(String lockinfosItem) {
    this.lockinfos.add(lockinfosItem);
    return this;
  }

  /**
   * 待刷新的文件锁信息
   * @return lockinfos
  **/
  @ApiModelProperty(required = true, value = "待刷新的文件锁信息")
      @NotNull

    public List<String> getLockinfos() {
    return lockinfos;
  }

  public void setLockinfos(List<String> lockinfos) {
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
    AutolockRefreshReq autolockRefreshReq = (AutolockRefreshReq) o;
    return Objects.equals(this.lockinfos, autolockRefreshReq.lockinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockRefreshReq {\n");
    
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
