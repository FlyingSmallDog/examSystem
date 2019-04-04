package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.ExamsystemApplicationTests;
import com.ctgu.examsystem.domain.Question;
import com.ctgu.examsystem.service.IQuestionService;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class QuestionServiceTest extends ExamsystemApplicationTests {

    @Resource
    private IQuestionService iQuestionService;

    @Test
    public void createQuestion() {
        Question question = new Question();
    }

    @Test
    public void getQuestionById() {
    }

    @Test
    public void updateQuestion() {
    }

    @Test
    public void deleteQuestion() {
    }

    @Test
    public void getQuestionList() {
    }

    @Test
    public void getQuestionListByTerm() {
    }
}