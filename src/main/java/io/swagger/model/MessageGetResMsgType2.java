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
 * MessageGetResMsgType2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType2 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("allowvalue")
  private Long allowvalue = null;

  @JsonProperty("denyvalue")
  private Long denyvalue = null;

  @JsonProperty("end")
  private Long end = null;

  public MessageGetResMsgType2 allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

  /**
   * 允许的权限值，按bit为存储，参考权限获取
   * @return allowvalue
  **/
  @ApiModelProperty(required = true, value = "允许的权限值，按bit为存储，参考权限获取")
      @NotNull

    public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public MessageGetResMsgType2 denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

  /**
   * 拒绝的权限值，按bit为存储，参考权限获取
   * @return denyvalue
  **/
  @ApiModelProperty(required = true, value = "拒绝的权限值，按bit为存储，参考权限获取")
      @NotNull

    public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }

  public MessageGetResMsgType2 end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * 有效到期时间 (unix utc 精确到微秒)  -1 无限期
   * @return end
  **/
  @ApiModelProperty(required = true, value = "有效到期时间 (unix utc 精确到微秒)  -1 无限期")
      @NotNull

    public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType2 messageGetResMsgType2 = (MessageGetResMsgType2) o;
    return Objects.equals(this.allowvalue, messageGetResMsgType2.allowvalue) &&
        Objects.equals(this.denyvalue, messageGetResMsgType2.denyvalue) &&
        Objects.equals(this.end, messageGetResMsgType2.end) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowvalue, denyvalue, end, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
