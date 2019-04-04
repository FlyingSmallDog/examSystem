package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 考试结果详情
 */
@ApiModel(description = "考试结果详情")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:47.724+08:00[Asia/Shanghai]")

public class ExamResultDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("answers")
  private String answers;

  @JsonProperty("score")
  private Double score;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  public ExamResultDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 考试结果主键
   * @return id
  **/
  @ApiModelProperty(value = "考试结果主键")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ExamResultDto answers(String answers) {
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

  public ExamResultDto score(Double score) {
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

  public ExamResultDto startTime(String startTime) {
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

  public ExamResultDto endTime(String endTime) {
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
    ExamResultDto examResultDto = (ExamResultDto) o;
    return Objects.equals(this.id, examResultDto.id) &&
        Objects.equals(this.answers, examResultDto.answers) &&
        Objects.equals(this.score, examResultDto.score) &&
        Objects.equals(this.startTime, examResultDto.startTime) &&
        Objects.equals(this.endTime, examResultDto.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, answers, score, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExamResultDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

