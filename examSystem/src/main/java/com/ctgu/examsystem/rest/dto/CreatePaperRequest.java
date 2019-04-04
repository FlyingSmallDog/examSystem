package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 创建试卷详情对象
 */
@ApiModel(description = "创建试卷详情对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:47.871+08:00[Asia/Shanghai]")

public class CreatePaperRequest   {
  @JsonProperty("paperName")
  private String paperName;

  @JsonProperty("totalScore")
  private Double totalScore;

  @JsonProperty("appointQuestions")
  private String appointQuestions;

  @JsonProperty("studentsRef")
  private String studentsRef;

  @JsonProperty("totalTime")
  private Integer totalTime;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  public CreatePaperRequest paperName(String paperName) {
    this.paperName = paperName;
    return this;
  }

  /**
   * 试卷名称
   * @return paperName
  **/
  @ApiModelProperty(value = "试卷名称")


  public String getPaperName() {
    return paperName;
  }

  public void setPaperName(String paperName) {
    this.paperName = paperName;
  }

  public CreatePaperRequest totalScore(Double totalScore) {
    this.totalScore = totalScore;
    return this;
  }

  /**
   * 试卷总分
   * @return totalScore
  **/
  @ApiModelProperty(value = "试卷总分")


  public Double getTotalScore() {
    return totalScore;
  }

  public void setTotalScore(Double totalScore) {
    this.totalScore = totalScore;
  }

  public CreatePaperRequest appointQuestions(String appointQuestions) {
    this.appointQuestions = appointQuestions;
    return this;
  }

  /**
   * 指定题目
   * @return appointQuestions
  **/
  @ApiModelProperty(value = "指定题目")


  public String getAppointQuestions() {
    return appointQuestions;
  }

  public void setAppointQuestions(String appointQuestions) {
    this.appointQuestions = appointQuestions;
  }

  public CreatePaperRequest studentsRef(String studentsRef) {
    this.studentsRef = studentsRef;
    return this;
  }

  /**
   * 考试学生
   * @return studentsRef
  **/
  @ApiModelProperty(value = "考试学生")


  public String getStudentsRef() {
    return studentsRef;
  }

  public void setStudentsRef(String studentsRef) {
    this.studentsRef = studentsRef;
  }

  public CreatePaperRequest totalTime(Integer totalTime) {
    this.totalTime = totalTime;
    return this;
  }

  /**
   * 考试时长
   * @return totalTime
  **/
  @ApiModelProperty(value = "考试时长")


  public Integer getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
  }

  public CreatePaperRequest startTime(String startTime) {
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

  public CreatePaperRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * 过期时间
   * @return endTime
  **/
  @ApiModelProperty(value = "过期时间")


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
    CreatePaperRequest createPaperRequest = (CreatePaperRequest) o;
    return Objects.equals(this.paperName, createPaperRequest.paperName) &&
        Objects.equals(this.totalScore, createPaperRequest.totalScore) &&
        Objects.equals(this.appointQuestions, createPaperRequest.appointQuestions) &&
        Objects.equals(this.studentsRef, createPaperRequest.studentsRef) &&
        Objects.equals(this.totalTime, createPaperRequest.totalTime) &&
        Objects.equals(this.startTime, createPaperRequest.startTime) &&
        Objects.equals(this.endTime, createPaperRequest.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paperName, totalScore, appointQuestions, studentsRef, totalTime, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaperRequest {\n");
    
    sb.append("    paperName: ").append(toIndentedString(paperName)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    appointQuestions: ").append(toIndentedString(appointQuestions)).append("\n");
    sb.append("    studentsRef: ").append(toIndentedString(studentsRef)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
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

