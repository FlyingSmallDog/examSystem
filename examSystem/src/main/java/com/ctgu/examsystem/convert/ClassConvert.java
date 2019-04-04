package com.ctgu.examsystem.convert;

import com.ctgu.examsystem.domain.CClass;
import com.ctgu.examsystem.rest.dto.ClassDto;
import com.ctgu.examsystem.rest.dto.CreateClassRequest;

public class ClassConvert {
    public static CClass transform(CreateClassRequest createClassRequest) {
        CClass cClass = new CClass();
        cClass.setClassname(createClassRequest.getClassName());
        return cClass;
    }

    public static CClass transform(ClassDto classDto) {
        CClass cClass = new CClass();
        cClass.setClassname(classDto.getClassName());
        cClass.setId(classDto.getId());
        cClass.setStuNumber(classDto.getStuNumber());
        return cClass;

    }

    public static ClassDto transform(CClass cClass){
        ClassDto classDto = new ClassDto();
        classDto.setId(cClass.getId());
        classDto.setClassName(cClass.getClassname());
        classDto.setStuNumber(cClass.getStuNumber());
        return classDto;
    }
}