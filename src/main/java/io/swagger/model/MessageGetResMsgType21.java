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
 * MessageGetResMsgType21
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgType21 extends MessageGetResMsgBase implements OneOfmessageGetResMsgsItems {
  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("modifier")
  private String modifier = null;

  @JsonProperty("quarantinetype")
  private Long quarantinetype = null;

  @JsonProperty("processtype")
  private Long processtype = null;

  public MessageGetResMsgType21 creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 创建者
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "创建者")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public MessageGetResMsgType21 modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * 修改者
   * @return modifier
  **/
  @ApiModelProperty(required = true, value = "修改者")
      @NotNull

    public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public MessageGetResMsgType21 quarantinetype(Long quarantinetype) {
    this.quarantinetype = quarantinetype;
    return this;
  }

  /**
   * 被隔离类型：1：非法 2：染毒 3：涉黄
   * @return quarantinetype
  **/
  @ApiModelProperty(required = true, value = "被隔离类型：1：非法 2：染毒 3：涉黄")
      @NotNull

    public Long getQuarantinetype() {
    return quarantinetype;
  }

  public void setQuarantinetype(Long quarantinetype) {
    this.quarantinetype = quarantinetype;
  }

  public MessageGetResMsgType21 processtype(Long processtype) {
    this.processtype = processtype;
    return this;
  }

  /**
   * 处理类型：0：隔离 1：修复（还原消息无需使用）
   * @return processtype
  **/
  @ApiModelProperty(required = true, value = "处理类型：0：隔离 1：修复（还原消息无需使用）")
      @NotNull

    public Long getProcesstype() {
    return processtype;
  }

  public void setProcesstype(Long processtype) {
    this.processtype = processtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType21 messageGetResMsgType21 = (MessageGetResMsgType21) o;
    return Objects.equals(this.creator, messageGetResMsgType21.creator) &&
        Objects.equals(this.modifier, messageGetResMsgType21.modifier) &&
        Objects.equals(this.quarantinetype, messageGetResMsgType21.quarantinetype) &&
        Objects.equals(this.processtype, messageGetResMsgType21.processtype) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, modifier, quarantinetype, processtype, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType21 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    quarantinetype: ").append(toIndentedString(quarantinetype)).append("\n");
    sb.append("    processtype: ").append(toIndentedString(processtype)).append("\n");
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
