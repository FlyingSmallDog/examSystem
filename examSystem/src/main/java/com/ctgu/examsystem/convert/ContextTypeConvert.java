package com.ctgu.examsystem.convert;

import com.ctgu.examsystem.domain.QuestionContextType;
import com.ctgu.examsystem.rest.dto.ContextTypeDto;
import com.ctgu.examsystem.rest.dto.CreateContextTypeRequest;

public class ContextTypeConvert {

    public static QuestionContextType transform(CreateContextTypeRequest createContextTypeRequest){
        QuestionContextType questionContextType = new QuestionContextType();
        questionContextType.setDescribe(createContextTypeRequest.getContextDescribe());
        return questionContextType;
    }

    public static ContextTypeDto transform(QuestionContextType questionContextType){
        ContextTypeDto contextTypeDto = new ContextTypeDto();
        contextTypeDto.setId(questionContextType.getId());
        contextTypeDto.setTeacherRef(questionContextType.getTeacherRef());
        contextTypeDto.setContextDescribe(questionContextType.getDescribe());
        return contextTypeDto;
    }
}
