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
 * QuarantineListResItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class QuarantineListResItem   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentpath")
  private String parentpath = null;

  @JsonProperty("appealexpiredtime")
  private Long appealexpiredtime = null;

  @JsonProperty("status")
  private Long status = null;

  public QuarantineListResItem docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件位于隔离区的docid
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文件位于隔离区的docid")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public QuarantineListResItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 文件被隔离时最新名字
   * @return name
  **/
  @ApiModelProperty(required = true, value = "文件被隔离时最新名字")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QuarantineListResItem parentpath(String parentpath) {
    this.parentpath = parentpath;
    return this;
  }

  /**
   * 文件被隔离时所在路径
   * @return parentpath
  **/
  @ApiModelProperty(required = true, value = "文件被隔离时所在路径")
      @NotNull

    public String getParentpath() {
    return parentpath;
  }

  public void setParentpath(String parentpath) {
    this.parentpath = parentpath;
  }

  public QuarantineListResItem appealexpiredtime(Long appealexpiredtime) {
    this.appealexpiredtime = appealexpiredtime;
    return this;
  }

  /**
   * 文件申诉保护到期日（UNIX时间戳）
   * @return appealexpiredtime
  **/
  @ApiModelProperty(required = true, value = "文件申诉保护到期日（UNIX时间戳）")
      @NotNull

    public Long getAppealexpiredtime() {
    return appealexpiredtime;
  }

  public void setAppealexpiredtime(Long appealexpiredtime) {
    this.appealexpiredtime = appealexpiredtime;
  }

  public QuarantineListResItem status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * 文件状态：  - 1 未申诉  - 2 已申诉  - 3 已否决  
   * @return status
  **/
  @ApiModelProperty(required = true, value = "文件状态：  - 1 未申诉  - 2 已申诉  - 3 已否决  ")
      @NotNull

    public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantineListResItem quarantineListResItem = (QuarantineListResItem) o;
    return Objects.equals(this.docid, quarantineListResItem.docid) &&
        Objects.equals(this.name, quarantineListResItem.name) &&
        Objects.equals(this.parentpath, quarantineListResItem.parentpath) &&
        Objects.equals(this.appealexpiredtime, quarantineListResItem.appealexpiredtime) &&
        Objects.equals(this.status, quarantineListResItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, parentpath, appealexpiredtime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantineListResItem {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentpath: ").append(toIndentedString(parentpath)).append("\n");
    sb.append("    appealexpiredtime: ").append(toIndentedString(appealexpiredtime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
