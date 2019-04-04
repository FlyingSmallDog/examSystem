/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.ctgu.examsystem.rest;

import com.ctgu.examsystem.rest.dto.CreateQuestionRequest;
import com.ctgu.examsystem.rest.dto.QuestionDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.246+08:00[Asia/Shanghai]")

@Validated
@Api(value = "question", description = "the question API")
public interface QuestionApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "创建题目", nickname = "createQuestionInfo", notes = "", response = QuestionDto.class, tags={ "question", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = QuestionDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/question",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<QuestionDto> createQuestionInfo(@NotNull @ApiParam(value = "老师Id", required = true) @Valid @RequestParam(value = "teacherRef", required = true) Long teacherRef,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateQuestionRequest createQuestionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"score\" : 5.962133916683182377482808078639209270477294921875,  \"aDescribe\" : \"aDescribe\",  \"contextTypeRef\" : 1,  \"id\" : 0,  \"qDescribe\" : \"qDescribe\",  \"typeRef\" : 6,  \"teacherRef\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "删除指定题目", nickname = "deleteClass", notes = "", tags={ "question", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功"),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/question/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteClass(@ApiParam(value = "班级id",required=true) @PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "获取指定题目详情", nickname = "getQuestionInfo", notes = "", response = QuestionDto.class, tags={ "question", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = QuestionDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/question/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<QuestionDto> getQuestionInfo(@ApiParam(value = "班级Id",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"score\" : 5.962133916683182377482808078639209270477294921875,  \"aDescribe\" : \"aDescribe\",  \"contextTypeRef\" : 1,  \"id\" : 0,  \"qDescribe\" : \"qDescribe\",  \"typeRef\" : 6,  \"teacherRef\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "获取题目列表", nickname = "getQuestionListOfTeacher", notes = "", response = QuestionDto.class, responseContainer = "List", tags={ "question", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = QuestionDto.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/question/{teacherRef}/{type}/{contextType}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<QuestionDto>> getQuestionListOfTeacher(@ApiParam(value = "老师Id",required=true) @PathVariable("teacherRef") Long teacherRef,@ApiParam(value = "题目类型(0.所有,1.判断正误,2.选择,3.填空题， 4.问答题, 5.编程题)",required=true) @PathVariable("type") Integer type,@ApiParam(value = "内容类型查询",required=true) @PathVariable("contextType") Long contextType) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"score\" : 5.962133916683182377482808078639209270477294921875,  \"aDescribe\" : \"aDescribe\",  \"contextTypeRef\" : 1,  \"id\" : 0,  \"qDescribe\" : \"qDescribe\",  \"typeRef\" : 6,  \"teacherRef\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "更新题目信息", nickname = "updateQuestion", notes = "", response = QuestionDto.class, tags={ "question", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = QuestionDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/question/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<QuestionDto> updateQuestion(@ApiParam(value = "题目Id",required=true) @PathVariable("id") Long id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateQuestionRequest createQuestionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"score\" : 5.962133916683182377482808078639209270477294921875,  \"aDescribe\" : \"aDescribe\",  \"contextTypeRef\" : 1,  \"id\" : 0,  \"qDescribe\" : \"qDescribe\",  \"typeRef\" : 6,  \"teacherRef\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}