package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.dao.ITeacherDAO;
import com.ctgu.examsystem.domain.Teacher;
import com.ctgu.examsystem.service.ITeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService implements ITeacherService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ITeacherDAO iTeacherDAO;

    public Teacher getTeacherById(Long id){
        return iTeacherDAO.selectByPrimaryKey(id);
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        int count = iTeacherDAO.insertSelective(teacher);
        if(count==0){
            logger.error("添加老师出错"+teacher);
        }
        return iTeacherDAO.selectByPrimaryKey(teacher.getId());
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        iTeacherDAO.updateByPrimaryKeySelective(teacher);
        return iTeacherDAO.selectByPrimaryKey(teacher.getId());
    }

    @Override
    public void deleteTeacher(Long id) {
        iTeacherDAO.deleteByPrimaryKey(id);
    }

    @Override
    public List<Teacher> getTeacherList() {
        return iTeacherDAO.selectAll();
    }

    @Override
    public boolean teacherLogin(String username) {
        Teacher teacher = new Teacher();
        teacher.setUsername(username);
        List<Teacher> teachers = iTeacherDAO.selectByExample(teacher);

        if(teachers.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}
