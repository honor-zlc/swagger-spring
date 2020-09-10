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
 * AutolockGetdirlockinfoRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AutolockGetdirlockinfoRes   {
  @JsonProperty("islocked")
  private Boolean islocked = null;

  public AutolockGetdirlockinfoRes islocked(Boolean islocked) {
    this.islocked = islocked;
    return this;
  }

  /**
   * 文件夹下有锁定文件则返回true，  文件下没有锁定文件则返回false
   * @return islocked
  **/
  @ApiModelProperty(required = true, value = "文件夹下有锁定文件则返回true，  文件下没有锁定文件则返回false")
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
    AutolockGetdirlockinfoRes autolockGetdirlockinfoRes = (AutolockGetdirlockinfoRes) o;
    return Objects.equals(this.islocked, autolockGetdirlockinfoRes.islocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(islocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutolockGetdirlockinfoRes {\n");
    
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
