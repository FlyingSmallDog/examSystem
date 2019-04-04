package com.ctgu.examsystem.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 班级详情
 */
@ApiModel(description = "班级详情")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:47.161+08:00[Asia/Shanghai]")

public class ClassDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("className")
  private String className;

  @JsonProperty("stuNumber")
  private Integer stuNumber;

  public ClassDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 班级主键
   * @return id
  **/
  @ApiModelProperty(value = "班级主键")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ClassDto className(String className) {
    this.className = className;
    return this;
  }

  /**
   * 班级名称
   * @return className
  **/
  @ApiModelProperty(value = "班级名称")


  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public ClassDto stuNumber(Integer stuNumber) {
    this.stuNumber = stuNumber;
    return this;
  }

  /**
   * 班级人数
   * @return stuNumber
  **/
  @ApiModelProperty(value = "班级人数")


  public Integer getStuNumber() {
    return stuNumber;
  }

  public void setStuNumber(Integer stuNumber) {
    this.stuNumber = stuNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassDto classDto = (ClassDto) o;
    return Objects.equals(this.id, classDto.id) &&
        Objects.equals(this.className, classDto.className) &&
        Objects.equals(this.stuNumber, classDto.stuNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, className, stuNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    stuNumber: ").append(toIndentedString(stuNumber)).append("\n");
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

