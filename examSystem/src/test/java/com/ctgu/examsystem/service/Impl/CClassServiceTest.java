package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.ExamsystemApplicationTests;
import com.ctgu.examsystem.domain.CClass;
import com.ctgu.examsystem.service.ICClassService;
import org.junit.Test;
import javax.annotation.Resource;


public class CClassServiceTest extends ExamsystemApplicationTests {

    @Resource
    private ICClassService iCClassService;

    @Test
    public void getClassOfTeacher() {

    }

    @Test
    public void getClassById() {
    }

    @Test
    public void deleteClassById() {
    }

    @Test
    public void createClass() {
        CClass cClass = new CClass();
        cClass.setHeadmaster(1L);
        cClass.setClassname("计科2015-1");
        cClass.setStuNumber(2);
        cClass.setStudents("2,3");
        iCClassService.createClass(cClass);
    }

    @Test
    public void updateClass() {
        CClass cClass = new CClass();
        cClass.setId(2L);
        cClass.setStuNumber(2);
        CClass cClass1 = iCClassService.updateClass(cClass);
    }

    @Test
    public void updateStudentOfClass() {
    }
}