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
 * FileOsuploadpartRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileOsuploadpartRes   {
  @JsonProperty("authrequests")
  @Valid
  private Map<String, List<String>> authrequests = new HashMap<String, List<String>>();

  public FileOsuploadpartRes authrequests(Map<String, List<String>> authrequests) {
    this.authrequests = authrequests;
    return this;
  }

  public FileOsuploadpartRes putAuthrequestsItem(String key, List<String> authrequestsItem) {
    this.authrequests.put(key, authrequestsItem);
    return this;
  }

  /**
   * 分块上传信息map，键为数据块号，值为上传信息authrequest - authrequest[0]：请求方法 - authrequest[1]: 待上传的资源URL - authrequest[2]及以后项：请求头，格式为“key: value”
   * @return authrequests
  **/
  @ApiModelProperty(required = true, value = "分块上传信息map，键为数据块号，值为上传信息authrequest - authrequest[0]：请求方法 - authrequest[1]: 待上传的资源URL - authrequest[2]及以后项：请求头，格式为“key: value”")
      @NotNull
    @Valid
    public Map<String, List<String>> getAuthrequests() {
    return authrequests;
  }

  public void setAuthrequests(Map<String, List<String>> authrequests) {
    this.authrequests = authrequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsuploadpartRes fileOsuploadpartRes = (FileOsuploadpartRes) o;
    return Objects.equals(this.authrequests, fileOsuploadpartRes.authrequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authrequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsuploadpartRes {\n");
    
    sb.append("    authrequests: ").append(toIndentedString(authrequests)).append("\n");
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
