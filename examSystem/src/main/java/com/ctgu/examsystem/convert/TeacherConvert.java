package com.ctgu.examsystem.convert;

import com.ctgu.examsystem.domain.Teacher;
import com.ctgu.examsystem.rest.dto.CreateTeacherRequest;
import com.ctgu.examsystem.rest.dto.TeacherDto;

public class TeacherConvert {
    public static Teacher transform(CreateTeacherRequest createTeacherRequest){
        Teacher teacher = new Teacher();
        teacher.setInformation(createTeacherRequest.getTeacherTel());
        teacher.setUsername(createTeacherRequest.getTeacherName());
        teacher.setRealName(createTeacherRequest.getRealName());
        teacher.setPassword(createTeacherRequest.getTeacherPassword());
        return teacher;
    }

    public static TeacherDto transform(Teacher teacher){
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(teacher.getId());
        teacherDto.setRealName(teacher.getRealName());
        teacherDto.setTeacherName(teacher.getUsername());
        teacherDto.setTeacherTel(teacher.getInformation());
        return teacherDto;
    }
}
