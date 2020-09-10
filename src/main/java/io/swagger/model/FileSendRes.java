package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FileSendResResult;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileSendRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileSendRes   {
  @JsonProperty("result")
  @Valid
  private List<FileSendResResult> result = new ArrayList<FileSendResResult>();

  public FileSendRes result(List<FileSendResResult> result) {
    this.result = result;
    return this;
  }

  public FileSendRes addResultItem(FileSendResResult resultItem) {
    this.result.add(resultItem);
    return this;
  }

  /**
   * 表示多条发送文件的返回信息
   * @return result
  **/
  @ApiModelProperty(required = true, value = "表示多条发送文件的返回信息")
      @NotNull
    @Valid
    public List<FileSendResResult> getResult() {
    return result;
  }

  public void setResult(List<FileSendResResult> result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSendRes fileSendRes = (FileSendRes) o;
    return Objects.equals(this.result, fileSendRes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSendRes {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
