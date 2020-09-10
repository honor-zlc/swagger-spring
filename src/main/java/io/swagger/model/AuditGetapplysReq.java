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
 * AuditGetapplysReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetapplysReq   {
  @JsonProperty("type")
  private Long type = null;

  public AuditGetapplysReq type(Long type) {
    this.type = type;
    return this;
  }

  /**
   * 用于标识具体获取哪种申请，默认为0  0 表示获取共享申请和定密申请  1 表示获取共享申请(包括共享、外链、所有者和更改继承申请)  2 表示获取定密申请
   * @return type
  **/
  @ApiModelProperty(value = "用于标识具体获取哪种申请，默认为0  0 表示获取共享申请和定密申请  1 表示获取共享申请(包括共享、外链、所有者和更改继承申请)  2 表示获取定密申请")
  
    public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetapplysReq auditGetapplysReq = (AuditGetapplysReq) o;
    return Objects.equals(this.type, auditGetapplysReq.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetapplysReq {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
