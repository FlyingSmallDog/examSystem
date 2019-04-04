package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.ExamsystemApplicationTests;
import com.ctgu.examsystem.domain.Student;
import com.ctgu.examsystem.service.IStudentService;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceTest extends ExamsystemApplicationTests {

    @Resource
    private IStudentService iStudentService;

    @Test
    public void createStudent() {
        Student student = new Student();
        student.setUsername("root");
        student.setPassword("123");
        student.setRealName("常晟");
        student.setInformation("12345678901");
        iStudentService.createStudent(student);
    }

    @Test
    public void getStudnetById() {
        Student student = iStudentService.getStudnetById(2L);
        logger.info(student.toString());
    }

    @Test
    public void updateStudent() {
        Student student = new Student();
        student.setPassword("12345");
        iStudentService.updateStudent(2L,student);
    }

    @Test
    public void deleteStudent() {
        iStudentService.deleteStudent(1L);
    }

    @Test
    public void getStudentList() {
        List<Student> studentList = iStudentService.getStudentList();
        logger.info(studentList.toString());
    }
}