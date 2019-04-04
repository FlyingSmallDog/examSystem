package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.dao.IQuestionDAO;
import com.ctgu.examsystem.domain.Question;
import com.ctgu.examsystem.service.IQuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionService implements IQuestionService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IQuestionDAO iQuestionDAO;

    @Override
    public Question createQuestion(Question question) {
        int count = iQuestionDAO.insertSelective(question);
        if(count==0){
            logger.error("插入题目出错");
        }
        return iQuestionDAO.selectByPrimaryKey(question.getId());
    }

    @Override
    public Question getQuestionById(Long id) {
        Question question = iQuestionDAO.selectByPrimaryKey(id);
        if(question==null){
            logger.error("获取题目出错,"+id);
        }
        return question;
    }

    @Override
    public Question updateQuestion(Long id, Question question) {
        question.setId(id);
        int count = iQuestionDAO.updateByPrimaryKeySelective(question);
        if(count  == 0){
            logger.error("题目更新出错，"+question);
        }
        return iQuestionDAO.selectByPrimaryKey(question.getId());
    }

    @Override
    public void deleteQuestion(Long id) {
        iQuestionDAO.deleteByPrimaryKey(id);
    }

    @Override
    public List<Question> getQuestionList() {

        return iQuestionDAO.selectAll();
    }

    @Override
    public List<Question> getQuestionListByTerm(Long teacherRef, Long typeRef, int type) {
        Question question = new Question();
        if(teacherRef!=0){
            question.setTeacherRef(teacherRef);
        }
        if(typeRef!=0){
            question.setContextTypeRef(typeRef);
        }
        if(type!=0){
            question.setTypeRef(type);
        }
        List<Question> questions = iQuestionDAO.selectByExample(question);
        return questions;
    }
}
