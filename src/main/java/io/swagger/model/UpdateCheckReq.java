package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCheckReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class UpdateCheckReq   {
  /**
   * 客户端对应的平台
   */
  public enum PlatformEnum {
    WINDOWS("windows"),
    
    MAC("mac");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PlatformEnum fromValue(String text) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("platform")
  private PlatformEnum platform = null;

  @JsonProperty("arch")
  private String arch = null;

  @JsonProperty("version")
  private String version = null;

  public UpdateCheckReq platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

  /**
   * 客户端对应的平台
   * @return platform
  **/
  @ApiModelProperty(required = true, value = "客户端对应的平台")
      @NotNull

    public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }

  public UpdateCheckReq arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * 客户端的操作系统架构，现在windows只支持“x86”和“x64”， mac平台忽略该字段
   * @return arch
  **/
  @ApiModelProperty(required = true, value = "客户端的操作系统架构，现在windows只支持“x86”和“x64”， mac平台忽略该字段")
      @NotNull

    public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }

  public UpdateCheckReq version(String version) {
    this.version = version;
    return this;
  }

  /**
   * 客户端程序的版本，为3.5.3.244形式（主版本号，小版本号，修订号，构建号）
   * @return version
  **/
  @ApiModelProperty(required = true, value = "客户端程序的版本，为3.5.3.244形式（主版本号，小版本号，修订号，构建号）")
      @NotNull

    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCheckReq updateCheckReq = (UpdateCheckReq) o;
    return Objects.equals(this.platform, updateCheckReq.platform) &&
        Objects.equals(this.arch, updateCheckReq.arch) &&
        Objects.equals(this.version, updateCheckReq.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, arch, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCheckReq {\n");
    
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
