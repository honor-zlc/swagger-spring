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
 * 本地同步策略
 */
@ApiModel(description = "本地同步策略")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ConfigGetResLocalsync   {
  @JsonProperty("openstatus")
  private Boolean openstatus = null;

  @JsonProperty("deletestatus")
  private Boolean deletestatus = null;

  public ConfigGetResLocalsync openstatus(Boolean openstatus) {
    this.openstatus = openstatus;
    return this;
  }

  /**
   * 是否开启本地同步配置
   * @return openstatus
  **/
  @ApiModelProperty(required = true, value = "是否开启本地同步配置")
      @NotNull

    public Boolean isOpenstatus() {
    return openstatus;
  }

  public void setOpenstatus(Boolean openstatus) {
    this.openstatus = openstatus;
  }

  public ConfigGetResLocalsync deletestatus(Boolean deletestatus) {
    this.deletestatus = deletestatus;
    return this;
  }

  /**
   * 是否允许删除配置的同步任务
   * @return deletestatus
  **/
  @ApiModelProperty(required = true, value = "是否允许删除配置的同步任务")
      @NotNull

    public Boolean isDeletestatus() {
    return deletestatus;
  }

  public void setDeletestatus(Boolean deletestatus) {
    this.deletestatus = deletestatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigGetResLocalsync configGetResLocalsync = (ConfigGetResLocalsync) o;
    return Objects.equals(this.openstatus, configGetResLocalsync.openstatus) &&
        Objects.equals(this.deletestatus, configGetResLocalsync.deletestatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openstatus, deletestatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGetResLocalsync {\n");
    
    sb.append("    openstatus: ").append(toIndentedString(openstatus)).append("\n");
    sb.append("    deletestatus: ").append(toIndentedString(deletestatus)).append("\n");
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
