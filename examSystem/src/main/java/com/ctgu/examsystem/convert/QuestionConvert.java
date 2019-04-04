package com.ctgu.examsystem.convert;

import com.ctgu.examsystem.domain.Question;
import com.ctgu.examsystem.rest.dto.CreateQuestionRequest;
import com.ctgu.examsystem.rest.dto.QuestionDto;

public class QuestionConvert {

    public static Question transform(CreateQuestionRequest createQuestionRequest){
        Question question = new Question();
        question.setTypeRef(createQuestionRequest.getTypeRef());
        question.setContextTypeRef(createQuestionRequest.getContextTypeRef());
        question.setanswerDescribe(createQuestionRequest.getADescribe());
        question.setquestionDescribe(createQuestionRequest.getQDescribe());
        question.setScore(createQuestionRequest.getScore());
        return question;
    }
    public static QuestionDto transform(Question question){
        QuestionDto questionDto = new QuestionDto();
        questionDto.setADescribe(question.getanswerDescribe());
        questionDto.setContextTypeRef(question.getContextTypeRef());
        questionDto.setTypeRef(question.getTypeRef());
        questionDto.setTeacherRef(question.getTeacherRef());
        questionDto.setQDescribe(question.getquestionDescribe());
        return questionDto;
    }
}
