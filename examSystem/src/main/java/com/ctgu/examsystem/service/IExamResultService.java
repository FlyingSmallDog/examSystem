package com.ctgu.examsystem.service;

import com.ctgu.examsystem.domain.ExamResult;

import java.util.List;

public interface IExamResultService {
    public ExamResult createExamResult(Long studentRef,ExamResult examResult);

    public ExamResult updateExamResult(Long id,ExamResult examResult);

    public void deleteExamResult(Long id);

    public ExamResult getExamResult(Long id);

    public List<ExamResult>  getExamResultByStudent(Long studentRef);
}
