package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 创建老师详情对象
 */
@ApiModel(description = "创建老师详情对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.742+08:00[Asia/Shanghai]")

public class CreateTeacherRequest   {
  @JsonProperty("teacherName")
  private String teacherName;

  @JsonProperty("teacherPassword")
  private String teacherPassword;

  @JsonProperty("realName")
  private String realName;

  @JsonProperty("teacherTel")
  private String teacherTel;

  public CreateTeacherRequest teacherName(String teacherName) {
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

  public CreateTeacherRequest teacherPassword(String teacherPassword) {
    this.teacherPassword = teacherPassword;
    return this;
  }

  /**
   * 老师密码
   * @return teacherPassword
  **/
  @ApiModelProperty(value = "老师密码")


  public String getTeacherPassword() {
    return teacherPassword;
  }

  public void setTeacherPassword(String teacherPassword) {
    this.teacherPassword = teacherPassword;
  }

  public CreateTeacherRequest realName(String realName) {
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

  public CreateTeacherRequest teacherTel(String teacherTel) {
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
    CreateTeacherRequest createTeacherRequest = (CreateTeacherRequest) o;
    return Objects.equals(this.teacherName, createTeacherRequest.teacherName) &&
        Objects.equals(this.teacherPassword, createTeacherRequest.teacherPassword) &&
        Objects.equals(this.realName, createTeacherRequest.realName) &&
        Objects.equals(this.teacherTel, createTeacherRequest.teacherTel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teacherName, teacherPassword, realName, teacherTel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTeacherRequest {\n");
    
    sb.append("    teacherName: ").append(toIndentedString(teacherName)).append("\n");
    sb.append("    teacherPassword: ").append(toIndentedString(teacherPassword)).append("\n");
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

