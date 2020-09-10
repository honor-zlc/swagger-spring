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
 * MessageGetResMsgType28
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType28 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("duedate")
  private Long duedate = null;

  @JsonProperty("remindcontent")
  private String remindcontent = null;

  public MessageGetResMsgType28 duedate(Long duedate) {
    this.duedate = duedate;
    return this;
  }

  /**
   * 到期时间
   * @return duedate
  **/
  @ApiModelProperty(required = true, value = "到期时间")
      @NotNull

    public Long getDuedate() {
    return duedate;
  }

  public void setDuedate(Long duedate) {
    this.duedate = duedate;
  }

  public MessageGetResMsgType28 remindcontent(String remindcontent) {
    this.remindcontent = remindcontent;
    return this;
  }

  /**
   * 消息内容
   * @return remindcontent
  **/
  @ApiModelProperty(required = true, value = "消息内容")
      @NotNull

    public String getRemindcontent() {
    return remindcontent;
  }

  public void setRemindcontent(String remindcontent) {
    this.remindcontent = remindcontent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType28 messageGetResMsgType28 = (MessageGetResMsgType28) o;
    return Objects.equals(this.duedate, messageGetResMsgType28.duedate) &&
        Objects.equals(this.remindcontent, messageGetResMsgType28.remindcontent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duedate, remindcontent, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType28 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    remindcontent: ").append(toIndentedString(remindcontent)).append("\n");
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
