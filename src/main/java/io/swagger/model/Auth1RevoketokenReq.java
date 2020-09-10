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
 * Auth1RevoketokenReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class Auth1RevoketokenReq   {
  @JsonProperty("tokenid")
  private String tokenid = null;

  public Auth1RevoketokenReq tokenid(String tokenid) {
    this.tokenid = tokenid;
    return this;
  }

  /**
   * 用户身份凭证
   * @return tokenid
  **/
  @ApiModelProperty(required = true, value = "用户身份凭证")
      @NotNull

    public String getTokenid() {
    return tokenid;
  }

  public void setTokenid(String tokenid) {
    this.tokenid = tokenid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1RevoketokenReq auth1RevoketokenReq = (Auth1RevoketokenReq) o;
    return Objects.equals(this.tokenid, auth1RevoketokenReq.tokenid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1RevoketokenReq {\n");
    
    sb.append("    tokenid: ").append(toIndentedString(tokenid)).append("\n");
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
