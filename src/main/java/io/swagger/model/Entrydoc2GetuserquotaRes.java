package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Entrydoc2GetuserquotaResQuotainfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Entrydoc2GetuserquotaRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Entrydoc2GetuserquotaRes   {
  @JsonProperty("quotainfos")
  @Valid
  private List<Entrydoc2GetuserquotaResQuotainfo> quotainfos = new ArrayList<Entrydoc2GetuserquotaResQuotainfo>();

  public Entrydoc2GetuserquotaRes quotainfos(List<Entrydoc2GetuserquotaResQuotainfo> quotainfos) {
    this.quotainfos = quotainfos;
    return this;
  }

  public Entrydoc2GetuserquotaRes addQuotainfosItem(Entrydoc2GetuserquotaResQuotainfo quotainfosItem) {
    this.quotainfos.add(quotainfosItem);
    return this;
  }

  /**
   * 表示多个配额信息
   * @return quotainfos
  **/
  @ApiModelProperty(required = true, value = "表示多个配额信息")
      @NotNull
    @Valid
    public List<Entrydoc2GetuserquotaResQuotainfo> getQuotainfos() {
    return quotainfos;
  }

  public void setQuotainfos(List<Entrydoc2GetuserquotaResQuotainfo> quotainfos) {
    this.quotainfos = quotainfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetuserquotaRes entrydoc2GetuserquotaRes = (Entrydoc2GetuserquotaRes) o;
    return Objects.equals(this.quotainfos, entrydoc2GetuserquotaRes.quotainfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotainfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetuserquotaRes {\n");
    
    sb.append("    quotainfos: ").append(toIndentedString(quotainfos)).append("\n");
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
