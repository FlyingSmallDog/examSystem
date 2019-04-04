package com.ctgu.examsystem.dao;

import com.ctgu.examsystem.common.GenericDao;
import com.ctgu.examsystem.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ITeacherDAO extends GenericDao<Teacher> {
}
