package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 创建题目内容类型详情对象
 */
@ApiModel(description = "创建题目内容类型详情对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.246+08:00[Asia/Shanghai]")

public class CreateContextTypeRequest   {
  @JsonProperty("contextDescribe")
  private String contextDescribe;

  public CreateContextTypeRequest contextDescribe(String contextDescribe) {
    this.contextDescribe = contextDescribe;
    return this;
  }

  /**
   * 题目内容类型
   * @return contextDescribe
  **/
  @ApiModelProperty(value = "题目内容类型")


  public String getContextDescribe() {
    return contextDescribe;
  }

  public void setContextDescribe(String contextDescribe) {
    this.contextDescribe = contextDescribe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContextTypeRequest createContextTypeRequest = (CreateContextTypeRequest) o;
    return Objects.equals(this.contextDescribe, createContextTypeRequest.contextDescribe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextDescribe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContextTypeRequest {\n");
    
    sb.append("    contextDescribe: ").append(toIndentedString(contextDescribe)).append("\n");
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

