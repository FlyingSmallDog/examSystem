package com.ctgu.examsystem.convert;

import com.ctgu.examsystem.domain.Student;
import com.ctgu.examsystem.rest.dto.CreateStudentRequest;
import com.ctgu.examsystem.rest.dto.StudentDto;

public class StudentConvert {
    public static StudentDto transform(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setRealName(student.getRealName());
        studentDto.setStudentTel(student.getInformation());
        studentDto.setStudentName(student.getUsername());
        return studentDto;
    }

    public static Student transform(CreateStudentRequest createStudentRequest){
        Student student = new Student();
        student.setInformation(createStudentRequest.getStudentTel());
        student.setUsername(createStudentRequest.getStudentName());
        student.setPassword(createStudentRequest.getStudentPassword());
        student.setRealName(createStudentRequest.getRealName());
        return student;
    }
}
