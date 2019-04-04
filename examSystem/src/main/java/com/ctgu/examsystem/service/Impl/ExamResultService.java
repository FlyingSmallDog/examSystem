package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.dao.IExamResultDAO;
import com.ctgu.examsystem.domain.ExamResult;
import com.ctgu.examsystem.service.IExamResultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExamResultService implements IExamResultService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IExamResultDAO iExamResultDAO;

    @Override
    public ExamResult createExamResult(Long studentRef,ExamResult examResult) {
        int count = iExamResultDAO.insertSelective(examResult);
        if(count == 0){
            logger.error("增加考试结果出错,"+examResult);
        }
        return iExamResultDAO.selectByPrimaryKey(examResult.getId());
    }

    @Override
    public ExamResult updateExamResult(Long id, ExamResult examResult) {
        examResult.setId(id);
        int count = iExamResultDAO.updateByPrimaryKeySelective(examResult);
        if(count == 0){
            logger.error("更新考试结果出错，"+examResult);
        }
        return iExamResultDAO.selectByPrimaryKey(id);
    }

    @Override
    public void deleteExamResult(Long id) {
        int count = iExamResultDAO.deleteByPrimaryKey(id);
        if(count == 0){
            logger.error("删除考试结果出错,"+id);
        }
    }

    @Override
    public ExamResult getExamResult(Long id) {
        ExamResult examResult =  iExamResultDAO.selectByPrimaryKey(id);
        if(examResult == null){
            logger.error("查询考试结果出错，"+ id);
        }
        return examResult;
    }

    @Override
    public List<ExamResult> getExamResultByStudent(Long studentRef) {
        ExamResult examResult = new ExamResult();
        examResult.setStudentRef(studentRef);
        return iExamResultDAO.selectByExample(examResult);
    }
}
