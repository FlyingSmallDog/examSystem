package com.ctgu.examsystem.service;

import com.ctgu.examsystem.domain.Question;

import java.util.List;

public interface IQuestionService {
    public Question createQuestion(Question question);

    public Question getQuestionById(Long id);

    public Question updateQuestion(Long id,Question question);

    public void deleteQuestion(Long id);

    public List<Question>  getQuestionList();

    public List<Question> getQuestionListByTerm(Long teacherRef,Long typeRef,int type);
}
