package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchSearchResResponseDoc
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class SearchSearchResResponseDoc   {
  @JsonProperty("basename")
  private String basename = null;

  @JsonProperty("csflevel")
  private Long csflevel = null;

  @JsonProperty("modified")
  private Long modified = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("parentpath")
  private String parentpath = null;

  @JsonProperty("ext")
  private String ext = null;

  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("editor")
  private String editor = null;

  @JsonProperty("access")
  private Long access = null;

  @JsonProperty("sharer")
  private String sharer = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("objtype")
  private Long objtype = null;

  public SearchSearchResResponseDoc basename(String basename) {
    this.basename = basename;
    return this;
  }

  /**
   * 文件名（不包括扩展名）
   * @return basename
  **/
  @ApiModelProperty(required = true, value = "文件名（不包括扩展名）")
      @NotNull

    public String getBasename() {
    return basename;
  }

  public void setBasename(String basename) {
    this.basename = basename;
  }

  public SearchSearchResResponseDoc csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

  /**
   * 文件密级
   * @return csflevel
  **/
  @ApiModelProperty(required = true, value = "文件密级")
      @NotNull

    public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public SearchSearchResResponseDoc modified(Long modified) {
    this.modified = modified;
    return this;
  }

  /**
   * 文件修改时间
   * @return modified
  **/
  @ApiModelProperty(value = "文件修改时间")
  
    public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public SearchSearchResResponseDoc size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 文件大小
   * @return size
  **/
  @ApiModelProperty(required = true, value = "文件大小")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public SearchSearchResResponseDoc parentpath(String parentpath) {
    this.parentpath = parentpath;
    return this;
  }

  /**
   * 父目录
   * @return parentpath
  **/
  @ApiModelProperty(required = true, value = "父目录")
      @NotNull

    public String getParentpath() {
    return parentpath;
  }

  public void setParentpath(String parentpath) {
    this.parentpath = parentpath;
  }

  public SearchSearchResResponseDoc ext(String ext) {
    this.ext = ext;
    return this;
  }

  /**
   * 文件扩展名
   * @return ext
  **/
  @ApiModelProperty(value = "文件扩展名")
  
    public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public SearchSearchResResponseDoc docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * gns路径
   * @return docid
  **/
  @ApiModelProperty(required = true, value = "gns路径")
      @NotNull

    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public SearchSearchResResponseDoc editor(String editor) {
    this.editor = editor;
    return this;
  }

  /**
   * 文件创建者
   * @return editor
  **/
  @ApiModelProperty(value = "文件创建者")
  
    public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public SearchSearchResResponseDoc access(Long access) {
    this.access = access;
    return this;
  }

  /**
   * 是否有权限访问，1为有权限，0为无权限
   * @return access
  **/
  @ApiModelProperty(required = true, value = "是否有权限访问，1为有权限，0为无权限")
      @NotNull

    public Long getAccess() {
    return access;
  }

  public void setAccess(Long access) {
    this.access = access;
  }

  public SearchSearchResResponseDoc sharer(String sharer) {
    this.sharer = sharer;
    return this;
  }

  /**
   * 发现者名称：如果有返回且不为空，说明该文档是发现文档
   * @return sharer
  **/
  @ApiModelProperty(value = "发现者名称：如果有返回且不为空，说明该文档是发现文档")
  
    public String getSharer() {
    return sharer;
  }

  public void setSharer(String sharer) {
    this.sharer = sharer;
  }

  public SearchSearchResResponseDoc tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SearchSearchResResponseDoc addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 版本的标签字符串数组
   * @return tags
  **/
  @ApiModelProperty(value = "版本的标签字符串数组")
  
    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SearchSearchResResponseDoc created(String created) {
    this.created = created;
    return this;
  }

  /**
   * 文档创建时间
   * @return created
  **/
  @ApiModelProperty(required = true, value = "文档创建时间")
      @NotNull

    public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public SearchSearchResResponseDoc creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * 文档创建者
   * @return creator
  **/
  @ApiModelProperty(required = true, value = "文档创建者")
      @NotNull

    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public SearchSearchResResponseDoc objtype(Long objtype) {
    this.objtype = objtype;
    return this;
  }

  /**
   * 文档类型，1 为文件 2为目录  注：6.0.4版本后新建的文件索引才有该字段。  未重建索引时，请勿用作判断条件。  
   * @return objtype
  **/
  @ApiModelProperty(value = "文档类型，1 为文件 2为目录  注：6.0.4版本后新建的文件索引才有该字段。  未重建索引时，请勿用作判断条件。  ")
  
    public Long getObjtype() {
    return objtype;
  }

  public void setObjtype(Long objtype) {
    this.objtype = objtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchResResponseDoc searchSearchResResponseDoc = (SearchSearchResResponseDoc) o;
    return Objects.equals(this.basename, searchSearchResResponseDoc.basename) &&
        Objects.equals(this.csflevel, searchSearchResResponseDoc.csflevel) &&
        Objects.equals(this.modified, searchSearchResResponseDoc.modified) &&
        Objects.equals(this.size, searchSearchResResponseDoc.size) &&
        Objects.equals(this.parentpath, searchSearchResResponseDoc.parentpath) &&
        Objects.equals(this.ext, searchSearchResResponseDoc.ext) &&
        Objects.equals(this.docid, searchSearchResResponseDoc.docid) &&
        Objects.equals(this.editor, searchSearchResResponseDoc.editor) &&
        Objects.equals(this.access, searchSearchResResponseDoc.access) &&
        Objects.equals(this.sharer, searchSearchResResponseDoc.sharer) &&
        Objects.equals(this.tags, searchSearchResResponseDoc.tags) &&
        Objects.equals(this.created, searchSearchResResponseDoc.created) &&
        Objects.equals(this.creator, searchSearchResResponseDoc.creator) &&
        Objects.equals(this.objtype, searchSearchResResponseDoc.objtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basename, csflevel, modified, size, parentpath, ext, docid, editor, access, sharer, tags, created, creator, objtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchResResponseDoc {\n");
    
    sb.append("    basename: ").append(toIndentedString(basename)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    parentpath: ").append(toIndentedString(parentpath)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    sharer: ").append(toIndentedString(sharer)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    objtype: ").append(toIndentedString(objtype)).append("\n");
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
