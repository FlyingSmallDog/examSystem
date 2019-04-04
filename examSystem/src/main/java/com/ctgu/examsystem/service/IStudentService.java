package com.ctgu.examsystem.service;

import com.ctgu.examsystem.domain.Student;

import java.util.List;

public interface IStudentService {
    public Student createStudent(Student student);

    public Student getStudnetById(Long id);

    public Student updateStudent(Long id,Student student);

    public void deleteStudent(Long id);

    public List<Student> getStudentList();

    public boolean studentLogin(String username);
}
