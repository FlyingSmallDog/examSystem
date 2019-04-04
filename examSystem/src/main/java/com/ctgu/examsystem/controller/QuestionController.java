package com.ctgu.examsystem.controller;

import com.ctgu.examsystem.convert.QuestionConvert;
import com.ctgu.examsystem.domain.Question;
import com.ctgu.examsystem.rest.QuestionApi;
import com.ctgu.examsystem.rest.dto.CreateQuestionRequest;
import com.ctgu.examsystem.rest.dto.QuestionDto;
import com.ctgu.examsystem.service.IQuestionService;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/System")
public class QuestionController implements QuestionApi {

    @Resource
    private IQuestionService iQuestionService;

    public ResponseEntity<QuestionDto> createQuestionInfo(@RequestParam(value = "teacherRef", required = true) Long teacherRef, @RequestBody CreateQuestionRequest createQuestionRequest) {
        Question question = QuestionConvert.transform(createQuestionRequest);
        question.setTeacherRef(teacherRef);
        return ResponseEntity.ok(QuestionConvert.transform(iQuestionService.createQuestion(question)));
    }

    public ResponseEntity<Void> deleteClass( @PathVariable("id") Long id){
        iQuestionService.deleteQuestion(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<QuestionDto> getQuestionInfo(@ApiParam(value = "班级Id",required=true) @PathVariable("id") Long id){
        Question question = iQuestionService.getQuestionById(id);
        return ResponseEntity.ok(QuestionConvert.transform(question));
    }

    public ResponseEntity<List<QuestionDto>> getQuestionListOfTeacher( @PathVariable("teacherRef") Long teacherRef,@PathVariable("type") Integer type, @PathVariable("contextType") Long contextType){
        List<Question> questions = iQuestionService.getQuestionListByTerm(teacherRef,contextType,type);
        List<QuestionDto> questionDtos = new ArrayList<>();
        questions.stream().forEach(question -> {
            questionDtos.add(QuestionConvert.transform(question));
        });
        return ResponseEntity.ok(questionDtos);
    }

    public ResponseEntity<QuestionDto> updateQuestion(@PathVariable("id") Long id, @RequestBody CreateQuestionRequest createQuestionRequest){
        Question question = QuestionConvert.transform(createQuestionRequest);
        return ResponseEntity.ok(QuestionConvert.transform(iQuestionService.updateQuestion(id,question)));
    }
}
