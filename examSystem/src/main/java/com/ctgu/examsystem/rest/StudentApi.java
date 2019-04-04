/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.ctgu.examsystem.rest;

import com.ctgu.examsystem.rest.dto.CreateStudentRequest;
import com.ctgu.examsystem.rest.dto.StudentDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.676+08:00[Asia/Shanghai]")

@Validated
@Api(value = "student", description = "the student API")
public interface StudentApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "创建学生", nickname = "createStudentInfo", notes = "", response = StudentDto.class, tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = StudentDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<StudentDto> createStudentInfo(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateStudentRequest createStudentRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"realName\" : \"realName\",  \"studentTel\" : \"studentTel\",  \"studentName\" : \"studentName\",  \"id\" : 0}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "删除指定学生", nickname = "deleteStudent", notes = "", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功"),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteStudent(@ApiParam(value = "学生id",required=true) @PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "获取指定学生详情", nickname = "getStudentInfo", notes = "", response = StudentDto.class, tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = StudentDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<StudentDto> getStudentInfo(@ApiParam(value = "学生id",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"realName\" : \"realName\",  \"studentTel\" : \"studentTel\",  \"studentName\" : \"studentName\",  \"id\" : 0}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "获取学生列表", nickname = "getStudentList", notes = "", response = StudentDto.class, responseContainer = "List", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = StudentDto.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<StudentDto>> getStudentList() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"realName\" : \"realName\",  \"studentTel\" : \"studentTel\",  \"studentName\" : \"studentName\",  \"id\" : 0}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "更新学生信息", nickname = "updateStudent", notes = "", response = StudentDto.class, tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = StudentDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<StudentDto> updateStudent(@ApiParam(value = "任务主键",required=true) @PathVariable("id") Long id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateStudentRequest createStudentRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"realName\" : \"realName\",  \"studentTel\" : \"studentTel\",  \"studentName\" : \"studentName\",  \"id\" : 0}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}