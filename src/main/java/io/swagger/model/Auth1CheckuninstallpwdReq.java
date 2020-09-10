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
 * Auth1CheckuninstallpwdReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1CheckuninstallpwdReq   {
  @JsonProperty("uninstallpwd")
  private String uninstallpwd = null;

  public Auth1CheckuninstallpwdReq uninstallpwd(String uninstallpwd) {
    this.uninstallpwd = uninstallpwd;
    return this;
  }

  /**
   * 卸载口令
   * @return uninstallpwd
  **/
  @ApiModelProperty(required = true, value = "卸载口令")
      @NotNull

    public String getUninstallpwd() {
    return uninstallpwd;
  }

  public void setUninstallpwd(String uninstallpwd) {
    this.uninstallpwd = uninstallpwd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1CheckuninstallpwdReq auth1CheckuninstallpwdReq = (Auth1CheckuninstallpwdReq) o;
    return Objects.equals(this.uninstallpwd, auth1CheckuninstallpwdReq.uninstallpwd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uninstallpwd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1CheckuninstallpwdReq {\n");
    
    sb.append("    uninstallpwd: ").append(toIndentedString(uninstallpwd)).append("\n");
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
