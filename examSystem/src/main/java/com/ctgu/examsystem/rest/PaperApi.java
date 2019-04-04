/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.ctgu.examsystem.rest;

import com.ctgu.examsystem.rest.dto.CreatePaperRequest;
import com.ctgu.examsystem.rest.dto.PaperDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:47.871+08:00[Asia/Shanghai]")

@Validated
@Api(value = "paper", description = "the paper API")
public interface PaperApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "创建试卷", nickname = "createPaperInfo", notes = "", response = PaperDto.class, tags={ "paper", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = PaperDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/paper/{teacherRef}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<PaperDto> createPaperInfo(@ApiParam(value = "老师Id",required=true) @PathVariable("teacherRef") Long teacherRef,@NotNull @ApiParam(value = "状态[1.编辑中，2.已完成，3.已过期]", required = true) @Valid @RequestParam(value = "type", required = true) Integer type,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreatePaperRequest createPaperRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"paperName\" : \"paperName\",  \"totalTime\" : 1,  \"appointQuestions\" : \"appointQuestions\",  \"startTime\" : \"startTime\",  \"id\" : 0,  \"endTime\" : \"endTime\",  \"type\" : 5,  \"totalScore\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "删除指定试卷", nickname = "deletePaper", notes = "", response = PaperDto.class, tags={ "paper", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = PaperDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/paper/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<PaperDto> deletePaper(@ApiParam(value = "试卷id",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"paperName\" : \"paperName\",  \"totalTime\" : 1,  \"appointQuestions\" : \"appointQuestions\",  \"startTime\" : \"startTime\",  \"id\" : 0,  \"endTime\" : \"endTime\",  \"type\" : 5,  \"totalScore\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "获取指定试卷详情", nickname = "getPaperInfo", notes = "", response = PaperDto.class, tags={ "paper", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = PaperDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/paper/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<PaperDto> getPaperInfo(@ApiParam(value = "试卷Id",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"paperName\" : \"paperName\",  \"totalTime\" : 1,  \"appointQuestions\" : \"appointQuestions\",  \"startTime\" : \"startTime\",  \"id\" : 0,  \"endTime\" : \"endTime\",  \"type\" : 5,  \"totalScore\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "获取当前老师的试卷列表", nickname = "getPaperList", notes = "", response = PaperDto.class, responseContainer = "List", tags={ "paper", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = PaperDto.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/paper/{teacherRef}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<PaperDto>> getPaperList(@ApiParam(value = "老师Id",required=true) @PathVariable("teacherRef") Long teacherRef) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"paperName\" : \"paperName\",  \"totalTime\" : 1,  \"appointQuestions\" : \"appointQuestions\",  \"startTime\" : \"startTime\",  \"id\" : 0,  \"endTime\" : \"endTime\",  \"type\" : 5,  \"totalScore\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "获取指定状态的试卷列表", nickname = "getPaperListOfType", notes = "", response = PaperDto.class, responseContainer = "List", tags={ "paper", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = PaperDto.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/paper/{teacherRef}/{type}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<PaperDto>> getPaperListOfType(@ApiParam(value = "老师id",required=true) @PathVariable("teacherRef") Long teacherRef,@ApiParam(value = "状态分类(1.编辑中，2.已完成，3.已过期)",required=true) @PathVariable("type") Integer type) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"paperName\" : \"paperName\",  \"totalTime\" : 1,  \"appointQuestions\" : \"appointQuestions\",  \"startTime\" : \"startTime\",  \"id\" : 0,  \"endTime\" : \"endTime\",  \"type\" : 5,  \"totalScore\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "更新试卷信息", nickname = "updatePaper", notes = "", response = PaperDto.class, tags={ "paper", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = PaperDto.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/paper/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<PaperDto> updatePaper(@ApiParam(value = "试卷Id",required=true) @PathVariable("id") Long id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreatePaperRequest createPaperRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"paperName\" : \"paperName\",  \"totalTime\" : 1,  \"appointQuestions\" : \"appointQuestions\",  \"startTime\" : \"startTime\",  \"id\" : 0,  \"endTime\" : \"endTime\",  \"type\" : 5,  \"totalScore\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}