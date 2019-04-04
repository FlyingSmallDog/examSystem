package com.ctgu.examsystem.controller;

import com.ctgu.examsystem.convert.ClassConvert;
import com.ctgu.examsystem.domain.CClass;
import com.ctgu.examsystem.rest.ClassApi;
import com.ctgu.examsystem.rest.dto.ClassDto;
import com.ctgu.examsystem.rest.dto.CreateClassRequest;
import com.ctgu.examsystem.service.ICClassService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/System")
public class ClassController implements ClassApi {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ICClassService iCClassService;

    //创建班级
    public ResponseEntity<ClassDto> createClassInfo(@PathVariable("teacherRef") Long teacherRef,@RequestBody CreateClassRequest createClassRequest){
        return ResponseEntity.ok(ClassConvert.transform(iCClassService.createClass(ClassConvert.transform(createClassRequest))));
    }

    //删除班级
    public ResponseEntity<Void> deleteClass(@PathVariable("teacherRef") Long teacherRef,@PathVariable("id") Long id){
        try {
            iCClassService.deleteClassById(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            logger.info("删除班级失败"+e);
        }
        return new ResponseEntity(HttpStatus.FAILED_DEPENDENCY);
    }

    //获取班级列表
    public ResponseEntity<List<ClassDto>> getClassList(@PathVariable("teacherRef") Long teacherRef){
        List<CClass> cClassList = iCClassService.getClassOfTeacher(teacherRef);
        List<ClassDto> classDtos = new ArrayList<>();
        cClassList.stream().forEach(cClass -> { classDtos.add(ClassConvert.transform(cClass));});
        return ResponseEntity.ok(classDtos);
    }

    //获取指定班级
    public ResponseEntity<ClassDto> getTeacherInfo( Long teacherRef,  @PathVariable("id") Long id){
        return ResponseEntity.ok(ClassConvert.transform(iCClassService.getClassById(id)));
    }

    //更新班级学生
    public ResponseEntity<ClassDto> updateStudentsOfClass( @PathVariable("teacherRef") Long teacherRef, @PathVariable("id") Long id,
                                                           @PathVariable("studentRef") Long studentRef,@NotNull @Valid @RequestParam(value = "operate", required = true) Integer operate){
        return ResponseEntity.ok(ClassConvert.transform(iCClassService.updateStudentOfClass(id,studentRef,operate)));
    }

    //更新班级信息
    public ResponseEntity<ClassDto> updateTeacher( @PathVariable("teacherRef") Long teacherRef,@PathVariable("id") Long id,
                                                   @ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateClassRequest createClassRequest){
        CClass cClass = ClassConvert.transform(createClassRequest);
        cClass.setId(id);
        cClass.setHeadmaster(teacherRef);
        return ResponseEntity.ok(ClassConvert.transform(iCClassService.updateClass(cClass)));

    }
}
