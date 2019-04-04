package com.ctgu.examsystem.controller;

import com.ctgu.examsystem.convert.StudentConvert;
import com.ctgu.examsystem.domain.Student;
import com.ctgu.examsystem.rest.StudentApi;
import com.ctgu.examsystem.rest.dto.CreateStudentRequest;
import com.ctgu.examsystem.rest.dto.StudentDto;
import com.ctgu.examsystem.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/System")
public class StudentController implements StudentApi {

    @Resource
    private IStudentService iStudentService;

    public ResponseEntity<StudentDto> createStudentInfo( @RequestBody CreateStudentRequest createStudentRequest){
        Student student = iStudentService.createStudent(StudentConvert.transform(createStudentRequest));
        return ResponseEntity.ok(StudentConvert.transform(student));
    }

    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long id){
        iStudentService.deleteStudent(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<StudentDto> getStudentInfo(@PathVariable("id") Long id){
        Student student = iStudentService.getStudnetById(id);
        return ResponseEntity.ok(StudentConvert.transform(student));
    }

    public ResponseEntity<List<StudentDto>> getStudentList(){
        List<Student> students = iStudentService.getStudentList();
        List<StudentDto> studentDtos = new ArrayList<>();
        students.stream().forEach(student -> {
            studentDtos.add(StudentConvert.transform(student));
        });
        return ResponseEntity.ok(studentDtos);
    }

    public ResponseEntity<StudentDto> updateStudent(@PathVariable("id") Long id, @RequestBody CreateStudentRequest createStudentRequest){
        Student student = iStudentService.updateStudent(id,StudentConvert.transform(createStudentRequest));
        return ResponseEntity.ok(StudentConvert.transform(student));
    }
}
