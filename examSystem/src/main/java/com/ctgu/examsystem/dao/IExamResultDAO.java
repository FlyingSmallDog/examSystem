package com.ctgu.examsystem.dao;

import com.ctgu.examsystem.common.GenericDao;
import com.ctgu.examsystem.domain.ExamResult;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IExamResultDAO extends GenericDao<ExamResult> {
}
