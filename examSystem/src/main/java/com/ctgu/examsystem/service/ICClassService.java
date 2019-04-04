package com.ctgu.examsystem.service;

import com.ctgu.examsystem.domain.CClass;

import java.util.List;

public interface ICClassService {
    public List<CClass> getClassOfTeacher(Long teacherRef);

    public CClass getClassById(Long id);

    public void deleteClassById(Long id);

    public CClass createClass(CClass cClass);

    public CClass updateClass(CClass cClass);

    public CClass updateStudentOfClass(Long id,Long studentRef,int operate);
}
