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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:47.724+08:00[Asia/Shanghai]")

public class CreateExamResultRequest   {
  @JsonProperty("paperRef")
  private Long paperRef;

  @JsonProperty("answers")
  private String answers;

  @JsonProperty("score")
  private Double score;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  public CreateExamResultRequest paperRef(Long paperRef) {
    this.paperRef = paperRef;
    return this;
  }

  /**
   * 试卷Id
   * @return paperRef
  **/
  @ApiModelProperty(value = "试卷Id")


  public Long getPaperRef() {
    return paperRef;
  }

  public void setPaperRef(Long paperRef) {
    this.paperRef = paperRef;
  }

  public CreateExamResultRequest answers(String answers) {
    this.answers = answers;
    return this;
  }

  /**
   * 答案列表
   * @return answers
  **/
  @ApiModelProperty(value = "答案列表")


  public String getAnswers() {
    return answers;
  }

  public void setAnswers(String answers) {
    this.answers = answers;
  }

  public CreateExamResultRequest score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * 得分
   * @return score
  **/
  @ApiModelProperty(value = "得分")


  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public CreateExamResultRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * 开始时间
   * @return startTime
  **/
  @ApiModelProperty(value = "开始时间")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public CreateExamResultRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * 结束时间
   * @return endTime
  **/
  @ApiModelProperty(value = "结束时间")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExamResultRequest createExamResultRequest = (CreateExamResultRequest) o;
    return Objects.equals(this.paperRef, createExamResultRequest.paperRef) &&
        Objects.equals(this.answers, createExamResultRequest.answers) &&
        Objects.equals(this.score, createExamResultRequest.score) &&
        Objects.equals(this.startTime, createExamResultRequest.startTime) &&
        Objects.equals(this.endTime, createExamResultRequest.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paperRef, answers, score, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExamResultRequest {\n");
    
    sb.append("    paperRef: ").append(toIndentedString(paperRef)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

