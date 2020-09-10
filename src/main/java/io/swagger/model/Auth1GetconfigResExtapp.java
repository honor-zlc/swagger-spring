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
 * 外部应用配置信息
 */
@ApiModel(description = "外部应用配置信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetconfigResExtapp   {
  @JsonProperty("enable_chaojibiaoge")
  private Boolean enableChaojibiaoge = null;

  public Auth1GetconfigResExtapp enableChaojibiaoge(Boolean enableChaojibiaoge) {
    this.enableChaojibiaoge = enableChaojibiaoge;
    return this;
  }

  /**
   * 是否启用外部应用超级表格，默认为false
   * @return enableChaojibiaoge
  **/
  @ApiModelProperty(required = true, value = "是否启用外部应用超级表格，默认为false")
      @NotNull

    public Boolean isEnableChaojibiaoge() {
    return enableChaojibiaoge;
  }

  public void setEnableChaojibiaoge(Boolean enableChaojibiaoge) {
    this.enableChaojibiaoge = enableChaojibiaoge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResExtapp auth1GetconfigResExtapp = (Auth1GetconfigResExtapp) o;
    return Objects.equals(this.enableChaojibiaoge, auth1GetconfigResExtapp.enableChaojibiaoge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableChaojibiaoge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResExtapp {\n");
    
    sb.append("    enableChaojibiaoge: ").append(toIndentedString(enableChaojibiaoge)).append("\n");
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
