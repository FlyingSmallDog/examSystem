package com.ctgu.examsystem.service;

import com.ctgu.examsystem.domain.Paper;

import java.util.List;

public interface IPaperService {
    public Paper getPaperById(Long id);

    public List<Paper> getPaperBystate(int state);

    public List<Paper> getPaperByTeacher(Long teacherRef);

    public Paper createPaper(Paper paper,Long teacherRef,int type);

    public Paper updatePaper(Long id,Paper paper);

    public void deletePaper(Long id);
}
