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
 * MessageGetResMsgType9
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType9 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("end")
  private Long end = null;

  @JsonProperty("perm")
  private Long perm = null;

  public MessageGetResMsgType9 end(Long end) {
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

  public MessageGetResMsgType9 perm(Long perm) {
    this.perm = perm;
    return this;
  }

  /**
   * 外链权限，参考外链
   * @return perm
  **/
  @ApiModelProperty(required = true, value = "外链权限，参考外链")
      @NotNull

    public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType9 messageGetResMsgType9 = (MessageGetResMsgType9) o;
    return Objects.equals(this.end, messageGetResMsgType9.end) &&
        Objects.equals(this.perm, messageGetResMsgType9.perm) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, perm, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType9 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
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
