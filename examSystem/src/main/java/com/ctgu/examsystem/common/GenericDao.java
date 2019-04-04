package com.ctgu.examsystem.common;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.additional.idlist.IdListProvider;
import tk.mybatis.mapper.common.IdsMapper;

import java.util.List;

public interface GenericDao <T> extends tk.mybatis.mapper.common.Mapper<T> , tk.mybatis.mapper.common.MySqlMapper<T>, IdsMapper<T> {

    @SelectProvider(type = IdListProvider.class, method = "dynamicSQL")
    List<T> selectByIdList(@Param("idList") List<?> idList);

}
