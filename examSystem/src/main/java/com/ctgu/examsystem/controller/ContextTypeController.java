package com.ctgu.examsystem.controller;

import com.ctgu.examsystem.convert.ContextTypeConvert;
import com.ctgu.examsystem.domain.QuestionContextType;
import com.ctgu.examsystem.rest.ContextTypeApi;
import com.ctgu.examsystem.rest.dto.ContextTypeDto;
import com.ctgu.examsystem.rest.dto.CreateContextTypeRequest;
import com.ctgu.examsystem.service.IQuestionContextTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/System")
public class ContextTypeController implements ContextTypeApi {
    @Resource
    private IQuestionContextTypeService iQuestionContextTypeService;

    public ResponseEntity<ContextTypeDto> createContextType( @PathVariable("teacherRef") Long teacherRef, @RequestBody CreateContextTypeRequest createContextTypeRequest){
        return ResponseEntity.ok(ContextTypeConvert.transform(iQuestionContextTypeService.createContextType(teacherRef,ContextTypeConvert.transform(createContextTypeRequest))));
    }

    public ResponseEntity<Void> delContextType(@PathVariable("teacherRef") Long teacherRef,@RequestParam(value = "id", required = true) Long id){
        iQuestionContextTypeService.deleteContextType(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<List<ContextTypeDto>> getContextType(@PathVariable("teacherRef") Long teacherRef){
        List<QuestionContextType> questionContextTypes = iQuestionContextTypeService.getQuestionContextType();
        List<ContextTypeDto> contextTypeDtos = new ArrayList<>();
        questionContextTypes.stream().forEach(questionContextType -> {
            contextTypeDtos.add(ContextTypeConvert.transform(questionContextType));
        });
        return ResponseEntity.ok(contextTypeDtos);
    }

}
