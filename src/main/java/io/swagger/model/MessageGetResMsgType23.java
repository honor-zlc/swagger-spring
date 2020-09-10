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
 * MessageGetResMsgType23
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType23 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("antivirusadmin")
  private String antivirusadmin = null;

  @JsonProperty("antivirusop")
  private Long antivirusop = null;

  public MessageGetResMsgType23 antivirusadmin(String antivirusadmin) {
    this.antivirusadmin = antivirusadmin;
    return this;
  }

  /**
   * 防病毒管理员
   * @return antivirusadmin
  **/
  @ApiModelProperty(required = true, value = "防病毒管理员")
      @NotNull

    public String getAntivirusadmin() {
    return antivirusadmin;
  }

  public void setAntivirusadmin(String antivirusadmin) {
    this.antivirusadmin = antivirusadmin;
  }

  public MessageGetResMsgType23 antivirusop(Long antivirusop) {
    this.antivirusop = antivirusop;
    return this;
  }

  /**
   * 杀毒类型   1 表示隔离  2表示修复
   * @return antivirusop
  **/
  @ApiModelProperty(required = true, value = "杀毒类型   1 表示隔离  2表示修复")
      @NotNull

    public Long getAntivirusop() {
    return antivirusop;
  }

  public void setAntivirusop(Long antivirusop) {
    this.antivirusop = antivirusop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType23 messageGetResMsgType23 = (MessageGetResMsgType23) o;
    return Objects.equals(this.antivirusadmin, messageGetResMsgType23.antivirusadmin) &&
        Objects.equals(this.antivirusop, messageGetResMsgType23.antivirusop) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antivirusadmin, antivirusop, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType23 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    antivirusadmin: ").append(toIndentedString(antivirusadmin)).append("\n");
    sb.append("    antivirusop: ").append(toIndentedString(antivirusop)).append("\n");
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
