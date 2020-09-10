package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MessageGetResMsgBase;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageGetResMsgType31
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType31 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("inherit")
  private Boolean inherit = null;

  public MessageGetResMsgType31 inherit(Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

  /**
   * 是否使用继承 true表示启用继承 false表示禁用继承
   * @return inherit
  **/
  @ApiModelProperty(required = true, value = "是否使用继承 true表示启用继承 false表示禁用继承")
      @NotNull

    public Boolean isInherit() {
    return inherit;
  }

  public void setInherit(Boolean inherit) {
    this.inherit = inherit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType31 messageGetResMsgType31 = (MessageGetResMsgType31) o;
    return Objects.equals(this.inherit, messageGetResMsgType31.inherit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType31 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
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
