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
 * FileGetsuggestnameReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileGetsuggestnameReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  public FileGetsuggestnameReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 父目录的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "父目录的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileGetsuggestnameReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UTF-8编码，要上传的文件名
   * @return name
  **/
  @ApiModelProperty(required = true, value = "UTF-8编码，要上传的文件名")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGetsuggestnameReq fileGetsuggestnameReq = (FileGetsuggestnameReq) o;
    return Objects.equals(this.docid, fileGetsuggestnameReq.docid) &&
        Objects.equals(this.name, fileGetsuggestnameReq.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGetsuggestnameReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
