package com.ctgu.examsystem.dao;

import com.ctgu.examsystem.common.GenericDao;
import com.ctgu.examsystem.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStudentDAO extends GenericDao<Student> {
}
