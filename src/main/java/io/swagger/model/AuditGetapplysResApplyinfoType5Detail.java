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
 * 具体的申请信息，根据apptype，所包含的字段不同
 */
@ApiModel(description = "具体的申请信息，根据apptype，所包含的字段不同")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class AuditGetapplysResApplyinfoType5Detail   {
  @JsonProperty("applycsflevel")
  private Long applycsflevel = null;

  @JsonProperty("doccsflevel")
  private Long doccsflevel = null;

  @JsonProperty("usercsflevel")
  private Long usercsflevel = null;

  public AuditGetapplysResApplyinfoType5Detail applycsflevel(Long applycsflevel) {
    this.applycsflevel = applycsflevel;
    return this;
  }

  /**
   * 所要申请的密级大小
   * @return applycsflevel
  **/
  @ApiModelProperty(required = true, value = "所要申请的密级大小")
      @NotNull

    public Long getApplycsflevel() {
    return applycsflevel;
  }

  public void setApplycsflevel(Long applycsflevel) {
    this.applycsflevel = applycsflevel;
  }

  public AuditGetapplysResApplyinfoType5Detail doccsflevel(Long doccsflevel) {
    this.doccsflevel = doccsflevel;
    return this;
  }

  /**
   * 文档密级，文件夹为子对象中的最大密级
   * @return doccsflevel
  **/
  @ApiModelProperty(required = true, value = "文档密级，文件夹为子对象中的最大密级")
      @NotNull

    public Long getDoccsflevel() {
    return doccsflevel;
  }

  public void setDoccsflevel(Long doccsflevel) {
    this.doccsflevel = doccsflevel;
  }

  public AuditGetapplysResApplyinfoType5Detail usercsflevel(Long usercsflevel) {
    this.usercsflevel = usercsflevel;
    return this;
  }

  /**
   * 申请时用户密级
   * @return usercsflevel
  **/
  @ApiModelProperty(required = true, value = "申请时用户密级")
      @NotNull

    public Long getUsercsflevel() {
    return usercsflevel;
  }

  public void setUsercsflevel(Long usercsflevel) {
    this.usercsflevel = usercsflevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetapplysResApplyinfoType5Detail auditGetapplysResApplyinfoType5Detail = (AuditGetapplysResApplyinfoType5Detail) o;
    return Objects.equals(this.applycsflevel, auditGetapplysResApplyinfoType5Detail.applycsflevel) &&
        Objects.equals(this.doccsflevel, auditGetapplysResApplyinfoType5Detail.doccsflevel) &&
        Objects.equals(this.usercsflevel, auditGetapplysResApplyinfoType5Detail.usercsflevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applycsflevel, doccsflevel, usercsflevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetapplysResApplyinfoType5Detail {\n");
    
    sb.append("    applycsflevel: ").append(toIndentedString(applycsflevel)).append("\n");
    sb.append("    doccsflevel: ").append(toIndentedString(doccsflevel)).append("\n");
    sb.append("    usercsflevel: ").append(toIndentedString(usercsflevel)).append("\n");
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
