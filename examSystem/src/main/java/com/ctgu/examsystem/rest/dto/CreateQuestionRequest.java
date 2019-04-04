package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 创建题目详情对象
 */
@ApiModel(description = "创建题目详情对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.246+08:00[Asia/Shanghai]")

public class CreateQuestionRequest   {
  @JsonProperty("typeRef")
  private Integer typeRef;

  @JsonProperty("contextTypeRef")
  private Long contextTypeRef;

  @JsonProperty("qDescribe")
  private String qDescribe;

  @JsonProperty("aDescribe")
  private String aDescribe;

  @JsonProperty("score")
  private Double score;

  public CreateQuestionRequest typeRef(Integer typeRef) {
    this.typeRef = typeRef;
    return this;
  }

  /**
   * 题目类型
   * @return typeRef
  **/
  @ApiModelProperty(value = "题目类型")


  public Integer getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(Integer typeRef) {
    this.typeRef = typeRef;
  }

  public CreateQuestionRequest contextTypeRef(Long contextTypeRef) {
    this.contextTypeRef = contextTypeRef;
    return this;
  }

  /**
   * 题目内容类型
   * @return contextTypeRef
  **/
  @ApiModelProperty(value = "题目内容类型")


  public Long getContextTypeRef() {
    return contextTypeRef;
  }

  public void setContextTypeRef(Long contextTypeRef) {
    this.contextTypeRef = contextTypeRef;
  }

  public CreateQuestionRequest qDescribe(String qDescribe) {
    this.qDescribe = qDescribe;
    return this;
  }

  /**
   * 问题描述
   * @return qDescribe
  **/
  @ApiModelProperty(value = "问题描述")


  public String getQDescribe() {
    return qDescribe;
  }

  public void setQDescribe(String qDescribe) {
    this.qDescribe = qDescribe;
  }

  public CreateQuestionRequest aDescribe(String aDescribe) {
    this.aDescribe = aDescribe;
    return this;
  }

  /**
   * 答案描述
   * @return aDescribe
  **/
  @ApiModelProperty(value = "答案描述")


  public String getADescribe() {
    return aDescribe;
  }

  public void setADescribe(String aDescribe) {
    this.aDescribe = aDescribe;
  }

  public CreateQuestionRequest score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * 分数
   * @return score
  **/
  @ApiModelProperty(value = "分数")


  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateQuestionRequest createQuestionRequest = (CreateQuestionRequest) o;
    return Objects.equals(this.typeRef, createQuestionRequest.typeRef) &&
        Objects.equals(this.contextTypeRef, createQuestionRequest.contextTypeRef) &&
        Objects.equals(this.qDescribe, createQuestionRequest.qDescribe) &&
        Objects.equals(this.aDescribe, createQuestionRequest.aDescribe) &&
        Objects.equals(this.score, createQuestionRequest.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeRef, contextTypeRef, qDescribe, aDescribe, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQuestionRequest {\n");
    
    sb.append("    typeRef: ").append(toIndentedString(typeRef)).append("\n");
    sb.append("    contextTypeRef: ").append(toIndentedString(contextTypeRef)).append("\n");
    sb.append("    qDescribe: ").append(toIndentedString(qDescribe)).append("\n");
    sb.append("    aDescribe: ").append(toIndentedString(aDescribe)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

