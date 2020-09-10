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
 * FileGetappmetadataReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetappmetadataReq   {
  @JsonProperty("appid")
  private String appid = null;

  @JsonProperty("docid")
  private String docid = null;

  public FileGetappmetadataReq appid(String appid) {
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

  public FileGetappmetadataReq docid(String docid) {
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
    FileGetappmetadataReq fileGetappmetadataReq = (FileGetappmetadataReq) o;
    return Objects.equals(this.appid, fileGetappmetadataReq.appid) &&
        Objects.equals(this.docid, fileGetappmetadataReq.docid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appid, docid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetappmetadataReq {\n");
    
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
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
