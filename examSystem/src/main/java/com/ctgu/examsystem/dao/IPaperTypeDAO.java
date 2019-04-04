package com.ctgu.examsystem.dao;

import com.ctgu.examsystem.common.GenericDao;
import com.ctgu.examsystem.domain.Paper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IPaperTypeDAO extends GenericDao<Paper> {
}
