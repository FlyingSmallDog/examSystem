package com.ctgu.examsystem.service.Impl;

import com.ctgu.examsystem.dao.ICClassDAO;
import com.ctgu.examsystem.domain.CClass;
import com.ctgu.examsystem.service.ICClassService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class CClassService implements ICClassService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ICClassDAO iCClassDAO;

    @Override
    public List<CClass> getClassOfTeacher(Long teacherRef) {
        CClass cClass = new CClass();
        cClass.setHeadmaster(teacherRef);
        List<CClass> cCLasses = iCClassDAO.selectByExample(cClass);
        return cCLasses;
    }

    @Override
    public CClass getClassById(Long id) {
        CClass cClass = iCClassDAO.selectByPrimaryKey(id);
        return cClass;
    }

    @Override
    public void deleteClassById(Long id) {
        iCClassDAO.deleteByPrimaryKey(id);
    }

    @Override
    public CClass createClass(CClass cClass)  {
        int count = iCClassDAO.insertSelective(cClass);
        if(count == 0){
            logger.error("IEduProductService create error,{}", cClass);
        }
        return  iCClassDAO.selectByPrimaryKey(cClass.getId());
    }

    @Override
    public CClass updateClass(CClass cClass) {
        iCClassDAO.updateByPrimaryKeySelective(cClass);
        return iCClassDAO.selectByPrimaryKey(cClass.getId());
    }

    @Override
    public CClass updateStudentOfClass(Long id, Long studentRef, int operate) {
        CClass cClass = iCClassDAO.selectByPrimaryKey(id);
        String students = cClass.getStudents();
        int stuNumber = cClass.getStuNumber();
        if(operate==0){
            if(students!="")
                students = students + "," + studentRef;
            else
                students = studentRef.toString();
            stuNumber += 1;
            cClass.setStudents(students);
        }else{
            String result = "";
            List<String> results = Arrays.asList(students.split(","));
            Iterator<String> iterator = results.iterator();
            while(iterator.hasNext()){
                String temp = iterator.next();
                if(temp == studentRef.toString()){
                    continue;
                }else{
                    result += ","+studentRef.toString();
                }
            }
            stuNumber -= 1;
            cClass.setStudents(result.substring(1,-1));
        }
        cClass.setStuNumber(stuNumber);
        iCClassDAO.updateByPrimaryKey(cClass);
        return iCClassDAO.selectByPrimaryKey(cClass.getId());
    }
}
