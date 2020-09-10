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
 * InvitationSetnoteinfoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class InvitationSetnoteinfoReq   {
  @JsonProperty("docid")
  private String docid = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("description")
  private String description = null;

  public InvitationSetnoteinfoReq docid(String docid) {
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

  public InvitationSetnoteinfoReq image(String image) {
    this.image = image;
    return this;
  }

  /**
   * 邀请链接页面文件/文件夹图标
   * @return image
  **/
  @ApiModelProperty(required = true, value = "邀请链接页面文件/文件夹图标")
      @NotNull

    public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public InvitationSetnoteinfoReq description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 描述
   * @return description
  **/
  @ApiModelProperty(required = true, value = "描述")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationSetnoteinfoReq invitationSetnoteinfoReq = (InvitationSetnoteinfoReq) o;
    return Objects.equals(this.docid, invitationSetnoteinfoReq.docid) &&
        Objects.equals(this.image, invitationSetnoteinfoReq.image) &&
        Objects.equals(this.description, invitationSetnoteinfoReq.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, image, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationSetnoteinfoReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
