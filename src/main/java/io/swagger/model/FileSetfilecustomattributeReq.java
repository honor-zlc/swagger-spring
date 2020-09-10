package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FileSetfilecustomattributeReqAttribute;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FileSetfilecustomattributeReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class FileSetfilecustomattributeReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("attribute")
  @Valid
  private List<FileSetfilecustomattributeReqAttribute> attribute = new ArrayList<FileSetfilecustomattributeReqAttribute>();

  public FileSetfilecustomattributeReq docid(String docid) {
    this.docid = docid;
    return this;
  }

  /**
   * 文件gns路径
   * @return docid
  **/
  @ApiModelProperty(value = "文件gns路径")
  
    public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileSetfilecustomattributeReq attribute(List<FileSetfilecustomattributeReqAttribute> attribute) {
    this.attribute = attribute;
    return this;
  }

  public FileSetfilecustomattributeReq addAttributeItem(FileSetfilecustomattributeReqAttribute attributeItem) {
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * 属性值数组
   * @return attribute
  **/
  @ApiModelProperty(required = true, value = "属性值数组")
      @NotNull
    @Valid
    public List<FileSetfilecustomattributeReqAttribute> getAttribute() {
    return attribute;
  }

  public void setAttribute(List<FileSetfilecustomattributeReqAttribute> attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSetfilecustomattributeReq fileSetfilecustomattributeReq = (FileSetfilecustomattributeReq) o;
    return Objects.equals(this.docid, fileSetfilecustomattributeReq.docid) &&
        Objects.equals(this.attribute, fileSetfilecustomattributeReq.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSetfilecustomattributeReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
