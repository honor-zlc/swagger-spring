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
 * MessageGetResMsgBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")


public class MessageGetResMsgBase   {
  @JsonProperty("accessorname")
  private String accessorname = null;

  /**
   * 表示访问者类型
   */
  public enum AccessortypeEnum {
    USER("user"),
    
    DEPARTMENT("department"),
    
    CONTACTOR("contactor");

    private String value;

    AccessortypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessortypeEnum fromValue(String text) {
      for (AccessortypeEnum b : AccessortypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("accessortype")
  private AccessortypeEnum accessortype = null;

  @JsonProperty("csf")
  private Long csf = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isdir")
  private Boolean isdir = null;

  @JsonProperty("isread")
  private Boolean isread = null;

  @JsonProperty("sender")
  private String sender = null;

  @JsonProperty("time")
  private Long time = null;

  @JsonProperty("type")
  private Long type = null;

  @JsonProperty("url")
  private String url = null;

  public MessageGetResMsgBase accessorname(String accessorname) {
    this.accessorname = accessorname;
    return this;
  }

  /**
   * 接收者名字，如果是外链，为空字符串
   * @return accessorname
  **/
  @ApiModelProperty(required = true, value = "接收者名字，如果是外链，为空字符串")
      @NotNull

    public String getAccessorname() {
    return accessorname;
  }

  public void setAccessorname(String accessorname) {
    this.accessorname = accessorname;
  }

  public MessageGetResMsgBase accessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
    return this;
  }

  /**
   * 表示访问者类型
   * @return accessortype
  **/
  @ApiModelProperty(required = true, value = "表示访问者类型")
      @NotNull

    public AccessortypeEnum getAccessortype() {
    return accessortype;
  }

  public void setAccessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
  }

  public MessageGetResMsgBase csf(Long csf) {
    this.csf = csf;
    return this;
  }

  /**
   * 文件密级，5~15，文件夹为0
   * @return csf
  **/
  @ApiModelProperty(required = true, value = "文件密级，5~15，文件夹为0")
      @NotNull

    public Long getCsf() {
    return csf;
  }

  public void setCsf(Long csf) {
    this.csf = csf;
  }

  public MessageGetResMsgBase id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 此条消息的唯一标识
   * @return id
  **/
  @ApiModelProperty(required = true, value = "此条消息的唯一标识")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageGetResMsgBase isdir(Boolean isdir) {
    this.isdir = isdir;
    return this;
  }

  /**
   * 是否为文件夹
   * @return isdir
  **/
  @ApiModelProperty(required = true, value = "是否为文件夹")
      @NotNull

    public Boolean isIsdir() {
    return isdir;
  }

  public void setIsdir(Boolean isdir) {
    this.isdir = isdir;
  }

  public MessageGetResMsgBase isread(Boolean isread) {
    this.isread = isread;
    return this;
  }

  /**
   * 消息是否已读
   * @return isread
  **/
  @ApiModelProperty(required = true, value = "消息是否已读")
      @NotNull

    public Boolean isIsread() {
    return isread;
  }

  public void setIsread(Boolean isread) {
    this.isread = isread;
  }

  public MessageGetResMsgBase sender(String sender) {
    this.sender = sender;
    return this;
  }

  /**
   * 发送者名字
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "发送者名字")
      @NotNull

    public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public MessageGetResMsgBase time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * 共享操作的时间(unix utc ns)
   * @return time
  **/
  @ApiModelProperty(required = true, value = "共享操作的时间(unix utc ns)")
      @NotNull

    public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MessageGetResMsgBase type(Long type) {
    this.type = type;
    return this;
  }

  /**
   * 此条消息的类型  1. 开启共享  2. 关闭共享  3. 设置所有者  4. 取消所有者  5. 开启共享申请  6. 关闭共享申请  7. 设置所有者申请  8. 取消所有者申请  9. 开启外链申请  10. 开启共享审核结果  11. 关闭共享审核结果  12. 开启所有者审核结果  13. 关闭所有者审核结果  14. 开启外链审核结果  15. 待审流程消息  16. 流程进度消息   17. 流程结果消息  18. 简单消息  19. 提交密级申请消息  20. 密级申请审核结果  21. 隔离消息  22. 隔离被还原消息  23. 杀毒消息  24. 创建文档收集任务消息  25. 文档收发变更消息  26. 文档收发提醒消息  27. 取消文档收发任务消息  28. 文件到期通知消息  29. 短信验证码发送  30. 继承变更申请消息  31. 继承变更审核结果
   * @return type
  **/
  @ApiModelProperty(required = true, value = "此条消息的类型  1. 开启共享  2. 关闭共享  3. 设置所有者  4. 取消所有者  5. 开启共享申请  6. 关闭共享申请  7. 设置所有者申请  8. 取消所有者申请  9. 开启外链申请  10. 开启共享审核结果  11. 关闭共享审核结果  12. 开启所有者审核结果  13. 关闭所有者审核结果  14. 开启外链审核结果  15. 待审流程消息  16. 流程进度消息   17. 流程结果消息  18. 简单消息  19. 提交密级申请消息  20. 密级申请审核结果  21. 隔离消息  22. 隔离被还原消息  23. 杀毒消息  24. 创建文档收集任务消息  25. 文档收发变更消息  26. 文档收发提醒消息  27. 取消文档收发任务消息  28. 文件到期通知消息  29. 短信验证码发送  30. 继承变更申请消息  31. 继承变更审核结果")
      @NotNull

    public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public MessageGetResMsgBase url(String url) {
    this.url = url;
    return this;
  }

  /**
   * 内链，相对地址
   * @return url
  **/
  @ApiModelProperty(required = true, value = "内链，相对地址")
      @NotNull

    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgBase messageGetResMsgBase = (MessageGetResMsgBase) o;
    return Objects.equals(this.accessorname, messageGetResMsgBase.accessorname) &&
        Objects.equals(this.accessortype, messageGetResMsgBase.accessortype) &&
        Objects.equals(this.csf, messageGetResMsgBase.csf) &&
        Objects.equals(this.id, messageGetResMsgBase.id) &&
        Objects.equals(this.isdir, messageGetResMsgBase.isdir) &&
        Objects.equals(this.isread, messageGetResMsgBase.isread) &&
        Objects.equals(this.sender, messageGetResMsgBase.sender) &&
        Objects.equals(this.time, messageGetResMsgBase.time) &&
        Objects.equals(this.type, messageGetResMsgBase.type) &&
        Objects.equals(this.url, messageGetResMsgBase.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorname, accessortype, csf, id, isdir, isread, sender, time, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgBase {\n");
    
    sb.append("    accessorname: ").append(toIndentedString(accessorname)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    csf: ").append(toIndentedString(csf)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
    sb.append("    isread: ").append(toIndentedString(isread)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
