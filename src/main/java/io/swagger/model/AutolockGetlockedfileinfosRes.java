package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AutolockGetlockedfileinfosResDocinfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AutolockGetlockedfileinfosRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockGetlockedfileinfosRes   {
  @JsonProperty("docinfos")
  @Valid
  private List<AutolockGetlockedfileinfosResDocinfo> docinfos = new ArrayList<AutolockGetlockedfileinfosResDocinfo>();

  public AutolockGetlockedfileinfosRes docinfos(List<AutolockGetlockedfileinfosResDocinfo> docinfos) {
    this.docinfos = docinfos;
    return this;
  }

  public AutolockGetlockedfileinfosRes addDocinfosItem(AutolockGetlockedfileinfosResDocinfo docinfosItem) {
    this.docinfos.add(docinfosItem);
    return this;
  }

  /**
   * 当前用户所有文件锁信息，包含自己锁定和自己有所有者权限但被他人锁定的。
   * @return docinfos
  **/
  @ApiModelProperty(required = true, value = "当前用户所有文件锁信息，包含自己锁定和自己有所有者权限但被他人锁定的。")
      @NotNull
    @Valid
    public List<AutolockGetlockedfileinfosResDocinfo> getDocinfos() {
    return docinfos;
  }

  public void setDocinfos(List<AutolockGetlockedfileinfosResDocinfo> docinfos) {
    this.docinfos = docinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutolockGetlockedfileinfosRes autolockGetlockedfileinfosRes = (AutolockGetlockedfileinfosRes) o;
    return Objects.equals(this.docinfos, autolockGetlockedfileinfosRes.docinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docinfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockGetlockedfileinfosRes {\n");
    
    sb.append("    docinfos: ").append(toIndentedString(docinfos)).append("\n");
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
