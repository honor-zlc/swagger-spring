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
 * MessageGetResMsgType19
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType19 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("applycsflevel")
  private Long applycsflevel = null;

  public MessageGetResMsgType19 applycsflevel(Long applycsflevel) {
    this.applycsflevel = applycsflevel;
    return this;
  }

  /**
   * 所申请的密级
   * @return applycsflevel
  **/
  @ApiModelProperty(required = true, value = "所申请的密级")
      @NotNull

    public Long getApplycsflevel() {
    return applycsflevel;
  }

  public void setApplycsflevel(Long applycsflevel) {
    this.applycsflevel = applycsflevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType19 messageGetResMsgType19 = (MessageGetResMsgType19) o;
    return Objects.equals(this.applycsflevel, messageGetResMsgType19.applycsflevel) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applycsflevel, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType19 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    applycsflevel: ").append(toIndentedString(applycsflevel)).append("\n");
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
