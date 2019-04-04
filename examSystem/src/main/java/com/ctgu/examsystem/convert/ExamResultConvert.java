package com.ctgu.examsystem.convert;

import com.ctgu.examsystem.common.DateUtils;
import com.ctgu.examsystem.domain.ExamResult;
import com.ctgu.examsystem.rest.dto.CreateExamResultRequest;
import com.ctgu.examsystem.rest.dto.ExamResultDto;

public class ExamResultConvert {

    public static ExamResult transform(CreateExamResultRequest createExamResultRequest){
        ExamResult examResult = new ExamResult();
        examResult.setPaperRef(createExamResultRequest.getPaperRef());
        examResult.setScore(createExamResultRequest.getScore());
        examResult.setStartTime(DateUtils.stringToDate(createExamResultRequest.getStartTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        examResult.setEndTime(DateUtils.stringToDate(createExamResultRequest.getEndTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        examResult.setAnswers(createExamResultRequest.getAnswers());
        return examResult;
    }

    public static ExamResultDto transform(ExamResult examResult){
        ExamResultDto examResultDto = new ExamResultDto();
        examResultDto.setId(examResult.getId());
        examResultDto.setStartTime(DateUtils.dateToString(examResult.getStartTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        examResultDto.setEndTime(DateUtils.dateToString(examResult.getEndTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        examResultDto.setAnswers(examResult.getAnswers());
        examResultDto.setScore(examResult.getScore());
        return examResultDto;
    }
}
