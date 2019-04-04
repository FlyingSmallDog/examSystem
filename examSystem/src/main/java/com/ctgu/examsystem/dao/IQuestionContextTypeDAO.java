package com.ctgu.examsystem.dao;

import com.ctgu.examsystem.common.GenericDao;
import com.ctgu.examsystem.domain.QuestionContextType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuestionContextTypeDAO extends GenericDao<QuestionContextType> {
}
