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
 * 描述CA信息，如果服务器未设置过CA信息，该字段不会出现
 */
@ApiModel(description = "描述CA信息，如果服务器未设置过CA信息，该字段不会出现")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class CaGetResCainfo   {
  @JsonProperty("vender")
  private String vender = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("server")
  private String server = null;

  @JsonProperty("appid")
  private String appid = null;

  @JsonProperty("appkey")
  private String appkey = null;

  public CaGetResCainfo vender(String vender) {
    this.vender = vender;
    return this;
  }

  /**
   * 厂商ID
   * @return vender
  **/
  @ApiModelProperty(value = "厂商ID")
  
    public String getVender() {
    return vender;
  }

  public void setVender(String vender) {
    this.vender = vender;
  }

  public CaGetResCainfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 厂商描述
   * @return description
  **/
  @ApiModelProperty(value = "厂商描述")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CaGetResCainfo server(String server) {
    this.server = server;
    return this;
  }

  /**
   * CA服务器信息
   * @return server
  **/
  @ApiModelProperty(value = "CA服务器信息")
  
    public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public CaGetResCainfo appid(String appid) {
    this.appid = appid;
    return this;
  }

  /**
   * CA服务器分配的appid
   * @return appid
  **/
  @ApiModelProperty(value = "CA服务器分配的appid")
  
    public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public CaGetResCainfo appkey(String appkey) {
    this.appkey = appkey;
    return this;
  }

  /**
   * CA服务器分配的appkey
   * @return appkey
  **/
  @ApiModelProperty(value = "CA服务器分配的appkey")
  
    public String getAppkey() {
    return appkey;
  }

  public void setAppkey(String appkey) {
    this.appkey = appkey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaGetResCainfo caGetResCainfo = (CaGetResCainfo) o;
    return Objects.equals(this.vender, caGetResCainfo.vender) &&
        Objects.equals(this.description, caGetResCainfo.description) &&
        Objects.equals(this.server, caGetResCainfo.server) &&
        Objects.equals(this.appid, caGetResCainfo.appid) &&
        Objects.equals(this.appkey, caGetResCainfo.appkey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vender, description, server, appid, appkey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaGetResCainfo {\n");
    
    sb.append("    vender: ").append(toIndentedString(vender)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    appkey: ").append(toIndentedString(appkey)).append("\n");
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
