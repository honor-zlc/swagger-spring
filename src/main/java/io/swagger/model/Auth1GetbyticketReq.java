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
 * Auth1GetbyticketReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetbyticketReq   {
  @JsonProperty("ticket")
  private String ticket = null;

  @JsonProperty("service")
  private String service = null;

  public Auth1GetbyticketReq ticket(String ticket) {
    this.ticket = ticket;
    return this;
  }

  /**
   * auth服务器返回的ticket票据，用来向token服务器请求token
   * @return ticket
  **/
  @ApiModelProperty(required = true, value = "auth服务器返回的ticket票据，用来向token服务器请求token")
      @NotNull

    public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  public Auth1GetbyticketReq service(String service) {
    this.service = service;
    return this;
  }

  /**
   * 请求ticket时的service名称
   * @return service
  **/
  @ApiModelProperty(required = true, value = "请求ticket时的service名称")
      @NotNull

    public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetbyticketReq auth1GetbyticketReq = (Auth1GetbyticketReq) o;
    return Objects.equals(this.ticket, auth1GetbyticketReq.ticket) &&
        Objects.equals(this.service, auth1GetbyticketReq.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticket, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetbyticketReq {\n");
    
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
