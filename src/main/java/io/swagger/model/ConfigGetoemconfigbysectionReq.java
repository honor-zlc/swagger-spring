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
 * ConfigGetoemconfigbysectionReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class ConfigGetoemconfigbysectionReq   {
  /**
   * 语言标签
   */
  public enum SectionEnum {
    SHAREWEB_EN_US("shareweb_en-us"),
    
    SHAREWEB_ZH_CN("shareweb_zh-cn"),
    
    SHAREWEB_ZH_TW("shareweb_zh-tw"),
    
    ANYSHARE("anyshare");

    private String value;

    SectionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SectionEnum fromValue(String text) {
      for (SectionEnum b : SectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("section")
  private SectionEnum section = null;

  public ConfigGetoemconfigbysectionReq section(SectionEnum section) {
    this.section = section;
    return this;
  }

  /**
   * 语言标签
   * @return section
  **/
  @ApiModelProperty(required = true, value = "语言标签")
      @NotNull

    public SectionEnum getSection() {
    return section;
  }

  public void setSection(SectionEnum section) {
    this.section = section;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigGetoemconfigbysectionReq configGetoemconfigbysectionReq = (ConfigGetoemconfigbysectionReq) o;
    return Objects.equals(this.section, configGetoemconfigbysectionReq.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(section);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGetoemconfigbysectionReq {\n");
    
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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
