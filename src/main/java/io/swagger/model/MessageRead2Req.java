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
 * MessageRead2Req
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageRead2Req   {
  @JsonProperty("msgids")
  @Valid
  private List<String> msgids = new ArrayList<String>();

  public MessageRead2Req msgids(List<String> msgids) {
    this.msgids = msgids;
    return this;
  }

  public MessageRead2Req addMsgidsItem(String msgidsItem) {
    this.msgids.add(msgidsItem);
    return this;
  }

  /**
   * 要标记为已读的消息的id数组，前面get返回的
   * @return msgids
  **/
  @ApiModelProperty(required = true, value = "要标记为已读的消息的id数组，前面get返回的")
      @NotNull

    public List<String> getMsgids() {
    return msgids;
  }

  public void setMsgids(List<String> msgids) {
    this.msgids = msgids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRead2Req messageRead2Req = (MessageRead2Req) o;
    return Objects.equals(this.msgids, messageRead2Req.msgids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRead2Req {\n");
    
    sb.append("    msgids: ").append(toIndentedString(msgids)).append("\n");
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
