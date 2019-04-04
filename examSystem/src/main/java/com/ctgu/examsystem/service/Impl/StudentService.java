package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.dao.IStudentDAO;
import com.ctgu.examsystem.domain.Student;
import com.ctgu.examsystem.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService implements IStudentService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IStudentDAO iStudentDAO;

    @Override
    public Student createStudent(Student student) {

        int count = iStudentDAO.insertSelective(student);
        if(count == 0 ){
            logger.error("添加学生出错,"+student);
        }
        return iStudentDAO.selectByPrimaryKey(student.getId());
    }

    @Override
    public Student getStudnetById(Long id) {
        Student student = iStudentDAO.selectByPrimaryKey(id);
        if(student==null){
            logger.error("查询学生出错，"+student);
        }
        return student;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        int count = iStudentDAO.updateByPrimaryKeySelective(student);
        if(count==0){
            logger.error("更新学生出错，"+student);
        }
        return student;
    }

    @Override
    public void deleteStudent(Long id) {
        int count = iStudentDAO.deleteByPrimaryKey(id);
        if(count==0)
            logger.error("删除学生出错,"+id);
    }

    @Override
    public List<Student> getStudentList() {
        List<Student> students = iStudentDAO.selectAll();
        return students;
    }

    @Override
    public boolean studentLogin(String username) {
        Student student = new Student();
        student.setUsername(username);
        List<Student> students = iStudentDAO.selectByExample(student);
        if(students.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
