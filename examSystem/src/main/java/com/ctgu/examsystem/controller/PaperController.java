package com.ctgu.examsystem.controller;

import com.ctgu.examsystem.convert.PaperConvert;
import com.ctgu.examsystem.domain.Paper;
import com.ctgu.examsystem.rest.PaperApi;
import com.ctgu.examsystem.rest.dto.CreatePaperRequest;
import com.ctgu.examsystem.rest.dto.PaperDto;
import com.ctgu.examsystem.service.IPaperService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/System")
public class PaperController implements PaperApi {

    @Resource
    private IPaperService iPaperService;

    public ResponseEntity<PaperDto> createPaperInfo( @PathVariable("teacherRef") Long teacherRef, @RequestParam(value = "type", required = true) Integer type,@RequestBody CreatePaperRequest createPaperRequest){
        Paper paper = iPaperService.createPaper(PaperConvert.transform(createPaperRequest),teacherRef,type);
        return ResponseEntity.ok(PaperConvert.transform(paper));
    }

    public ResponseEntity<PaperDto> deletePaper(@PathVariable("id") Long id){
        iPaperService.deletePaper(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<PaperDto> getPaperInfo(@PathVariable("id") Long id){
        Paper paper = iPaperService.getPaperById(id);
        return ResponseEntity.ok(PaperConvert.transform(paper));
    }

    public ResponseEntity<List<PaperDto>> getPaperList(@PathVariable("teacherRef") Long teacherRef){
        List<Paper> papers = iPaperService.getPaperByTeacher(teacherRef);
        List<PaperDto> paperDtos = new ArrayList<>();
        papers.stream().forEach(paper -> {
            paperDtos.add(PaperConvert.transform(paper));
        });
        return ResponseEntity.ok(paperDtos);
    }

    public ResponseEntity<List<PaperDto>> getPaperListOfType(@PathVariable("teacherRef") Long teacherRef,@PathVariable("type") Integer type){
        List<Paper> papers = iPaperService.getPaperBystate(type);
        List<PaperDto> paperDtos = new ArrayList<>();
        papers.stream().forEach(paper -> {
            paperDtos.add(PaperConvert.transform(paper));
        });
        return ResponseEntity.ok(paperDtos);
    }

    public ResponseEntity<PaperDto> updatePaper( @PathVariable("id") Long id, @RequestBody CreatePaperRequest createPaperRequest){
        Paper paper = iPaperService.updatePaper(id,PaperConvert.transform(createPaperRequest));
        return ResponseEntity.ok(PaperConvert.transform(paper));
    }
}
