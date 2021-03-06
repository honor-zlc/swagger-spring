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
 * RecycleRestoreRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class RecycleRestoreRes   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  public RecycleRestoreRes docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 还原后文件/目录的gns路径，如果父目录为新创建的，返回docid可能与传入的不同
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "还原后文件/目录的gns路径，如果父目录为新创建的，返回docid可能与传入的不同")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public RecycleRestoreRes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 当ondup为2（自动重名）时才返回
   * @return name
  **/
  @ApiModelProperty(value = "当ondup为2（自动重名）时才返回")
  
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
    RecycleRestoreRes recycleRestoreRes = (RecycleRestoreRes) o;
    return Objects.equals(this.docid, recycleRestoreRes.docid) &&
        Objects.equals(this.name, recycleRestoreRes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleRestoreRes {\n");
    
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
