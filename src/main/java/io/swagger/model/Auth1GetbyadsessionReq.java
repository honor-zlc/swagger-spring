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
 * Auth1GetbyadsessionReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1GetbyadsessionReq   {
  @JsonProperty("adsession")
  private String adsession = null;

  public Auth1GetbyadsessionReq adsession(String adsession) {
    this.adsession = adsession;
    return this;
  }

  /**
   * windows ad用户登录凭据
   * @return adsession
  **/
  @ApiModelProperty(required = true, value = "windows ad用户登录凭据")
      @NotNull

    public String getAdsession() {
    return adsession;
  }

  public void setAdsession(String adsession) {
    this.adsession = adsession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetbyadsessionReq auth1GetbyadsessionReq = (Auth1GetbyadsessionReq) o;
    return Objects.equals(this.adsession, auth1GetbyadsessionReq.adsession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adsession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetbyadsessionReq {\n");
    
    sb.append("    adsession: ").append(toIndentedString(adsession)).append("\n");
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
