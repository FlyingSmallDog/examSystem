package com.ctgu.examsystem.controller;

import com.ctgu.examsystem.convert.ExamResultConvert;
import com.ctgu.examsystem.domain.ExamResult;
import com.ctgu.examsystem.rest.ExamResultApi;
import com.ctgu.examsystem.rest.dto.CreateExamResultRequest;
import com.ctgu.examsystem.rest.dto.ExamResultDto;
import com.ctgu.examsystem.service.IExamResultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/System")
public class ExamResultController implements ExamResultApi {

    @Resource
    private IExamResultService iExamResultService;

    public ResponseEntity<ExamResultDto> createExamResultInfo(@PathVariable("studentRef") Long studentRef, @RequestBody CreateExamResultRequest createExamResultRequest) {
            ExamResult examResult = iExamResultService.createExamResult(studentRef, ExamResultConvert.transform(createExamResultRequest));
            return ResponseEntity.ok(ExamResultConvert.transform(examResult));
    }

    public ResponseEntity<Void> deleteExamResult( @PathVariable("id") Long id) {
        iExamResultService.deleteExamResult(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<List<ExamResultDto>> examResultStudentRefGet( @PathVariable("studentRef") Long studentRef) {
            List<ExamResult> examResults = iExamResultService.getExamResultByStudent(studentRef);
            List<ExamResultDto> examResultDtos = new ArrayList<>();
            examResults.stream().forEach(examResult -> {
                examResultDtos.add(ExamResultConvert.transform(examResult));
            });
            return ResponseEntity.ok(examResultDtos);
    }

    public ResponseEntity<ExamResultDto> getExamResultInfo(@PathVariable("id") Long id) {
        ExamResult examResult = iExamResultService.getExamResult(id);
        return ResponseEntity.ok(ExamResultConvert.transform(examResult));
    }

    public ResponseEntity<ExamResultDto> updateExamResult(@PathVariable("id") Long id,@RequestBody CreateExamResultRequest createExamResultRequest) {
        ExamResult examResult = iExamResultService.updateExamResult(id,ExamResultConvert.transform(createExamResultRequest));
        return ResponseEntity.ok(ExamResultConvert.transform(examResult));
    }

}
