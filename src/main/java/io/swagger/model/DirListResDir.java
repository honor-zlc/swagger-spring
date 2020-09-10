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
 * DirListResDir
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class DirListResDir   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rev")
  private String rev = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("client_mtime")
  private Long clientMtime = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("attr")
  private Long attr = null;

  public DirListResDir docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 目录中文件/目录的gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "目录中文件/目录的gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirListResDir name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 目录中文件/目录的名称，UTF8编码
   * @return name
  **/
  @ApiModelProperty(required = true, value = "目录中文件/目录的名称，UTF8编码")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DirListResDir rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * 目录中文件版本号或目录数据变化标识
   * @return rev
  **/
  @ApiModelProperty(required = true, value = "目录中文件版本号或目录数据变化标识")
      @NotNull

    public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public DirListResDir size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 目录中文件的大小，目录大小为-1
   * @return size
  **/
  @ApiModelProperty(required = true, value = "目录中文件的大小，目录大小为-1")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DirListResDir createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * 目录/文件创建的服务端时间
   * @return createTime
  **/
  @ApiModelProperty(required = true, value = "目录/文件创建的服务端时间")
      @NotNull

    public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public DirListResDir creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 目录/文件创建者
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "目录/文件创建者")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public DirListResDir modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间")
      @NotNull

    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public DirListResDir editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 目录修改者/文件编辑者
   * @return editor
  **/
  @ApiModelProperty(required = true, value = "目录修改者/文件编辑者")
      @NotNull

    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public DirListResDir clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

  /**
   * 如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  
   * @return clientMtime
  **/
  @ApiModelProperty(value = "如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  ")
  
    public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public DirListResDir csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级  
   * @return csflevel
  **/
  @ApiModelProperty(required = true, value = "文件密级  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级  ")
      @NotNull

    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public DirListResDir attr(Long attr) {
    this.attr = attr;
    return this;
  }

  /**
   * 总共32位，右下角表示最低位，左上角表示最高位，如：    0<sub>32</sub>000,0000,0000,0000<sub>17</sub>    0<sub>16</sub>000,0000,0000,0000<sub>1</sub>  - 1：只读（用户针对访问对象是否是只读属性）  - 2：锁定（表示访问对象是否被锁定）  - 3：允许显示  - 4：拒绝显示  - 5：允许预览  - 6：拒绝预览  - 7：允许下载  - 8：拒绝下载  - 9：允许新建  - 10：拒绝新建  - 11：允许修改  - 12：拒绝修改  - 13：允许删除  - 14：拒绝删除  - 15：允许复制  - 16：拒绝复制     第25位到28位表示该用户的密级    可能为以下值：    0101(5)~1111(15)    attr中带上用户的密级是方便客户端探测到用户的密级变化，从而探测到新的文件（因为密级变大或者变小，看到的文件会变多或变少）  
   * @return attr
  **/
  @ApiModelProperty(value = "总共32位，右下角表示最低位，左上角表示最高位，如：    0<sub>32</sub>000,0000,0000,0000<sub>17</sub>    0<sub>16</sub>000,0000,0000,0000<sub>1</sub>  - 1：只读（用户针对访问对象是否是只读属性）  - 2：锁定（表示访问对象是否被锁定）  - 3：允许显示  - 4：拒绝显示  - 5：允许预览  - 6：拒绝预览  - 7：允许下载  - 8：拒绝下载  - 9：允许新建  - 10：拒绝新建  - 11：允许修改  - 12：拒绝修改  - 13：允许删除  - 14：拒绝删除  - 15：允许复制  - 16：拒绝复制     第25位到28位表示该用户的密级    可能为以下值：    0101(5)~1111(15)    attr中带上用户的密级是方便客户端探测到用户的密级变化，从而探测到新的文件（因为密级变大或者变小，看到的文件会变多或变少）  ")
  
    public Long getAttr() {
    return attr;
  }

  public void setAttr(Long attr) {
    this.attr = attr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirListResDir dirListResDir = (DirListResDir) o;
    return Objects.equals(this.docid, dirListResDir.docid) &&
        Objects.equals(this.name, dirListResDir.name) &&
        Objects.equals(this.rev, dirListResDir.rev) &&
        Objects.equals(this.size, dirListResDir.size) &&
        Objects.equals(this.createTime, dirListResDir.createTime) &&
        Objects.equals(this.creator, dirListResDir.creator) &&
        Objects.equals(this.modified, dirListResDir.modified) &&
        Objects.equals(this.editor, dirListResDir.editor) &&
        Objects.equals(this.clientMtime, dirListResDir.clientMtime) &&
        Objects.equals(this.csflevel, dirListResDir.csflevel) &&
        Objects.equals(this.attr, dirListResDir.attr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, rev, size, createTime, creator, modified, editor, clientMtime, csflevel, attr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirListResDir {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
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
