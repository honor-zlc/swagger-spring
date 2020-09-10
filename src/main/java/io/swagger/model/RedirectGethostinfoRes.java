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
 * RedirectGethostinfoRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class RedirectGethostinfoRes   {
  @JsonProperty("host")
  private String host = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("port")
  private Long port = null;

  @JsonProperty("https_port")
  private Long httpsPort = null;

  public RedirectGethostinfoRes host(String host) {
    this.host = host;
    return this;
  }

  /**
   * 系统对外的域名或ip
   * @return host
  **/
  @ApiModelProperty(required = true, value = "系统对外的域名或ip")
      @NotNull

    public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public RedirectGethostinfoRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 系统对外的站点名称
   * @return name
  **/
  @ApiModelProperty(required = true, value = "系统对外的站点名称")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RedirectGethostinfoRes port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * http端口：  1. 0918版本之前的客户端使用该端口进行下载客户端  2. 10xx后续的服务器使用该端口来访问视频播放服务
   * @return port
  **/
  @ApiModelProperty(required = true, value = "http端口：  1. 0918版本之前的客户端使用该端口进行下载客户端  2. 10xx后续的服务器使用该端口来访问视频播放服务")
      @NotNull

    public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public RedirectGethostinfoRes httpsPort(Long httpsPort) {
    this.httpsPort = httpsPort;
    return this;
  }

  /**
   * Web client的服务端口，采用https
   * @return httpsPort
  **/
  @ApiModelProperty(required = true, value = "Web client的服务端口，采用https")
      @NotNull

    public Long getHttpsPort() {
    return httpsPort;
  }

  public void setHttpsPort(Long httpsPort) {
    this.httpsPort = httpsPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectGethostinfoRes redirectGethostinfoRes = (RedirectGethostinfoRes) o;
    return Objects.equals(this.host, redirectGethostinfoRes.host) &&
        Objects.equals(this.name, redirectGethostinfoRes.name) &&
        Objects.equals(this.port, redirectGethostinfoRes.port) &&
        Objects.equals(this.httpsPort, redirectGethostinfoRes.httpsPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, name, port, httpsPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectGethostinfoRes {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
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
