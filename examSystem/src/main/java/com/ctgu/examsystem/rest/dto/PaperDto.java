package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 试卷详情
 */
@ApiModel(description = "试卷详情")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:47.871+08:00[Asia/Shanghai]")

public class PaperDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("paperName")
  private String paperName;

  @JsonProperty("totalScore")
  private Double totalScore;

  @JsonProperty("appointQuestions")
  private String appointQuestions;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("totalTime")
  private Integer totalTime;

  @JsonProperty("type")
  private Integer type;

  public PaperDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 试卷主键
   * @return id
  **/
  @ApiModelProperty(value = "试卷主键")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PaperDto paperName(String paperName) {
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

  public PaperDto totalScore(Double totalScore) {
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

  public PaperDto appointQuestions(String appointQuestions) {
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

  public PaperDto startTime(String startTime) {
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

  public PaperDto endTime(String endTime) {
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

  public PaperDto totalTime(Integer totalTime) {
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

  public PaperDto type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * 状态分类(0.编辑中，1.已完成，2.已过期)
   * @return type
  **/
  @ApiModelProperty(value = "状态分类(0.编辑中，1.已完成，2.已过期)")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaperDto paperDto = (PaperDto) o;
    return Objects.equals(this.id, paperDto.id) &&
        Objects.equals(this.paperName, paperDto.paperName) &&
        Objects.equals(this.totalScore, paperDto.totalScore) &&
        Objects.equals(this.appointQuestions, paperDto.appointQuestions) &&
        Objects.equals(this.startTime, paperDto.startTime) &&
        Objects.equals(this.endTime, paperDto.endTime) &&
        Objects.equals(this.totalTime, paperDto.totalTime) &&
        Objects.equals(this.type, paperDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paperName, totalScore, appointQuestions, startTime, endTime, totalTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaperDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paperName: ").append(toIndentedString(paperName)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    appointQuestions: ").append(toIndentedString(appointQuestions)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

