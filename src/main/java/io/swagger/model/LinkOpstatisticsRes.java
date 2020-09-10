package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LinkOpstatisticsResStatistic;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LinkOpstatisticsRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class LinkOpstatisticsRes   {
  @JsonProperty("statistics")
  @Valid
  private List<LinkOpstatisticsResStatistic> statistics = new ArrayList<LinkOpstatisticsResStatistic>();

  public LinkOpstatisticsRes statistics(List<LinkOpstatisticsResStatistic> statistics) {
    this.statistics = statistics;
    return this;
  }

  public LinkOpstatisticsRes addStatisticsItem(LinkOpstatisticsResStatistic statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

  /**
   * 统计信息数组
   * @return statistics
  **/
  @ApiModelProperty(required = true, value = "统计信息数组")
      @NotNull
    @Valid
    public List<LinkOpstatisticsResStatistic> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<LinkOpstatisticsResStatistic> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOpstatisticsRes linkOpstatisticsRes = (LinkOpstatisticsRes) o;
    return Objects.equals(this.statistics, linkOpstatisticsRes.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpstatisticsRes {\n");
    
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
