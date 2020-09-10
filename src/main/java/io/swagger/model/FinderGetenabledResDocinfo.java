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
 * FinderGetenabledResDocinfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FinderGetenabledResDocinfo   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("client_mtim")
  private Long clientMtim = null;

  public FinderGetenabledResDocinfo docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文档id
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "文档id")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FinderGetenabledResDocinfo path(String path) {
    this.path = path;
    return this;
  }

  /**
   * 文档路径
   * @return path
  **/
  @ApiModelProperty(required = true, value = "文档路径")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FinderGetenabledResDocinfo size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 文件大小，文件夹则为-1
   * @return size
  **/
  @ApiModelProperty(required = true, value = "文件大小，文件夹则为-1")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FinderGetenabledResDocinfo clientMtim(Long clientMtim) {
    this.clientMtim = clientMtim;
    return this;
  }

  /**
   * 如果是文件，返回由客户端设置的文件本地修改时间；若未设置，返回modified的值
   * @return clientMtim
  **/
  @ApiModelProperty(required = true, value = "如果是文件，返回由客户端设置的文件本地修改时间；若未设置，返回modified的值")
      @NotNull

    public Long getClientMtim() {
    return clientMtim;
  }

  public void setClientMtim(Long clientMtim) {
    this.clientMtim = clientMtim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinderGetenabledResDocinfo finderGetenabledResDocinfo = (FinderGetenabledResDocinfo) o;
    return Objects.equals(this.docid, finderGetenabledResDocinfo.docid) &&
        Objects.equals(this.path, finderGetenabledResDocinfo.path) &&
        Objects.equals(this.size, finderGetenabledResDocinfo.size) &&
        Objects.equals(this.clientMtim, finderGetenabledResDocinfo.clientMtim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, path, size, clientMtim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinderGetenabledResDocinfo {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    clientMtim: ").append(toIndentedString(clientMtim)).append("\n");
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
