package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 创建学生详情对象
 */
@ApiModel(description = "创建学生详情对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.676+08:00[Asia/Shanghai]")

public class CreateStudentRequest   {
  @JsonProperty("studentName")
  private String studentName;

  @JsonProperty("studentPassword")
  private String studentPassword;

  @JsonProperty("realName")
  private String realName;

  @JsonProperty("studentTel")
  private String studentTel;

  public CreateStudentRequest studentName(String studentName) {
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

  public CreateStudentRequest studentPassword(String studentPassword) {
    this.studentPassword = studentPassword;
    return this;
  }

  /**
   * 学生密码
   * @return studentPassword
  **/
  @ApiModelProperty(value = "学生密码")


  public String getStudentPassword() {
    return studentPassword;
  }

  public void setStudentPassword(String studentPassword) {
    this.studentPassword = studentPassword;
  }

  public CreateStudentRequest realName(String realName) {
    this.realName = realName;
    return this;
  }

  /**
   * 真是姓名
   * @return realName
  **/
  @ApiModelProperty(value = "真是姓名")


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public CreateStudentRequest studentTel(String studentTel) {
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
    CreateStudentRequest createStudentRequest = (CreateStudentRequest) o;
    return Objects.equals(this.studentName, createStudentRequest.studentName) &&
        Objects.equals(this.studentPassword, createStudentRequest.studentPassword) &&
        Objects.equals(this.realName, createStudentRequest.realName) &&
        Objects.equals(this.studentTel, createStudentRequest.studentTel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentName, studentPassword, realName, studentTel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStudentRequest {\n");
    
    sb.append("    studentName: ").append(toIndentedString(studentName)).append("\n");
    sb.append("    studentPassword: ").append(toIndentedString(studentPassword)).append("\n");
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

