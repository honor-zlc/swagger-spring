package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileGetappmetadataResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetappmetadataResItem   {
  @JsonProperty("appid")
  private String appid = null;

  @JsonProperty("appname")
  private String appname = null;

  @JsonProperty("appmetadata")
  @Valid
  private Map<String, String> appmetadata = new HashMap<String, String>();

  public FileGetappmetadataResItem appid(String appid) {
    this.appid = appid;
    return this;
  }

  /**
   * 应用 id
   * @return appid
  **/
  @ApiModelProperty(required = true, value = "应用 id")
      @NotNull

    public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public FileGetappmetadataResItem appname(String appname) {
    this.appname = appname;
    return this;
  }

  /**
   * 应用名
   * @return appname
  **/
  @ApiModelProperty(required = true, value = "应用名")
      @NotNull

    public String getAppname() {
    return appname;
  }

  public void setAppname(String appname) {
    this.appname = appname;
  }

  public FileGetappmetadataResItem appmetadata(Map<String, String> appmetadata) {
    this.appmetadata = appmetadata;
    return this;
  }

  public FileGetappmetadataResItem putAppmetadataItem(String key, String appmetadataItem) {
    this.appmetadata.put(key, appmetadataItem);
    return this;
  }

  /**
   * json 格式的应用元数据集合，key-value string 的形式
   * @return appmetadata
  **/
  @ApiModelProperty(required = true, value = "json 格式的应用元数据集合，key-value string 的形式")
      @NotNull

    public Map<String, String> getAppmetadata() {
    return appmetadata;
  }

  public void setAppmetadata(Map<String, String> appmetadata) {
    this.appmetadata = appmetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGetappmetadataResItem fileGetappmetadataResItem = (FileGetappmetadataResItem) o;
    return Objects.equals(this.appid, fileGetappmetadataResItem.appid) &&
        Objects.equals(this.appname, fileGetappmetadataResItem.appname) &&
        Objects.equals(this.appmetadata, fileGetappmetadataResItem.appmetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, appname, appmetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetappmetadataResItem {\n");
    
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    appname: ").append(toIndentedString(appname)).append("\n");
    sb.append("    appmetadata: ").append(toIndentedString(appmetadata)).append("\n");
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
