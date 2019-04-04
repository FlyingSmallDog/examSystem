package com.ctgu.examsystem.service;

import com.ctgu.examsystem.domain.Teacher;

import java.util.List;

public interface ITeacherService {

    public Teacher getTeacherById(Long id);

    public Teacher createTeacher(Teacher teacher);

    public Teacher updateTeacher(Teacher teacher);

    public void deleteTeacher(Long id);

    public List<Teacher> getTeacherList();

    public boolean teacherLogin(String username);
}
