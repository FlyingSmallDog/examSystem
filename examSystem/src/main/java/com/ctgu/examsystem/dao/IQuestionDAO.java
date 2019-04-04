package com.ctgu.examsystem.dao;

import com.ctgu.examsystem.common.GenericDao;
import com.ctgu.examsystem.domain.Question;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuestionDAO extends GenericDao<Question> {
}
