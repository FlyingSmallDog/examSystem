package com.ctgu.examsystem.dao;

import com.ctgu.examsystem.common.GenericDao;
import com.ctgu.examsystem.domain.QuestionType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuestionTypeDAO extends GenericDao<QuestionType> {
}
