package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.dao.IQuestionContextTypeDAO;
import com.ctgu.examsystem.domain.QuestionContextType;
import com.ctgu.examsystem.service.IQuestionContextTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionContextTypeService implements IQuestionContextTypeService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IQuestionContextTypeDAO iQuestionContextTypeDAO;

    @Override
    public QuestionContextType createContextType(Long teacherRef,QuestionContextType questionContextType) {
        questionContextType.setTeacherRef(teacherRef);
        int count = iQuestionContextTypeDAO.insertSelective(questionContextType);
        if(count==0){
            logger.error("添加题目类型出错,"+questionContextType);
        }
        return iQuestionContextTypeDAO.selectByPrimaryKey(questionContextType.getId());
    }

    @Override
    public QuestionContextType updateContextType(Long id, QuestionContextType questionContextType) {
        questionContextType.setId(id);
        int count = iQuestionContextTypeDAO.updateByPrimaryKeySelective(questionContextType);
        if(count == 0){
            logger.error("更新题目类型出错,"+questionContextType);
        }
        return iQuestionContextTypeDAO.selectByPrimaryKey(questionContextType.getId());
    }

    @Override
    public void deleteContextType(Long id) {
        iQuestionContextTypeDAO.selectByPrimaryKey(id);

    }

    @Override
    public List<QuestionContextType> getQuestionContextType() {

        return iQuestionContextTypeDAO.selectAll();
    }
}
