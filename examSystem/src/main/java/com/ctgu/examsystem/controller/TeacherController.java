package com.ctgu.examsystem.controller;

import com.ctgu.examsystem.convert.TeacherConvert;
import com.ctgu.examsystem.domain.Teacher;
import com.ctgu.examsystem.rest.TeacherApi;
import com.ctgu.examsystem.rest.dto.CreateTeacherRequest;
import com.ctgu.examsystem.rest.dto.TeacherDto;
import com.ctgu.examsystem.service.ITeacherService;
import io.swagger.annotations.ApiParam;
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
public class TeacherController implements TeacherApi {

    @Resource
    private ITeacherService iTeacherService;

   //添加老师
    public ResponseEntity<TeacherDto> createTeacherInfo(@RequestBody CreateTeacherRequest createTeacherRequest){
        Teacher teacher = iTeacherService.createTeacher(TeacherConvert.transform(createTeacherRequest));
        return ResponseEntity.ok(TeacherConvert.transform(teacher));
    }

    //删除老师
    public ResponseEntity<Void> deleteTeacher(@ApiParam(value = "老师id",required=true) @PathVariable("id") Long id){
        iTeacherService.deleteTeacher(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    //获取详情
    public ResponseEntity<TeacherDto> getTeacherInfo(@ApiParam(value = "老师id",required=true) @PathVariable("id") Long id){
        Teacher teacher = iTeacherService.getTeacherById(id);
        return ResponseEntity.ok(TeacherConvert.transform(teacher));
    }

    //获取所有老师
    public ResponseEntity<List<TeacherDto>> getTeacherList(){
        List<Teacher>  teachers = iTeacherService.getTeacherList();
        List<TeacherDto> teacherDtos = new ArrayList<>();
        teachers.stream().forEach(teacher -> {
            teacherDtos.add(TeacherConvert.transform(teacher));
        });
        return ResponseEntity.ok(teacherDtos);
    }

    //跟新老师信息
    public ResponseEntity<TeacherDto> updateTeacher(@PathVariable("id") Long id,@RequestBody CreateTeacherRequest createTeacherRequest){
            Teacher teacher = iTeacherService.updateTeacher(TeacherConvert.transform(createTeacherRequest));
           teacher.setId(id);
            return ResponseEntity.ok(TeacherConvert.transform(teacher));
    }

}
