package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.ExamsystemApplicationTests;
import com.ctgu.examsystem.domain.Teacher;
import com.ctgu.examsystem.service.ITeacherService;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class TeacherServiceTest extends ExamsystemApplicationTests {



    @Resource
    private ITeacherService iTeacherService;

    @Test
    public void getTeacherById() {
        Teacher teacher = iTeacherService.getTeacherById(5L);
        logger.info(teacher.toString());
    }

    @Test
    public void createTeacher() {
        Teacher teacher = new Teacher();
        teacher.setRealName("李碧涛");
        teacher.setUsername("root");
        teacher.setPassword("123");
        teacher.setInformation("12345678901");
        iTeacherService.createTeacher(teacher);
    }

    @Test
    public void updateTeacher() {
        Teacher teacher = new Teacher();
        teacher.setId(3L);
        teacher.setPassword("1234");
        iTeacherService.updateTeacher(teacher);
    }

    @Test
    public void deleteTeacher() {
        iTeacherService.deleteTeacher(3L);
    }

    @Test
    public void getTeacherList() {
        List<Teacher> teacherList = iTeacherService.getTeacherList();
        logger.info(teacherList.toString());
    }
}