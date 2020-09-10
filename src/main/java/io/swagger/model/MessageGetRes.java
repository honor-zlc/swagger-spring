package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageGetRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetRes   {
  @JsonProperty("stamp")
  private Long stamp = null;

  @JsonProperty("msgs")
  @Valid
  private List<OneOfmessageGetResMsgsItems> msgs = null;

  public MessageGetRes stamp(Long stamp) {
    this.stamp = stamp;
    return this;
  }

  /**
   * 最后接收的通知的时间 (unix utc ns)，可供下次get时使用
   * @return stamp
  **/
  @ApiModelProperty(required = true, value = "最后接收的通知的时间 (unix utc ns)，可供下次get时使用")
      @NotNull

    public Long getStamp() {
    return stamp;
  }

  public void setStamp(Long stamp) {
    this.stamp = stamp;
  }

  public MessageGetRes msgs(List<OneOfmessageGetResMsgsItems> msgs) {
    this.msgs = msgs;
    return this;
  }

  public MessageGetRes addMsgsItem(OneOfmessageGetResMsgsItems msgsItem) {
    if (this.msgs == null) {
      this.msgs = new ArrayList<OneOfmessageGetResMsgsItems>();
    }
    this.msgs.add(msgsItem);
    return this;
  }

  /**
   * 消息结构体
   * @return msgs
  **/
  @ApiModelProperty(value = "消息结构体")
  
    public List<OneOfmessageGetResMsgsItems> getMsgs() {
    return msgs;
  }

  public void setMsgs(List<OneOfmessageGetResMsgsItems> msgs) {
    this.msgs = msgs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetRes messageGetRes = (MessageGetRes) o;
    return Objects.equals(this.stamp, messageGetRes.stamp) &&
        Objects.equals(this.msgs, messageGetRes.msgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stamp, msgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetRes {\n");
    
    sb.append("    stamp: ").append(toIndentedString(stamp)).append("\n");
    sb.append("    msgs: ").append(toIndentedString(msgs)).append("\n");
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
