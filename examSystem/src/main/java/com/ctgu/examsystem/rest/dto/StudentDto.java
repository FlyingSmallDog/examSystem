package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 学生详情
 */
@ApiModel(description = "学生详情")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.676+08:00[Asia/Shanghai]")

public class StudentDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("studentName")
  private String studentName;

  @JsonProperty("realName")
  private String realName;

  @JsonProperty("studentTel")
  private String studentTel;

  public StudentDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 学生主键
   * @return id
  **/
  @ApiModelProperty(value = "学生主键")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StudentDto studentName(String studentName) {
    this.studentName = studentName;
    return this;
  }

  /**
   * 学生名称
   * @return studentName
  **/
  @ApiModelProperty(value = "学生名称")


  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public StudentDto realName(String realName) {
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

  public StudentDto studentTel(String studentTel) {
    this.studentTel = studentTel;
    return this;
  }

  /**
   * 学生联系方式
   * @return studentTel
  **/
  @ApiModelProperty(value = "学生联系方式")


  public String getStudentTel() {
    return studentTel;
  }

  public void setStudentTel(String studentTel) {
    this.studentTel = studentTel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDto studentDto = (StudentDto) o;
    return Objects.equals(this.id, studentDto.id) &&
        Objects.equals(this.studentName, studentDto.studentName) &&
        Objects.equals(this.realName, studentDto.realName) &&
        Objects.equals(this.studentTel, studentDto.studentTel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentName, realName, studentTel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentName: ").append(toIndentedString(studentName)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    studentTel: ").append(toIndentedString(studentTel)).append("\n");
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

