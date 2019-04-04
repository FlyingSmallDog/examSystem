package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 题目内容类型详情
 */
@ApiModel(description = "题目内容类型详情")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.246+08:00[Asia/Shanghai]")

public class ContextTypeDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("contextDescribe")
  private String contextDescribe;

  @JsonProperty("teacherRef")
  private Long teacherRef;

  public ContextTypeDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 题目内容类型主键
   * @return id
  **/
  @ApiModelProperty(value = "题目内容类型主键")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContextTypeDto contextDescribe(String contextDescribe) {
    this.contextDescribe = contextDescribe;
    return this;
  }

  /**
   * 描述
   * @return contextDescribe
  **/
  @ApiModelProperty(value = "描述")


  public String getContextDescribe() {
    return contextDescribe;
  }

  public void setContextDescribe(String contextDescribe) {
    this.contextDescribe = contextDescribe;
  }

  public ContextTypeDto teacherRef(Long teacherRef) {
    this.teacherRef = teacherRef;
    return this;
  }

  /**
   * 创建用户Id
   * @return teacherRef
  **/
  @ApiModelProperty(value = "创建用户Id")


  public Long getTeacherRef() {
    return teacherRef;
  }

  public void setTeacherRef(Long teacherRef) {
    this.teacherRef = teacherRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextTypeDto contextTypeDto = (ContextTypeDto) o;
    return Objects.equals(this.id, contextTypeDto.id) &&
        Objects.equals(this.contextDescribe, contextTypeDto.contextDescribe) &&
        Objects.equals(this.teacherRef, contextTypeDto.teacherRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contextDescribe, teacherRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextTypeDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contextDescribe: ").append(toIndentedString(contextDescribe)).append("\n");
    sb.append("    teacherRef: ").append(toIndentedString(teacherRef)).append("\n");
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

