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
 * FileSetappmetadataReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileSetappmetadataReq   {
  @JsonProperty("appid")
  private String appid = null;

  @JsonProperty("appmetadata")
  @Valid
  private Map<String, String> appmetadata = new HashMap<String, String>();

  @JsonProperty("docid")
  private String docid = null;

  public FileSetappmetadataReq appid(String appid) {
    this.appid = appid;
    return this;
  }

  /**
   * 应用 id，由控制台配置后分配
   * @return appid
  **/
  @ApiModelProperty(required = true, value = "应用 id，由控制台配置后分配")
      @NotNull

    public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public FileSetappmetadataReq appmetadata(Map<String, String> appmetadata) {
    this.appmetadata = appmetadata;
    return this;
  }

  public FileSetappmetadataReq putAppmetadataItem(String key, String appmetadataItem) {
    this.appmetadata.put(key, appmetadataItem);
    return this;
  }

  /**
   * - json 格式的应用元数据集合，key-value string 的形式 - appmetadata 中只允许 key-value string，对于 value 为 integer、boolen、array 等情况，要求把值转为 string。非 key-value string 的值会被忽略
   * @return appmetadata
  **/
  @ApiModelProperty(required = true, value = "- json 格式的应用元数据集合，key-value string 的形式 - appmetadata 中只允许 key-value string，对于 value 为 integer、boolen、array 等情况，要求把值转为 string。非 key-value string 的值会被忽略")
      @NotNull

    public Map<String, String> getAppmetadata() {
    return appmetadata;
  }

  public void setAppmetadata(Map<String, String> appmetadata) {
    this.appmetadata = appmetadata;
  }

  public FileSetappmetadataReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径（列举协议返回）
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件gns路径（列举协议返回）")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSetappmetadataReq fileSetappmetadataReq = (FileSetappmetadataReq) o;
    return Objects.equals(this.appid, fileSetappmetadataReq.appid) &&
        Objects.equals(this.appmetadata, fileSetappmetadataReq.appmetadata) &&
        Objects.equals(this.docid, fileSetappmetadataReq.docid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, appmetadata, docid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSetappmetadataReq {\n");
    
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    appmetadata: ").append(toIndentedString(appmetadata)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
