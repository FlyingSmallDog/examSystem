package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 老师详情
 */
@ApiModel(description = "老师详情")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.742+08:00[Asia/Shanghai]")

public class TeacherDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("teacherName")
  private String teacherName;

  @JsonProperty("realName")
  private String realName;

  @JsonProperty("teacherTel")
  private String teacherTel;

  public TeacherDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 老师主键
   * @return id
  **/
  @ApiModelProperty(value = "老师主键")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TeacherDto teacherName(String teacherName) {
    this.teacherName = teacherName;
    return this;
  }

  /**
   * 老师名称
   * @return teacherName
  **/
  @ApiModelProperty(value = "老师名称")


  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }

  public TeacherDto realName(String realName) {
    this.realName = realName;
    return this;
  }

  /**
   * 真实姓名
   * @return realName
  **/
  @ApiModelProperty(value = "真实姓名")


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public TeacherDto teacherTel(String teacherTel) {
    this.teacherTel = teacherTel;
    return this;
  }

  /**
   * 老师联系方式
   * @return teacherTel
  **/
  @ApiModelProperty(value = "老师联系方式")


  public String getTeacherTel() {
    return teacherTel;
  }

  public void setTeacherTel(String teacherTel) {
    this.teacherTel = teacherTel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeacherDto teacherDto = (TeacherDto) o;
    return Objects.equals(this.id, teacherDto.id) &&
        Objects.equals(this.teacherName, teacherDto.teacherName) &&
        Objects.equals(this.realName, teacherDto.realName) &&
        Objects.equals(this.teacherTel, teacherDto.teacherTel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, teacherName, realName, teacherTel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeacherDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    teacherName: ").append(toIndentedString(teacherName)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    teacherTel: ").append(toIndentedString(teacherTel)).append("\n");
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

