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
 * 如果接口调用返回的http状态码为非200系列，则表示发生异常，会返回错误码信息，具体参见错误码说明章节
 */
@ApiModel(description = "如果接口调用返回的http状态码为非200系列，则表示发生异常，会返回错误码信息，具体参见错误码说明章节")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Error   {
  @JsonProperty("errcode")
  private Long errcode = null;

  @JsonProperty("errmsg")
  private String errmsg = null;

  @JsonProperty("causemsg")
  private String causemsg = null;

  public Error errcode(Long errcode) {
    this.errcode = errcode;
    return this;
  }

  /**
   * 错误码
   * @return errcode
  **/
  @ApiModelProperty(required = true, value = "错误码")
      @NotNull

    public Long getErrcode() {
    return errcode;
  }

  public void setErrcode(Long errcode) {
    this.errcode = errcode;
  }

  public Error errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

  /**
   * 错误描述，与错误码对应
   * @return errmsg
  **/
  @ApiModelProperty(required = true, value = "错误描述，与错误码对应")
      @NotNull

    public String getErrmsg() {
    return errmsg;
  }

  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public Error causemsg(String causemsg) {
    this.causemsg = causemsg;
    return this;
  }

  /**
   * 错误原因，底层错误信息，仅用于研发排错，客户端不应使用此字段内容
   * @return causemsg
  **/
  @ApiModelProperty(required = true, value = "错误原因，底层错误信息，仅用于研发排错，客户端不应使用此字段内容")
      @NotNull

    public String getCausemsg() {
    return causemsg;
  }

  public void setCausemsg(String causemsg) {
    this.causemsg = causemsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errcode, error.errcode) &&
        Objects.equals(this.errmsg, error.errmsg) &&
        Objects.equals(this.causemsg, error.causemsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, causemsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    causemsg: ").append(toIndentedString(causemsg)).append("\n");
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
