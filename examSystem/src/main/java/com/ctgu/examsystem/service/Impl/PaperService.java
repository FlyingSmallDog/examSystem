package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.dao.IPaperDAO;
import com.ctgu.examsystem.domain.Paper;
import com.ctgu.examsystem.service.IPaperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaperService implements IPaperService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IPaperDAO iPaperDAO;
    @Override
    public Paper getPaperById(Long id) {
        Paper paper = iPaperDAO.selectByPrimaryKey(id);
        if(paper==null){
            logger.error("查询试卷出错,"+id);
        }
        return paper;
    }

    @Override
    public List<Paper> getPaperBystate(int state) {
        Paper paper = new Paper();
        paper.setType(state);
        return iPaperDAO.selectByExample(paper);
    }

    @Override
    public List<Paper> getPaperByTeacher(Long teacherRef) {
        Paper paper = new Paper();
        paper.setTeacherRef(teacherRef);
        return iPaperDAO.selectByExample(paper);
    }

    @Override
    public Paper createPaper(Paper paper,Long teacherRef,int state) {
        paper.setTeacherRef(teacherRef);
        paper.setType(state);
        int count = iPaperDAO.insertSelective(paper);
        if(count == 0){
            logger.error("添加试卷出错，"+paper);
        }
        return iPaperDAO.selectByPrimaryKey(paper.getId());
    }

    @Override
    public Paper updatePaper(Long id, Paper paper) {
        paper.setId(id);
        int count = iPaperDAO.updateByPrimaryKeySelective(paper);
        return iPaperDAO.selectByPrimaryKey(paper.getId());
    }

    @Override
    public void deletePaper(Long id) {
        int count = iPaperDAO.deleteByPrimaryKey(id);
        if(count ==0){
            logger.error("删除试卷出错,"+id);
        }
    }
}
