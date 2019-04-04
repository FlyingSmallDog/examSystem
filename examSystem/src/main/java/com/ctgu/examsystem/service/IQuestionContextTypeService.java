package com.ctgu.examsystem.service;

import com.ctgu.examsystem.domain.QuestionContextType;

import java.util.List;

public interface IQuestionContextTypeService {
    public QuestionContextType createContextType(Long id,QuestionContextType questionContextType);

    public QuestionContextType updateContextType(Long id,QuestionContextType questionContextType);

    public void deleteContextType(Long id);

    public List<QuestionContextType>  getQuestionContextType();
}
